/*****************************************************
 * 파일명   : PSSend1301WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-03-02
 * 작성자   : 장수환
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
 *  발송-일일발송 확인처리관리 WorkBean
 */
public class PSSend1301WB{


    /**
     * 일일발송 확인관리화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_LUMP_CNFMDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드
        String medicd      = Util.checkString(req.getParameter("medicd"));          // 매체코드
        String sendtype    = "02";

        PS_S_SEND_LUMP_CNFMDM dm = new PS_S_SEND_LUMP_CNFMDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setSendtype(sendtype);

        PSSend1301EJBHome home = (PSSend1301EJBHome) JNDIManager.getInstance().getHome("PSSend1301EJB");
        try {
            PSSend1301EJB ejb = home.create();
            ds = ejb.selectCombolist(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }


   /**
    * 일일발송 확인관리 지사별확인내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      PS_L_SEND_DD_CNFMDataSet ds = null;
      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

      String senddt = Util.checkString(req.getParameter("senddt"));
      String bocd = Util.checkString(req.getParameter("resitypecd"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String medicd = Util.checkString(req.getParameter("medicd"));

      if(bocd == null || bocd.equals("")){
         bocd = "ALL";
      }

      PS_L_SEND_DD_CNFMDM dm = new PS_L_SEND_DD_CNFMDM();
      //dm에 값을 Setting한다.
      dm.setCmpycd(cmpycd);
      dm.setSenddt(senddt);
      dm.setBocd(bocd);
      dm.setMediser_no(mediser_no);
      dm.setMedicd(medicd);

      PSSend1301EJBHome home = (PSSend1301EJBHome)JNDIManager.getInstance().getHome("PSSend1301EJB");
      try{
         PSSend1301EJB ejb = home.create();
         ds = ejb.selectList(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

   /**
    * 일일발송확인 발송방법별 상세내역을 조회한다
    * 조회된 request값을 set한다.
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
       //dm에 값을 Setting한다.
       dm.setBocd(bocd);
       dm.setMedicd(medicd);
       dm.setSenddt(senddt);

       PSSend1301EJBHome home = (PSSend1301EJBHome) JNDIManager.getInstance().getHome("PSSend1301EJB");

       try {
           PSSend1301EJB ejb = home.create();
           ds = ejb.selectMthdList(dm); // 설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds); // request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       }
   }

   /**
    * 일일발송확인 처리한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void updateSendcnfm(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request로 반환할 String Type 결과값

      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
      String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

      String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
      String senddt_cnfm = Util.checkString(req.getParameter("senddt_cnfm"));
      String medicd_cnfm = Util.checkString(req.getParameter("medicd_cnfm"));
      String chkcnfm_cnfm = Util.checkString(req.getParameter("chkcnfm_cnfm"));
      String sendroutedd = Util.checkString(req.getParameter("sendroutedd"));

      PS_U_SEND_DD_CNFMDM dm = new PS_U_SEND_DD_CNFMDM();
      //dm에 값을 Setting한다.
      dm.setBocd_cnfm(bocd_cnfm);
      dm.setSenddt_cnfm(senddt_cnfm);
      dm.setMedicd_cnfm(medicd_cnfm);
      dm.setChkcnfm_cnfm(chkcnfm_cnfm);
      dm.setSendroutedd(sendroutedd);
      dm.setIncmgpers(incmgpers);

      PSSend1301EJBHome home = (PSSend1301EJBHome)JNDIManager.getInstance().getHome("PSSend1301EJB");

      try{
         PSSend1301EJB ejb = home.create();

         bResult = ejb.updateSendcnfm(dm); // 설정된 dm값으로 EJB를 호출한다.
         if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

}
