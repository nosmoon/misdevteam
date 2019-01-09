/*****************************************************
 * ���ϸ�   : PSCode1401WB.java
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
 * ����-���������ڵ���� WorkBean
 */
public class PSCode1401WB {

    /**
     * ���������ڵ���� �ʱ�ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_CMPYBO_INTGDataSet ds = null;
        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_S_CMPYBO_INTGDM dm = new PS_S_CMPYBO_INTGDM();

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSCode1401EJBHome home = (PSCode1401EJBHome) JNDIManager.getInstance().getHome("PSCode1401EJB");
        try {
            PSCode1401EJB ejb = home.create();

            ds = ejb.selectCombolist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * ���������ڵ���� ������ ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectCmpybolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_CMPYBO_INTGDataSet ds = null;

        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

        String bocd = Util.checkString(req.getParameter("slt_bocd")); // ���õ� ���������ڵ�

        PS_L_CMPYBO_INTGDM dm = new PS_L_CMPYBO_INTGDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);

        PSCode1401EJBHome home = (PSCode1401EJBHome) JNDIManager.getInstance().getHome("PSCode1401EJB");
        try {
            PSCode1401EJB ejb = home.create();
            ds = ejb.selectCmpybolist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���������ڵ���� ������ �����Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void insertCmpybo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String bocd = Util.checkString(req.getParameter("asinbocd"));
        String sendintgyn = Util.checkString(req.getParameter("sendintgyn"));
        String clamtintgyn = Util.checkString(req.getParameter("clamtintgyn"));
        String alonintgyn = Util.checkString(req.getParameter("alonintgyn"));
        String intgaftboalonpaypoint = Util.checkString(req.getParameter("intgaftboalonpaypoint"));
        String intgafthdqtalonpaypoint = Util.checkString(req.getParameter("intgafthdqtalonpaypoint"));

        PS_I_CMPYBO_INTGDM dm = new PS_I_CMPYBO_INTGDM();
        //dm�� ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setSendintgyn(sendintgyn);
        dm.setClamtintgyn(clamtintgyn);
        dm.setAlonintgyn(alonintgyn);
        dm.setIntgaftboalonpaypoint(intgaftboalonpaypoint);
        dm.setIntgafthdqtalonpaypoint(intgafthdqtalonpaypoint);

        PSCode1401EJBHome home = (PSCode1401EJBHome) JNDIManager.getInstance().getHome("PSCode1401EJB");

        try {
            PSCode1401EJB ejb = home.create();
            bResult = ejb.insertCmpybo(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
