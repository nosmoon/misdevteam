/***************************************************************************************************
* 파일명 : AdNmd5200WB.java
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
import chosun.ciis.ad.nmd.dao.AdNmd5200DAO;
import chosun.ciis.ad.nmd.dm.AD_NMD_5200_MDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_5210_LDM;
import chosun.ciis.ad.nmd.ds.AD_NMD_5200_MDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_5210_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdNmd5200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_5200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_5200_MDataSet ds = null;

        // DM Setting
    	AD_NMD_5200_MDM dm = new AD_NMD_5200_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.print();
    	
        try {
        	AdNmd5200DAO	dao = new AdNmd5200DAO();
            ds = dao.ad_nmd_5200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdNmd5200EJBHome home = (AdNmd5200EJBHome) JNDIManager.getInstance().getHome("AdNmd5200EJB");
//        try {
//        	AdNmd5200EJB ejb = home.create();
//            ds = ejb.ad_nmd_5200_m(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_5210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_5210_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String pubc_frdt 	= Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt 	= Util.checkString(req.getParameter("pubc_todt"));
    	String make_frdt 	= Util.checkString(req.getParameter("make_frdt"));
    	String make_todt 	= Util.checkString(req.getParameter("make_todt"));
    	String pre_issu_yn 	= Util.checkString(req.getParameter("pre_issu_yn"));
    	String elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
    	String acct_cd 		= Util.getSessionParameterValue(req, "uid", true);
    	String emp_no 		= Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_NMD_5210_LDM dm = new AD_NMD_5210_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	dm.setMake_frdt(make_frdt);
    	dm.setMake_todt(make_todt);
    	dm.setPre_issu_yn(pre_issu_yn);
    	dm.setElec_tax_bill_yn(elec_tax_bill_yn);
    	dm.setAcct_cd(acct_cd);
    	dm.setEmp_no(emp_no);
        
    	//dm.print();

        try {
        	AdNmd5200DAO	dao = new AdNmd5200DAO();
            ds = dao.ad_nmd_5210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdNmd5200EJBHome home = (AdNmd5200EJBHome) JNDIManager.getInstance().getHome("AdNmd5200EJB");
//        try {
//        	AdNmd5200EJB ejb = home.create();
//            ds = ejb.ad_nmd_5210_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    
}
