/***************************************************************************************************
 * 파일명   : PSSend1901WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-03-11
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
import java.lang.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ejb.*;

/**
 * 발송-지로정상발송
 */
public class PSSend1901WB {

    /**
     * 지로정상발송처리 관리화면을 초기화시킨다.
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

        PSSend1901EJBHome home = (PSSend1901EJBHome) JNDIManager.getInstance().getHome("PSSend1901EJB");
        try {
            PSSend1901EJB ejb = home.create();
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
     * 지로 정상 발송 리스트를 가져옵니다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectNormsendList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_GIRONORMDataSet ds = null;

        //사용자 세션정보
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

        String cigirosenddt = Util.checkString(req.getParameter("girosenddt"));           // 지로 발송 일자
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no"));         // 현재 페이지
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // 페이지 별 Row 수
        String cibocd = Util.checkString(req.getParameter("sendbrch"));                   // 지국 지사 코드

        long iPageSize = 20;
        long iPageNo = 1;
        if (curr_page_no != null && !curr_page_no.equals("")) {
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_SEND_GIRONORMDM dm = new PS_L_SEND_GIRONORMDM(); // DM 값을 Setting한다.

        if (cibocd == null || cibocd.equals("")) {
            cibocd = "ALL";
        }

        dm.setBocd(cibocd);
        dm.setCmpycd(cmpycd);
        dm.setGirosenddt(cigirosenddt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSend1901EJBHome home = (PSSend1901EJBHome) JNDIManager.getInstance().getHome("PSSend1901EJB");
        try {
            PSSend1901EJB ejb = home.create();
            ds = ejb.selectNormsendList(dm); // 설정된 dm값으로 EJB를 호출한다.
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