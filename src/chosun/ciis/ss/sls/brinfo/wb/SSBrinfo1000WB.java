/***************************************************************************************************
* 파일명 : SSBrinfo1000WB.java
* 기능 : 지국Info-지국찾기 처리를 위한 Worker Bean
* 작성일자 : 2004-02-02
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


/**
 * 지국Info-지국찾기 위한 WB
 */

public class SSBrinfo1000WB{

    /**
     * 지국Info-지국찾기 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_BO_SRCH_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_BO_SRCH_INITDM dm = new SS_L_BO_SRCH_INITDM();
        
        SSBrinfo1000DAO dao = new SSBrinfo1000DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrinfo1000EJBHome home = (SSBrinfo1000EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1000EJB");
        try{
            SSBrinfo1000EJB ejb = home.create();
            ds = ejb.selectInitList(dm);
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
     * 지국Info-지국찾기 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectBoSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BO_SRCH2DataSet ds = null;
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_L_BO_SRCH2DM dm = new SS_L_BO_SRCH2DM();
        dm.setAccflag(accflag);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBonm(bonm);
        dm.setBocd(bocd);

        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        
        SSBrinfo1000DAO dao = new SSBrinfo1000DAO();
		// DAO 객체의 selectBoSrchList 호출
		ds = dao.selectBoSrchList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrinfo1000EJBHome home = (SSBrinfo1000EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1000EJB");
        try{
            SSBrinfo1000EJB ejb = home.create();
            ds = ejb.selectBoSrchList(dm);
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
     * 지국Info-지국우편번호-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void initBoZip(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_JUSO_BO_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
    	SS_L_JUSO_BO_INITDM dm = new SS_L_JUSO_BO_INITDM();
    	
    	SSBrinfo1000DAO dao = new SSBrinfo1000DAO();
        // DAO 객체의 initBoZip 호출
        ds = dao.initBoZip(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1000EJBHome home = (SSBrinfo1000EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1000EJB");
        try{
            SSBrinfo1000EJB ejb = home.create();
            ds = ejb.initBoZip(dm);
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
     * 지국Info-지국우편번호-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectBoZipList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_JUSO_BODataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String zipcd = Util.checkString(req.getParameter("zipcd"));

        // DM Setting
        SS_L_JUSO_BODM dm = new SS_L_JUSO_BODM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        dm.setZipcd(zipcd);
        
        SSBrinfo1000DAO dao = new SSBrinfo1000DAO();
        // DAO 객체의 selectBoZipList 호출
        ds = dao.selectBoZipList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1000EJBHome home = (SSBrinfo1000EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1000EJB");
        try{
            SSBrinfo1000EJB ejb = home.create();
            ds = ejb.selectBoZipList(dm);
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
