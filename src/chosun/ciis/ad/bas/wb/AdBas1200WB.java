/***************************************************************************************************
* 파일명 : AdBas1100WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1200DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1210_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1220_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1230_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1210_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1220_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1230_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1210_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1210_LDM dm = new AD_BAS_1210_LDM();

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String cntr_yymm 	= Util.checkString(req.getParameter("cntr_yymm"));
    	String dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers 	= Util.checkString(req.getParameter("mchrg_pers"));
    	String pre_yn 		= Util.checkString(req.getParameter("pre_yn"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setCntr_yymm(cntr_yymm);
        dm.setDlco_clsf(dlco_clsf);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setMchrg_pers(mchrg_pers);
        dm.setPre_yn(pre_yn);
                 
        dm.print();
        
        try {
        	AdBas1200DAO dao = new AdBas1200DAO();
            ds = dao.ad_bas_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }        
//        AdBas1200EJBHome home = (AdBas1200EJBHome) JNDIManager.getInstance().getHome("AdBas1200EJB");
//        try {
//        	AdBas1200EJB ejb = home.create();
//            ds = ejb.ad_bas_1210_l(dm);
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
    public void ad_bas_1220_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1220_SDataSet ds = null;

        // DM Setting
    	AD_BAS_1220_SDM dm = new AD_BAS_1220_SDM();

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String cntr_seq 	= Util.checkString(req.getParameter("cntr_seq"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        dm.setCntr_seq(cntr_seq);
        
        //dm.print();
        try {
        	AdBas1200DAO dao = new AdBas1200DAO();
            ds = dao.ad_bas_1220_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
        
//        AdBas1200EJBHome home = (AdBas1200EJBHome) JNDIManager.getInstance().getHome("AdBas1200EJB");
//        try {
//        	AdBas1200EJB ejb = home.create();
//            ds = ejb.ad_bas_1220_s(dm);
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
    public void ad_bas_1230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1230_ADataSet ds = null;


    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag 		= Util.checkString(req.getParameter("flag"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String cntr_seq 	= Util.checkString(req.getParameter("cntr_seq"));
    	String dlco_nm 		= Util.checkString(req.getParameter("dlco_nm"));
    	String cntr_dt 		= Util.checkString(req.getParameter("cntr_dt"));
    	String remk 		= Util.checkString(req.getParameter("remk"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String slcrg_opn 	= Util.checkString(req.getParameter("slcrg_opn"));
    	String mchrg_pers 	= Util.checkString(req.getParameter("mchrg_pers"));
    	String mchrg_opn 	= Util.checkString(req.getParameter("mchrg_opn"));
    	String taem_chf_opn = Util.checkString(req.getParameter("taem_chf_opn"));
    	String colt_amt = Util.checkString(req.getParameter("colt_amt"));
    	String mm_avg_pubc_amt = Util.checkString(req.getParameter("mm_avg_pubc_amt"));
    	String colt_ratio = Util.checkString(req.getParameter("colt_ratio"));
    	String avg_due_dd = Util.checkString(req.getParameter("avg_due_dd"));
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip 	= req.getRemoteAddr();

        // DM Setting
    	AD_BAS_1230_ADM dm = new AD_BAS_1230_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setCntr_seq(cntr_seq);
    	dm.setDlco_nm(dlco_nm);
    	dm.setCntr_dt(cntr_dt);
    	dm.setColt_amt(colt_amt);
    	dm.setMm_avg_pubc_amt(mm_avg_pubc_amt);
    	dm.setColt_ratio(colt_ratio);
    	dm.setAvg_due_dd(avg_due_dd);
    	dm.setRemk(remk);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setSlcrg_opn(slcrg_opn);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setMchrg_opn(mchrg_opn);
    	dm.setTaem_chf_opn(taem_chf_opn);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
          
        try {
        	AdBas1200DAO dao = new AdBas1200DAO();
            ds = dao.ad_bas_1230_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }         
//        AdBas1200EJBHome home = (AdBas1200EJBHome) JNDIManager.getInstance().getHome("AdBas1200EJB");
//        try {
//        	AdBas1200EJB ejb = home.create();
//            ds = ejb.ad_bas_1230_a(dm);
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
