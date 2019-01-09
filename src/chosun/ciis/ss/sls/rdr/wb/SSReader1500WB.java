/**************************************************************************************************
 * 파일명   : SSReader1500WB.java
 * 기  능   : 독자현황-VacationStop-코드를 위한 Worker Bean
 * 작성일자 : 2004-03-29
 * 작성자   : 김대섭
 *************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-VacationStop-코드를 위한 Worker Bean
 */

public class SSReader1500WB {

    /**
     * 독자현황-VacationStop-코드-초기화면
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void initVsCode(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_VSCD_INITDataSet ds = null;

        // DM 값을 Setting한다.
        SS_L_VSCD_INITDM dm = new SS_L_VSCD_INITDM();
        
        SSReader1500DAO dao = new SSReader1500DAO();
        // DAO 객체의 initVsCode 호출
        ds = dao.initVsCode(dm);
        req.setAttribute("ds", ds);                      // request에 결과값을 담는다.

        /*
        SSReader1500EJBHome home = (SSReader1500EJBHome)JNDIManager.getInstance().getHome("SSReader1500EJB");
        try{
            SSReader1500EJB ejb = home.create();
            ds = ejb.initVsCode(dm);                  // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                      // request에 결과값을 담는다.
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
     * 독자현황-VacationStop-코드-목록
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectVsCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_VSCDDataSet ds = null;

        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
        String pagenoStr = Util.checkString(req.getParameter("pageno"));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.checkString(req.getParameter("pagesize"));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM 값을 Setting한다.
        SS_L_VSCDDM dm = new SS_L_VSCDDM();
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSReader1500DAO dao = new SSReader1500DAO();
        // DAO 객체의 selectVsCodeList 호출
        ds = dao.selectVsCodeList(dm);
        req.setAttribute("ds", ds);                     // request에 결과값을 담는다.
        
        /*
        SSReader1500EJBHome home = (SSReader1500EJBHome)JNDIManager.getInstance().getHome("SSReader1500EJB");
        try{
            SSReader1500EJB ejb = home.create();
            ds = ejb.selectVsCodeList(dm);                  // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                     // request에 결과값을 담는다.
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
     * 독자현황-VacationStop-코드-상세
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectVsCodeDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_VSCDDataSet ds = null;
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));
        // DM 값을 Setting한다.
        SS_S_VSCDDM dm = new SS_S_VSCDDM();
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);

        SSReader1500DAO dao = new SSReader1500DAO();
        // DAO 객체의 selectVsCodeDetail 호출
        ds = dao.selectVsCodeDetail(dm);
        req.setAttribute("ds", ds);      // request에 결과값을 담는다.
        
        /*
        SSReader1500EJBHome home = (SSReader1500EJBHome)JNDIManager.getInstance().getHome("SSReader1500EJB");
        try{
            SSReader1500EJB ejb = home.create();
            ds = ejb.selectVsCodeDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);      // request에 결과값을 담는다.
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
     * 독자현황-VacationStop-코드-등록
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void insertVsCode(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCDDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));
        String vaca_arearegnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegnnm")));
        String vaca_areanm = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areanm")));
        String vaca_areatel_no1 = Util.checkString(req.getParameter("vaca_areatel_no1"));
        String vaca_areatel_no2 = Util.checkString(req.getParameter("vaca_areatel_no2"));
        String vaca_areatel_no3 = Util.checkString(req.getParameter("vaca_areatel_no3"));
        String vaca_areazip = Util.checkString(req.getParameter("vaca_areazip"));
        String vaca_areaaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areaaddr")));
        String vaca_areadtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadtlsaddr")));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));

        // DM 값을 Setting한다.
        SS_A_VSCDDM dm = new SS_A_VSCDDM();

        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);
        dm.setVaca_arearegnnm(vaca_arearegnnm);
        dm.setVaca_areanm(vaca_areanm);
        dm.setVaca_areatel_no1(vaca_areatel_no1);
        dm.setVaca_areatel_no2(vaca_areatel_no2);
        dm.setVaca_areatel_no3(vaca_areatel_no3);
        dm.setVaca_areazip(vaca_areazip);
        dm.setVaca_areaaddr(vaca_areaaddr);
        dm.setVaca_areadtlsaddr(vaca_areadtlsaddr);
        dm.setBocd(bocd);
        dm.setDescri(descri);

        SSReader1500DAO dao = new SSReader1500DAO();
        // DAO 객체의 insertVsCode 호출
        ds = dao.insertVsCode(dm);
        req.setAttribute("ds", ds);    // request에 결과값을 담는다.
        
        /*
        SSReader1500EJBHome home = (SSReader1500EJBHome)JNDIManager.getInstance().getHome("SSReader1500EJB");
        try{
            SSReader1500EJB ejb = home.create();
            ds = ejb.insertVsCode(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);    // request에 결과값을 담는다.
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
     * 독자현황-VacationStop-코드-수정
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void updateVsCode(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCDDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));
        String vaca_arearegnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegnnm")));
        String vaca_areanm = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areanm")));
        String vaca_areatel_no1 = Util.checkString(req.getParameter("vaca_areatel_no1"));
        String vaca_areatel_no2 = Util.checkString(req.getParameter("vaca_areatel_no2"));
        String vaca_areatel_no3 = Util.checkString(req.getParameter("vaca_areatel_no3"));
        String vaca_areazip = Util.checkString(req.getParameter("vaca_areazip"));
        String vaca_areaaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areaaddr")));
        String vaca_areadtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadtlsaddr")));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));

        // DM 값을 Setting한다.
        SS_A_VSCDDM dm = new SS_A_VSCDDM();

        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);
        dm.setVaca_arearegnnm(vaca_arearegnnm);
        dm.setVaca_areanm(vaca_areanm);
        dm.setVaca_areatel_no1(vaca_areatel_no1);
        dm.setVaca_areatel_no2(vaca_areatel_no2);
        dm.setVaca_areatel_no3(vaca_areatel_no3);
        dm.setVaca_areazip(vaca_areazip);
        dm.setVaca_areaaddr(vaca_areaaddr);
        dm.setVaca_areadtlsaddr(vaca_areadtlsaddr);
        dm.setBocd(bocd);
        dm.setDescri(descri);

        SSReader1500DAO dao = new SSReader1500DAO();
        // DAO 객체의 updateVsCode 호출
        ds = dao.updateVsCode(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 담는다.
        
        /*
        SSReader1500EJBHome home = (SSReader1500EJBHome)JNDIManager.getInstance().getHome("SSReader1500EJB");
        try{
            SSReader1500EJB ejb = home.create();
            ds = ejb.updateVsCode(dm);      // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);     // request에 결과값을 담는다.
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
     * 독자현황-VacationStop-코드-삭제
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void deleteVsCode(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCDDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));

        // DM 값을 Setting한다.
        SS_A_VSCDDM dm = new SS_A_VSCDDM();
        dm.setAccflag(accflag);
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);

        SSReader1500DAO dao = new SSReader1500DAO();
        // DAO 객체의 deleteVsCode 호출
        ds = dao.deleteVsCode(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 담는다.
        
        /*
        SSReader1500EJBHome home = (SSReader1500EJBHome)JNDIManager.getInstance().getHome("SSReader1500EJB");
        try{
            SSReader1500EJB ejb = home.create();
            ds = ejb.deleteVsCode(dm);      // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);     // request에 결과값을 담는다.
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
