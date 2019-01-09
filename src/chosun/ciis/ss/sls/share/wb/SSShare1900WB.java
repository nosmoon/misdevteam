/***************************************************************************************************
* 파일명 : SSShare1900WB.java
* 기능 : 정보공유-출장보고서 처리를 위한 Work Bean
* 작성일자 : 2003-12-24
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
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * 정보공유-출장보고서 위한 WB
 *
 */

public class SSShare1900WB{

    public int filesize = 5*1024*1024;
    /**
     * 정보공유-출장보고서-조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_OUTRPT_INITDataSet ds = null;

        // Session Processing
        String uid 	= Util.getSessionParameterValue(req, "uid", true);//사용자ID
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", false);//관리부서코드(복수)
        String deptplacyn = Util.getSessionParameterValue(req, "deptplacyn", false);//지국장여부

        // Request Parameter Processing
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // DM Setting
        SS_L_OUTRPT_INITDM dm = new SS_L_OUTRPT_INITDM();
        dm.setUid(uid);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setDeptplacyn(deptplacyn);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1900DAO dao = new SSShare1900DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1900EJBHome home = (SSShare1900EJBHome) JNDIManager.getInstance().getHome("SSShare1900EJB");
        try {
            SSShare1900EJB ejb = home.create();
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
     * 정보공유-출장보고서-검색조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_OUTRPT_SRCHDataSet ds = null;

        // Session Processing
        String uid 	= Util.getSessionParameterValue(req, "uid", true);//사용자ID
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", false);//관리부서코드(복수)
        String deptplacyn = Util.getSessionParameterValue(req, "deptplacyn", false);//지국장여부

        // Request Parameter Processing
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));//부서코드(검색조건)
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // DM Setting
        SS_L_OUTRPT_SRCHDM dm = new SS_L_OUTRPT_SRCHDM();

        dm.setUid(uid);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setDeptplacyn(deptplacyn);
        dm.setSrchdeptcd(srchdeptcd);
        dm.setSearch_word(search_word);
        dm.setSearch_word_kind(search_word_kind);
        dm.setMakedt1(makedt1);
        dm.setMakedt2(makedt2);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        
        SSShare1900DAO dao = new SSShare1900DAO();
		// DAO 객체의 selectSrchList 호출
		ds = dao.selectSrchList(dm);
		req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("srchdeptcd", srchdeptcd);
        req.setAttribute("makedt1", makedt1);
        req.setAttribute("makedt2", makedt2);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
        req.setAttribute("ds", ds);
        
		/*
        SSShare1900EJBHome home = (SSShare1900EJBHome) JNDIManager.getInstance().getHome("SSShare1900EJB");
        try {
            SSShare1900EJB ejb = home.create();
            ds = ejb.selectSrchList(dm);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * 정보공유-출장보고서-글쓰기폼
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeOutrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{
        // Request Parameter Processing
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));//검색조건 부서코드
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        try {
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 정보공유-출장보고서-저장(등록)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertOutrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();

        String tmp = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과
        byte[] filecont = null;

        //파일을 ByteArray에 담고 input name과 imput value를 Hashtable에 저장한다.
        try {
            out = res.getWriter();
            MultipartParser multi = new MultipartParser(req, filesize, true, true);
            Part part = null;
            FilePart filePart = null;
            ParamPart parampart = null;
            String parmName = null;
            String parmValue = null;


            for (int i=0; (part = multi.readNextPart()) != null;i++ ) {

                if (part.isFile()) {
                    filePart = (FilePart) part;
                    //파일을 첨부했을 경우
                    if(filePart.getFileName() != null){
	                    ht.put(part.getName(), filePart.getFileName());

	                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	                    filePart.writeTo(byteArrayOutputStream);
	                    filecont = byteArrayOutputStream.toByteArray();
                    	break;
                    }
                    //파일을 첨부하지 않았을 경우
                    else{
                    	ht.put(part.getName(), "");
                    }
                }
                else if(part.isParam()){
                    parampart = (ParamPart)part;
                    ht.put(part.getName(), parampart.getStringValue());
                }
            }
        } catch (IOException e) {
            throw new AppException("[SSShare1900WB.insertOutrpt()]","[SSShare1900WB.insertOutrpt()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);
        String deptcd    = Util.getSessionParameterValue(req, "selldeptcd", false);
        String deptnm 		= Util.getSessionParameterValue(req, "selldeptnm", false);
        String makepersid 	= Util.getSessionParameterValue(req, "uid", true);
        String makepersnm 	= Util.getSessionParameterValue(req, "emp_nm", false);


        // Request Parameter Processing
        String makedt 		= Util.checkString((String)ht.get("makedt"));
        String outplacfrdt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("outplacfrdt")));
        String outplactodt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("outplactodt")));
        String outplacarea 	= Util.Uni2Ksc(Util.checkString((String)ht.get("outplacarea")));
        String reptcont 	= Util.Uni2Ksc(Util.checkString((String)ht.get("reptcont")));
        String etc 			= Util.Uni2Ksc(Util.checkString((String)ht.get("etc")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));

        // Request Parameter Processing(화면처리)
        String search_word = Util.Uni2Ksc(Util.checkString( (String) ht.get("search_word")));
        String search_word_kind = Util.checkString( (String) ht.get("search_word_kind"));
        String srchdeptcd = Util.checkString( (String) ht.get("srchdeptcd")); //검색조건 부서코드
        String makedt1 = Util.checkString( (String) ht.get("makedt1"));
        String makedt2 = Util.checkString( (String) ht.get("makedt2"));
        String pageno = Util.checkString( (String) ht.get("curr_page_no"));
        String pagesize = Util.checkString( (String) ht.get("records_per_page"));

       // 디비 입력시 특수 문자 처리

        tmp = Util.replace(outplacarea, "'", "&#39");
        outplacarea = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(outplacarea, "·", "&#183");
        outplacarea = tmp;

        tmp = Util.replace(reptcont, "'", "&#39");
        reptcont = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(reptcont, "·", "&#183");
        reptcont = tmp;

        tmp = Util.replace(etc, "'", "&#39");
        etc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etc, "·", "&#183");
        etc = tmp;

        // DM Setting
        SS_I_OUTRPTDM dm = new SS_I_OUTRPTDM();

        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setOutplacfrdt(outplacfrdt);
        dm.setOutplactodt(outplactodt);
        dm.setOutplacarea(outplacarea);
        dm.setReptcont(reptcont);
        dm.setEtc(etc);
        dm.setIncmgpers(incmgpers);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }
        
        SSShare1900DAO dao = new SSShare1900DAO();
		// DAO 객체의 insertOutrpt 호출
        bResult = dao.insertOutrpt(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
         req.setAttribute("search_word", search_word);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("srchdeptcd", srchdeptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         
         /*
        SSShare1900EJBHome home = (SSShare1900EJBHome) JNDIManager.getInstance().getHome("SSShare1900EJB");
        try {
            SSShare1900EJB ejb = home.create();
            bResult = ejb.insertOutrpt(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * 정보공유-출장보고서-수정
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void updateOutrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String tmp = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과
        byte[] filecont = null;         // 파일담을 변수

        //파일을 ByteArray에 담고 input name과 imput value를 Hashtable에 저장한다.
        try {
            out = res.getWriter();
            MultipartParser multi = new MultipartParser(req, filesize, true, true);
            Part part = null;
            FilePart filePart = null;
            ParamPart parampart = null;
            String parmName = null;
            String parmValue = null;


            for (int i=0; (part = multi.readNextPart()) != null;i++ ) {

                if (part.isFile()) {
                    filePart = (FilePart) part;
                    //파일을 첨부했을 경우
                    if(filePart.getFileName() != null){
	                    ht.put(part.getName(), filePart.getFileName());

	                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	                    filePart.writeTo(byteArrayOutputStream);
	                    filecont = byteArrayOutputStream.toByteArray();
                    	break;
                    }
                    //파일을 첨부하지 않았을 경우
                    else{
                    	ht.put(part.getName(), "");
                    }
                }
                else if(part.isParam()){
                    parampart = (ParamPart)part;
                    ht.put(part.getName(), parampart.getStringValue());
                }
            }
        } catch (IOException e) {
            throw new AppException("[SSShare1900WB.updateOutrpt()]","[SSShare1900WB.updateOutrpt()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String makedt 		= Util.checkString((String)ht.get("makedt"));
        String makepersid 	= Util.checkString((String)ht.get("makepersid"));
        String makepersnm 	= Util.Uni2Ksc(Util.checkString((String)ht.get("makepersnm")));
        String outplacfrdt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("outplacfrdt")));
        String outplactodt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("outplactodt")));
        String outplacarea 	= Util.Uni2Ksc(Util.checkString((String)ht.get("outplacarea")));
        String reptcont 	= Util.Uni2Ksc(Util.checkString((String)ht.get("reptcont")));
        String etc 			= Util.Uni2Ksc(Util.checkString((String)ht.get("etc")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));

        // 본인 체크
        String uid = Util.getSessionParameterValue(req, "uid", true); //사용자ID
        if (!makepersid.equals(uid)) {
            throw new AppException("[SSShare1900WB.updateOutrpt()]", "[SSShare1900WB.updateOutrpt()] 수정권한이 없습니다.");
        }

        // Request Parameter Processing(화면처리)
        String search_word =  Util.Uni2Ksc(Util.checkString((String)ht.get("search_word")));
        String search_word_kind = Util.checkString((String)ht.get("search_word_kind"));
        String srchdeptcd = Util.checkString((String)ht.get("srchdeptcd"));//검색조건 부서코드
        String makedt1 = Util.checkString((String)ht.get("makedt1"));
        String makedt2 = Util.checkString((String)ht.get("makedt2"));
        String pageno = Util.checkString((String)ht.get("curr_page_no"));
        String pagesize = Util.checkString((String)ht.get("records_per_page"));
        String brwscnt 		= Util.checkString((String)ht.get("brwscnt"));

        // 디비 입력시 특수 문자 처리

        tmp = Util.replace(outplacarea, "'", "&#39");
        outplacarea = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(outplacarea, "·", "&#183");
        outplacarea = tmp;

        tmp = Util.replace(reptcont, "'", "&#39");
        reptcont = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(reptcont, "·", "&#183");
        reptcont = tmp;

        tmp = Util.replace(etc, "'", "&#39");
        etc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etc, "·", "&#183");
        etc = tmp;

        // DM Setting
        SS_U_OUTRPTDM dm = new SS_U_OUTRPTDM();

        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        dm.setOutplacfrdt(outplacfrdt);
        dm.setOutplactodt(outplactodt);
        dm.setOutplacarea(outplacarea);
        dm.setReptcont(reptcont);
        dm.setEtc(etc);
        dm.setChgpers(incmgpers);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1900DAO dao = new SSShare1900DAO();
		// DAO 객체의 updateOutrpt 호출
        bResult = dao.updateOutrpt(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         // 수정 후 상세조회시 사용
         req.setAttribute("makedt", makedt);
         req.setAttribute("makepersid", makepersid);

         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("srchdeptcd", srchdeptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         req.setAttribute("brwscnt", brwscnt);
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
		
        /*
         SSShare1900EJBHome home = (SSShare1900EJBHome) JNDIManager.getInstance().getHome("SSShare1900EJB");
        try {
            SSShare1900EJB ejb = home.create();
            bResult = ejb.updateOutrpt(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            // 수정 후 상세조회시 사용
            req.setAttribute("makedt", makedt);
            req.setAttribute("makepersid", makepersid);

            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
            req.setAttribute("brwscnt", brwscnt);
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
     * 정보공유-출장보고서-삭제
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteOutrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_D_OUTRPTDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값
        // Request Parameter Processing
        String makedt = Util.checkString(req.getParameter("makedt"));
        String makepersid = Util.checkString(req.getParameter("makepersid"));

        // Request Parameter Processing(화면처리)
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));

        // 본인 체크
       String uid = Util.getSessionParameterValue(req, "uid", true); //사용자ID
       if (!makepersid.equals(uid)) {
           throw new AppException("[SSShare1900WB.deleteOutrpt()]", "[SSShare1900WB.deleteOutrpt()] 삭제권한이 없습니다.");
       }

        // DM Setting
        SS_D_OUTRPTDM dm = new SS_D_OUTRPTDM();

        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);

        SSShare1900DAO dao = new SSShare1900DAO();
		// DAO 객체의 deleteOutrpt 호출
        bResult = dao.deleteOutrpt(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("srchdeptcd", srchdeptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
         /*
        SSShare1900EJBHome home = (SSShare1900EJBHome) JNDIManager.getInstance().getHome("SSShare1900EJB");
        try {
            SSShare1900EJB ejb = home.create();
            bResult = ejb.deleteOutrpt(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * 정보공유-출장보고서-상세보기
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectOutrptDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_OUTRPTDataSet ds = null;
        // Request Parameter Processing
        String makedt = Util.checkString(req.getParameter("makedt"));
        String makepersid = Util.checkString(req.getParameter("makepersid"));

        // Request Parameter Processing(화면처리)
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));//검색조건 부서코드
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));

        // DM Setting
        SS_S_OUTRPTDM dm = new SS_S_OUTRPTDM();
        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        if (!brwscnt.equals("")){
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }
        
        SSShare1900DAO dao = new SSShare1900DAO();
		// DAO 객체의 selectOutrptDetail 호출
		ds = dao.selectOutrptDetail(dm);
		req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("srchdeptcd", srchdeptcd);
        req.setAttribute("makedt1", makedt1);
        req.setAttribute("makedt2", makedt2);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
		/*
        SSShare1900EJBHome home = (SSShare1900EJBHome) JNDIManager.getInstance().getHome("SSShare1900EJB");
        try {
            SSShare1900EJB ejb = home.create();
            ds = ejb.selectOutrptDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * 정보공유-출장보고서-다운로드
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void dwloadOutrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_OUTRPT_DWLOADDataSet ds = null;
        // Request Parameter Processing
        String makedt = Util.checkString(req.getParameter("makedt"));
        String makepersid = Util.checkString(req.getParameter("makepersid"));
        String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));

        // DM Setting
        SS_S_OUTRPT_DWLOADDM dm = new SS_S_OUTRPT_DWLOADDM();
        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        if (!dwloadcnt.equals("")){
            dm.setDwloadcnt(Long.parseLong(dwloadcnt));
        }
        
        SSShare1900DAO dao = new SSShare1900DAO();
		// DAO 객체의 dwloadOutrpt 호출
		ds = dao.dwloadOutrpt(dm);
		req.setAttribute("filecont", ds.filecont); // request에 결과값을 담는다.
        req.setAttribute("filenm", ds.filenm); // request에 결과값을 담는다.
		
        /*
        SSShare1900EJBHome home = (SSShare1900EJBHome) JNDIManager.getInstance().getHome("SSShare1900EJB");
        try {
            SSShare1900EJB ejb = home.create();
            ds = ejb.dwloadOutrpt(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("filecont", ds.filecont); // request에 결과값을 담는다.
            req.setAttribute("filenm", ds.filenm); // request에 결과값을 담는다.
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

/* 작성시간 : Tue Nov 18 11:50:05 KST 2003 */