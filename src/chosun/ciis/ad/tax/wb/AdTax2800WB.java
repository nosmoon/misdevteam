/***************************************************************************************************
* 파일명 : AdTax2800WB.java
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

package chosun.ciis.ad.tax.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.tax.dao.AdTax2800DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2800_MDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2800_MDataSet;
import chosun.ciis.ad.tax.dm.AD_TAX_2810_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2810_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax2800WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2800_MDataSet ds = null;

        // DM Setting
    	AD_TAX_2800_MDM dm = new AD_TAX_2800_MDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);

        try {
        	AdTax2800DAO	dao = new AdTax2800DAO();
            ds = dao.ad_tax_2800_m(dm);
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
    public void ad_tax_2810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2810_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String pubc_frdt 	= Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt 	= Util.checkString(req.getParameter("pubc_todt"));
    	String make_frdt 	= Util.checkString(req.getParameter("make_frdt"));
    	String make_todt 	= Util.checkString(req.getParameter("make_todt"));
    	//String acct_cd 		= Util.getSessionParameterValue(req, "uid", true);
    	String emp_no 		= Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_TAX_2810_LDM dm = new AD_TAX_2810_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	dm.setMake_frdt(make_frdt);
    	dm.setMake_todt(make_todt);
    	dm.setEmp_no(emp_no);
        
    	dm.print();

        try {
        	AdTax2800DAO	dao = new AdTax2800DAO();
            ds = dao.ad_tax_2810_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }
}
