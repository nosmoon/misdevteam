/***************************************************************************************************
 * 파일명 : SSAdmin1400WB.java
 * 기능 : 관리자-작업-등록을 위한 Worker Bean
 * 작성일자 : 2004-04-09
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
 * 관리자-지국월마감을 위한 WB
 */

public class SSAdmin1500WB {
    /**
     * 관리자-지국월마감-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initBoclos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_BOCLOS_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_BOCLOS_INITDM dm = new SS_L_BOCLOS_INITDM();
        
        SSAdmin1500DAO dao = new SSAdmin1500DAO();
        // DAO 객체의 initBoclos 호출
        ds = dao.initBoclos(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1500EJBHome home = (SSAdmin1500EJBHome) JNDIManager.getInstance().getHome("SSAdmin1500EJB");
        try {
            SSAdmin1500EJB ejb = home.create();
            ds = ejb.initBoclos(dm);
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
     * 관리자-지국월마감-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBoclosList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_BOCLOSDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String closyn = Util.checkString(req.getParameter("closyn"));
        String ext1 = Util.checkString(req.getParameter("ext1"));
        String ext2 = Util.checkString(req.getParameter("ext2"));
        String ext3 = Util.checkString(req.getParameter("ext3"));
        String ext4 = Util.checkString(req.getParameter("ext4"));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_BOCLOSDM dm = new SS_L_BOCLOSDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setYymm(yymm);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        dm.setClosyn(closyn);
        dm.setExt1(ext1);
        dm.setExt2(ext2);
        dm.setExt3(ext3);
        dm.setExt4(ext4);

        SSAdmin1500DAO dao = new SSAdmin1500DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.selectBoclosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1500EJBHome home = (SSAdmin1500EJBHome) JNDIManager.getInstance().getHome("SSAdmin1500EJB");
        try {
            SSAdmin1500EJB ejb = home.create();
            ds = ejb.selectBoclosList(dm);
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
     * 관리자-지국월마감-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBoclosDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_BOCLOSDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String detail_yymm = Util.checkString(req.getParameter("detail_yymm"));

        // DM Setting
        SS_S_BOCLOSDM dm = new SS_S_BOCLOSDM();
        dm.setBocd(bocd);
        dm.setYymm(yymm);
        dm.setDetail_yymm(detail_yymm);
        
        SSAdmin1500DAO dao = new SSAdmin1500DAO();
        // DAO 객체의 selectBoclosDetail 호출
        ds = dao.selectBoclosDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1500EJBHome home = (SSAdmin1500EJBHome) JNDIManager.getInstance().getHome("SSAdmin1500EJB");
        try {
            SSAdmin1500EJB ejb = home.create();
            ds = ejb.selectBoclosDetail(dm);
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
     * 관리자-지국월마감-마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeBoclos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_BOCLOSDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String closyn = Util.checkString(req.getParameter("closyn"));
        String closfrdt = Util.checkString(req.getParameter("closfrdt"));
        String clostodt = Util.checkString(req.getParameter("clostodt"));
        String clos_dt = Util.checkString(req.getParameter("clos_dt"));
        String remk = Util.checkString(req.getParameter("remk"));
        String ext1 = Util.checkString(req.getParameter("ext1"));
        String ext2 = Util.checkString(req.getParameter("ext2"));
        String ext3 = Util.checkString(req.getParameter("ext3"));


        // DM Setting
        SS_A_BOCLOSDM dm = new SS_A_BOCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setYymm(yymm);
        dm.setClosyn(closyn);
        dm.setClosfrdt(closfrdt);
        dm.setClostodt(clostodt);
        dm.setClos_dt(clos_dt);
        dm.setRemk(remk);
        dm.setRemk(ext1);
        dm.setRemk(ext2);
        dm.setRemk(ext3);
        
        SSAdmin1500DAO dao = new SSAdmin1500DAO();
        // DAO 객체의 insertBoclos 호출
        ds = dao.closeBoclos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1500EJBHome home = (SSAdmin1500EJBHome) JNDIManager.getInstance().getHome("SSAdmin1500EJB");
        try {
            SSAdmin1500EJB ejb = home.create();
            ds = ejb.closeBoclos(dm);
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
     * 관리자-지국월마감-마감취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelBoclos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_BOCLOSDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String closyn = Util.checkString(req.getParameter("closyn"));
        String closfrdt = Util.checkString(req.getParameter("closfrdt"));
        String clostodt = Util.checkString(req.getParameter("clostodt"));
        String clos_dt = Util.checkString(req.getParameter("clos_dt"));
        String remk = Util.checkString(req.getParameter("remk"));
        String ext1 = Util.checkString(req.getParameter("ext1"));
        String ext2 = Util.checkString(req.getParameter("ext2"));
        String ext3 = Util.checkString(req.getParameter("ext3"));


        // DM Setting
        SS_A_BOCLOSDM dm = new SS_A_BOCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setYymm(yymm);
        dm.setClosyn(closyn);
        dm.setClosfrdt(closfrdt);
        dm.setClostodt(clostodt);
        dm.setClos_dt(clos_dt);
        dm.setRemk(remk);
        dm.setRemk(ext1);
        dm.setRemk(ext2);
        dm.setRemk(ext3);
        
        SSAdmin1500DAO dao = new SSAdmin1500DAO();
        // DAO 객체의 updateBoclos 호출
        ds = dao.closeCancelBoclos(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1500EJBHome home = (SSAdmin1500EJBHome) JNDIManager.getInstance().getHome("SSAdmin1500EJB");
        try {
            SSAdmin1500EJB ejb = home.create();
            ds = ejb.closeCancelBoclos(dm);
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
