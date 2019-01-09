/***************************************************************************************************
 * 함수명   : PSBill1401WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2003-11-18
 * 작성자   : 김건호
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.bill.ejb.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.dao.*;

/**
 * 수금-초과입금처리
 */
public class PSBill1401WB {

    /**
     * 초과입금처리 초기화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_C_EXCSRCPMPROCDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        PS_C_EXCSRCPMPROCDM dm = new PS_C_EXCSRCPMPROCDM();

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");
        try {
            PSBill1401EJB ejb = home.create();
            ds = ejb.selectCombolist(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * 초과입금 내역을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_EXCSRCPMPROCDataSet ds = null;

        String bocd = Util.checkString(req.getParameter("slt_bocd"));
        String subsyy = Util.checkString(req.getParameter("subsyy"));
        String excsrcpmporcyn = Util.checkString(req.getParameter("excsrcpmporcyn"));
        String procdtbgn = Util.checkString(req.getParameter("procdtbgn"));
        String procdtend = Util.checkString(req.getParameter("procdtend"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String sPageNo = req.getParameter("curr_page_no"); // 현재페이지
        int iPageSize = 10; // 페이지당 Row수 일단 10라인
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(sPageNo);
        }

        PS_L_BILL_EXCSRCPMPROCDM dm = new PS_L_BILL_EXCSRCPMPROCDM();
        //dm에 값을 Setting한다.

        dm.setBocd(bocd);
        dm.setSubsyy(subsyy);
        dm.setProcyn(excsrcpmporcyn);
        dm.setProcdtbgn(procdtbgn);
        dm.setProcdtend(procdtend);
        dm.setPageno(iPageNo); // 현재페이지
        dm.setPagesize(iPageSize); //페이지당 Row수

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");
        try {
            PSBill1401EJB ejb = home.create();
            ds = ejb.selectList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * 초과입금을 입력한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void aceessExcsamt(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //사용자 세션정보
        String pers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String bocd    = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_bocd")));         //지국지사코드
        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
        String procdt = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt")));
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno"))); //정기구둑번호
        String procclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("procclsf")));
        String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
        String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
        String procamt = Util.Uni2Ksc(Util.checkString(req.getParameter("procamt")));
        String aftsubsendser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("extdtms")));

        PS_A_BILL_EXCSRCPMPROCDM dm = new PS_A_BILL_EXCSRCPMPROCDM();
        //dm에 값을 Setting한다.

        dm.setAccflag(accflag);
        dm.setProcdt(procdt);
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno); //정기구둑번호
        dm.setProcclsf(procclsf);
        dm.setSeq(seq);
        dm.setMemo(memo);
        dm.setProcamt(procamt);
        dm.setAftsubsendser_no(aftsubsendser_no);
        dm.setPers(pers);

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");

        try {
            PSBill1401EJB ejb = home.create();

            bResult = ejb.aceessExcsamt(dm); // 설정된 dm값으로 EJB를 호출한다.
            if (bResult == true) { // 성공적으로 입력된 경우
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * 단일 독자정보를 검색한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectRdrinfoPart(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PB_S_RDRINFO_PARTDataSet ds = null;

        //사용자 세션정보
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.checkString(req.getParameter("slt_bocd"));                                         //지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                         //독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));                                         //매체코드
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));                                 //정기구독번호

        //DM 값을 Setting한다.
        PB_S_RDRINFO_PARTDM dm = new PB_S_RDRINFO_PARTDM();
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setRdr_no(rdr_no);                                                                                 //독자번호
        dm.setMedicd(medicd);                                                                                 //매체코드
        dm.setTermsubsno(termsubsno);                                                                         //정기구독번호

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");

        try{
            PSBill1401EJB ejb = home.create();
            ds = ejb.selectRdrinfoPart(dm);             // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                 // request에 결과값을 담는다.
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