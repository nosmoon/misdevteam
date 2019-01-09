/***************************************************************************************************
* 파일명 : AdDep4400WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.dep.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;

import chosun.ciis.ad.dep.dao.AdDep4400DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_4410_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4450_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_4410_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4450_ADataSet;

import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep4400WB extends BaseWB {

   
    public void ad_dep_4410_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_4410_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no			= Util.getSessionParameterValue(req, "emp_no", true);
    	String rcpm_dt 			= Util.checkString(req.getParameter("rcpm_dt"));
    	
    	String mchrg_pers		= Util.checkString(req.getParameter("mchrg_pers"));

    	AD_DEP_4410_LDM dm = new AD_DEP_4410_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setEmp_no(emp_no);
    	dm.setRcpm_dt(rcpm_dt);
    	dm.setMchrg_pers(mchrg_pers);
        
        try {
        	AdDep4400DAO	dao = new AdDep4400DAO();
            ds = dao.ad_dep_4410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }  
    
    public void ad_dep_4450_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_DEP_4450_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rcpm_dt 		 = Util.checkString(req.getParameter("rcpm_dt"));
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();    	
    	String mode 		 = Util.checkString(req.getParameter("mode"));
    	
    	AD_DEP_4450_ADM dm = new AD_DEP_4450_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	
    	dm.setRcpm_dt(rcpm_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setMode(mode);
    	
    	//dm.print();

        try {
        	AdDep4400DAO	dao = new AdDep4400DAO();
            ds = dao.ad_dep_4450_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }
}
