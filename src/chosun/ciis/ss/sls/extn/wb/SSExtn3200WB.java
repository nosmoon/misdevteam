/***************************************************************************************************
* 파일명 : SSExtn3200WB.java
* 기능 : 확장조건관리
* 작성일자 : 2015-03-13
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
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * 중지방어관리 WB
 */

public class SSExtn3200WB{

    /**
     * 중지방어관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExtnCondInit(HttpServletRequest req, HttpServletResponse res) throws AppException {

         SS_L_EXCD_INITDataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));

         SS_L_EXCD_INITDM dm = new SS_L_EXCD_INITDM();
         dm.setBocd(bocd);

         SSExtn3200DAO dao = new SSExtn3200DAO();         
         ds = dao.selectExtnCondInit(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * 중지방어관리-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
   public void selectExtnCondList(HttpServletRequest req, HttpServletResponse res) throws AppException {

        SS_L_EXCDDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("corrbocd"));
        String appr_gubun = Util.checkString(req.getParameter("appr_gubun"));
        String extncdusage = Util.checkString(req.getParameter("extncdusage"));
        String resitypecd = Util.checkString(req.getParameter("resitypecd"));

        SS_L_EXCDDM dm = new SS_L_EXCDDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setAppr_gubun(appr_gubun);
        dm.setExtncdusage(extncdusage);
        dm.setResitypecd(resitypecd);
        
        dm.print();
               
        SSExtn3200DAO dao = new SSExtn3200DAO();		
		ds = dao.selectExtnCondList(dm);
		req.setAttribute("ds", ds);

    }
   
   public void apprExtnCond(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_U_EXCD_APPRDataSet ds = null;
	
		String uid = Util.getSessionParameterValue(req, "uid", true);
	
		String bocd = Util.checkString(req.getParameter("bocd"));
		String extncdusage = Util.checkString(req.getParameter("extncdusage"));
		String resitype = Util.checkString(req.getParameter("resitype"));
		    	
	    // DM Setting
		SS_U_EXCD_APPRDM dm = new SS_U_EXCD_APPRDM();
		dm.setUid(uid);
		dm.setBocd(bocd);
		dm.setExtncdusage(extncdusage);
		dm.setResitype(resitype);
		
		dm.print();
	
		SSExtn3200DAO dao = new SSExtn3200DAO();	  
	    ds = dao.apprExtnCond(dm);
	    req.setAttribute("ds", ds);
   }
   
   public void apprRejExtnCond(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_U_EXCD_APPRREJDataSet ds = null;
	
		String uid = Util.getSessionParameterValue(req, "uid", true);
	
		String bocd = Util.checkString(req.getParameter("bocd"));
		String extncdusage = Util.checkString(req.getParameter("extncdusage"));
		String resitype = Util.checkString(req.getParameter("resitype"));
		    	
	    // DM Setting
		SS_U_EXCD_APPRREJDM dm = new SS_U_EXCD_APPRREJDM();
		dm.setUid(uid);
		dm.setBocd(bocd);
		dm.setExtncdusage(extncdusage);
		dm.setResitype(resitype);
		
		dm.print();
	
		SSExtn3200DAO dao = new SSExtn3200DAO();	  
	    ds = dao.apprRejExtnCond(dm);
	    req.setAttribute("ds", ds);
  }
   
   public void delExtnCond(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_U_EXCD_DELDataSet ds = null;
	
		String uid = Util.getSessionParameterValue(req, "uid", true);
	
		String bocd = Util.checkString(req.getParameter("bocd"));
		String extncdusage = Util.checkString(req.getParameter("extncdusage"));
		String resitype = Util.checkString(req.getParameter("resitype"));
		    	
	    // DM Setting
		SS_U_EXCD_DELDM dm = new SS_U_EXCD_DELDM();
		dm.setUid(uid);
		dm.setBocd(bocd);
		dm.setExtncdusage(extncdusage);
		dm.setResitype(resitype);
		
		dm.print();
	
		SSExtn3200DAO dao = new SSExtn3200DAO();	  
	    ds = dao.delExtnCond(dm);
	    req.setAttribute("ds", ds);
  }
}
