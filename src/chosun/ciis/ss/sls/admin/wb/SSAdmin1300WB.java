/***************************************************************************************************
 * 파일명 : SSAdmin1300WB.java
 * 기능 : 관리자-마일리지을 위한 Worker Bean
 * 작성일자 : 2004-03-20
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
 * 관리자-마일리지을 위한 WB
 */

public class SSAdmin1300WB {
    /**
     * 관리자-마일리지-지급기준-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initPayBasi(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGLBASI_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_MIGLBASI_INITDM dm = new SS_L_MIGLBASI_INITDM();
        
        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 initPayBasi 호출
        ds = dao.initPayBasi(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome) JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try {
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.initPayBasi(dm);
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
     * 관리자-마일리지-지급기준-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPayBasiList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGLBASIDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGLBASIDM dm = new SS_L_MIGLBASIDM();
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setPayclsfcd(payclsfcd);
        dm.setPaybasicd(paybasicd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 selectPayBasiList 호출
        ds = dao.selectPayBasiList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome) JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try {
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.selectPayBasiList(dm);
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
     * 관리자-마일리지-지급기준-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPayBasiDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_MIGLBASIDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));

        // DM Setting
        SS_S_MIGLBASIDM dm = new SS_S_MIGLBASIDM();
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setPayclsfcd(payclsfcd);
        dm.setPaybasicd(paybasicd);

        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 selectPayBasiDetail 호출
        ds = dao.selectPayBasiDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome) JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try {
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.selectPayBasiDetail(dm);
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
     * 관리자-마일리지-지급기준-등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertPayBasi(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_MIGLBASIDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
        String pontcalcclsfcd = Util.checkString(req.getParameter("pontcalcclsfcd"));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
        String paypointdescri = Util.Uni2Ksc(Util.checkString(req.getParameter("paypointdescri")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String pont = Util.checkString(req.getParameter("pont"));
        String pontrate = Util.checkString(req.getParameter("pontrate"));
        String hdqtallmratio = Util.checkString(req.getParameter("hdqtallmratio"));
        String boallmratio = Util.checkString(req.getParameter("boallmratio"));
        String adjmexchrate = Util.checkString(req.getParameter("adjmexchrate"));
        String rdrgradsumyn = Util.checkString(req.getParameter("rdrgradsumyn"));
        String vdtyyn = Util.checkString(req.getParameter("vdtyyn"));

        // DM Setting
        SS_A_MIGLBASIDM dm = new SS_A_MIGLBASIDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setPaybasicd(paybasicd);
        dm.setPayclsfcd(payclsfcd);
        dm.setPontcalcclsfcd(pontcalcclsfcd);
        dm.setDescri(descri);
        dm.setPaypointdescri(paypointdescri);
        dm.setRemk(remk);
        dm.setPont(pont);
        dm.setPontrate(pontrate);
        dm.setHdqtallmratio(hdqtallmratio);
        dm.setBoallmratio(boallmratio);
        dm.setAdjmexchrate(adjmexchrate);
        dm.setRdrgradsumyn(rdrgradsumyn);
        dm.setVdtyyn(vdtyyn);

        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 insertPayBasi 호출
        ds = dao.insertPayBasi(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome) JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try {
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.insertPayBasi(dm);
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
     * 관리자-마일리지-지급기준-수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updatePayBasi(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_MIGLBASIDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
        String pontcalcclsfcd = Util.checkString(req.getParameter("pontcalcclsfcd"));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
        String paypointdescri = Util.Uni2Ksc(Util.checkString(req.getParameter("paypointdescri")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String pont = Util.checkString(req.getParameter("pont"));
        String pontrate = Util.checkString(req.getParameter("pontrate"));
        String hdqtallmratio = Util.checkString(req.getParameter("hdqtallmratio"));
        String boallmratio = Util.checkString(req.getParameter("boallmratio"));
        String adjmexchrate = Util.checkString(req.getParameter("adjmexchrate"));
        String rdrgradsumyn = Util.checkString(req.getParameter("rdrgradsumyn"));
        String vdtyyn = Util.checkString(req.getParameter("vdtyyn"));

        // DM Setting
        SS_A_MIGLBASIDM dm = new SS_A_MIGLBASIDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setPaybasicd(paybasicd);
        dm.setPayclsfcd(payclsfcd);
        dm.setPontcalcclsfcd(pontcalcclsfcd);
        dm.setDescri(descri);
        dm.setPaypointdescri(paypointdescri);
        dm.setRemk(remk);
        dm.setPont(pont);
        dm.setPontrate(pontrate);
        dm.setHdqtallmratio(hdqtallmratio);
        dm.setBoallmratio(boallmratio);
        dm.setAdjmexchrate(adjmexchrate);
        dm.setRdrgradsumyn(rdrgradsumyn);
        dm.setVdtyyn(vdtyyn);

        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 updatePayBasi 호출
        ds = dao.updatePayBasi(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome) JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try {
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.updatePayBasi(dm);
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
     * 관리자-마일리지-지급기준-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deletePayBasi(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_MIGLBASIDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));

        // DM Setting
        SS_A_MIGLBASIDM dm = new SS_A_MIGLBASIDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setPaybasicd(paybasicd);
        dm.setPayclsfcd(payclsfcd);
        
        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 deletePayBasi 호출
        ds = dao.deletePayBasi(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome) JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try {
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.deletePayBasi(dm);
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
     * 관리자-마일리지-마감-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigClosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MIGLLMMT_CLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGLLMMT_CLOSDM dm = new SS_L_MIGLLMMT_CLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 selectMigClosList 호출
        ds = dao.selectMigClosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome)JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try{
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.selectMigClosList(dm);
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
     * 관리자-마일리지-마감-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigClosDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_MIGLLMMT_CLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_MIGLLMMT_CLOSDM dm = new SS_S_MIGLLMMT_CLOSDM();
        dm.setBasidt(basidt);
        
        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 selectMigClosDetail 호출
        ds = dao.selectMigClosDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome)JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try{
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.selectMigClosDetail(dm);
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
     * 관리자-마일리지-마감-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertMigClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_MIGLLMMT_CLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));

        // DM Setting
        SS_A_MIGLLMMT_CLOSDM dm = new SS_A_MIGLLMMT_CLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setIncmgpers(incmgpers);

        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 insertMigClos 호출
        ds = dao.insertMigClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome)JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try{
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.insertMigClos(dm);
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
     * 관리자-마일리지-마감-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateMigClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_MIGLLMMT_CLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));

        // DM Setting
        SS_A_MIGLLMMT_CLOSDM dm = new SS_A_MIGLLMMT_CLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setIncmgpers(incmgpers);
        
        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 updateMigClos 호출
        ds = dao.updateMigClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome)JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try{
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.updateMigClos(dm);
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
     * 관리자-마일리지-마감-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteMigClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_MIGLLMMT_CLOSDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_MIGLLMMT_CLOSDM dm = new SS_A_MIGLLMMT_CLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);

        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 deleteMigClos 호출
        ds = dao.deleteMigClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome)JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try{
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.deleteMigClos(dm);
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
     * 관리자-마일리지-마감-마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeMigClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_MIGLLMMT_CLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_MIGLLMMT_CLOS_CLOSEDM dm = new SS_A_MIGLLMMT_CLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 closeMigClos 호출
        ds = dao.closeMigClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome)JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try{
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.closeMigClos(dm);
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
     * 관리자-마일리지-마감-마감취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelMigClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_MIGLLMMT_CLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_MIGLLMMT_CLOS_CLOSEDM dm = new SS_A_MIGLLMMT_CLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);
        
        SSAdmin1300DAO dao = new SSAdmin1300DAO();
        // DAO 객체의 closeCancelMigClos 호출
        ds = dao.closeCancelMigClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1300EJBHome home = (SSAdmin1300EJBHome)JNDIManager.getInstance().getHome("SSAdmin1300EJB");
        try{
            SSAdmin1300EJB ejb = home.create();
            ds = ejb.closeCancelMigClos(dm);
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