/*****************************************************
 * ���ϸ�   : PSCode1301WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-02-20
 * �ۼ���   : ���ȣ
 ********************************************************/
package chosun.ciis.ps.pbs.code.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.code.ejb.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;

/**
 * ����-���ʽ��ϰ��� WorkBean
 */
public class PSCode1301WB {

    /**
     * ���ʽ���ó�� �ʱ�ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodelist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_BNSBK_CDDataSet ds = null;

        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

        PS_S_BNSBK_CDDM dm = new PS_S_BNSBK_CDDM();

        dm.setCmpycd(cmpycd);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");
        try {
            PSCode1301EJB ejb = home.create();

            ds = ejb.selectCodelist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * ���ʽ��ϰ��� ������ ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectBnsbklist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BNSBKDataSet ds = null;

        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�
        String medicd = Util.checkString(req.getParameter("medicd"));
        String bnsbknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
        String bgnvdtydt =  Util.checkString(req.getParameter("bgnvdtydt"));
        String endvdtydt =  Util.checkString(req.getParameter("endvdtydt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String curr_page_no = req.getParameter("curr_page_no"); // ����������
        String records_per_page = req.getParameter("records_per_page"); // �������� Row��

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_BNSBKDM dm = new PS_L_BNSBKDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setBnsbknm(bnsbknm);
        dm.setBgnvdtydt(bgnvdtydt);
        dm.setEndvdtydt(endvdtydt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");
        try {
            PSCode1301EJB ejb = home.create();
            ds = ejb.selectBnsbklist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * ���ʽ��� ������ �Է��Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void insertBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�
        String medicd = Util.checkString(req.getParameter("medicd"));
        String bns_booknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
        String bgnvdtydt = Util.checkString(req.getParameter("bgnvdtydt"));
        String endvdtydt = Util.checkString(req.getParameter("endvdtydt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String vipcont = Util.Uni2Ksc(Util.checkString(req.getParameter("vipcont")));

        PS_I_BNSBKDM dm = new PS_I_BNSBKDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setBns_booknm(bns_booknm);
        dm.setBgnvdtydt(bgnvdtydt);
        dm.setEndvdtydt(endvdtydt);
        dm.setRemk(remk);
        dm.setVipcont(vipcont);
        dm.setIncmgpers(incmgpers);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");

        try {
            PSCode1301EJB ejb = home.create();
            bResult = ejb.insertBnsbk(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * ���ʽ��� ������ �����Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void updateBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�
        String medicd = Util.checkString(req.getParameter("medicd"));
        String bns_bookcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_bookcd")));
        String bns_booknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
        String bgnvdtydt = Util.checkString(req.getParameter("bgnvdtydt"));
        String endvdtydt = Util.checkString(req.getParameter("endvdtydt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String vipcont = Util.Uni2Ksc(Util.checkString(req.getParameter("vipcont")));

        PS_U_BNSBKDM dm = new PS_U_BNSBKDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setBns_bookcd(bns_bookcd);
        dm.setBns_booknm(bns_booknm);
        dm.setBgnvdtydt(bgnvdtydt);
        dm.setEndvdtydt(endvdtydt);
        dm.setRemk(remk);
        dm.setVipcont(vipcont);
        dm.setIncmgpers(incmgpers);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");

        try {
            PSCode1301EJB ejb = home.create();

            bResult = ejb.updateBnsbk(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * ���ʽ��� ������ �����Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd =   Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String bns_bookcd = Util.checkString(req.getParameter("bns_bookcd"));

        PS_D_BNSBKDM dm = new PS_D_BNSBKDM();

        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBns_bookcd(bns_bookcd);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");
        try {
            PSCode1301EJB ejb = home.create();
            bResult = ejb.deleteBnsbk(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

}
