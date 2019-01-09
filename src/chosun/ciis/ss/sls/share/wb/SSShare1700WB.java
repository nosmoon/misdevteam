/***************************************************************************************************
* 파일명 : SSShare1700WB.java
* 기능 : 정보공유-게시판 기사평 처리를 위한 Work Bean
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
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * 정보공유-게시판 기사평 위한 WB
 *
 */

public class SSShare1700WB{

	public int filesize = 5*1024*1024;

    /**
     * 정보공유-게시판 기사평-초기화면(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_INFOEXG_INITDataSet ds = null;

        String clsf = "5";    //게시판구분 기사평

        // Session Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//입력자아이디
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", true);         //판매부서코드(소속)
        //신문고,기사평은 관리부서코드(복수),관리지역코드(복수)를 이용하여 조회한다.
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", true);  //관리부서코드(복수)
        String sb_areacd = Util.getSessionParameterValue(req, "areacd", true);  //관리지역코드(복수)

        // Request Parameter Processing
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // DM Setting
        SS_L_INFOEXG_INITDM dm = new SS_L_INFOEXG_INITDM();
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);
        dm.setUid(incmgpers);
        dm.setDeptcd(deptcd);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setSb_areacd(sb_areacd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
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
     * 정보공유-게시판 기사평-조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_INFOEXG_SRCHDataSet ds = null;

        String clsf = "5";    //게시판구분 기사평

        // Session Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//입력자아이디
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", true);         //판매부서코드(소속)
        //신문고,기사평은 관리부서코드(복수),관리지역코드(복수)를 이용하여 조회한다.
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", true);  //관리부서코드(복수)
        String sb_areacd = Util.getSessionParameterValue(req, "areacd", true);  //관리지역코드(복수)

        // Request Parameter Processing
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //수신부서선택
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //수신지역선택
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // DM Setting
        SS_L_INFOEXG_SRCHDM dm = new SS_L_INFOEXG_SRCHDM();
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);
        dm.setUid(incmgpers);
        dm.setDeptcd(deptcd);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setSb_areacd(sb_areacd);
        dm.setRmsgdept(rmsgdept);
        dm.setSearch_word(search_word);
        dm.setSearch_word_kind(search_word_kind);
        dm.setRmsgarea(rmsgarea);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 selectSrchList 호출
		ds = dao.selectSrchList(dm);
		req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("rmsgdept", rmsgdept);
        req.setAttribute("rmsgarea", rmsgarea);
        req.setAttribute("pageno", pageno);
        req.setAttribute("pagesize", pagesize);
        req.setAttribute("ds", ds);
		
        /*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            ds = ejb.selectSrchList(dm);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
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
     * 정보공유-게시판 기사평-글쓰기폼
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{

        String clsf = "5";    //게시판구분 기사평

        // Request Parameter Processing
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //수신부서선택
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //수신지역선택
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        try {
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 정보공유-게시판 기사평-답변쓰기폼
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void answerInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{

        String clsf = "5";    //게시판구분 기사평

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String answergrp = Util.checkString(req.getParameter("answergrp"));
        String answerseq = Util.checkString(req.getParameter("answerseq"));
        String answerlevl = Util.checkString(req.getParameter("answerlevl"));
        String rmsgdept_param = Util.checkString(req.getParameter("rmsgdept_param"));     // 수신부서 조건 param
        String rmsgarea_param = Util.checkString(req.getParameter("rmsgarea_param"));     // 수신부서 조건 param
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }
        String titl =  Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));

        try {
        	req.setAttribute("seq", seq);
        	req.setAttribute("answergrp", answergrp);
        	req.setAttribute("answerseq", answerseq);
        	req.setAttribute("answerlevl", answerlevl);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgdept_param", rmsgdept_param);
            req.setAttribute("rmsgarea_param", rmsgarea_param);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
            req.setAttribute("titl", titl);
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 정보공유-게시판 기사평-저장(등록)
     * 판매국은 사용하지 않음.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String notifrdt = null;    //게시시작일자 (공지사항에서만 사용)
        String notitodt = null;    //게시종료일자 (공지사항에서만 사용)
        String answergrp = null;   //답변그룹 (판매국,이슈,신문고,기사평에서만 사용)
        String answerseq = null;   //답변순번 (판매국,이슈,신문고,기사평에서만 사용)
        String answerlevl = null;  //답변레벨 (판매국,이슈,신문고,기사평에서만 사용)
        String tmp = null;
        String cont1 = null;
        String cont2 = null;
        String cont3 = null;
        String cont4 = null;
        String cont5 = null;

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
            throw new AppException("[SSShare1700WB.insertInfoexg()]","[SSShare1700WB.insertInfoexg()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String makepersid 	= Util.getSessionParameterValue(req, "uid", true);//사용자ID
        String makepersnm 	= Util.getSessionParameterValue(req, "emp_nm", false);//사용자명
        String bocd    = Util.getSessionParameterValue(req, "bocd", false);     // 지국지사코드

       // Request Parameter Processing
        String clsf 	        = Util.checkString((String)ht.get("clsf"));
        if(clsf.equals("1")){
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }else if(clsf.equals("2") || clsf.equals("3") || clsf.equals("4") || clsf.equals("5")){
            answerseq = "0";
            answerlevl = "0";
        }
        String email 		= Util.checkString((String)ht.get("email"));
        String hmpg 		= Util.checkString((String)ht.get("hmpg"));
        String titl 		= Util.Uni2Ksc(Util.checkString((String)ht.get("titl")));
        String cont 		= Util.Uni2Ksc(Util.checkString((String)ht.get("cont")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));

        // 디비 입력시 특수 문자 처리

        tmp = Util.replace(titl, "'", "&#39");
        titl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(titl, "·", "&#183");
        titl = tmp;

        // 내용 체크 시작
        if(!cont.equals("")){
            String cont_tmp = cont;
            String[] contents = new String[5];
            int k=0;

            cont = Util.replace(cont_tmp, "'", "&#39");
            cont_tmp = Util.replace(cont, "\"", "&#34");
            cont = Util.replace(cont_tmp, "·", "&#183");
            cont_tmp = cont;

            for( k=0; cont_tmp.length() > 2000 && k < 5; k++){
                contents[k] = cont_tmp.substring(0, 2000);
                cont_tmp = cont_tmp.substring(2000);
            }

            // 내용이 2000바이트보다 작을경우
            if(cont_tmp.length() > 0 && k == 0){
                cont1 = cont_tmp;
                cont2 = "";
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	내용이 2000 크고 4000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 1){
                cont1 = contents[0];
                cont2 = cont_tmp;
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	내용이 4000 크고 6000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 2){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = cont_tmp;
                cont4 = "";
                cont5 = "";
            }
            //	내용이 6000 크고 8000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 3){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = cont_tmp;
                cont5 = "";
            }
            // 내용이 8000 크고 10000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 4){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = cont_tmp;
            }
            //	내용이 10000바이트보다 클경우 10000바이트 이상은 지우고 저장
            else if(cont_tmp.length() > 0 && k == 5){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = contents[4];
            }
        }
        // 내용을 입력하지 않았을 경우
        else{
            cont1 = "";
            cont2 = "";
            cont3 = "";
            cont4 = "";
            cont5 = "";
        }
        // 내용 체크 끝

        // DM Setting
        SS_I_INFOEXGDM dm = new SS_I_INFOEXGDM();

        dm.setClsf(clsf);
        if(clsf.equals("1")){
            dm.setNotifrdt(notifrdt);
            dm.setNotitodt(notitodt);
        }else if(clsf.equals("2") || clsf.equals("3") || clsf.equals("4") || clsf.equals("5")){
            dm.setAnswerseq(Long.parseLong(answerseq));
            dm.setAnswerlevl(Long.parseLong(answerlevl));
        }
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setEmail(email);
        dm.setHmpg(hmpg);
        dm.setTitl(titl);
        dm.setCont1(cont1);
        dm.setCont2(cont2);
        dm.setCont3(cont3);
        dm.setCont4(cont4);
        dm.setCont5(cont5);
        dm.setDeptcd(bocd);// 지국지사코드
        dm.setIncmgpers(makepersid);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 insertInfoexg 호출
        bResult = dao.insertInfoexg(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
         
         /*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            bResult = ejb.insertInfoexg(dm);
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
     * 정보공유-게시판 기사평-수정
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void updateInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String notifrdt = null;    //게시시작일자 (공지사항에서만 사용)
        String notitodt = null;    //게시종료일자 (공지사항에서만 사용)
        String tmp = null;
        String cont1 = null;
        String cont2 = null;
        String cont3 = null;
        String cont4 = null;
        String cont5 = null;

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
            throw new AppException("[SSShare1700WB.updateInfoexg()]","[SSShare1700WB.updateInfoexg()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String makepersid 	= Util.getSessionParameterValue(req, "uid", true);//사용자ID
        String makepersnm 	= Util.getSessionParameterValue(req, "emp_nm", false);//사용자명
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String clsf 	        = Util.checkString((String)ht.get("clsf"));
        if(clsf.equals("1")){
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }
        String email 		= Util.checkString((String)ht.get("email"));
        String hmpg 		= Util.checkString((String)ht.get("hmpg"));
        String titl 		= Util.Uni2Ksc(Util.checkString((String)ht.get("titl")));
        String cont 		= Util.Uni2Ksc(Util.checkString((String)ht.get("cont")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));
        String seq 				= Util.Uni2Ksc(Util.checkString((String)ht.get("seq")));
        String search_word 		= Util.Uni2Ksc(Util.checkString((String)ht.get("search_word")));
        String search_word_kind = Util.Uni2Ksc(Util.checkString((String)ht.get("search_word_kind")));
        String rmsgdept_param 	= Util.checkString((String)ht.get("rmsgdept_param")); //수신부서 param
        String rmsgarea_param 	= Util.checkString((String)ht.get("rmsgarea_param")); //수신지역 param
        String pageno 			= Util.Uni2Ksc(Util.checkString((String)ht.get("pageno")));
        String pagesize 		= Util.Uni2Ksc(Util.checkString((String)ht.get("pagesize")));
        String brwscnt 			= Util.checkString((String)ht.get("brwscnt"));


        // 디비 입력시 특수 문자 처리

        tmp = Util.replace(titl, "'", "&#39");
        titl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(titl, "·", "&#183");
        titl = tmp;

        // 내용 체크 시작
        if(!cont.equals("")){
            String cont_tmp = cont;
            String[] contents = new String[5];
            int k=0;

            cont = Util.replace(cont_tmp, "'", "&#39");
            cont_tmp = Util.replace(cont, "\"", "&#34");
            cont = Util.replace(cont_tmp, "·", "&#183");
            cont_tmp = cont;

            for( k=0; cont_tmp.length() > 2000 && k < 5; k++){
                contents[k] = cont_tmp.substring(0, 2000);
                cont_tmp = cont_tmp.substring(2000);
            }

            // 내용이 2000바이트보다 작을경우
            if(cont_tmp.length() > 0 && k == 0){
                cont1 = cont_tmp;
                cont2 = "";
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	내용이 2000 크고 4000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 1){
                cont1 = contents[0];
                cont2 = cont_tmp;
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	내용이 4000 크고 6000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 2){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = cont_tmp;
                cont4 = "";
                cont5 = "";
            }
            //	내용이 6000 크고 8000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 3){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = cont_tmp;
                cont5 = "";
            }
            // 내용이 8000 크고 10000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 4){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = cont_tmp;
            }
            //	내용이 10000바이트보다 클경우 10000바이트 이상은 지우고 저장
            else if(cont_tmp.length() > 0 && k == 5){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = contents[4];
            }
        }
        // 내용을 입력하지 않았을 경우
        else{
            cont1 = "";
            cont2 = "";
            cont3 = "";
            cont4 = "";
            cont5 = "";
        }
        // 내용 체크 끝

        // DM Setting
        SS_U_INFOEXGDM dm = new SS_U_INFOEXGDM();

        dm.setClsf(clsf);
        if(clsf.equals("1")){
            dm.setNotifrdt(notifrdt);
            dm.setNotitodt(notitodt);
        }
        dm.setSeq(Long.parseLong(seq));
        dm.setEmail(email);
        dm.setHmpg(hmpg);
        dm.setTitl(titl);
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setCont1(cont1);
        dm.setCont2(cont2);
        dm.setCont3(cont3);
        dm.setCont4(cont4);
        dm.setCont5(cont5);
        dm.setChgpers(incmgpers);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 updateInfoexg 호출
        bResult = dao.updateInfoexg(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("seq", seq);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("rmsgdept", rmsgdept_param);
         req.setAttribute("rmsgarea", rmsgarea_param);
         req.setAttribute("pageno", pageno);
         req.setAttribute("pagesize", pagesize);
         req.setAttribute("brwscnt", brwscnt);
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
		/*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            bResult = ejb.updateInfoexg(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("seq", seq);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);
            req.setAttribute("rmsgdept", rmsgdept_param);
            req.setAttribute("rmsgarea", rmsgarea_param);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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
     * 정보공유-게시판 기사평-삭제
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_D_INFOEXGDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //수신부서선택
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //수신지역선택
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_D_INFOEXGDM dm = new SS_D_INFOEXGDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        dm.setIncmgpers(incmgpers);

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 deleteInfoexg 호출
        bResult = dao.deleteInfoexg(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("search_word", search_word);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("rmsgdept", rmsgdept);
         req.setAttribute("rmsgarea", rmsgarea);
         req.setAttribute("pageno", pageno);
         req.setAttribute("pagesize", pagesize);
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
        
         /*
         SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            bResult = ejb.deleteInfoexg(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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
     * 정보공유-게시판 기사평-상세보기
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInfoexgDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_INFOEXGDataSet ds = null;

        String clsf = "5";    //게시판구분 기사평

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //수신부서선택
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //수신지역선택
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));

        // DM Setting
        SS_S_INFOEXGDM dm = new SS_S_INFOEXGDM();
        dm.setClsf(clsf);
        dm.setSeq(Long.parseLong(seq));
        if (!brwscnt.equals("")){
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 selectInfoexgDetail 호출
		ds = dao.selectInfoexgDetail(dm);
		req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("rmsgdept", rmsgdept);
        req.setAttribute("rmsgarea", rmsgarea);
        req.setAttribute("pageno", pageno);
        req.setAttribute("pagesize", pagesize);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
		/*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            ds = ejb.selectInfoexgDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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
     * 정보공유-게시판 기사평-답변(등록)
     * 판매국은 사용하지 않음.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertAnswerInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String notifrdt = null;    //게시시작일자 (공지사항에서만 사용)
        String notitodt = null;    //게시종료일자 (공지사항에서만 사용)
        String answergrp = null;   //답변그룹 (판매국,이슈,신문고,기사평에서만 사용)
        String answerseq = null;   //답변순번 (판매국,이슈,신문고,기사평에서만 사용)
        String answerlevl = null;  //답변레벨 (판매국,이슈,신문고,기사평에서만 사용)
        String tmp = null;
        String cont1 = null;
        String cont2 = null;
        String cont3 = null;
        String cont4 = null;
        String cont5 = null;

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
            throw new AppException("[SSShare1700WB.insertAnswerInfoexg()]","[SSShare1700WB.insertAnswerInfoexg()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String deptcd 		= Util.getSessionParameterValue(req, "selldeptcd", false);//판매부서코드
        String deptnm 		= Util.getSessionParameterValue(req, "selldeptnm", false);//판매부서명
        String makepersid 	= Util.getSessionParameterValue(req, "uid", true);//사용자ID
        String makepersnm 	= Util.getSessionParameterValue(req, "emp_nm", false);//사용자명
        String bocd    = Util.getSessionParameterValue(req, "bocd", false);     // 지국지사코드

       // Request Parameter Processing
        String clsf 	        = Util.checkString((String)ht.get("clsf"));
        String seq = Util.checkString((String)ht.get("seq"));//모글의 seq
        if(clsf.equals("1")){
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }
        answergrp 		= Util.checkString((String)ht.get("answergrp"));
        answerseq 		= Util.checkString((String)ht.get("answerseq"));
        answerlevl 		= Util.checkString((String)ht.get("answerlevl"));
        String email 		= Util.checkString((String)ht.get("email"));
        String hmpg 		= Util.checkString((String)ht.get("hmpg"));
        String titl 		= Util.Uni2Ksc(Util.checkString((String)ht.get("titl")));
        String cont 		= Util.Uni2Ksc(Util.checkString((String)ht.get("cont")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));
        String rmsgdept_param 	= Util.checkString((String)ht.get("rmsgdept_param")); //수신부서 param
        String rmsgarea_param 	= Util.checkString((String)ht.get("rmsgarea_param")); //수신지역 param
        String pageno 			= Util.Uni2Ksc(Util.checkString((String)ht.get("pageno")));
        String pagesize 		= Util.Uni2Ksc(Util.checkString((String)ht.get("pagesize")));
        String search_word 		= Util.Uni2Ksc(Util.checkString((String)ht.get("search_word")));
        String search_word_kind = Util.Uni2Ksc(Util.checkString((String)ht.get("search_word_kind")));


        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // 디비 입력시 특수 문자 처리

        tmp = Util.replace(titl, "'", "&#39");
        titl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(titl, "·", "&#183");
        titl = tmp;

        // 내용 체크 시작
        if(!cont.equals("")){
            String cont_tmp = cont;
            String[] contents = new String[5];
            int k=0;

            cont = Util.replace(cont_tmp, "'", "&#39");
            cont_tmp = Util.replace(cont, "\"", "&#34");
            cont = Util.replace(cont_tmp, "·", "&#183");
            cont_tmp = cont;

            for( k=0; cont_tmp.length() > 2000 && k < 5; k++){
                contents[k] = cont_tmp.substring(0, 2000);
                cont_tmp = cont_tmp.substring(2000);
            }

            // 내용이 2000바이트보다 작을경우
            if(cont_tmp.length() > 0 && k == 0){
                cont1 = cont_tmp;
                cont2 = "";
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	내용이 2000 크고 4000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 1){
                cont1 = contents[0];
                cont2 = cont_tmp;
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	내용이 4000 크고 6000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 2){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = cont_tmp;
                cont4 = "";
                cont5 = "";
            }
            //	내용이 6000 크고 8000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 3){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = cont_tmp;
                cont5 = "";
            }
            // 내용이 8000 크고 10000바이트보다 작을 경우
            else if(cont_tmp.length() > 0 && k == 4){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = cont_tmp;
            }
            //	내용이 10000바이트보다 클경우 10000바이트 이상은 지우고 저장
            else if(cont_tmp.length() > 0 && k == 5){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = contents[4];
            }
        }
        // 내용을 입력하지 않았을 경우
        else{
            cont1 = "";
            cont2 = "";
            cont3 = "";
            cont4 = "";
            cont5 = "";
        }
        // 내용 체크 끝

        // DM Setting
        SS_I_INFOEXG_ANSWERDM dm = new SS_I_INFOEXG_ANSWERDM();

        dm.setClsf(clsf);
        dm.setSeq(seq); //모글의 seq
        if(clsf.equals("1")){
            dm.setNotifrdt(notifrdt);
            dm.setNotitodt(notitodt);
        }else if(clsf.equals("2") || clsf.equals("3") || clsf.equals("4") || clsf.equals("5")){
            dm.setAnswergrp(Long.parseLong(answergrp));
            dm.setAnswerseq(Long.parseLong(answerseq));
            dm.setAnswerlevl(Long.parseLong(answerlevl));
        }
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setEmail(email);
        dm.setHmpg(hmpg);
        dm.setTitl(titl);
        dm.setCont1(cont1);
        dm.setCont2(cont2);
        dm.setCont3(cont3);
        dm.setCont4(cont4);
        dm.setCont5(cont5);
        dm.setDeptcd(bocd);//지국지사코드
        dm.setIncmgpers(makepersid);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 insertInfoexg 호출
        bResult = dao.insertAnswerInfoexg(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);	//수신부서 param
         req.setAttribute("rmsgdept", rmsgdept_param);	//수신지역 param
         req.setAttribute("rmsgarea", rmsgarea_param);
         req.setAttribute("pageno", pageno);
         req.setAttribute("pagesize", pagesize);
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
		/*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            bResult = ejb.insertAnswerInfoexg(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);	//수신부서 param
            req.setAttribute("rmsgdept", rmsgdept_param);	//수신지역 param
            req.setAttribute("rmsgarea", rmsgarea_param);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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
     * 정보공유-게시판 공지사항-다운로드
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void dwloadInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_INFOEXG_DWLOADDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));

        // DM Setting
        SS_S_INFOEXG_DWLOADDM dm = new SS_S_INFOEXG_DWLOADDM();
        dm.setSeq(Long.parseLong(seq));
        if (!dwloadcnt.equals("")){
            dm.setDwloadcnt(Long.parseLong(dwloadcnt));
        }
        
        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 dwloadInfoexg 호출
		ds = dao.dwloadInfoexg(dm);
		req.setAttribute("filecont", ds.filecont); // request에 결과값을 담는다.
        req.setAttribute("filenm", ds.filenm); // request에 결과값을 담는다.
		
        /*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            ds = ejb.dwloadInfoexg(dm); // 설정된 dm값으로 EJB를 호출한다.
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

    /**
     * 정보공유-게시판 기사평-추천
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void recomInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_U_INFOEXG_RECOMDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //수신부서선택
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //수신지역선택
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String brwscnt 	= Util.checkString(req.getParameter("brwscnt"));
        String recomcnt = Util.checkString(req.getParameter("recomcnt"));

        // DM Setting
        SS_U_INFOEXG_RECOMDM dm = new SS_U_INFOEXG_RECOMDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        dm.setIncmgpers(incmgpers);
        if (!recomcnt.equals("")){
            dm.setRecomcnt(Long.parseLong(recomcnt));
        }

        SSShare1700DAO dao = new SSShare1700DAO();
		// DAO 객체의 recomInfoexg 호출
        bResult = dao.recomInfoexg(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("seq", seq);
         req.setAttribute("search_word", search_word);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("rmsgdept", rmsgdept);
         req.setAttribute("rmsgarea", rmsgarea);
         req.setAttribute("pageno", pageno);
         req.setAttribute("pagesize", pagesize);
         req.setAttribute("brwscnt", brwscnt);
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
		
         /*
        SSShare1700EJBHome home = (SSShare1700EJBHome) JNDIManager.getInstance().getHome("SSShare1700EJB");
        try {
            SSShare1700EJB ejb = home.create();
            bResult = ejb.recomInfoexg(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("seq", seq);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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

}

/* 작성시간 : Tue Nov 18 11:50:05 KST 2003 */