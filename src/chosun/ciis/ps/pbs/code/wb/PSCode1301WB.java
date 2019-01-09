/*****************************************************
 * 파일명   : PSCode1301WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-02-20
 * 작성자   : 김건호
 ********************************************************/
package chosun.ciis.ps.pbs.code.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.code.ejb.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;

/**
 * 기초-보너스북관리 WorkBean
 */
public class PSCode1301WB {

    /**
     * 보너스북처리 초기화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodelist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_BNSBK_CDDataSet ds = null;

        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

        PS_S_BNSBK_CDDM dm = new PS_S_BNSBK_CDDM();

        dm.setCmpycd(cmpycd);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");
        try {
            PSCode1301EJB ejb = home.create();

            ds = ejb.selectCodelist(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 보너스북관리 내역을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectBnsbklist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BNSBKDataSet ds = null;

        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드
        String medicd = Util.checkString(req.getParameter("medicd"));
        String bnsbknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
        String bgnvdtydt =  Util.checkString(req.getParameter("bgnvdtydt"));
        String endvdtydt =  Util.checkString(req.getParameter("endvdtydt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String curr_page_no = req.getParameter("curr_page_no"); // 현재페이지
        String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

        int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_BNSBKDM dm = new PS_L_BNSBKDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setBnsbknm(bnsbknm);
        dm.setBgnvdtydt(bgnvdtydt);
        dm.setEndvdtydt(endvdtydt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");
        try {
            PSCode1301EJB ejb = home.create();
            ds = ejb.selectBnsbklist(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 보너스북 내역을 입력한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void insertBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디
        String medicd = Util.checkString(req.getParameter("medicd"));
        String bns_booknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
        String bgnvdtydt = Util.checkString(req.getParameter("bgnvdtydt"));
        String endvdtydt = Util.checkString(req.getParameter("endvdtydt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String vipcont = Util.Uni2Ksc(Util.checkString(req.getParameter("vipcont")));

        PS_I_BNSBKDM dm = new PS_I_BNSBKDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setBns_booknm(bns_booknm);
        dm.setBgnvdtydt(bgnvdtydt);
        dm.setEndvdtydt(endvdtydt);
        dm.setRemk(remk);
        dm.setVipcont(vipcont);
        dm.setIncmgpers(incmgpers);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");

        try {
            PSCode1301EJB ejb = home.create();
            bResult = ejb.insertBnsbk(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 보너스북 내역을 수정한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void updateBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디
        String medicd = Util.checkString(req.getParameter("medicd"));
        String bns_bookcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_bookcd")));
        String bns_booknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_booknm")));
        String bgnvdtydt = Util.checkString(req.getParameter("bgnvdtydt"));
        String endvdtydt = Util.checkString(req.getParameter("endvdtydt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String vipcont = Util.Uni2Ksc(Util.checkString(req.getParameter("vipcont")));

        PS_U_BNSBKDM dm = new PS_U_BNSBKDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setBns_bookcd(bns_bookcd);
        dm.setBns_booknm(bns_booknm);
        dm.setBgnvdtydt(bgnvdtydt);
        dm.setEndvdtydt(endvdtydt);
        dm.setRemk(remk);
        dm.setVipcont(vipcont);
        dm.setIncmgpers(incmgpers);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");

        try {
            PSCode1301EJB ejb = home.create();

            bResult = ejb.updateBnsbk(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 보너스북 내역을 삭제한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd =   Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String bns_bookcd = Util.checkString(req.getParameter("bns_bookcd"));

        PS_D_BNSBKDM dm = new PS_D_BNSBKDM();

        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBns_bookcd(bns_bookcd);

        PSCode1301EJBHome home = (PSCode1301EJBHome) JNDIManager.getInstance().getHome("PSCode1301EJB");
        try {
            PSCode1301EJB ejb = home.create();
            bResult = ejb.deleteBnsbk(dm); // 설정된 dm값으로 EJB를 호출한다.
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
