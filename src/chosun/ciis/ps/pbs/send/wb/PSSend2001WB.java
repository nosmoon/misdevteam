/***************************************************************************************************
 * 파일명   : PSSend2001WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004/03/12
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
 * 발송-지로추가발송
 */
public class PSSend2001WB {

    /**
     * 지로추가발송처리 관리화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_LUMP_PROCDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드
        String medicd      = Util.checkString(req.getParameter("medicd"));              //매체코드
        String sendtype    = "01";

        PS_S_SEND_LUMP_PROCDM dm = new PS_S_SEND_LUMP_PROCDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setSendtype(sendtype);

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");
        try {
            PSSend2001EJB ejb = home.create();
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
     * 지로추가발송 내역을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_GIROADDMDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

        String bocd = Util.checkString(req.getParameter("sendbrch"));
        String girosenddt = Util.checkString(req.getParameter("senddt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        if (bocd == null || bocd.equals("")) {
            bocd = "ALL";
        }

        String sPageNo = req.getParameter("curr_page_no"); // 현재페이지
        int iPageSize = 20; // 페이지당 Row수 일단 20라인
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(sPageNo);
        }

        PS_L_SEND_GIROADDMDM dm = new PS_L_SEND_GIROADDMDM();
        //dm에 값을 Setting한다.

        dm.setBocd(bocd);
        dm.setCmpycd(cmpycd);
        dm.setGirosenddt(girosenddt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");

        try {
            PSSend2001EJB ejb = home.create();
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
     * 지로추가발송 입력한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void aceessGiroaddmsend(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값
        //세젼정보
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //사용자아이디

        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));
        String issuseq = Util.checkString(req.getParameter("issuseq"));
        String senddt = Util.checkString(req.getParameter("senddt"));
        String agrmntdt = Util.checkString(req.getParameter("agrmntdt"));
        String agrmntamt = Util.checkString(req.getParameter("agrmntamt"));

        PS_A_SEND_GIROADDMDM dm = new PS_A_SEND_GIROADDMDM();
        //dm에 값을 Setting한다.

        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setIssuseq(issuseq);
        dm.setSenddt(senddt);
        dm.setAgrmntdt(agrmntdt);
        dm.setAgrmntamt(Integer.parseInt(agrmntamt));
        dm.setPers(incmgpers);

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");

        try {
            PSSend2001EJB ejb = home.create();

            bResult = ejb.aceessGiroaddmsend(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 지로추가발송 내역을 삭제 한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @return void
     */
    public void deleteList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값
        //세젼정보
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //사용자아이디

        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));
        String issuseq = Util.checkString(req.getParameter("issuseq"));

        PS_D_SEND_GIROADDMDM dm = new PS_D_SEND_GIROADDMDM();
        //dm에 값을 Setting한다.
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setIssuseq(issuseq);
        dm.setPers(incmgpers);

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");

        try {
            PSSend2001EJB ejb = home.create();
            bResult = ejb.deleteList(dm); // 설정된 dm값으로 EJB를 호출한다.
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

}