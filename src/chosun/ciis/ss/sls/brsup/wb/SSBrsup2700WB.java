/***************************************************************************************************
 * 파일명 : SSBrsup2700WB.java
 * 기능 : 지국지원-빌링-가상계좌 통계
 * 작성일자 : 2015-09-30
 * 작성자 : 심정보
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;

import java.rmi.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.extn.dao.SSExtn1000DAO;
import chosun.ciis.ss.sls.extn.dm.SS_L_RDR_XTN_INITDM;
import chosun.ciis.ss.sls.extn.ds.SS_L_RDR_XTN_INITDataSet;

/**
 * 지국지원-빌링-가상계좌 통계
 */

public class SSBrsup2700WB {

    /**
     * 지국지원-빌링-가상계좌통계-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initVactStat(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_VACT_STAT_INITDataSet ds = null;    	
    	SS_L_VACT_STAT_INITDM dm = new SS_L_VACT_STAT_INITDM();    	
        SSBrsup2700DAO dao = new SSBrsup2700DAO();        
        ds = dao.initVactStat(dm);
        req.setAttribute("ds", ds);
    }
    
    public void searchVactStat(HttpServletRequest req, HttpServletResponse res) throws AppException{
	    String deptcd = Util.checkString(req.getParameter("deptcd"));
	    String partcd = Util.checkString(req.getParameter("partcd"));
	    String areacd = Util.checkString(req.getParameter("areacd"));
	    String bocd = Util.checkString(req.getParameter("bocd"));
	    String fr_dt = Util.checkString(req.getParameter("fr_dt"));
	    String to_dt = Util.checkString(req.getParameter("to_dt"));
	    String medicd = Util.checkString(req.getParameter("medicd"));
	    String bankcd = Util.checkString(req.getParameter("bankcd"));
	    String rp_clsf = Util.checkString(req.getParameter("rp_clsf"));
	    
	    SS_L_VACT_STATDM dm = new SS_L_VACT_STATDM();
		
		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setFr_dt(fr_dt);
		dm.setTo_dt(to_dt);
		dm.setMedicd(medicd);
		dm.setBankcd(bankcd);
		dm.setRp_clsf(rp_clsf);
		
		dm.print();
		
		SS_L_VACT_STATDataSet ds = null;
		
		SSBrsup2700DAO dao = new SSBrsup2700DAO();       
		ds = dao.searchVactStat(dm);
		req.setAttribute("ds", ds);
    }
    
    public void detailVactStat(HttpServletRequest req, HttpServletResponse res) throws AppException{
	    String deptcd = Util.checkString(req.getParameter("deptcd"));
	    String partcd = Util.checkString(req.getParameter("partcd"));
	    String areacd = Util.checkString(req.getParameter("areacd"));
	    String bocd = Util.checkString(req.getParameter("bocd"));
	    String fr_dt = Util.checkString(req.getParameter("fr_dt"));
	    String to_dt = Util.checkString(req.getParameter("to_dt"));
	    String medicd = Util.checkString(req.getParameter("medicd"));
	    String bankcd = Util.checkString(req.getParameter("bankcd"));
	    
	    String d_bocd = Util.checkString(req.getParameter("d_bocd"));
	    String d_fr_dt = Util.checkString(req.getParameter("d_fr_dt"));	   
	    String d_to_dt = Util.checkString(req.getParameter("d_to_dt"));	    
	    String d_bankcd = Util.checkString(req.getParameter("d_bankcd"));
	    
	    SS_S_VACT_STATDM dm = new SS_S_VACT_STATDM();
		
		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setFr_dt(fr_dt);
		dm.setTo_dt(to_dt);
		dm.setMedicd(medicd);
		dm.setBankcd(bankcd);	
		dm.setD_bocd(d_bocd);
		dm.setD_fr_dt(d_fr_dt);
		dm.setD_to_dt(d_to_dt);
		dm.setD_bankcd(d_bankcd);
		
		dm.print();
		
		SS_S_VACT_STATDataSet ds = null;
		
		SSBrsup2700DAO dao = new SSBrsup2700DAO();       
		ds = dao.detailVactStat(dm);
		req.setAttribute("ds", ds);
    }
    
    public void printVactStat(HttpServletRequest req, HttpServletResponse res) throws AppException{	    
	    String fr_dt = Util.checkString(req.getParameter("fr_dt"));
	    String to_dt = Util.checkString(req.getParameter("to_dt"));
	    	    
	    SS_P_VACT_STATDM dm = new SS_P_VACT_STATDM();
		
		dm.setFr_dt(fr_dt);
		dm.setTo_dt(to_dt);
				
		dm.print();
		
		SS_P_VACT_STATDataSet ds = null;
		
		SSBrsup2700DAO dao = new SSBrsup2700DAO();       
		ds = dao.printVactStat(dm);
		req.setAttribute("ds", ds);
    }
    
    public void searchBrsup2701(HttpServletRequest req, HttpServletResponse res) throws AppException{
	    String acctno = Util.checkString(req.getParameter("acctno"));
	    
	    SS_SLS_BRSUP_2701_LDM dm = new SS_SLS_BRSUP_2701_LDM();
		
		dm.setAcctno(acctno);
		
		dm.print();
		
		SS_SLS_BRSUP_2701_LDataSet ds = null;
		
		SSBrsup2700DAO dao = new SSBrsup2700DAO();       
		ds = dao.searchBrsup2701(dm);
		req.setAttribute("ds", ds);
    }
}