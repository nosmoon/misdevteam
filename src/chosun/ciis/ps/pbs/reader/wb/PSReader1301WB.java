/***************************************************************************************************
* 파일명   : PSReader1301WB.java
* 기  능   : 독자-중재요청 코드및 초기화면
* 작성일자 : 2004-02-29
* 작성자   : 김건호
****************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백  업   :
****************************************************************************************************/

package chosun.ciis.ps.pbs.reader.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.reader.ejb.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;

public class PSReader1301WB{

   /**
    * 조회화면에 사용되는 코드값을 가져온다
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_S_RDR_ARBTDataSet ds = null;

      //사용자 세션정보
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

      PS_S_RDR_ARBTDM dm = new PS_S_RDR_ARBTDM();      // DM 값을 Setting한다.

      dm.setCmpycd(cmpycd);

      PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
      try{

         PSReader1301EJB ejb = home.create();
         ds = ejb.selectCodeList(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
         throw se;
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
         throw se;
      }
   }

   /**
    * 중재요청 데이타를 조회한다
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectArbtList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_RDR_ARBTDataSet ds = null;

      //사용자 세션정보
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

      String bocd = Util.checkString(req.getParameter("bocd"));
      String aprvproccd = Util.checkString(req.getParameter("slt_aprvproccd"));
      String arbtaplcdtfr = Util.checkString(req.getParameter("arbtaplcdtfr"));
      String arbtaplcdtto = Util.checkString(req.getParameter("arbtaplcdtto"));
      String curr_page_no = req.getParameter("curr_page_no"); // 현재페이지
      String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

      int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
      int iPageNo = 1; // 최초 페이지 1로 설정
      if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
          iPageNo = Integer.parseInt(curr_page_no);
      }

      PS_L_RDR_ARBTDM  dm = new PS_L_RDR_ARBTDM ();      // DM 값을 Setting한다.

      dm.setCmpycd(cmpycd);
      dm.setBocd(bocd);
      dm.setAprvproccd(aprvproccd);
      dm.setArbtaplcdtfr(arbtaplcdtfr);
      dm.setArbtaplcdtto(arbtaplcdtto);
      dm.setPageno(iPageNo);
      dm.setPagesize(iPageSize);

      PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
      try{

         PSReader1301EJB ejb = home.create();

         ds = ejb.selectArbtList(dm); // 설정된 dm값으로 EJB를 호출한다.

         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
         throw se;
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
         throw se;
      }
   }

   /**
    * 중재요청 저장내역을 수정한다
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
     public void updateArbt(HttpServletRequest req, HttpServletResponse res) throws AppException {
         boolean bResult = false;
         String sResult = "false"; // request로 반환할 String Type 결과값

         //로그인 사용자 세션정보
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

         String arbtno =  Util.checkString(req.getParameter("all_arbtno"));
         String arbtaplcdt = Util.checkString(req.getParameter("all_arbtaplcdt"));
         String aprvproccd =  Util.checkString(req.getParameter("all_aprvproccd"));
         String arbtprocresn = Util.Uni2Ksc(Util.checkString(req.getParameter("all_arbtprocresn")));

         PS_U_RDR_ARBTDM dm = new PS_U_RDR_ARBTDM();
         //dm에 값을 Setting한다.
         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);
         dm.setArbtno(arbtno);
         dm.setArbtaplcdt(arbtaplcdt);
         dm.setAprvproccd(aprvproccd);
         dm.setArbtprocresn(arbtprocresn);

         PSReader1301EJBHome home = (PSReader1301EJBHome) JNDIManager.getInstance().getHome("PSReader1301EJB");

         try {
             PSReader1301EJB ejb = home.create();

             bResult = ejb.updateArbt(dm); // 설정된 dm값으로 EJB를 호출한다.
             if (bResult == true) { // 성공적으로 입력된 경우
                 sResult = "true";
             }
             req.setAttribute("result", sResult); // request에 결과값을 담는다.
         } catch (CreateException e) {
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
         } catch (RemoteException e) {
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
         }
     }
     /**
      * 중재요청 비교대상독자 데이타를 조회한다
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @return void
      **/
     public void selectArbtCmprobjList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_ARBT_CMPROBJDataSet ds = null;

        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

        String arbtno = Util.checkString(req.getParameter("arbtno"));
        String arbtaplcdt = Util.checkString(req.getParameter("arbtaplcdt"));

        PS_L_ARBT_CMPROBJDM  dm = new PS_L_ARBT_CMPROBJDM ();      // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setArbtno(arbtno);
        dm.setArbtaplcdt(arbtaplcdt);

        PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
        try{

           PSReader1301EJB ejb = home.create();
           ds = ejb.selectArbtCmprobjList(dm); // 설정된 dm값으로 EJB를 호출한다.

           req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch(CreateException e){
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
        } catch(RemoteException e){
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
        }
     }
     /**
      * 중재요청 비교대상독자 상세내역 데이타를 조회한다
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @return void
      **/
     public void selectCmprobjDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_S_RDR_CMPROBJDataSet ds = null;

        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드
        
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));

        PS_S_RDR_CMPROBJDM  dm = new PS_S_RDR_CMPROBJDM ();      // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);

        PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
        try{

           PSReader1301EJB ejb = home.create();
           ds = ejb.selectCmprobjDetail(dm); // 설정된 dm값으로 EJB를 호출한다.

           req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch(CreateException e){
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
        } catch(RemoteException e){
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
        }
     }

}
/***************************************************************************************************
* 수정자     :
* 수정전코드 :
****************************************************************************************************/
