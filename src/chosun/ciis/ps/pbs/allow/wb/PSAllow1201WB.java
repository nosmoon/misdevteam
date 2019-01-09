/***************************************************************************************************
 * ���ϸ�   : PSAllow1201WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 *            ���������ó�� �ʱ�ȭ���� �����´�
 * �ۼ����� : 2004-03-08
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.allow.ejb.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;

/**
 * ����-��������
 */
public class PSAllow1201WB {
    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_EMP_ALONDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_S_EMP_ALONDM dm = new PS_S_EMP_ALONDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSAllow1201EJBHome home = (PSAllow1201EJBHome) JNDIManager.getInstance().getHome("PSAllow1201EJB");
        try {

            PSAllow1201EJB ejb = home.create();

            ds = ejb.selectCodeList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * ��ȸȭ�鿡 ���Ǵ� ���系���� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRsltList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_ALON_RSLTDataSet ds = null;
        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);      //�Է��ھ��̵�

        String aloncd = Util.checkString(req.getParameter("aloncd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String boemp_no_from = Util.checkString(req.getParameter("boemp_no_from"));
        String boemp_no_to = Util.checkString(req.getParameter("boemp_no_to"));
        String curr_page_no = req.getParameter("curr_page_no"); // ����������
        String records_per_page = req.getParameter("records_per_page"); // �������� Row��

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_ALON_RSLTDM dm = new PS_L_ALON_RSLTDM(); // DM ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setAloncd(aloncd);
        dm.setBoemp_no_from(boemp_no_from);
        dm.setBoemp_no_to(boemp_no_to);
        dm.setDeptcd(deptcd);
        dm.setPageno(iPageNo); // ����������
        dm.setPagesize(iPageSize); //�������� Row��

        PSAllow1201EJBHome home = (PSAllow1201EJBHome) JNDIManager.getInstance().getHome("PSAllow1201EJB");
        try {

            PSAllow1201EJB ejb = home.create();

            ds = ejb.selectRsltList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * ������������� �����Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void accessAlon(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_ALONRSLTDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);      //�Է��ھ��̵�

        String bocd = Util.checkString(req.getParameter("bocd"));
        String aloncd = Util.checkString(req.getParameter("aloncd"));
        String boemp_no = Util.checkString(req.getParameter("ls_boemp_no"));
        String trgtnoit = Util.checkString(req.getParameter("ls_trgtnoit"));
        String fix_rateclsf = Util.checkString(req.getParameter("ls_fix_rateclsf"));
        String ratiocalcclsf = Util.checkString(req.getParameter("ls_ratiocalcclsf"));
        String amt = Util.checkString(req.getParameter("ls_amt"));
        String ratio = Util.checkString(req.getParameter("ls_ratio"));

        PS_A_ALONRSLTDM dm = new PS_A_ALONRSLTDM(); // DM ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setAloncd(aloncd);
        dm.setBoemp_no(boemp_no);
        dm.setTrgtnoit(trgtnoit);
        dm.setFix_rateclsf(fix_rateclsf);
        dm.setRatiocalcclsf(ratiocalcclsf);
        dm.setAmt(amt);
        dm.setRatio(ratio);

        PSAllow1201EJBHome home = (PSAllow1201EJBHome) JNDIManager.getInstance().getHome("PSAllow1201EJB");
        try {

            PSAllow1201EJB ejb = home.create();

            ds = ejb.accessAlon(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
}
