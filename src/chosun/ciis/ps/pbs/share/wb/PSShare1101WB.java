/***************************************************************************************************
 * ���ϸ� : PSShare1101WB.java
 * ��� : ��������-���� ó���� ���� Work Bean
 * �ۼ����� : 2004-02-23
 * �ۼ��� : ����ǥ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.share.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.dao.*;
import chosun.ciis.ps.pbs.share.ejb.*;

/**
 * ��������-���� ���� WB
 *
 */

public class PSShare1101WB {
    /**
     * ��������-����-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectTacomScheList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_TACOM_SCHEDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));

        long iPageSize = 10;  // �������� Row�� �ϴ� 10����
        long iPageNo = 1;     // ���� ������ 1�� ����
        if(pageno != null && !pageno.equals("")){ // ������ ���� ������ �缳��
           iPageNo = Long.parseLong(pageno);
           iPageSize = Long.parseLong(pagesize);
        }
        // DM Setting
        PS_L_TACOM_SCHEDM dm = new PS_L_TACOM_SCHEDM();

        dm.setCmpycd(cmpycd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSShare1101EJBHome home = (PSShare1101EJBHome) JNDIManager.getInstance().getHome("PSShare1101EJB");
        try {
            PSShare1101EJB ejb = home.create();
            ds = ejb.selectTacomScheList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * ��������-����-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectTacomScheDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_TACOM_SCHEDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        PS_S_TACOM_SCHEDM dm = new PS_S_TACOM_SCHEDM();
        dm.setSeq(Long.parseLong(seq));
        dm.setCmpycd(cmpycd);
        PSShare1101EJBHome home = (PSShare1101EJBHome) JNDIManager.getInstance().getHome("PSShare1101EJB");
        try {
            PSShare1101EJB ejb = home.create();
            ds = ejb.selectTacomScheDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��������-����-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void accessTacomSche(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_TACOM_SCHEDataSet ds = null;

        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String jobcd     = Util.getSessionParameterValue(req, "jobcd", true);          //�����ڵ�

        String seq = Util.checkString(req.getParameter("seq"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String accflag = Util.checkString(req.getParameter("accflag"));

        // DM Setting
        PS_A_TACOM_SCHEDM dm = new PS_A_TACOM_SCHEDM();

        if (!accflag.equals("I")) {
            dm.setSeq(Long.parseLong(seq));
        }
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setRemk(remk);
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setJobcd(jobcd);
        dm.setAccflag(accflag);

        PSShare1101EJBHome home = (PSShare1101EJBHome) JNDIManager.getInstance().getHome("PSShare1101EJB");
        try {
            PSShare1101EJB ejb = home.create();
            bResult = ejb.accessTacomSche(dm);
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
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