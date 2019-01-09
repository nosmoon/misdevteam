/***************************************************************************************************
* 파일명 : SSBrinfo1100WB.java
* 기능 : 지국Info-지국현황 처리를 위한 Worker Bean
* 작성일자 : 2004-02-09
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;

import java.rmi.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.rdr.dm.SS_L_READER_BOINFO_INITDM;
import chosun.ciis.ss.sls.rdr.ds.SS_L_READER_BOINFO_INITDataSet;

/**
 * 지국Info-지국현황 위한 WB
 */

public class SSBrinfo1100WB{

    /**
     * 지국Info-지국현황 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoinfoInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_BOINFO_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_BOINFO_INITDM dm = new SS_L_BOINFO_INITDM();

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectInitList(dm);
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
     * 지국Info-지국현황 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoinfoList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOINFODataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_BOINFODM dm = new SS_L_BOINFODM();
        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드

        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
		// DAO 객체의 selectBoinfoList 호출
		ds = dao.selectBoinfoList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoinfoList(dm);
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
     * 지국Info-지국현황-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectBoinfoDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_BOINFODataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));

        // DM Setting
        SS_S_BOINFODM dm = new SS_S_BOINFODM();
        dm.setBocd(bocd);
        dm.setBasi_yymm(basi_yymm);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
		// DAO 객체의 selectBoinfoDetail 호출
		ds = dao.selectBoinfoDetail(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoinfoDetail(dm);
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
     * 지국Info-지국계좌관리_초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoAcctInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_BOACCT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
    	SS_L_BOACCT_INITDM dm = new SS_L_BOACCT_INITDM();

    	SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO 객체의 selectBoqtypcondList 호출
        ds = dao.selectBoAcctInit(dm);
        req.setAttribute("ds", ds);

        /*SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoAcctInit(dm);
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
     * 지국Info-지국계좌관리
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoAcctList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_L_BOACCT_LISTDataSet ds = null;
        // Request Parameter Processing
        String deptlist = Util.checkString(req.getParameter("deptlist"));  //부서목록
        String partlist = Util.checkString(req.getParameter("partlist"));  //지역목록
        String arealist = Util.checkString(req.getParameter("arealist"));  //지역목록
        String bocd = Util.checkString(req.getParameter("bocd"));          //지국코드
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String shacctno = Util.checkString(req.getParameter("shacctno"));      //20150920 장선희 계좌번호 추가
        String shacctnm = Util.checkString(req.getParameter("shacctnm"));      //20150921 장선희 예금주명 추가
        String cntr_fr_dt = Util.checkString(req.getParameter("cntr_fr_dt"));    //20170825 심정보 시작계약일자 추가
        String cntr_to_dt = Util.checkString(req.getParameter("cntr_to_dt"));    //20170825 심정보 종료계약일자 추가
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_L_BOACCT_LISTDM dm = new SS_L_BOACCT_LISTDM();
        dm.setDeptlist(deptlist);  //부서목록
        dm.setArealist(partlist);  //지역목록
        dm.setArealist(arealist);  //지역목록
        dm.setBocd(bocd);          //지국코드
        dm.setAcctitem(acctitem);  //계좌항목
        dm.setShacctno(shacctno);      //계좌번호 20150920 장선희
        dm.setShacctnm(shacctnm);      //예금주명 20150920 장선희
        dm.setCntr_fr_dt(cntr_fr_dt);  //계약시작일자
        dm.setCntr_to_dt(cntr_to_dt);  //계약종료일자
        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO 객체의 selectBoqtypcondList 호출
        ds = dao.selectBoAcctList(dm);
        req.setAttribute("ds", ds);

        /*SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoAcctList(dm);
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
     * 지국Info-지국계좌관리 수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void updateBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_U_BOACCTDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
//        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816장선희 세션에서 입력자 아이디 넘겨주는걸로 변경.

        // DM Setting
        SS_U_BOACCTDM dm = new SS_U_BOACCTDM();
        dm.setSeq(seq);
        dm.setBocd(bocd);          //지국코드
        dm.setAcctitem(acctitem);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setDeps_persnm(deps_persnm);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO 객체의 updateBoAcctItem 호출
        ds = dao.updateBoAcctItem(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.updateBoAcctItem(dm);
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
     * 지국Info-지국계좌관리 삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void deleteBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_D_BOACCTDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
//        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816장선희 세션에서 입력자 아이디 넘겨주는걸로 변경.

        // DM Setting
        SS_D_BOACCTDM dm = new SS_D_BOACCTDM();
        dm.setSeq(seq);
        dm.setBocd(bocd);          //지국코드
        dm.setAcctitem(acctitem);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setDeps_persnm(deps_persnm);
        dm.setIncmgpers(incmgpers);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO 객체의 deleteBoAcctItem 호출
        ds = dao.deleteBoAcctItem(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.deleteBoAcctItem(dm);
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
     * 지국Info-지국계좌관리 등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void insertBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_I_BOACCTDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
//        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816장선희 세션에서 입력자 아이디 넘겨주는걸로 변경.

        // DM Setting
        SS_I_BOACCTDM dm = new SS_I_BOACCTDM();
        dm.setSeq(seq);
        dm.setBocd(bocd);          //지국코드
        dm.setAcctitem(acctitem);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setDeps_persnm(deps_persnm);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO 객체의 insertBoAcctItem 호출
        ds = dao.insertBoAcctItem(dm);
        req.setAttribute("ds", ds);
        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.insertBoAcctItem(dm);
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
     * 지국Info-지국계좌관리 히스토리 조회 20150922 장선희
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void histBoAcctList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_BOACCT_LISTDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_S_BOACCT_LISTDM dm = new SS_S_BOACCT_LISTDM();
        dm.setBocd(bocd);          //지국코드

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO 객체의 insertBoAcctItem 호출
        ds = dao.histBoAcctList(dm);
        req.setAttribute("ds", ds);
        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.insertBoAcctItem(dm);
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
     * 지국Info-지국계좌관리 담당확인 20170919 심정보
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void cnfmBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_U_BOACCT_CNFMDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));        
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816장선희 세션에서 입력자 아이디 넘겨주는걸로 변경.

        // DM Setting
        SS_U_BOACCT_CNFMDM dm = new SS_U_BOACCT_CNFMDM();
        dm.setUid(incmgpers);
        dm.setBocd(bocd);          //지국코드
        dm.setSeq(seq);        
        dm.setAcctitem(acctitem);
        
        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO 객체의 insertBoAcctItem 호출
        ds = dao.cnfmBoAcctItem(dm);
        req.setAttribute("ds", ds);
        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.insertBoAcctItem(dm);
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
}
