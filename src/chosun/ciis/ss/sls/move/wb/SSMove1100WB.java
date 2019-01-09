/***************************************************************************************************
* 파일명 : SSMove1100WB.java
 * 기능 : 이사독자-마감을 위한 Worker Bean
* 작성일자 : 2004-01-07
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
 * 이사독자-마감을 위한 WB
 */

public class SSMove1100WB{


    /**
     * 이사독자-마감-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void moveClosInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MOVM_RDRCLOS_INITDataSet ds = null;
        // DM Setting
        SS_L_MOVM_RDRCLOS_INITDM dm = new SS_L_MOVM_RDRCLOS_INITDM();

        SSMove1100DAO dao = new SSMove1100DAO();
        // DAO 객체의 moveClosInit 호출
        ds = dao.moveClosInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1100EJBHome home = (SSMove1100EJBHome)JNDIManager.getInstance().getHome("SSMove1100EJB");
        try{
                SSMove1100EJB ejb = home.create();
                ds = ejb.moveClosInit(dm);
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
     * 이사독자-마감-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveClosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MOVM_RDR_CLOSDataSet ds = null;
        // Request Parameter Processing
        String yyyymm = Util.checkString(req.getParameter("yyyymm"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String closgb = Util.checkString(req.getParameter("closgb"));
        String movmrdrtype = Util.checkString(req.getParameter("movmrdrtype"));
        String rstsubsmonth = Util.checkString(req.getParameter("rstsubsmonth"));
        String rdrnm = Util.checkString(req.getParameter("rdrnm"));
        String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));

        // DM Setting
        SS_L_MOVM_RDR_CLOSDM dm = new SS_L_MOVM_RDR_CLOSDM();

        dm.setYyyymm(yyyymm);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setAplcpathcd(aplcpathcd);
        dm.setMedicd(medicd);
        dm.setClosgb(closgb);
        dm.setMovmrdrtype(movmrdrtype);
        dm.setRstsubsmonth(rstsubsmonth);
        dm.setRdrnm(rdrnm);
        dm.setPost_dlvyn(post_dlvyn);
        dm.setRdr_no(rdr_no);
        
        dm.print();
        
        
        SSMove1100DAO dao = new SSMove1100DAO();
        // DAO 객체의 selectMoveClosList 호출
        ds = dao.selectMoveClosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1100EJBHome home = (SSMove1100EJBHome)JNDIManager.getInstance().getHome("SSMove1100EJB");
        try{
            SSMove1100EJB ejb = home.create();
            ds = ejb.selectMoveClosList(dm);
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
     * 이사독자-마감-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveClosDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_MOVM_RDR_CLOSDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_MOVM_RDR_CLOSDM dm = new SS_S_MOVM_RDR_CLOSDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSMove1100DAO dao = new SSMove1100DAO();
        // DAO 객체의 selectMoveClosDetail 호출
        ds = dao.selectMoveClosDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1100EJBHome home = (SSMove1100EJBHome)JNDIManager.getInstance().getHome("SSMove1100EJB");
        try{
            SSMove1100EJB ejb = home.create();
            ds = ejb.selectMoveClosDetail(dm);
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
     * 이사독자-마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertMoveClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_A_MOVM_RDR_CLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String yyyymm = Util.checkString(req.getParameter("yyyymm"));
        String flag = Util.checkString(req.getParameter("closflag"));

        // DM Setting
        SS_A_MOVM_RDR_CLOSDM dm = new SS_A_MOVM_RDR_CLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setYyyymm(yyyymm);
        dm.setFlag(flag);
        
        dm.print();

        SSMove1100DAO dao = new SSMove1100DAO();
        // DAO 객체의 insertMoveClos 호출
        ds = dao.insertMoveClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1100EJBHome home = (SSMove1100EJBHome)JNDIManager.getInstance().getHome("SSMove1100EJB");
        try{
            SSMove1100EJB ejb = home.create();
            ds = ejb.insertMoveClos(dm);
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
    
    public void saveMoveClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_A_MOVM_RDR_CLOS_DETAILDataSet ds = null;

    	String regdt = Util.checkString(req.getParameter("regdt_cnfm"));
        String regno = Util.checkString(req.getParameter("regno_cnfm"));
        
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String movmrdrtype = Util.checkString(req.getParameter("movmrdrtype_cnfm"));
        String rstsubsmonths = Util.checkString(req.getParameter("rstsubsmonths_cnfm"));
        String ipju_aptcd = Util.checkString(req.getParameter("ipju_aptcd_cnfm"));
        String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn_cnfm"));
        String suspyn = Util.checkString(req.getParameter("suspyn_cnfm"));
        String rdr_val_gb = Util.checkString(req.getParameter("rdr_val_gb"));
        String set_gb = Util.checkString(req.getParameter("set_gb"));
        String jm_gb = Util.checkString(req.getParameter("jm_gb"));
        String linkalon_fix = Util.checkString(req.getParameter("linkalon_fix"));
        String saveflag = Util.checkString(req.getParameter("saveflag"));
        String auto_gb = Util.checkString(req.getParameter("auto_gb"));

        // DM Setting
        SS_A_MOVM_RDR_CLOS_DETAILDM dm = new SS_A_MOVM_RDR_CLOS_DETAILDM();
        dm.setIncmgpers(incmgpers);
        dm.setRegdt(regdt);
        dm.setRegno(regno);
        dm.setMovmrdrtype(movmrdrtype);
        dm.setRstsubsmonths(rstsubsmonths);
        dm.setIpju_aptcd(ipju_aptcd);
        dm.setPost_dlvyn(post_dlvyn);
        dm.setSuspyn(suspyn);
        dm.setRdr_val_gb(rdr_val_gb);
        dm.setSet_gb(set_gb);
        dm.setJm_gb(jm_gb);
        dm.setLinkalon_fix(linkalon_fix);
        dm.setSaveflag(saveflag);
        dm.setAuto_gb(auto_gb);
        
        dm.print();

        SSMove1100DAO dao = new SSMove1100DAO();
        // DAO 객체의 insertMoveClos 호출
        ds = dao.saveMoveClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1100EJBHome home = (SSMove1100EJBHome)JNDIManager.getInstance().getHome("SSMove1100EJB");
        try{
            SSMove1100EJB ejb = home.create();
            ds = ejb.insertMoveClos(dm);
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
