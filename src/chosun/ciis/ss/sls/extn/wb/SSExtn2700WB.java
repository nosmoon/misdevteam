/***************************************************************************************************
 * 파일명 : SSExtn2700WB.java
 * 기능 : 사원구독 처리를 위한 Worker Bean
 * 작성일자 : 2013-3-5
 * 작성자 : 심정보
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * 확장현황-신청현황 을 위한 WB
 */

public class SSExtn2700WB {

    /**
     * 확장현황-사원구독관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_EMP_NWSPRDR_INITDataSet ds = null;
        
    	SS_L_EMP_NWSPRDR_INITDM dm = new SS_L_EMP_NWSPRDR_INITDM();

        SSExtn2700DAO dao = new SSExtn2700DAO();
        // DAO 객체의 init 호출
        ds = dao.init(dm);
        req.setAttribute("ds", ds);
    }
    
    public void selectEmpNwsprdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {    	
    	SS_L_EMP_NWSPRDRDataSet ds = null;
        // Request Parameter Processing
        String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
        String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
        String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
        String subsyn = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyn")));
        
        // DM Setting
        SS_L_EMP_NWSPRDRDM dm = new SS_L_EMP_NWSPRDRDM();
        dm.setCntrno(cntrno);
        dm.setCmpycd(cmpycd);
        dm.setEmpnm(empnm);
        dm.setSubsyn(subsyn);
        
        SSExtn2700DAO dao = new SSExtn2700DAO();
        
        // DAO 객체의 selectList 호출
        ds = dao.selectEmpNwsprdrList(dm);
        
        req.setAttribute("ds", ds);
    }
    
    public void selectEmpNwsprdrListRdr(HttpServletRequest req, HttpServletResponse res) throws AppException {    	
    	SS_L_EMP_NWSPRDR_RDRDataSet ds = null;
        // Request Parameter Processing
        String search_flag_rdr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_flag_rdr")));
        String search_word_rdr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word_rdr")));
        
        // DM Setting
        SS_L_EMP_NWSPRDR_RDRDM dm = new SS_L_EMP_NWSPRDR_RDRDM();
        dm.setSearch_flag_rdr(search_flag_rdr);
        dm.setSearch_word_rdr(search_word_rdr);
        
        SSExtn2700DAO dao = new SSExtn2700DAO();
        
        // DAO 객체의 selectList 호출
        ds = dao.selectEmpNwsprdrListRdr(dm);
        
        req.setAttribute("ds", ds);
    }
    
    public void updateEmpNwsprdr(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_A_EMP_NWSPRDRDataSet ds = null;
    	
    	String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
    	String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));
    	String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
    	String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
    	String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));
    	String suspdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspdt")));
    	String suspresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("suspresncd")));
    	String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
    	String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
    	String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
    	String dlvtelno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvtelno")));
    	String dlvptphno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvptphno")));
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String modcheck = Util.Uni2Ksc(Util.checkString(req.getParameter("modcheck")));
    	    	
    	System.out.println("cntrno "+cntrno);
    	System.out.println("cmpycd "+cmpycd);
    	System.out.println("empseq "+empseq);
    	System.out.println("rdr_no "+rdr_no);
    	System.out.println("rdrnm "+rdrnm);
    	System.out.println("rdr_extndt "+rdr_extndt);
    	System.out.println("subsfr_dt "+subsfr_dt);
    	System.out.println("valmm "+valmm);
    	System.out.println("qty "+qty);
    	System.out.println("freeyn "+freeyn);
    	System.out.println("suspdt "+suspdt);
    	System.out.println("suspresncd "+suspresncd);
    	System.out.println("dlvaddr "+dlvaddr);
    	System.out.println("bocd "+bocd);
    	System.out.println("bonm "+bonm);
    	System.out.println("rdr_extnno "+rdr_extnno);
    	System.out.println("dlvzip "+dlvzip);
    	System.out.println("dlvtelno "+dlvtelno);
    	System.out.println("dlvptphno "+dlvptphno);
    	System.out.println("medicd "+medicd);
    	
    	System.out.println("modcheck "+modcheck);

        // DM Setting
    	SS_A_EMP_NWSPRDRDM dm = new SS_A_EMP_NWSPRDRDM();
    	
    	dm.setCntrno(cntrno);
    	dm.setCmpycd(cmpycd);
    	dm.setEmpseq(empseq);
    	dm.setRdr_no(rdr_no);
    	dm.setRdrnm(rdrnm);
    	dm.setRdr_extndt(rdr_extndt);
    	dm.setSubsfr_dt(subsfr_dt);
    	dm.setValmm(valmm);
    	dm.setQty(qty);
    	dm.setFreeyn(freeyn);
    	dm.setSuspdt(suspdt);
    	dm.setSuspresncd(suspresncd);
    	dm.setDlvaddr(dlvaddr);
    	dm.setBocd(bocd);
    	dm.setBonm(bonm);
    	dm.setRdr_extnno(rdr_extnno);
    	dm.setDlvzip(dlvzip);
    	dm.setDlvtelno(dlvtelno);
    	dm.setDlvptphno(dlvptphno);
    	dm.setMedicd(medicd);
    	dm.setModcheck(modcheck);
    	
    	SSExtn2700DAO dao = new SSExtn2700DAO();
        // DAO 객체의 initApt 호출
        ds = dao.updateEmpNwsprdr(dm);
        req.setAttribute("ds", ds);
    }
}
