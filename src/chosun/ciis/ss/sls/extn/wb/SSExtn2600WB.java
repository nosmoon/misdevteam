/***************************************************************************************************
 * 파일명 : SSExtn2600WB.java
* 기능 : 확장현황-기타확장관련작업을 위한 Worker bean
* 작성일자 : 2031-1-28
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

public class SSExtn2600WB {
    
    /**
     * 확장현황-대학생캠페인확장 목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
	public void selectYearlySubsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_L_YEARLY_SUBSDataSet ds = null;
		SS_L_YEARLY_SUBSDM dm = new SS_L_YEARLY_SUBSDM();
		
		dm.cpnno = Util.checkString(req.getParameter("cpnno"));
		dm.date_sel = Util.checkString(req.getParameter("date_sel"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.shftcd = Util.checkString(req.getParameter("shftcd"));
		dm.shftyn = Util.checkString(req.getParameter("shftyn"));
		dm.useyn = Util.checkString(req.getParameter("useyn"));
		dm.sendyn = Util.checkString(req.getParameter("sendyn"));
		dm.bo_headyn = Util.checkString(req.getParameter("bo_headyn"));

		dm.print();

        	SSExtn2600DAO dao = new SSExtn2600DAO();
        	// DAO 객체의 selectList 호출
        	ds = dao.selectYearlySubsList(dm);
        	req.setAttribute("ds", ds);
	}
	
	public void selectYearlySubsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_S_YEARLY_SUBSDataSet ds = null;
		SS_S_YEARLY_SUBSDM dm = new SS_S_YEARLY_SUBSDM();
		
		dm.cpnno = Util.checkString(req.getParameter("cpnno"));
		dm.print();

        	SSExtn2600DAO dao = new SSExtn2600DAO();
        	// DAO 객체의 selectList 호출
        	ds = dao.selectYearlySubsDetail(dm);
        	req.setAttribute("ds", ds);
	}
	
	public void getUserInfo(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_L_YEARLY_SUBS_GETUSERDataSet ds = null;
    	
    	String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
    	
    	System.out.println("empnm : "+empnm);
        // DM Setting
    	SS_L_YEARLY_SUBS_GETUSERDM dm = new SS_L_YEARLY_SUBS_GETUSERDM();
    	dm.setSrch_word(empnm);

    	SSExtn2600DAO dao = new SSExtn2600DAO();
        // DAO 객체의 initApt 호출
        ds = dao.getUserInfo(dm);
        req.setAttribute("ds", ds);
    }
	
	public void insertYearlySubs(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
		SS_I_YEARLY_SUBSDataSet ds = null;
    	
    	String cpnno = Util.Uni2Ksc(Util.checkString(req.getParameter("cpnno")));       
    	String cpntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("cpntypecd")));    
    	String freemm = Util.Uni2Ksc(Util.checkString(req.getParameter("freemm")));       
    	String extnfee = Util.Uni2Ksc(Util.checkString(req.getParameter("extnfee")));      
    	String issudt = Util.Uni2Ksc(Util.checkString(req.getParameter("issudt")));       
    	String seldt = Util.Uni2Ksc(Util.checkString(req.getParameter("seldt")));        
    	String expdt = Util.Uni2Ksc(Util.checkString(req.getParameter("expdt")));        
    	String usedt = Util.Uni2Ksc(Util.checkString(req.getParameter("usedt")));        
    	String empno = Util.Uni2Ksc(Util.checkString(req.getParameter("empno")));        
    	String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));        
    	String emp_telno = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_telno")));    
    	String shftcd = Util.Uni2Ksc(Util.checkString(req.getParameter("shftcd")));       
    	String shftamt = Util.Uni2Ksc(Util.checkString(req.getParameter("shftamt")));      
    	String shftdt = Util.Uni2Ksc(Util.checkString(req.getParameter("shftdt")));       
    	String shftnm = Util.Uni2Ksc(Util.checkString(req.getParameter("shftnm")));       
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));         
    	String bo_telno = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_telno")));     
    	String banknm = Util.Uni2Ksc(Util.checkString(req.getParameter("banknm")));       
    	String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));       
    	String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));  
    	String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
    	String sendyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sendyn")));       
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String subscnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfm")));     
    	String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
    	String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
    	String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));    
    	String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));        
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));       
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));       
    	String teamcd = Util.Uni2Ksc(Util.checkString(req.getParameter("teamcd"))); 
    	String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
    	String incmgpers = Util.getSessionParameterValue(req, "uid", true);
    	String extn_rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_rdrnm")));
    	String extn_rshpclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_rshpclsf")));
    	String extn_tel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_tel1")));
    	String extn_tel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_tel2")));
    	String extn_tel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_tel3")));
    	String extn_ptph1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_ptph1")));
    	String extn_ptph2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_ptph2")));
    	String extn_ptph3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_ptph3")));
    	String extn_email = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_email")));
    	String extn_dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvzip")));
    	String extn_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvaddr")));
    	String extn_dlvaddrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvaddrdtls")));
    	String extn_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_bocd")));
    	String extn_bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_bonm")));
    	String extn_resiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_resiclsf")));
    	String extn_resitype = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_resitype")));
    	String extn_dlvhope = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvhope")));
    	String extn_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_remk")));
    	String extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_qty")));
    	String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
    	
    	System.out.println("cpnno :  "+cpnno);
    	System.out.println("cpntypecd :  "+cpntypecd);
    	System.out.println("issudt :  "+issudt);
    	/*System.out.println("extndt "+extndt);
    	System.out.println("extnflnm "+extnflnm);
    	System.out.println("rdrnm "+rdrnm);
    	System.out.println("rdrtel_no1 "+rdrtel_no1);
    	System.out.println("rdrptph_no1 "+rdrptph_no1);
    	System.out.println("dlvzip "+dlvzip);
    	System.out.println("dlvaddr "+dlvaddr);
    	System.out.println("dlvdtlsaddr "+dlvdtlsaddr);
    	System.out.println("corrbocd "+corrbocd);
    	System.out.println("svccd "+svccd);
    	System.out.println("remk "+remk);
    	System.out.println("qty "+qty);
    	System.out.println("extnempseq "+extnempseq);
    	System.out.println("aplcpersnm "+aplcpersnm);
    	System.out.println("dlvhopedt "+dlvhopedt);
    	System.out.println("delyn "+delyn);
    	System.out.println("prn "+prn);
    	System.out.println("cmpycd "+cmpycd);*/
        // DM Setting
    	SS_I_YEARLY_SUBSDM dm = new SS_I_YEARLY_SUBSDM();
    	
    	dm.setCpnno(cpnno);      
    	dm.setCpntypecd(cpntypecd); 
    	dm.setFreemm(freemm);   
    	dm.setExtnfee(extnfee); 
    	dm.setIssudt(issudt);   
    	dm.setSeldt(seldt);     
    	dm.setExpdt(expdt); 
    	dm.setUsedt(usedt); 
    	dm.setEmpno(empno);
    	dm.setEmpnm(empnm);
    	dm.setEmp_telno(emp_telno);
    	dm.setShftcd(shftcd);
    	dm.setShftamt(shftamt);
    	dm.setShftdt(shftdt);
    	dm.setShftnm(shftnm);
    	dm.setBocd(bocd);
    	dm.setBo_telno(bo_telno);
    	dm.setBanknm(banknm);
    	dm.setAcctno(acctno);
    	dm.setDeps_persnm(deps_persnm);
    	dm.setRemk(remk);
    	dm.setSendyn(sendyn);
    	dm.setRdr_no(rdr_no);
    	dm.setSubscnfm(subscnfm);
    	dm.setRdr_extndt(rdr_extndt);
    	dm.setRdr_extnno(rdr_extnno); 
    	dm.setSubsfr_dt(subsfr_dt);
    	dm.setValmm(valmm);  
    	dm.setCmpycd(cmpycd); 
    	dm.setDeptcd(deptcd); 
    	dm.setTeamcd(teamcd);
    	dm.setFlag(flag);
    	dm.setIncmgpers(incmgpers);
    	dm.setExtn_rdrnm(extn_rdrnm);
    	dm.setExtn_rshpclsf(extn_rshpclsf);
    	dm.setExtn_tel1(extn_tel1);
    	dm.setExtn_tel2(extn_tel2);
    	dm.setExtn_tel3(extn_tel3);
    	dm.setExtn_ptph1(extn_ptph1);
    	dm.setExtn_ptph2(extn_ptph2);
    	dm.setExtn_ptph3(extn_ptph3);
    	dm.setExtn_email(extn_email);
    	dm.setExtn_dlvzip(extn_dlvzip);
    	dm.setExtn_dlvaddr(extn_dlvaddr);
    	dm.setExtn_dlvaddrdtls(extn_dlvaddrdtls);
    	dm.setExtn_bocd(extn_bocd);
    	dm.setExtn_bonm(extn_bonm);
    	dm.setExtn_resiclsf(extn_resiclsf);
    	dm.setExtn_resitype(extn_resitype);
    	dm.setExtn_dlvhope(extn_dlvhope);
    	dm.setExtn_remk(extn_remk);
    	dm.setExtn_qty(extn_qty);
    	dm.setBldmngnn(bldmngnn);

    	dm.print();
    	SSExtn2600DAO dao = new SSExtn2600DAO();
        // DAO 객체의 initApt 호출
        ds = dao.insertYearlySubs(dm);
        req.setAttribute("ds", ds);       
    }
	
	public void getDlvaddr(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_L_YEARLY_SUBS_GETADDRDataSet ds = null;
    	
    	String bocd = Util.checkString(req.getParameter("bocd"));					//지국지사코드
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//동명
        String zip = Util.checkString(req.getParameter("zip"));						//우편번호
        String pageno = Util.checkString(req.getParameter("pageno"));				//현재 페이지
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//페이지사이즈
    	
        System.out.println("bocd : "+bocd);
        System.out.println("addr3 : "+bocd);
        System.out.println("zip : "+zip);
        System.out.println("pageno : "+pageno);
        System.out.println("pagesize : "+pagesize);
        
        // DM Setting
    	SS_L_YEARLY_SUBS_GETADDRDM dm = new SS_L_YEARLY_SUBS_GETADDRDM();
    	dm.setBocd(bocd); // 지국지사코드
        dm.setZip(zip);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
        
        dm.print();

    	SSExtn2600DAO dao = new SSExtn2600DAO();
        // DAO 객체의 initApt 호출
        ds = dao.getDlvaddr(dm);
        req.setAttribute("ds", ds);
    }

}
