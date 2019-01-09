/***************************************************************************************************
* 파일명 : SSShare1200WB.java
* 기능 : 정보공유-실시간 지국 공지사항 처리를 위한 Work Bean
* 작성일자 : 2003-12-02
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/
package chosun.ciis.ss.sls.share.wb;

import javax.ejb.*;

import java.rmi.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.dao.*;


/**
 * 정보공유-실시간지국공지사항 위한 WB
 *
 */

public class SSShare1200WB{

	/**
     * 정보공유-실시간지국공지사항-초기화면
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_ANNCBO_INITDataSet ds = null;
        // Request Parameter Processing
        String clsf = "1";    //게시판구분 공지사항
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//입력자아이디
        String sb_areacd = Util.getSessionParameterValue(req, "areacd", true); 	//관할지역코드(복수)
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", true); 	//관리부서코드(복수)

        // DM Setting
        SS_L_ANNCBO_INITDM dm = new SS_L_ANNCBO_INITDM();

        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();         
            ds = ejb.selectInitList(dm);
            req.setAttribute("ds", ds);
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
     * 정보공유-실시간지국공지사항-조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_ANNCBODataSet ds = null;
        // Request Parameter Processing
        String clsf = "1";    //게시판구분 공지사항
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//회사코드
        String uid = Util.getSessionParameterValue(req, "uid", true); 	//입력자아이디
        String jobcd = ""; // 업무구분코드
        String makepersid = Util.getSessionParameterValue(req, "uid", true);       //등록자 아이디
        String makepersnm = Util.getSessionParameterValue(req, "emp_nm", false);    //등록자 이름
        String posicd = Util.getSessionParameterValue(req, "posicd", false);        //등록자 직책 코드
        String posinm = Util.getSessionParameterValue(req, "posinm", false);        //등록자 직책 이름
                
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));	//검색어
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));	//검색종류        
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드 
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm"));  //공지시작시간
        String anncendtm = Util.checkString(req.getParameter("anncendtm"));  //공지종료시간        
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "5000"; }

        // DM Setting
        SS_L_ANNCBODM dm = new SS_L_ANNCBODM();
        dm.setUid(uid);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setMakepersnm(makepersnm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setSearch_word(search_word);
        dm.setSearch_word_kind(search_word_kind);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
              
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO 객체의 selectSrchList 호출
		ds = dao.selectSrchList(dm);
		req.setAttribute("uid", uid);
        req.setAttribute("deptcd", deptcd);
        req.setAttribute("areacd", areacd);
        req.setAttribute("makepersnm", makepersnm);
        req.setAttribute("anncbgntm", anncbgntm);
        req.setAttribute("anncbgntm", anncbgntm);
        req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("pageno", pageno);
        req.setAttribute("pagesize", pagesize);
        req.setAttribute("ds", ds);
        
        /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();
            ds = ejb.selectSrchList(dm);
            req.setAttribute("uid", uid);
            req.setAttribute("deptcd", deptcd);
            req.setAttribute("areacd", areacd);
            req.setAttribute("makepersnm", makepersnm);
            req.setAttribute("anncbgntm", anncbgntm);
            req.setAttribute("anncbgntm", anncbgntm);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
            req.setAttribute("ds", ds);
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
     * 정보공유-실시간지국공지사항-글쓰기폼
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        // Request Parameter Processing
        SS_L_NWBUSEOCDDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO 객체의 selectCodeSP 호출
        ds = dao.selectDeptList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectDeptList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 정보공유-실시간 지국공지사항-저장(등록)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

	public void insertAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_I_ANNCBODataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        String makepersid = Util.getSessionParameterValue(req, "uid", true);       //등록자 아이디
        String makepersnm = Util.getSessionParameterValue(req, "emp_nm", false);    //등록자 이름
        String posicd = Util.getSessionParameterValue(req, "posicd", false);        //등록자 직책 코드
        String posinm = Util.getSessionParameterValue(req, "posinm", false);        //등록자 직책 이름
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false);    //등록자 판매부서코드
        String deptnm = Util.getSessionParameterValue(req, "selldeptnm", false);    //등록자 판매부서이름

        // Request Parameter Processing
        String rmsgclsf = Util.checkString(req.getParameter("rmsgclsf")); // 수신구분코드
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept")); // 수신부서코드
        String rmsgdeptnm =  Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm"))); //수신부서명
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea")); // 수신지역코드
        String rmsgareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgareanm"))); // 수신지역명
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm")); // 공지시작일자
        String anncendtm = Util.checkString(req.getParameter("anncendtm")); // 공지종료일자
        String annctitl =  Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl"))); // 제목
        String annccont =  Util.Uni2Ksc(Util.checkString(req.getParameter("annccont"))); // 내용

        String tmp = Util.replace(annctitl, "'", "&#39");
        annctitl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(annctitl, "·", "&#183");
        annctitl = tmp;

        String cont_tmp = Util.replace(annccont, "'", "&#39");
        //annccont = Util.replace(cont_tmp, "\"", "&#34");
        cont_tmp = Util.replace(annccont, "·", "&#183");
        annccont = cont_tmp;
        
        // DM Setting
        SS_I_ANNCBODM dm = new SS_I_ANNCBODM();
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setPosicd(posicd);
        dm.setPosinm(posinm);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setRmsgclsf(rmsgclsf);
        dm.setRmsgdept(rmsgdept);
        dm.setRmsgdeptnm(rmsgdeptnm);
        dm.setRmsgarea(rmsgarea);
        dm.setRmsgareanm(rmsgareanm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setAnnctitl(annctitl);
        dm.setAnnccont(annccont);
        dm.setIncmgpers(makepersid);

        
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO 객체의 insertInfoexg 호출
        bResult = dao.insertAnncbo(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
		
		/*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();

            bResult = ejb.insertAnncbo(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }

            req.setAttribute("result", sResult); // request에 결과값을 담는다.

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
     * 정보공유-실시간 지국공지사항-저장(수정)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

	public void updateAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_ANNCBODataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        String uid = Util.getSessionParameterValue(req, "uid", true);       //등록자 아이디

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq")); // 일련번호
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept")); // 수신부서코드
        String rmsgdeptnm =  Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm"))); //수신부서명
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea")); // 수신지역코드
        String rmsgareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgareanm"))); // 수신지역명
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm")); // 공지시작일자
        String anncendtm = Util.checkString(req.getParameter("anncendtm")); // 공지종료일자
        String annctitl =  Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl"))); // 제목
        String annccont =  Util.Uni2Ksc(Util.checkString(req.getParameter("annccont"))); // 내용

        String tmp = Util.replace(annctitl, "'", "&#39");
        annctitl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(annctitl, "·", "&#183");
        annctitl = tmp;

        String cont_tmp = Util.replace(annccont, "'", "&#39");
        //annccont = Util.replace(cont_tmp, "\"", "&#34");
        cont_tmp = Util.replace(annccont, "·", "&#183");
        annccont = cont_tmp;

        // DM Setting
        SS_U_ANNCBODM dm = new SS_U_ANNCBODM();
        dm.setUid(uid);

        dm.setSeq(Long.parseLong(seq));

        dm.setRmsgdept(rmsgdept);
        dm.setRmsgdeptnm(rmsgdeptnm);
        dm.setRmsgarea(rmsgarea);
        dm.setRmsgareanm(rmsgareanm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setAnnctitl(annctitl);
        dm.setAnnccont(annccont);
        
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO 객체의 insertInfoexg 호출
        bResult = dao.updateAnncbo(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
         
         /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();
            bResult = ejb.updateAnncbo(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
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
     * 정보공유-실시간 지국공지-삭제
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_D_ANNCBODataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값
        
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        SS_D_ANNCBODM dm = new SS_D_ANNCBODM();
        dm.setSeq(seq);

        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO 객체의 deleteInfoexg 호출
        bResult = dao.deleteAnncbo(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
        
        req.setAttribute("seq", seq);
        req.setAttribute("result", sResult); // request에 결과값을 담는다.
        /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();

            bResult = ejb.deleteAnncbo(dm); // 설정된 dm값으로 EJB를 호출한다.

            if(bResult == true){ // 성공적으로 입력된 경우
                sResult = "true";
             }
            
            req.setAttribute("seq", seq);
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
            //req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 정보공유-실시간 지국공지-상세보기
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchDtls(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_ANNCBODataSet ds = null;

        String seq = Util.checkString(req.getParameter("seq"));
        
        // DM Setting
        SS_S_ANNCBODM dm = new SS_S_ANNCBODM();

        dm.setSeq(Long.parseLong(seq));

        
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO 객체의 selectSrchList 호출
		ds = dao.selectSrchDtls(dm);
		req.setAttribute("seq", seq);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
		
        /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();

            ds = ejb.selectSrchDtls(dm); // 설정된 dm값으로 EJB를 호출한다.

            req.setAttribute("seq", seq);
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 정보공유-실시간 판매국공지-글쓰기폼
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeAnncsls(HttpServletRequest req, HttpServletResponse res) throws AppException{
        // Request Parameter Processing
        SS_L_NWBUSEOCDDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO 객체의 selectCodeSP 호출
        ds = dao.selectDeptList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectDeptList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 정보공유-실시간 판매국공지-저장(등록)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

	public void insertAnncsls(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_I_ANNCSLSDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        String makepersid = Util.getSessionParameterValue(req, "uid", true);       //등록자 아이디
        String makepersnm = Util.getSessionParameterValue(req, "emp_nm", false);    //등록자 이름
        String posicd = Util.getSessionParameterValue(req, "posicd", false);        //등록자 직책 코드
        String posinm = Util.getSessionParameterValue(req, "posinm", false);        //등록자 직책 이름
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false);    //등록자 판매부서코드
        String deptnm = Util.getSessionParameterValue(req, "selldeptnm", false);    //등록자 판매부서이름

        // Request Parameter Processing
        String rmsgclsf = Util.checkString(req.getParameter("rmsgclsf")); // 수신구분코드
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept")); // 수신부서코드
        String rmsgdeptnm =  Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm"))); //수신부서명
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm")); // 공지시작일자
        String anncendtm = Util.checkString(req.getParameter("anncendtm")); // 공지종료일자
        String annctitl =  Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl"))); // 제목
        String annccont =  Util.Uni2Ksc(Util.checkString(req.getParameter("annccont"))); // 내용

        String tmp = Util.replace(annctitl, "'", "&#39");
        annctitl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(annctitl, "·", "&#183");
        annctitl = tmp;

        String cont_tmp = Util.replace(annccont, "'", "&#39");
        annccont = Util.replace(cont_tmp, "\"", "&#34");
        cont_tmp = Util.replace(annccont, "·", "&#183");
        annccont = cont_tmp;


        // DM Setting
        SS_I_ANNCSLSDM dm = new SS_I_ANNCSLSDM();
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setPosicd(posicd);
        dm.setPosinm(posinm);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setRmsgclsf(rmsgclsf);
        dm.setRmsgdept(rmsgdept);
        dm.setRmsgdeptnm(rmsgdeptnm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setAnnctitl(annctitl);
        dm.setAnnccont(annccont);
        dm.setIncmgpers(makepersid);

        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO 객체의 insertInfoexg 호출
        bResult = dao.insertAnncsls(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
		
		/*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();
            bResult = ejb.insertAnncsls(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
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
