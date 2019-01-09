/***************************************************************************************************
* 파일명 : SSReader1200WB.java
* 기능 : 독자현황-VacationStop-신청 처리를 위한 Worker Bean
* 작성일자 : 2004-01-14
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
 * 독자현황-VacationStop-신청 위한 WB
 */

public class SSReader1200WB{

    /**
     * 독자현황-VacationStop-신청 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_VS_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_VS_INITDM dm = new SS_L_VS_INITDM();
        
        SSReader1200DAO dao = new SSReader1200DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1200EJBHome home = (SSReader1200EJBHome)JNDIManager.getInstance().getHome("SSReader1200EJB");
        try{
            SSReader1200EJB ejb = home.create();
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
     * 독자현황-VacationStop-신청 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectVsList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_VSDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));  //파트코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));  //경로코드
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //기간선택종류
        String frdt = Util.checkString(req.getParameter("frdt")); //시작일
        String todt = Util.checkString(req.getParameter("todt")); //종료일
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm"))); //독자명
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //현지국확인
        String vaca_areadlvofficnfmyn = Util.checkString(req.getParameter("vaca_areadlvofficnfmyn"));  //배달지국확인
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));  //서비스 코드

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_L_VSDM dm = new SS_L_VSDM();
        dm.setDeptcd(deptcd);  //부서코드
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setFromtogb(fromtogb);  //기간종류
        dm.setFrdt(frdt);   //시작일
        dm.setTodt(todt);   //종료일
        dm.setRdrnm(rdrnm); //독자명
        dm.setBocnfmyn(bocnfmyn);  //현지국확인
        dm.setVaca_areadlvofficnfmyn(vaca_areadlvofficnfmyn);  //배달지국확인
        dm.setAplcpathcd(aplcpathcd);  //경로코드
        dm.setClsfcd(clsfcd);  //서비스코드
        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈

        SSReader1200DAO dao = new SSReader1200DAO();
		// DAO 객체의 selectVsList 호출
		ds = dao.selectVsList(dm);
		req.setAttribute("ds", ds);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
		
        /*
        SSReader1200EJBHome home = (SSReader1200EJBHome)JNDIManager.getInstance().getHome("SSReader1200EJB");
        try{
            SSReader1200EJB ejb = home.create();
            ds = ejb.selectVsList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * 독자현황-VacationStop-신청 상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectVsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_VSDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_VSDM dm = new SS_S_VSDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSReader1200DAO dao = new SSReader1200DAO();
		// DAO 객체의 selectVsDetail 호출
		ds = dao.selectVsDetail(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1200EJBHome home = (SSReader1200EJBHome)JNDIManager.getInstance().getHome("SSReader1200EJB");
        try{
            SSReader1200EJB ejb = home.create();
            ds = ejb.selectVsDetail(dm);
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