/***************************************************************************************************
* 파일명 : SSExtn5700WB.java
* 기능 : 확장관리-정기구독권
* 작성일자 : 2018-01-10
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
import java.util.*;				//추가
import java.lang.*;				//추가
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * WB
 */

public class SSExtn5700WB{
	
	/**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn5700(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5700_ADataSet ds = null;

         //request process
         //String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_5700_ADM dm = new SS_SLS_EXTN_5700_ADM();
         //dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn5700DAO dao = new SSExtn5700DAO();         
         ds = dao.initExtn5700(dm);
         req.setAttribute("ds", ds);

    }

    public void selectExtn5710(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5710_LDataSet ds = null;

        //request process
   	 	String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
   	 	   	 		
        SS_SLS_EXTN_5710_LDM dm = new SS_SLS_EXTN_5710_LDM();
        dm.setSubscrpt_cd(subscrpt_cd);
        
        dm.print();

        SSExtn5700DAO dao = new SSExtn5700DAO();         
        ds = dao.selectExtn5710(dm);
        req.setAttribute("ds", ds);
    }
    
    public void insertExtn5720(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	
   	 	SS_SLS_EXTN_5720_IDataSet ds = null;

        //request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
   	 	String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
   	 	String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
   	 	String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
   	 	String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
   	 	String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
   	 	String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
   	 	String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
   	 	String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
   		String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
   		String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
   		String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
   	 	String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
   	 	String add_subs = Util.Uni2Ksc(Util.checkString(req.getParameter("add_subs")));
   	 	   	 	   		
   		SS_SLS_EXTN_5720_IDM dm = new SS_SLS_EXTN_5720_IDM();
        dm.setIncmgpers(incmgpers);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setBldmngnn(bldmngnn);
        dm.setBocd(bocd);
        dm.setSubscrpt_cd(subscrpt_cd);
        dm.setAdd_subs(add_subs);
        
        dm.print();

        SSExtn5700DAO dao = new SSExtn5700DAO();         
        ds = dao.insertExtn5720(dm);        
        req.setAttribute("ds", ds);
    }
    
    public void selectExtn5730(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5730_LDataSet ds = null;
        
   	 	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
	 	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
	 	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
	 	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
	 	String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
	 	String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
	 	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
	 	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
	 	String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
	 	String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
	 	String subsyn = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyn")));
	 	String dn_fr_yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_fr_yymm1")));
	 	String dn_fr_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_fr_yymm2")));
	 	String dn_to_yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_to_yymm1")));
	 	String dn_to_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_to_yymm2")));
	 	String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
	 	String subscrpt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_gb")));
   	 	   		
   		SS_SLS_EXTN_5730_LDM dm = new SS_SLS_EXTN_5730_LDM();
   		dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromtogb(fromtogb);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setRdrnm(rdrnm);
        dm.setBo_headcnfmyn(bo_headcnfmyn);
        dm.setSubscnfmstatcd(subscnfmstatcd);
        dm.setSubsyn(subsyn);
        dm.setDn_fr_yymm1(dn_fr_yymm1);
        dm.setDn_fr_yymm2(dn_fr_yymm2);
        dm.setDn_to_yymm1(dn_to_yymm1);
        dm.setDn_to_yymm2(dn_to_yymm2);
        dm.setSubscrpt_cd(subscrpt_cd);
        dm.setSubscrpt_gb(subscrpt_gb);
        
        dm.print();

        SSExtn5700DAO dao = new SSExtn5700DAO();         
        ds = dao.selectExtn5730(dm);
        req.setAttribute("ds", ds);
    }
}    