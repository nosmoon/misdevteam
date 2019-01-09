/***************************************************************************************************
* 파일명 : SSExtn1500WB.java
 * 기능 : 확장용역비용 처리를 위한 Worker Bean
* 작성일자 : 2003-12-20
* 작성자 : 김대섭
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
 * 확장현황-확장용역비용 을 위한 WB
 */

public class SSExtn1500WB{


    /**
     * 확장현황-확장용역비용-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void servCostInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_SERVCLOS_INITDataSet ds = null;
        // DM Setting
        SS_L_RDR_EXTN_SERVCLOS_INITDM dm = new SS_L_RDR_EXTN_SERVCLOS_INITDM();

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 init 호출
        ds = dao.servCostInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
                SSExtn1500EJB ejb = home.create();
                ds = ejb.servCostInit(dm);
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
     * 확장현황-확장용역비용-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectServCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_SERVCLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_SERVCLOSDM dm = new SS_L_RDR_EXTN_SERVCLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectServCostList 호출
        ds = dao.selectServCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectServCostList(dm);
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
     * 확장현황-확장용역비용-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectServCostDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_EXTN_SERVCLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_RDR_EXTN_SERVCLOSDM dm = new SS_S_RDR_EXTN_SERVCLOSDM();
        dm.setBasidt(basidt);
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectDetailServCost 호출
        ds = dao.selectServCostDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectServCostDetail(dm);
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
     * 확장현황-확장용역비용-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertServCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SERVCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // 확장용역비용 정보
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String clamdt = Util.checkString(req.getParameter("clamdt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // 확장용역비용 기준 정보
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String deptcdary = Util.checkString(req.getParameter("deptcdary"));
        String basiamt1ary = Util.checkString(req.getParameter("basiamt1ary"));
        String basiamt2ary = Util.checkString(req.getParameter("basiamt2ary"));
        String basiamt3ary = Util.checkString(req.getParameter("basiamt3ary"));

        // DM Setting
        SS_A_RDR_EXTN_SERVCLOSDM dm = new SS_A_RDR_EXTN_SERVCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setClamdt(clamdt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setDeptcdary(deptcdary);
        dm.setBasiamt1ary(basiamt1ary);
        dm.setBasiamt2ary(basiamt2ary);
        dm.setBasiamt3ary(basiamt3ary);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 insertServCost 호출
        ds = dao.insertServCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.insertServCost(dm);
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
     * 확장현황-확장용역비용-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateServCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SERVCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // 확장용역비용 정보
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String clamdt = Util.checkString(req.getParameter("clamdt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // 확장용역비용 매체 정보
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String deptcdary = Util.checkString(req.getParameter("deptcdary"));
        String basiamt1ary = Util.checkString(req.getParameter("basiamt1ary"));
        String basiamt2ary = Util.checkString(req.getParameter("basiamt2ary"));
        String basiamt3ary = Util.checkString(req.getParameter("basiamt3ary"));

        // DM Setting
        SS_A_RDR_EXTN_SERVCLOSDM dm = new SS_A_RDR_EXTN_SERVCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setClamdt(clamdt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setDeptcdary(deptcdary);
        dm.setBasiamt1ary(basiamt1ary);
        dm.setBasiamt2ary(basiamt2ary);
        dm.setBasiamt3ary(basiamt3ary);
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 updateServCost 호출
        ds = dao.updateServCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.updateServCost(dm);
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
     * 확장현황-확장용역비용-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteServCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SERVCLOSDataSet ds = null;

        // Request Parameter Processing
        // 확장용역비용 정보
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_SERVCLOSDM dm = new SS_A_RDR_EXTN_SERVCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 deleteServCost 호출
        ds = dao.deleteServCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.deleteServCost(dm);
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

/* 20050219 김대섭 추가 */
    /**
     * 확장현황-확장용역비용(MC)-초기화면(
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void MCCostInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_MCCLOS_INITDataSet ds = null;
        // DM Setting
        SS_L_RDR_EXTN_MCCLOS_INITDM dm = new SS_L_RDR_EXTN_MCCLOS_INITDM();

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 init 호출
        ds = dao.MCCostInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
                SSExtn1500EJB ejb = home.create();
                ds = ejb.MCCostInit(dm);
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
     * 확장현황-확장용역비용(MC)-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMCCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_MCCLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_MCCLOSDM dm = new SS_L_RDR_EXTN_MCCLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectMCCostList 호출
        ds = dao.selectMCCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectMCCostList(dm);
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
     * 확장현황-확장용역비용(MC)-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMCCostDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_EXTN_MCCLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_RDR_EXTN_MCCLOSDM dm = new SS_S_RDR_EXTN_MCCLOSDM();
        dm.setBasidt(basidt);
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectDetailMCCost 호출
        ds = dao.selectMCCostDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectMCCostDetail(dm);
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
     * 확장현황-확장용역비용(MC)-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertMCCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_MCCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // 확장용역비용 정보
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String clamdt = Util.checkString(req.getParameter("clamdt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // 확장용역비용 기준 정보
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String deptcdary = Util.checkString(req.getParameter("deptcdary"));
        String basiamt1ary = Util.checkString(req.getParameter("basiamt1ary"));
        String basiamt2ary = Util.checkString(req.getParameter("basiamt2ary"));
        String basiamt3ary = Util.checkString(req.getParameter("basiamt3ary"));

        // DM Setting
        SS_A_RDR_EXTN_MCCLOSDM dm = new SS_A_RDR_EXTN_MCCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setClamdt(clamdt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setDeptcdary(deptcdary);
        dm.setBasiamt1ary(basiamt1ary);
        dm.setBasiamt2ary(basiamt2ary);
        dm.setBasiamt3ary(basiamt3ary);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 insertMCCost 호출
        ds = dao.insertMCCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.insertMCCost(dm);
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
     * 확장현황-확장용역비용(MC)-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateMCCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_MCCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // 확장용역비용 정보
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String clamdt = Util.checkString(req.getParameter("clamdt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // 확장용역비용 매체 정보
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String deptcdary = Util.checkString(req.getParameter("deptcdary"));
        String basiamt1ary = Util.checkString(req.getParameter("basiamt1ary"));
        String basiamt2ary = Util.checkString(req.getParameter("basiamt2ary"));
        String basiamt3ary = Util.checkString(req.getParameter("basiamt3ary"));

        // DM Setting
        SS_A_RDR_EXTN_MCCLOSDM dm = new SS_A_RDR_EXTN_MCCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setClamdt(clamdt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setDeptcdary(deptcdary);
        dm.setBasiamt1ary(basiamt1ary);
        dm.setBasiamt2ary(basiamt2ary);
        dm.setBasiamt3ary(basiamt3ary);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 updateMCCost 호출
        ds = dao.updateMCCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.updateMCCost(dm);
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
     * 확장현황-확장용역비용(MC)-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteMCCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_MCCLOSDataSet ds = null;

        // Request Parameter Processing
        // 확장용역비용 정보
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_MCCLOSDM dm = new SS_A_RDR_EXTN_MCCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 deleteMCCost 호출
        ds = dao.deleteMCCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.deleteMCCost(dm);
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
     * 확장현황-확장용역비용-마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
/* 20050219 김대섭 수정(사용하지 않음)
    public void closeServCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_SERVCLOS_CLOSDM dm = new SS_A_RDR_EXTN_SERVCLOS_CLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.closeServCost(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
*/
    /**
     * 확장현황-확장용역비용-마감취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
/* 20050219 김대섭 수정(사용하지 않음)
    public void closeCancelServCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_SERVCLOS_CLOSDM dm = new SS_A_RDR_EXTN_SERVCLOS_CLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.closeCancelServCost(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
*/

    /**
     * 확장현황-확장용역비용-지국별 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void rsltInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_RDR_EXTN_BO_RSLT_INITDataSet ds = null;

        // DM Setting
    	SS_L_RDR_EXTN_BO_RSLT_INITDM dm = new SS_L_RDR_EXTN_BO_RSLT_INITDM();
    	
    	SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 rsltInit 호출
        ds = dao.rsltInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.rsltInit(dm);
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
     * 확장현황-확장용역비용-지국별-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBoRsltList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_BO_RSLTDataSet ds = null;

        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_BO_RSLTDM dm = new SS_L_RDR_EXTN_BO_RSLTDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setClsfcd(clsfcd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectBoRsltList 호출
        ds = dao.selectBoRsltList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectBoRsltList(dm);
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
     * 확장현황-확장용역비용-요원별-인쇄
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printBoRsltList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet ds = null;

        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String stafnm = Util.checkString(req.getParameter("stafnm"));
        // DM Setting
        SS_L_RDR_EXTN_BO_RSLT_PRINTDM dm = new SS_L_RDR_EXTN_BO_RSLT_PRINTDM();

        dm.setFrdt(frdt);
        dm.setStafnm(stafnm);
        
        dm.print();

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 printBoRsltList 호출
        ds = dao.printBoRsltList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.printBoRsltList(dm);
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
     * 확장현황-확장용역비용-정산내역-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectServAdjmList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_SERVCOSTDataSet ds = null;

        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_SERVCOSTDM dm = new SS_L_RDR_EXTN_SERVCOSTDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setStafnm(stafnm);
        dm.setClsfcd(clsfcd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectServAdjmList 호출
        ds = dao.selectServAdjmList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectServAdjmList(dm);
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
     * 확장현황-확장용역비용-정산내역-상세목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectServAdjmDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_SERVCOSTDDataSet ds = null;

        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));
        String stafno = Util.checkString(req.getParameter("stafno"));

        // DM Setting
        SS_L_RDR_EXTN_SERVCOSTDDM dm = new SS_L_RDR_EXTN_SERVCOSTDDM();
        dm.setBasidt(basidt);
        dm.setStafno(stafno);
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectServAdjmDetailList 호출
        ds = dao.selectServAdjmDetailList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectServAdjmDetailList(dm);
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
     * 확장현황-확장용역비용-정산내역-인쇄
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printServAdjmList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_ISSTAF_PRINTDataSet ds = null;

        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        //String todt = Util.checkString(req.getParameter("todt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_RDR_EXTN_ISSTAF_PRINTDM dm = new SS_L_RDR_EXTN_ISSTAF_PRINTDM();
        dm.setFrdt(frdt);
        //dm.setTodt(todt);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 printServAdjmList 호출
        ds = dao.printServAdjmList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.printServAdjmList(dm);
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
     * 확장현황-지국확장이사통계-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void extnMovmInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EXTN_MOVM_INITDataSet ds = null;
        
        String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        // Request Parameter Processing

        // DM Setting
        SS_L_EXTN_MOVM_INITDM dm = new SS_L_EXTN_MOVM_INITDM();
        
        dm.setIncmg_pers(emp_no);
        dm.setCmpy_cd(cmpycd);

        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectDetailServAdjmList 호출
        ds = dao.extnMovmInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.extnMovmInit(dm);
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
     * 확장현황-지국확장이사통계-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExtnMovmList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EXTN_MOVMDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String boextn = Util.checkString(req.getParameter("boextn"));
        String empextn = Util.checkString(req.getParameter("empextn"));
        String cmpyextn = Util.checkString(req.getParameter("cmpyextn"));
        String exgextn = Util.checkString(req.getParameter("exgextn"));
        String rdrextn = Util.checkString(req.getParameter("rdrextn"));
        String cybextn = Util.checkString(req.getParameter("cybextn"));
		String ccextn = Util.Uni2Ksc(Util.checkString(req.getParameter("ccextn")));
		String campextn = Util.Uni2Ksc(Util.checkString(req.getParameter("campextn")));
        String movm = Util.checkString(req.getParameter("movm"));
        String viewflag = Util.checkString(req.getParameter("viewflag"));
        String allbo = Util.checkString(req.getParameter("allbo"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String jmextn = Util.checkString(req.getParameter("jmextn"));
        String movmtrsf = Util.checkString(req.getParameter("movmtrsf"));
        String excldpay = Util.checkString(req.getParameter("excldpay"));

        // DM Setting
        SS_L_EXTN_MOVMDM dm = new SS_L_EXTN_MOVMDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setBoextn(boextn);
        dm.setEmpextn(empextn);
        dm.setCmpyextn(cmpyextn);
        dm.setExgextn(exgextn);
        dm.setRdrextn(rdrextn);
        dm.setCybextn(cybextn);
		dm.setCcextn(ccextn);
		dm.setCampextn(campextn);
        dm.setMovm(movm);
        dm.setJmextn(jmextn);
        dm.setMovmtrsf(movmtrsf);
        dm.setViewflag(viewflag);
        dm.setAllbo(allbo);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setExcldpay(excldpay);
        
        dm.print();
        
        SSExtn1500DAO dao = new SSExtn1500DAO();
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.selectExtnMovmList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1500EJBHome home = (SSExtn1500EJBHome)JNDIManager.getInstance().getHome("SSExtn1500EJB");
        try{
            SSExtn1500EJB ejb = home.create();
            ds = ejb.selectExtnMovmList(dm);
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