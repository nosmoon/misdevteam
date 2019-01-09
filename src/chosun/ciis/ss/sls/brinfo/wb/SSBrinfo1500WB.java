/***************************************************************************************************
* 파일명 : SSBrinfo1500WB.java
* 기능 : 지국Info-전세지원금현황 처리를 위한 Worker Bean
* 작성일자 : 2004-02-09
* 작성자 : 김성규
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-전세지원금현황을 위한 WB
 */

public class SSBrinfo1500WB{

    /**
     * 지국Info-전세지원금현황-초기화면(부서조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBuseoList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();

        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO 객체의 selectBuseoList 호출
        ds = dao.selectBuseoList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.selectBuseoList(dm);
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
     * 지국Info-전세지원금현황-초기화면(결과조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectLeasamtList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_LEASAMT_LISTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
        String booffi_roomownr = Util.Uni2Ksc(Util.checkString(req.getParameter("booffi_roomownr")));
        String bondprsvobjvolownr = Util.Uni2Ksc(Util.checkString(req.getParameter("bondprsvobjvolownr")));

        String pageno = Util.checkString(req.getParameter("pageno"));       //현재 페이지
        String pagesize = Util.checkString(req.getParameter("pagesize")); //페이지당 건수

        // DM Setting
        SS_L_LEASAMT_LISTDM dm = new SS_L_LEASAMT_LISTDM();

        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setPresi_nm(presi_nm);
        dm.setBooffi_roomownr(booffi_roomownr);
        dm.setBondprsvobjvolownr(bondprsvobjvolownr);

        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈

        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO 객체의 selectLeasamtList 호출
        ds = dao.selectLeasamtList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.selectLeasamtList(dm);
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
     * 지국Info-전세지원금현황-상세 조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectDetailView(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_LEASAMTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        SS_S_LEASAMTDM dm = new SS_S_LEASAMTDM();

        dm.setDeptcd(deptcd);  //부서코드
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setSeq(seq);
        
        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO 객체의 selectDetailView 호출
        ds = dao.selectDetailView(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.selectDetailView(dm);
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
     * 지국Info-전세지원금현황-정보 수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateDetailView(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_LEASAMTDataSet ds = null;
        // Request Parameter Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                   // 작업자
        String deptcd = Util.checkString(req.getParameter("deptcd"));                            //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));                            //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));                                //지국코드
        String seq = Util.checkString(req.getParameter("seq"));

        String bondregiconf = Util.checkString(req.getParameter("bondregiconf"));                //채권등기필증
        String bondregi = Util.checkString(req.getParameter("bondregi"));                        //채권등기부등본
        String bondwarrp = Util.checkString(req.getParameter("bondwarrp"));                      //채권보증서
        String leascntrp = Util.checkString(req.getParameter("leascntrp"));                      //전세계약서
        String leasregi = Util.checkString(req.getParameter("leasregi"));                        //전세등기부등본
        String leasexch_note = Util.checkString(req.getParameter("leasexch_note"));              //전세각서
        String leasloandeed = Util.checkString(req.getParameter("leasloandeed"));                //전세차용증서
        String prvoffideciddocuyn = Util.checkString(req.getParameter("prvoffideciddocuyn"));    //전임국결재서류
        String curroffideciddocuyn = Util.checkString(req.getParameter("curroffideciddocuyn"));  //현임국결재서류
        String prvhdqtdeciddocuyn = Util.checkString(req.getParameter("prvhdqtdeciddocuyn"));    //전임본결재서류
        String currhdqtdeciddocuyn = Util.checkString(req.getParameter("currhdqtdeciddocuyn"));  //현임본결재서류
        String remk= Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                                                   //비고

        // DM Setting
        SS_U_LEASAMTDM dm = new SS_U_LEASAMTDM();

        dm.setIncmgpers(incmgpers);                           //입력자
        dm.setDeptcd(deptcd);                                 //부서코드
        dm.setAreacd(areacd);                                 //지역코드
        dm.setBocd(bocd);                                     //지국코드
        dm.setSeq(seq);
        dm.setBondregiconf(bondregiconf);                     //채권등기필증
        dm.setBondregi(bondregi);                             //채권등기부등본
        dm.setBondwarrp(bondwarrp);                           //채권보증서
        dm.setLeascntrp(leascntrp);                           //전세계약서
        dm.setLeasregi(leasregi);                             //전세등기부등본
        dm.setLeasexch_note(leasexch_note);                   //전세각서
        dm.setLeasloandeed(leasloandeed);                     //전세차용증서
        dm.setPrvoffideciddocuyn(prvoffideciddocuyn);         //전임국결재서류
        dm.setCurroffideciddocuyn(curroffideciddocuyn);       //현임국결재서류
        dm.setPrvhdqtdeciddocuyn(prvhdqtdeciddocuyn);         //전임본결재서류
        dm.setCurrhdqtdeciddocuyn(currhdqtdeciddocuyn);       //현임본결재서류
        dm.setRemk(remk);                                     //비고
        
        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO 객체의 selectDetailView 호출
        ds = dao.updateDetailView(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.updateDetailView(dm);
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
