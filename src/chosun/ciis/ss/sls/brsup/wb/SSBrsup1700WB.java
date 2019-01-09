/***************************************************************************************************
 * 파일명 : SSBrsup1700WB.java
 * 기능 : 지국업무지원-Billing자동이체-납부내역을 위한 Worker Bean
 * 작성일자 : 2004-03-22
 * 작성자 : 김상열
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.rec.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국업무지원-Billing자동이체-납부내역을 위한 Worker Bean//
 */

public class SSBrsup1700WB {

    /**
     * 지국업무지원-Billing자동이체-납부내역 초기화
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PYMT_INITDataSet ds = null;

        // DM Setting
        SS_L_PYMT_INITDM dm = new SS_L_PYMT_INITDM();

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectPymtInit 호출
        ds = dao.selectPymtInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtInit(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PYMTDataSet ds = null;

        // DM Setting
        SS_L_PYMTDM dm = new SS_L_PYMTDM();

        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String shftstatclsfcd = Util.checkString(req.getParameter("shftstatclsfcd"));
        String pymt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt")));

        dm.setShftclsf(shftclsf);
        dm.setShftstatclsfcd(shftstatclsfcd);
        dm.setPymt(pymt);

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectPymtList 호출
        ds = dao.selectPymtList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부계약목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtCntrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PYMT_CNTRDataSet ds = null;

        // DM Setting
        SS_L_PYMT_CNTRDM dm = new SS_L_PYMT_CNTRDM();

        String subsstat = Util.checkString(req.getParameter("subsstat"));

        dm.setSubsstat(subsstat);

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectPymtCntrList 호출
        ds = dao.selectPymtCntrList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtCntrList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부내역목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtPtcrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PYMT_PTCRDataSet ds = null;

        // DM Setting
        SS_L_PYMT_PTCRDM dm = new SS_L_PYMT_PTCRDM();

        String f_basidt = Util.checkString(req.getParameter("f_basidt"));
        String t_basidt = Util.checkString(req.getParameter("t_basidt"));
        String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
        String erryn = Util.checkString(req.getParameter("erryn"));

        dm.setF_basidt(f_basidt);
        dm.setT_basidt(t_basidt);
        dm.setShftclsfcd(shftclsfcd);
        dm.setErryn(erryn);

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectPymtPtcrList 호출
        ds = dao.selectPymtPtcrList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtPtcrList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
     * 지국업무지원-Billing자동이체-신청관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcMangInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_APLC_MANG_INITDataSet ds = null;

        // DM Setting
        SS_L_APLC_MANG_INITDM dm = new SS_L_APLC_MANG_INITDM();

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcMangInit 호출
        ds = dao.selectAplcMangInit(dm);

        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcMangInit(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-신청요약
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcSsumList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_APLC_SSUMDataSet ds = null;

        // DM Setting
        SS_L_APLC_SSUMDM dm = new SS_L_APLC_SSUMDM();

        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String cnfmyn = Util.checkString(req.getParameter("cnfmyn"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        dm.setAplcdt(aplcdt);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setCnfmyn(cnfmyn);
        dm.setPageno(Integer.parseInt(pageno));
        dm.setPagesize(Integer.parseInt(pagesize));

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcSsumList 호출
        ds = dao.selectAplcSsumList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcSsumList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-신청목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_APLCDataSet ds = null;

        // DM Setting
        SS_L_APLCDM dm = new SS_L_APLCDM();

        String bocd = Util.checkString(req.getParameter("bocd"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcclsf = Util.checkString(req.getParameter("aplcclsf"));
        String aplcprocstat = Util.checkString(req.getParameter("aplcprocstat"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String sechcond = Util.checkString(req.getParameter("sechcond"));
        String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));

        dm.setBocd(bocd);
        dm.setPageno(Integer.parseInt(pageno));
        dm.setPagesize(Integer.parseInt(pagesize));
        dm.setAplcdt(aplcdt);
        dm.setAplcclsf(aplcclsf);
        dm.setAplcprocstat(aplcprocstat);
        dm.setShftclsf(shftclsf);
        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcList 호출
        ds = dao.selectAplcList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
     * 지국업무지원-Billing자동이체-신청관리-납부자(구독)정보
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_APLCDataSet ds = null;
        SS_S_APLCDM dm = new SS_S_APLCDM();

        // String bocd = Util.checkString(req.getParameter("bocd"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcno = Util.checkString(req.getParameter("aplcno"));
        // dm 세팅 시작
        //dm.setBocd(bocd);
        dm.setShftclsf(shftclsf);
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-납부자(구독)정보저장
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateAplcInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_APLCINFODataSet ds = null;
        SS_U_APLCINFODM dm = new SS_U_APLCINFODM();

        // String bocd = Util.checkString(req.getParameter("bocd"));

        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String aplcno = Util.checkString(req.getParameter("aplcno"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String pymtstrtdt = Util.checkString(req.getParameter("aplyyymm"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
		String rdrnatvno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnatvno")));
		String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));

        // dm 세팅 시작
        //dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAplcno(aplcno);
        dm.setShftclsf(shftclsf);
        dm.setAplcdt(aplcdt);
        dm.setPymtstrtdt(pymtstrtdt);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setRdrnatvno(rdrnatvno);
        dm.setClosyn(closyn);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.updateAplcInfo(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.updateAplcInfo(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-독자별 매체리스트
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMediList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MEDIDataSet ds = null;
        SS_L_MEDIDM dm = new SS_L_MEDIDM();

        String bocd = Util.checkString(req.getParameter("bocd"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        // dm 세팅 시작
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectMediList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectMediList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 자동이체신청 확인/취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_APLCSTATDataSet ds = null;
        SS_U_APLCSTATDM dm = new SS_U_APLCSTATDM();

        String bocd = Util.checkString(req.getParameter("bocd"));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // dm 세팅 시작
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAplcyn(Util.checkString(req.getParameter("aplcyn")));
        dm.setAplcno(Util.checkString(req.getParameter("aplcno")));
        dm.setShftclsf(Util.checkString(req.getParameter("shftclsf")));
        dm.setAplcdt(Util.checkString(req.getParameter("aplcdt")));
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.updateAplc(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.updateAplc(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-신규신청초기화면 초기화
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcNew(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_APLC_NEWDataSet ds = null;
        SS_L_APLC_NEWDM dm = new SS_L_APLC_NEWDM();

        // dm 세팅 시작
        String bocd = Util.checkString(req.getParameter("bocd"));		//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcNew(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcNew(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-신청입력
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertAutoShiftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_I_SHFTAPLCDataSet ds = null;
        SS_I_SHFTAPLCDM dm = new SS_I_SHFTAPLCDM();

        // dm 세팅 시작
        String bocd = Util.checkString(req.getParameter("bocd"));		//지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String accflag = Util.checkString(req.getParameter("accflag"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
        String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
        String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
        String bankcd = Util.checkString(req.getParameter("recpinstt"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
        String cardno = Util.checkString(req.getParameter("cardno"));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
        String prn = Util.checkString(req.getParameter("prn"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
        String email = Util.checkString(req.getParameter("email"));
        String rdrnatvno = Util.checkString(req.getParameter("rdrnatvno"));

        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setShftclsf(shftclsf);
        dm.setPymtnm(pymtnm);
        dm.setPymttel1(pymttel1);
        dm.setPymttel2(pymttel2);
        dm.setPymttel3(pymttel3);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setPrn(prn);
        dm.setAplcdt(aplcdt);
        dm.setAplyyymm(aplyyymm);
        dm.setEmail(email);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setRdrnatvno(rdrnatvno);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.insertAutoShiftAplc(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.insertAutoShiftAplc(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-자동이체해지신청 초기화
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcExpy(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_APLC_EXPYDataSet ds = null;
        SS_L_APLC_EXPYDM dm = new SS_L_APLC_EXPYDM();

        // dm 세팅 시작
        String bocd = req.getParameter("bocd");		//지국지사코드
        String rdr_no = req.getParameter("rdr_no");
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcExpy(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcExpy(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-자동이체 해지신청대상목록 상세보기
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcDetail2(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_APLC_EXPYDataSet ds = null;
        SS_S_APLC_EXPYDM dm = new SS_S_APLC_EXPYDM();

        // dm 세팅 시작
        String bocd = req.getParameter("bocd");		//지국지사코드
        String rdr_no = req.getParameter("rdr_no");
        String medicd = req.getParameter("medicd");

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcDetail2(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcDetail2(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-자동이체신청 송신
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertShftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_SHFTAPLC_TMSGDataSet ds = null;
        SS_A_SHFTAPLC_TMSGDM dm = new SS_A_SHFTAPLC_TMSGDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        dm.setIncmgpers(incmgpers);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 insertShftAplc 호출
        ds = dao.insertShftAplc(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.insertShftAplc(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-자동이체신청 수신
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/;
    public void updateShftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_SHFTAPLC_RMSGDataSet ds = null;
        SS_A_SHFTAPLC_RMSGDM dm = new SS_A_SHFTAPLC_RMSGDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        dm.setIncmgpers(incmgpers);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 updateShftAplc 호출
        ds = dao.updateShftAplc(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.updateShftAplc(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청관리-이체방법변경
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateShftMthd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_SHFTMTHDCHGDataSet ds = null;
        SS_U_SHFTMTHDCHGDM dm = new SS_U_SHFTMTHDCHGDM();

        // dm 세팅 시작
        String bocd = Util.checkString(req.getParameter("bocd"));		//지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
        String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
        String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
        String bankcd = Util.checkString(req.getParameter("recpinstt"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
        String cardno = Util.checkString(req.getParameter("cardno"));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
        String prn = Util.checkString(req.getParameter("prn"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
        String email = Util.checkString(req.getParameter("email"));

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setShftclsf(shftclsf);
        dm.setPymtnm(pymtnm);
        dm.setPymttel1(pymttel1);
        dm.setPymttel2(pymttel2);
        dm.setPymttel3(pymttel3);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setPrn(prn);
        dm.setAplcdt(aplcdt);
        dm.setAplyyymm(aplyyymm);
        dm.setEmail(email);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 updateShftAplc 호출
        ds = dao.updateShftMthd(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.updateShftMthd(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
     * 지국업무지원-Billing자동이체-신청관리-입금반영
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateRcpmrfl(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_AUTOSHFT_RCPMRFLDataSet ds = null;
        SS_A_AUTOSHFT_RCPMRFLDM dm = new SS_A_AUTOSHFT_RCPMRFLDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        String basidt = Util.checkString(req.getParameter("aplcdt"));

        dm.setIncmgpers(incmgpers);
        dm.setBasidt(basidt);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 updateShftAplc 호출
        ds = dao.updateRcpmrfl(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.updateRcpmrfl(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
     * 지국업무지원-Billing자동이체-납부자관리-초기화면
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectShftPymtInit(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFT_PYMT_INITDataSet ds = null;
        SS_L_SHFT_PYMT_INITDM dm = new SS_L_SHFT_PYMT_INITDM();

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectShftPymtInit(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectShftPymtInit(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-납부자목록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectShftPymtList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFT_PYMTDataSet ds = null;
        SS_L_SHFT_PYMTDM dm = new SS_L_SHFT_PYMTDM();

        // dm 세팅 시작
        String sechcond = req.getParameter("sechcond");		//검색조건
        String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));		//검색어

        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectShftPymtList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectShftPymtList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-납부자상세
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectShftPymtDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_SHFT_PYMTDataSet ds = null;
        SS_S_SHFT_PYMTDM dm = new SS_S_SHFT_PYMTDM();

        // dm 세팅 시작
        String pymtseq = Util.checkString(req.getParameter("pymtseq"));		//납부자일련번호
        String cnfm = Util.checkString(req.getParameter("cnfm"));			//구분 : '2' => 이체신청 미확인건

        dm.setPymtseq(pymtseq);
        dm.setCnfm(cnfm);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectShftPymtDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectShftPymtDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-납부자정보수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updatePymtInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_A_PYMTDataSet ds = null;
        CO_A_PYMTDM dm = new CO_A_PYMTDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);
        String accflag = "U";
        String uptflag = "I";
        String pymtseq = Util.checkString(req.getParameter("pymtseq"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String prn = Util.checkString(req.getParameter("prn"));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String email = Util.checkString(req.getParameter("email"));
        String tel1 = Util.checkString(req.getParameter("tel1"));
        String tel2 = Util.checkString(req.getParameter("tel2"));
        String tel3 = Util.checkString(req.getParameter("tel3"));
        String zip = Util.checkString(req.getParameter("zip"));
        String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
        String addrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("addrdtls")));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
        String cardno = Util.checkString(req.getParameter("cardno"));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
        String aplcpathcd = "50";

        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setUptflag(uptflag);
        dm.setPymtseq(pymtseq);
        dm.setShftclsf(shftclsf);
        dm.setPrn(prn);
        dm.setPymtnm(pymtnm);
        dm.setEmail(email);
        dm.setTel1(tel1);
        dm.setTel2(tel2);
        dm.setTel3(tel3);
        dm.setZip(zip);
        dm.setAddr(addr);
        dm.setAddrdtls(addrdtls);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setAplcpathcd(aplcpathcd);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.updatePymtInfo(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.updatePymtInfo(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-납부자정보수정(이체신청 미확인건)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updatePymtInfo2(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_SHFTAPLCDataSet ds = null;
        SS_U_SHFTAPLCDM dm = new SS_U_SHFTAPLCDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
		String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
		String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
		String pymtno = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno")));
		String pymttel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel1")));
		String pymttel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel2")));
		String pymttel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel3")));
		String rdrtel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel1")));
		String rdrtel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel2")));
		String rdrtel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel3")));
		String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
		String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
		String dlvaddrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("addrdtls")));
		String recpinstt = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
		String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
		String cardcmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cardcmpycd")));
		String cardno = Util.Uni2Ksc(Util.checkString(req.getParameter("cardno")));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
		String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
		String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
		String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
		String aplyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplyyymm")));
		String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
		String ext1 = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
		String ext2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext2")));
		String ext3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext3")));
		String ext4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext4")));
		String ext5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext5")));

        dm.setBocd(bocd);
		dm.setIncmgpers(incmgpers);
		dm.setPymtnm(pymtnm);
		dm.setRdrnm(rdrnm);
		dm.setPymtno(pymtno);
		dm.setPymttel1(pymttel1);
		dm.setPymttel2(pymttel2);
		dm.setPymttel3(pymttel3);
		dm.setRdrtel1(rdrtel1);
		dm.setRdrtel2(rdrtel2);
		dm.setRdrtel3(rdrtel3);
		dm.setZip(zip);
		dm.setDlvaddr(dlvaddr);
		dm.setDlvaddrdtls(dlvaddrdtls);
		dm.setRecpinstt(recpinstt);
		dm.setAcctno(acctno);
		dm.setCardcmpycd(cardcmpycd);
		dm.setCardno(cardno);
		dm.setVdtyprd(vdtyprd);
		dm.setPrn(prn);
		dm.setAplcdt(aplcdt);
		dm.setAplcno(aplcno);
		dm.setAplyyymm(aplyyymm);
		dm.setEmail(email);
		dm.setExt1(ext1);
		dm.setExt2(ext2);
		dm.setExt3(ext3);
		dm.setExt4(ext4);
		dm.setExt5(ext5);
        // dm 세팅 끝

		SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.updatePymtInfo2(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.updatePymtInfo2(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-자동이체신규/해지신청
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertPymtShftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_I_SHFTAPLC2DataSet ds = null;
        SS_I_SHFTAPLC2DM dm = new SS_I_SHFTAPLC2DM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);
        String pymtseq = Util.checkString(req.getParameter("pymtseq"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String accflag = Util.checkString(req.getParameter("accflag"));

        dm.setIncmgpers(incmgpers);
        dm.setPymtseq(pymtseq);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setAccflag(accflag);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.insertPymtShftAplc(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.insertPymtShftAplc(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-수금내역조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtClamtList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_PYMT_CLAMTDataSet ds = null;
        SS_L_PYMT_CLAMTDM dm = new SS_L_PYMT_CLAMTDM();

        // dm 세팅 시작

        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectPymtClamtList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtClamtList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-청구내역조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtClamOcomList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFT_CLAM_OCOMDataSet ds = null;
        SS_L_SHFT_CLAM_OCOMDM dm = new SS_L_SHFT_CLAM_OCOMDM();

        // dm 세팅 시작
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectPymtClamOcomList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtClamOcomList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-납부자정보 로그내역
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtLogList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFT_PYMT_LOGDataSet ds = null;
        SS_L_SHFT_PYMT_LOGDM dm = new SS_L_SHFT_PYMT_LOGDM();

        // dm 세팅 시작
        String pymtseq = Util.checkString(req.getParameter("pymtseq"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

        dm.setPymtseq(pymtseq);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectPymtLogList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtLogList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtCntrLogList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFT_PYMT_CNTR_LOGDataSet ds = null;
        SS_L_SHFT_PYMT_CNTR_LOGDM dm = new SS_L_SHFT_PYMT_CNTR_LOGDM();

        // dm 세팅 시작
        String pymtseq = Util.checkString(req.getParameter("pymtseq"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

        dm.setPymtseq(pymtseq);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectPymtCntrLogList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtCntrLogList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-납부자관리-신규/해지내역 목록조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPymtShftAplcList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_APLCDataSet ds = null;
        SS_L_APLCDM dm = new SS_L_APLCDM();

        // dm 세팅 시작
        String bocd = Util.checkString(req.getParameter("bocd"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));
//		String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcclsf = Util.checkString(req.getParameter("aplcclsf"));	// 신청구분 신규('10'), 해지('20'), 변경('30')
//		String aplcprocstat = Util.checkString(req.getParameter("aplcprocstat"));
//		String shftclsf = Util.checkString(req.getParameter("shftclsf"));
//		String sechcond = Util.checkString(req.getParameter("sechcond"));
        String sechcond = "40";	//  검색조건 => 독자번호
//		String sechcont = Util.checkString(req.getParameter("sechcont"));
        String sechcont = Util.checkString(req.getParameter("rdr_no"));

        dm.setBocd(bocd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
//		dm.setAplcdt(aplcdt);
        dm.setAplcclsf(aplcclsf);
//		dm.setAplcprocstat(aplcprocstat);
//		dm.setShftclsf(shftclsf);
        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectPymtShftAplcList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectPymtShftAplcList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구결과관리-지국별청구결과요약
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_CLAM_SSUMDataSet ds = null;
        SS_L_CLAM_SSUMDM dm = new SS_L_CLAM_SSUMDM();

        // dm 세팅 시작
        String f_basidt = Util.checkString(req.getParameter("f_basidt"));
        String t_basidt = Util.checkString(req.getParameter("t_basidt"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String erryn = Util.checkString(req.getParameter("erryn"));
        long pageno = Integer.parseInt(req.getParameter("pageno"));
        long pagesize = Integer.parseInt(req.getParameter("pagesize"));

        dm.setF_basidt(f_basidt);
        dm.setT_basidt(t_basidt);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setErryn(erryn);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectClamList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectClamList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구결과관리-자동이체청구결과목록검색
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamOcomList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFT_CLAM_OCOM2DataSet ds = null;
        SS_L_SHFT_CLAM_OCOM2DM dm = new SS_L_SHFT_CLAM_OCOM2DM();
        // dm 세팅 시작
        String bocd = Util.checkString(req.getParameter("bocd"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String sechcond = Util.checkString(req.getParameter("sechcond"));
        String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String f_basidt = Util.checkString(req.getParameter("f_basidt"));
        String t_basidt = Util.checkString(req.getParameter("t_basidt"));
        String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
        String subsmappli = Util.checkString(req.getParameter("subsmappli"));
        String erryn = Util.checkString(req.getParameter("erryn"));

        dm.setBocd(bocd);
        dm.setPageno(Integer.parseInt(pageno));
        dm.setPagesize(Integer.parseInt(pagesize));
        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);
        dm.setBasidt(basidt);
        dm.setF_basidt(f_basidt);
        dm.setT_basidt(t_basidt);
        dm.setShftclsfcd(shftclsfcd);
        dm.setSubsmappli(subsmappli);
        dm.setErryn(erryn);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectClamOcomList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
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
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구 초기화면
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcClamInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_SHFT_CLAM_INITDataSet ds = null;

        // DM Setting
    	SS_S_SHFT_CLAM_INITDM dm = new SS_S_SHFT_CLAM_INITDM();

    	SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcMangInit 호출
        ds = dao.selectAplcClamInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcClamInit(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectShftClamSsum(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_SHFT_CLAM_SSUMDataSet ds = null;
        SS_S_SHFT_CLAM_SSUMDM dm = new SS_S_SHFT_CLAM_SSUMDM();

        // dm 세팅 시작
        String basidt = Util.checkString(req.getParameter("basidt"));
        dm.setBasidt(basidt);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectShftClamSsum(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectShftClamSsum(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구관리-지국별 청구목록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectShftClamList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFT_CLAMDataSet ds = null;
        SS_L_SHFT_CLAMDM dm = new SS_L_SHFT_CLAMDM();

        // dm 세팅 시작
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        long pageno = Integer.parseInt(req.getParameter("pageno"));
        long pagesize = Integer.parseInt(req.getParameter("pagesize"));

        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectShftClamList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectShftClamList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구관리-청구생성
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertShftClam(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_CLAM_CRTEDataSet ds = null;
        SS_A_CLAM_CRTEDM dm = new SS_A_CLAM_CRTEDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String pymtdt = Util.checkString(req.getParameter("pymtdt"));
        String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));

        dm.setIncmgpers(incmgpers);
        dm.setPymtdt(pymtdt);
        dm.setShftclsfcd(shftclsfcd);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.insertShftClam(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.insertShftClam(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구관리-청구송신
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void sendShftClam(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_SHFT_CLAM_TMSGDataSet ds = null;
        SS_A_SHFT_CLAM_TMSGDM dm = new SS_A_SHFT_CLAM_TMSGDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        dm.setIncmgpers(incmgpers);
        dm.setShftclsfcd(shftclsfcd);
        dm.setBasidt(basidt);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 sendShftClam 호출
        ds = dao.sendShftClam(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.sendShftClam(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-청구관리-청구수신
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void receiveShftClam(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_SHFT_CLAM_RMSGDataSet ds = null;
        SS_A_SHFT_CLAM_RMSGDM dm = new SS_A_SHFT_CLAM_RMSGDM();

        // dm 세팅 시작
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        dm.setIncmgpers(incmgpers);
        dm.setShftclsfcd(shftclsfcd);
        dm.setBasidt(basidt);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.receiveShftClam(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.receiveShftClam(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청통계-목록조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcStcsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFTAPLC_STCSDataSet ds = null;
        SS_L_SHFTAPLC_STCSDM dm = new SS_L_SHFTAPLC_STCSDM();

        // dm 세팅 시작
        String rp_clsf = Util.checkString(req.getParameter("rp_clsf"));
        String fr_dt = Util.checkString(req.getParameter("fr_dt"));
        String to_dt = Util.checkString(req.getParameter("to_dt"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String resv1 = Util.checkString(req.getParameter("resv1"));    //얘는 사용중인가봄.
        String resv2 = Util.checkString(req.getParameter("medicd")); //예비파라미터, 매체코드로 사용 2017-10-30 장선희
        String resv3 = Util.checkString(req.getParameter("resv3"));
        String resv4 = Util.checkString(req.getParameter("resv4"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

        dm.setRp_clsf(rp_clsf);
        dm.setFr_dt(fr_dt);
        dm.setTo_dt(to_dt);
        dm.setShftclsf(shftclsf);
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);
        dm.setResv4(resv4);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcStcsList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcStcsList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청확인통계-목록조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcCnfmStcsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFTAPLC_CNFM_STCSDataSet ds = null;
        SS_L_SHFTAPLC_CNFM_STCSDM dm = new SS_L_SHFTAPLC_CNFM_STCSDM();

        // dm 세팅 시작
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String base_mon = Util.checkString(req.getParameter("base_mon"));
        String resv1 = Util.checkString(req.getParameter("resv1"));
        String resv2 = Util.checkString(req.getParameter("resv2"));
        String resv3 = Util.checkString(req.getParameter("resv3"));
        String resv4 = Util.checkString(req.getParameter("resv4"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

		// 엑셀 다운로드의 경우
        if(Util.checkString(req.getParameter("excelyn")).equals("Y")) {
        	pagesize = 10000;
        }

        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBase_mon(base_mon);
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);
        dm.setResv4(resv4);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcCnfmStcsList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcCnfmStcsList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국업무지원-Billing자동이체-신청/해지통계-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcExpyStcsInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_SHFTAPLCEXPY_STCS_INITDataSet ds = null;

        // DM Setting
        SS_L_SHFTAPLCEXPY_STCS_INITDM dm = new SS_L_SHFTAPLCEXPY_STCS_INITDM();

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcExpyStcsInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcExpyStcsInit(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국지원-빌링_자동이체-신청/해지통계-목록조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcExpyStcsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFTAPLCEXPY_STCSDataSet ds = null;
        SS_L_SHFTAPLCEXPY_STCSDM dm = new SS_L_SHFTAPLCEXPY_STCSDM();

        // dm 세팅 시작
        String rp_clsf = Util.checkString(req.getParameter("rp_clsf"));
        String fr_dt = Util.checkString(req.getParameter("fr_dt"));
        String to_dt = Util.checkString(req.getParameter("to_dt"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String resv1 = Util.checkString(req.getParameter("resv1"));
        String resv2 = Util.checkString(req.getParameter("resv2"));
        String resv3 = Util.checkString(req.getParameter("resv3"));
        String resv4 = Util.checkString(req.getParameter("resv4"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

        dm.setRp_clsf(rp_clsf);
        dm.setFr_dt(fr_dt);
        dm.setTo_dt(to_dt);
        dm.setShftclsf(shftclsf);
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);
        dm.setResv4(resv4);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectAplcExpyStcsList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectAplcExpyStcsList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국지원-빌링_자동이체-해지독자-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExpyRdrInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_SHFTEXPYRDR_INITDataSet ds = null;

        // DM Setting
        SS_L_SHFTEXPYRDR_INITDM dm = new SS_L_SHFTEXPYRDR_INITDM();

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectExpyRdrInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try{
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectExpyRdrInit(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국지원-빌링_자동이체-해지독자-목록조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExpyRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFTEXPYRDRDataSet ds = null;
        SS_L_SHFTEXPYRDRDM dm = new SS_L_SHFTEXPYRDRDM();

        // dm 세팅 시작
        String fr_dt = Util.checkString(req.getParameter("fr_dt"));        //검색시작일
        String to_dt = Util.checkString(req.getParameter("to_dt"));        //검색종료일
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));  //이체구분
        String resv1 = Util.checkString(req.getParameter("resv1"));        //기준일선택구분 ( 1:해지신청일 기준, 2:최초신청일 기준)
        String resv2 = Util.checkString(req.getParameter("resv2"));
        String resv3 = Util.checkString(req.getParameter("resv3"));
        String resv4 = Util.checkString(req.getParameter("resv4"));
        long pageno = Integer.parseInt(Util.checkString(req.getParameter("pageno")));
        long pagesize = Integer.parseInt(Util.checkString(req.getParameter("pagesize")));

        // 엑셀 다운로드의 경우
        if(Util.checkString(req.getParameter("excelyn")).equals("Y")) {
            pagesize = 10000;
        }

        dm.setFr_dt(fr_dt);
        dm.setTo_dt(to_dt);
        dm.setShftclsf(shftclsf);
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);
        dm.setResv4(resv4);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        // dm 세팅 끝

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.selectExpyRdrList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
        try {
            SSBrsup1700EJB ejb = home.create();
            ds = ejb.selectExpyRdrList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국지원-빌링_자동이체-신청-자동변환
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void procAutoTrans(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	String path=req.getRealPath("/aplc_upload/");    //업로드되는 위치 지정
        int sizeLimit = 2*1024*1024;                    //파일용량제한
        boolean rdrChk = true;

        //전송할 콤포넌트 생성(전송할 파일명을 가진 객체, 서버상의 절대경로, 파일용량제한, 분자코드, 기본보안 적용)
        java.io.FileReader fr = null;

        String frdStr = "";

        try {

	        com.oreilly.servlet.MultipartRequest multi = new com.oreilly.servlet.MultipartRequest(req, path, sizeLimit, "euc-kr", new com.oreilly.servlet.multipart.DefaultFileRenamePolicy());
	        java.util.Enumeration formNames = multi.getFileNames();       //파일정보 저장	        
	        System.out.println("==========WB1=========:"+formNames);
	        String fname1 = "";

	        if(formNames.hasMoreElements()) {
	    	    String formName1 = (String)formNames.nextElement();
	    	    fname1 = multi.getFilesystemName(formName1);
	        }
	        System.out.println("==========WB2=========");
	        java.io.File file = new java.io.File(path + "/" + fname1);

        	fr = new java.io.FileReader(file);
        	char[] arr = new char[102400];
        	System.out.println("==========WB3=========");
        	int len = -1;
        	StringBuffer sb = new StringBuffer();

        	while((len = fr.read(arr)) > 0 ){
        		sb.append(new String(arr,0,len));
        	}
        	fr.close();
        	System.out.println("==========WB4=========");
        	frdStr = sb.toString();
        	System.out.println("==========WB4-1=========:"+frdStr);

        	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        	//String uid = "SYSTEM[test]";   //입력자 아이디
        	System.out.println("==========WB5========= UID :" + uid);
        	SS_U_PROCAUTOTRASDataSet ds = null;
            //String fr_dt = Util.checkString(req.getParameter("fr_dt"));        //검색시작일
        	SS_U_PROCAUTOTRASDM dm = new SS_U_PROCAUTOTRASDM();
        	dm.setUid(uid);
        	dm.setBastdt(new String(frdStr.getBytes(),65,8));
        	//(66,73));
        	System.out.println("==========frdStr=========:" + frdStr);
        	System.out.println("==========date=========:" + new String(frdStr.getBytes(),65,8));
        	//dm.setBastdt(Util.getDate()); // Bastdt를 오늘날짜로 세팅해야 하지 않을지.. 실제 프로시져 안에서는 사용 안하게 되었음
        	dm.setFilenm(fname1);
        	//dm.setSb(frdStr);
        	/*
        	System.out.println("==========WB6=========");
            SSBrsup1700EJBHome home = (SSBrsup1700EJBHome)JNDIManager.getInstance().getHome("SSBrsup1700EJB");
            System.out.println("==========WB6.1=========");
            SSBrsup1700EJB ejb = home.create();
            System.out.println("==========WB6.2===========");
            ds = ejb.procAutoTrans(dm, frdStr); // 설정된 dm값으로 EJB를 호출한다.
            System.out.println("==========WB7=========");
            */

        	SSBrsup1700DAO dao = new SSBrsup1700DAO();
            // DAO 객체의 selectAplcDetail 호출

            byte[] arr1 = frdStr.getBytes();
            int count = arr1.length / 160;

            for(int i = 0; i<count; i++) {
            	//dm.sb = new String(arr,i*160,160);
            	dm.setSb(new String(arr1,i*160,160));
            	ds = dao.procAutoTrans(dm);
            }


            req.setAttribute("ds", ds); // request에 결과값을 담는다.

/*        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;*/
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(Exception e) {

        }
     }

    public void createBrsup1799(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	SS_SLS_BRSUP_1799_LDataSet ds = null;
    	SS_SLS_BRSUP_1799_LDM dm = new SS_SLS_BRSUP_1799_LDM();

        SSBrsup1700DAO dao = new SSBrsup1700DAO();
        // DAO 객체의 selectAplcDetail 호출
        ds = dao.createBrsup1799(dm);

        req.setAttribute("ds", ds); // request에 결과값을 담는다.

    }

    public static String lPad(String str, int size, String fStr) {
        byte[] b = str.getBytes();
        int len = b.length;

        int tmp = size - len;

        for (int i=0; i < tmp ; i++){
             str = fStr + str;
        }
        return str;
    }

}
