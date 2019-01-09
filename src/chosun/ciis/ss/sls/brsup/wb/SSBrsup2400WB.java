/***************************************************************************************************
 * 파일명   : SSBrsup2400WB.java
 * 기능     : 주간조선관리-배달비정산마감
 * 작성일자 : 2007-04-13
 * 작성자   : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
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


public class SSBrsup2400WB {

    /**
     * 주간조선관리-배달비정산마감-마감및취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void ClosandCancel(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_A_WEEKCHOSUNCLOSDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
        String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));

        // Session Processing
        String wrkuser = Util.getSessionParameterValue(req, "uid", true);

        // DM Setting
        CO_A_WEEKCHOSUNCLOSDM dm = new CO_A_WEEKCHOSUNCLOSDM();

        dm.setAccflag(accflag);
        dm.setClosyymm(closyymm);
        dm.setWrkuser(wrkuser);
        
        SSBrsup2400DAO dao = new SSBrsup2400DAO();
        // DAO 객체의 initClosList 호출
        ds = dao.ClosandCancel(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2400EJBHome home = (SSBrsup2400EJBHome)JNDIManager.getInstance().getHome("SSBrsup2400EJB");
        try{
            SSBrsup2400EJB ejb = home.create();
            ds = ejb.ClosandCancel(dm);
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
     * 주간조선관리-배달비정산마감-마감내역
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initClosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_WEEKSND_CLOSPTCRDataSet ds = null;

        // Request Parameter Processing
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String fryymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fryymm")));
        String toyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("toyymm")));
        String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
        String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
        String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_WEEKSND_CLOSPTCRDM dm = new SS_L_WEEKSND_CLOSPTCRDM();

        dm.setMedicd(medicd);
        dm.setFryymm(fryymm);
        dm.setToyymm(toyymm);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup2400DAO dao = new SSBrsup2400DAO();
        // DAO 객체의 initClosList 호출
        ds = dao.initClosList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2400EJBHome home = (SSBrsup2400EJBHome)JNDIManager.getInstance().getHome("SSBrsup2400EJB");

        try{
            SSBrsup2400EJB ejb = home.create();
            ds = ejb.initClosList(dm);
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
     * 지국지원-주간조선관리-송금목록 엑셀저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closListExcel(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_WEEKSND_CLOS_PRINTDataSet ds = null;

        // Request Parameter Processing
        String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));

        // DM Setting
        SS_L_WEEKSND_CLOS_PRINTDM dm = new SS_L_WEEKSND_CLOS_PRINTDM();

        dm.setClosyymm(closyymm);
        
        SSBrsup2400DAO dao = new SSBrsup2400DAO();
        // DAO 객체의 initClosList 호출
        ds = dao.closListExcel(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2400EJBHome home = (SSBrsup2400EJBHome)JNDIManager.getInstance().getHome("SSBrsup2400EJB");
        try{
            SSBrsup2400EJB ejb = home.create();
            ds = ejb.closListExcel(dm);
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
     * 주간조선관리-배달비정산마감-마감내역
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closSernoList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = null;

        // Request Parameter Processing
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String closym = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
        String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
        String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
        String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));

        // DM Setting
        SS_L_WEEKSND_CLOSPTCR_SERNODM dm = new SS_L_WEEKSND_CLOSPTCR_SERNODM();

        dm.setMedicd(medicd);
        dm.setClosym(closym);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        
        SSBrsup2400DAO dao = new SSBrsup2400DAO();
        // DAO 객체의 initClosList 호출
        ds = dao.closSernoList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2400EJBHome home = (SSBrsup2400EJBHome)JNDIManager.getInstance().getHome("SSBrsup2400EJB");
        try{
            SSBrsup2400EJB ejb = home.create();
            ds = ejb.closSernoList(dm);
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
