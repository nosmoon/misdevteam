/*****************************************************
 * ���ϸ�   : PSSend1101WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-02-26
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
 *  �߼�-�ϰ��߼� Ȯ��ó������ WorkBean
 */
public class PSSend1101WB{


    /**
     * �ϰ��߼� Ȯ�ΰ���ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_LUMP_CNFMDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);     // ȸ���ڵ�
        String medicd      = Util.checkString(req.getParameter("medicd"));          // ��ü�ڵ�
        String sendtype    = "01";
        PS_S_SEND_LUMP_CNFMDM dm = new PS_S_SEND_LUMP_CNFMDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setSendtype(sendtype);

        PSSend1101EJBHome home = (PSSend1101EJBHome) JNDIManager.getInstance().getHome("PSSend1101EJB");
        try {
            PSSend1101EJB ejb = home.create();
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
    * �ϰ��߼� Ȯ�ΰ��� ���纰Ȯ�γ����� ��ȸ�Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_SEND_LUMP_CNFMDataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

      String bocd = Util.checkString(req.getParameter("resitypecd"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String medicd = Util.checkString(req.getParameter("medicd"));

      if(bocd == null || bocd.equals("")){
         bocd = "ALL";
      }

      PS_L_SEND_LUMP_CNFMDM dm = new PS_L_SEND_LUMP_CNFMDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setBocd(bocd);
      dm.setMediser_no(mediser_no);
      dm.setMedicd(medicd);
      dm.setCmpycd(cmpycd);

      PSSend1101EJBHome home = (PSSend1101EJBHome)JNDIManager.getInstance().getHome("PSSend1101EJB");
      try{
         PSSend1101EJB ejb = home.create();
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
    * �ϰ��߼�Ȯ�� �߼۹���� �󼼳����� ��ȸ�Ѵ�
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void selectMthdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_SEND_MTHD_DTLSDataSet ds = null;

       String bocd = Util.checkString(req.getParameter("cnfmbrchcd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd = Util.checkString(req.getParameter("medicd"));
       String senddt = Util.checkString(req.getParameter("brchdt"));

       PS_L_SEND_MTHD_DTLSDM dm = new PS_L_SEND_MTHD_DTLSDM();
       //dm�� ���� Setting�Ѵ�.
       dm.setBocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setSenddt(senddt);

       PSSend1101EJBHome home = (PSSend1101EJBHome) JNDIManager.getInstance().getHome("PSSend1101EJB");

       try {
           PSSend1101EJB ejb = home.create();
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
    * �ϰ��߼�Ȯ�� ó���Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void updateSendcnfm(HttpServletRequest req, HttpServletResponse res) throws AppException{
      boolean bResult = false;
      String sResult = "false"; // request�� ��ȯ�� String Type �����

      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
      String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

      String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
      String senddt_cnfm = Util.checkString(req.getParameter("senddt_cnfm"));
      String medicd_cnfm = Util.checkString(req.getParameter("medicd_cnfm"));
      String mediser_no_cnfm = Util.checkString(req.getParameter("mediser_no_cnfm"));
      String chkcnfm_cnfm = Util.checkString(req.getParameter("chkcnfm_cnfm"));
      String sendroutedd = Util.checkString(req.getParameter("sendroutedd"));

      PS_U_SEND_LUMP_CNFMDM dm = new PS_U_SEND_LUMP_CNFMDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setBocd_cnfm(bocd_cnfm);
      dm.setSenddt_cnfm(senddt_cnfm);
      dm.setMedicd_cnfm(medicd_cnfm);
      dm.setMediser_no_cnfm(mediser_no_cnfm);
      dm.setChkcnfm_cnfm(chkcnfm_cnfm);
      dm.setSendroutedd(sendroutedd);
      dm.setIncmgpers(incmgpers);

      PSSend1101EJBHome home = (PSSend1101EJBHome)JNDIManager.getInstance().getHome("PSSend1101EJB");

      try{
         PSSend1101EJB ejb = home.create();

         bResult = ejb.updateSendcnfm(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }
}
