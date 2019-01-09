/*****************************************************
 * ���ϸ�   : PSSend1301WB.java
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
 *  �߼�-���Ϲ߼� Ȯ��ó������ WorkBean
 */
public class PSSend1301WB{


    /**
     * ���Ϲ߼� Ȯ�ΰ���ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_LUMP_CNFMDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�
        String medicd      = Util.checkString(req.getParameter("medicd"));          // ��ü�ڵ�
        String sendtype    = "02";

        PS_S_SEND_LUMP_CNFMDM dm = new PS_S_SEND_LUMP_CNFMDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setSendtype(sendtype);

        PSSend1301EJBHome home = (PSSend1301EJBHome) JNDIManager.getInstance().getHome("PSSend1301EJB");
        try {
            PSSend1301EJB ejb = home.create();
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
    * ���Ϲ߼� Ȯ�ΰ��� ���纰Ȯ�γ����� ��ȸ�Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      PS_L_SEND_DD_CNFMDataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

      String senddt = Util.checkString(req.getParameter("senddt"));
      String bocd = Util.checkString(req.getParameter("resitypecd"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String medicd = Util.checkString(req.getParameter("medicd"));

      if(bocd == null || bocd.equals("")){
         bocd = "ALL";
      }

      PS_L_SEND_DD_CNFMDM dm = new PS_L_SEND_DD_CNFMDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setSenddt(senddt);
      dm.setBocd(bocd);
      dm.setMediser_no(mediser_no);
      dm.setMedicd(medicd);

      PSSend1301EJBHome home = (PSSend1301EJBHome)JNDIManager.getInstance().getHome("PSSend1301EJB");
      try{
         PSSend1301EJB ejb = home.create();
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
    * ���Ϲ߼�Ȯ�� �߼۹���� �󼼳����� ��ȸ�Ѵ�
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void selectMthdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_SEND_DD_MTHD_DTLSDataSet ds = null;

       String bocd = Util.checkString(req.getParameter("cnfmbrchcd"));
       String medicd = Util.checkString(req.getParameter("medicd"));
       String senddt = Util.checkString(req.getParameter("brchdt"));

       PS_L_SEND_DD_MTHD_DTLSDM dm = new PS_L_SEND_DD_MTHD_DTLSDM();
       //dm�� ���� Setting�Ѵ�.
       dm.setBocd(bocd);
       dm.setMedicd(medicd);
       dm.setSenddt(senddt);

       PSSend1301EJBHome home = (PSSend1301EJBHome) JNDIManager.getInstance().getHome("PSSend1301EJB");

       try {
           PSSend1301EJB ejb = home.create();
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
    * ���Ϲ߼�Ȯ�� ó���Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void updateSendcnfm(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request�� ��ȯ�� String Type �����

      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
      String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

      String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
      String senddt_cnfm = Util.checkString(req.getParameter("senddt_cnfm"));
      String medicd_cnfm = Util.checkString(req.getParameter("medicd_cnfm"));
      String chkcnfm_cnfm = Util.checkString(req.getParameter("chkcnfm_cnfm"));
      String sendroutedd = Util.checkString(req.getParameter("sendroutedd"));

      PS_U_SEND_DD_CNFMDM dm = new PS_U_SEND_DD_CNFMDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setBocd_cnfm(bocd_cnfm);
      dm.setSenddt_cnfm(senddt_cnfm);
      dm.setMedicd_cnfm(medicd_cnfm);
      dm.setChkcnfm_cnfm(chkcnfm_cnfm);
      dm.setSendroutedd(sendroutedd);
      dm.setIncmgpers(incmgpers);

      PSSend1301EJBHome home = (PSSend1301EJBHome)JNDIManager.getInstance().getHome("PSSend1301EJB");

      try{
         PSSend1301EJB ejb = home.create();

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
