/***************************************************************************************************
 * 파일명   : PSSupport1401WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2005-12-16
 * 작성자   : 전현표
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.support.ejb.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;

/**
 * 불편관리-현금영수증신청
 */
public class PSSupport1401WB {
    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DSCT_SPPTDataSet ds = null;

        // 출판국이 아닐경우는 ALL로 모든 매체코드를 조회한다.
        PS_L_DSCT_SPPTDM dm = new PS_L_DSCT_SPPTDM(); // DM 값을 Setting한다.

        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

        dm.setCmpycd(cmpycd);

        PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
        try {

            PSSupport1401EJB ejb = home.create();

            ds = ejb.selectCodeList(dm); // 설정된 dm값으로 EJB를 호출한다.

            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 현금영수증 신청 내역을 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCashrcptList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_CASHRCPTDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);  //입력자아이디

        String cashrcpt_dtbgn = Util.checkString(req.getParameter("cashrcpt_dtbgn"));   //조회일자
        String cashrcpt_dtend = Util.checkString(req.getParameter("cashrcpt_dtend"));   //조회일자
        String bocd = Util.checkString(req.getParameter("bocd"));                       //배정여부
        String medicd = Util.checkString(req.getParameter("medicd"));                   //매체코드
        String selpubclsf = Util.checkString(req.getParameter("selpubclsf"));           //출판판매구분
        String rcptclsf = Util.checkString(req.getParameter("rcptclsf"));               //현금영수증 발행구분
        String curr_page_no = req.getParameter("curr_page_no");                         //현재페이지
        String records_per_page = req.getParameter("records_per_page");                 //페이지당 Row수

        int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_CASHRCPTDM dm = new PS_L_CASHRCPTDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setCashrcpt_dtbgn(cashrcpt_dtbgn);
        dm.setCashrcpt_dtend(cashrcpt_dtend);
        dm.setIncmgpers(incmgpers);
        dm.setMedicd(medicd);
        dm.setSelpubclsf(selpubclsf);
        dm.setRcptclsf(rcptclsf);

        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
        try {

            PSSupport1401EJB ejb = home.create();

            ds = ejb.selectCashrcptList(dm); // 설정된 dm값으로 EJB를 호출한다.

            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 이사처리 상세내역 보기
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */

    public void selectCashrcptDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_CASHRCPTDataSet ds = null;

        //사용자 세션정보
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드

        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd_m = Util.checkString(req.getParameter("medicd_m"));
        String selpubclsf = Util.checkString(req.getParameter("selpubclsf"));

        PS_S_CASHRCPTDM dm = new PS_S_CASHRCPTDM(); // DM 값을 Setting한다.
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd_m);
        dm.setSelpubclsf(selpubclsf);

        PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
        try {

            PSSupport1401EJB ejb = home.create();

            ds = ejb.selectCashrcptDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
    * 현금영수증 신청/취소 처리한다.
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
    public void accessCashrcpt (HttpServletRequest req, HttpServletResponse res) throws AppException {
       CO_A_CASHRCPTDataSet ds = null;

       //사용자 세션정보
       String bocd = Util.getSessionParameterValue(req, "cmpycd", true);        //지국지사코드
       String incmgpers = Util.getSessionParameterValue(req, "uid", true);      //입력자아이디
       String aplcpers = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpers")));  //신청자명
       String flag = Util.checkString(req.getParameter("flag"));                //신청/취소플래그

       String prn = Util.checkString(req.getParameter("prn"));                  //주민번호
       String rdr_no = Util.checkString(req.getParameter("rdr_no"));            //독자번호
       String ptphno1 = Util.checkString(req.getParameter("ptphno1"));          //핸드폰1
       String ptphno2 = Util.checkString(req.getParameter("ptphno2"));          //핸드폰2
       String ptphno3 = Util.checkString(req.getParameter("ptphno3"));          //핸드폰3
       String selpublclsf = Util.checkString(req.getParameter("selpubclsf"));   //출판판매구분
       String rcptclsf = Util.checkString(req.getParameter("rcptclsf"));        //현금영수증발행구분
       String aplcpath = Util.checkString(req.getParameter("aplcpath"));        //신청경로

       CO_A_CASHRCPTDM dm = new CO_A_CASHRCPTDM(); // DM 값을 Setting한다.

       dm.setAplcpers(aplcpers);
       dm.setFlag(flag);
       dm.setIncmgpers(incmgpers);
       dm.setPrn(prn);
       dm.setPtphno1(ptphno1);
       dm.setPtphno2(ptphno2);
       dm.setPtphno3(ptphno3);
       dm.setRdr_no(rdr_no);
       dm.setSelpubclsf(selpublclsf);
       dm.setRcptclsf(rcptclsf);
       dm.setAplcpath(aplcpath);

       PSSupport1401EJBHome home = (PSSupport1401EJBHome) JNDIManager.getInstance().getHome("PSSupport1401EJB");
       try {

           PSSupport1401EJB ejb = home.create();

           ds = ejb.accessCashrcpt(dm); // 설정된 dm값으로 EJB를 호출한다.

           req.setAttribute("ds", ds); // request에 결과값을 담는다.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
           throw se;
       }
   }
}