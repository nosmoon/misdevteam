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
 * 관리자-작업-등록을 위한 WB
 */

public class SSAdmin1400WB {
    /**
     * 관리자-작업-등록-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRK_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_WRK_INITDM dm = new SS_L_WRK_INITDM();

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 initWrk 호출
        ds = dao.initWrk(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.initWrk(dm);
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
     * 관리자-작업-등록-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKDataSet ds = null;
        // Request Parameter Processing
        String cycl = Util.checkString(req.getParameter("cycl"));
        String id = Util.checkString(req.getParameter("id"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_WRKDM dm = new SS_L_WRKDM();
        dm.setCycl(cycl);
        dm.setId(id);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 selectWrkList 호출
        ds = dao.selectWrkList(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkList(dm);
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
     * 관리자-작업-등록-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_WRKDataSet ds = null;
        // Request Parameter Processing
        String id = Util.checkString(req.getParameter("id"));

        // DM Setting
        SS_S_WRKDM dm = new SS_S_WRKDM();
        dm.setId(id);

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 selectWrkDetail 호출
        ds = dao.selectWrkDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkDetail(dm);
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
     * 관리자-작업-등록-등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_WRKDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
        String cycl = Util.checkString(req.getParameter("cycl"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String endddyn = Util.checkString(req.getParameter("endddyn"));
        String basitm = Util.checkString(req.getParameter("basitm"));
        String pgmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgmnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_WRKDM dm = new SS_A_WRKDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setId(id);
        dm.setDescri(descri);
        dm.setCycl(cycl);
        dm.setBasidt(basidt);
        dm.setEndddyn(endddyn);
        dm.setBasitm(basitm);
        dm.setPgmnm(pgmnm);
        dm.setRemk(remk);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 insertWrk 호출
        ds = dao.insertWrk(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.insertWrk(dm);
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
     * 관리자-작업-등록-수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_WRKDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
        String cycl = Util.checkString(req.getParameter("cycl"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String endddyn = Util.checkString(req.getParameter("endddyn"));
        String basitm = Util.checkString(req.getParameter("basitm"));
        String pgmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgmnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_WRKDM dm = new SS_A_WRKDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setId(id);
        dm.setDescri(descri);
        dm.setCycl(cycl);
        dm.setBasidt(basidt);
        dm.setEndddyn(endddyn);
        dm.setBasitm(basitm);
        dm.setPgmnm(pgmnm);
        dm.setRemk(remk);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 updateWrk 호출
        ds = dao.updateWrk(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.updateWrk(dm);
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
     * 관리자-작업-등록-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_WRKDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));

        // DM Setting
        SS_A_WRKDM dm = new SS_A_WRKDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setId(id);

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 deleteWrk 호출
        ds = dao.deleteWrk(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.deleteWrk(dm);
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
     * 관리자-작업-등록-수동실행
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void runWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String id = Util.checkString(req.getParameter("id"));

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 runWrk 호출
        dao.runWrk(id, incmgpers);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ejb.runWrk(id, incmgpers);
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
     * 관리자-작업이력-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initWrkHist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKHIST_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_WRKHIST_INITDM dm = new SS_L_WRKHIST_INITDM();
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 initWrkHist 호출
        ds = dao.initWrkHist(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.initWrkHist(dm);
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
     * 관리자-작업-이력-목록(이력)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkHstyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKHISTDataSet ds = null;
        // Request Parameter Processing
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_WRKHISTDM dm = new SS_L_WRKHISTDM();
        dm.setId(id);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 selectWrkHstyList 호출
        ds = dao.selectWrkHstyList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkHstyList(dm);
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
     * 관리자-작업-이력-목록(내역)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkPtcrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKDTLDataSet ds = null;
        // Request Parameter Processing
        String id = Util.checkString(req.getParameter("id"));
        String execno = Util.checkString(req.getParameter("execno"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_WRKDTLDM dm = new SS_L_WRKDTLDM();
        dm.setId(id);
        dm.setExecno(execno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO 객체의 selectWrkPtcrList 호출
        ds = dao.selectWrkPtcrList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkPtcrList(dm);
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
