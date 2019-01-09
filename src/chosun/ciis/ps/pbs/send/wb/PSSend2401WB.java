/*****************************************************
 * 파일명   : PSSend2401WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2007-11-01
 * 작성자   : 김재일
 ********************************************************/
package chosun.ciis.ps.pbs.send.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.send.ejb.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;

/**
 *  발송-지국발송 발송처리 WorkBean
 */
public class PSSend2401WB{

    /**
     * 주간조선관리-배달비정산마감-마감및취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void ClosandCancel(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_A_WEEKCHOSUNCLOSDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));       //처리 FLAG(M:마감, C:마감취소)
        String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));     //정산마감년월
        String bas_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("bas_frdt")));     //마감기준시작일자
        String bas_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("bas_todt")));     //마감기준종료일자
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd_clos")));    //매체

        // Session Processing
        String wrkuser = Util.getSessionParameterValue(req, "uid", true);                   //마감작업자

        // DM Setting
        CO_A_WEEKCHOSUNCLOSDM dm = new CO_A_WEEKCHOSUNCLOSDM();

        dm.setAccflag(accflag);
        dm.setClosyymm(closyymm);
        dm.setBas_frdt(bas_frdt);
        dm.setBas_todt(bas_todt);
        dm.setMedicd(medicd);
        dm.setWrkuser(wrkuser);

        PSSend2401EJBHome home = (PSSend2401EJBHome) JNDIManager.getInstance().getHome("PSSend2401EJB");
        try{
            PSSend2401EJB ejb = home.create();
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
        }
    }

    /**
     * 주간조선관리-배달비정산마감-마감내역조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initClosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_WEEKSND_CLOSPTCRDataSet ds = null;

        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String fryymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fryymm")));
        String toyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("toyymm")));
        String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
        String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
        String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("curr_page_no")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        PS_L_WEEKSND_CLOSPTCRDM dm = new PS_L_WEEKSND_CLOSPTCRDM();

        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setFryymm(fryymm);
        dm.setToyymm(toyymm);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        PSSend2401EJBHome home = (PSSend2401EJBHome) JNDIManager.getInstance().getHome("PSSend2401EJB");

        try{
            PSSend2401EJB ejb = home.create();
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
        }
    }


    /**
     * 지국지원-주간조선관리-송금목록 엑셀저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closListExcel(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_WEEKSND_CLOS_PRINTDataSet ds = null;

        // Request Parameter Processing
        String cmpycd   = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드
        String medicd   = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));

        // DM Setting
        PS_L_WEEKSND_CLOS_PRINTDM dm = new PS_L_WEEKSND_CLOS_PRINTDM();

        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setClosyymm(closyymm);

        PSSend2401EJBHome home = (PSSend2401EJBHome) JNDIManager.getInstance().getHome("PSSend2401EJB");

        try{
            PSSend2401EJB ejb = home.create();
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
        }
    }

    /**
     * 주간조선관리-배달비정산마감-마감상세내역
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closSernoList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = null;

        // Request Parameter Processing
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String closym = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
        String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
        String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
        String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));

        // DM Setting
        PS_L_WEEKSND_CLOSPTCR_SERNODM dm = new PS_L_WEEKSND_CLOSPTCR_SERNODM();

        dm.setMedicd(medicd);
        dm.setClosym(closym);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);

        PSSend2401EJBHome home = (PSSend2401EJBHome) JNDIManager.getInstance().getHome("PSSend2401EJB");

        try{
            PSSend2401EJB ejb = home.create();
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
        }
    }
}
