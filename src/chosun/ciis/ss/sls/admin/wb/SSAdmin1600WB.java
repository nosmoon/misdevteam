/***************************************************************************************************
 * 파일명 : SSAdmin1600WB.java
 * 기능 : 우편번호 관리를 위한 Worker Bean
 * 작성일자 : 2009-04-27
 * 작성자 :  권정윤
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

public class SSAdmin1600WB {
    /**
     * 관리자-담당별 우편번호 변경처리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_CHGZIPCODE_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
    	SS_L_CHGZIPCODE_INITDM dm = new SS_L_CHGZIPCODE_INITDM();
    	
    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 initBoclos 호출
        ds = dao.initZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.initZipCode(dm);
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
     * 관리자-담당별 우편번호 변경처리-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_CHGZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String zipcode = Util.checkString(req.getParameter("zipcode"));
    	String areagubun = Util.checkString(req.getParameter("areaGubun"));
    	String areaname = Util.checkString(req.getParameter("areaName"));
    	String workver = Util.checkString(req.getParameter("workver"));
    	String chggubun = Util.checkString(req.getParameter("chgGubun"));

        // DM Setting
        SS_L_CHGZIPCODEDM dm = new SS_L_CHGZIPCODEDM();
        dm.setUid(uid);
        dm.setZipcode(zipcode);
        dm.setAreagubun(areagubun);
        dm.setAreaname(areaname);
        dm.setWorkver(workver);
        dm.setChggubun(chggubun);
        
        SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.selectZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.selectZipCode(dm);
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
     * 관리자-담당별 우편번호 변경처리-상세조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void detailZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_S_CHGZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	
    	String workver = Util.checkString(req.getParameter("workver"));
    	String zip1 = Util.checkString(req.getParameter("zip1"));
    	String zip2 = Util.checkString(req.getParameter("zip2"));
    	String zip3 = Util.checkString(req.getParameter("zip3"));
    	String chggubun = Util.checkString(req.getParameter("chggubun"));
    	
        // DM Setting
        SS_S_CHGZIPCODEDM dm = new SS_S_CHGZIPCODEDM();
        dm.setUid(uid);
        dm.setWorkver(workver);
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setZip3(zip3);
        dm.setChggubun(chggubun);
        
        SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.detailZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.detailZipCode(dm);
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
     * 관리자-담당별 우편번호 변경처리-복수조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void unionZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_S_UNIONCHGZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	
    	String workver = Util.checkString(req.getParameter("workver"));
    	String zip1 = Util.checkString(req.getParameter("zip1"));
    	String zip2 = Util.checkString(req.getParameter("zip2"));
    	String zip3 = Util.checkString(req.getParameter("zip3"));
    	String chggubun = Util.checkString(req.getParameter("chggubun"));
    	    	
        // DM Setting
        SS_S_UNIONCHGZIPCODEDM dm = new SS_S_UNIONCHGZIPCODEDM();        
        dm.setUid(uid);
        dm.setWorkver(workver);
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setZip3(zip3);
        dm.setChggubun(chggubun);
        
        SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.unionZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.unionZipCode(dm);
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
     * 관리자-담당별 우편번호 변경처리-판매국 복사
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void copyZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_I_COPYZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	String workver = Util.checkString(req.getParameter("workver"));

    	String zip1_cnfm = Util.checkString(req.getParameter("zip1_cnfm"));
    	String zip2_cnfm = Util.checkString(req.getParameter("zip2_cnfm"));
    	String zip3_cnfm = Util.checkString(req.getParameter("zip3_cnfm"));
    	String newzipcode_cnfm = Util.checkString(req.getParameter("newzipcode_cnfm"));
    	String oldzipcode_cnfm = Util.checkString(req.getParameter("oldzipcode_cnfm"));
    	String chgclsf_cnfm = Util.checkString(req.getParameter("chgclsf_cnfm"));
    	
        // DM Setting
    	SS_I_COPYZIPCODEDM dm = new SS_I_COPYZIPCODEDM();
    	dm.setUid(uid);
    	dm.setWorkver(workver);
    	
    	dm.setZip1_cnfm(zip1_cnfm);
    	dm.setZip2_cnfm(zip2_cnfm);
    	dm.setZip3_cnfm(zip3_cnfm);
    	dm.setNewzipcode_cnfm(newzipcode_cnfm);
    	dm.setOldzipcode_cnfm(oldzipcode_cnfm);
    	dm.setChgclsf_cnfm(chgclsf_cnfm);
    	
              
    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.copyZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.copyZipCode(dm);
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
     * 관리자-담당별 우편번호 변경처리-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_D_CHGZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String workver = Util.checkString(req.getParameter("workver"));
    	String chgclsf_cnfm = Util.checkString(req.getParameter("chgclsf_cnfm"));
    	String zip1_cnfm = Util.checkString(req.getParameter("zip1_cnfm"));
    	String zip2_cnfm = Util.checkString(req.getParameter("zip2_cnfm"));
    	String zip3_cnfm = Util.checkString(req.getParameter("zip3_cnfm"));
    	
        // DM Setting
    	SS_D_CHGZIPCODEDM dm = new SS_D_CHGZIPCODEDM();
    	dm.setUid(uid);
    	dm.setWorkver(workver);
    	dm.setChgclsf_cnfm(chgclsf_cnfm);
    	dm.setZip1_cnfm(zip1_cnfm);
    	dm.setZip2_cnfm(zip2_cnfm);
    	dm.setZip3_cnfm(zip3_cnfm);
    	
    	SSAdmin1600DAO dao = new SSAdmin1600DAO();            
        // DAO 객체의 selectBoclosList 호출
        ds = dao.deleteZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*      
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.deleteZipCode(dm);
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
     * 관리자-담당별 우편번호 변경처리-승인요청
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void reqZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_CHGZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String workver = Util.checkString(req.getParameter("workver"));
    	String chgclsf_cnfm = Util.checkString(req.getParameter("chgclsf_cnfm"));
    	String zip1_cnfm = Util.checkString(req.getParameter("zip1_cnfm"));
    	String zip2_cnfm = Util.checkString(req.getParameter("zip2_cnfm"));
    	String zip3_cnfm = Util.checkString(req.getParameter("zip3_cnfm"));
    	
        // DM Setting
    	SS_U_CHGZIPCODEDM dm = new SS_U_CHGZIPCODEDM();
    	dm.setUid(uid);
    	dm.setWorkver(workver);
    	dm.setChgclsf_cnfm(chgclsf_cnfm);
    	dm.setZip1_cnfm(zip1_cnfm);
    	dm.setZip2_cnfm(zip2_cnfm);
    	dm.setZip3_cnfm(zip3_cnfm);
              
    	SSAdmin1600DAO dao = new SSAdmin1600DAO();            
        // DAO 객체의 selectBoclosList 호출            
        ds = dao.reqZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.reqZipCode(dm);
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
     * 관리자-담당별 우편번호 변경처리-저장(하단)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_I_CHGZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String workver = Util.checkString(req.getParameter("workver"));
    	String zip1_cnfm = Util.checkString(req.getParameter("zip1_cnfm"));
    	String zip2_cnfm = Util.checkString(req.getParameter("zip2_cnfm"));
    	String zip3_cnfm = Util.checkString(req.getParameter("zip3_cnfm"));
    	String newaddr1_cnfm = Util.checkString(req.getParameter("newaddr1_cnfm"));
    	String newaddr2_cnfm = Util.checkString(req.getParameter("newaddr2_cnfm"));
    	String newaddr3_cnfm = Util.checkString(req.getParameter("newaddr3_cnfm"));
    	String newaddr4_cnfm = Util.checkString(req.getParameter("newaddr4_cnfm"));
    	String newbgnbnji_cnfm = Util.checkString(req.getParameter("newbgnbnji_cnfm"));
    	String newendbnji_cnfm = Util.checkString(req.getParameter("newendbnji_cnfm"));
    	String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
    	
        // DM Setting
    	SS_I_CHGZIPCODEDM dm = new SS_I_CHGZIPCODEDM();
    	dm.setUid(uid);
    	dm.setWorkver(workver);
    	dm.setZip1_cnfm(zip1_cnfm);
    	dm.setZip2_cnfm(zip2_cnfm);
    	dm.setZip3_cnfm(zip3_cnfm);
    	dm.setNewaddr1_cnfm(newaddr1_cnfm);
    	dm.setNewaddr2_cnfm(newaddr2_cnfm);
    	dm.setNewaddr3_cnfm(newaddr3_cnfm);
    	dm.setNewaddr4_cnfm(newaddr4_cnfm);
    	dm.setNewbgnbnji_cnfm(newbgnbnji_cnfm);
    	dm.setNewendbnji_cnfm(newendbnji_cnfm);
    	dm.setBocd_cnfm(bocd_cnfm);
              
    	
    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.updateZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.updateZipCode(dm);
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
     * 관리자-담당별 우편번호 일괄등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void uploadZipCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_UPLOADZIPCODEDataSet ds = null;
        // Request Parameter Processing

    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	String gubun_cnfm      = Util.checkString(req.getParameter("gubun_cnfm"));
    	String oldzip1_cnfm    = Util.checkString(req.getParameter("oldzip1_cnfm"));
    	String oldzip2_cnfm    = Util.checkString(req.getParameter("oldzip2_cnfm"));
    	String oldzip3_cnfm    = Util.checkString(req.getParameter("oldzip3_cnfm"));
    	String oldzip4_cnfm    = Util.checkString(req.getParameter("oldzip4_cnfm"));
    	String oldaddr1_cnfm   = Util.checkString(req.getParameter("oldaddr1_cnfm"));
    	String oldaddr2_cnfm   = Util.checkString(req.getParameter("oldaddr2_cnfm"));
    	String oldaddr3_cnfm   = Util.checkString(req.getParameter("oldaddr3_cnfm"));
    	String oldaddr4_cnfm   = Util.checkString(req.getParameter("oldaddr4_cnfm"));
    	String oldbgnbnji_cnfm = Util.checkString(req.getParameter("oldbgnbnji_cnfm"));
    	String oldendbnji_cnfm = Util.checkString(req.getParameter("oldendbnji_cnfm"));
    	String newzip1_cnfm    = Util.checkString(req.getParameter("newzip1_cnfm"));
    	String newzip2_cnfm    = Util.checkString(req.getParameter("newzip2_cnfm"));
    	String newzip3_cnfm    = Util.checkString(req.getParameter("newzip3_cnfm"));
    	String newzip4_cnfm    = Util.checkString(req.getParameter("newzip4_cnfm"));
    	String newaddr1_cnfm   = Util.checkString(req.getParameter("newaddr1_cnfm"));
    	String newaddr2_cnfm   = Util.checkString(req.getParameter("newaddr2_cnfm"));
    	String newaddr3_cnfm   = Util.checkString(req.getParameter("newaddr3_cnfm"));
    	String newaddr4_cnfm   = Util.checkString(req.getParameter("newaddr4_cnfm"));
    	String newbgnbnji_cnfm = Util.checkString(req.getParameter("newbgnbnji_cnfm"));
    	String newendbnji_cnfm = Util.checkString(req.getParameter("newendbnji_cnfm"));
    	String chgresn_cnfm    = Util.checkString(req.getParameter("chgresn_cnfm"));

        // DM Setting
    	SS_L_UPLOADZIPCODEDM dm = new SS_L_UPLOADZIPCODEDM();

    	dm.setUid(uid);
    	dm.setGubun_cnfm(gubun_cnfm);
    	dm.setOldzip1_cnfm(oldzip1_cnfm);
    	dm.setOldzip2_cnfm(oldzip2_cnfm);
    	dm.setOldzip3_cnfm(oldzip3_cnfm);
    	dm.setOldzip4_cnfm(oldzip4_cnfm);
    	dm.setOldaddr1_cnfm(oldaddr1_cnfm);
    	dm.setOldaddr2_cnfm(oldaddr2_cnfm);
    	dm.setOldaddr3_cnfm(oldaddr3_cnfm);
    	dm.setOldaddr4_cnfm(oldaddr4_cnfm);
    	dm.setOldbgnbnji_cnfm(oldbgnbnji_cnfm);
    	dm.setOldendbnji_cnfm(oldendbnji_cnfm);
    	dm.setNewzip1_cnfm(newzip1_cnfm);
    	dm.setNewzip2_cnfm(newzip2_cnfm);
    	dm.setNewzip3_cnfm(newzip3_cnfm);
    	dm.setNewzip4_cnfm(newzip4_cnfm);
    	dm.setNewaddr1_cnfm(newaddr1_cnfm);
    	dm.setNewaddr2_cnfm(newaddr2_cnfm);
    	dm.setNewaddr3_cnfm(newaddr3_cnfm);
    	dm.setNewaddr4_cnfm(newaddr4_cnfm);
    	dm.setNewbgnbnji_cnfm(newbgnbnji_cnfm);
    	dm.setNewendbnji_cnfm(newendbnji_cnfm);
    	dm.setChgresn_cnfm(chgresn_cnfm);

    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.uploadZipCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.uploadZipCode(dm);
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
     * 관리자-마스터 우편번호 변경처리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initMstZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_CHGZIPCODE_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
    	SS_L_CHGZIPCODE_INITDM dm = new SS_L_CHGZIPCODE_INITDM();
    	
    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.initMstZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.initMstZip(dm);
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
     * 관리자-마스터 우편번호 변경처리-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMstZip(HttpServletRequest req, HttpServletResponse res) throws AppException {   
    	SS_L_MSTZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String zipcode = Util.checkString(req.getParameter("zipcode"));
    	String areagubun = Util.checkString(req.getParameter("areaGubun"));
    	String areaname = Util.checkString(req.getParameter("areaName"));
    	String workver = Util.checkString(req.getParameter("workver"));
    	String chggubun = Util.checkString(req.getParameter("chgGubun"));

        // DM Setting
    	SS_L_MSTZIPCODEDM dm = new SS_L_MSTZIPCODEDM();
        dm.setUid(uid);
        dm.setZipcode(zipcode);
        dm.setAreagubun(areagubun);
        dm.setAreaname(areaname);
        dm.setWorkver(workver);
        dm.setChggubun(chggubun);
        
        SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.selectMstZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.selectMstZip(dm);
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
     * 관리자-마스터 우편번호 변경처리-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateMstZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_MSTZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String workver = Util.checkString(req.getParameter("workver"));
    	String newzip1_cnfm = Util.checkString(req.getParameter("newzip1_cnfm"));
    	String newzip2_cnfm = Util.checkString(req.getParameter("newzip2_cnfm"));
    	String newzip3_cnfm = Util.checkString(req.getParameter("newzip3_cnfm"));
    	String newzip4_cnfm = Util.checkString(req.getParameter("newzip4_cnfm"));
    	String stat_cnfm = Util.checkString(req.getParameter("stat_cnfm"));
    	String chgclsf_cnfm = Util.checkString(req.getParameter("chgclsf_cnfm"));
    	String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
    	
        // DM Setting
    	SS_U_MSTZIPCODEDM dm = new SS_U_MSTZIPCODEDM();
    	dm.setUid(uid);
    	dm.setWorkver(workver);
    	dm.setNewzip1_cnfm(newzip1_cnfm);
    	dm.setNewzip2_cnfm(newzip2_cnfm);
    	dm.setNewzip3_cnfm(newzip3_cnfm);
    	dm.setNewzip4_cnfm(newzip4_cnfm);
    	dm.setStat_cnfm(stat_cnfm);
    	dm.setChgclsf_cnfm(chgclsf_cnfm);
    	dm.setBocd_cnfm(bocd_cnfm);

    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.updateMstZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.updateMstZip(dm);
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
     * 관리자-마스터 우편번호 변경처리-승인
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void apprMstZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_MSTAPPRZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String newzip1 = Util.checkString(req.getParameter("newzip1"));
    	String newzip2 = Util.checkString(req.getParameter("newzip2"));
    	String newzip3 = Util.checkString(req.getParameter("newzip3"));
    	String newzip4 = Util.checkString(req.getParameter("newzip4"));
    	String workver = Util.checkString(req.getParameter("workver"));
    	
        // DM Setting
    	SS_U_MSTAPPRZIPCODEDM dm = new SS_U_MSTAPPRZIPCODEDM();
    	dm.setUid(uid);
    	dm.setNewzip1(newzip1);
    	dm.setNewzip2(newzip2);
    	dm.setNewzip3(newzip3);
    	dm.setNewzip4(newzip4);
    	dm.setWorkver(workver);

    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.apprMstZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.apprMstZip(dm);
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
     * 관리자-일괄 우편번호 변경처리-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBatZip(HttpServletRequest req, HttpServletResponse res) throws AppException {    	
    	SS_L_BATZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String zipcode = Util.checkString(req.getParameter("zipcode"));
    	String areagubun = Util.checkString(req.getParameter("areaGubun"));
    	String areaname = Util.checkString(req.getParameter("areaName"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    
        // DM Setting
    	SS_L_BATZIPCODEDM dm = new SS_L_BATZIPCODEDM();
    	dm.setUid(uid);
    	dm.setZipcode(zipcode);
    	dm.setAreagubun(areagubun);
    	dm.setAreaname(areaname);
    	dm.setBocd(bocd);
        
    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.selectBatZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.selectBatZip(dm);
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
     * 관리자-일괄 우편번호 변경처리-일괄적용
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateBatZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_BATZIPCODEDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String newzip1_cnfm = Util.checkString(req.getParameter("newzip1_cnfm"));
    	String newzip2_cnfm = Util.checkString(req.getParameter("newzip2_cnfm"));
    	String newzip3_cnfm = Util.checkString(req.getParameter("newzip3_cnfm"));
    	String newzip4_cnfm = Util.checkString(req.getParameter("newzip4_cnfm"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	    	
        // DM Setting
    	SS_U_BATZIPCODEDM dm = new SS_U_BATZIPCODEDM();
    	dm.setUid(uid);
    	dm.setNewzip1_cnfm(newzip1_cnfm);
    	dm.setNewzip2_cnfm(newzip2_cnfm);
    	dm.setNewzip3_cnfm(newzip3_cnfm);
    	dm.setNewzip4_cnfm(newzip4_cnfm);
    	dm.setBocd(bocd);

    	SSAdmin1600DAO dao = new SSAdmin1600DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.updateBatZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1600EJBHome home = (SSAdmin1600EJBHome) JNDIManager.getInstance().getHome("SSAdmin1600EJB");
        try {
            SSAdmin1600EJB ejb = home.create();
            ds = ejb.updateBatZip(dm);
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



