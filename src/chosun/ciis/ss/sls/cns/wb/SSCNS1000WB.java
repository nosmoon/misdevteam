/***************************************************************************************************
 * 파일명 : SSCNS1000WB.java
 * 기능 : 상담원 등록,수정,삭제를 위한 Worker Bean
 * 작성일자 : 2004-07-14
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.cns.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 상담원 등록,수정,삭제를 위한 WB
 */

public class SSCNS1000WB {


    /**
     * 상담원-등록,수정,삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void accessCNS(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_TMDataSet ds = null;
        // Session Processing
        String uid = Util.getSessionParameterValue(req, "uid", true);
        String nm = Util.getSessionParameterValue(req, "emp_nm", true);
        // Request Parameter Processing
		String jobflag = Util.Uni2Ksc(Util.checkString(req.getParameter("jobflag")));
		String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
		String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
		String no = Util.Uni2Ksc(Util.checkString(req.getParameter("no")));
		String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));
		String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
		String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));
		String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));
		String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));
		String aplcpersemail = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersemail")));
		String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));
		String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));
		String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));
		String aplcperszip = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperszip")));
		String aplcpersaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersaddr")));
		String aplcpersdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersdtlsaddr")));
		String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
		String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
		String natncd = Util.Uni2Ksc(Util.checkString(req.getParameter("natncd")));
		String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
		String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
		String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
		String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));
		String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
		String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
		String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
		String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
		String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
		String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
		String movmresiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresiclsf")));
		String movmresitype = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresitype")));
		String movmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("movmdt")));
		String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
		String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
		String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
		String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
		String bocd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd2")));
		String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
		String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
		String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
		String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
		String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
		String clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfcd")));
		String suspfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspfrdt")));
		String susptodt = Util.Uni2Ksc(Util.checkString(req.getParameter("susptodt")));
		String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
		String vaca_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areacd")));
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
		String cnscnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("cnscnfmyn")));
		String cnscnfmcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cnscnfmcd")));

        String bo_procreqitm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_procreqitm")));
		String bo_cnfmtel = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cnfmtel")));
        String cns_procreqitm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_procreqitm")));
		String cns_cnfmtel = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_cnfmtel")));
		
		String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
		String movmbldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("movmbldmngnn")));

        System.out.println( "##############" );
        System.out.println( bo_procreqitm );
        System.out.println( bo_cnfmtel );
        System.out.println( cns_procreqitm );
        System.out.println( cns_cnfmtel );
        System.out.println( "##############" );

        // DM Setting
        SS_A_TMDM dm = new SS_A_TMDM();
		dm.setJobflag(jobflag);
		dm.setAccflag(accflag);
		dm.setDt(dt);
		dm.setNo(no);
		dm.setRshpclsfcd(rshpclsfcd);
		dm.setAplcpersnm(aplcpersnm);
		dm.setAplcperstel_no1(aplcperstel_no1);
		dm.setAplcperstel_no2(aplcperstel_no2);
		dm.setAplcperstel_no3(aplcperstel_no3);
		dm.setAplcpersemail(aplcpersemail);
		dm.setAplcpersptph_no1(aplcpersptph_no1);
		dm.setAplcpersptph_no2(aplcpersptph_no2);
		dm.setAplcpersptph_no3(aplcpersptph_no3);
		dm.setAplcperszip(aplcperszip);
		dm.setAplcpersaddr(aplcpersaddr);
		dm.setAplcpersdtlsaddr(aplcpersdtlsaddr);
		dm.setRdr_no(rdr_no);
		dm.setRdrnm(rdrnm);
		dm.setNatncd(natncd);
		dm.setRdrtel_no1(rdrtel_no1);
		dm.setRdrtel_no2(rdrtel_no2);
		dm.setRdrtel_no3(rdrtel_no3);
		dm.setRdremail(rdremail);
		dm.setRdrptph_no1(rdrptph_no1);
		dm.setRdrptph_no2(rdrptph_no2);
		dm.setRdrptph_no3(rdrptph_no3);
		dm.setDlvzip(dlvzip);
		dm.setDlvaddr(dlvaddr);
		dm.setDlvdtlsaddr(dlvdtlsaddr);
		dm.setMovmresiclsf(movmresiclsf);
		dm.setMovmresitype(movmresitype);
		dm.setMovmdt(movmdt);
		dm.setMedicd(medicd);
		dm.setQty(qty);
		dm.setDlvhopedt(dlvhopedt);
		dm.setBocd(bocd);
		dm.setBocd2(bocd2);
		dm.setResiclsfcd(resiclsfcd);
		dm.setResitypecd(resitypecd);
		dm.setDscttypecd(dscttypecd);
		dm.setTitl(titl);
		dm.setCont(cont);
		dm.setClsfcd(clsfcd);
		dm.setSuspfrdt(suspfrdt);
		dm.setSusptodt(susptodt);
		dm.setVaca_arearegncd(vaca_arearegncd);
		dm.setVaca_areacd(vaca_areacd);
		dm.setUid(uid);
		dm.setNm(nm);
		dm.setRemk(remk);
		dm.setCnscnfmyn(cnscnfmyn);
		dm.setCnscnfmcd(cnscnfmcd);

        dm.setBo_procreqitm(bo_procreqitm);
        dm.setBo_cnfmtel(bo_cnfmtel);
        dm.setCns_procreqitm(cns_procreqitm);
        dm.setCns_cnfmtel(cns_cnfmtel);
        
        dm.setBldmngnn(bldmngnn);
        dm.setMovmbldmngnn(movmbldmngnn);

        System.out.println( "##############" );
        System.out.println( bo_procreqitm );
        System.out.println( bo_cnfmtel );
        System.out.println( cns_procreqitm );
        System.out.println( cns_cnfmtel );
        System.out.println( "##############" );
        
        SSCNS1000DAO dao = new SSCNS1000DAO();
        // DAO 객체의 accessCNS 호출
        ds = dao.accessCNS(dm);
        req.setAttribute("ds", ds);

        /*
        SSCNS1000EJBHome home = (SSCNS1000EJBHome) JNDIManager.getInstance().getHome("SSCNS1000EJB");
        try {
            SSCNS1000EJB ejb = home.create();
            ds = ejb.accessCNS(dm);
            req.setAttribute("ds", ds);
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
     * 상담원-출판독자검색-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_RDR_TMDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));

        // DM Setting
        SS_L_RDR_TMDM dm = new SS_L_RDR_TMDM();
        dm.setIncmgpers(incmgpers);
        dm.setMedicd(medicd);
        dm.setRdrnm(rdrnm);
        
        SSCNS1000DAO dao = new SSCNS1000DAO();
        // DAO 객체의 selectRdrSrchList 호출
        ds = dao.selectRdrSrchList(dm);
        req.setAttribute("ds", ds);

        /*
        SSCNS1000EJBHome home = (SSCNS1000EJBHome) JNDIManager.getInstance().getHome("SSCNS1000EJB");
        try {
            SSCNS1000EJB ejb = home.create();
            ds = ejb.selectRdrSrchList(dm);
            req.setAttribute("ds", ds);
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
     * 상담원-자동이체관련-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initCNSShftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_SHFTAPLC_INIT_TMDataSet ds = null;

        // DM Setting
        SS_L_SHFTAPLC_INIT_TMDM dm = new SS_L_SHFTAPLC_INIT_TMDM();
        
        SSCNS1000DAO dao = new SSCNS1000DAO();
        // DAO 객체의 initCNSShftAplc 호출
        ds = dao.initCNSShftAplc(dm);
        req.setAttribute("ds", ds);

        /*
        SSCNS1000EJBHome home = (SSCNS1000EJBHome) JNDIManager.getInstance().getHome("SSCNS1000EJB");
        try {
            SSCNS1000EJB ejb = home.create();
            ds = ejb.initCNSShftAplc(dm);
            req.setAttribute("ds", ds);
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
     * 상담원-자동이체관련-등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertCNSShftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_I_SHFTAPLC_TMDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String onlmembseq = Util.Uni2Ksc(Util.checkString(req.getParameter("onlmembseq")));
        String rdrflag = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrflag")));
        String mediflag = Util.Uni2Ksc(Util.checkString(req.getParameter("mediflag")));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String rdrtel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel1")));
        String rdrtel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel2")));
        String rdrtel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel3")));
        String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
        String dlvaddrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddrdtls")));
        String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));
        String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
        String cardcmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cardcmpycd")));
        String cardno = Util.Uni2Ksc(Util.checkString(req.getParameter("cardno")));
        String vdtyprd = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtyprd")));
        String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String pymtno_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno_2")));
        String pymttel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel1")));
        String pymttel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel2")));
        String pymttel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel3")));
        String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
        String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
        String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
        String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
        String aplyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplyyymm")));
        String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
       SS_I_SHFTAPLC_TMDM dm = new SS_I_SHFTAPLC_TMDM();

        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setOnlmembseq(onlmembseq);
        dm.setRdrflag(rdrflag);
        dm.setMediflag(mediflag);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel1(rdrtel1);
        dm.setRdrtel2(rdrtel2);
        dm.setRdrtel3(rdrtel3);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvaddrdtls(dlvaddrdtls);
        dm.setRdrprn(rdrprn);
        dm.setDlvhopedt(dlvhopedt);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setShftclsf(shftclsf);
        dm.setPymtnm(pymtnm);
        dm.setPymtno_2(pymtno_2);
        dm.setPymttel1(pymttel1);
        dm.setPymttel2(pymttel2);
        dm.setPymttel3(pymttel3);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setPrn(prn);
        dm.setAplcdt(aplcdt);
        dm.setAplyyymm(aplyyymm);
        dm.setEmail(email);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
		dm.setRemk(remk);

		SSCNS1000DAO dao = new SSCNS1000DAO();
        // DAO 객체의 insertCNSShftAplc 호출
        ds = dao.insertCNSShftAplc(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCNS1000EJBHome home = (SSCNS1000EJBHome) JNDIManager.getInstance().getHome("SSCNS1000EJB");
        try {
            SSCNS1000EJB ejb = home.create();
            ds = ejb.insertCNSShftAplc(dm);
            req.setAttribute("ds", ds);
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
     * 상담원-불편 통계-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectDsctStatDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_DSCTSTAT_TMDataSet ds = null;

        String jobcd = Util.checkString(req.getParameter("jobcd"));
        String srchdt = Util.checkString(req.getParameter("srchdt"));
       // DM Setting
        SS_L_DSCTSTAT_TMDM dm = new SS_L_DSCTSTAT_TMDM();
        dm.setJobcd(jobcd);
        dm.setSrchdt(srchdt);

        SSCNS1000DAO dao = new SSCNS1000DAO();
        // DAO 객체의 selectDsctStatDetail 호출
        ds = dao.selectDsctStatDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCNS1000EJBHome home = (SSCNS1000EJBHome) JNDIManager.getInstance().getHome("SSCNS1000EJB");
        try {
            SSCNS1000EJB ejb = home.create();
            ds = ejb.selectDsctStatDetail(dm);
            req.setAttribute("ds", ds);
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

}
