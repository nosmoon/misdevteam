/***************************************************************************************************
 * 파일명 : SSBrsup3000WB.java
 * 기능 : 센터지원-빌링-지로출력이력
 * 작성일자 : 2017-12-26
 * 작성자 : 심정보
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
 * 센터지원-빌링-지로출력이력 위한 Worker Bean
 */

public class SSBrsup3000WB {

    /**
     * 센터지원-빌링-지로출력이력-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void initBrsup3000(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_SLS_BRSUP_3000_ADataSet ds = null;

        // Request Parameter Processing
    	String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
    	String auth_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("auth_gb")));
    	String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
    	String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));

    	// DM Setting
    	SS_SLS_BRSUP_3000_ADM dm = new SS_SLS_BRSUP_3000_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAuth_gb(auth_gb);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setBase_dt(base_dt);

    	dm.print();

        SSBrsup3000DAO dao = new SSBrsup3000DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.initBrsup3000(dm);
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
     * 센터지원-빌링-지로출력이력-리스트
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectBrsup3010(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_SLS_BRSUP_3010_LDataSet ds = null;
        // Request Parameter Processing

    	String deptcd = Util.checkString(req.getParameter("deptcd"));
    	String partcd = Util.checkString(req.getParameter("partcd"));
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String bocd = Util.checkString(req.getParameter("bocd"));    	
    	String fr_dt = Util.checkString(req.getParameter("fr_dt"));
    	String to_dt = Util.checkString(req.getParameter("to_dt"));
    	String rdr_no = Util.checkString(req.getParameter("rdr_no"));
    	String elecpymtno = Util.checkString(req.getParameter("elecpymtno"));

		// DM Setting
    	SS_SLS_BRSUP_3010_LDM dm = new SS_SLS_BRSUP_3010_LDM();

    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setFr_dt(fr_dt);
    	dm.setTo_dt(to_dt);
    	dm.setRdr_no(rdr_no);
    	dm.setElecpymtno(elecpymtno);
    	
    	dm.print();

		SSBrsup3000DAO dao = new SSBrsup3000DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.selectBrsup3010(dm);
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