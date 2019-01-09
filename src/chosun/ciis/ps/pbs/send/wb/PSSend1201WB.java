/*****************************************************
 * ���ϸ�   : PSSend1201WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-03-02
 * �ۼ���   : ���ȯ
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
 *  �߼�-�ϰ��߼� �߼�ó�� WorkBean
 */
public class PSSend1201WB{


    /**
     * �ϰ��߼� �߼�ó�� ����ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_LUMP_PROCDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String medicd      = Util.checkString(req.getParameter("medicd"));              //��ü�ڵ�
        String sendtype    = "01";

        PS_S_SEND_LUMP_PROCDM dm = new PS_S_SEND_LUMP_PROCDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setSendtype(sendtype);

        PSSend1201EJBHome home = (PSSend1201EJBHome) JNDIManager.getInstance().getHome("PSSend1201EJB");
        try {
            PSSend1201EJB ejb = home.create();
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
      PS_L_SEND_LUMP_PROCDataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

      String senddt = Util.checkString(req.getParameter("senddt"));
      String bocd = Util.checkString(req.getParameter("sendbrch"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String medicd = Util.checkString(req.getParameter("medicd"));
      String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
      String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));

      if(bocd == null || bocd.equals("")){
         bocd = "ALL";
      }

      PS_L_SEND_LUMP_PROCDM dm = new PS_L_SEND_LUMP_PROCDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setSenddt(senddt);
      dm.setBocd(bocd);
      dm.setMediser_no(mediser_no);
      dm.setMedicd(medicd);
      dm.setSendkindcd(sendkindcd);
      dm.setSendmthdcd(sendmthdcd);


      PSSend1201EJBHome home = (PSSend1201EJBHome)JNDIManager.getInstance().getHome(
          "PSSend1201EJB");
      try{
         PSSend1201EJB ejb = home.create();
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
   public void selectMthdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_SEND_LUMP_PROC_DTLSDataSet ds = null;

       String senddt = Util.checkString(req.getParameter("brchdt"));
       String bocd = Util.checkString(req.getParameter("cnfmbrchcd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd = Util.checkString(req.getParameter("medicd"));
       String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
       String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));
       String sPageNo = req.getParameter("curr_page_no"); // ����������

       String records_per_page = req.getParameter("records_per_page"); // �������� Row��

       int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

       int iPageNo = 1; // ���� ������ 1�� ����
       if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
           iPageNo = Integer.parseInt(sPageNo);
       }

       PS_L_SEND_LUMP_PROC_DTLSDM dm = new PS_L_SEND_LUMP_PROC_DTLSDM();
       //dm�� ���� Setting�Ѵ�.
       dm.setSenddt(senddt);
       dm.setBocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setSendkindcd(sendkindcd);
       dm.setSendmthdcd(sendmthdcd);
       dm.setPageno(iPageNo);
       dm.setPagesize(iPageSize);


       PSSend1201EJBHome home = (PSSend1201EJBHome) JNDIManager.getInstance().getHome("PSSend1201EJB");

       try {
           PSSend1201EJB ejb = home.create();
           ds = ejb.selectMthdList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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

   public void printLumpSticker(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_P_SEND_LUMP_STICKERDataSet ds = null;

       String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�
       String senddt = Util.checkString(req.getParameter("senddt"));
       String bocd   = Util.checkString(req.getParameter("sendbrch"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd     = Util.checkString(req.getParameter("medicd"));
       String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
       String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));


       PS_P_SEND_LUMP_STICKERDM dm = new PS_P_SEND_LUMP_STICKERDM();
       //dm�� ���� Setting�Ѵ�.
       dm.setCmpycd(cmpycd);
       dm.setSenddt(senddt);
       dm.setBocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setSendkindcd(sendkindcd);
       dm.setSendmthdcd(sendmthdcd);

       PSSend1201EJBHome home = (PSSend1201EJBHome) JNDIManager.getInstance().getHome("PSSend1201EJB");

       try {
           PSSend1201EJB ejb = home.create();
           ds = ejb.printLumpSticker(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
           req.setAttribute("ds", ds); // request�� ������� ��´�.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       }
   }

}