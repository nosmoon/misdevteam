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

public class SSExtn2300WB {

    /**
     * 확장현황-사원확장통계-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_EXTN_RDR_STATS_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
    	SS_L_EXTN_RDR_STATS_INITDM dm = new SS_L_EXTN_RDR_STATS_INITDM();

        SSExtn2300DAO dao = new SSExtn2300DAO();
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
     * 확장현황-사원확장 통계 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrExtnStatList(HttpServletRequest req, HttpServletResponse res) throws AppException {    	
    	SS_L_EXTN_RDR_STATSDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
        String officd = Util.Uni2Ksc(Util.checkString(req.getParameter("officd")));
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
        String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        String fixdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fixdt")));
        String extnqty = Util.Uni2Ksc(Util.checkString(req.getParameter("extnqty")));
        String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
        String searchflag = Util.Uni2Ksc(Util.checkString(req.getParameter("searchflag")));        
        
        // DM Setting
        SS_L_EXTN_RDR_STATSDM dm = new SS_L_EXTN_RDR_STATSDM();
        dm.setCmpycd(cmpycd);
        dm.setOfficd(officd);
        dm.setDeptcd(deptcd);
        dm.setEmpnm(empnm);
        dm.setFromtogb(fromtogb);        
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setFixdt(fixdt);
        dm.setExtnqty(extnqty);
        dm.setBo_headcnfmyn(bo_headcnfmyn);
        dm.setSearchflag(searchflag);        

        SSExtn2300DAO dao = new SSExtn2300DAO();
        // DAO 객체의 selectList 호출
        ds = dao.selectRdrExtnStatList(dm);
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
}
