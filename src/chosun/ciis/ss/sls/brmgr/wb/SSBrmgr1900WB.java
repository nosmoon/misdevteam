/***************************************************************************************************
* 파일명 : SSBrmgr1900WB.java
* 기능 : 지국경영-아파트투입률을 위한 Worker Bean
* 작성일자 : 2004-11-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.util.*;				//추가
import java.lang.*;				//추가
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-아파트투입률을 위한 WB
 */

public class SSBrmgr1900WB{

    /**
     * 일괄발송 발송처리 관리화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_BO_SEND_INITDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String medicd      = Util.checkString(req.getParameter("medicd"));              //매체코드
        String deptcd      = Util.checkString(req.getParameter("deptcd"));              //부서코드

        SS_S_BO_SEND_INITDM dm = new SS_S_BO_SEND_INITDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setDeptcd(deptcd);

        SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
        ds = dao.selectCombolist(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
        /*
        SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
        try {
            SSBrmgr1900EJB ejb = home.create();
            ds = ejb.selectCombolist(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }*/
    }


   /**
    * 일괄발송 발송처리 지사별확인내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      SS_L_SEND_PBLMEDISENDBODataSet ds = null;
      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
      String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String sPageNo = req.getParameter("pageno"); // 현재페이지
      String records_per_page = req.getParameter("pagesize"); // 페이지당 Row수

      int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환

      int iPageNo = 1; // 최초 페이지 1로 설정
      if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
          iPageNo = Integer.parseInt(sPageNo);
      }

      SS_L_SEND_PBLMEDISENDBODM dm = new SS_L_SEND_PBLMEDISENDBODM();
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

      SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
      ds = dao.selectList(dm);
      req.setAttribute("ds", ds); // request에 결과값을 담는다.
      
      /*
      SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
      try{
         SSBrmgr1900EJB ejb = home.create();
         ds = ejb.selectList(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }

   /**
    * 일괄발송 발송처리 발송방법별 상세내역을 조회한다
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void selectBoList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_L_BOSEND_LUMPDataSet ds = null;

       String bocd = Util.checkString(req.getParameter("bocd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd = Util.checkString(req.getParameter("medicd"));

       String sPageNo = req.getParameter("pageno"); // 현재페이지

       String records_per_page = req.getParameter("pagesize"); // 페이지당 Row수

       int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환

       int iPageNo = 1; // 최초 페이지 1로 설정
       if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
           iPageNo = Integer.parseInt(sPageNo);
       }

       SS_L_BOSEND_LUMPDM dm = new SS_L_BOSEND_LUMPDM();
       //dm에 값을 Setting한다.

       dm.setAcq_bocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setPageno(iPageNo);
       dm.setPagesize(iPageSize);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.selectBoList(dm);
       req.setAttribute("ds", ds); // request에 결과값을 담는다.

       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {
           SSBrmgr1900EJB ejb = home.create();
           ds = ejb.selectBoList(dm); // 설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds); // request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       }*/
   }

   /**
    * 일괄발송 발송처리 엑셀로 출력
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void printSticker(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_P_SEND_PBLMEDISENDBODataSet ds = null;

       //사용자 세션정보
       String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

       String medicd = Util.checkString(req.getParameter("medicd"));
       String senddt = Util.checkString(req.getParameter("senddt"));
       String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
       String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
       String deptcd = Util.checkString(req.getParameter("deptcd"));
       String areacd = Util.checkString(req.getParameter("areacd"));

       String bocd = Util.checkString(req.getParameter("corrbocd"));
       String sPageNo = req.getParameter("pageno"); // 현재페이지
       String records_per_page = req.getParameter("pagesize"); // 페이지당 Row수

       int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환

       int iPageNo = 1; // 최초 페이지 1로 설정
       if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
           iPageNo = Integer.parseInt(sPageNo);
       }

       SS_P_SEND_PBLMEDISENDBODM dm = new SS_P_SEND_PBLMEDISENDBODM();
       //dm에 값을 Setting한다.
       dm.setCmpycd(cmpycd);
       dm.setMedicd(medicd);
       dm.setSenddt(senddt);
       dm.setMediser_fr(mediser_no_fr);
       dm.setMediser_to(mediser_no_to);
       dm.setDeptcd(deptcd);
       dm.setAreacd(areacd);
       dm.setBocd(bocd);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.printSticker(dm);
       req.setAttribute("ds", ds); // request에 결과값을 담는다.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {
           SSBrmgr1900EJB ejb = home.create();
           ds = ejb.printSticker(dm); // 설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds); // request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       }*/
   }


   /**
    * 지국 독자
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_L_BO_READER_SEARCHDataSet ds = null;

       //Session에서 얻을 데이타
       String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
       //String bocd = Util.getSessionParameterValue(req, "bocd", true);

       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
       String gubun1 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun1")));
       String nmtext = Util.Uni2Ksc(Util.checkString(req.getParameter("nmtext")));
       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
       String gubun2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun2")));
       String phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone1")));
       String phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone2")));
       String phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone3")));
       String gubun3 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun3")));
       String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
       String sendmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_sendmthd")));
       String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
       String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
       String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));

       String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
       if (pagenostr.equals(""))   pagenostr = "1";
       long   pageno = Long.parseLong(pagenostr);
       String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
       if (pagesizestr.equals(""))   pagesizestr = "5";
       long   pagesize = Long.parseLong(pagesizestr);

       //DM 값을 Setting한다.
       SS_L_BO_READER_SEARCHDM dm = new SS_L_BO_READER_SEARCHDM();

       dm.setCmpycd(cmpycd);
       dm.setMedicd(medicd);
       dm.setGubun1(gubun1);
       dm.setNmtext(nmtext);
       dm.setRdr_no(rdr_no);
       dm.setGubun2(gubun2);
       dm.setPhone1(phone1);
       dm.setPhone2(phone2);
       dm.setPhone3(phone3);
       dm.setGubun3(gubun3);
       dm.setDlvdtlsaddr(dlvdtlsaddr);
       dm.setSendmthd(sendmthd);
       dm.setAreacd(areacd);
       dm.setDeptcd(deptcd);
       dm.setBocd(bocd);
       dm.setPageno(pageno);
       dm.setPagesize(pagesize);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.selectBoReaderList(dm);
       req.setAttribute("ds", ds);      // request에 결과값을 담는다.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {

           SSBrmgr1900EJB ejb = home.create();
           ds = ejb.selectBoReaderList(dm); // 설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds);      // request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       }*/
   }

   /**
    * 지국 독자
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_S_BO_READERINFODataSet ds = null;

       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
       String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));

       //DM 값을 Setting한다.
       SS_S_BO_READERINFODM dm = new SS_S_BO_READERINFODM();

       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.selectBoReaderDetail(dm);
       req.setAttribute("ds", ds);      // request에 결과값을 담는다.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {

           SSBrmgr1900EJB ejb = home.create();
           ds = ejb.selectBoReaderDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds);      // request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       }*/
   }

   /**
    * 수정할 구독자 정보를 Set
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBoReaderInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_U_BO_READERINFO_ONEDataSet ds = null;

       //사용자 세션정보
       //String bocd = Util.getSessionParameterValue(req, "bocd", true); //지국지사코드
       String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //회사코드
       String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

       //정상적으로 Request로 받을 파라메터
       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no"))); //독자번호
       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd"))); //매체코드
       String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno"))); //정기구독번호

       String acq_bocd = Util.checkString(req.getParameter("acq_bocd"));
       String sendmthd = Util.checkString(req.getParameter("sendmthd"));
       String dstccd = Util.checkString(req.getParameter("dstccd"));
       String dlvno = Util.checkString(req.getParameter("dlvno"));
       String bo_rdr_no = Util.checkString(req.getParameter("bo_rdr_no"));

       //DM 값을 Setting한다.
       SS_U_BO_READERINFO_ONEDM dm = new SS_U_BO_READERINFO_ONEDM();

       dm.setIncmgpers(incmgpers); //입력사원번호
       dm.setRdr_no(rdr_no); //독자번호
       dm.setMedicd(medicd); //매체코드
       dm.setTermsubsno(termsubsno); //정기구독번호

       dm.setAcq_bocd(acq_bocd);       //수취인지국코드
       dm.setSendmthd(sendmthd);
       dm.setDstccd(dstccd);
       dm.setDlvno(dlvno);
       dm.setBo_rdr_no(bo_rdr_no);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.updateBoReaderInfo(dm);
       req.setAttribute("ds", ds); //request에 결과값을 담는다.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {
           SSBrmgr1900EJB ejb = home.create();
           ds = ejb.updateBoReaderInfo(dm); //설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds); //request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       }*/
    }
}
