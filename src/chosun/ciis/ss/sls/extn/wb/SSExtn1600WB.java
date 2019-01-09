/***************************************************************************************************
 * 파일명 : SSExtn1600WB.java
 * 기능 : 확장현황-사이버확장-요원,수당,실적을 위한 Worker Bean
 * 작성일자 : 2004-03-29
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 확장현황-사이버확장-요원,지급관리,실적조회를 위한 Worker Bean
 */

public class SSExtn1600WB {
    /**
     * 확장현황-사이버확장-요원관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initPromStafCYEXTN(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_INIT_CYEXTNDataSet ds = null;

        // DM Setting
        SS_L_PROMSTAF_INIT_CYEXTNDM dm = new SS_L_PROMSTAF_INIT_CYEXTNDM();

        SSExtn1600DAO dao = new SSExtn1600DAO();
		// DAO 객체의 initPromStafCYEXTN 호출
		ds = dao.initPromStafCYEXTN(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1600EJBHome home = (SSExtn1600EJBHome)JNDIManager.getInstance().getHome("SSExtn1600EJB");
        try{
            SSExtn1600EJB ejb = home.create();
            ds = ejb.initPromStafCYEXTN(dm);
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
     * 확장현황-사이버확장-요원관리-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafCYEXTNList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_CYEXTNDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));

        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String cnvsstafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cnvsstafnm")));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_PROMSTAF_CYEXTNDM dm = new SS_L_PROMSTAF_CYEXTNDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setStafclsfcd(stafclsfcd);

        dm.setStafnm(stafnm);
        dm.setCnvsstafnm(cnvsstafnm);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSExtn1600DAO dao = new SSExtn1600DAO();
		// DAO 객체의 selectPromStafCYEXTNList 호출
		ds = dao.selectPromStafCYEXTNList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1600EJBHome home = (SSExtn1600EJBHome)JNDIManager.getInstance().getHome("SSExtn1600EJB");
        try{
            SSExtn1600EJB ejb = home.create();
            ds = ejb.selectPromStafCYEXTNList(dm);
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
     * 확장현황-사이버확장-요원관리-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafCYEXTNDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_PROMSTAF_CYEXTNDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));

        // DM Setting
        SS_S_PROMSTAF_CYEXTNDM dm = new SS_S_PROMSTAF_CYEXTNDM();
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);

        SSExtn1600DAO dao = new SSExtn1600DAO();
		// DAO 객체의 selectPromStafCYEXTNDetail 호출
		ds = dao.selectPromStafCYEXTNDetail(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1600EJBHome home = (SSExtn1600EJBHome)JNDIManager.getInstance().getHome("SSExtn1600EJB");
        try{
            SSExtn1600EJB ejb = home.create();
            ds = ejb.selectPromStafCYEXTNDetail(dm);
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
     * 확장현황-사이버확장-요원관리-인쇄
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printPromStafCYEXTNList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_CYEXTN_PRINTDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));

        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String cnvsstafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cnvsstafnm")));

        // DM Setting
        SS_L_PROMSTAF_CYEXTN_PRINTDM dm = new SS_L_PROMSTAF_CYEXTN_PRINTDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setStafclsfcd(stafclsfcd);

        dm.setStafnm(stafnm);
        dm.setCnvsstafnm(cnvsstafnm);

        SSExtn1600DAO dao = new SSExtn1600DAO();
        // DAO 객체의 printPromStafCYEXTNList 호출
        ds = dao.printPromStafCYEXTNList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1600EJBHome home = (SSExtn1600EJBHome)JNDIManager.getInstance().getHome("SSExtn1600EJB");
        try{
            SSExtn1600EJB ejb = home.create();
            ds = ejb.printPromStafCYEXTNList(dm);
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
     * 확장현황-사이버확장-수당-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initPromStafCYEXPay(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_CYEXPAY_INITDataSet ds = null;

        // Session Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
        SS_L_PROMSTAF_CYEXPAY_INITDM dm = new SS_L_PROMSTAF_CYEXPAY_INITDM();
        dm.setCmpycd(cmpycd);

        SSExtn1600DAO dao = new SSExtn1600DAO();
		// DAO 객체의 initPromStafCYEXPay 호출
		ds = dao.initPromStafCYEXPay(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1600EJBHome home = (SSExtn1600EJBHome)JNDIManager.getInstance().getHome("SSExtn1600EJB");
        try{
            SSExtn1600EJB ejb = home.create();
            ds = ejb.initPromStafCYEXPay(dm);
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
     * 확장현황-사이버확장-수당-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafCYEXPayList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_CYEXPAYDataSet ds = null;

        // Session Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));
        String frdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String bo_headcnfmyn = Util.checkString(req.getParameter("bo_headcnfmyn"));
        String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
        String alonadjmyn = Util.checkString(req.getParameter("alonadjmyn"));

        // DM Setting
        SS_L_PROMSTAF_CYEXPAYDM dm = new SS_L_PROMSTAF_CYEXPAYDM();

        dm.setCmpycd(cmpycd);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setStafnm(stafnm);
        dm.setRdrnm(rdrnm);
        dm.setFromtogb(fromtogb);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setBo_headcnfmyn(bo_headcnfmyn);
        dm.setSubscnfmstatcd(subscnfmstatcd);
        dm.setAlonadjmyn(alonadjmyn);

        SSExtn1600DAO dao = new SSExtn1600DAO();
		// DAO 객체의 selectPromStafCYEXPayList 호출
		ds = dao.selectPromStafCYEXPayList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1600EJBHome home = (SSExtn1600EJBHome)JNDIManager.getInstance().getHome("SSExtn1600EJB");
        try{
            SSExtn1600EJB ejb = home.create();
            ds = ejb.selectPromStafCYEXPayList(dm);
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
     * 확장현황-사이버확장-수당-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updatePromStafCYEXpay(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_CYEXPAYDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String rdr_extndtary = Util.checkString(req.getParameter("rdr_extndtary"));
        String rdr_extnnoary = Util.checkString(req.getParameter("rdr_extnnoary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_CYEXPAYDM dm = new SS_U_CYEXPAYDM();
        dm.setIncmgpers(incmgpers);
        dm.setRdr_extndtary(rdr_extndtary);
        dm.setRdr_extnnoary(rdr_extnnoary);
        dm.setCheckedary(checkedary);

        SSExtn1600DAO dao = new SSExtn1600DAO();
		// DAO 객체의 updatePromStafCYEXpay 호출
		ds = dao.updatePromStafCYEXpay(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1600EJBHome home = (SSExtn1600EJBHome)JNDIManager.getInstance().getHome("SSExtn1600EJB");
        try{
            SSExtn1600EJB ejb = home.create();
            ds = ejb.updatePromStafCYEXpay(dm);
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