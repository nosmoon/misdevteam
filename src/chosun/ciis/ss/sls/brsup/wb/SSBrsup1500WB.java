/***************************************************************************************************
 * 파일명 : SSBrsup1500WB.java
 * 기능 : 지국지원-상해보험-사고,보험금,가입현황을 위한 Worker Bean
 * 작성일자 : 2004-02-20
 * 작성자 : 김대섭
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

/**
 * 지국지원-상해보험-사고,보험금,가입현황을 위한 Worker Bean
 */

public class SSBrsup1500WB {
    /**
     * 지국지원-상해보험-사고-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initInsrAccd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_INSRACCD_INITDataSet ds = null;

        // Request Parameter Processing

        // DM Setting
        SS_L_INSRACCD_INITDM dm = new SS_L_INSRACCD_INITDM();
        
        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 initInsrAccd 호출
        ds = dao.initInsrAccd(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.initInsrAccd(dm);
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
     * 지국지원-상해보험-사고-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrAccdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_INSRACCDDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
        String procstat = Util.checkString(req.getParameter("procstat"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_INSRACCDDM dm = new SS_L_INSRACCDDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromtogb(fromtogb);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setFlnm(flnm);
        dm.setProcstat(procstat);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 selectInsrAccdList 호출
        ds = dao.selectInsrAccdList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.selectInsrAccdList(dm);
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
     * 지국지원-상해보험-사고-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrAccdDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_INSRACCDDataSet ds = null;
        // Session Processing

        // Request Parameter Processing
        String acpndt = Util.checkString(req.getParameter("acpndt"));
        String accdacpnno = Util.checkString(req.getParameter("accdacpnno"));

        // DM Setting
        SS_S_INSRACCDDM dm = new SS_S_INSRACCDDM();
        dm.setAcpndt(acpndt);
        dm.setAccdacpnno(accdacpnno);

        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 selectInsrAccdDetail 호출
        ds = dao.selectInsrAccdDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.selectInsrAccdDetail(dm);
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
     * 지국지원-상해보험-사고-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateInsrAccd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_INSRACCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acpndt = Util.checkString(req.getParameter("acpndt"));
        String accdacpnno = Util.checkString(req.getParameter("accdacpnno"));
        String boemp_no = Util.checkString(req.getParameter("boemp_no"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String accddt = Util.checkString(req.getParameter("accddt"));
        String accdtm = Util.checkString(req.getParameter("accdtm"));
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
        String procstat = Util.checkString(req.getParameter("procstat"));

        // DM Setting
        SS_A_INSRACCDDM dm = new SS_A_INSRACCDDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setAcpndt(acpndt);
        dm.setAccdacpnno(accdacpnno);
        dm.setBoemp_no(boemp_no);
        dm.setBocd(bocd);
        dm.setAccddt(accddt);
        dm.setAccdtm(accdtm);
        dm.setCont(cont);
        dm.setProcstat(procstat);

        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 updateInsrAccd 호출
        ds = dao.updateInsrAccd(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.updateInsrAccd(dm);
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
     * 지국지원-상해보험-사고-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteInsrAccd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_INSRACCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acpndt = Util.checkString(req.getParameter("acpndt"));
        String accdacpnno = Util.checkString(req.getParameter("accdacpnno"));

        // DM Setting
        SS_A_INSRACCDDM dm = new SS_A_INSRACCDDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setAcpndt(acpndt);
        dm.setAccdacpnno(accdacpnno);
        
        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 deleteInsrAccd 호출
        ds = dao.deleteInsrAccd(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.deleteInsrAccd(dm);
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
     * 지국지원-상해보험-보험금-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initInsrAmt(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_INSRAMT_INITDataSet ds = null;

        // Request Parameter Processing

        // DM Setting
    	SS_L_INSRAMT_INITDM dm = new SS_L_INSRAMT_INITDM();
    	
    	SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 initInsrAmt 호출
        ds = dao.initInsrAmt(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.initInsrAmt(dm);
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
     * 지국지원-상해보험-보험금-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrAmtList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_INSRAMTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
        String acctyn = Util.checkString(req.getParameter("acctyn"));

        // DM Setting
        SS_L_INSRAMTDM dm = new SS_L_INSRAMTDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromtogb(fromtogb);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setFlnm(flnm);
        dm.setAcctyn(acctyn);
        
        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 selectInsrAmtList 호출
        ds = dao.selectInsrAmtList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.selectInsrAmtList(dm);
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
     * 지국지원-상해보험-보험금-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateInsrAmt(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_INSRAMTDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String acpndtary = Util.checkString(req.getParameter("acpndtary"));
        String accdacpnnoary = Util.checkString(req.getParameter("accdacpnnoary"));
        String accdcauscdary = Util.checkString(req.getParameter("accdcauscdary"));
        String accdtypecdary = Util.checkString(req.getParameter("accdtypecdary"));
        String insramtary = Util.checkString(req.getParameter("insramtary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_INSRAMTDM dm = new SS_U_INSRAMTDM();
        dm.setIncmgpers(incmgpers);
        dm.setAcpndtary(acpndtary);
        dm.setAccdacpnnoary(accdacpnnoary);
        dm.setAccdcauscdary(accdcauscdary);
        dm.setAccdtypecdary(accdtypecdary);
        dm.setInsramtary(insramtary);
        dm.setCheckedary(checkedary);
        
        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 updateInsrAmt 호출
        ds = dao.updateInsrAmt(dm);
        req.setAttribute("ds", ds);
        

        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.updateInsrAmt(dm);
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
     * 지국지원-상해보험-가입현황-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initInsrStcs(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_INSR_STCS_INITDataSet ds = null;

        // Request Parameter Processing

        // DM Setting
    	SS_L_INSR_STCS_INITDM dm = new SS_L_INSR_STCS_INITDM();

    	SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 initInsrStcs 호출
        ds = dao.initInsrStcs(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.initInsrStcs(dm);
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
     * 지국지원-상해보험-가입현황-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrStcsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_INSR_STCSDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String cntryy = Util.checkString(req.getParameter("cntryy"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_INSR_STCSDM dm = new SS_L_INSR_STCSDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setCntryy(cntryy);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1500DAO dao = new SSBrsup1500DAO();
        // DAO 객체의 selectInsrStcsList 호출
        ds = dao.selectInsrStcsList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1500EJBHome home = (SSBrsup1500EJBHome) JNDIManager.getInstance().getHome("SSBrsup1500EJB");
        try {
            SSBrsup1500EJB ejb = home.create();
            ds = ejb.selectInsrStcsList(dm);
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
}