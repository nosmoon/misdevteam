/***************************************************************************************************
* 파일명 : AdNmd4200WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.nmd.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.nmd.dao.AdNmd4200DAO;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */
public class AdNmd4200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4200_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4200_MDataSet ds = null;

        // DM Setting
    	AD_NMD_4200_MDM dm = new AD_NMD_4200_MDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String clos_yymm   = Util.checkString(req.getParameter("dd_clos_yymm"));
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setClos_yymm(clos_yymm.substring(0,6));   
        dm.setWork_clsf(work_clsf);         
       
        //dm.print();
        try {
        	AdNmd4200DAO	dao = new AdNmd4200DAO();
            ds = dao.ad_nmd_4200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
    }    
  
public void ad_nmd_4210_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4210_ADataSet ds = null;

        // DM Setting
    	AD_NMD_4210_ADM dm = new AD_NMD_4210_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd 	= Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdNmd4200DAO	dao = new AdNmd4200DAO();
            ds = dao.ad_nmd_4210_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }    

    public void ad_nmd_4220_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4220_ADataSet ds = null;

        // DM Setting
    	AD_NMD_4220_ADM dm = new AD_NMD_4220_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdNmd4200DAO	dao = new AdNmd4200DAO();
            ds = dao.ad_nmd_4220_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
    }
     
}
