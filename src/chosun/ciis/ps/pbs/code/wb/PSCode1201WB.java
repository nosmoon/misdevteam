/*****************************************************
 * 파일명   : PSCode1201WB.java
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
 * 기초-매체단가처리 WorkBean
 */
public class PSCode1201WB {

    /**
     * 매체단가처리 초기화면을 초기화시킨다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_MEDI_UPRCDataSet ds = null;

        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

        PS_S_MEDI_UPRCDM dm = new PS_S_MEDI_UPRCDM();

        dm.setCmpycd(cmpycd);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");
        try {
            PSCode1201EJB ejb = home.create();

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
     * 매체단가관리 내역을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_MIDI_UPRCDataSet ds = null;

        //사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //출판회사코드

        String bocd = Util.checkString(req.getParameter("bocd")); // 선택된 지국지사코드
        String medicd = Util.checkString(req.getParameter("medicd"));
        String aplydtbgn = Util.checkString(req.getParameter("aplydtbgn"));
        String aplydtend = Util.checkString(req.getParameter("aplydtend"));

        String curr_page_no = req.getParameter("curr_page_no"); // 현재페이지
        String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

        int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_MIDI_UPRCDM dm = new PS_L_MIDI_UPRCDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAplydtbgn(aplydtbgn);
        dm.setAplydtend(aplydtend);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");
        try {
            PSCode1201EJB ejb = home.create();
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
     * 매체단가 내역을 입력한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void insertMedipri(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String bocd = Util.checkString(req.getParameter("bocd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String acpnclsf = Util.checkString(req.getParameter("acpnclsf"));
        String acpntype = Util.checkString(req.getParameter("acpntype"));
        String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
        String cntryys = Util.checkString(req.getParameter("cntryys"));
        String aplydt = Util.checkString(req.getParameter("aplydt"));
        int sell_amt = Integer.parseInt(Util.checkString(req.getParameter("sell_amt")));
        int busnalon = Integer.parseInt(Util.checkString(req.getParameter("busnalon")));
        int uprc = Integer.parseInt(Util.checkString(req.getParameter("uprc")));
        int extn_cnt = Integer.parseInt(Util.checkString(req.getParameter("extn_cnt")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        PS_I_MIDI_UPRCDM dm = new PS_I_MIDI_UPRCDM();
        //dm에 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAcpnclsf(acpnclsf);
        dm.setAcpntype(acpntype);
        dm.setNatnareaclsf(natnareaclsf);
        dm.setCntryys(cntryys);
        dm.setAplydt(aplydt);
        dm.setSell_amt(sell_amt);
        dm.setBusnalon(busnalon);
        dm.setUprc(uprc);
        dm.setExtn_cnt(extn_cnt);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");

        try {
            PSCode1201EJB ejb = home.create();
            bResult = ejb.insertMedipri(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 매체단가 내역을 수정한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void updateMedipri(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        String bocd = Util.checkString(req.getParameter("bocd_u"));
        String medicd = Util.checkString(req.getParameter("medicd_u"));
        String acpnclsf = Util.checkString(req.getParameter("acpnclsf_u"));
        String acpntype = Util.checkString(req.getParameter("acpntype_u"));
        String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
        String cntryys = Util.checkString(req.getParameter("cntryys"));
        String aplydt = Util.checkString(req.getParameter("aplydt"));
        int sell_amt = Integer.parseInt(Util.checkString(req.getParameter("sell_amt")));
        int busnalon = Integer.parseInt(Util.checkString(req.getParameter("busnalon")));
        int uprc = Integer.parseInt(Util.checkString(req.getParameter("uprc")));
        int extn_cnt =  Integer.parseInt(Util.checkString(req.getParameter("extn_cnt")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));


        PS_U_MIDI_UPRCDM dm = new PS_U_MIDI_UPRCDM();
        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAcpnclsf(acpnclsf);
        dm.setAcpntype(acpntype);
        dm.setNatnareaclsf(natnareaclsf);
        dm.setCntryys(cntryys);
        dm.setAplydt(aplydt);
        dm.setSell_amt(sell_amt);
        dm.setBusnalon(busnalon);
        dm.setUprc(uprc);
        dm.setExtn_cnt(extn_cnt);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");

        try {
            PSCode1201EJB ejb = home.create();

            bResult = ejb.updateMedipri(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 매체단가 내역을 삭제한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * */
    public void deleteMedipri(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값

        //로그인 사용자 세션정보
        String cmpycd =   Util.getSessionParameterValue(req, "cmpycd", true);      //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String bocd = Util.checkString(req.getParameter("bocd_u"));
        String medicd = Util.checkString(req.getParameter("medicd_u"));
        String acpnclsf = Util.checkString(req.getParameter("acpnclsf_u"));
        String acpntype = Util.checkString(req.getParameter("acpntype_u"));
        String natnareaclsf = Util.checkString(req.getParameter("natnareaclsf"));
        String cntryys = Util.checkString(req.getParameter("cntryys"));
        String aplydt = Util.checkString(req.getParameter("aplydt"));
        int extn_cnt =  Integer.parseInt(Util.checkString(req.getParameter("extn_cnt")));

        PS_D_MIDI_UPRCDM dm = new PS_D_MIDI_UPRCDM();

        //dm에 값을 Setting한다.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setAcpnclsf(acpnclsf);
        dm.setAcpntype(acpntype);
        dm.setNatnareaclsf(natnareaclsf);
        dm.setCntryys(cntryys);
        dm.setAplydt(aplydt);
        dm.setExtn_cnt(extn_cnt);
        dm.setIncmgpers(incmgpers);

        PSCode1201EJBHome home = (PSCode1201EJBHome) JNDIManager.getInstance().getHome("PSCode1201EJB");
        try {
            PSCode1201EJB ejb = home.create();
            bResult = ejb.deleteMedipri(dm); // 설정된 dm값으로 EJB를 호출한다.
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