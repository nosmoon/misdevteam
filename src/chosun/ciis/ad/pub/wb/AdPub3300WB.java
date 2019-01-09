/***************************************************************************************************
* 파일명 : AdPub3300WB.java
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
import chosun.ciis.ad.pub.dao.AdPub3300DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_3310_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_3330_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_3350_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_3310_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3330_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3350_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub3300WB extends BaseWB {
		
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String frdt 			= Util.checkString(req.getParameter("frdt"));
    	String todt 			= Util.checkString(req.getParameter("todt"));
    	String dlco_nm          = Util.checkString(req.getParameter("dlco_nm"));
    	String item_nm   		= Util.checkString(req.getParameter("item_nm"));
    	String spl_dlco         = Util.checkString(req.getParameter("spl_dlco"));
    	String proc_dt    		= Util.checkString(req.getParameter("proc_dt"));
    	String podr_ym		    = Util.checkString(req.getParameter("pord_ym"));
    	String sch_clsf		    = Util.checkString(req.getParameter("sch_clsf"));
    	
    	AD_PUB_3310_LDM dm = new AD_PUB_3310_LDM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_nm(dlco_nm);
    	dm.setItem_nm(item_nm);
    	dm.setSpl_dlco(spl_dlco);
    	dm.setProc_dt(proc_dt);
    	dm.setPodr_ym(podr_ym);
    	dm.setSch_clsf(sch_clsf);
    	
    	dm.print();
        try {
        	AdPub3300DAO	dao = new AdPub3300DAO();
            ds = dao.ad_pub_3310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 
    
    public void ad_pub_3330_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3330_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String flag  		   = Util.checkString(req.getParameter("flag"));
    	String proc_dt 		   = Util.checkString(req.getParameter("proc_dt"));
    	String podr_ym 		   = Util.checkString(req.getParameter("podr_ym"));
    	String job_clsf		   = Util.checkString(req.getParameter("job_clsf"));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
    	String occr_dt         = Util.checkString((String)hash.get("occr_dt"));
    	String occr_seq		   = Util.checkString((String)hash.get("occr_seq"));

        
    	AD_PUB_3330_ADM dm = new AD_PUB_3330_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFlag(flag);
    	dm.setProc_dt(proc_dt);
    	dm.setPodr_ym(podr_ym);
    	dm.setOccr_dt(occr_dt);
    	dm.setOccr_seq(occr_seq);
    	dm.setJob_clsf(job_clsf);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdPub3300DAO	dao = new AdPub3300DAO();
            ds = dao.ad_pub_3330_a(dm);
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
    public void ad_pub_3350_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3350_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	//String flag  		   = Util.checkString(req.getParameter("flag"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
    	String mode             = Util.checkString((String)hash.get("m"));
        String podr_ym          = Util.checkString((String)hash.get("podr_ym"));
        String podr_clsf        = Util.checkString((String)hash.get("podr_clsf"));
        String spl_dlco         = Util.checkString((String)hash.get("spl_dlco"));
        String spl_dlco_nm      = Util.checkString((String)hash.get("spl_dlco_nm"));
        String dlco_no          = Util.checkString((String)hash.get("dlco_no"));
        String dlco_nm          = Util.checkString((String)hash.get("dlco_nm"));
        String brnd_nm          = Util.checkString((String)hash.get("brnd_nm"));
        String item_nm          = Util.checkString((String)hash.get("item_nm"));
        String podr_cnt         = Util.checkString((String)hash.get("podr_cnt"));
        String podr_uprc        = Util.checkString((String)hash.get("podr_uprc"));
        String podr_amt         = Util.checkString((String)hash.get("podr_amt"));
        String ccon_fee         = Util.checkString((String)hash.get("ccon_fee"));
        String ex_sale_fee      = Util.checkString((String)hash.get("ex_sale_fee"));
        String mms              = Util.checkString((String)hash.get("mms"));
        //String exct_tot_cnt     = Util.checkString((String)hash.get("exct_tot_cnt"));
        //String exct_cnt2        = Util.checkString((String)hash.get("exct_cnt2"));
        //String exct_cnt1        = Util.checkString((String)hash.get("exct_cnt1"));
        String exct_cnt         = Util.checkString((String)hash.get("exct_cnt"));
        String exct_uprc        = Util.checkString((String)hash.get("exct_uprc"));
        String exct_amt         = Util.checkString((String)hash.get("exct_amt"));
        String m_amt            = Util.checkString((String)hash.get("m_amt"));
        String easy_amt         = Util.checkString((String)hash.get("easy_amt"));
        String medi_fee         = Util.checkString((String)hash.get("medi_fee"));
        String ex_buy_fee         = Util.checkString((String)hash.get("ex_buy_fee"));
        String occr_dt          = Util.checkString((String)hash.get("occr_dt"));
        String occr_seq         = Util.checkString((String)hash.get("occr_seq"));
        String key              = Util.checkString((String)hash.get("key"));
        
    	AD_PUB_3350_ADM dm = new AD_PUB_3350_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	//dm.setFlag(flag);
    	dm.setMode(mode);
        dm.setPodr_ym(podr_ym);
        dm.setPodr_clsf(podr_clsf);
        dm.setSpl_dlco(spl_dlco);
        dm.setSpl_dlco_nm(spl_dlco_nm);
        dm.setDlco_no(dlco_no);
        dm.setDlco_nm(dlco_nm);
        dm.setBrnd_nm(brnd_nm);
        dm.setItem_nm(item_nm);
        dm.setPodr_cnt(podr_cnt);
        dm.setPodr_uprc(podr_uprc);
        dm.setPodr_amt(podr_amt);
        dm.setCcon_fee(ccon_fee);
        //dm.setExct_tot_cnt(exct_tot_cnt);
        //dm.setExct_cnt2(exct_cnt2);
        //dm.setExct_cnt1(exct_cnt1);
        dm.setExct_cnt(exct_cnt);
        dm.setExct_uprc(exct_uprc);
        dm.setExct_amt(exct_amt);
        dm.setEx_sale_fee(ex_sale_fee);
        dm.setMms(mms);
        dm.setM_amt(m_amt);
        dm.setEasy_amt(easy_amt);
        dm.setMedi_fee (medi_fee );
        dm.setEx_buy_fee(ex_buy_fee);
        dm.setOccr_dt(occr_dt);
        dm.setOccr_seq(occr_seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setKey(key);
    	
    	dm.print();

        try {
        	AdPub3300DAO	dao = new AdPub3300DAO();
            ds = dao.ad_pub_3350_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }   
}
