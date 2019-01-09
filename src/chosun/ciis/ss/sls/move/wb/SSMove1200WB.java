/***************************************************************************************************
* 파일명 : SSMove1200WB.java
 * 기능 : 이사독자-비용을 위한 Worker Bean
* 작성일자 : 2004-01-09
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 이사독자-비용을 위한 WB
 */

public class SSMove1200WB {
    
    /**
     * 이사독자-비용-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MOVM_RDR_COSTDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yyyymm = Util.checkString(req.getParameter("yyyymm"));
        String sellnetclsf = Util.checkString(req.getParameter("sellnetclsf"));
        String search_flag = Util.checkString(req.getParameter("search_flag"));

        // DM Setting
        SS_L_MOVM_RDR_COSTDM dm = new SS_L_MOVM_RDR_COSTDM();
        
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setPartcd(partcd);
        dm.setBocd(bocd);
        dm.setYyyymm(yyyymm);
        dm.setSellnetclsf(sellnetclsf);
        dm.setSearch_flag(search_flag);

        SSMove1200DAO dao = new SSMove1200DAO();
        // DAO 객체의 selectMoveCostList 호출
        ds = dao.selectMoveCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1200EJBHome home = (SSMove1200EJBHome)JNDIManager.getInstance().getHome("SSMove1200EJB");
        try{
            SSMove1200EJB ejb = home.create();
            ds = ejb.selectMoveCostList(dm);
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
     * 이사독자-비용-재생성
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void rebuildMoveCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_MOVM_RDR_COSTDataSet ds = null;

        // Request Parameter Processing
        String yyyymm = Util.checkString(req.getParameter("yyyymm"));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // DM Setting
        SS_A_MOVM_RDR_COSTDM dm = new SS_A_MOVM_RDR_COSTDM();
        dm.setClosmm(yyyymm);
        dm.setIncmgpers(incmgpers);

        SSMove1200DAO dao = new SSMove1200DAO();
        // DAO 객체의 selectMoveCostDetailList 호출
        ds = dao.rebuildMoveCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1200EJBHome home = (SSMove1200EJBHome)JNDIManager.getInstance().getHome("SSMove1200EJB");
        try{
            SSMove1200EJB ejb = home.create();
            ds = ejb.selectMoveCostDetailList(dm);
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
    
    public void detailMoveCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_MOVM_RDR_COSTDataSet ds = null;

        // Request Parameter Processing
        String closmm = Util.checkString(req.getParameter("closmm"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_S_MOVM_RDR_COSTDM dm = new SS_S_MOVM_RDR_COSTDM();
        dm.setClosmm(closmm);
        dm.setBocd(bocd);

        SSMove1200DAO dao = new SSMove1200DAO();
        // DAO 객체의 selectMoveCostDetailList 호출
        ds = dao.detailMoveCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1200EJBHome home = (SSMove1200EJBHome)JNDIManager.getInstance().getHome("SSMove1200EJB");
        try{
            SSMove1200EJB ejb = home.create();
            ds = ejb.selectMoveCostDetailList(dm);
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
    
    public void saveMoveBoacct(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_MOVM_RDR_COST_BOACCTDataSet ds = null;

        // Request Parameter Processing
        String closmm = Util.checkString(req.getParameter("closmm"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String deps_persnm = Util.checkString(req.getParameter("deps_persnm"));
        String acctno = Util.checkString(req.getParameter("acctno"));

        // DM Setting
        SS_U_MOVM_RDR_COST_BOACCTDM dm = new SS_U_MOVM_RDR_COST_BOACCTDM();
        dm.setClosmm(closmm);
        dm.setBocd(bocd);
        dm.setBankcd(bankcd);
        dm.setDeps_persnm(deps_persnm);
        dm.setAcctno(acctno);
        
        dm.print();

        SSMove1200DAO dao = new SSMove1200DAO();
        // DAO 객체의 selectMoveCostDetailList 호출
        ds = dao.saveMoveBoacct(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1200EJBHome home = (SSMove1200EJBHome)JNDIManager.getInstance().getHome("SSMove1200EJB");
        try{
            SSMove1200EJB ejb = home.create();
            ds = ejb.selectMoveCostDetailList(dm);
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