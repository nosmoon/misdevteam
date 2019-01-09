/***************************************************************************************************
 * 파일명 : SSAdmin1200WB.java
 * 기능 : 관리자-작업-마이그레이션을 위한 Worker Bean
 * 작성일자 : 2004-02-13
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
 * 관리자-작업-마이그레이션을 위한 WB
 */

public class SSAdmin1200WB {

    /**
     * 관리자-마이그레이션-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO 객체의 initMig 호출
        ds = dao.initMig(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome)JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.initMig(dm);
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
     * 관리자-마이그레이션-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigBOCDList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKCHKDataSet ds = null;
        // Request Parameter Processing

        String endcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("endcnfmyn")));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);

        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGRWORKCHKDM dm = new SS_L_MIGRWORKCHKDM();

        dm.setEndcnfmyn(endcnfmyn);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO 객체의 selectMigList 호출
        ds = dao.selectMigBOCDList(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMigBOCDList(dm);
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
     * 관리자-마이그레이션-지명별 유가현황 비교
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRMECD(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRMECDDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRMECDDM dm = new SS_L_MIGRMECDDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO 객체의 selectMigList 호출
        ds = dao.selectMIGRMECD(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRMECD(dm);
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
     * 관리자-마이그레이션-구역별 유가현황 비교
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRGUYUK(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRGUYUKDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRGUYUKDM dm = new SS_L_MIGRGUYUKDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO 객체의 selectMigList 호출
        ds = dao.selectMIGRGUYUK(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRGUYUK(dm);
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
     * 관리자-마이그레이션-수금방법별 유가현황 비교
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRSGBANG(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRSGBANGDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRSGBANGDM dm = new SS_L_MIGRSGBANGDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO 객체의 selectMigList 호출
        ds = dao.selectMIGRSGBANG(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRSGBANG(dm);
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
     * 관리자-마이그레이션-오류독자조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRERR(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRERRDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRERRDM dm = new SS_L_MIGRERRDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO 객체의 selectMigList 호출
        ds = dao.selectMIGRERR(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRERR(dm);
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
