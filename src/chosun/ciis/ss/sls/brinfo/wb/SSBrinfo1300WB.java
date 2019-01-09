/***************************************************************************************************
* 파일명 : SSBrinfo1300WB.java
* 기능 : 지국Info-지국조직현황 처리를 위한 Worker Bean
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
 * 지국Info-지국조직현황 위한 WB
 */

public class SSBrinfo1300WB{

    /**
     * 지국Info-지국조직현황 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_BOEMP_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_BOEMP_INITDM dm = new SS_L_BOEMP_INITDM();
        
        SSBrinfo1300DAO dao = new SSBrinfo1300DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1300EJBHome home = (SSBrinfo1300EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1300EJB");
        try{
            SSBrinfo1300EJB ejb = home.create();
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
     * 지국Info-지국조직현황 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoempList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOEMPDataSet ds = null;
        // Request Parameter Processing
        String viewflag = Util.checkString(req.getParameter("viewflag"));  //조회구분
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_BOEMPDM dm = new SS_L_BOEMPDM();
        dm.setViewflag(viewflag);//조회구분
        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드

        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        
        SSBrinfo1300DAO dao = new SSBrinfo1300DAO();
		// DAO 객체의 selectBoempList 호출
		ds = dao.selectBoempList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1300EJBHome home = (SSBrinfo1300EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1300EJB");
        try{
            SSBrinfo1300EJB ejb = home.create();
            ds = ejb.selectBoempList(dm);
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
     * 지국Info-지국조직현황-상세목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoempDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOEMP_DTLDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드

        // DM Setting
        SS_L_BOEMP_DTLDM dm = new SS_L_BOEMP_DTLDM();
        dm.setBocd(bocd);      //지국코드
        
        SSBrinfo1300DAO dao = new SSBrinfo1300DAO();
        // DAO 객체의 selectBoempDetailList 호출
        ds = dao.selectBoempDetailList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1300EJBHome home = (SSBrinfo1300EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1300EJB");
        try{
            SSBrinfo1300EJB ejb = home.create();
            ds = ejb.selectBoempDetailList(dm);
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