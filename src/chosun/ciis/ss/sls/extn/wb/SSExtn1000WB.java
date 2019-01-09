/***************************************************************************************************
 * 파일명 : SSExtn1000WB.java
 * 기능 : 확장신청 처리를 위한 Worker Bean
 * 작성일자 : 2003-11-15
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

/**
 * 확장현황-신청현황 을 위한 WB
 */

public class SSExtn1000WB {

    /**
     * 확장현황-신청현황-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_RDR_XTN_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //20170725 장선희 추가

        // DM Setting
        SS_L_RDR_XTN_INITDM dm = new SS_L_RDR_XTN_INITDM();

        dm.setCmpy_cd(cmpy_cd);

        SSExtn1000DAO dao = new SSExtn1000DAO();
        // DAO 객체의 init 호출
        ds = dao.init(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.init(dm);
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
     * 확장현황-신청현황-확장자소속 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExtnBlngCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_EXTNBLNGCDDataSet ds = null;
        // Request Parameter Processing
        String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
        // DM Setting
        SS_L_EXTNBLNGCDDM dm = new SS_L_EXTNBLNGCDDM();
        dm.setRdr_extntypecd(rdr_extntypecd);

        SSExtn1000DAO dao = new SSExtn1000DAO();
        // DAO 객체의 selectExtnBlngCode 호출
        ds = dao.selectExtnBlngCodeList(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.selectExtnBlngCodeList(dm);
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
     * 확장현황-신청현황 확장신청 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrExtnList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_RDR_EXTNDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
        String rdr_extnbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbocd")));
        String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
        String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        String incmgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgdt")));
        String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
        String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
        String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
        String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
        String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
        String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);
        String suspyn = Util.Uni2Ksc(Util.checkString(req.getParameter("suspyn")));

        // DM Setting
        SS_L_RDR_EXTNDM dm = new SS_L_RDR_EXTNDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setCorrbocd(corrbocd);
        dm.setRdr_extnbocd(rdr_extnbocd);
        dm.setFromtogb(fromtogb);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setIncmgdt(incmgdt);
        dm.setExtnflnm(extnflnm);
        dm.setAplcpersnm(aplcpersnm);
        dm.setPymtflnm(pymtflnm);
        dm.setRdrnm(rdrnm);
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setExtnblngcd(extnblngcd);
        dm.setMedicd(medicd);
        dm.setBo_headcnfmyn(bo_headcnfmyn);
        dm.setSubscnfmstatcd(subscnfmstatcd);
        dm.setAplcpathcd(aplcpathcd);
        dm.setSuspyn(suspyn);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSExtn1000DAO dao = new SSExtn1000DAO();
        // DAO 객체의 selectList 호출
        ds = dao.selectRdrExtnList(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.selectRdrExtnList(dm);
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
     * 확장현황-신청현황-확장신청 상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrExtnDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_RDR_EXTNDataSet ds = null;
        // Request Parameter Processing
        String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
        String rdr_extndt = req.getParameter("rdr_extndt");
        String rdr_extnno = req.getParameter("rdr_extnno");
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String cntrno = Util.checkString(req.getParameter("cntrno"));
        String mangno = Util.checkString(req.getParameter("mangno"));

        // DM Setting
        SS_S_RDR_EXTNDM dm = new SS_S_RDR_EXTNDM();
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setAplcpathcd(aplcpathcd);
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setCntrno(cntrno);
        dm.setMangno(mangno);

        SSExtn1000DAO dao = new SSExtn1000DAO();
        // DAO 객체의 selectDetail 호출
        ds = dao.selectRdrExtnDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.selectRdrExtnDetail(dm);
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
     * 확장현황-신청현황 온라인 확장신청 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectOnlineExtnList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_ON_RDR_EXTNDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
//        String rdr_extnbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbocd")));
        String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
        String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        String incmgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgdt")));
        String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
        String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
//        String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
//        String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
//        String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
//        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
        String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
//        String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_ON_RDR_EXTNDM dm = new SS_L_ON_RDR_EXTNDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setCorrbocd(corrbocd);
//        dm.setRdr_extnbocd(rdr_extnbocd);
        dm.setFromtogb(fromtogb);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setIncmgdt(incmgdt);
        dm.setExtnflnm(extnflnm);
        dm.setAplcpersnm(aplcpersnm);
//        dm.setPymtflnm(pymtflnm);
        dm.setRdrnm(rdrnm);
//        dm.setRdr_extntypecd(rdr_extntypecd);
//        dm.setExtnblngcd(extnblngcd);
//        dm.setMedicd(medicd);
        dm.setBo_headcnfmyn(bo_headcnfmyn);
        dm.setSubscnfmstatcd(subscnfmstatcd);
//        dm.setAplcpathcd(aplcpathcd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSExtn1000DAO dao = new SSExtn1000DAO();
        // DAO 객체의 selectList 호출
        ds = dao.selectOnlineExtnList(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.selectOnlineExtnList(dm);
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
     * 확장현황-신청현황-확장신청 상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectOnlineExtnDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_ON_RDR_EXTNDataSet ds = null;
        // Request Parameter Processing
        String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
        String rdr_extndt = req.getParameter("rdr_extndt");
        String rdr_extnno = req.getParameter("rdr_extnno");
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String cntrno = Util.checkString(req.getParameter("cntrno"));
        String mangno = Util.checkString(req.getParameter("mangno"));
        String boheadcnfmyn = Util.checkString(req.getParameter("boheadcnfmyn"));

        // DM Setting
        SS_S_ON_RDR_EXTNDM dm = new SS_S_ON_RDR_EXTNDM();
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setAplcpathcd(aplcpathcd);
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setCntrno(cntrno);
        dm.setMangno(mangno);
        dm.setBoheadcnfmyn(boheadcnfmyn);

        SSExtn1000DAO dao = new SSExtn1000DAO();
        // DAO 객체의 selectDetail 호출
        ds = dao.selectOnlineExtnDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.selectOnlineExtnDetail(dm);
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
     * 확장현황-제휴확장현황-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void jminit(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_RDR_JM_EXTN_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_RDR_JM_EXTN_INITDM dm = new SS_L_RDR_JM_EXTN_INITDM();

        SSExtn1000DAO dao = new SSExtn1000DAO();
        // DAO 객체의 init 호출
        ds = dao.jminit(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.jminit(dm);
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
