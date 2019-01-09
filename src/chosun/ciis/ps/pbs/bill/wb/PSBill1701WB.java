/***************************************************************************************************
 * �Լ���   : PSBill1701WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 *             �ڵ���ü��û����
 * �ۼ����� : 2006-04-14
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.bill.ejb.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.dao.*;

/**
 * �ڵ���ü��û���� �޴��� ���õ� �޼ҵ带 ������ �ִ� Worker Bean Ŭ����
 */
public class PSBill1701WB {
    /**
     * �ڵ���ü��û �����ȸȭ�� �ʱ�ȭ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_AUTO_SHIFT_APLC_INITDataSet ds = null;
        PS_L_AUTO_SHIFT_APLC_INITDM dm = new PS_L_AUTO_SHIFT_APLC_INITDM();

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // dm ���� ����
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSBill1701EJBHome home = (PSBill1701EJBHome) JNDIManager.getInstance().getHome("PSBill1701EJB");
        try {
            PSBill1701EJB ejb = home.create();
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
     * �ڵ���ü��û �����ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_AUTO_SHIFT_APLCDataSet ds = null;
        PS_L_AUTO_SHIFT_APLCDM dm = new PS_L_AUTO_SHIFT_APLCDM();

        // dm ���� ����
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpycd(cmpycd);
        dm.setPageno(Long.parseLong(Util.checkString(req.getParameter("curr_page_no"))));
        dm.setPagesize(Long.parseLong(Util.checkString(req.getParameter("records_per_page"))));
        dm.setAplcdt(Util.checkString(req.getParameter("aplcdt")));
        dm.setAplcclsf(Util.checkString(req.getParameter("aplcclsf")));
        dm.setAplcprocstat(Util.checkString(req.getParameter("aplcprocstat")));
        dm.setShftclsf(Util.checkString(req.getParameter("shftclsf")));
        dm.setSechcond(Util.checkString(req.getParameter("sechcond")));
        dm.setSechcont(Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")))); // �ּҸ� like �˻�
        dm.setSortcond(Util.checkString(req.getParameter("sortcond")));
        dm.setSortorder(Util.checkString(req.getParameter("sortorder")));
        // dm ���� ��

        PSBill1701EJBHome home = (PSBill1701EJBHome) JNDIManager.getInstance().getHome("PSBill1701EJB");
        try {
            PSBill1701EJB ejb = home.create();
            ds = ejb.selectAplcList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * �ڵ���ü��û Ȯ��/���
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_U_APLCSTATDataSet ds = null;
        PS_U_APLCSTATDM dm = new PS_U_APLCSTATDM();

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // dm ���� ����
        dm.setIncmgpers(incmgpers);
        dm.setAplcyn(Util.checkString(req.getParameter("aplcyn")));
        dm.setAplcno(Util.checkString(req.getParameter("aplcno")));
        dm.setShftclsf(Util.checkString(req.getParameter("shftclsf")));
        dm.setAplcdt(Util.checkString(req.getParameter("aplcdt")));
        // dm ���� ��

        PSBill1701EJBHome home = (PSBill1701EJBHome) JNDIManager.getInstance().getHome("PSBill1701EJB");
        try {
            PSBill1701EJB ejb = home.create();
            ds = ejb.updateAplc(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * �ڵ���ü��û �󼼺���
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_APLCDataSet ds = null;
        PS_S_APLCDM dm = new PS_S_APLCDM();

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcno = Util.checkString(req.getParameter("aplcno"));
        // dm ���� ����
        dm.setBocd(cmpycd);
        dm.setShftclsf(shftclsf);
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);
        // dm ���� ��

        PSBill1701EJBHome home = (PSBill1701EJBHome) JNDIManager.getInstance().getHome("PSBill1701EJB");
        try {
            PSBill1701EJB ejb = home.create();
            ds = ejb.selectAplcDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���ں� ��ü����Ʈ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     ** /
    public void selectMediList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_MEDIDataSet ds = null;
        PS_L_MEDIDM dm = new PS_L_MEDIDM();

        String bocd = Util.getSessionParameterValue(req, "bocd", true);
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        // dm ���� ����
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm ���� ��

        PSBill1701EJBHome home = (PSBill1701EJBHome) JNDIManager.getInstance().getHome("PSBill1701EJB");
        try {
            PSBill1701EJB ejb = home.create();
            ds = ejb.selectMediList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * �ڵ���ü��û ������ ������Ʈ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateAplcInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_U_APLCINFODataSet ds = null;
        PS_U_APLCINFODM dm = new PS_U_APLCINFODM();

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        String bocd = Util.checkString(req.getParameter("bocd"));
        String aplcno = Util.checkString(req.getParameter("aplcno"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String pymtstrtdt = Util.checkString(req.getParameter("pymtstrtdt"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));
		String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // dm ���� ����
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAplcno(aplcno);
        dm.setShftclsf(shftclsf);
        dm.setAplcdt(aplcdt);
        dm.setPymtstrtdt(pymtstrtdt);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setClosyn(closyn);
        dm.setRemk(remk);
        // dm ���� ��

        PSBill1701EJBHome home = (PSBill1701EJBHome) JNDIManager.getInstance().getHome("PSBill1701EJB");
        try {
            PSBill1701EJB ejb = home.create();
            ds = ejb.updateAplcInfo(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
