/***************************************************************************************************
 * ���ϸ�   : PSAllow1801WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 *            ���Ǿ������� ������ workbeen
 * �ۼ����� : 2004-03-12
 * �ۼ���   : ����
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

public class PSAllow1801WB {

    /**
     * ��������� �ʱ⸦ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DEPTEMP_ALON_PTCRDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String closmm = Util.checkString(req.getParameter("closmm"));                                         //�������
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //���������ڵ�
        String deptcd = Util.checkString(req.getParameter("deptcd"));                                         //�μ��ڵ�

        //DM ���� Setting�Ѵ�.
        PS_L_DEPTEMP_ALON_PTCRDM dm = new PS_L_DEPTEMP_ALON_PTCRDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setClosmm(closmm);                                                                                 //�������
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setDeptcd(deptcd);                                                                                 //�μ��ڵ�

        PSAllow1801EJBHome home = (PSAllow1801EJBHome) JNDIManager.getInstance().getHome("PSAllow1801EJB");
        try {
            PSAllow1801EJB ejb = home.create();
            ds = ejb.selectAlonClos(dm);       // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);        // request�� ������� ��´�.
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
     * ��������� ������ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void accessAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_BO_ALON_COLSDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String closmm = Util.checkString(req.getParameter("closmm"));                                         //�������
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //���������ڵ�
        String paydt = Util.checkString(req.getParameter("paydt"));                                           //��������

        //DM ���� Setting�Ѵ�.
        PS_A_BO_ALON_COLSDM dm = new PS_A_BO_ALON_COLSDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setClosmm(closmm);                                                                                 //�������
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setPaydt(paydt);                                                                                   //��������

        PSAllow1801EJBHome home = (PSAllow1801EJBHome) JNDIManager.getInstance().getHome("PSAllow1801EJB");
        try {
            PSAllow1801EJB ejb = home.create();
            ds = ejb.accessAlonClos(dm);       // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);        // request�� ������� ��´�.
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
     * ��������� ������Ҹ� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void deleteAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_D_BO_ALON_CANCDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String closmm = Util.checkString(req.getParameter("closmm"));                                         //�������
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //���������ڵ�

        //DM ���� Setting�Ѵ�.
        PS_D_BO_ALON_CANCDM dm = new PS_D_BO_ALON_CANCDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setClosmm(closmm);                                                                                 //�������
        dm.setBocd(bocd);                                                                                     //���������ڵ�

        PSAllow1801EJBHome home = (PSAllow1801EJBHome) JNDIManager.getInstance().getHome("PSAllow1801EJB");
        try {
            PSAllow1801EJB ejb = home.create();
            ds = ejb.deleteAlonClos(dm);       // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);        // request�� ������� ��´�.
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