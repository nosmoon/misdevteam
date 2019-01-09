/*****************************************************
 * ���ϸ�   : PSCode1201WB.java
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
 * ����-��ü�ܰ�ó�� WorkBean
 */
public class PSCode1201WB {

    /**
     * ��ü�ܰ�ó�� �ʱ�ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_MEDI_UPRCDataSet ds = null;

        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

        PS_S_MEDI_UPRCDM dm = new PS_S_MEDI_UPRCDM();

        dm.setCmpycd(cmpycd);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");
        try {
            PSCode1201EJB ejb = home.create();

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
     * ��ü�ܰ����� ������ ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_MIDI_UPRCDataSet ds = null;

        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

        String bocd = Util.checkString(req.getParameter("bocd")); // ���õ� ���������ڵ�
        String medicd = Util.checkString(req.getParameter("medicd"));
        String aplydtbgn = Util.checkString(req.getParameter("aplydtbgn"));
        String aplydtend = Util.checkString(req.getParameter("aplydtend"));

        String curr_page_no = req.getParameter("curr_page_no"); // ����������
        String records_per_page = req.getParameter("records_per_page"); // �������� Row��

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_MIDI_UPRCDM dm = new PS_L_MIDI_UPRCDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAplydtbgn(aplydtbgn);
        dm.setAplydtend(aplydtend);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");
        try {
            PSCode1201EJB ejb = home.create();
            ds = ejb.selectList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��ü�ܰ� ������ �Է��Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void insertMedipri(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String bocd = Util.checkString(req.getParameter("bocd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String acpnclsf = Util.checkString(req.getParameter("acpnclsf"));
        String acpntype = Util.checkString(req.getParameter("acpntype"));
        String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
        String cntryys = Util.checkString(req.getParameter("cntryys"));
        String aplydt = Util.checkString(req.getParameter("aplydt"));
        int sell_amt = Integer.parseInt(Util.checkString(req.getParameter("sell_amt")));
        int busnalon = Integer.parseInt(Util.checkString(req.getParameter("busnalon")));
        int uprc = Integer.parseInt(Util.checkString(req.getParameter("uprc")));
        int extn_cnt = Integer.parseInt(Util.checkString(req.getParameter("extn_cnt")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        PS_I_MIDI_UPRCDM dm = new PS_I_MIDI_UPRCDM();
        //dm�� ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAcpnclsf(acpnclsf);
        dm.setAcpntype(acpntype);
        dm.setNatnareaclsf(natnareaclsf);
        dm.setCntryys(cntryys);
        dm.setAplydt(aplydt);
        dm.setSell_amt(sell_amt);
        dm.setBusnalon(busnalon);
        dm.setUprc(uprc);
        dm.setExtn_cnt(extn_cnt);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");

        try {
            PSCode1201EJB ejb = home.create();
            bResult = ejb.insertMedipri(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��ü�ܰ� ������ �����Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void updateMedipri(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String bocd = Util.checkString(req.getParameter("bocd_u"));
        String medicd = Util.checkString(req.getParameter("medicd_u"));
        String acpnclsf = Util.checkString(req.getParameter("acpnclsf_u"));
        String acpntype = Util.checkString(req.getParameter("acpntype_u"));
        String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
        String cntryys = Util.checkString(req.getParameter("cntryys"));
        String aplydt = Util.checkString(req.getParameter("aplydt"));
        int sell_amt = Integer.parseInt(Util.checkString(req.getParameter("sell_amt")));
        int busnalon = Integer.parseInt(Util.checkString(req.getParameter("busnalon")));
        int uprc = Integer.parseInt(Util.checkString(req.getParameter("uprc")));
        int extn_cnt =  Integer.parseInt(Util.checkString(req.getParameter("extn_cnt")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));


        PS_U_MIDI_UPRCDM dm = new PS_U_MIDI_UPRCDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAcpnclsf(acpnclsf);
        dm.setAcpntype(acpntype);
        dm.setNatnareaclsf(natnareaclsf);
        dm.setCntryys(cntryys);
        dm.setAplydt(aplydt);
        dm.setSell_amt(sell_amt);
        dm.setBusnalon(busnalon);
        dm.setUprc(uprc);
        dm.setExtn_cnt(extn_cnt);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");

        try {
            PSCode1201EJB ejb = home.create();

            bResult = ejb.updateMedipri(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��ü�ܰ� ������ �����Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * */
    public void deleteMedipri(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd =   Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String bocd = Util.checkString(req.getParameter("bocd_u"));
        String medicd = Util.checkString(req.getParameter("medicd_u"));
        String acpnclsf = Util.checkString(req.getParameter("acpnclsf_u"));
        String acpntype = Util.checkString(req.getParameter("acpntype_u"));
        String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
        String cntryys = Util.checkString(req.getParameter("cntryys"));
        String aplydt = Util.checkString(req.getParameter("aplydt"));
        int extn_cnt =  Integer.parseInt(Util.checkString(req.getParameter("extn_cnt")));

        PS_D_MIDI_UPRCDM dm = new PS_D_MIDI_UPRCDM();

        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAcpnclsf(acpnclsf);
        dm.setAcpntype(acpntype);
        dm.setNatnareaclsf(natnareaclsf);
        dm.setCntryys(cntryys);
        dm.setAplydt(aplydt);
        dm.setExtn_cnt(extn_cnt);
        dm.setIncmgpers(incmgpers);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");
        try {
            PSCode1201EJB ejb = home.create();
            bResult = ejb.deleteMedipri(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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