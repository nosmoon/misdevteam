/***************************************************************************************************
* 파일명 : SSExtn1300WB.java
 * 기능 : 사원확장 수당,송금을 위한 Worker Bean
* 작성일자 : 2003-12-15
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
 * 확장현황-사원수당 을 위한 WB
 */

public class SSExtn1300WB {
    /**
     * 확장현황-사원확장-수당관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void empAlonInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EMPCAMPNODataSet ds = null;

        // DM Setting
        SS_L_EMPCAMPNODM dm = new SS_L_EMPCAMPNODM();
        
        SSExtn1300DAO dao = new SSExtn1300DAO();
        // DAO 객체의 empAionInit 호출
        ds = dao.empAlonInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1300EJBHome home = (SSExtn1300EJBHome)JNDIManager.getInstance().getHome("SSExtn1300EJB");
        try{
            SSExtn1300EJB ejb = home.create();
            ds = ejb.empAlonInit(dm);
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
     * 확장현황-사원확장-수당관리-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpAlonList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPALONDataSet ds = null;

        // Request Parameter Processing
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String payyn = Util.checkString(req.getParameter("payyn"));

        // DM Setting
        SS_L_RDR_EXTN_EMPALONDM dm = new SS_L_RDR_EXTN_EMPALONDM();

        dm.setRdr_extncampno(rdr_extncampno);
        dm.setEmpnm(empnm);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPayyn(payyn);

        SSExtn1300DAO dao = new SSExtn1300DAO();
        // DAO 객체의 selectEmpAlonList 호출
        ds = dao.selectEmpAlonList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1300EJBHome home = (SSExtn1300EJBHome)JNDIManager.getInstance().getHome("SSExtn1300EJB");
        try{
            SSExtn1300EJB ejb = home.create();
            ds = ejb.selectEmpAlonList(dm);
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
     * 확장현황-사원확장-수당관리-상세목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpAlonDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPALONDDataSet ds = null;

        // Request Parameter Processing
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String empseq = Util.checkString(req.getParameter("empseq"));

        // DM Setting
        SS_L_RDR_EXTN_EMPALONDDM dm = new SS_L_RDR_EXTN_EMPALONDDM();
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setEmpseq(empseq);
        
        SSExtn1300DAO dao = new SSExtn1300DAO();
        // DAO 객체의 selectEmpAlonDetailList 호출
        ds = dao.selectEmpAlonDetailList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1300EJBHome home = (SSExtn1300EJBHome)JNDIManager.getInstance().getHome("SSExtn1300EJB");
        try{
            SSExtn1300EJB ejb = home.create();
            ds = ejb.selectEmpAlonDetailList(dm);
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
     * 확장현황-사원확장-수당관리-수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateEmpAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_RDR_EXTN_EMPALONDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String rdr_extncampnoary = Util.checkString(req.getParameter("rdr_extncampnoary"));
        String empseqary = Util.checkString(req.getParameter("empseqary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_RDR_EXTN_EMPALONDM dm = new SS_U_RDR_EXTN_EMPALONDM();
        dm.setRdr_extncampnoary(rdr_extncampnoary);
        dm.setEmpseqary(empseqary);
        dm.setCheckedary(checkedary);
        dm.setIncmgpers(incmgpers);
        
        SSExtn1300DAO dao = new SSExtn1300DAO();
        // DAO 객체의 updateEmpAlon 호출
        ds = dao.updateEmpAlon(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1300EJBHome home = (SSExtn1300EJBHome)JNDIManager.getInstance().getHome("SSExtn1300EJB");
        try{
            SSExtn1300EJB ejb = home.create();
            ds = ejb.updateEmpAlon(dm);
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
     * 확장현황-사원확장-송금관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void empRmttInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_EMPCAMPNODataSet ds = null;

        // DM Setting
        SS_L_EMPCAMPNODM dm = new SS_L_EMPCAMPNODM();
        
        SSExtn1300DAO dao = new SSExtn1300DAO();
        // DAO 객체의 empRmttInit 호출
        ds = dao.empRmttInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1300EJBHome home = (SSExtn1300EJBHome)JNDIManager.getInstance().getHome("SSExtn1300EJB");
        try{
            SSExtn1300EJB ejb = home.create();
            ds = ejb.empRmttInit(dm);
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
     * 확장현황-사원확장-송금관리-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpRmttList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPRMTTDataSet ds = null;

        // Request Parameter Processing
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String sortflag = Util.checkString(req.getParameter("sortflag"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_EMPRMTTDM dm = new SS_L_RDR_EXTN_EMPRMTTDM();

        dm.setRdr_extncampno(rdr_extncampno);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSortflag(sortflag);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSExtn1300DAO dao = new SSExtn1300DAO();
        // DAO 객체의 selectEmpRmttList 호출
        ds = dao.selectEmpRmttList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1300EJBHome home = (SSExtn1300EJBHome)JNDIManager.getInstance().getHome("SSExtn1300EJB");
        try{
            SSExtn1300EJB ejb = home.create();
            ds = ejb.selectEmpRmttList(dm);
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
     * 확장현황-사원확장-사원확장-송금 인쇄
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printEmpAlonList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet ds = null;

        // Request Parameter Processing
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String sortflag = Util.checkString(req.getParameter("sortflag"));

        // DM Setting
        SS_L_RDR_EXTN_EMPRMTT_PRINTDM dm = new SS_L_RDR_EXTN_EMPRMTT_PRINTDM();

        dm.setRdr_extncampno(rdr_extncampno);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSortflag(sortflag);
        
        SSExtn1300DAO dao = new SSExtn1300DAO();
        // DAO 객체의 printEmpAlonList 호출
        ds = dao.printEmpAlonList(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1300EJBHome home = (SSExtn1300EJBHome)JNDIManager.getInstance().getHome("SSExtn1300EJB");
        try{
            SSExtn1300EJB ejb = home.create();
            ds = ejb.printEmpAlonList(dm);
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