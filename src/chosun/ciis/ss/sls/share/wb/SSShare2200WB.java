/***************************************************************************************************
* 파일명 : SSShare2200WB.java
* 기능 : 판매국메인 처리를 위한 Work Bean
* 작성일자 : 2004-04-21
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/
package chosun.ciis.ss.sls.share.wb;

import javax.ejb.*;
import java.rmi.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.dao.*;

/**
 * 판매국메인 위한 WB
 */

public class SSShare2200WB{
    /**
     * 판매국메인-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectMainInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MAIN_INITDataSet ds = null;
        // Request Parameter Processing
System.out.println("SSShare2200WB : selectMainInit : Header-uid : "+req.getHeader("uid"));
System.out.println("SSShare2200WB : selectMainInit : session : "+req.getSession(false));
System.out.println("SSShare2200WB : selectMainInit : session-uid : "+Util.getSessionParameterValue(req,"uid",false));

        String jobcd = Util.getSessionParameterValue(req, "jobcd", false); 	            //업무구분코드
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", false); 	        //회사코드
        String uid = Util.getSessionParameterValue(req, "uid", true); 	                //입력자아이디
        String sb_areacd = Util.getSessionParameterValue(req, "areacd", false); 	        //관할지역코드(복수)
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", false); 	//관리부서코드(복수)
        String deptcd = Util.getSessionParameterValue(req, "deptcd", false);             //부서코드(소속)
        String selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", false);     //판매부서코드(소속)

        // DM Setting
        SS_L_MAIN_INITDM dm = new SS_L_MAIN_INITDM();
        dm.setJobcd(jobcd);
        dm.setCmpycd(cmpycd);
        dm.setUid(uid);
        dm.setSb_areacd(sb_areacd);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setDeptcd(deptcd);
        dm.setSelldeptcd(selldeptcd);

        SSShare2200DAO dao = new SSShare2200DAO();
		// DAO 객체의 selectMainInit 호출
		ds = dao.selectMainInit(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare2200EJBHome home = (SSShare2200EJBHome)JNDIManager.getInstance().getHome("SSShare2200EJB");
        try{
            SSShare2200EJB ejb = home.create();
            ds = ejb.selectMainInit(dm);
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
     * 판매국메인-달력-월별일정 조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void selectMonthScheList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MONTH_SCHEDataSet ds = null;
System.out.println("SSShare2200WB : selectMonthScheList : Header-uid : "+req.getHeader("uid"));
System.out.println("SSShare2200WB : selectMonthScheList : session : "+req.getSession(false));
System.out.println("SSShare2200WB : selectMonthScheList : session-uid : "+Util.getSessionParameterValue(req,"uid",false));

        // Request Parameter Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//입력자아이디
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false); 	//부서코드(판매부서코드)

        String change_year = Util.checkString(req.getParameter("change_year"));		//변경년
        String change_month = Util.checkString(req.getParameter("change_month"));	//변경월

        //달력객체 생성
        Calendar myCalendar = Calendar.getInstance();

        int year = 0;
        int month = 0;

        if (change_year == null || change_year.equals("")) {
            year = myCalendar.get(myCalendar.YEAR);
            change_year = Integer.toString(year);
        }

        if (change_month == null || change_month.equals("")) {
            month = myCalendar.get(myCalendar.MONTH);
            month = month + 1;
            change_month = Integer.toString(month);
        }
        change_month = Util.addZero(change_month, 2);

        String yyyymm = change_year + change_month;

        // DM Setting
        SS_L_MONTH_SCHEDM dm = new SS_L_MONTH_SCHEDM();

        dm.setDeptcd(deptcd);
        dm.setIncmgpers(incmgpers);
        dm.setYyyymm(yyyymm);

        SSShare2200DAO dao = new SSShare2200DAO();
		// DAO 객체의 selectMonthScheList 호출
		ds = dao.selectMonthScheList(dm);
		req.setAttribute("ds", ds);
        req.setAttribute("change_year", change_year);
        req.setAttribute("change_month", change_month);
		
        /*
        SSShare2200EJBHome home = (SSShare2200EJBHome)JNDIManager.getInstance().getHome("SSShare2200EJB");
        try {
            SSShare2200EJB ejb = home.create();
            ds = ejb.selectMonthScheList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("change_year", change_year);
            req.setAttribute("change_month", change_month);
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
     * 판매국메인-달력-일별일정 조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectDayScheList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_DAY_SCHEDataSet ds = null;

        // Request Parameter Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//입력자아이디
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false); //부서코드(판매부서코드)

        String yyyymmdd = Util.checkString(req.getParameter("yyyymmdd"));

        // DM Setting
        SS_L_DAY_SCHEDM dm = new SS_L_DAY_SCHEDM();
        dm.setDeptcd(deptcd);
        dm.setIncmgpers(incmgpers);
        dm.setYyyymmdd(yyyymmdd);

        SSShare2200DAO dao = new SSShare2200DAO();
		// DAO 객체의 selectDayScheList 호출
		ds = dao.selectDayScheList(dm);
		req.setAttribute("ds", ds); // request에 결과값을 담는다.
        req.setAttribute("yyyymmdd", yyyymmdd);
		
        /*
        SSShare2200EJBHome home = (SSShare2200EJBHome) JNDIManager.getInstance().getHome("SSShare2200EJB");
        try {
            SSShare2200EJB ejb = home.create();
            ds = ejb.selectDayScheList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
            req.setAttribute("yyyymmdd", yyyymmdd);
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
     * 판매국메인-공지사항-상세보기
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectAnncDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_ANNCDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));

        // DM Setting
        SS_S_ANNCDM dm = new SS_S_ANNCDM();
        dm.setSeq(Long.parseLong(seq));
        if (!brwscnt.equals("")){
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }
        
        SSShare2200DAO dao = new SSShare2200DAO();
		// DAO 객체의 selectAnncDetail 호출
		ds = dao.selectAnncDetail(dm);
		req.setAttribute("ds", ds);     // request에 결과값을 담는다.
		
		/*
        SSShare2200EJBHome home = (SSShare2200EJBHome) JNDIManager.getInstance().getHome("SSShare2200EJB");
        try {
            SSShare2200EJB ejb = home.create();
            ds = ejb.selectAnncDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);     // request에 결과값을 담는다.
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
     * 판매국메인-달력-다운로드
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void dwloadAnnc(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_INFOEXG_DWLOADDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));

        // DM Setting
        SS_S_INFOEXG_DWLOADDM dm = new SS_S_INFOEXG_DWLOADDM();
        dm.setSeq(Long.parseLong(seq));
        if (!dwloadcnt.equals("")){
            dm.setDwloadcnt(Long.parseLong(dwloadcnt));
        }
        
        SSShare2200DAO dao = new SSShare2200DAO();
		// DAO 객체의 dwloadAnnc 호출
		ds = dao.dwloadAnnc(dm);
		req.setAttribute("filecont", ds.filecont); // request에 결과값을 담는다.
        req.setAttribute("filenm", ds.filenm); // request에 결과값을 담는다.
		
        /*
        SSShare2200EJBHome home = (SSShare2200EJBHome) JNDIManager.getInstance().getHome("SSShare2200EJB");
        try {
            SSShare2200EJB ejb = home.create();
            ds = ejb.dwloadAnnc(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("filecont", ds.filecont); // request에 결과값을 담는다.
            req.setAttribute("filenm", ds.filenm); // request에 결과값을 담는다.
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
     * 판매국메인-실시간공지-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectAnncslsList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_ANNCSLSDataSet ds = null;
        // Request Parameter Processing

        String jobcd = Util.getSessionParameterValue(req, "jobcd", false); 	            //업무구분코드
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", false); 	        //회사코드
        String uid = Util.getSessionParameterValue(req, "uid", true); 	                //입력자아이디
        String sb_areacd = Util.getSessionParameterValue(req, "areacd", false); 	    //관할지역코드(복수)
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", false); //관리부서코드(복수)
        String deptcd = Util.getSessionParameterValue(req, "deptcd", false);            //부서코드(소속)
        String selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", false);    //판매부서코드(소속)

        // DM Setting
        SS_L_ANNCSLSDM dm = new SS_L_ANNCSLSDM();
        dm.setJobcd(jobcd);
        dm.setCmpycd(cmpycd);
        dm.setUid(uid);
        dm.setSb_areacd(sb_areacd);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setDeptcd(deptcd);
        dm.setSelldeptcd(selldeptcd);

        SSShare2200DAO dao = new SSShare2200DAO();
        // DAO 객체의 selectAnncslsList 호출
        ds = dao.selectAnncslsList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSShare2200EJBHome home = (SSShare2200EJBHome)JNDIManager.getInstance().getHome("SSShare2200EJB");
        try{
            SSShare2200EJB ejb = home.create();
            ds = ejb.selectAnncslsList(dm);
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
     * 판매국메인-실시간공지-상세보기
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectAnncslsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_ANNCSLSDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        SS_S_ANNCSLSDM dm = new SS_S_ANNCSLSDM();
        dm.setSeq(Long.parseLong(seq));
        
        SSShare2200DAO dao = new SSShare2200DAO();
        // DAO 객체의 selectAnncslsDetail 호출
        ds = dao.selectAnncslsDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
        /*
        SSShare2200EJBHome home = (SSShare2200EJBHome) JNDIManager.getInstance().getHome("SSShare2200EJB");
        try {
            SSShare2200EJB ejb = home.create();
            ds = ejb.selectAnncslsDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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