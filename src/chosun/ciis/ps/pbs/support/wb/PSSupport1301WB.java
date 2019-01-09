/***************************************************************************************************
 * 파일명   : PSSupport1301WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2005-02-07
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
 * 불편접수-이사처리
 */
public class PSSupport1301WB {
    /**
     * 불편접수된 내역을 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectMoveList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_MOVM_RDRDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드

        String regdt_fr = Util.checkString(req.getParameter("regdt_fr"));               //조회일자
        String regdt_to = Util.checkString(req.getParameter("regdt_to"));               //조회일자
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));               //배정여부
        String acptbocnfmyn = Util.checkString(req.getParameter("acptbocnfmyn"));       //처리여부
        String rdrnm = Util.Ksc2Uni(Util.checkString(req.getParameter("rdrnm")));       //독자명
        String curr_page_no = req.getParameter("curr_page_no");                         // 현재페이지
        String records_per_page = req.getParameter("records_per_page");                 // 페이지당 Row수

        int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_MOVM_RDRDM dm = new PS_L_MOVM_RDRDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setRegdt_fr(regdt_fr);
        dm.setRegdt_to(regdt_to);
        dm.setRdrnm(rdrnm);
        dm.setBoprocyn(boprocyn);
        dm.setAcptbocnfmyn(acptbocnfmyn);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSupport1301EJBHome home = (PSSupport1301EJBHome) JNDIManager.getInstance().getHome("PSSupport1301EJB");
        try {

            PSSupport1301EJB ejb = home.create();

            ds = ejb.selectMoveList(dm); // 설정된 dm값으로 EJB를 호출한다.

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

    public void selectMoveDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_MOVM_RDRDataSet ds = null;

        //사용자 세션정보
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드

        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        PS_S_MOVM_RDRDM dm = new PS_S_MOVM_RDRDM(); // DM 값을 Setting한다.
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        PSSupport1301EJBHome home = (PSSupport1301EJBHome) JNDIManager.getInstance().getHome("PSSupport1301EJB");
        try {

            PSSupport1301EJB ejb = home.create();

            ds = ejb.selectMoveDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
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
    * 이사신청을 지사배정 처리한다.
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBranchMove(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_U_MOVM_RDRDataSet ds = null;

       //사용자 세션정보
       String bocd = Util.getSessionParameterValue(req, "cmpycd", true);    //지국지사코드
       String incmgpers = Util.getSessionParameterValue(req, "uid", true);  //입력자아이디

       String regdt = Util.checkString(req.getParameter("regdt"));          //등록일자
       String regno = Util.checkString(req.getParameter("regno"));          //등록번호
       String rdrbocd = Util.checkString(req.getParameter("rdrbocd"));      //해당지사
       String rdr_no = Util.checkString(req.getParameter("rdr_no"));        //독자번호
       String medicd =  Util.checkString(req.getParameter("medicd"));       //매체코드
       String termsubsno =  Util.checkString(req.getParameter("termsubsno"));               //우편번호
       String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));                //주소
       String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));              //주소
       String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));      //주소상세
       String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));            //수취인명
       String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));                //전화1
       String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));                //전화2
       String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));                //전화3

       PS_U_MOVM_RDRDM dm = new PS_U_MOVM_RDRDM(); // DM 값을 Setting한다.

       dm.setRegdt(regdt);
       dm.setRegno(regno);
       dm.setRdrbocd(rdrbocd);
       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);
       dm.setZip(zip);
       dm.setAddr(addr);
       dm.setDtlsaddr(dtlsaddr);
       dm.setRdrnm(rdrnm);
       dm.setRdrtel_no1(rdrtel_no1);
       dm.setRdrtel_no2(rdrtel_no2);
       dm.setRdrtel_no3(rdrtel_no3);
       dm.setIncmgpers(incmgpers);

       PSSupport1301EJBHome home = (PSSupport1301EJBHome) JNDIManager.getInstance().getHome("PSSupport1301EJB");
       try {

           PSSupport1301EJB ejb = home.create();

           ds = ejb.updateBranchMove(dm); // 설정된 dm값으로 EJB를 호출한다.

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