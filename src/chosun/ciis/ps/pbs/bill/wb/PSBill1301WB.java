/***************************************************************************************************
 * 파일명   : PSBill1301WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2003-12-12
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
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.bill.ejb.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.ejb.*;

/**
 * 수금-비정상입금
 */
public class PSBill1301WB {

    /**
     * 조회화면에 사용되는 발송방법을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_ABNOR_SEPBKDataSet ds = null;
        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        PS_S_ABNOR_SEPBKDM dm = new PS_S_ABNOR_SEPBKDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSBill1301EJBHome home = (PSBill1301EJBHome) JNDIManager.getInstance().getHome("PSBill1301EJB");
        try {
            PSBill1301EJB ejb = home.create();
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
     * 조회조건에 해당되는 비정상 입금 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/

    public void selectNonrcpmList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_NONRCPMDataSet ds = null;

        //사용자 세션정보
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String cibocd      = Util.checkString(req.getParameter("slt_bocd"));  //지국지사코드
        String ciacqdt_1 = Util.checkString(req.getParameter("acqdt_1")); // 수취일자
        String ciacqdt_2 = Util.checkString(req.getParameter("acqdt_2")); // 수취일자
        String circpmrflyn = Util.checkString(req.getParameter("rcpmrflyn")); // 입금반영여부

        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // 현재 페이지 No
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // 페이지 별 record 수

        long iPageSize = 15; // 페이지당 Row수
        long iPageNo = 1; // 최초 페이지 1로 설정

        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_NONRCPMDM dm = new PS_L_BILL_NONRCPMDM();

        dm.setBocd(cibocd); // 지국 지사 코드
        dm.setAcqdt_1(ciacqdt_1); // 수취 일자
        dm.setAcqdt_2(ciacqdt_2); // 수취 일자
        dm.setRcpmrflyn(circpmrflyn);

        dm.setPageno(iPageNo); // 현재 페이지
        dm.setPagesize(iPageSize); // 페이지당 Row 수

        PSBill1301EJBHome home = (PSBill1301EJBHome) JNDIManager.getInstance().getHome("PSBill1301EJB");

        try {
            PSBill1301EJB ejb = home.create();

            ds = ejb.selectNonrcpmList(dm);
            req.setAttribute("ds", ds);
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
     * 조회조건에 해당되는 비정상 입금 목록을 저장,업데이트
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void accessNonrcpm(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_BILL_NONRCPMDataSet ds = null;
        boolean retValue = false;

        //사용자 세션정보
        String ciincmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String ciprocdt = Util.checkString(req.getParameter("procdt")); // 입금일자(반영일자)
        String cirecpdt = Util.checkString(req.getParameter("recpdt")); // 수납 일자
        String circpmamt = Util.convertNull(req.getParameter("rcpmamt"), "0"); // 수납 금액
        String cirecpbrchcd   = Util.checkString(req.getParameter("recpbrchcd"));     // 수납점 코드
        String cinormerrclsf = Util.checkString(req.getParameter("normerrclsf")); // 정상 오류 구분(A장표,Reject)
        String cirdr_no = Util.checkString(req.getParameter("rdr_no_chk")); // 독자번호
        String cimedicd = Util.checkString(req.getParameter("medicd_chk")); // 매체코드
        String citermsubsno = Util.checkString(req.getParameter("termsubsno_chk")); // 출판정기독자번호
        String cibocd      = Util.checkString(req.getParameter("bocd_chk"));          //지국지사코드
        String cicustbrwsno = Util.checkString(req.getParameter("custbrwsno")); // 관리번호
        String ciseq = Util.checkString(req.getParameter("seq")); // 순번
        String ciacqdt = Util.checkString(req.getParameter("acqdt")); // 입금일
        String ciacqno = Util.checkString(req.getParameter("acqno")); // 입금 번호

        PS_A_BILL_NONRCPMDM dm = new PS_A_BILL_NONRCPMDM();

        dm.setIncmgpers(ciincmgpers);
        dm.setBocd(cibocd);
        dm.setProcdt(ciprocdt);
        dm.setRecpdt(cirecpdt);
        dm.setRcpmamt(circpmamt);

        dm.setRecpbrchcd(cirecpbrchcd);
        dm.setNormerrclsf(cinormerrclsf);

        dm.setRdr_no(cirdr_no);
        dm.setMedicd(cimedicd);
        dm.setTermsubsno(citermsubsno);
        dm.setCustbrwsno(cicustbrwsno);

        dm.setSeq(ciseq);
        dm.setAcqdt(ciacqdt);
        dm.setAcqno(ciacqno);

        PSBill1301EJBHome home = (PSBill1301EJBHome) JNDIManager.getInstance().getHome("PSBill1301EJB");

        try {
            PSBill1301EJB ejb = home.create();
            retValue = ejb.accessNonrcpm(dm);
            req.setAttribute("ds", ds);
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