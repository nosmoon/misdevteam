/***************************************************************************************************
 * 파일명   : PSSend2101WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004/03/18
 * 작성자   : 장수환
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.send.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.send.ejb.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;

/**
 * 발송-반송관리
 */
public class PSSend2101WB {
    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_RETNDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        PS_S_SEND_RETNDM dm = new PS_S_SEND_RETNDM(); // DM 값을 Setting한다.

        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

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
     * 반송관리 내역 조회
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRetnList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_RETNDataSet ds = null;
        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        // 출판국이 아닐경우는 ALL로 모든 매체코드를 조회한다.
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_bocd")));     // 지국지사코드
        String retndt_fr = Util.checkString(req.getParameter("slt_retndt_fr"));         // 반송일자(From)
        String retndt_to = Util.checkString(req.getParameter("slt_retndt_to"));         // 반송일자(To)
        String retnclsf = Util.checkString(req.getParameter("slt_retnclsf"));           // 반송종류
        String boprocyn = Util.checkString(req.getParameter("slt_boprocyn"));           // 처리결과
        String acqnm = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_acqnm")));   // 수취인명
        String curr_page_no = req.getParameter("curr_page_no");                         // 현재페이지
        String records_per_page = req.getParameter("records_per_page");                 // 페이지당 Row수
        int iPageSize = Integer.parseInt(records_per_page);             // 페이지당 Row수 int로 변환
        int iPageNo = 1;                                                // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) {         // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_SEND_RETNDM dm = new PS_L_SEND_RETNDM();   // DM 값을 Setting한다.

        dm.setBocd(bocd);           // 지국지사코드
        dm.setCmpycd(cmpycd);       // 회사코드
        dm.setRetndt_fr(retndt_fr); // 반송일자(From)
        dm.setRetndt_to(retndt_to); // 반송일자(To)
        dm.setRetnclsf(retnclsf);   // 반송종류
        dm.setBoprocyn(boprocyn);   // 처리결과
        dm.setAcqnm(acqnm);         // 수취인명
        dm.setPageno(iPageNo);      // 현재페이지
        dm.setPagesize(iPageSize);  // 페이지당 Row수

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");

        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.selectRetnList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 반송내역 상세 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRetnDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_RETN_DTLDataSet ds = null;
        //사용자 세션정보
        //String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        // 출판국이 아닐경우는 ALL로 모든 매체코드를 조회한다.
        String bocd = Util.checkString(req.getParameter("slt_bocd")) ;// 지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no")); // 독자번호
        String medicd = Util.checkString(req.getParameter("medicd")); // 매체코드
        String termsubsno = Util.checkString(req.getParameter("termsubsno")); // 정기독자번호
        String retnseq = Util.checkString(req.getParameter("retnseq")); // 반송순번

        PS_S_SEND_RETN_DTLDM dm = new PS_S_SEND_RETN_DTLDM(); // DM 값을 Setting한다.
        dm.setBocd(bocd); // 지국지사
        dm.setIncmgpers(incmgpers); // 입력자
        dm.setRdr_no(rdr_no); // 독자번호
        dm.setMedicd(medicd); // 매체코드
        dm.setTermsubsno(termsubsno); // 정기독자번호
        dm.setRetnseq(retnseq); // 반송순번

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.selectRetnDetail(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 반송내역 저장처리
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void accessRetn(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_RETN_PTCRDataSet ds = null;

        //사용자 세션정보
        //String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적인 Request값
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd"))); // 지국지사코드
        String gbnflag = Util.checkString(req.getParameter("gbnflag"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String retnseq = Util.checkString(req.getParameter("retnseq"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));
        String retndt = Util.checkString(req.getParameter("retndt"));
        String retnclsf = Util.checkString(req.getParameter("retnclsf"));
        String retn_nmno = Util.checkString(req.getParameter("retn_nmno"));
        String bns_bookcd = Util.checkString(req.getParameter("bns_bookcd"));
        String agrmntdt = Util.checkString(req.getParameter("agrmntdt"));
        String agrmntamt = Util.checkString(req.getParameter("agrmntamt"));
        String retnresncd = Util.checkString(req.getParameter("retnresncd"));
        String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));
        String boprocdt = Util.checkString(req.getParameter("boprocdt"));
        String boprocmemo = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocmemo")));

        PS_A_RETN_PTCRDM dm = new PS_A_RETN_PTCRDM(); // DM 값을 Setting한다.

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setGbnflag(gbnflag);
        dm.setRdr_no(rdr_no);
        dm.setRetnseq(retnseq);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setRetndt(retndt);
        dm.setRetnclsf(retnclsf);
        dm.setRetn_nmno(retn_nmno);
        dm.setBns_bookcd(bns_bookcd);
        dm.setAgrmntdt(agrmntdt);
        dm.setAgrmntamt(agrmntamt);
        dm.setRetnresncd(retnresncd);
        dm.setMemo(memo);
        dm.setBoprocyn(boprocyn);
        dm.setBoprocdt(boprocdt);
        dm.setBoprocmemo(boprocmemo);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.accessRetn(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 반송관리 excel 입력
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void excelUpload(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_I_RETN_PTCR_LUMPDataSet ds = null;

        //사용자 세션정보
        //String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적인 Request값
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd"))); //지국지사코드
        String retndt = Util.checkString(req.getParameter("retndt"));           //반송일자        
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));           //독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));           //독자번호
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));   //독자번호
        String retnclsf = Util.checkString(req.getParameter("retnclsf"));       //반송종류
        String retn_nmno = Util.checkString(req.getParameter("retn_nmno"));     //반송호수
        String retnresncd = Util.checkString(req.getParameter("retnresncd"));   //반송사유
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));       //처리여부

        PS_I_RETN_PTCR_LUMPDM dm = new PS_I_RETN_PTCR_LUMPDM(); // DM 값을 Setting한다.

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setRetndt(retndt);
        dm.setRetnclsf(retnclsf);
        dm.setRetn_nmno(retn_nmno);
        dm.setRetnresncd(retnresncd);
        dm.setBoprocyn(boprocyn);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.excelUpload(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 반송내역 삭제하기 위한 데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void deleteRetn(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_D_RETN_PTCR_DTLDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("add_rdr_no")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("add_medicd")));
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("add_termsubsno")));
        String retnseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("add_retnseq")));

        // DM 값을 Setting한다.
        PS_D_RETN_PTCR_DTLDM dm = new PS_D_RETN_PTCR_DTLDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setRetnseqarr(retnseqarr);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {
            PSSend2101EJB ejb = home.create();
            ds = ejb.deleteRetn(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectBnsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BNS_BOOK_CDDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        PS_L_BNS_BOOK_CDDM dm = new PS_L_BNS_BOOK_CDDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.selectBnsList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
