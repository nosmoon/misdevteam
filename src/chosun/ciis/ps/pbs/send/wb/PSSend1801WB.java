/***************************************************************************************************
* 파일명   : PSSend1801WB.java
* 기  능   : 발송-보너스북발송 발송처리 코드및 초기화면
* 작성일자 : 2004-02-29
* 작성자   : 김건호
****************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백  업   :
****************************************************************************************************/

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

public class PSSend1801WB{

   /**
    * 조회화면에 사용되는 코드값을 가져온다
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_S_SEND_BNSBKDataSet ds = null;

      //사용자 세션정보
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드
      String flag   = "P";

      PS_S_SEND_BNSBKDM dm = new PS_S_SEND_BNSBKDM();      // DM 값을 Setting한다.

      dm.setCmpycd(cmpycd);
      dm.setFlag(flag);

      PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
      try{

         PSSend1801EJB ejb = home.create();
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
    * 보너스북발송 발송처리 데이타를 조회한다
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBnsbkList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_SEND_BNSBK_CONDataSet ds = null;

      //사용자 세션정보
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드
      String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

      String senddt = Util.checkString(req.getParameter("slt_senddt"));
      String asinbocd = Util.checkString(req.getParameter("slt_asinbocd"));
      String sendmthd = Util.checkString(req.getParameter("slt_sendmthd"));

      PS_L_SEND_BNSBK_CONDM  dm = new PS_L_SEND_BNSBK_CONDM ();      // DM 값을 Setting한다.

      dm.setCmpycd(cmpycd);
      dm.setIncmgpers(incmgpers);
      dm.setSenddt(senddt);
      dm.setAsinbocd(asinbocd);
      dm.setSendmthd(sendmthd);

      PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
      try{

         PSSend1801EJB ejb = home.create();

         ds = ejb.selectBnsbkList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
       * 보너스북발송 발송처리 상세내역 데이타를 조회한다
       * 조회된 request값을 set한다.
       * @param HttpServletRequest req
       * @param HttpServletResponse res
       * @return void
       **/
      public void selectBnsbkDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
         PS_L_SEND_BNSBK_CON_DTLDataSet ds = null;

         //사용자 세션정보
         String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

         String senddt = Util.checkString(req.getParameter("senddt"));
         String asinbocd = Util.checkString(req.getParameter("asinbocd"));
         String sendmthd = Util.checkString(req.getParameter("sendmthd"));
         String curr_page_no = req.getParameter("curr_page_no"); // 현재페이지
         String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

         int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
         int iPageNo = 1; // 최초 페이지 1로 설정
         if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
             iPageNo = Integer.parseInt(curr_page_no);
         }

         PS_L_SEND_BNSBK_CON_DTLDM  dm = new PS_L_SEND_BNSBK_CON_DTLDM ();      // DM 값을 Setting한다.

         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);
         dm.setSenddt(senddt);
         dm.setAsinbocd(asinbocd);
         dm.setSendmthd(sendmthd);
         dm.setPageno(iPageNo);
         dm.setPagesize(iPageSize);

         PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
         try{

            PSSend1801EJB ejb = home.create();

            ds = ejb.selectBnsbkDetail(dm); // 설정된 dm값으로 EJB를 호출한다.

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
       * 보너스북발송 발송처리 엑셀로
       * 조회된 request값을 set한다.
       * @param HttpServletRequest req
       * @param HttpServletResponse res
       * @return void
       **/
      public void printBnsbkSticker(HttpServletRequest req, HttpServletResponse res) throws AppException{
         PS_P_SEND_BNSBK_STICKERDataSet ds = null;

         //사용자 세션정보
         String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

         String senddt = Util.checkString(req.getParameter("slt_senddt"));
         String asinbocd = Util.checkString(req.getParameter("slt_asinbocd"));
         String sendmthd = Util.checkString(req.getParameter("slt_sendmthd"));

         PS_P_SEND_BNSBK_STICKERDM  dm = new PS_P_SEND_BNSBK_STICKERDM ();      // DM 값을 Setting한다.

         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);
         dm.setSenddt(senddt);
         dm.setAsinbocd(asinbocd);
         dm.setSendmthd(sendmthd);

         PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
         try{

            PSSend1801EJB ejb = home.create();

            ds = ejb.printBnsbkSticker(dm); // 설정된 dm값으로 EJB를 호출한다.

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
