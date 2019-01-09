/***************************************************************************************************
 * 파일명 : SSBrsup2100WB.java
 * 기능 : 지국지원-컴퓨터A/S,전단현황을 위한 Worker Bean
 * 작성일자 : 2004-02-20
 * 작성자 : 김대섭
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
 * 지국지원-컴퓨터A/S,전단현황을 위한 Worker Bean
 */

public class SSBrsup2100WB {

    /**
     * 지국지원-컴퓨터A/S-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAsreqList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_ASREQDataSet ds = null;
        // Request Parameter Processing

		String buseo = Util.checkString(req.getParameter("buseo"));
		String jycd = Util.checkString(req.getParameter("jycd"));
		String bocd = Util.checkString(req.getParameter("bocd"));
		String pageno = Util.checkString(req.getParameter("pageno"));
		String pagesize = Util.checkString(req.getParameter("pagesize"));
		String dt_kind = Util.checkString(req.getParameter("dt_kind"));
		String search_dt1 = Util.checkString(req.getParameter("search_dt1"));
		String search_dt2 = Util.checkString(req.getParameter("search_dt2"));
		String as_stat = Util.checkString(req.getParameter("as_stat"));

        // DM Setting
        SS_L_ASREQDM dm = new SS_L_ASREQDM();

        pageno = ("".equals(pageno)) ? "1" : pageno; // 'pageno'가 Null일경우 1을 반환
        pagesize = ("".equals(pagesize)) ? "5" : pagesize; // 'pagesize'가 Null일경우 20을 반환

		dm.setBuseo(buseo);
		dm.setJycd(jycd);
		dm.setBocd(bocd);
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));
		dm.setDt_kind(dt_kind);
		dm.setSearch_dt1(search_dt1);
		dm.setSearch_dt2(search_dt2);
		dm.setAs_stat(as_stat);

		SSBrsup2100DAO dao = new SSBrsup2100DAO();
        // DAO 객체의 selectAsreqList 호출
        ds = dao.selectAsreqList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2100EJBHome home = (SSBrsup2100EJBHome) JNDIManager.getInstance().getHome("SSBrsup2100EJB");
        try {
            SSBrsup2100EJB ejb = home.create();
            ds = ejb.selectAsreqList(dm);
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
     * 지국지원-컴퓨터A/S-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAsreqDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_ASREQDataSet ds = null;
        // Session Processing

        // Request Parameter Processing

		String bocd = Util.checkString(req.getParameter("bocd"));
		String flag = Util.checkString(req.getParameter("flag"));
		String eqpno = Util.checkString(req.getParameter("eqpno"));
		String regdt = Util.checkString(req.getParameter("regdt"));
		String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_ASREQDM dm = new SS_S_ASREQDM();

		dm.setBocd(bocd);
		dm.setFlag(flag);
		dm.setEqpno(eqpno);
		dm.setRegdt(regdt);
		dm.setRegno(regno);
		
		SSBrsup2100DAO dao = new SSBrsup2100DAO();
        // DAO 객체의 selectAsreqDetail 호출
        ds = dao.selectAsreqDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2100EJBHome home = (SSBrsup2100EJBHome) JNDIManager.getInstance().getHome("SSBrsup2100EJB");
        try {
            SSBrsup2100EJB ejb = home.create();
            ds = ejb.selectAsreqDetail(dm);
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
     * 지국지원-컴퓨터A/S-등록,수정,삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void accessAsreq(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_ASREQDataSet ds = null;
        // Session Processing

        // Request Parameter Processing
		String accflag = Util.checkString(req.getParameter("accflag"));
		String bocd = Util.checkString(req.getParameter("bocd"));
		String eqpno = Util.checkString(req.getParameter("eqpno"));
		String regno = Util.checkString(req.getParameter("regno"));
		String regdt = Util.checkString(req.getParameter("regdt"));
		String req_rmk = Util.Uni2Ksc(Util.checkString(req.getParameter("req_rmk")));
		String as_stat = Util.checkString(req.getParameter("as_stat"));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // DM Setting
        SS_A_ASREQDM dm = new SS_A_ASREQDM();

		dm.setAccflag(accflag);
		dm.setBocd(bocd);
		dm.setEqpno(eqpno);
		dm.setRegno(regno);
		dm.setRegdt(regdt);
		dm.setReq_rmk(req_rmk);
		dm.setAs_stat(as_stat);
		dm.setIncmgpers(incmgpers);
		
		SSBrsup2100DAO dao = new SSBrsup2100DAO();
        // DAO 객체의 updateInsrAccd 호출
        ds = dao.accessAsreq(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2100EJBHome home = (SSBrsup2100EJBHome) JNDIManager.getInstance().getHome("SSBrsup2100EJB");
        try {
            SSBrsup2100EJB ejb = home.create();
            ds = ejb.accessAsreq(dm);
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
     * 지국지원-전단현황-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initLeafScat(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_COMMDEPTCDDataSet ds = null;

        // DM Setting
    	SS_L_COMMDEPTCDDM dm = new SS_L_COMMDEPTCDDM();
    	
    	SSBrsup2100DAO dao = new SSBrsup2100DAO();
        // DAO 객체의 initLeafScat 호출
        ds = dao.initLeafScat(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2100EJBHome home = (SSBrsup2100EJBHome) JNDIManager.getInstance().getHome("SSBrsup2100EJB");
        try {
            SSBrsup2100EJB ejb = home.create();
            ds = ejb.initLeafScat(dm);
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
     * 지국지원-전단현황-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectLeafScatList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_ISLEAF_SCATDataSet ds = null;
        // Request Parameter Processing

        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);
        String advtmain = Util.Uni2Ksc(Util.checkString(req.getParameter("advtmain")));
        String compnm = Util.checkString(req.getParameter("compnm"));

        // DM Setting
        SS_L_ISLEAF_SCATDM dm = new SS_L_ISLEAF_SCATDM();

        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        dm.setAdvtmain(advtmain);
        dm.setCompnm(compnm);
        
        SSBrsup2100DAO dao = new SSBrsup2100DAO();
        // DAO 객체의 selectLeafScatList 호출
        ds = dao.selectLeafScatList(dm);

        /*
        SSBrsup2100EJBHome home = (SSBrsup2100EJBHome) JNDIManager.getInstance().getHome("SSBrsup2100EJB");
        try {
            SSBrsup2100EJB ejb = home.create();
            ds = ejb.selectLeafScatList(dm);
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
