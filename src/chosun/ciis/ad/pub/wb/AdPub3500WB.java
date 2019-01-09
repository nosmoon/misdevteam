/***************************************************************************************************
* 파일명 : AdPub3500WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 : 
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.pub.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub3500DAO;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub3500WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3500_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String emp_no           = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_PUB_3500_MDM dm = new AD_PUB_3500_MDM();
    	dm.setCmpy_cd(cmpy_cd); 
    	dm.setEmp_no(emp_no);
    	dm.print();
        try {
        	AdPub3500DAO	dao = new AdPub3500DAO();
            ds = dao.ad_pub_3500_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 		
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3510_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
    	String select_dt 		= Util.checkString(req.getParameter("select_dt"));
    	String frdt             = Util.checkString(req.getParameter("frdt"));
    	String todt             = Util.checkString(req.getParameter("todt"));
    	String misu             = Util.checkString(req.getParameter("misu"));
    	String hndl_clsf        = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no          = Util.checkString(req.getParameter("dlco_no"));
    	String slcrg_pers       = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers       = Util.checkString(req.getParameter("mchrg_pers"));
    	String exct_clsf       = Util.checkString(req.getParameter("exct_clsf"));
    	
    	AD_PUB_3510_LDM dm = new AD_PUB_3510_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setSelect_dt(select_dt);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setMisu(misu);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setExct_clsf(exct_clsf);
    	
    	dm.print();
        try {
        	AdPub3500DAO	dao = new AdPub3500DAO();
            ds = dao.ad_pub_3510_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }
    public void ad_pub_3530_p(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3530_PDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String frdt             = Util.checkString(req.getParameter("frdt"));
    	String todt             = Util.checkString(req.getParameter("todt"));
    	
    	AD_PUB_3530_PDM dm = new AD_PUB_3530_PDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFr_dt(frdt);
    	dm.setTo_dt(todt);
    	
    	dm.print();
        try {
        	AdPub3500DAO	dao = new AdPub3500DAO();
            ds = dao.ad_pub_3530_p(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }  
    
    public void ad_pub_3550_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3550_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String fr_mon 		= Util.checkString(req.getParameter("fr_mon"));
    	String to_mon 		= Util.checkString(req.getParameter("to_mon"));
    	
    	AD_PUB_3550_LDM dm = new AD_PUB_3550_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFr_mon(fr_mon);
    	dm.setTo_mon(to_mon);
    	
    	dm.print();
        try {
        	AdPub3500DAO	dao = new AdPub3500DAO();
            ds = dao.ad_pub_3550_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }    
}
