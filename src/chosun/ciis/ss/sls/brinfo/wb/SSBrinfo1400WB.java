/***************************************************************************************************
* 파일명 : SSBrinfo1400WB.java
* 기능 : 지국Info-지국비품현황-현황 처리를 위한 Worker Bean
* 작성일자 : 2004-01-27
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
 * 지국Info-지국비품현황-현황 위한 WB
 */

public class SSBrinfo1400WB{

    /**
     * 지국Info-지국비품현황-현황 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_ASET_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_ASET_INITDM dm = new SS_L_ASET_INITDM();
        
        SSBrinfo1400DAO dao = new SSBrinfo1400DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
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
     * 지국Info-지국비품현황-현황 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectAsetList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_ASETDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_ASETDM dm = new SS_L_ASETDM();
        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드

        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        
        SSBrinfo1400DAO dao = new SSBrinfo1400DAO();
		// DAO 객체의 selectAsetList 호출
		ds = dao.selectAsetList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
            ds = ejb.selectAsetList(dm);
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
     * 지국Info-지국비품현황-상세 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectAsetDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_ASET_DTLDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String asetclascd = Util.checkString(req.getParameter("asetclascd"));  //비품분류코드
        String asetnm = Util.checkString(req.getParameter("asetnm"));  //비품명
        String frdt = Util.checkString(req.getParameter("frdt")); //시작일
        String todt = Util.checkString(req.getParameter("todt")); //종료일

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_ASET_DTLDM dm = new SS_L_ASET_DTLDM();
        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setAsetclascd(asetclascd);
        dm.setAsetnm(asetnm);
        dm.setFrdt(frdt);   //시작일
        dm.setTodt(todt);   //종료일

        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        
        SSBrinfo1400DAO dao = new SSBrinfo1400DAO();
		// DAO 객체의 selectAsetDetailList 호출
		ds = dao.selectAsetDetailList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
            ds = ejb.selectAsetDetailList(dm);
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
     * 지국Info-지국비품현황-상세-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectAsetDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_ASET_DTLDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String asetseq = Util.checkString(req.getParameter("asetseq"));

        // DM Setting
        SS_S_ASET_DTLDM dm = new SS_S_ASET_DTLDM();
        dm.setBocd(bocd);
        dm.setAsetseq(asetseq);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
            ds = ejb.selectAsetDetail(dm);
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