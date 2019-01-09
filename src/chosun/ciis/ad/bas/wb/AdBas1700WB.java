/***************************************************************************************************
* 파일명 : .java
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

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1700DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1710_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1720_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1710_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1720_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1700WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1710_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1710_SDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String srch_clsf = Util.checkString(req.getParameter("srch_clsf"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


        // DM Setting
    	AD_BAS_1710_SDM dm = new AD_BAS_1710_SDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setBasi_dt(basi_dt);
    	dm.setSrch_clsf(srch_clsf);
        
    	dm.print();
    	
        try {
        	AdBas1700DAO dao = new AdBas1700DAO();
            ds = dao.ad_bas_1710_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }       	
//    	AdBas1700EJBHome home = (AdBas1700EJBHome) JNDIManager.getInstance().getHome("AdBas1700EJB");
//        try {
//        	AdBas1700EJB ejb = home.create();
//            ds = ejb.ad_bas_1710_s(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
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
    public void ad_bas_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1720_ADataSet ds = null;
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  		= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


    	String flag 			= Util.checkString(req.getParameter("flag"));
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	String basi_dt 			= Util.checkString(req.getParameter("basi_dt"));
    	String dlco_clsf		= Util.checkString(req.getParameter("dlco_clsf"));
    	String prvmm_unrcp_amt 	= Util.checkString(req.getParameter("prvmm_unrcp_amt"));
    	String thmm_unrcp_amt	= Util.checkString(req.getParameter("thmm_unrcp_amt"));
    	String unrcp_tot_amt 	= Util.checkString(req.getParameter("unrcp_tot_amt"));
    	String un_repay_dhon_bal = Util.checkString(req.getParameter("un_repay_dhon_bal"));
    	String mang_expt_ufth_bond_amt = Util.checkString(req.getParameter("mang_expt_ufth_bond_amt"));
    	String busn_expt_ufth_bond_amt = Util.checkString(req.getParameter("busn_expt_ufth_bond_amt"));
    	String mang_dr_stot = Util.checkString(req.getParameter("mang_dr_stot"));
    	String busn_dr_stot = Util.checkString(req.getParameter("busn_dr_stot"));
    	String mortg_amt = Util.checkString(req.getParameter("mortg_amt"));
    	String un_pay_fee = Util.checkString(req.getParameter("un_pay_fee"));
    	String precpt_amt = Util.checkString(req.getParameter("precpt_amt"));
    	String acml_amt = Util.checkString(req.getParameter("acml_amt"));
    	String etc_mortg_amt = Util.checkString(req.getParameter("etc_mortg_amt"));
    	String dng_stot = Util.checkString(req.getParameter("dng_stot"));
    	String mang_mortg_surp_amt = Util.checkString(req.getParameter("mang_mortg_surp_amt"));
    	String busn_mortg_surp_amt = Util.checkString(req.getParameter("busn_mortg_surp_amt"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_opn = Util.checkString(req.getParameter("mchrg_opn"));
    	String slcrg_opn = Util.checkString(req.getParameter("slcrg_opn"));
    	String cover_note = Util.checkString(req.getParameter("cover_note"));
    	String advcs_note = Util.checkString(req.getParameter("advcs_note"));
    	String dhon_note = Util.checkString(req.getParameter("dhon_note"));
    	
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash 			= getHashMultiUpdateData(multiUpdateData);
    	
    	String seq 			= Util.checkString((String)hash.get("seq"));
    	String mang_chce_yn = Util.checkString((String)hash.get("mang_chce_yn"));
    	String busn_chce_yn = Util.checkString((String)hash.get("busn_chce_yn"));
    	String dhon_chce_yn = Util.checkString((String)hash.get("dhon_chce_yn"));
    	String issu_pers 	= Util.checkString((String)hash.get("issu_pers_nm"));
    	String mtry_dt 		= Util.checkString((String)hash.get("mtry_dt"));
    	String amt 			= Util.checkString((String)hash.get("note_amt"));
    	String note_no 		= Util.checkString((String)hash.get("note_no"));
    	String note_stat 	= Util.checkString((String)hash.get("now_note_stat_nm"));
    	String bank_cd 		= Util.checkString((String)hash.get("bank_cd"));
    	String note_seq 	= Util.checkString((String)hash.get("note_seq"));

        // DM Setting
    	AD_BAS_1720_ADM dm = new AD_BAS_1720_ADM();
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDlco_no(dlco_no);  
    	dm.setBasi_dt(basi_dt);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setPrvmm_unrcp_amt(prvmm_unrcp_amt);
    	dm.setThmm_unrcp_amt(thmm_unrcp_amt);
    	dm.setUnrcp_tot_amt(unrcp_tot_amt);
    	dm.setUn_repay_dhon_bal(un_repay_dhon_bal);
    	dm.setMang_expt_ufth_bond_amt(mang_expt_ufth_bond_amt);
    	dm.setBusn_expt_ufth_bond_amt(busn_expt_ufth_bond_amt);
    	dm.setMang_dr_stot(mang_dr_stot);
    	dm.setBusn_dr_stot(busn_dr_stot);
    	dm.setMortg_amt(mortg_amt);
    	dm.setUn_pay_fee(un_pay_fee);
    	dm.setPrecpt_amt(precpt_amt);
    	dm.setAcml_amt(acml_amt);
    	dm.setEtc_mortg_amt(etc_mortg_amt);
    	dm.setDng_stot(dng_stot);
    	dm.setMang_mortg_surp_amt(mang_mortg_surp_amt);
    	dm.setBusn_mortg_surp_amt(busn_mortg_surp_amt);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_opn(mchrg_opn);
    	dm.setSlcrg_opn(slcrg_opn);
    	dm.setCover_note(cover_note);
    	dm.setAdvcs_note(advcs_note);
    	dm.setDhon_note(dhon_note);
    	dm.setSeq(seq);
    	dm.setMang_chce_yn(mang_chce_yn);
    	dm.setBusn_chce_yn(busn_chce_yn);
    	dm.setDhon_chce_yn(dhon_chce_yn);
    	dm.setIssu_pers(issu_pers);
    	dm.setMtry_dt(mtry_dt);
    	dm.setAmt(amt);
    	dm.setNote_no(note_no);
    	dm.setNote_stat(note_stat);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_seq(note_seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
        
    	dm.print();
    	
        try {
        	AdBas1700DAO dao = new AdBas1700DAO();
            ds = dao.ad_bas_1720_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
        
//    	AdBas1700EJBHome home = (AdBas1700EJBHome) JNDIManager.getInstance().getHome("AdBas1700EJB");
//        try {
//        	AdBas1700EJB ejb = home.create();
//            ds = ejb.ad_bas_1720_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }     
}
