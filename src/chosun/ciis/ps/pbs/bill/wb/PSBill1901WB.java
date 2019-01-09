/***************************************************************************************************
 * 함수명   : PSBill1901WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 *             자동이체청구결과요약
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
 * 자동이체청구결과요약 메뉴와 관련된 메소드를 가지고 있는 Worker Bean 클래스
 */
public class PSBill1901WB {

    /**
     * 자동이체청구결과요약
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamSsum(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SHFT_CLAM_SSUMDataSet ds = null;
        PS_L_SHFT_CLAM_SSUMDM dm = new PS_L_SHFT_CLAM_SSUMDM();

        // dm 세팅 시작
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);
        // dm 세팅 끝

        PSBill1901EJBHome home = (PSBill1901EJBHome) JNDIManager.getInstance().getHome("PSBill1901EJB");
        try {
            PSBill1901EJB ejb = home.create();
            ds = ejb.selectClamSsum(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 자동이체청구결과
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamOcomList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SHFT_CLAM_OCOMDataSet ds = null;
        PS_L_SHFT_CLAM_OCOMDM dm = new PS_L_SHFT_CLAM_OCOMDM();

        // dm 세팅 시작
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        String bocd = Util.checkString(req.getParameter("bocd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String sechcond = Util.checkString(req.getParameter("sechcond"));
        String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
        String subsmappli = Util.checkString(req.getParameter("subsmappli"));
        String erryn = Util.checkString(req.getParameter("erryn"));

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setPageno(Integer.parseInt(pageno));
        dm.setPagesize(Integer.parseInt(pagesize));
        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);
        dm.setBasidt(basidt);
        dm.setShftclsfcd(shftclsfcd);
        dm.setSubsmappli(subsmappli);
        dm.setErryn(erryn);
        // dm 세팅 끝

        PSBill1901EJBHome home = (PSBill1901EJBHome) JNDIManager.getInstance().getHome("PSBill1901EJB");
        try {
            PSBill1901EJB ejb = home.create();
            ds = ejb.selectClamOcomList(dm); // 설정된 dm값으로 EJB를 호출한다.
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
