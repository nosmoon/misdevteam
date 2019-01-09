/*****************************************************
 * 파일명   : PSCode1101WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-02-20
 * 작성자   : 장수환
 ********************************************************/
package chosun.ciis.ps.pbs.code.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.code.ejb.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;

/**
 *  출판국 코드-단행본 코그관리처리 WorkBean
 */
public class PSCode1101WB{


    /**
     * 단행본 코드관리화면을 초기화시키다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEPBK_CODEDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

        PS_S_SEPBK_CODEDM dm = new PS_S_SEPBK_CODEDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);

        PSCode1101EJBHome home = (PSCode1101EJBHome) JNDIManager.getInstance().getHome("PSCode1101EJB");
        try {
            PSCode1101EJB ejb = home.create();
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
     * 단행본 코드 상세내역을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectSepbkDtl(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEPBK_INFODataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

        String sep_bookcd = Util.checkString(req.getParameter("sep_bookcd"));

        PS_S_SEPBK_INFODM dm = new PS_S_SEPBK_INFODM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setSep_bookcd(sep_bookcd);

        PSCode1101EJBHome home = (PSCode1101EJBHome) JNDIManager.getInstance().getHome("PSCode1101EJB");
        try {
            PSCode1101EJB ejb = home.create();
            ds = ejb.selectSepbkDtl(dm); // 설정된 dm값으로 EJB를 호출한다.
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
    * 회사별 단행본등록 내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      PS_L_SEPBK_CODEDataSet ds = null;
      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드
      String medicd = Util.checkString(req.getParameter("medicd"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String sep_bookcdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcdnm")));
      String pageno = Util.checkString(req.getParameter("pageno"));
      String pagesize = Util.checkString(req.getParameter("pagesize"));

      String sPageNo     = req.getParameter("curr_page_no"); // 현재페이지
      int iPageSize      = 5000; // 페이지당 Row수 일단 10라인
      int iPageNo        = 1;    // 최초 페이지 1로 설정
      if(sPageNo != null && !sPageNo.equals("")){ // 페이지 값이 있으면 재설정
         iPageNo = Integer.parseInt(sPageNo);
      }
      if(mediser_no == null || mediser_no.equals("")){
         mediser_no = "ALL";
      }
      if(sep_bookcdnm == null || sep_bookcdnm.equals("")){
         sep_bookcdnm = "ALL";
      }
      PS_L_SEPBK_CODEDM dm = new PS_L_SEPBK_CODEDM();
      //dm에 값을 Setting한다.
      dm.setCmpycd(cmpycd);
      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      dm.setSep_booknm(sep_bookcdnm);
      dm.setPageno(iPageNo);
      dm.setPagesize(iPageSize);
      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");
      try{
         PSCode1101EJB ejb = home.create();
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
    * 단행본 코드내역을 입력한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void insertSepbkCode(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request로 반환할 String Type 결과값

      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
      String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

      String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));				    //매체코드
      String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));		    //매체호수
      String sep_bookcdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcdnm")));		//단행본코드명
      String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));		        //단행본코드분류
      String issuclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issuclsf")));				//발행구분(회사코드)
      String basiyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basiyymm")));				//기준년월
      String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));					    //단가
      String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));				//구독단가
      String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));					//할제
      String contclascd = Util.Uni2Ksc(Util.checkString(req.getParameter("contclascd")));			//내용분류코드
      String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));                   //저자
      String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));					    //판형
      String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));						    //규격
      String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));			            //쪽수
      String covermodl = Util.Uni2Ksc(Util.checkString(req.getParameter("covermodl")));	            //표지모델
      String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));					//등록일자
      String extdtms = Util.Uni2Ksc(Util.checkString(req.getParameter("extdtms")));	                //연장횟수
      String absenceyn = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceyn")));				//절판여부
      String absencedt = Util.Uni2Ksc(Util.checkString(req.getParameter("absencedt")));				//절판일자
      String absenceprocdt =Util.Uni2Ksc(Util.checkString(req.getParameter("absenceprocdt")));		//절판처리일자
      String bundunit = Util.Uni2Ksc(Util.checkString(req.getParameter("bundunit")));				//뭉치단위
      String unitmidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("unitmidlqunt")));		//단위중량
      String pjbasimidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("pjbasimidlqunt")));	//파지기준중량
      String sericd = Util.Uni2Ksc(Util.checkString(req.getParameter("sericd")));		            //시리즈코드
      String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));		                //MEMO

      //단가 String to Integer
      int iUprc =0;
      if(uprc != null && !uprc.equals("")){ //
         iUprc = Integer.parseInt(uprc);
      }
      //구독단가 String to Integer
      int iSubsuprc =0;
      if(subsuprc != null && !subsuprc.equals("")){ //
         iSubsuprc = Integer.parseInt(subsuprc);
      }
      //할제 String to Integer
      int iDcrate =0;
      if(dcrate != null && !dcrate.equals("")){ //
         iDcrate = Integer.parseInt(dcrate);
      }
      //쪽수 String to Integer
      int iPage =0;
      if(page != null && !page.equals("")){ //
         iPage = Integer.parseInt(page);
      }
      //연장횟수 String to Integer
      int iExtdtms =0;
      if(extdtms != null && !extdtms.equals("")){ //
         iExtdtms = Integer.parseInt(extdtms);
      }
      //뭉치단위 String to Integer
      int iBundunit =0;
      if(bundunit != null && !bundunit.equals("")){ //
         iBundunit = Integer.parseInt(bundunit);
      }
      //단위중량 String to Integer
      int iUnitmidlqunt =0;
      if(unitmidlqunt != null && !unitmidlqunt.equals("")){ //
         iUnitmidlqunt = Integer.parseInt(unitmidlqunt);
      }
      //파지기준중량 String to Integer
      int iPjbasimidlqunt =0;
      if(pjbasimidlqunt != null && !pjbasimidlqunt.equals("")){ //
         iPjbasimidlqunt = Integer.parseInt(pjbasimidlqunt);
      }


      PS_I_SEPBK_CODEDM dm = new PS_I_SEPBK_CODEDM();
      //dm에 값을 Setting한다.
      dm.setCmpycd(cmpycd);
      dm.setIncmgpers(incmgpers);
      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      dm.setMedi_clsf(medi_clsf);
      dm.setSep_bookcdnm(sep_bookcdnm);
      dm.setIssuclsf(issuclsf);
      dm.setBasiyymm(basiyymm);
      dm.setUprc(iUprc);
      dm.setSubsuprc(iSubsuprc);
      dm.setDcrate(iDcrate);
      dm.setContclascd(contclascd);
      dm.setAuthor(author);
      dm.setType(type);
      dm.setStd(std);
      dm.setPage(iPage);
      dm.setCovermodl(covermodl);
      dm.setReg_dt(reg_dt);
      dm.setExtdtms(iExtdtms);
      dm.setAbsenceyn(absenceyn);
      dm.setAbsencedt(absencedt);
      dm.setAbsenceprocdt(absenceprocdt);
      dm.setBundunit(iBundunit);
      dm.setUnitmidlqunt(iUnitmidlqunt);
      dm.setPjbasimidlqunt(iPjbasimidlqunt);
      dm.setSericd(sericd);
      dm.setMemo(memo);


      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");

      try{
         PSCode1101EJB ejb = home.create();

         bResult = ejb.insertSepbkCode(dm); // 설정된 dm값으로 EJB를 호출한다.
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

   /**
    * 단행본 코드내역을 수정한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void updateSepbkCode(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request로 반환할 String Type 결과값

      //사용자 세션정보
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        //회사코드
      String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

      String sep_bookcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcd")));			//단행본코드
      String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));				    //매체코드
      String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));		    //매체호수
      String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));		        //단행본코드분류
      String sep_bookcdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcdnm")));		//단행본코드명
      String issuclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issuclsf")));				//발행구분(회사코드)
      String basiyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basiyymm")));				//기준년월
      String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));					    //단가
      String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));				//구독단가
      String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));					//할제
      String contclascd = Util.Uni2Ksc(Util.checkString(req.getParameter("contclascd")));			//내용분류코드
      String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));		            //저자
      String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));					    //판형
      String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));						    //규격
      String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));			            //쪽수
      String covermodl = Util.Uni2Ksc(Util.checkString(req.getParameter("covermodl")));	            //표지모델
      String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));					//등록일자
      String extdtms = Util.Uni2Ksc(Util.checkString(req.getParameter("extdtms")));	                //연장횟수
      String absenceyn = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceyn")));				//절판여부
      String absencedt = Util.Uni2Ksc(Util.checkString(req.getParameter("absencedt")));				//절판일자
      String absenceprocdt = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceprocdt")));		//절판처리일자
      String bundunit = Util.Uni2Ksc(Util.checkString(req.getParameter("bundunit")));				//뭉치단위
      String unitmidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("unitmidlqunt")));		//단위중량
      String pjbasimidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("pjbasimidlqunt")));	//파지기준중량
      String sericd =Util.Uni2Ksc(Util.checkString(req.getParameter("sericd")));		            //시리즈코드
      String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));		                //MEMO

      //단가 String to Integer
      int iUprc =0;
      if(uprc != null && !uprc.equals("")){ //
         iUprc = Integer.parseInt(uprc);
      }
      //구독단가 String to Integer
      int iSubsuprc =0;
      if(subsuprc != null && !subsuprc.equals("")){ //
         iSubsuprc = Integer.parseInt(subsuprc);
      }
      //할제 String to Integer
      int iDcrate =0;
      if(dcrate != null && !dcrate.equals("")){ //
         iDcrate = Integer.parseInt(dcrate);
      }
      //쪽수 String to Integer
      int iPage =0;
      if(page != null && !page.equals("")){ //
         iPage = Integer.parseInt(page);
      }
      //연장횟수 String to Integer
      int iExtdtms =0;
      if(extdtms != null && !extdtms.equals("")){ //
         iExtdtms = Integer.parseInt(extdtms);
      }
      //뭉치단위 String to Integer
      int iBundunit =0;
      if(bundunit != null && !bundunit.equals("")){ //
         iBundunit = Integer.parseInt(bundunit);
      }
      //단위중량 String to Integer
      int iUnitmidlqunt =0;
      if(unitmidlqunt != null && !unitmidlqunt.equals("")){ //
         iUnitmidlqunt = Integer.parseInt(unitmidlqunt);
      }
      //파지기준중량 String to Integer
      int iPjbasimidlqunt =0;
      if(pjbasimidlqunt != null && !pjbasimidlqunt.equals("")){ //
         iPjbasimidlqunt = Integer.parseInt(pjbasimidlqunt);
      }

      PS_U_SEPBK_CODEDM dm = new PS_U_SEPBK_CODEDM();
      //dm에 값을 Setting한다.
      dm.setCmpycd(cmpycd);
      dm.setChgpers(incmgpers);
      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      dm.setMedi_clsf(medi_clsf);
      dm.setSep_bookcdnm(sep_bookcdnm);
      dm.setIssuclsf(issuclsf);
      dm.setBasiyymm(basiyymm);
      dm.setUprc(iUprc);
      dm.setSubsuprc(iSubsuprc);
      dm.setDcrate(iDcrate);
      dm.setContclascd(contclascd);
      dm.setAuthor(author);
      dm.setType(type);
      dm.setStd(std);
      dm.setPage(iPage);
      dm.setCovermodl(covermodl);
      dm.setReg_dt(reg_dt);
      dm.setExtdtms(iExtdtms);
      dm.setAbsenceyn(absenceyn);
      dm.setAbsencedt(absencedt);
      dm.setAbsenceprocdt(absenceprocdt);
      dm.setBundunit(iBundunit);
      dm.setUnitmidlqunt(iUnitmidlqunt);
      dm.setPjbasimidlqunt(iPjbasimidlqunt);
      dm.setSericd(sericd);
      dm.setMemo(memo);

      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");

      try{
         PSCode1101EJB ejb = home.create();
         bResult = ejb.updateSepbkCode(dm); // 설정된 dm값으로 EJB를 호출한다.
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

   /**
    * 단행본 코드내역을 삭제한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void deleteSepbkCode(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request로 반환할 String Type 결과값

      //사용자 세션정보
      String bocd      = Util.getSessionParameterValue(req, "cmpycd", true);        //회사코드
      String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

      String medicd = Util.checkString(req.getParameter("medicd"));				                    //매체코드
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));		                    //매체호수

      PS_D_SEPBK_CODEDM dm = new PS_D_SEPBK_CODEDM();
      //dm에 값을 Setting한다.

      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");

      try{
         PSCode1101EJB ejb = home.create();

         bResult = ejb.deleteSepbkCode(dm); // 설정된 dm값으로 EJB를 호출한다.
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