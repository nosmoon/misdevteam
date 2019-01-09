/***************************************************************************************************
* 파일명 : AdPub3400WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub3400DAO;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub3400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3400_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	
    	AD_PUB_3400_MDM dm = new AD_PUB_3400_MDM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.print();
        try {
        	AdPub3400DAO	dao = new AdPub3400DAO();
            ds = dao.ad_pub_3400_m(dm);
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
    public void ad_pub_3410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3410_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String proc_dt 			= Util.checkString(req.getParameter("proc_dt"));
    	String proc_seq 		= Util.checkString(req.getParameter("proc_seq"));
    	String medi_cd          = Util.checkString(req.getParameter("medi_cd"));
    	
    	AD_PUB_3410_LDM dm = new AD_PUB_3410_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setProc_seq(proc_seq);
    	dm.print();
        try {
        	AdPub3400DAO	dao = new AdPub3400DAO();
            ds = dao.ad_pub_3410_l(dm);
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
    public void ad_pub_3420_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3420_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd             = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd             = Util.checkString(req.getParameter("medi_cd"));
        String proc_dt             = Util.checkString(req.getParameter("proc_dt"));
        String podr_occr_seq       = Util.checkString(req.getParameter("podr_occr_seq"));
        String podr_occr_dt        = Util.checkString(req.getParameter("podr_occr_dt"));
        String dlco_no             = Util.checkString(req.getParameter("dlco_no"));
        String expct_amt           = Util.checkString(req.getParameter("expct_amt"));
        String slcrg_pers          = Util.checkString(req.getParameter("slcrg_pers"));
        String dept_cd             = Util.checkString(req.getParameter("dept_cd"));
        String mchrg_pers          = Util.checkString(req.getParameter("mchrg_pers"));
        String podr_dt             = Util.checkString(req.getParameter("podr_dt"));    	
    	String incmg_pers          = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip       = req.getRemoteAddr();

    	String flag  		       = Util.checkString(req.getParameter("flag"));
    	String multiUpdateData     = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash             = getHashMultiUpdateData(multiUpdateData);
        System.out.println("multiUpdateData"+req.getParameter("multiUpdateData"));
    	String mode             = Util.checkString((String)hash.get("m"));  
        String occr_arow        = Util.checkString((String)hash.get("arow"));
        String spl_dlco         = Util.checkString((String)hash.get("spl_dlco"));
        String brnd_cd          = Util.checkString((String)hash.get("brnd_cd"));
        String item_nm          = Util.checkString((String)hash.get("item_nm"));
        String podr_cnt         = Util.checkString((String)hash.get("podr_cnt"));
        String podr_uprc        = Util.checkString((String)hash.get("podr_uprc"));
        String podr_amt         = Util.checkString((String)hash.get("podr_amt"));
        String uprc_fee         = Util.checkString((String)hash.get("uprc_fee"));
        String mms_uprc         = Util.checkString((String)hash.get("mms_uprc"));
        String mms_cnt          = Util.checkString((String)hash.get("mms_cnt"));
        String mms_fee          = Util.checkString((String)hash.get("mms_fee"));
        String mms_vat          = Util.checkString((String)hash.get("mms_vat"));
        String div_expct_amt    = Util.checkString((String)hash.get("expct_amt"));

    	AD_PUB_3420_ADM dm = new AD_PUB_3420_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFlag(flag);		
    	dm.setProc_dt(proc_dt);
    	dm.setPodr_occr_seq(podr_occr_seq);
    	dm.setPodr_occr_dt(podr_occr_dt);
    	dm.setDlco_no(dlco_no);
    	dm.setExpct_amt(expct_amt);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setDept_cd(dept_cd);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setPodr_dt(podr_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.setOccr_arow(occr_arow);
    	dm.setSpl_dlco(spl_dlco);
    	dm.setBrnd_cd(brnd_cd);
    	dm.setItem_nm(item_nm);
    	dm.setPodr_cnt(podr_cnt);
    	dm.setPodr_uprc(podr_uprc);
    	dm.setPodr_amt(podr_amt);
    	dm.setUprc_fee(uprc_fee);
    	dm.setMms_uprc(mms_uprc);
    	dm.setMms_cnt(mms_cnt);
    	dm.setMms_fee(mms_fee);
    	dm.setMms_vat(mms_vat);
    	dm.setDiv_expct_amt(div_expct_amt);
    	
    	dm.print();

        try {
        	AdPub3400DAO	dao = new AdPub3400DAO();
            ds = dao.ad_pub_3420_a(dm);
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
    public void ad_pub_3430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3430_ADataSet ds = null;

        // DM Setting
    	String flag          = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd       = Util.checkString(req.getParameter("medi_cd"));
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData2"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode             = Util.checkString((String)hash.get("m"));    
    	String exct_dt          = Util.checkString((String)hash.get("exct_dt")); 
    	String exct_seq         = Util.checkString((String)hash.get("exct_seq"));
    	String fee_rate         = Util.checkString((String)hash.get("fee_rate"));
    	String fee              = Util.checkString((String)hash.get("fee"));
    	String fee_vat          = Util.checkString((String)hash.get("fee_vat"));
    	String tot_fee          = Util.checkString((String)hash.get("tot_fee"));
    	String exct_uprc        = Util.checkString((String)hash.get("exct_uprc"));
    	String exct_cnt         = Util.checkString((String)hash.get("exct_cnt"));
    	String exct_amt         = Util.checkString((String)hash.get("exct_amt"));
    	String cntrct_yn        = Util.checkString((String)hash.get("cntrct_yn"));
    	String podr_slip_no     = Util.checkString((String)hash.get("podr_slip_no"));
    	String easy_amt         = Util.checkString((String)hash.get("easy_amt"));
    	String sale_amt         = Util.checkString((String)hash.get("sale_amt"));
    	
    	AD_PUB_3430_ADM dm = new AD_PUB_3430_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFlag(flag);
//    	dm.setMode(mode.toUpperCase());
    	dm.setExct_dt(exct_dt); 
    	dm.setExct_seq(exct_seq);
    	dm.setFee_rate(fee_rate);
    	dm.setFee(fee);
    	dm.setFee_vat(fee_vat);
    	dm.setTot_fee(tot_fee);
    	dm.setExct_uprc(exct_uprc);
    	dm.setExct_cnt(exct_cnt);
    	dm.setExct_amt(exct_amt);
    	dm.setCntrct_yn(cntrct_yn);
    	dm.setPodr_slip_no(podr_slip_no);
    	dm.setEasy_amt(easy_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setSale_amt(sale_amt);
    	
    	dm.print();

        try {
        	AdPub3400DAO	dao = new AdPub3400DAO();
            ds = dao.ad_pub_3430_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }       
}
