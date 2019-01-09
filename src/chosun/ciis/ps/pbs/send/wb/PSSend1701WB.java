/***************************************************************************************************
 * 파일명   : PSSend1701WB.java
 * 기  능   : 발송-보너스북발송 코드및 초기화면
 * 작성일자 : 2004-02-29
 * 작성자   : 김건호
 ****************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 ****************************************************************************************************/

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

public class PSSend1701WB {

    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_BNSBKDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String flag   = "B";

        PS_S_SEND_BNSBKDM dm = new PS_S_SEND_BNSBKDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setFlag(flag);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");
        try {

            PSSend1701EJB ejb = home.create();
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
     * 보너스북발송 일괄확인 데이타를 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectBnsbkList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_BNSBKDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String senddt = Util.checkString(req.getParameter("slt_senddt"));
        String asinbocd = Util.checkString(req.getParameter("slt_asinbocd"));
        String bnsbk_cd = Util.checkString(req.getParameter("slt_bnsbk_cd"));

        PS_L_SEND_BNSBKDM dm = new PS_L_SEND_BNSBKDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setSenddt(senddt);
        dm.setAsinbocd(asinbocd);
        dm.setBnsbk_cd(bnsbk_cd);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");
        try {

            PSSend1701EJB ejb = home.create();

            ds = ejb.selectBnsbkList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 보너스북발송 일괄확인 상세내역 데이타를 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectBnsbkDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_BNSBK_DTLDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String senddt = Util.checkString(req.getParameter("detail_senddt"));
        String asinbocd = Util.checkString(req.getParameter("asinbocd"));

        PS_L_SEND_BNSBK_DTLDM dm = new PS_L_SEND_BNSBK_DTLDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setSenddt(senddt);
        dm.setAsinbocd(asinbocd);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");
        try {

            PSSend1701EJB ejb = home.create();

            ds = ejb.selectBnsbkDetail(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 보너스북 저장내역을 수정한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void updateBnsbk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String bocd_cnfm = Util.checkString(req.getParameter("all_bocd"));
        String senddt_cnfm = Util.checkString(req.getParameter("all_senddt"));
        String chkcnfm_cnfm = Util.checkString(req.getParameter("all_chkcnfm"));
        String hdqtsend_dt_cnfm = Util.checkString(req.getParameter("all_hdqtsend_dt"));

        PS_U_SEND_BNSBKDM dm = new PS_U_SEND_BNSBKDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBocd_cnfm(bocd_cnfm);
        dm.setSenddt_cnfm(senddt_cnfm);
        dm.setChkcnfm_cnfm(chkcnfm_cnfm);
        dm.setHdqtsend_dt_cnfm(hdqtsend_dt_cnfm);

        PSSend1701EJBHome home = (PSSend1701EJBHome) JNDIManager.getInstance().getHome("PSSend1701EJB");

        try {
            PSSend1701EJB ejb = home.create();

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

}
/***************************************************************************************************
 * 수정자     :
 * 수정전코드 :
***************************************************************************************************/