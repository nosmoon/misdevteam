/***************************************************************************************************
* 파일명   : SSExtn2000WB.java
* 기능     : 확장현황-중지현황 조회를 위한 Worker Bean
* 작성일자 : 2009-05-14
* 작성자   : 권정윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 확장현황-중지현황 조회를 위한 WB
 */

public class SSExtn2000WB{

    /**
     * 확장현황-중지현황-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void suspInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_SUSP_INITDataSet ds = null;
    	
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        
        // DM Setting
    	SS_L_EXTN_SUSP_INITDM dm = new SS_L_EXTN_SUSP_INITDM();

    	dm.setIncmg_pers(emp_no);
    	dm.setCmpy_cd(cmpycd);
    	
    	SSExtn2000DAO dao = new SSExtn2000DAO();
        // DAO 객체의 initApt 호출
        ds = dao.suspInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2000EJBHome home = (SSExtn2000EJBHome)JNDIManager.getInstance().getHome("SSExtn2000EJB");
        try{
                SSExtn2000EJB ejb = home.create();
                ds = ejb.suspInit(dm);
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
     * 확장현황-중지현황-목록(지국별)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectSuspList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_SUSPDataSet ds = null;
    	
    	String gubun = Util.checkString(req.getParameter("gubun"));
    	String deptcd = Util.checkString(req.getParameter("deptcd"));
    	String partcd = Util.checkString(req.getParameter("partcd"));
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String medicd = Util.checkString(req.getParameter("medicd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String susp = Util.checkString(req.getParameter("susp"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	
       	SS_L_EXTN_SUSPDM dm = new SS_L_EXTN_SUSPDM();
    	dm.setGubun(gubun);
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setMedicd(medicd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setSusp(susp);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers(incmg_pers);

    	SSExtn2000DAO dao = new SSExtn2000DAO();
        // DAO 객체의 initApt 호출
        ds = dao.selectSuspList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2000EJBHome home = (SSExtn2000EJBHome)JNDIManager.getInstance().getHome("SSExtn2000EJB");
        try{
                SSExtn2000EJB ejb = home.create();
                ds = ejb.selectSuspList(dm);
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
     * 확장현황-중지현황-목록(중지건별)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectSuspPerList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_SUSP_PERDataSet ds = null;
    	
    	String gubun = Util.checkString(req.getParameter("gubun"));
    	String deptcd = Util.checkString(req.getParameter("deptcd"));
    	String partcd = Util.checkString(req.getParameter("partcd"));
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String medicd = Util.checkString(req.getParameter("medicd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String susp = Util.checkString(req.getParameter("susp"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    	SS_L_EXTN_SUSP_PERDM dm = new SS_L_EXTN_SUSP_PERDM();
    	dm.setGubun(gubun);
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setMedicd(medicd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setSusp(susp);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers(incmg_pers);
    	
    	SSExtn2000DAO dao = new SSExtn2000DAO();
        // DAO 객체의 initApt 호출
        ds = dao.selectSuspPerList(dm);        
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2000EJBHome home = (SSExtn2000EJBHome)JNDIManager.getInstance().getHome("SSExtn2000EJB");
        try{
                SSExtn2000EJB ejb = home.create();
                ds = ejb.selectSuspPerList(dm);
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
