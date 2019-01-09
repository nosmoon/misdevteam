/***************************************************************************************************
 * ���ϸ�   : PSSend1701WB.java
 * ��  ��   : �߼�-���ʽ��Ϲ߼� �ڵ�� �ʱ�ȭ��
 * �ۼ����� : 2004-02-29
 * �ۼ���   : ���ȣ
 ****************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 ****************************************************************************************************/

package chosun.ciis.ps.pbs.send.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.send.ejb.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;

public class PSSend1701WB {

    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_BNSBKDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String flag   = "B";

        PS_S_SEND_BNSBKDM dm = new PS_S_SEND_BNSBKDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setFlag(flag);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");
        try {

            PSSend1701EJB ejb = home.create();
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
     * ���ʽ��Ϲ߼� �ϰ�Ȯ�� ����Ÿ�� ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectBnsbkList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_BNSBKDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String senddt = Util.checkString(req.getParameter("slt_senddt"));
        String asinbocd = Util.checkString(req.getParameter("slt_asinbocd"));
        String bnsbk_cd = Util.checkString(req.getParameter("slt_bnsbk_cd"));

        PS_L_SEND_BNSBKDM dm = new PS_L_SEND_BNSBKDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setSenddt(senddt);
        dm.setAsinbocd(asinbocd);
        dm.setBnsbk_cd(bnsbk_cd);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");
        try {

            PSSend1701EJB ejb = home.create();

            ds = ejb.selectBnsbkList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * ���ʽ��Ϲ߼� �ϰ�Ȯ�� �󼼳��� ����Ÿ�� ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectBnsbkDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_BNSBK_DTLDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String senddt = Util.checkString(req.getParameter("detail_senddt"));
        String asinbocd = Util.checkString(req.getParameter("asinbocd"));

        PS_L_SEND_BNSBK_DTLDM dm = new PS_L_SEND_BNSBK_DTLDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setSenddt(senddt);
        dm.setAsinbocd(asinbocd);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");
        try {

            PSSend1701EJB ejb = home.create();

            ds = ejb.selectBnsbkDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * ���ʽ��� ���峻���� �����Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void updateBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String bocd_cnfm = Util.checkString(req.getParameter("all_bocd"));
        String senddt_cnfm = Util.checkString(req.getParameter("all_senddt"));
        String chkcnfm_cnfm = Util.checkString(req.getParameter("all_chkcnfm"));
        String hdqtsend_dt_cnfm = Util.checkString(req.getParameter("all_hdqtsend_dt"));

        PS_U_SEND_BNSBKDM dm = new PS_U_SEND_BNSBKDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBocd_cnfm(bocd_cnfm);
        dm.setSenddt_cnfm(senddt_cnfm);
        dm.setChkcnfm_cnfm(chkcnfm_cnfm);
        dm.setHdqtsend_dt_cnfm(hdqtsend_dt_cnfm);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");

        try {
            PSSend1701EJB ejb = home.create();

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

}
/***************************************************************************************************
 * ������     :
 * �������ڵ� :
***************************************************************************************************/