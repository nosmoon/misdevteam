/***************************************************************************************************
* 파일명 : SSMove1300WB.java
 * 기능 : 이사독자-송금을 위한 Worker Bean
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
 * 이사독자-송금을 위한 WB
 */

public class SSMove1300WB {
    /**
     * 이사독자-송금-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void moveRmttInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSMove1300DAO dao = new SSMove1300DAO();
        // DAO 객체의 moveRmttInit 호출
        ds = dao.moveRmttInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1300EJBHome home = (SSMove1300EJBHome)JNDIManager.getInstance().getHome("SSMove1300EJB");
        try{
            SSMove1300EJB ejb = home.create();
            ds = ejb.moveRmttInit(dm);
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
     * 이사독자-송금-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveRmttList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MOVM_RDR_RMTTDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String sortflag = Util.checkString(req.getParameter("sortflag"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MOVM_RDR_RMTTDM dm = new SS_L_MOVM_RDR_RMTTDM();

        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);
        dm.setSortflag(sortflag);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSMove1300DAO dao = new SSMove1300DAO();
        // DAO 객체의 selectMoveRmttList 호출
        ds = dao.selectMoveRmttList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1300EJBHome home = (SSMove1300EJBHome)JNDIManager.getInstance().getHome("SSMove1300EJB");
        try{
            SSMove1300EJB ejb = home.create();
            ds = ejb.selectMoveRmttList(dm);
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
     * 이사독자-송금-인쇄
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printMoveRmttList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MOVM_RDR_RMTT_PRINTDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String sortflag = Util.checkString(req.getParameter("sortflag"));

        // DM Setting
        SS_L_MOVM_RDR_RMTT_PRINTDM dm = new SS_L_MOVM_RDR_RMTT_PRINTDM();

        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);
        dm.setSortflag(sortflag);

        SSMove1300DAO dao = new SSMove1300DAO();
        // DAO 객체의 printMoveRmttList 호출
        ds = dao.printMoveRmttList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSMove1300EJBHome home = (SSMove1300EJBHome)JNDIManager.getInstance().getHome("SSMove1300EJB");
        try{
            SSMove1300EJB ejb = home.create();
            ds = ejb.printMoveRmttList(dm);
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