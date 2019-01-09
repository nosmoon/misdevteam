/***************************************************************************************************
 * ���ϸ�   : PSAllow2001WB.java
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
 * ����-�����ޱ�
 */
public class PSAllow2001WB {
    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_EMP_ALON_BASEDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_S_EMP_ALON_BASEDM dm = new PS_S_EMP_ALON_BASEDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSAllow1401EJBHome home = (PSAllow1401EJBHome) JNDIManager.getInstance().getHome("PSAllow1401EJB");
        try {

            PSAllow1401EJB ejb = home.create();

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
        PS_L_ALON_PRSLTDataSet ds = null;
        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);      //�Է��ھ��̵�

        String aloncd = Util.checkString(req.getParameter("aloncd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String yymm = Util.checkString(req.getParameter("chk_yymm"));
        String boemp_no_from = Util.checkString(req.getParameter("boemp_no_from"));
        String boemp_no_to = Util.checkString(req.getParameter("boemp_no_to"));
        String curr_page_no = req.getParameter("curr_page_no"); // ����������
        String records_per_page = req.getParameter("records_per_page"); // �������� Row��

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_ALON_PRSLTDM dm = new PS_L_ALON_PRSLTDM(); // DM ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setAloncd(aloncd);
        dm.setDeptcd(deptcd);
        dm.setYymm(yymm);
        dm.setBoemp_no_from(boemp_no_from);
        dm.setBoemp_no_to(boemp_no_to);
        dm.setPageno(iPageNo); // ����������
        dm.setPagesize(iPageSize); //�������� Row��

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();

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
     * ��������ޱ��� �����Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void accessAlon(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_ALONPRSNTDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);      //�Է��ھ��̵�

        String bocd = Util.checkString(req.getParameter("bocd"));
        String aloncd = Util.checkString(req.getParameter("aloncd"));
        String boemp_no = Util.checkString(req.getParameter("ls_boemp_no"));
        String yymm = Util.checkString(req.getParameter("ls_yymm"));
        String realprsntdds = Util.checkString(req.getParameter("ls_realprsntdds"));
        String ddprsntalon = Util.checkString(req.getParameter("ls_ddprsntalon"));
        String amt = Util.checkString(req.getParameter("ls_amt"));

        PS_A_ALONPRSNTDM dm = new PS_A_ALONPRSNTDM(); // DM ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setAloncd(aloncd);
        dm.setBoemp_no(boemp_no);
        dm.setYymm(yymm);
        dm.setRealprsntdds(realprsntdds);
        dm.setDdprsntalon(ddprsntalon);
        dm.setAmt(amt);

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();

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

    /**
     * ���Ư�������� ����ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void select_Payadv_Detail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_PAYADVDataSet ds = null;
        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          //���������ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));

        String supp_yymm = Util.checkString(req.getParameter("supp_yymm"));
        String boemp_no = Util.checkString(req.getParameter("emp_code"));

        PS_S_PAYADVDM dm = new PS_S_PAYADVDM(); // DM ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd); // �������� �ڵ屸��
        dm.setSupp_yymm(supp_yymm);
        dm.setBoemp_no(boemp_no);

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();
            ds = ejb.select_Payadv_Detail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���Ư�������� ������/�����Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void accessPayadv(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_PAYADVDataSet ds = null;
        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          //���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        // ���Ǳ��� �ƴҰ��� ALL�� ��� ��ü�ڵ带 ��ȸ�Ѵ�.
        String bocd = Util.checkString(req.getParameter("bocd"));
        String supp_yymm = Util.checkString(req.getParameter("supp_yymm"));
        String boemp_no = Util.checkString(req.getParameter("emp_code"));

        int tel_charge = Integer.parseInt(Util.convertNull(req.getParameter("tel_charge"), "0")); // ��ȭ��
        int resp_subs = Integer.parseInt(Util.convertNull(req.getParameter("resp_subs"), "0")); // å�Ӱ���
        int subs_susp = Integer.parseInt(Util.convertNull(req.getParameter("subs_susp"), "0")); // ��������
        int pay_adv = Integer.parseInt(Util.convertNull(req.getParameter("pay_adv"), "0")); // ����
        int mutu_aid = Integer.parseInt(Util.convertNull(req.getParameter("mutu_aid"), "0")); // ����ȸ��
        int loan = Integer.parseInt(Util.convertNull(req.getParameter("loan"), "0")); // �뿩��
        int loan_interest = Integer.parseInt(Util.convertNull(req.getParameter("loan_interest"), "0")); // �뿩������
        int subs_sum = Integer.parseInt(Util.convertNull(req.getParameter("subs_sum"), "0")); // �������հ�
        int etc1 = Integer.parseInt(Util.convertNull(req.getParameter("etc1"), "0")); // ETC1
        int etc2 = Integer.parseInt(Util.convertNull(req.getParameter("etc2"), "0")); // ETC2
        int etc3 = Integer.parseInt(Util.convertNull(req.getParameter("etc3"), "0")); // ETC3
        int etc4 = Integer.parseInt(Util.convertNull(req.getParameter("etc4"), "0")); // ETC4
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk"))); // �޸�

        PS_A_PAYADVDM dm = new PS_A_PAYADVDM(); // DM ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd); // �������� �ڵ屸��
        dm.setSupp_yymm(supp_yymm);
        dm.setBoemp_no(boemp_no);
        dm.setTel_charge(tel_charge);
        dm.setResp_subs(resp_subs);
        dm.setSubs_susp(subs_susp);
        dm.setPay_adv(pay_adv);
        dm.setMutu_aid(mutu_aid);
        dm.setLoan(loan);
        dm.setLoan_interest(loan_interest);
        dm.setSubs_sum(subs_sum);
        dm.setIncmgpers(incmgpers);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        dm.setEtc4(etc4);
        dm.setRemk(remk);

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();
            ds = ejb.accessPayadv(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
