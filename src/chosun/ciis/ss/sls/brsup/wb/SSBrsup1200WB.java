/***************************************************************************************************
 * 파일명 : SSBrsup1200WB.java
 * 기능 : 지국지원-신문지원물품-마감,비용을 위한 Worker Bean
 * 작성일자 : 2004-02-06
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
 * 지국지원-신문지원물품-마감,비용을 위한 Worker Bean
 */

public class SSBrsup1200WB {
    /**
     * 지국지원-신문지원물품-마감-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspitemCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWSPITEMCOSTCLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_NWSPITEMCOSTCLOSDM dm = new SS_L_NWSPITEMCOSTCLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 selectNwspitemCostList 호출
        ds = dao.selectNwspitemCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.selectNwspitemCostList(dm);
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
     * 지국지원-신문지원물품-마감-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspitemCostDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_NWSPITEMCOSTCLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_NWSPITEMCOSTCLOSDM dm = new SS_S_NWSPITEMCOSTCLOSDM();
        dm.setBasidt(basidt);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 selectNwspitemCostDetail 호출
        ds = dao.selectNwspitemCostDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.selectNwspitemCostDetail(dm);
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
     * 지국지원-신문지원물품-마감-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertNwspitemCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_NWSPITEMCOSTCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String costclamdt = Util.checkString(req.getParameter("costclamdt"));

        // DM Setting
        SS_A_NWSPITEMCOSTCLOSDM dm = new SS_A_NWSPITEMCOSTCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setCostclamdt(costclamdt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 insertNwspitemCost 호출
        ds = dao.insertNwspitemCost(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.insertNwspitemCost(dm);
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
     * 지국지원-신문지원물품-마감-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateNwspitemCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_NWSPITEMCOSTCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String costclamdt = Util.checkString(req.getParameter("costclamdt"));

        // DM Setting
        SS_A_NWSPITEMCOSTCLOSDM dm = new SS_A_NWSPITEMCOSTCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setCostclamdt(costclamdt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 updateNwspitemCost 호출
        ds = dao.updateNwspitemCost(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.updateNwspitemCost(dm);
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
     * 지국지원-신문지원물품-마감-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteNwspitemCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_NWSPITEMCOSTCLOSDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_NWSPITEMCOSTCLOSDM dm = new SS_A_NWSPITEMCOSTCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 deleteNwspitemCost 호출
        ds = dao.deleteNwspitemCost(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.deleteNwspitemCost(dm);
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
     * 지국지원-신문지원물품-마감-마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeNwspitemCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_NWSPITEMCOSTCLOS_CLOSEDM dm = new SS_A_NWSPITEMCOSTCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 closeNwspitemCost 호출
        ds = dao.closeNwspitemCost(dm);
        req.setAttribute("ds", ds);
        

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.closeNwspitemCost(dm);
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
     * 지국지원-신문지원물품-마감-마감취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelNwspitemCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_NWSPITEMCOSTCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_NWSPITEMCOSTCLOS_CLOSEDM dm = new SS_A_NWSPITEMCOSTCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 closeCancelNwspitemCost 호출
        ds = dao.closeCancelNwspitemCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.closeCancelNwspitemCost(dm);
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
     * 지국지원-신문지원물품-비용(영업담당)-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void nwspitemCostBusnInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // Request Parameter Processing

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 nwspitemCostBusnInit 호출
        ds = dao.nwspitemCostBusnInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.nwspitemCostBusnInit(dm);
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
     * 지국지원-신문지원물품-비용(영업담당)-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectNwspitemCostBusnList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWSPITEMCOST_BUSNDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
       // DM Setting
        SS_L_NWSPITEMCOST_BUSNDM dm = new SS_L_NWSPITEMCOST_BUSNDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 selectNwspitemCostBusnList 호출
        ds = dao.selectNwspitemCostBusnList(dm);
        req.setAttribute("ds", ds);
        
        /*
       SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.selectNwspitemCostBusnList(dm);
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
     * 지국지원-신문지원물품-비용(영업담당)-상세목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectNwspitemCostBusnDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWSPITEMCOSTCLMTDataSet ds = null;

        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

       // DM Setting
        SS_L_NWSPITEMCOSTCLMTDM dm = new SS_L_NWSPITEMCOSTCLMTDM();
        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 selectNwspitemCostBusnDetail 호출
        ds = dao.selectNwspitemCostBusnDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.selectNwspitemCostBusnDetail(dm);
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
     * 지국지원-신문지원물품-비용(영업담당)-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void insertNwspitemCostBusn(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_NWSPITEMCOSTCLMTDataSet ds = null;

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
        SS_A_NWSPITEMCOSTCLMTDM dm = new SS_A_NWSPITEMCOSTCLMTDM();
        dm.setIncmgpers(incmgpers);
        dm.setBasidtary(basidtary);
        dm.setDeptcdary(deptcdary);
        dm.setAreacdary(areacdary);
        dm.setBocdary(bocdary);
        dm.setClamtary(clamtary);
        dm.setRcpmpersnmary(rcpmpersnmary);

        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 insertNwspitemCostBusn 호출
        ds = dao.insertNwspitemCostBusn(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.insertNwspitemCostBusn(dm);
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
     * 지국지원-신문지원물품-비용(지원담당)-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void nwspitemCostSplyInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 nwspitemCostSplyInit 호출
        ds = dao.nwspitemCostSplyInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.nwspitemCostSplyInit(dm);
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
     * 지국지원-신문지원물품-비용(지원담당)-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectNwspitemCostSplyList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWSPITEMCOST_SPLYDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_NWSPITEMCOST_SPLYDM dm = new SS_L_NWSPITEMCOST_SPLYDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 selectNwspitemCostSplyList 호출
        ds = dao.selectNwspitemCostSplyList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.selectNwspitemCostSplyList(dm);
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
     * 지국지원-신문지원물품-비용(지원담당)-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void updateNwspitemCostSply(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_NWSPITEMCOSTDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String basidtary = Util.checkString(req.getParameter("basidtary"));
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_NWSPITEMCOSTDM dm = new SS_U_NWSPITEMCOSTDM();
        dm.setIncmgpers(incmgpers);
        dm.setBasidtary(basidtary);
        dm.setBocdary(bocdary);
        dm.setCheckedary(checkedary);
        
        SSBrsup1200DAO dao = new SSBrsup1200DAO();
        // DAO 객체의 updateNwspitemCostSply 호출
        ds = dao.updateNwspitemCostSply(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1200EJBHome home = (SSBrsup1200EJBHome)JNDIManager.getInstance().getHome("SSBrsup1200EJB");
        try{
            SSBrsup1200EJB ejb = home.create();
            ds = ejb.updateNwspitemCostSply(dm);
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