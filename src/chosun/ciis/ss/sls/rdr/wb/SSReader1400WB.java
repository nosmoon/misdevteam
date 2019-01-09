/***************************************************************************************************
* 파일명 : SSReader1400WB.java
* 기능 : 독자현황-VacationStop-비용 처리를 위한 Worker Bean
* 작성일자 : 2004-01-17
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-VacationStop-비용 위한 WB
 */

public class SSReader1400WB{

    /**
     * 독자현황-VacationStop-비용 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_VSCOST_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_VSCOST_INITDM dm = new SS_L_VSCOST_INITDM();

        SSReader1400DAO dao = new SSReader1400DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1400EJBHome home = (SSReader1400EJBHome)JNDIManager.getInstance().getHome("SSReader1400EJB");
        try{
            SSReader1400EJB ejb = home.create();
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
     * 독자현황-VacationStop-비용 휴가지역코드,코드명 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVacaAreaList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_VSCD_AREANMDataSet ds = null;
        // Request Parameter Processing
        String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("common_vaca_arearegncd")));

        // DM Setting
        SS_L_VSCD_AREANMDM dm = new SS_L_VSCD_AREANMDM();
        dm.setVaca_arearegncd(vaca_arearegncd);
        
        SSReader1400DAO dao = new SSReader1400DAO();
		// DAO 객체의 selectVacaAreaList 호출
		ds = dao.selectVacaAreaList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1400EJBHome home = (SSReader1400EJBHome)JNDIManager.getInstance().getHome("SSReader1400EJB");
        try{
            SSReader1400EJB ejb = home.create();
            ds = ejb.selectVacaAreaList(dm);
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
     * 독자현황-VacationStop-비용 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectVscostList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_VSCOST_COSTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));   //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));   //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));       //지국코드
        String frdt = Util.checkString(req.getParameter("frdt"));       //시작일
        String todt = Util.checkString(req.getParameter("todt"));       //종료일

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_VSCOST_COSTDM dm = new SS_L_VSCOST_COSTDM();
        dm.setDeptcd(deptcd );  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setFrdt(frdt);   //시작일
        dm.setTodt(todt);   //종료일
        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈

		SSReader1400DAO dao = new SSReader1400DAO();
		// DAO 객체의 selectVscostList 호출
		ds = dao.selectVscostList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1400EJBHome home = (SSReader1400EJBHome)JNDIManager.getInstance().getHome("SSReader1400EJB");
        try{
            SSReader1400EJB ejb = home.create();
            ds = ejb.selectVscostList(dm);
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