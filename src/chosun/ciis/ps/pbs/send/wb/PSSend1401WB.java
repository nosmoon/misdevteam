/*****************************************************
 * 파일명   : PSSend1401WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-03-04
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
 *  발송-일일발송 발송처리 WorkBean
 */
public class PSSend1401WB{


    /**
     * 일일발송 발송처리 관리화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_LUMP_PROCDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드
        String medicd      = Util.checkString(req.getParameter("medicd"));              //매체코드
        String sendtype    = "02";

        PS_S_SEND_LUMP_PROCDM dm = new PS_S_SEND_LUMP_PROCDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setSendtype(sendtype);

        PSSend1401EJBHome home = (PSSend1401EJBHome) JNDIManager.getInstance().getHome("PSSend1401EJB");
        try {
            PSSend1401EJB ejb = home.create();
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
    * 일일발송 발송처리 지사별확인내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      PS_L_SEND_DD_PROCDataSet ds = null;
      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

      String senddt = Util.checkString(req.getParameter("senddt"));
      String bocd = Util.checkString(req.getParameter("sendbrch"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String medicd = Util.checkString(req.getParameter("medicd"));
      String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
      String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));

      if(bocd == null || bocd.equals("")){
         bocd = "ALL";
      }

      PS_L_SEND_DD_PROCDM dm = new PS_L_SEND_DD_PROCDM();
      //dm에 값을 Setting한다.
      dm.setCmpycd(cmpycd);
      dm.setSenddt(senddt);
      dm.setBocd(bocd);
      dm.setMediser_no(mediser_no);
      dm.setMedicd(medicd);
      dm.setSendkindcd(sendkindcd);
      dm.setSendmthdcd(sendmthdcd);

      PSSend1401EJBHome home = (PSSend1401EJBHome)JNDIManager.getInstance().getHome(
          "PSSend1401EJB");
      try{
         PSSend1401EJB ejb = home.create();
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
    * 일일발송 발송처리 발송방법별 상세내역을 조회한다
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void selectMthdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_SEND_DD_PROC_DTLSDataSet ds = null;

       String senddt = Util.checkString(req.getParameter("brchdt"));
       String bocd = Util.checkString(req.getParameter("cnfmbrchcd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd = Util.checkString(req.getParameter("medicd"));
       String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
       String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));
       String sPageNo = req.getParameter("curr_page_no"); // 현재페이지

       int iPageSize = 5000; // 페이지당 Row수 일단 5라인
       int iPageNo = 1; // 최초 페이지 1로 설정
       if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
           iPageNo = Integer.parseInt(sPageNo);
       }

       PS_L_SEND_DD_PROC_DTLSDM dm = new PS_L_SEND_DD_PROC_DTLSDM();
       //dm에 값을 Setting한다.
       dm.setSenddt(senddt);
       dm.setBocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setSendkindcd(sendkindcd);
       dm.setSendmthdcd(sendmthdcd);
       dm.setPageno(iPageNo);
       dm.setPagesize(iPageSize);

       PSSend1401EJBHome home = (PSSend1401EJBHome) JNDIManager.getInstance().getHome("PSSend1401EJB");

       try {
           PSSend1401EJB ejb = home.create();
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
    * 일일발송 발송처리 엑셀로 출력
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void printDdSticker(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_P_SEND_DD_STICKERDataSet ds = null;

       String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드
       String senddt = Util.checkString(req.getParameter("senddt"));
       String bocd = Util.checkString(req.getParameter("sendbrch"));
       String medicd = Util.checkString(req.getParameter("medicd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
       String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));


       PS_P_SEND_DD_STICKERDM dm = new PS_P_SEND_DD_STICKERDM();
       //dm에 값을 Setting한다.
       dm.setCmpycd(cmpycd);
       dm.setSenddt(senddt);
       dm.setBocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setSendkindcd(sendkindcd);
       dm.setSendmthdcd(sendmthdcd);

       PSSend1401EJBHome home = (PSSend1401EJBHome) JNDIManager.getInstance().getHome("PSSend1401EJB");

       try {
           PSSend1401EJB ejb = home.create();
           ds = ejb.printDdSticker(dm); // 설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds); // request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       }
   }

}