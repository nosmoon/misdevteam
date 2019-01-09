/*****************************************************
 * 파일명   : PSCode1501WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2006-11-09
 * 작성자   : 전현표
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
 * 기초-출판지사계좌관리 WorkBean
 */
public class PSCode1501WB {

    /**
     * 출판지사계좌관리 초기화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BOACCTDataSet ds = null;
        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String bocd = Util.checkString(req.getParameter("slt_bocd")); // 선택된 지국지사코드

        PS_L_BOACCTDM dm = new PS_L_BOACCTDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);

        PSCode1501EJBHome home = (PSCode1501EJBHome) JNDIManager.getInstance().getHome("PSCode1501EJB");
        try {
            PSCode1501EJB ejb = home.create();

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

    public void selectBoacctlist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BOACCTDataSet ds = null;

        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

        String bocd = Util.checkString(req.getParameter("slt_bocd")); // 선택된 지국지사코드

        PS_L_BOACCTDM dm = new PS_L_BOACCTDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);

        PSCode1501EJBHome home = (PSCode1501EJBHome) JNDIManager.getInstance().getHome("PSCode1501EJB");
        try {
            PSCode1501EJB ejb = home.create();
            ds = ejb.selectBoacctlist(dm); // 설정된 dm값으로 EJB를 호출한다.
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

    public void accessBoacct(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
        String bocd = Util.checkString(req.getParameter("asinbocd"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String depskind = Util.checkString(req.getParameter("depskind"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String seq = Util.checkString(req.getParameter("seq"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        PS_A_BOACCTDM dm = new PS_A_BOACCTDM();
        //dm에 값을 Setting한다.

        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setSeq(seq);
        dm.setAcctitem(acctitem);
        dm.setDepskind(depskind);
        dm.setBankcd(bankcd);
        dm.setDeps_persnm(deps_persnm);
        dm.setAcctno(acctno);
        dm.setRemk(remk);

        PSCode1501EJBHome home = (PSCode1501EJBHome) JNDIManager.getInstance().getHome("PSCode1501EJB");

        try {
            PSCode1501EJB ejb = home.create();
            bResult = ejb.accessBoacct(dm); // 설정된 dm값으로 EJB를 호출한다.
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
