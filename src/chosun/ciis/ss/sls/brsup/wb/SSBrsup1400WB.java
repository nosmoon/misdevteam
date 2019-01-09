/***************************************************************************************************
 * 파일명 : SSBrsup1400WB.java
 * 기능 : 지국지원-상해보험-마감, 비용을 위한 Worker Bean
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
 * 지국지원-상해보험-마감, 비용을 위한 Worker Bean
 */

public class SSBrsup1400WB {
    /**
     * 지국지원-상해보험-마감-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrClosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_INSRAPLCCLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_INSRAPLCCLOSDM dm = new SS_L_INSRAPLCCLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 selectInsrClosList 호출
        ds = dao.selectInsrClosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.selectInsrClosList(dm);
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
     * 지국지원-상해보험-마감-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrClosDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_INSRAPLCCLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_INSRAPLCCLOSDM dm = new SS_S_INSRAPLCCLOSDM();
        dm.setBasidt(basidt);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 selectInsrClosDetail 호출
        ds = dao.selectInsrClosDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.selectInsrClosDetail(dm);
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
     * 지국지원-상해보험-마감-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertInsrClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_INSRAPLCCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String clamdt = Util.checkString(req.getParameter("clamdt"));

        // DM Setting
        SS_A_INSRAPLCCLOSDM dm = new SS_A_INSRAPLCCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setClamdt(clamdt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 insertInsrClos 호출
        ds = dao.insertInsrClos(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.insertInsrClos(dm);
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
     * 지국지원-상해보험-마감-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateInsrClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_INSRAPLCCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String clamdt = Util.checkString(req.getParameter("clamdt"));

        // DM Setting
        SS_A_INSRAPLCCLOSDM dm = new SS_A_INSRAPLCCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setClamdt(clamdt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 updateInsrClos 호출
        ds = dao.updateInsrClos(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.updateInsrClos(dm);
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
     * 지국지원-상해보험-마감-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteInsrClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_INSRAPLCCLOSDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_INSRAPLCCLOSDM dm = new SS_A_INSRAPLCCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 deleteInsrClos 호출
        ds = dao.deleteInsrClos(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.deleteInsrClos(dm);
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
     * 지국지원-상해보험-마감-마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeInsrClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_INSRAPLCCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_INSRAPLCCLOS_CLOSEDM dm = new SS_A_INSRAPLCCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 closeInsrClos 호출
        ds = dao.closeInsrClos(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.closeInsrClos(dm);
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
     * 지국지원-상해보험-마감-마감취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelInsrClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_INSRAPLCCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_INSRAPLCCLOS_CLOSEDM dm = new SS_A_INSRAPLCCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 closeCancelInsrClos 호출
        ds = dao.closeCancelInsrClos(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.closeCancelInsrClos(dm);
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
     * 지국지원-상해보험-비용(영업담당)-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void insrCostBusnInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // Request Parameter Processing

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 insrCostBusnInit 호출
        ds = dao.insrCostBusnInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.insrCostBusnInit(dm);
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
     * 지국지원-상해보험-비용(영업담당)-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectInsrCostBusnList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_INSRCOST_BUSNDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
       // DM Setting
        SS_L_INSRCOST_BUSNDM dm = new SS_L_INSRCOST_BUSNDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 selectInsrCostBusnList 호출
        ds = dao.selectInsrCostBusnList(dm);
        req.setAttribute("ds", ds);

       /* 
       SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.selectInsrCostBusnList(dm);
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
     * 지국지원-상해보험-비용(영업담당)-상세목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectInsrCostBusnDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_INSRCOSTCLMTDataSet ds = null;

        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

       // DM Setting
        SS_L_INSRCOSTCLMTDM dm = new SS_L_INSRCOSTCLMTDM();
        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);

        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 selectInsrCostBusnDetail 호출
        ds = dao.selectInsrCostBusnDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.selectInsrCostBusnDetail(dm);
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
     * 지국지원-상해보험-비용(영업담당)-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void insertInsrCostBusn(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_INSRCOSTCLMTDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String basidtary = Util.checkString(req.getParameter("basidtary"));
        String deptcdary = Util.checkString(req.getParameter("deptcdary"));
        String areacdary = Util.checkString(req.getParameter("areacdary"));
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String clamtary = Util.checkString(req.getParameter("clamtary"));
        String rcpmpersnmary = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmpersnmary")));

        // DM Setting
        SS_A_INSRCOSTCLMTDM dm = new SS_A_INSRCOSTCLMTDM();
        dm.setIncmgpers(incmgpers);
        dm.setBasidtary(basidtary);
        dm.setDeptcdary(deptcdary);
        dm.setAreacdary(areacdary);
        dm.setBocdary(bocdary);
        dm.setClamtary(clamtary);
        dm.setRcpmpersnmary(rcpmpersnmary);

        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 insertInsrCostBusn 호출
        ds = dao.insertInsrCostBusn(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.insertInsrCostBusn(dm);
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
     * 지국지원-상해보험-비용(지원담당)-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void insrCostSplyInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 insrCostSplyInit 호출
        ds = dao.insrCostSplyInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.insrCostSplyInit(dm);
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
     * 지국지원-상해보험-비용(지원담당)-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectInsrCostSplyList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_INSRCOST_SPLYDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_INSRCOST_SPLYDM dm = new SS_L_INSRCOST_SPLYDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 selectInsrCostSplyList 호출
        ds = dao.selectInsrCostSplyList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.selectInsrCostSplyList(dm);
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
     * 지국지원-상해보험-비용(지원담당)-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void updateInsrCostSply(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_INSRCOSTDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String basidtary = Util.checkString(req.getParameter("basidtary"));
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_INSRCOSTDM dm = new SS_U_INSRCOSTDM();
        dm.setIncmgpers(incmgpers);
        dm.setBasidtary(basidtary);
        dm.setBocdary(bocdary);
        dm.setCheckedary(checkedary);
        
        SSBrsup1400DAO dao = new SSBrsup1400DAO();
        // DAO 객체의 updateInsrCostSply 호출
        ds = dao.updateInsrCostSply(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1400EJBHome home = (SSBrsup1400EJBHome)JNDIManager.getInstance().getHome("SSBrsup1400EJB");
        try{
            SSBrsup1400EJB ejb = home.create();
            ds = ejb.updateInsrCostSply(dm);
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