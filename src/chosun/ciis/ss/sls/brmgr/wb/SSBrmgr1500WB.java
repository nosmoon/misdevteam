/***************************************************************************************************
* 파일명 : SSBrmgr1500WB.java
* 기능 : 지국경영-공정위 위약금 현황 처리를 위한 Worker Bean
* 작성일자 : 2004-02-24
* 작성자 : 김성규
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-공정위 위약금 현황을 위한 WB
 */

public class SSBrmgr1500WB{

    /**
     * 지국경영-공정위 위약금 현황-초기화면(부서조회, 심의 결과 조회, 위약 사유 조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_FCT_FRFT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_FCT_FRFT_INITDM dm = new SS_L_FCT_FRFT_INITDM();
        
        SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO 객체의 selectCodeList 호출
        ds = dao.selectCodeList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.selectCodeList(dm);
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
     * 지국경영-공정위 위약금 현황-조회 화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectCommList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_FCT_FRFT_LISTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String frdt = Util.checkString(req.getParameter("frdt"));      //부과기간 검색 시작일
        String todt = Util.checkString(req.getParameter("todt"));      //부과기간 검색 종료일
        String viltresn = Util.checkString(req.getParameter("viltresn"));         //위약 사유
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));   // 독자명
        String delbocom = Util.checkString(req.getParameter("delbocom"));   //심의결과
        String pageno = Util.checkString(req.getParameter("pageno"));       //현재 페이지
        String pagesize = Util.checkString(req.getParameter("pagesize")); //페이지당 건수

        // DM Setting
        SS_L_FCT_FRFT_LISTDM dm = new SS_L_FCT_FRFT_LISTDM();

        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setFrdt(frdt);      //부과기간 검색 시작일
        dm.setTodt(todt);      //부과기간 검색 종료일
        dm.setViltresn(viltresn);                  //위약 사유
        dm.setRdrnm(rdrnm);     //독자명
        dm.setDelbocom(delbocom); //심의결과
        dm.setPageno(Long.parseLong(pageno));      //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        
        SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO 객체의 selectCommList 호출
        ds = dao.selectCommList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.selectCommList(dm);
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
     * 지국경영-공정위 위약금 현황- 상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectFctFrftDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_FCT_FRFTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        String impndt = Util.checkString(req.getParameter("impndt_pk"));  //부과일자
        String deptcd = Util.checkString(req.getParameter("deptcd_pk"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd_pk"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String viltresn = Util.checkString(req.getParameter("viltresn_pk"));  //위약사유

        // DM Setting
        SS_S_FCT_FRFTDM dm = new SS_S_FCT_FRFTDM();

        dm.setImpndt(impndt);  //부과일자
        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setViltresn(viltresn); //위약사유
        
        SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO 객체의 selectFctFrftDetail 호출
        ds = dao.selectFctFrftDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.selectFctFrftDetail(dm);
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
     * 지국경영-공정위 위약금 현황-입력,수정,삭제 화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void accessFctFrft(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_FCT_FRFTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");

        String accflag = Util.checkString(req.getParameter("accflag"));
        //String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String viltnoit = Util.checkString(req.getParameter("viltnoit"));
        String impndt = Util.checkString(req.getParameter("impndt"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String frftimpnamt = Util.checkString(req.getParameter("frftimpnamt"));
        String resamt = Util.checkString(req.getParameter("resamt"));
        String delbocom = Util.checkString(req.getParameter("delbocom"));
        String viltresn = Util.checkString(req.getParameter("viltresn"));
        String hdqtrcpmamt = Util.checkString(req.getParameter("hdqtrcpmamt"));
        String hdqtrcpmdt = Util.checkString(req.getParameter("hdqtrcpmdt"));
        String hdqtun_pymtamt = Util.checkString(req.getParameter("hdqtun_pymtamt"));
        String borcpmamt = Util.checkString(req.getParameter("borcpmamt"));
        String borcpmdt = Util.checkString(req.getParameter("borcpmdt"));
        String boun_pymtamt = Util.checkString(req.getParameter("boun_pymtamt"));

        if (viltnoit.length() == 0) {
            viltnoit = "0";
        }
        if (frftimpnamt.length() == 0) {
            frftimpnamt = "0";
        }
        if (resamt.length() == 0) {
            resamt = "0";
        }
        if (hdqtrcpmamt.length() == 0) {
            hdqtrcpmamt = "0";
        }
        if (hdqtun_pymtamt.length() == 0) {
            hdqtun_pymtamt = "0";
        }
        if (borcpmamt.length() == 0) {
            borcpmamt = "0";
        }
        if (boun_pymtamt.length() == 0) {
            boun_pymtamt = "0";
        }

        // DM Setting
        SS_A_FCT_FRFTDM dm = new SS_A_FCT_FRFTDM();

		dm.setAccflag(accflag);
		dm.setIncmgpers(incmgpers);
		dm.setDeptcd(deptcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setImpndt(impndt);
		dm.setViltresn(viltresn);
		if(!"D".equals(accflag)){
			dm.setViltnoit(Long.parseLong(viltnoit));
			dm.setRdrnm(rdrnm);
			dm.setFrftimpnamt(Long.parseLong(frftimpnamt));
			dm.setResamt(Long.parseLong(resamt));
			dm.setDelbocom(delbocom);
			dm.setHdqtrcpmamt(Long.parseLong(hdqtrcpmamt));
			dm.setHdqtrcpmdt(hdqtrcpmdt);
			dm.setHdqtun_pymtamt(Long.parseLong(hdqtun_pymtamt));
			dm.setBorcpmamt(Long.parseLong(borcpmamt));
			dm.setBorcpmdt(borcpmdt);
			dm.setBoun_pymtamt(Long.parseLong(boun_pymtamt));
		}
		
		SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO 객체의 accessFctFrft 호출
        ds = dao.accessFctFrft(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.accessFctFrft(dm);
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
