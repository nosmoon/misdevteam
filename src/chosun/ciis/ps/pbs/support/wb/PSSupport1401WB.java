/***************************************************************************************************
 * ���ϸ�   : PSSupport1401WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2005-12-16
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.support.ejb.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;

/**
 * �������-���ݿ�������û
 */
public class PSSupport1401WB {
    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DSCT_SPPTDataSet ds = null;

        // ���Ǳ��� �ƴҰ��� ALL�� ��� ��ü�ڵ带 ��ȸ�Ѵ�.
        PS_L_DSCT_SPPTDM dm = new PS_L_DSCT_SPPTDM(); // DM ���� Setting�Ѵ�.

        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

        dm.setCmpycd(cmpycd);

        PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
        try {

            PSSupport1401EJB ejb = home.create();

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
     * ���ݿ����� ��û ������ ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCashrcptList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_CASHRCPTDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);  //�Է��ھ��̵�

        String cashrcpt_dtbgn = Util.checkString(req.getParameter("cashrcpt_dtbgn"));   //��ȸ����
        String cashrcpt_dtend = Util.checkString(req.getParameter("cashrcpt_dtend"));   //��ȸ����
        String bocd = Util.checkString(req.getParameter("bocd"));                       //��������
        String medicd = Util.checkString(req.getParameter("medicd"));                   //��ü�ڵ�
        String selpubclsf = Util.checkString(req.getParameter("selpubclsf"));           //�����Ǹű���
        String rcptclsf = Util.checkString(req.getParameter("rcptclsf"));               //���ݿ����� ���౸��
        String curr_page_no = req.getParameter("curr_page_no");                         //����������
        String records_per_page = req.getParameter("records_per_page");                 //�������� Row��

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_CASHRCPTDM dm = new PS_L_CASHRCPTDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setCashrcpt_dtbgn(cashrcpt_dtbgn);
        dm.setCashrcpt_dtend(cashrcpt_dtend);
        dm.setIncmgpers(incmgpers);
        dm.setMedicd(medicd);
        dm.setSelpubclsf(selpubclsf);
        dm.setRcptclsf(rcptclsf);

        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
        try {

            PSSupport1401EJB ejb = home.create();

            ds = ejb.selectCashrcptList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * �̻�ó�� �󼼳��� ����
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */

    public void selectCashrcptDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_CASHRCPTDataSet ds = null;

        //����� ��������
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true); //���������ڵ�

        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd_m = Util.checkString(req.getParameter("medicd_m"));
        String selpubclsf = Util.checkString(req.getParameter("selpubclsf"));

        PS_S_CASHRCPTDM dm = new PS_S_CASHRCPTDM(); // DM ���� Setting�Ѵ�.
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd_m);
        dm.setSelpubclsf(selpubclsf);

        PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
        try {

            PSSupport1401EJB ejb = home.create();

            ds = ejb.selectCashrcptDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
    * ���ݿ����� ��û/��� ó���Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
    public void accessCashrcpt (HttpServletRequest req, HttpServletResponse res) throws AppException {
       CO_A_CASHRCPTDataSet ds = null;

       //����� ��������
       String bocd = Util.getSessionParameterValue(req, "cmpycd", true);        //���������ڵ�
       String incmgpers = Util.getSessionParameterValue(req, "uid", true);      //�Է��ھ��̵�
       String aplcpers = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpers")));  //��û�ڸ�
       String flag = Util.checkString(req.getParameter("flag"));                //��û/����÷���

       String prn = Util.checkString(req.getParameter("prn"));                  //�ֹι�ȣ
       String rdr_no = Util.checkString(req.getParameter("rdr_no"));            //���ڹ�ȣ
       String ptphno1 = Util.checkString(req.getParameter("ptphno1"));          //�ڵ���1
       String ptphno2 = Util.checkString(req.getParameter("ptphno2"));          //�ڵ���2
       String ptphno3 = Util.checkString(req.getParameter("ptphno3"));          //�ڵ���3
       String selpublclsf = Util.checkString(req.getParameter("selpubclsf"));   //�����Ǹű���
       String rcptclsf = Util.checkString(req.getParameter("rcptclsf"));        //���ݿ��������౸��
       String aplcpath = Util.checkString(req.getParameter("aplcpath"));        //��û���

       CO_A_CASHRCPTDM dm = new CO_A_CASHRCPTDM(); // DM ���� Setting�Ѵ�.

       dm.setAplcpers(aplcpers);
       dm.setFlag(flag);
       dm.setIncmgpers(incmgpers);
       dm.setPrn(prn);
       dm.setPtphno1(ptphno1);
       dm.setPtphno2(ptphno2);
       dm.setPtphno3(ptphno3);
       dm.setRdr_no(rdr_no);
       dm.setSelpubclsf(selpublclsf);
       dm.setRcptclsf(rcptclsf);
       dm.setAplcpath(aplcpath);

       PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
       try {

           PSSupport1401EJB ejb = home.create();

           ds = ejb.accessCashrcpt(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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