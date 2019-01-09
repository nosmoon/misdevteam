/*****************************************************
 * ���ϸ�   : PSSend2301WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-03-02
 * �ۼ���   : ����ǥ
 ********************************************************/
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

/**
 *  �߼�-�����߼� �߼�ó�� WorkBean
 */
public class PSSend2301WB{


    /**
     * �ϰ��߼� �߼�ó�� ����ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_BO_SEND_INITDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String medicd      = Util.checkString(req.getParameter("medicd"));              //��ü�ڵ�
        String deptcd      = Util.checkString(req.getParameter("deptcd"));              //��ü�ڵ�

        PS_S_BO_SEND_INITDM dm = new PS_S_BO_SEND_INITDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setDeptcd(deptcd);

        PSSend2301EJBHome home = (PSSend2301EJBHome) JNDIManager.getInstance().getHome("PSSend2301EJB");
        try {
            PSSend2301EJB ejb = home.create();
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
    * �ϰ��߼� �߼�ó�� ���纰Ȯ�γ����� ��ȸ�Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_SEND_PBLMEDISENDBODataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
      String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String sPageNo = req.getParameter("curr_page_no"); // ����������
      String records_per_page = req.getParameter("records_per_page"); // �������� Row��

      int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

      int iPageNo = 1; // ���� ������ 1�� ����
      if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
          iPageNo = Integer.parseInt(sPageNo);
      }

      PS_L_SEND_PBLMEDISENDBODM dm = new PS_L_SEND_PBLMEDISENDBODM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setMedicd(medicd);
      dm.setSenddt(senddt);
      dm.setMediser_fr(mediser_no_fr);
      dm.setMediser_to(mediser_no_to);
      dm.setDeptcd(deptcd);
      dm.setAreacd(areacd);
      dm.setBocd(bocd);

      dm.setPageno(iPageNo);
      dm.setPagesize(iPageSize);


      PSSend2301EJBHome home = (PSSend2301EJBHome)JNDIManager.getInstance().getHome("PSSend2301EJB");
      try{
         PSSend2301EJB ejb = home.create();
         ds = ejb.selectList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         req.setAttribute("ds", ds); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

   /**
    * �ϰ��߼� �߼�ó�� �߼۹���� �󼼳����� ��ȸ�Ѵ�
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void selectBoList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_BOSEND_LUMPDataSet ds = null;

       String bocd = Util.checkString(req.getParameter("bocd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd = Util.checkString(req.getParameter("medicd"));

       String sPageNo = req.getParameter("curr_page_no"); // ����������

       String records_per_page = req.getParameter("records_per_page"); // �������� Row��

       int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

       int iPageNo = 1; // ���� ������ 1�� ����
       if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
           iPageNo = Integer.parseInt(sPageNo);
       }

       PS_L_BOSEND_LUMPDM dm = new PS_L_BOSEND_LUMPDM();
       //dm�� ���� Setting�Ѵ�.

       dm.setAcq_bocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setPageno(iPageNo);
       dm.setPagesize(iPageSize);


       PSSend2301EJBHome home = (PSSend2301EJBHome) JNDIManager.getInstance().getHome("PSSend2301EJB");

       try {
           PSSend2301EJB ejb = home.create();
           ds = ejb.selectBoList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
    * �ϰ��߼� �߼�ó�� ������ ���
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void printSticker(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_P_SEND_PBLMEDISENDBODataSet ds = null;

       //����� ��������
       String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

       String medicd = Util.checkString(req.getParameter("medicd"));
       String senddt = Util.checkString(req.getParameter("senddt"));
       String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
       String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
       String deptcd = Util.checkString(req.getParameter("deptcd"));
       String areacd = Util.checkString(req.getParameter("areacd"));

       String bocd = Util.checkString(req.getParameter("corrbocd"));
       String sPageNo = req.getParameter("curr_page_no"); // ����������
       String records_per_page = req.getParameter("records_per_page"); // �������� Row��

       int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

       int iPageNo = 1; // ���� ������ 1�� ����
       if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
           iPageNo = Integer.parseInt(sPageNo);
       }

       PS_P_SEND_PBLMEDISENDBODM dm = new PS_P_SEND_PBLMEDISENDBODM();
       //dm�� ���� Setting�Ѵ�.
       dm.setCmpycd(cmpycd);
       dm.setMedicd(medicd);
       dm.setSenddt(senddt);
       dm.setMediser_fr(mediser_no_fr);
       dm.setMediser_to(mediser_no_to);
       dm.setDeptcd(deptcd);
       dm.setAreacd(areacd);
       dm.setBocd(bocd);

       PSSend2301EJBHome home = (PSSend2301EJBHome) JNDIManager.getInstance().getHome("PSSend2301EJB");

       try {
           PSSend2301EJB ejb = home.create();
           ds = ejb.printSticker(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
    * �ϰ��߼� �߼�ó�� ������Ȯ�γ����� ��ȸ�Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectSendBoList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_BO_SEND_LISTDataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
      String sPageNo = req.getParameter("curr_page_no"); // ����������
      String records_per_page = req.getParameter("records_per_page"); // �������� Row��

      int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

      int iPageNo = 1; // ���� ������ 1�� ����
      if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
          iPageNo = Integer.parseInt(sPageNo);
      }

      PS_L_BO_SEND_LISTDM dm = new PS_L_BO_SEND_LISTDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setMedicd(medicd);
      dm.setSenddt(senddt);
      dm.setMediser_no(mediser_no);
      dm.setDeptcd(deptcd);
      dm.setAreacd(areacd);
      dm.setBocd(bocd);
      dm.setRdr_no(rdr_no);
      dm.setPageno(iPageNo);
      dm.setPagesize(iPageSize);


      PSSend2301EJBHome home = (PSSend2301EJBHome)JNDIManager.getInstance().getHome("PSSend2301EJB");
      try{
         PSSend2301EJB ejb = home.create();
         ds = ejb.selectSendBoList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         req.setAttribute("ds", ds); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

   /**
    * �ϰ��߼� �߼۵��ڸ� ��ȸ�Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectSendBoPrint(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_P_BO_SEND_LISTDataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));

      PS_P_BO_SEND_LISTDM dm = new PS_P_BO_SEND_LISTDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setMedicd(medicd);
      dm.setSenddt(senddt);
      dm.setMediser_no(mediser_no);
      dm.setDeptcd(deptcd);
      dm.setAreacd(areacd);
      dm.setBocd(bocd);
      dm.setRdr_no(rdr_no);

      PSSend2301EJBHome home = (PSSend2301EJBHome)JNDIManager.getInstance().getHome("PSSend2301EJB");
      try{
         PSSend2301EJB ejb = home.create();
         ds = ejb.selectSendBoPrint(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         req.setAttribute("ds", ds); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

}
