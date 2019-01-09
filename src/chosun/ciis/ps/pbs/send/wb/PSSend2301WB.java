/*****************************************************
 * 파일명   : PSSend2301WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-03-02
 * 작성자   : 전현표
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
 *  발송-지국발송 발송처리 WorkBean
 */
public class PSSend2301WB{


    /**
     * 일괄발송 발송처리 관리화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_BO_SEND_INITDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String medicd      = Util.checkString(req.getParameter("medicd"));              //매체코드
        String deptcd      = Util.checkString(req.getParameter("deptcd"));              //매체코드

        PS_S_BO_SEND_INITDM dm = new PS_S_BO_SEND_INITDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setDeptcd(deptcd);

        PSSend2301EJBHome home = (PSSend2301EJBHome) JNDIManager.getInstance().getHome("PSSend2301EJB");
        try {
            PSSend2301EJB ejb = home.create();
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
    * 일괄발송 발송처리 지사별확인내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_SEND_PBLMEDISENDBODataSet ds = null;
      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
      String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String sPageNo = req.getParameter("curr_page_no"); // 현재페이지
      String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

      int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환

      int iPageNo = 1; // 최초 페이지 1로 설정
      if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
          iPageNo = Integer.parseInt(sPageNo);
      }

      PS_L_SEND_PBLMEDISENDBODM dm = new PS_L_SEND_PBLMEDISENDBODM();
      //dm에 값을 Setting한다.
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
    * 일괄발송 발송처리 발송방법별 상세내역을 조회한다
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void selectBoList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_BOSEND_LUMPDataSet ds = null;

       String bocd = Util.checkString(req.getParameter("bocd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd = Util.checkString(req.getParameter("medicd"));

       String sPageNo = req.getParameter("curr_page_no"); // 현재페이지

       String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

       int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환

       int iPageNo = 1; // 최초 페이지 1로 설정
       if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
           iPageNo = Integer.parseInt(sPageNo);
       }

       PS_L_BOSEND_LUMPDM dm = new PS_L_BOSEND_LUMPDM();
       //dm에 값을 Setting한다.

       dm.setAcq_bocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setPageno(iPageNo);
       dm.setPagesize(iPageSize);


       PSSend2301EJBHome home = (PSSend2301EJBHome) JNDIManager.getInstance().getHome("PSSend2301EJB");

       try {
           PSSend2301EJB ejb = home.create();
           ds = ejb.selectBoList(dm); // 설정된 dm값으로 EJB를 호출한다.
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
    * 일괄발송 발송처리 엑셀로 출력
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void printSticker(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_P_SEND_PBLMEDISENDBODataSet ds = null;

       //사용자 세션정보
       String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

       String medicd = Util.checkString(req.getParameter("medicd"));
       String senddt = Util.checkString(req.getParameter("senddt"));
       String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
       String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
       String deptcd = Util.checkString(req.getParameter("deptcd"));
       String areacd = Util.checkString(req.getParameter("areacd"));

       String bocd = Util.checkString(req.getParameter("corrbocd"));
       String sPageNo = req.getParameter("curr_page_no"); // 현재페이지
       String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

       int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환

       int iPageNo = 1; // 최초 페이지 1로 설정
       if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
           iPageNo = Integer.parseInt(sPageNo);
       }

       PS_P_SEND_PBLMEDISENDBODM dm = new PS_P_SEND_PBLMEDISENDBODM();
       //dm에 값을 Setting한다.
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
           ds = ejb.printSticker(dm); // 설정된 dm값으로 EJB를 호출한다.
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
    * 일괄발송 발송처리 지국별확인내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectSendBoList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_BO_SEND_LISTDataSet ds = null;
      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
      String sPageNo = req.getParameter("curr_page_no"); // 현재페이지
      String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

      int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환

      int iPageNo = 1; // 최초 페이지 1로 설정
      if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
          iPageNo = Integer.parseInt(sPageNo);
      }

      PS_L_BO_SEND_LISTDM dm = new PS_L_BO_SEND_LISTDM();
      //dm에 값을 Setting한다.
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
         ds = ejb.selectSendBoList(dm); // 설정된 dm값으로 EJB를 호출한다.
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
    * 일괄발송 발송독자를 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectSendBoPrint(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_P_BO_SEND_LISTDataSet ds = null;
      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));

      PS_P_BO_SEND_LISTDM dm = new PS_P_BO_SEND_LISTDM();
      //dm에 값을 Setting한다.
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
         ds = ejb.selectSendBoPrint(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

}
