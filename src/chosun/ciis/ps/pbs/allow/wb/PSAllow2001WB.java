/***************************************************************************************************
 * 파일명   : PSAllow2001WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 *            사원별수당처리 초기화면을 가져온다
 * 작성일자 : 2004-03-08
 * 작성자   : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.allow.ejb.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;

/**
 * 수당-가지급금
 */
public class PSAllow2001WB {
    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_EMP_ALON_BASEDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        PS_S_EMP_ALON_BASEDM dm = new PS_S_EMP_ALON_BASEDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSAllow1401EJBHome home = (PSAllow1401EJBHome) JNDIManager.getInstance().getHome("PSAllow1401EJB");
        try {

            PSAllow1401EJB ejb = home.create();

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
     * 조회화면에 사용되는 수당내역을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRsltList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_ALON_PRSLTDataSet ds = null;
        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);      //입력자아이디

        String aloncd = Util.checkString(req.getParameter("aloncd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String yymm = Util.checkString(req.getParameter("chk_yymm"));
        String boemp_no_from = Util.checkString(req.getParameter("boemp_no_from"));
        String boemp_no_to = Util.checkString(req.getParameter("boemp_no_to"));
        String curr_page_no = req.getParameter("curr_page_no"); // 현재페이지
        String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

        int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_ALON_PRSLTDM dm = new PS_L_ALON_PRSLTDM(); // DM 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setAloncd(aloncd);
        dm.setDeptcd(deptcd);
        dm.setYymm(yymm);
        dm.setBoemp_no_from(boemp_no_from);
        dm.setBoemp_no_to(boemp_no_to);
        dm.setPageno(iPageNo); // 현재페이지
        dm.setPagesize(iPageSize); //페이지당 Row수

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();

            ds = ejb.selectRsltList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 사원가지급금을 저장한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void accessAlon(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_ALONPRSNTDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);      //입력자아이디

        String bocd = Util.checkString(req.getParameter("bocd"));
        String aloncd = Util.checkString(req.getParameter("aloncd"));
        String boemp_no = Util.checkString(req.getParameter("ls_boemp_no"));
        String yymm = Util.checkString(req.getParameter("ls_yymm"));
        String realprsntdds = Util.checkString(req.getParameter("ls_realprsntdds"));
        String ddprsntalon = Util.checkString(req.getParameter("ls_ddprsntalon"));
        String amt = Util.checkString(req.getParameter("ls_amt"));

        PS_A_ALONPRSNTDM dm = new PS_A_ALONPRSNTDM(); // DM 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setAloncd(aloncd);
        dm.setBoemp_no(boemp_no);
        dm.setYymm(yymm);
        dm.setRealprsntdds(realprsntdds);
        dm.setDdprsntalon(ddprsntalon);
        dm.setAmt(amt);

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();

            ds = ejb.accessAlon(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 사원특수수당을 상세조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void select_Payadv_Detail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_PAYADVDataSet ds = null;
        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          //지국지사코드
        String bocd = Util.checkString(req.getParameter("bocd"));

        String supp_yymm = Util.checkString(req.getParameter("supp_yymm"));
        String boemp_no = Util.checkString(req.getParameter("emp_code"));

        PS_S_PAYADVDM dm = new PS_S_PAYADVDM(); // DM 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd); // 지국지사 코드구분
        dm.setSupp_yymm(supp_yymm);
        dm.setBoemp_no(boemp_no);

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();
            ds = ejb.select_Payadv_Detail(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 사원특수수당을 상세저장/수정한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void accessPayadv(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_PAYADVDataSet ds = null;
        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        // 출판국이 아닐경우는 ALL로 모든 매체코드를 조회한다.
        String bocd = Util.checkString(req.getParameter("bocd"));
        String supp_yymm = Util.checkString(req.getParameter("supp_yymm"));
        String boemp_no = Util.checkString(req.getParameter("emp_code"));

        int tel_charge = Integer.parseInt(Util.convertNull(req.getParameter("tel_charge"), "0")); // 전화비
        int resp_subs = Integer.parseInt(Util.convertNull(req.getParameter("resp_subs"), "0")); // 책임공제
        int subs_susp = Integer.parseInt(Util.convertNull(req.getParameter("subs_susp"), "0")); // 절독공제
        int pay_adv = Integer.parseInt(Util.convertNull(req.getParameter("pay_adv"), "0")); // 가불
        int mutu_aid = Integer.parseInt(Util.convertNull(req.getParameter("mutu_aid"), "0")); // 상조회비
        int loan = Integer.parseInt(Util.convertNull(req.getParameter("loan"), "0")); // 대여금
        int loan_interest = Integer.parseInt(Util.convertNull(req.getParameter("loan_interest"), "0")); // 대여금이자
        int subs_sum = Integer.parseInt(Util.convertNull(req.getParameter("subs_sum"), "0")); // 공제액합계
        int etc1 = Integer.parseInt(Util.convertNull(req.getParameter("etc1"), "0")); // ETC1
        int etc2 = Integer.parseInt(Util.convertNull(req.getParameter("etc2"), "0")); // ETC2
        int etc3 = Integer.parseInt(Util.convertNull(req.getParameter("etc3"), "0")); // ETC3
        int etc4 = Integer.parseInt(Util.convertNull(req.getParameter("etc4"), "0")); // ETC4
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk"))); // 메모

        PS_A_PAYADVDM dm = new PS_A_PAYADVDM(); // DM 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd); // 지국지사 코드구분
        dm.setSupp_yymm(supp_yymm);
        dm.setBoemp_no(boemp_no);
        dm.setTel_charge(tel_charge);
        dm.setResp_subs(resp_subs);
        dm.setSubs_susp(subs_susp);
        dm.setPay_adv(pay_adv);
        dm.setMutu_aid(mutu_aid);
        dm.setLoan(loan);
        dm.setLoan_interest(loan_interest);
        dm.setSubs_sum(subs_sum);
        dm.setIncmgpers(incmgpers);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        dm.setEtc4(etc4);
        dm.setRemk(remk);

        PSAllow2001EJBHome home = (PSAllow2001EJBHome) JNDIManager.getInstance().getHome("PSAllow2001EJB");
        try {

            PSAllow2001EJB ejb = home.create();
            ds = ejb.accessPayadv(dm); // 설정된 dm값으로 EJB를 호출한다.
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
