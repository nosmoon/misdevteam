/*****************************************************
 * 파일명   : PSCode1401WB.java
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
 * 기초-지국통합코드관리 WorkBean
 */
public class PSCode1401WB {

    /**
     * 지국통합코드관리 초기화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_CMPYBO_INTGDataSet ds = null;
        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        PS_S_CMPYBO_INTGDM dm = new PS_S_CMPYBO_INTGDM();

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSCode1401EJBHome home = (PSCode1401EJBHome) JNDIManager.getInstance().getHome("PSCode1401EJB");
        try {
            PSCode1401EJB ejb = home.create();

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
     * 지국통합코드관리 내역을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectCmpybolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_CMPYBO_INTGDataSet ds = null;

        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

        String bocd = Util.checkString(req.getParameter("slt_bocd")); // 선택된 지국지사코드

        PS_L_CMPYBO_INTGDM dm = new PS_L_CMPYBO_INTGDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);

        PSCode1401EJBHome home = (PSCode1401EJBHome) JNDIManager.getInstance().getHome("PSCode1401EJB");
        try {
            PSCode1401EJB ejb = home.create();
            ds = ejb.selectCmpybolist(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 지국통합코드관리 내역을 저장한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void insertCmpybo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String bocd = Util.checkString(req.getParameter("asinbocd"));
        String sendintgyn = Util.checkString(req.getParameter("sendintgyn"));
        String clamtintgyn = Util.checkString(req.getParameter("clamtintgyn"));
        String alonintgyn = Util.checkString(req.getParameter("alonintgyn"));
        String intgaftboalonpaypoint = Util.checkString(req.getParameter("intgaftboalonpaypoint"));
        String intgafthdqtalonpaypoint = Util.checkString(req.getParameter("intgafthdqtalonpaypoint"));

        PS_I_CMPYBO_INTGDM dm = new PS_I_CMPYBO_INTGDM();
        //dm에 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setSendintgyn(sendintgyn);
        dm.setClamtintgyn(clamtintgyn);
        dm.setAlonintgyn(alonintgyn);
        dm.setIntgaftboalonpaypoint(intgaftboalonpaypoint);
        dm.setIntgafthdqtalonpaypoint(intgafthdqtalonpaypoint);

        PSCode1401EJBHome home = (PSCode1401EJBHome) JNDIManager.getInstance().getHome("PSCode1401EJB");

        try {
            PSCode1401EJB ejb = home.create();
            bResult = ejb.insertCmpybo(dm); // 설정된 dm값으로 EJB를 호출한다.
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
