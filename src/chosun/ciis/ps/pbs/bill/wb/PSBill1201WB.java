/***************************************************************************************************
 * 파일명   : PSBill1201WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-03-28
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

/**
 * 수금-일괄입금
 */
public class PSBill1201WB {
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
     * 조회조건에 해당되는 일괄입금 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectLumprcpmList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_TACOM_GRRCPCMDataSet ds = null;

        //사용자 세션정보
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드

        String cibocd = Util.checkString(req.getParameter("slt_bocd")); // 수취 일자
        String ciacqdt_1 = Util.checkString(req.getParameter("acqdt_1")); // 수취 일자
        String ciacqdt_2 = Util.checkString(req.getParameter("acqdt_2")); // 수취 일자
        String circpmrflendyn = Util.checkString(req.getParameter("rcpmrflendyn")); // 입금처리 여부
        if (circpmrflendyn.equals("01"))
            circpmrflendyn = "N";
        else if (circpmrflendyn.equals("02"))
            circpmrflendyn = "Y";
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // 현재페이지
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // 페이지당 레코드수
        long iPageSize = 5; // 페이지당 Row수 일단 10라인
        long iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_TACOM_GRRCPCMDM dm = new PS_L_BILL_TACOM_GRRCPCMDM(); //dm에 값을 Setting한다.

        dm.setCmpycd(cmpycd);   //본사 코드
        dm.setBocd(cibocd);     // 지국지사 코드
        dm.setAcqdt_1(ciacqdt_1); // 수취 일자
        dm.setAcqdt_2(ciacqdt_2); // 수취 일자
        dm.setRcpmrflendyn(circpmrflendyn); // 입금 처리 여부
        dm.setPageno(iPageNo); // 현재페이지
        dm.setPagesize(iPageSize); // 페이지당 Row수

        PSBill1201EJBHome home = (PSBill1201EJBHome) JNDIManager.getInstance().getHome("PSBill1201EJB");

        try {
            PSBill1201EJB ejb = home.create();
            ds = ejb.selectLumprcpmList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 조회조건에 해당되는 일괄입금 상세 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectLumprcpmDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_TACOD_GRRCPCMDataSet ds = null;

        String cigirono = Util.checkString(req.getParameter("girono")); // 지국지사 지로 번호
        String ciacqdt = Util.checkString(req.getParameter("acqdt")); // 수취 일자
        String ciacqno = Util.checkString(req.getParameter("acqno")); // 코드명
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // 현재페이지
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // 페이지당 레코드수

        long iPageSize = 10; // 페이지당 Row수 일단 10라인
        long iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_TACOD_GRRCPCMDM dm = new PS_L_BILL_TACOD_GRRCPCMDM(); //dm에 값을 Setting한다.

        dm.setGirono(cigirono); // 지국지사 지로 번호
        dm.setAcqdt(ciacqdt); // 수취 일자
        dm.setAcqno(ciacqno); // 수취 번호
        dm.setPageno(iPageNo); // 현재페이지
        dm.setPagesize(iPageSize); // 페이지당 Row수

        PSBill1201EJBHome home = (PSBill1201EJBHome) JNDIManager.getInstance().getHome("PSBill1201EJB");

        try {
            PSBill1201EJB ejb = home.create();
            ds = ejb.selectLumprcpmDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
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
