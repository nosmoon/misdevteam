/***************************************************************************************************
 * 파일명 : SSMove1000WB.java
 * 기능 : 이사독자-신청현황을 위한 Worker Bean
 * 작성일자 : 2004-01-05
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.move.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.dao.*;

/**
 * 이사독자-신청현황을 위한 WB
 */

public class SSMove1000WB {

    /**
     * 이사독자-신청현황-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MOVM_RDR_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_MOVM_RDR_INITDM dm = new SS_L_MOVM_RDR_INITDM();

        SSMove1000DAO dao = new SSMove1000DAO();
        // DAO 객체의 init 호출
        ds = dao.init(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1000EJBHome home = (SSMove1000EJBHome) JNDIManager.getInstance().getHome("SSMove1000EJB");
        try {
            SSMove1000EJB ejb = home.create();
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
     * 이사독자-신청현황 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MOVM_RDRDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        //String fromtogb = Util.checkString(req.getParameter("fromtogb"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String trsf_frdt = Util.checkString(req.getParameter("trsf_frdt"));
        String trsf_todt = Util.checkString(req.getParameter("trsf_todt"));
        String acpt_frdt = Util.checkString(req.getParameter("acpt_frdt"));
        String acpt_todt = Util.checkString(req.getParameter("acpt_todt"));
        String agent_frdt = Util.checkString(req.getParameter("agent_frdt"));
        String agent_todt = Util.checkString(req.getParameter("agent_todt"));
        String agent_id = Util.checkString(req.getParameter("agent_id"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String inout = Util.checkString(req.getParameter("inout"));
        String move = Util.checkString(req.getParameter("move"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String proccd = Util.checkString(req.getParameter("proccd"));
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
        String basivalqty = Util.checkString(req.getParameter("basivalqty"));
        String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn"));
        String inbo = Util.checkString(req.getParameter("inbo"));
        String movmrdrtype = Util.checkString(req.getParameter("movmrdrtype"));
        String rstsubsmonth = Util.checkString(req.getParameter("rstsubsmonth"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MOVM_RDRDM dm = new SS_L_MOVM_RDRDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        //dm.setFromtogb(fromtogb);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setTrsf_frdt(trsf_frdt);
        dm.setTrsf_todt(trsf_todt);
        dm.setAcpt_frdt(acpt_frdt);
        dm.setAcpt_todt(acpt_todt);
        dm.setAgent_frdt(agent_frdt);
        dm.setAgent_todt(agent_todt);
        dm.setAgent_id(agent_id);
        dm.setRdrnm(rdrnm);
        dm.setRdr_no(rdr_no);
        dm.setInout(inout);
        dm.setMedicd(medicd);
        dm.setMove(move);
        dm.setProccd(proccd);
        dm.setAplcpathcd(aplcpathcd);
        dm.setBasivalqty(basivalqty);
        dm.setPost_dlvyn(post_dlvyn);
        dm.setInbo(inbo);
        dm.setMovmrdrtype(movmrdrtype);
        dm.setRstsubsmonth(rstsubsmonth);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        dm.print();

        SSMove1000DAO dao = new SSMove1000DAO();
        // DAO 객체의 selectMoveList 호출
        ds = dao.selectMoveList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1000EJBHome home = (SSMove1000EJBHome) JNDIManager.getInstance().getHome("SSMove1000EJB");
        try {
            SSMove1000EJB ejb = home.create();
            ds = ejb.selectMoveList(dm);
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
     * 이사독자-신청현황-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_MOVM_RDRDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_MOVM_RDRDM dm = new SS_S_MOVM_RDRDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSMove1000DAO dao = new SSMove1000DAO();
        // DAO 객체의 selectMoveDetail 호출
        ds = dao.selectMoveDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1000EJBHome home = (SSMove1000EJBHome) JNDIManager.getInstance().getHome("SSMove1000EJB");
        try {
            SSMove1000EJB ejb = home.create();
            ds = ejb.selectMoveDetail(dm);
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
     * 이사독자-신청현황-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveCancel(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_MOVM_RDR_CANCDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);

        // DM Setting
        SS_A_MOVM_RDR_CANCDM dm = new SS_A_MOVM_RDR_CANCDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);
        dm.setIncmgpers(incmgpers);

        SSMove1000DAO dao = new SSMove1000DAO();
        // DAO 객체의 selectMoveDetail 호출
        ds = dao.selectMoveCancel(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1000EJBHome home = (SSMove1000EJBHome) JNDIManager.getInstance().getHome("SSMove1000EJB");
        try {
            SSMove1000EJB ejb = home.create();
            ds = ejb.selectMoveCancel(dm);
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
     * 이사독자-신청현황-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateMoveRdr(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_MOVM_RDRDataSet ds = null;
    	
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	
    	String regdt_cnfm = Util.checkString(req.getParameter("regdt_cnfm"));
    	String regno_cnfm = Util.checkString(req.getParameter("regno_cnfm"));
    	String movmlinkalon_plan_cnfm = Util.checkString(req.getParameter("movmlinkalon_plan_cnfm"));
    	String movmlinkalon_fix_cnfm = Util.checkString(req.getParameter("movmlinkalon_fix_cnfm"));
    	String movmrdrtype_cnfm = Util.checkString(req.getParameter("movmrdrtype_cnfm"));
    	String zip_cnfm = Util.checkString(req.getParameter("zip_cnfm"));
    	String addr_cnfm = Util.checkString(req.getParameter("addr_cnfm"));
    	String dtlsaddr_cnfm = Util.checkString(req.getParameter("dtlsaddr_cnfm"));
    	String movmzip_cnfm = Util.checkString(req.getParameter("movmzip_cnfm"));
    	String movmaddr_cnfm = Util.checkString(req.getParameter("movmaddr_cnfm"));
    	String movmdtlsaddr_cnfm = Util.checkString(req.getParameter("movmdtlsaddr_cnfm"));
    	String trsfboremk_cnfm = Util.checkString(req.getParameter("trsfboremk_cnfm"));
    	String acptboremk_cnfm = Util.checkString(req.getParameter("acptboremk_cnfm"));
    	String movmlinkalon_ptcr_cnfm = Util.checkString(req.getParameter("movmlinkalon_ptcr_cnfm"));
    	String rstsubsmonths_cnfm = Util.checkString(req.getParameter("rstsubsmonths_cnfm"));

        // DM Setting
        SS_U_MOVM_RDRDM dm = new SS_U_MOVM_RDRDM();
        dm.setUid(uid);
        dm.setRegdt_cnfm(regdt_cnfm);
        dm.setRegno_cnfm(regno_cnfm);
        dm.setMovmlinkalon_plan_cnfm(movmlinkalon_plan_cnfm);
        dm.setMovmlinkalon_fix_cnfm(movmlinkalon_fix_cnfm);
        dm.setMovmrdrtype_cnfm(movmrdrtype_cnfm);
        dm.setZip_cnfm(zip_cnfm);
        dm.setAddr_cnfm(addr_cnfm);
        dm.setDtlsaddr_cnfm(dtlsaddr_cnfm);
        dm.setMovmzip_cnfm(movmzip_cnfm);
        dm.setMovmaddr_cnfm(movmaddr_cnfm);
        dm.setMovmdtlsaddr_cnfm(movmdtlsaddr_cnfm);
        dm.setTrsfboremk_cnfm(trsfboremk_cnfm);
        dm.setAcptboremk_cnfm(acptboremk_cnfm);
        dm.setMovmlinkalon_ptcr_cnfm(movmlinkalon_ptcr_cnfm);
        dm.setRstsubsmonths_cnfm(rstsubsmonths_cnfm);

        SSMove1000DAO dao = new SSMove1000DAO();
        // DAO 객체의 selectMoveDetail 호출
        ds = dao.updateMoveRdr(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1000EJBHome home = (SSMove1000EJBHome) JNDIManager.getInstance().getHome("SSMove1000EJB");
        try {
            SSMove1000EJB ejb = home.create();
            ds = ejb.updateMoveRdr(dm);
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
     * 이사독자-신청현황 엑셀다운
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printMoveRdr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MOVM_RDRDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        //String fromtogb = Util.checkString(req.getParameter("fromtogb"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String trsf_frdt = Util.checkString(req.getParameter("trsf_frdt"));
        String trsf_todt = Util.checkString(req.getParameter("trsf_todt"));
        String acpt_frdt = Util.checkString(req.getParameter("acpt_frdt"));
        String acpt_todt = Util.checkString(req.getParameter("acpt_todt"));
        String agent_frdt = Util.checkString(req.getParameter("agent_frdt"));
        String agent_todt = Util.checkString(req.getParameter("agent_todt"));
        String agent_id = Util.checkString(req.getParameter("agent_id"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String inout = Util.checkString(req.getParameter("inout"));
        String move = Util.checkString(req.getParameter("move"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String proccd = Util.checkString(req.getParameter("proccd"));
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
        String basivalqty = Util.checkString(req.getParameter("basivalqty"));
        String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn"));
        String inbo = Util.checkString(req.getParameter("inbo"));
        String movmrdrtype = Util.checkString(req.getParameter("movmrdrtype"));
        String rstsubsmonth = Util.checkString(req.getParameter("rstsubsmonth"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MOVM_RDRDM dm = new SS_L_MOVM_RDRDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        //dm.setFromtogb(fromtogb);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setTrsf_frdt(trsf_frdt);
        dm.setTrsf_todt(trsf_todt);
        dm.setAcpt_frdt(acpt_frdt);
        dm.setAcpt_todt(acpt_todt);
        dm.setAgent_frdt(agent_frdt);
        dm.setAgent_todt(agent_todt);
        dm.setAgent_id(agent_id);
        dm.setRdrnm(rdrnm);
        dm.setInout(inout);
        dm.setMedicd(medicd);
        dm.setMove(move);
        dm.setProccd(proccd);
        dm.setAplcpathcd(aplcpathcd);
        dm.setBasivalqty(basivalqty);
        dm.setPost_dlvyn(post_dlvyn);
        dm.setInbo(inbo);
        dm.setMovmrdrtype(movmrdrtype);
        dm.setRstsubsmonth(rstsubsmonth);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        
        SSMove1000DAO dao = new SSMove1000DAO();
        // DAO 객체의 selectMoveList 호출
        ds = dao.printMoveRdr(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1000EJBHome home = (SSMove1000EJBHome) JNDIManager.getInstance().getHome("SSMove1000EJB");
        try {
            SSMove1000EJB ejb = home.create();
            ds = ejb.printMoveRdr(dm);
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
