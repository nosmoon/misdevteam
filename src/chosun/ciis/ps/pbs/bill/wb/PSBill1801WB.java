/***************************************************************************************************
 * 함수명   : PSBill1801WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 *             자동이체청구예정목록
 * 작성일자 : 2006-04-14
 * 작성자   : 전현표
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
 * 자동이체청구예정목록 메뉴와 관련된 메소드를 가지고 있는 Worker Bean 클래스
 */
public class PSBill1801WB {
    /**
     * 자동이체청구예정목록검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPlanList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SHFT_CLAM_PLANDataSet ds = null;
        PS_L_SHFT_CLAM_PLANDM dm = new PS_L_SHFT_CLAM_PLANDM();

        // dm 세팅 시작
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        String bocd = Util.checkString(req.getParameter("bocd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String sechcond = Util.checkString(req.getParameter("sechcond"));
        String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
        String rcpmmthd = Util.checkString(req.getParameter("rcpmmthd"));
        String clammthd = Util.checkString(req.getParameter("clammthd"));

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setPageno(Integer.parseInt(pageno));
        dm.setPagesize(Integer.parseInt(pagesize));
        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);
        dm.setRcpmmthd(rcpmmthd);
        dm.setClammthd(clammthd);
        // dm 세팅 끝

        PSBill1801EJBHome home = (PSBill1801EJBHome) JNDIManager.getInstance().getHome("PSBill1801EJB");
        try {
            PSBill1801EJB ejb = home.create();
            ds = ejb.selectPlanList(dm); // 설정된 dm값으로 EJB를 호출한다.
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
