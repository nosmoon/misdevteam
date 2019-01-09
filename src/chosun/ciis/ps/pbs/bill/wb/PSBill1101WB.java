/***************************************************************************************************
 * 파일명   : PSBill1101WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-03-29
 * 작성자   : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.wb;

import javax.ejb.*;
import java.rmi.*;
import java.lang.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.bill.ejb.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * 수금-개별입금
 */
public class PSBill1101WB {
    /**
     * 조회화면에 사용되는 입금방법 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_BILL_SEPRDataSet ds = null;
        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        PS_S_BILL_SEPRDM dm = new PS_S_BILL_SEPRDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSBill1101EJBHome home = (PSBill1101EJBHome) JNDIManager.getInstance().getHome("PSBill1101EJB");
        try {
            PSBill1101EJB ejb = home.create();
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
     * 조회조건에 해당되는 출판정기개별입금 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectSeprrecptList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_SEPRDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          //회사코드

        String cibocd = Util.checkString(req.getParameter("slt_bocd")); // 지국지사코드
        String ciprocdt_1 = Util.checkString(req.getParameter("proc_dd_1")); // 입금 일자
        String ciprocdt_2 = Util.checkString(req.getParameter("proc_dd_2")); // 입금 일자
        String cirecpmthd = Util.checkString(req.getParameter("rcpm_mthd")); // 입금방법
        //String circpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd")); // 입금구분코드
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // 현재페이지
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // 페이지당 레코드수

        long iPageSize = 15; // 페이지당 Row수 일단 10라인
        long iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_SEPRDM dm = new PS_L_BILL_SEPRDM(); //dm에 값을 Setting한다.

        dm.setCmpycd(cmpycd);//회사코드
        dm.setBocd(cibocd); // 지국지사 코드
        dm.setProc_dd_1(ciprocdt_1); // 입금 일자
        dm.setProc_dd_2(ciprocdt_2); // 입금 일자
        dm.setRcpm_mthd(cirecpmthd); // 입금 방법
        //dm.setRcpmclsfcd(circpmclsfcd); // 입금구분코드
        dm.setPageno(iPageNo); // 현재페이지
        dm.setPagesize(iPageSize); // 페이지당 Row수

        PSBill1101EJBHome home = (PSBill1101EJBHome) JNDIManager.getInstance().getHome("PSBill1101EJB");

        try {
            PSBill1101EJB ejb = home.create();
            ds = ejb.selectSeprrecpList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 개별입금을 하는 화면이다.
     * @param req
     * @param res
     * @throws AppException
     **/
    public void accessSeprrcpm(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_BILL_SEPRDataSet ds = null;
        boolean retValue = false;

        //사용자 세션정보
        String ciincmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String cibocd    = Util.checkString(req.getParameter("bocd"));          //지국지사코드
        String ciprocdt = Util.checkString(req.getParameter("procdt")); // 입금 일자
        String cirecpmthd = Util.checkString(req.getParameter("recpmthd")); // 입금 방법
        String circpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd")); // 입금 구분코드
        String ciclsfval = Util.checkString(req.getParameter("clsfval")); // 입력,수정,삭제
        String cirdr_no = Util.checkString(req.getParameter("rdr_no"));
        String cimedicd = Util.checkString(req.getParameter("medicd"));
        String citermsubsno = Util.checkString(req.getParameter("termsubsno"));
        String circpmseq = Util.checkString(req.getParameter("rcpmseq"));
        String cirecpdt = Util.checkString(req.getParameter("recpdt")); // 수납 일자
        int circpmamt = Integer.parseInt(Util.convertNull(req.getParameter("rcpmamt"), "0")); // 입금 금액

        PS_A_BILL_SEPRDM dm = new PS_A_BILL_SEPRDM(); //dm에 값을 Setting한다.

        dm.setIncmgpers(ciincmgpers); // 입력/수정자
        dm.setBocd(cibocd); // 지국지사 코드구분
        dm.setProcdt(ciprocdt); // 입금일자
        dm.setRecpmthd(cirecpmthd); // 입금방법
        dm.setRcpmclsfcd(circpmclsfcd); // 입금 구분 코드
        dm.setClsfval(ciclsfval); // 입력/수정/삭제
        dm.setRdr_no(cirdr_no); // 독자번호
        dm.setMedicd(cimedicd); // 매체코드
        dm.setTermsubsno(citermsubsno); // 정기구독번호
        dm.setRcpmseq(circpmseq); // 입금순번
        dm.setRecpdt(cirecpdt); // 수납일자
        dm.setRcpmamt(circpmamt); // 입금금액

        PSBill1101EJBHome home = (PSBill1101EJBHome) JNDIManager.getInstance().getHome("PSBill1101EJB");

        try {
            PSBill1101EJB ejb = home.create();
            retValue = ejb.accessSeprrcpm(dm); // 설정된 dm값으로 EJB를 호출한다.
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