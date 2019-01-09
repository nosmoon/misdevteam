/***************************************************************************************************
* 파일명 : SSExtn5400WB.java
* 기능 : 기업후원확장-구독배정내역(담당조회)
* 작성일자 : 2017-10-11
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

public class SSExtn5400WB{
	
	/**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn5400(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5400_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);         

         SS_SLS_EXTN_5400_ADM dm = new SS_SLS_EXTN_5400_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn5400DAO dao = new SSExtn5400DAO();         
         ds = dao.initExtn5400(dm);
         req.setAttribute("ds", ds);

    }

    public void selectExtn5410(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5410_LDataSet ds = null;
         
    	 String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	 String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	 String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	 String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));    	 
         String fryymm = Util.checkString(req.getParameter("fryymm"));
    	 String toyymm = Util.checkString(req.getParameter("toyymm"));
    	 String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
         String extn_gb = Util.checkString(req.getParameter("extn_gbcd"));
    	 
    	 
    	 SS_SLS_EXTN_5410_LDM dm = new SS_SLS_EXTN_5410_LDM();
    	 dm.setDeptcd(deptcd);
    	 dm.setPartcd(partcd);
    	 dm.setAreacd(areacd);
    	 dm.setBocd(bocd);
    	 dm.setFryymm(fryymm);
    	 dm.setToyymm(toyymm);
    	 dm.setIncmgpers(incmgpers);
    	 dm.setCmpycd(cmpycd);
    	 dm.setExtn_gb(extn_gb);
    	 
    	 dm.print();

         SSExtn5400DAO dao = new SSExtn5400DAO();         
         ds = dao.selectExtn5410(dm);
         req.setAttribute("ds", ds);

    }
 
    public void selectExtn5420(HttpServletRequest req, HttpServletResponse res) throws AppException {

      	 SS_SLS_EXTN_5420_LDataSet ds = null;
        
         String valmm = Util.checkString(req.getParameter("valmm"));
         String bocd = Util.checkString(req.getParameter("bocd"));
         String extn_gb = Util.checkString(req.getParameter("extn_gbcd"));
      	 
      	 SS_SLS_EXTN_5420_LDM dm = new SS_SLS_EXTN_5420_LDM();
      	 
      	 dm.setBocd(bocd);
      	 dm.setValmm(valmm);
      	 dm.setExtn_gb(extn_gb);
      	 
      	 dm.print();

        SSExtn5400DAO dao = new SSExtn5400DAO();         
        ds = dao.selectExtn5420(dm);
        req.setAttribute("ds", ds);

      }
}    