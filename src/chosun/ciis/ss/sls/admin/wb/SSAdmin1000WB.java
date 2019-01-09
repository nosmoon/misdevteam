/***************************************************************************************************
 * 파일명 : SSAdmin1000WB.java
 * 기능 : 관리자-공통코드,우편번호,판촉코드를 위한 Worker Bean
 * 작성일자 : 2004-03-09
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-공통코드,우편번호를 위한 WB
 */

public class SSAdmin1000WB {
    /**
     * 관리자-공통코드-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_CDV_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        CO_L_CDV_INITDM dm = new CO_L_CDV_INITDM();
        
        
        /* EJB 수정후 시작 */
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 initCode 호출
        ds = dao.initCode(dm);
        req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
        /* EJB 수정전 시작
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.initCode(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        EJB 수정전 시작*/
    }

    /**
     * 관리자-공통코드-코드구분-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodeGBList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_CDV_CICDGBDataSet ds = null;
        // Request Parameter Processing
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));

        // DM Setting
        CO_L_CDV_CICDGBDM dm = new CO_L_CDV_CICDGBDM();
        dm.setCiymgbcd(ciymgbcd);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectCodeGBList 호출
        ds = dao.selectCodeGBList(dm);
        req.setAttribute("ds", ds);
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectCodeGBList(dm);
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
     * 관리자-공통코드-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_CDVDataSet ds = null;
        // Request Parameter Processing
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));
        String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        CO_L_CDVDM dm = new CO_L_CDVDM();
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setCicdnm(cicdnm);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectCodeList 호출
        ds = dao.selectCodeList(dm);
        req.setAttribute("ds", ds);
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectCodeList(dm);
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
     * 관리자-공통코드-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodeDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_S_CDVDataSet ds = null;
        // Request Parameter Processing
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));

        // DM Setting
        CO_S_CDVDM dm = new CO_S_CDVDM();
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectCodeDetail 호출
        ds = dao.selectCodeDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectCodeDetail(dm);
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
     * 관리자-공통코드-등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_A_CDVDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));
        String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
        String cicdynm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdynm")));
        String cimgtcd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd1")));
        String cimgtcd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd2")));
        String cimgtcd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd3")));
        String cimgtcd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd4")));
        String cimgtcd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd5")));
        String cimgtcd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd6")));
        String cimgtcd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd7")));
        String ciremarks = Util.Uni2Ksc(Util.checkString(req.getParameter("ciremarks")));
//        String sabun = Util.checkString(req.getParameter("sabun"));

        // DM Setting
        CO_A_CDVDM dm = new CO_A_CDVDM();
        dm.setAccflag(accflag);
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setCicdnm(cicdnm);
        dm.setCicdynm(cicdynm);
        dm.setCimgtcd1(cimgtcd1);
        dm.setCimgtcd2(cimgtcd2);
        dm.setCimgtcd3(cimgtcd3);
        dm.setCimgtcd4(cimgtcd4);
        dm.setCimgtcd5(cimgtcd5);
        dm.setCimgtcd6(cimgtcd6);
        dm.setCimgtcd7(cimgtcd7);
        dm.setCiremarks(ciremarks);
        dm.setSabun(incmgpers);

        
        // DAO 객체 생성
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 insertCode 호출
        ds = dao.insertCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.insertCode(dm);
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
     * 관리자-공통코드-수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_A_CDVDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));
        String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
        String cicdynm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdynm")));
        String cimgtcd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd1")));
        String cimgtcd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd2")));
        String cimgtcd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd3")));
        String cimgtcd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd4")));
        String cimgtcd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd5")));
        String cimgtcd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd6")));
        String cimgtcd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd7")));
        String ciremarks = Util.Uni2Ksc(Util.checkString(req.getParameter("ciremarks")));
//        String sabun = Util.checkString(req.getParameter("sabun"));

        // DM Setting
        CO_A_CDVDM dm = new CO_A_CDVDM();
        dm.setAccflag(accflag);
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setCicdnm(cicdnm);
        dm.setCicdynm(cicdynm);
        dm.setCimgtcd1(cimgtcd1);
        dm.setCimgtcd2(cimgtcd2);
        dm.setCimgtcd3(cimgtcd3);
        dm.setCimgtcd4(cimgtcd4);
        dm.setCimgtcd5(cimgtcd5);
        dm.setCimgtcd6(cimgtcd6);
        dm.setCimgtcd7(cimgtcd7);
        dm.setCiremarks(ciremarks);
        dm.setSabun(incmgpers);

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 updateCode 호출
        ds = dao.updateCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.updateCode(dm);
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
     * 관리자-공통코드-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_A_CDVDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));

        // DM Setting
        CO_A_CDVDM dm = new CO_A_CDVDM();
        dm.setAccflag(accflag);
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setSabun(incmgpers);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 deleteCode 호출
        ds = dao.deleteCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.deleteCode(dm);
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
     * 관리자-계정코드-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_ACCTCD_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_ACCTCD_INITDM dm = new SS_L_ACCTCD_INITDM();
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 initAcctcd 호출
        ds = dao.initAcctcd(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.initAcctcd(dm);
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
     * 관리자-계정코드-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAcctcdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_ACCTCDDataSet ds = null;
        // Request Parameter Processing
        String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));
        String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_ACCTCDDM dm = new SS_L_ACCTCDDM();
        dm.setImptexpnclsf(imptexpnclsf);
        dm.setAcctcd(acctcd);
        dm.setAcctnm(acctnm);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectAcctcdList 호출
        ds = dao.selectAcctcdList(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectAcctcdList(dm);
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
     * 관리자-계정코드-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAcctcdDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_ACCTCDDataSet ds = null;
        // Request Parameter Processing
        String acctcd = Util.checkString(req.getParameter("acctcd"));

        // DM Setting
        SS_S_ACCTCDDM dm = new SS_S_ACCTCDDM();
        dm.setAcctcd(acctcd);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectAcctcdDetail 호출
        ds = dao.selectAcctcdDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectAcctcdDetail(dm);
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
     * 관리자-계정코드-등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_ACCTCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));
        String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
        String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
        String leaf_inyn = Util.checkString(req.getParameter("leaf_inyn"));
        String empadvyn = Util.checkString(req.getParameter("empadvyn"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_ACCTCDDM dm = new SS_A_ACCTCDDM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setAcctcd(acctcd);
        dm.setAcctnm(acctnm);
        dm.setImptexpnclsf(imptexpnclsf);
        dm.setLeaf_inyn(leaf_inyn);
        dm.setEmpadvyn(empadvyn);
        dm.setRemk(remk);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 insertAcctcd 호출
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.insertAcctcd(dm);
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
     * 관리자-계정코드-수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_ACCTCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));
        String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
        String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
        String leaf_inyn = Util.checkString(req.getParameter("leaf_inyn"));
        String empadvyn = Util.checkString(req.getParameter("empadvyn"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_ACCTCDDM dm = new SS_A_ACCTCDDM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setAcctcd(acctcd);
        dm.setAcctnm(acctnm);
        dm.setImptexpnclsf(imptexpnclsf);
        dm.setLeaf_inyn(leaf_inyn);
        dm.setEmpadvyn(empadvyn);
        dm.setRemk(remk);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 updateAcctcd 호출
        ds = dao.updateAcctcd(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.updateAcctcd(dm);
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
     * 관리자-계정코드-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_ACCTCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));

        // DM Setting
        SS_A_ACCTCDDM dm = new SS_A_ACCTCDDM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setAcctcd(acctcd);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 deleteAcctcd 호출
        ds = dao.deleteAcctcd(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.deleteAcctcd(dm);
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
     * 관리자-우편번호-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 initZip 호출
        ds = dao.initZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.initZip(dm);
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
     * 관리자-우편번호-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectZipList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_PSTCDDataSet ds = null;

        // Request Parameter Processing
        String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
        String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_PSTCDDM dm = new SS_L_PSTCDDM();
        dm.setFlag(flag);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setAddr3(addr3);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectZipList 호출
        ds = dao.selectZipList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectZipList(dm);
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
     * 관리자-우편번호-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectZipDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_JUSODataSet ds = null;

        // Request Parameter Processing
        String zip1 = Util.checkString(req.getParameter("zip1"));
        String zip2 = Util.checkString(req.getParameter("zip2"));
        String zip3 = Util.checkString(req.getParameter("zip3"));

        // DM Setting
        SS_L_JUSODM dm = new SS_L_JUSODM();
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setZip3(zip3);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectZipDetail 호출
        ds = dao.selectZipDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectZipDetail(dm);
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
     * 관리자-우편번호-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void accessZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_JUSODataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String zip1 = Util.checkString(req.getParameter("zip1"));
        String zip2 = Util.checkString(req.getParameter("zip2"));
        String zip3 = Util.checkString(req.getParameter("zip3"));
        String addr1ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1ary")));
        String addr2ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2ary")));
        String addr3ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3ary")));
        String largedlvplacary = Util.Uni2Ksc(Util.checkString(req.getParameter("largedlvplacary")));
        String isldary = Util.Uni2Ksc(Util.checkString(req.getParameter("isldary")));
        String bgnnary = Util.Uni2Ksc(Util.checkString(req.getParameter("bgnnary")));
        String endnary = Util.Uni2Ksc(Util.checkString(req.getParameter("endnary")));
        String bocdary = Util.checkString(req.getParameter("bocdary"));

        // DM Setting
        SS_A_JUSODM dm = new SS_A_JUSODM();
        dm.setIncmgpers(incmgpers);
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setZip3(zip3);
        dm.setAddr1ary(addr1ary);
        dm.setAddr2ary(addr2ary);
        dm.setAddr3ary(addr3ary);
        dm.setLargedlvplacary(largedlvplacary);
        dm.setIsldary(isldary);
        dm.setBgnnary(bgnnary);
        dm.setEndnary(endnary);
        dm.setBocdary(bocdary);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 accessZip 호출
        ds = dao.accessZip(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.accessZip(dm);
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
     * 관리자-판촉코드-목록
     * 판매지국의 프로시저를 사용한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @throws AppException
     **/
    public void selectBNSITEMSP(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SL_L_BNSITEMDataSet ds = null;

        // parameter requesting 하고  DM에 값을 Setting
        String bns_itemcd = Util.checkString(req.getParameter("txtbns_itemcd")); // 판촉물코드
        String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("txtbns_itemnm"))); // 판촉물명
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        SL_L_BNSITEMDM dm = new SL_L_BNSITEMDM();

        dm.setBns_itemcd(bns_itemcd); // 판촉물코드
        dm.setBns_itemnm(bns_itemnm); // 판촉물명
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        //dm.setBocd(sBocd); // 업무구분
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 selectBNSITEMSP 호출
        ds = dao.selectBNSITEMSP(dm);
        req.setAttribute("ds", ds);
        
/*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try{
          SSAdmin1000EJB ejb = home.create();
          ds = ejb.selectBNSITEMSP(dm); // 설정된 dm값으로 EJB를 호출
          req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 관리자-판촉코드-입력,수정,삭제
     * 판매지국의 프로시저를 사용한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void actionBNSITEMSP(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        SL_A_BNSITEMDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String accflag = Util.checkString(req.getParameter("accflag")); // 플래그
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); // 입력자(수정자)

        String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd")); // 판촉물코드
        String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemnm"))); // 판촉물명
        String uprc = Util.checkString(req.getParameter("uprc")); // 단가
        String mnftwon = Util.Uni2Ksc(Util.checkString(req.getParameter("mnftwon"))); // 제조원
        String spec = Util.Uni2Ksc(Util.checkString(req.getParameter("spec"))); // 사양
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk"))); // 비고
        String useclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("useclsf"))); // 사용처구분
        String useyn = Util.Uni2Ksc(Util.checkString(req.getParameter("useyn"))); // 사용여부

        SL_A_BNSITEMDM dm = new SL_A_BNSITEMDM();

        dm.setAccflag(accflag); // 플래그
        dm.setIncmgpers(incmgpers);

        dm.setBns_itemcd(bns_itemcd); // 판촉물코드
        dm.setBns_itemnm(bns_itemnm); // 판촉물명
        dm.setUprc(Long.parseLong(Util.convertNull(uprc,"0"))); // 단가
        dm.setMnftwon(mnftwon); // 제조원
        dm.setSpec(spec); // 사양
        dm.setRemk(remk); // 비고
        dm.setUseclsf(useclsf); // 사용처구분
        dm.setUseyn(useyn); // 사용여부

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 actionBNSITEMSP 호출
        ds = dao.actionBNSITEMSP(dm);
        req.setAttribute("ds", ds);
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try{
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.actionBNSITEMSP(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 관리자-판촉코드-상세
     * 판매지국의 프로시저를 사용한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void detailBNSITEMSP(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        SL_S_BNSITEMDataSet ds = null;

        // parameter requesting 하고  DM에 값을 Setting
        String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd")); // 판촉물코드

        SL_S_BNSITEMDM dm = new SL_S_BNSITEMDM();

        dm.setItemcd(bns_itemcd); // 판촉물코드
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO 객체의 detailBNSITEMSP 호출
        ds = dao.detailBNSITEMSP(dm);
        req.setAttribute("ds", ds); 
        
/*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try{
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.detailBNSITEMSP(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
