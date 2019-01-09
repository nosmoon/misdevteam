/***************************************************************************************************
 * 파일명 : SSBrsup2900WB.java
 * 기능 : 센터지원=판촉현황-요원관리-요원별실적관리
 * 작성일자 : 2016-05-02
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;

import java.rmi.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 센터지원-판촉현황-요원관리-요원별실적관리를 위한 Worker Bean
 */

public class SSBrsup2900WB {

    /**
     * 센터지원-판촉현황-요원관리-요원별실적관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void initBrsup2900(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_SLS_BRSUP_2900_ADataSet ds = null;

        // Request Parameter Processing
    	String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
    	String auth_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("auth_gb")));
    	String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
    	String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));

    	// DM Setting
    	SS_SLS_BRSUP_2900_ADM dm = new SS_SLS_BRSUP_2900_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAuth_gb(auth_gb);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setBase_dt(base_dt);

    	dm.print();

        SSBrsup2900DAO dao = new SSBrsup2900DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.initBrsup2900(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2600EJBHome home = (SSBrsup2600EJBHome)JNDIManager.getInstance().getHome("SSBrsup2600EJB");
        try{
            SSBrsup2600EJB ejb = home.create();
            ds = ejb.listSearchTransfer(dm);
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
     * 센터지원-판촉현황-요원관리-요원별실적관리-리스트
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectBrsup2910(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_SLS_BRSUP_2910_LDataSet ds = null;
        // Request Parameter Processing

    	String deptcd = Util.checkString(req.getParameter("deptcd"));
    	String partcd = Util.checkString(req.getParameter("partcd"));
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
    	String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
    	String stafno = Util.checkString(req.getParameter("stafno"));
    	String stafnm = Util.checkString(req.getParameter("stafnm"));
    	String prn = Util.checkString(req.getParameter("prn"));
    	String ernno = Util.checkString(req.getParameter("ernno"));
    	String stmm = Util.checkString(req.getParameter("stmm"));
    	String edmm = Util.checkString(req.getParameter("edmm"));
    	String flag = Util.checkString(req.getParameter("flag"));

		// DM Setting
    	SS_SLS_BRSUP_2910_LDM dm = new SS_SLS_BRSUP_2910_LDM();

    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setStafclsfcd(stafclsfcd);
    	dm.setCntrstatcd(cntrstatcd);
    	dm.setStafno(stafno);
    	dm.setStafnm(stafnm);
    	dm.setPrn(prn);
    	dm.setErnno(ernno);
    	dm.setStmm(stmm);
    	dm.setEdmm(edmm);
    	dm.setFlag(flag);

    	dm.print();

		SSBrsup2900DAO dao = new SSBrsup2900DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.selectBrsup2910(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2600EJBHome home = (SSBrsup2600EJBHome)JNDIManager.getInstance().getHome("SSBrsup2600EJB");
        try{
            SSBrsup2600EJB ejb = home.create();
            ds = ejb.detailSearchTransfer(dm);
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
     * 센터지원-판촉현황-요원관리-요원별실적관리-리스트-상세(팝업)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectBrsup2920(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_SLS_BRSUP_2920_SDataSet ds = null;
        // Request Parameter Processing

    	String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
    	String stafno = Util.checkString(req.getParameter("stafno"));
    	String clsfdtls = Util.checkString(req.getParameter("clsfdtls"));
    	String stmm = Util.checkString(req.getParameter("stmm"));
    	String edmm = Util.checkString(req.getParameter("edmm"));

		// DM Setting
    	SS_SLS_BRSUP_2920_SDM dm = new SS_SLS_BRSUP_2920_SDM();

    	dm.setStafclsfcd(stafclsfcd);
    	dm.setStafno(stafno);
    	dm.setClsfdtls(clsfdtls);
    	dm.setStmm(stmm);
    	dm.setEdmm(edmm);

    	dm.print();

		SSBrsup2900DAO dao = new SSBrsup2900DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.selectBrsup2920(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2600EJBHome home = (SSBrsup2600EJBHome)JNDIManager.getInstance().getHome("SSBrsup2600EJB");
        try{
            SSBrsup2600EJB ejb = home.create();
            ds = ejb.detailSearchTransfer(dm);
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