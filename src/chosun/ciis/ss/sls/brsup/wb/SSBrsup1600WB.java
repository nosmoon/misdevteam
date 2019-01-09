/***************************************************************************************************
 * 파일명 : SSBrsup1600WB.java
 * 기능 : 지국지원-빌링-지로EDI수납관리를 위한 Worker Bean
 * 작성일자 : 2004-02-23
 * 작성자 : 김상열
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;

import java.rmi.*;
import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

//2007.02.27 이혁 추가
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * 지국지원-빌링-지로EDI수납관리를 위한 Worker Bean
 */

public class SSBrsup1600WB {

    public int filesize = 200*1024*1024;  // 최대 파일 크기 20M

    /**
     * 지국지원-빌링-지로EDI수납관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEDIInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EDI_INITDataSet ds = null;

        // DM Setting
        SS_L_EDI_INITDM dm = new SS_L_EDI_INITDM();
        
        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.selectEDIInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.selectEDIInit(dm);
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
     * 지국지원-빌링-지로EDI수납관리-수납결과 현황 목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEDIRecp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EDI_RECPDataSet ds = null;

        // DM Setting
        SS_L_EDI_RECPDM dm = new SS_L_EDI_RECPDM();

        String acqdt = Util.checkString(req.getParameter("acqdt"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String girono = Util.checkString(req.getParameter("girono"));
        String rcpmrflendyn = Util.checkString(req.getParameter("rcpmrflendyn"));
        long pageno = Long.parseLong(Util.checkString(req.getParameter("pageno")));
        long pagesize = Long.parseLong(Util.checkString(req.getParameter("pagesize")));

        dm.setAcqdt(acqdt);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setGirono(girono);
        dm.setRcpmrflendyn(rcpmrflendyn);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.selectEDIRecp(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.selectEDIRecp(dm);
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
     * 지국지원-빌링-지로EDI수납관리-지로EDI 수납결과 목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRecpCatl(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EDI_RECP_CATLDataSet ds = null;

        // DM Setting
        SS_L_EDI_RECP_CATLDM dm = new SS_L_EDI_RECP_CATLDM();

        String f_acqdt = Util.checkString(req.getParameter("f_acqdt"));
        String t_acqdt = Util.checkString(req.getParameter("t_acqdt"));
        String girono = Util.checkString(req.getParameter("girono"));
        long pageno = Long.parseLong(Util.checkString(req.getParameter("pageno")));
        long pagesize = Long.parseLong(Util.checkString(req.getParameter("pagesize")));

        dm.setF_acqdt(f_acqdt);
        dm.setT_acqdt(t_acqdt);
        dm.setGirono(girono);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.selectRecpCatl(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.selectRecpCatl(dm);
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
     * 지국지원-빌링-지로EDI수납관리-지로EDI 입금처리결과 목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRcpmCatl(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_GIRORECPDataSet ds = null;

        // DM Setting
        SS_L_GIRORECPDM dm = new SS_L_GIRORECPDM();

        String acqdt = Util.checkString(req.getParameter("acqdt"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String recpclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("recpclsf")));

        dm.setAcqdt(acqdt);
        dm.setBocd(bocd);
        dm.setRecpclsf(recpclsf);
        
        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.selectRcpmCatl(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.selectRcpmCatl(dm);
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
     * 지국지원-빌링-지로EDI수납관리-지로EDI Reject목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRejectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EDI_RECP_RJCTDataSet ds = null;

        // DM Setting
        SS_L_EDI_RECP_RJCTDM dm = new SS_L_EDI_RECP_RJCTDM();

        String f_acqdt = Util.checkString(req.getParameter("f_acqdt"));
        String t_acqdt = Util.checkString(req.getParameter("t_acqdt"));
        String girono = Util.checkString(req.getParameter("girono"));

        dm.setF_acqdt(f_acqdt);
        dm.setT_acqdt(t_acqdt);
        dm.setGirono(girono);

        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.selectRejectList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.selectRejectList(dm);
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
     * 지국지원-빌링-지로EDI수납관리-지로EDI Reject보정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateEDIReject(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_EDI_RECP_RJCTDataSet ds = null;

        // DM Setting
        SS_U_EDI_RECP_RJCTDM dm = new SS_U_EDI_RECP_RJCTDM();
/*
        String[] rdr_no       = req.getParameterValues("rdr_no");
        String[] sys_flag     = req.getParameterValues("sys_flag");
        String[] medicd       = req.getParameterValues("medicd");
        String[] bgn_mm       = req.getParameterValues("bgn_mm");
        String[] mms          = req.getParameterValues("mms");
        String[] check_digit  = req.getParameterValues("check_digit");
*/
        String[] custbrwsnoArr = req.getParameterValues("custbrwsno");
        String custbrwsno = "";

        for(int i=0; i<custbrwsnoArr.length; i++) {
            custbrwsno = custbrwsno + "##" + custbrwsnoArr[i];
        }
        custbrwsno = custbrwsno.substring(2);

        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);              // 입력자
        String acqdt        = Util.getConcatString(req.getParameterValues("acqdt"), "##");  // 수취일자
        String acqno        = Util.getConcatString(req.getParameterValues("acqno"), "##");  // 수취번호
        String girono       = Util.getConcatString(req.getParameterValues("girono"), "##"); // 지로번호
        String seq          = Util.getConcatString(req.getParameterValues("seq"), "##");    // 일련번호

        dm.setIncmgpers(incmgpers);
        dm.setAcqdt(acqdt);
        dm.setAcqno(acqno);
        dm.setGirono(girono);
        dm.setSeq(seq);
        dm.setCustbrwsno(custbrwsno);
        
        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.updateEDIReject(dm);
        req.setAttribute("ds", ds);

        /*SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.updateEDIReject(dm);
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
     * 지국지원-빌링-지로EDI수납관리-지로EDI 데이터수신
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectGiroRecp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_BATCH_GIRORECPDataSet ds = null;

        // DM Setting
        SS_A_BATCH_GIRORECPDM dm = new SS_A_BATCH_GIRORECPDM();

        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);              // 입력자

        dm.setIncmgpers(incmgpers);
        
        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.selectGiroRecp(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.selectGiroRecp(dm);
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
     * 지국지원-빌링-지로EDI수납관리-지로EDI 입금반영
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateRcpmrfl(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_BATCH_RCPMRFLDataSet ds = null;

        // DM Setting
        SS_A_BATCH_RCPMRFLDM dm = new SS_A_BATCH_RCPMRFLDM();

        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);              // 입력자
        String basedt		= Util.checkString(req.getParameter("acqdt"));					// 기준일자

        dm.setIncmgpers(incmgpers);
        dm.setBasedt(basedt);
        
        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 initRcpcmsbs 호출
        ds = dao.updateRcpmrfl(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try{
            SSBrsup1600EJB ejb = home.create();
            ds = ejb.updateRcpmrfl(dm);
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



    public void loadEDIfile(HttpServletRequest req, HttpServletResponse res) throws AppException{

         String header_data = "";
         String body_data = "";
         String trail_data = "";

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

         try {

             out = res.getWriter();
             MultipartParser multi = new MultipartParser(req, filesize, true, true);
             Part part = null;
             FilePart filepart = null;
             ParamPart parampart = null;
             String parmName = null;
             String parmValue = null;

             String str;
             String dataclsf;
             StringBuffer sbuff,sbuff2;
             int nStart, nEnd, nLength;
             int nReadMax = 122;

             for (int i=0; (part = multi.readNextPart()) != null; i++ ) {

                 if (part.isFile()) {

                     filepart = (FilePart) part;

                     //파일을 첨부했을 경우
                     if(filepart.getFileName() != null){
                         ht.put(part.getName(), filepart.getFileName());
                         ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                         filepart.writeTo(byteArrayOutputStream);
                         filecont = byteArrayOutputStream.toByteArray();

                         if( filecont != null ) {
                             System.out.println( "==========" );
//                             System.out.println( filecont.toString() );
                             System.out.println( "==========" );
//                             System.out.println( byteArrayOutputStream.toString().substring(10,1000) );
                             System.out.println( "==========" );
                         }
                     }
                     //파일을 첨부하지 않았을 경우
                     else{
                         ht.put(part.getName(), "");
                     }

                 } else if(part.isParam()){
                         parampart = (ParamPart)part;
                         ht.put(part.getName(), parampart.getStringValue());
                 }
             }

         } catch (IOException e) {
              System.out.println("### IOExceptio e");
              throw new AppException("[SSBrsup1600WB.insertAnswerInfoexg()]","[SSBrsup1600WB.loadEDIfile()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
         } catch (Exception e) {
              System.out.println("### Exceptio e");
              SysException se = new SysException(e);
              LogManager.getInstance().log(se);
              throw se;
         }

         /*
         SSBrsup1600EJBHome home = (SSBrsup1600EJBHome)JNDIManager.getInstance().getHome("SSBrsup1600EJB");
         try{
             SSBrsup1600EJB ejb = home.create();

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
     * 지국지원-빌링-파일업로드-지로EDI 
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void ediUpload(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        // String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        // String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));

        // DM Setting
        
        SSBrsup1600DAO dao = new SSBrsup1600DAO();
        // DAO 객체의 boUpload 호출
        dao.ediUpload(incmgpers);
        /*
        SSBrsup1600EJBHome home = (SSBrsup1600EJBHome) JNDIManager.getInstance().getHome("SSBrsup1600EJB");
        try {
        	SSBrsup1600EJB ejb = home.create();
            ejb.ediUpload(incmgpers);
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
