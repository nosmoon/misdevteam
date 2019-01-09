/***************************************************************************************************
* 파일명 : AdNmd1000WB.java
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

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.sql.CallableStatement;
import java.sql.SQLException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;

import chosun.ciis.ad.nmd.dao.AdNmd1000DAO;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdNmd1000WB extends BaseWB {
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_1010_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager        = null; //ERP
       	CallableStatement cstmt  = null;

       	AD_NMD_1010_ADataSet ds = null;
       	AD_NMD_1010_ADM dm = new AD_NMD_1010_ADM();
       	
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip    = req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);   
    	
    	String[] mode             = Util.checkString((String)hash.get("m")).split("#");
    	String[] order_no         = Util.checkString((String)hash.get("order_no")).split("#");
    	String[] prdct_cd         = Util.checkString((String)hash.get("prdct_cd")).split("#");
    	String[] sell_dt          = Util.checkString((String)hash.get("sell_dt")).split("#");
    	String[] adjst_clsf       = Util.checkString((String)hash.get("adjst_clsf")).split("#");
    	String[] tax_clsf         = Util.checkString((String)hash.get("tax_clsf")).split("#");
    	String[] order_tot_amt    = Util.checkString((String)hash.get("order_tot_amt")).split("#");
    	String[] coupon_tot_amt   = Util.checkString((String)hash.get("coupon_tot_amt")).split("#");
    	String[] sttlmnt_tot_amt  = Util.checkString((String)hash.get("sttlmnt_tot_amt")).split("#");
    	String[] crdit_card_amt   = Util.checkString((String)hash.get("crdit_card_amt")).split("#");
    	String[] trnsf_amt        = Util.checkString((String)hash.get("trnsf_amt")).split("#");
    	String[] cphone_amt       = Util.checkString((String)hash.get("cphone_amt")).split("#");
    	String[] nbankbok_amt     = Util.checkString((String)hash.get("nbankbok_amt")).split("#");
    	String[] public_tot_amt   = Util.checkString((String)hash.get("public_tot_amt")).split("#");
    	String[] point_amt        = Util.checkString((String)hash.get("point_amt")).split("#");
    	String[] point_tot_amt    = Util.checkString((String)hash.get("point_tot_amt")).split("#");
    	String[] ncash_web_amt    = Util.checkString((String)hash.get("ncash_web_amt")).split("#");
    	String[] cash_web_amt     = Util.checkString((String)hash.get("cash_web_amt")).split("#");
    	String[] gift_amt         = Util.checkString((String)hash.get("gift_amt")).split("#");
    	String[] web_tot_amt      = Util.checkString((String)hash.get("web_tot_amt")).split("#");
    	String[] tot_amt          = Util.checkString((String)hash.get("tot_amt")).split("#");
    	String[] suply_amt        = Util.checkString((String)hash.get("suply_amt")).split("#");
    	String[] vat_amt          = Util.checkString((String)hash.get("vat_amt")).split("#");
    	String[] p_suply_amt      = Util.checkString((String)hash.get("p_suply_amt")).split("#");
    	String[] p_vat_amt        = Util.checkString((String)hash.get("p_vat_amt")).split("#");
    	String[] w_suply_amt      = Util.checkString((String)hash.get("w_suply_amt")).split("#");
    	String[] w_vat_amt    	  = Util.checkString((String)hash.get("w_vat_amt")).split("#");
    	String[] suply_tot_amt    = Util.checkString((String)hash.get("suply_tot_amt")).split("#");
    	String[] vat_tot_amt      = Util.checkString((String)hash.get("vat_tot_amt")).split("#");
    	String[] demand_dlco_no   = Util.checkString((String)hash.get("demand_dlco_no")).split("#");
    	String[] demand_dlco_nm   = Util.checkString((String)hash.get("demand_dlco_nm")).split("#");
    	String[] adjst_amt        = Util.checkString((String)hash.get("adjst_amt")).split("#");
    	System.out.println("try 실행전");
    	try {
			//0.DB연결
	    	manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	for( int row=0; row<order_no.length; row++){
	        	// DM Setting
	        	dm.setCmpy_cd(cmpy_cd);
	        	dm.setMode(mode[row]);
	        	dm.setOrder_no(order_no[row]);
	        	dm.setPrdct_cd(prdct_cd[row]);
	        	dm.setSell_dt(sell_dt[row]);
//	        	System.out.println("order_no[row]::"+order_no[row]);
//	        	System.out.println("prdct_cd[row]::"+prdct_cd[row]);
//	        	System.out.println("sell_dt[row]::"+sell_dt[row]);
	        	dm.setAdjst_clsf(adjst_clsf[row]);
	        	dm.setTax_clsf(tax_clsf[row]);
	        	dm.setOrder_tot_amt(order_tot_amt[row]);
	        	dm.setCoupon_tot_amt(coupon_tot_amt[row]);
	        	dm.setSttlmnt_tot_amt(sttlmnt_tot_amt[row]);
	        	dm.setCrdit_card_amt(crdit_card_amt[row]);
	        	dm.setTrnsf_amt(trnsf_amt[row]);
	        	dm.setCphone_amt(cphone_amt[row]);
	        	dm.setNbankbok_amt(nbankbok_amt[row]);
	        	dm.setPublic_tot_amt(public_tot_amt[row]);
	        	dm.setPoint_amt(point_amt[row]);
	        	dm.setPoint_tot_amt(point_tot_amt[row]);
	        	dm.setNcash_web_amt(ncash_web_amt[row]);
	        	dm.setCash_web_amt(cash_web_amt[row]);
	        	dm.setGift_amt(gift_amt[row]);
	        	dm.setWeb_tot_amt(web_tot_amt[row]);
	        	dm.setTot_amt(tot_amt[row]);
	        	dm.setSuply_amt(suply_amt[row]);
	        	dm.setVat_amt(vat_amt[row]);
	        	dm.setP_suply_amt(p_suply_amt[row]);
	        	dm.setP_vat_amt(p_vat_amt[row]);//
	        	dm.setW_suply_amt(w_suply_amt[row]);
	        	dm.setW_vat_amt(w_vat_amt[row]);
	        	dm.setSuply_tot_amt(suply_tot_amt[row]);
	        	dm.setVat_tot_amt(vat_tot_amt[row]);
	        	dm.setDemand_dlco_no(demand_dlco_no[row]);
	        	dm.setDemand_dlco_nm(demand_dlco_nm[row]);
	        	dm.setAdjst_amt(adjst_amt[row]);
	        	dm.setIncmg_pers_ip(incmg_pers_ip);
	        	dm.setIncmg_pers(incmg_pers);
	        	//dm.print();
	       		
				cstmt = manager.m_conn.prepareCall(dm.getSQL());
		       	// 파라미터 설정
		       	dm.setParams(cstmt,dm);
		       	// 실행
		       	cstmt.execute();		       		
		        System.out.println("AD_NMD_1010_ADataSet 실행전");	
		        // 결과
		       	ds = (AD_NMD_1010_ADataSet) dm.createDataSetObject();
		       	ds.getValues(cstmt);
		       	cstmt.close();
		       	if (!"".equals(ds.errcode)) {
			            throw new AppException(ds.errcode, ds.errmsg);
		        }
	 
		       	manager.commit();	
		    }
		       	
		}
	    catch (AppException e) {
	    	  if (manager != null)
		          manager.rollback();	
             throw e;   
		}catch (SQLException e) {
			if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    
	    req.setAttribute("ds", ds);
 		/*
    	//디비 인서트시 에러 발생    	
    	AD_NMD_1010_ADataSet ds = null;

    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip    = req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);

    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode   		 	= Util.checkString((String)hash.get("m"));
    	String order_no    		= Util.checkString((String)hash.get("order_no"));
    	String prdct_cd    		= Util.checkString((String)hash.get("prdct_cd"));
    	String sell_dt     		= Util.checkString((String)hash.get("sell_dt"));
    	String adjst_clsf    	= Util.checkString((String)hash.get("adjst_clsf"));
    	String tax_clsf    		= Util.checkString((String)hash.get("tax_clsf"));
    	String order_tot_amt    = Util.checkString((String)hash.get("order_tot_amt"));
    	String coupon_tot_amt   = Util.checkString((String)hash.get("coupon_tot_amt"));
    	String sttlmnt_tot_amt  = Util.checkString((String)hash.get("sttlmnt_tot_amt"));
    	String crdit_card_amt   = Util.checkString((String)hash.get("crdit_card_amt"));
    	String trnsf_amt    	= Util.checkString((String)hash.get("trnsf_amt"));
    	String cphone_amt    	= Util.checkString((String)hash.get("cphone_amt"));
    	String nbankbok_amt     = Util.checkString((String)hash.get("nbankbok_amt"));
    	String public_tot_amt   = Util.checkString((String)hash.get("public_tot_amt"));
    	String point_amt    	= Util.checkString((String)hash.get("point_amt"));
    	String point_tot_amt    = Util.checkString((String)hash.get("point_tot_amt"));
    	String ncash_web_amt    = Util.checkString((String)hash.get("ncash_web_amt"));
    	String cash_web_amt     = Util.checkString((String)hash.get("cash_web_amt"));
    	String gift_amt    		= Util.checkString((String)hash.get("gift_amt"));
    	String web_tot_amt      = Util.checkString((String)hash.get("web_tot_amt"));
    	String tot_amt    		= Util.checkString((String)hash.get("tot_amt"));
    	String suply_amt    	= Util.checkString((String)hash.get("suply_amt"));
    	String vat_amt    		= Util.checkString((String)hash.get("vat_amt"));
    	String p_suply_amt      = Util.checkString((String)hash.get("p_suply_amt"));
    	String p_vat_amt    	= Util.checkString((String)hash.get("p_vat_amt"));
    	String w_suply_amt      = Util.checkString((String)hash.get("w_suply_amt"));
    	String w_vat_amt    	= Util.checkString((String)hash.get("w_vat_amt"));
    	String suply_tot_amt    = Util.checkString((String)hash.get("suply_tot_amt"));
    	String vat_tot_amt      = Util.checkString((String)hash.get("vat_tot_amt"));
    	String demand_dlco_no   = Util.checkString((String)hash.get("demand_dlco_no"));
    	String demand_dlco_nm   = Util.checkString((String)hash.get("demand_dlco_nm"));
    	String adjst_amt   		= Util.checkString((String)hash.get("adjst_amt"));
    	System.out.println("2::"+order_no);
    	// DM Setting
    	AD_NMD_1010_ADM dm = new AD_NMD_1010_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMode(mode);
    	dm.setOrder_no(order_no);
    	dm.setPrdct_cd(prdct_cd);
    	dm.setSell_dt(sell_dt);
    	dm.setAdjst_clsf(adjst_clsf);
    	dm.setTax_clsf(tax_clsf);
    	dm.setOrder_tot_amt(order_tot_amt);
    	dm.setCoupon_tot_amt(coupon_tot_amt);
    	dm.setSttlmnt_tot_amt(sttlmnt_tot_amt);
    	dm.setCrdit_card_amt(crdit_card_amt);
    	dm.setTrnsf_amt(trnsf_amt);
    	dm.setCphone_amt(cphone_amt);
    	dm.setNbankbok_amt(nbankbok_amt);
    	dm.setPublic_tot_amt(public_tot_amt);
    	dm.setPoint_amt(point_amt);
    	dm.setPoint_tot_amt(point_tot_amt);
    	dm.setNcash_web_amt(ncash_web_amt);
    	dm.setCash_web_amt(cash_web_amt);
    	dm.setGift_amt(gift_amt);
    	dm.setWeb_tot_amt(web_tot_amt);
    	dm.setTot_amt(tot_amt);
    	dm.setSuply_amt(suply_amt);
    	dm.setVat_amt(vat_amt);
    	dm.setP_suply_amt(p_suply_amt);
    	dm.setP_vat_amt(p_vat_amt);
    	dm.setW_suply_amt(w_suply_amt);
    	dm.setW_vat_amt(w_vat_amt);
    	dm.setSuply_tot_amt(suply_tot_amt);
    	dm.setVat_tot_amt(vat_tot_amt);
    	dm.setDemand_dlco_no(demand_dlco_no);
    	dm.setDemand_dlco_nm(demand_dlco_nm);
    	dm.setAdjst_amt(adjst_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_1010_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
        */
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1010_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_1011_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_1011_ADataSet ds = null;

        // DM Setting
    	AD_NMD_1011_ADM dm = new AD_NMD_1011_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_dt     = Util.checkString(req.getParameter("sell_mm"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_dt(sell_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_1011_a(dm);
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
    public void ad_nmd_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_1020_LDataSet ds = null;
    	
//    	 DM Setting
    	AD_NMD_1020_LDM dm = new AD_NMD_1020_LDM();
    	dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sell_mm    = Util.checkString(req.getParameter("sell_mm"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();


        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_1020_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1010_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_1030_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_1030_ADataSet ds = null;

        // DM Setting
    	AD_NMD_1030_ADM dm = new AD_NMD_1030_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("sell_mm"));
    	String cnt         = Util.checkString(req.getParameter("cnt"));
    	String occr_dt     = Util.checkString(req.getParameter("occr_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
    	dm.setOccr_dt(occr_dt);
    	dm.setCnt(cnt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_1030_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_nmd_1030_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_1040_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_1040_ADataSet ds = null;

        // DM Setting
    	AD_NMD_1040_ADM dm = new AD_NMD_1040_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("sell_mm"));
    	String occr_dt     = Util.checkString(req.getParameter("occr_dt"));
    	String seq_l     = Util.checkString(req.getParameter("seq_l"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
    	dm.setOccr_dt(occr_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);     
    	dm.setSeq_l(seq_l);
       
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_1040_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_nmd_1030_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_1050_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_1050_ADataSet ds = null;

        // DM Setting
    	AD_NMD_1050_ADM dm = new AD_NMD_1050_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("sell_mm"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
       
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_1050_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_nmd_1030_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_1051_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_1051_ADataSet ds = null;

        // DM Setting
    	AD_NMD_1051_ADM dm = new AD_NMD_1051_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("sell_mm"));
    	    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
    	
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_1051_a(dm);
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
    public void ad_nmd_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_2010_LDataSet ds = null;
    	
//    	 DM Setting
    	AD_NMD_2010_LDM dm = new AD_NMD_2010_LDM();
    	dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.adjm_dt    = Util.checkString(req.getParameter("adjm_dt"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();


        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_2010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1010_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_2020_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_2020_ADataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("adjm_dt"));//정산월
    	String pay_dt      = Util.checkString(req.getParameter("pay_dt"));//회계
    	String occr_dt      = Util.checkString(req.getParameter("occr_dt"));//회계
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String checked 		= Util.checkString((String)hash.get("checked"));
    	String exp_yn 		= Util.checkString((String)hash.get("proc_yn"));
    	String dlco_no 		= Util.checkString((String)hash.get("demand_dlco_no"));
    	String dlco_nm 		= Util.checkString((String)hash.get("demand_dlco_nm"));
    	String adjst_amt 	= Util.checkString((String)hash.get("sum_adjst_amt"));
    	//String occr_dt   	= Util.checkString((String)hash.get("slip_occr_dt"));
    	
    	// DM Setting
    	AD_NMD_2020_ADM dm = new AD_NMD_2020_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
    	dm.setPay_dt(pay_dt);
    	dm.setOccr_dt(occr_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 
    	
    	dm.setChecked(checked);
    	dm.setExp_yn(exp_yn);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_nm(dlco_nm);
    	dm.setAdjst_amt(adjst_amt);
       
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_2020_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_nmd_1030_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_2030_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_2030_ADataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("adjm_dt"));//정산월
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String checked 		= Util.checkString((String)hash.get("checked"));
    	String dlco_no 		= Util.checkString((String)hash.get("demand_dlco_no"));
    	String exp_yn 		= Util.checkString((String)hash.get("proc_yn"));
    	String occr_dt 		= Util.checkString((String)hash.get("slip_occr_dt"));
    	String slip_seq 		= Util.checkString((String)hash.get("slip_seq"));

    	// DM Setting
    	AD_NMD_2030_ADM dm = new AD_NMD_2030_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 
    	
    	dm.setChecked(checked);
    	dm.setExp_yn(exp_yn);
    	dm.setDlco_no(dlco_no);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_seq(slip_seq);
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_2030_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_nmd_1030_a(dm);
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
    public void ad_nmd_3010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_3010_LDataSet ds = null;
    	
//    	 DM Setting
    	AD_NMD_3010_LDM dm = new AD_NMD_3010_LDM();
    	dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.adjm_dt    = Util.checkString(req.getParameter("adjm_dt"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();


        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_3010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1010_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_3020_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_3020_ADataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("adjm_dt"));//정산월
    	String pay_dt      = Util.checkString(req.getParameter("pay_dt"));//회계
    	String occr_dt      = Util.checkString(req.getParameter("occr_dt"));//회계
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String checked 		= Util.checkString((String)hash.get("checked"));
    	String setoff_yn    = Util.checkString((String)hash.get("proc_yn"));
    	String dlco_no 		= Util.checkString((String)hash.get("demand_dlco_no"));
    	String dlco_nm 		= Util.checkString((String)hash.get("demand_dlco_nm"));
    	String adjst_amt 	= Util.checkString((String)hash.get("sum_adjst_amt"));
    	//String occr_dt   	= Util.checkString((String)hash.get("slip_occr_dt"));
    	
    	// DM Setting
    	AD_NMD_3020_ADM dm = new AD_NMD_3020_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
    	dm.setPay_dt(pay_dt);
    	dm.setOccr_dt(occr_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 
    	
    	dm.setChecked(checked);
    	dm.setSetoff_yn(setoff_yn);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_nm(dlco_nm);
    	dm.setAdjst_amt(adjst_amt);
       
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_3020_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_nmd_1030_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_3030_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_3030_ADataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sell_mm     = Util.checkString(req.getParameter("adjm_dt"));//정산월
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String checked 		= Util.checkString((String)hash.get("checked"));
    	String dlco_no 		= Util.checkString((String)hash.get("demand_dlco_no"));
    	String setoff_yn	= Util.checkString((String)hash.get("proc_yn"));
    	String occr_dt 		= Util.checkString((String)hash.get("slip_occr_dt"));
    	String seq_l 		= Util.checkString((String)hash.get("slip_seq"));


    	// DM Setting
    	AD_NMD_3030_ADM dm = new AD_NMD_3030_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSell_mm(sell_mm);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 
    	
    	dm.setChecked(checked);
    	dm.setSetoff_yn(setoff_yn);
    	dm.setDlco_no(dlco_no);
        dm.setOccr_dt(occr_dt);
        dm.setSeq_l(seq_l);
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_3030_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_nmd_1030_a(dm);
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
    public void ad_nmd_4000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_4000_MDataSet ds = null;
    	
//    	 DM Setting
    	AD_NMD_4000_MDM dm = new AD_NMD_4000_MDM();
    	dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.clos_yymm  = Util.checkString(req.getParameter("clos_yymm"));
    	dm.work_clsf  = Util.checkString(req.getParameter("work_clsf"));
    	dm.print();


        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4000_m(dm);
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
    public void ad_nmd_4010_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_4010_ADataSet ds = null;
    	
//    	 DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf     = Util.checkString(req.getParameter("work_clsf"));
    	String job_clsf      = Util.checkString(req.getParameter("job_clsf"));
    	String clos_dt       = Util.checkString(req.getParameter("clos_dt"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
    	String mode             = "";
    	String chpn_occr_dt     = "";
    	String chpn_occr_seq    = "";
    	String extn_no          = "";
    	String grp_id           = "";
    	String id               = "";
    	String re_reciv_dt      = "";   	
    	if("C".equals(job_clsf)){
	    	String multiUpdateData     = Util.checkString(req.getParameter("multiUpdateData"));
	    	Hashtable hash             = getHashMultiUpdateData(multiUpdateData);
	
	    	mode             = Util.checkString((String)hash.get("m"));  
	    	chpn_occr_dt     = Util.checkString((String)hash.get("chpn_occr_dt"));
	    	chpn_occr_seq    = Util.checkString((String)hash.get("chpn_occr_seq"));
	    	extn_no          = Util.checkString((String)hash.get("extn_no"));
	    	grp_id           = Util.checkString((String)hash.get("grp_id"));
	    	id               = Util.checkString((String)hash.get("id"));
	    	re_reciv_dt      = Util.checkString((String)hash.get("re_reciv_dt"));
    	}else{
        	mode             = "";
        	chpn_occr_dt     = "";
        	chpn_occr_seq    = "";
        	extn_no          = "";
        	grp_id           = "";
        	id               = "";
        	re_reciv_dt      = "";
    	
    	}
    	AD_NMD_4010_ADM dm = new AD_NMD_4010_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setJob_clsf(job_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);     	
    	dm.setChpn_occr_dt(chpn_occr_dt);
    	dm.setChpn_occr_seq(chpn_occr_seq);
    	dm.setExtn_no(extn_no);
    	dm.setGrp_id(grp_id);
    	dm.setId(id);
    	dm.setRe_reciv_dt(re_reciv_dt);
    	dm.print();


        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4010_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4020_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4020_LDataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("work_clsf"));
    	String chpn_dt      = Util.checkString(req.getParameter("chpn_dt"));
 
    	
    	// DM Setting
    	AD_NMD_4020_LDM dm = new AD_NMD_4020_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setChpn_dt(chpn_dt);; 
      
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4020_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 
    public void ad_nmd_4021_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4021_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd       = Util.checkString(req.getParameter("medi_cd"));
    	String flag       = Util.checkString(req.getParameter("flag")); 
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);    	

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);      	

    	String occr_dt  	= Util.checkString((String)hash.get("chpn_occr_dt"));
    	String occr_seq		= Util.checkString((String)hash.get("chpn_occr_seq"));
    	String canc_yn 	    = Util.checkString((String)hash.get("canc_yn"));
    	String tax_clsf 	= Util.checkString((String)hash.get("tax_clsf"));
    	String advt_yn  	= Util.checkString((String)hash.get("advt_yn"));
    	String readr_nm  	= Util.checkString((String)hash.get("readr_nm"));
    	String read_fr_dt	= Util.checkString((String)hash.get("read_fr_dt"));
    	String stplt_time  	= Util.checkString((String)hash.get("stplt_time"));
    	String sale_amt  	= Util.checkString((String)hash.get("sale_amt"));
    	String dlco_no  	= Util.checkString((String)hash.get("dlco_no"));
    	String extn_no  	= Util.checkString((String)hash.get("extn_no"));
    	String grp_id   	= Util.checkString((String)hash.get("grp_id"));
    	String id       	= Util.checkString((String)hash.get("id"));
    	String re_reciv_dt 	= Util.checkString((String)hash.get("re_reciv_dt"));
    	String old_occr_dt 	= Util.checkString((String)hash.get("old_occr_dt"));

    	// DM Setting
    	AD_NMD_4021_ADM dm = new AD_NMD_4021_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFlag(flag);
    	dm.setOccr_dt(occr_dt);
    	dm.setOccr_seq(occr_seq);
    	dm.setCanc_yn(canc_yn);
    	dm.setTax_clsf(tax_clsf);
    	dm.setAdvt_yn(advt_yn);
    	dm.setReadr_nm(readr_nm);
    	dm.setRead_fr_dt(read_fr_dt);
    	dm.setStplt_time(stplt_time);
    	dm.setSale_amt(sale_amt);
    	dm.setDlco_no(dlco_no);
    	dm.setExtn_no(extn_no);
    	dm.setGrp_id(grp_id);
    	dm.setId(id);
    	dm.setRe_reciv_dt(re_reciv_dt);
    	dm.setOld_occr_dt(old_occr_dt);
    	dm.setIncmg_pers(incmg_pers); 

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4021_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4030_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4030_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf     = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt       = Util.checkString(req.getParameter("clos_dt"));
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_NMD_4030_ADM dm = new AD_NMD_4030_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4030_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4040_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4040_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf     = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt       = Util.checkString(req.getParameter("clos_dt"));   	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_NMD_4040_ADM dm = new AD_NMD_4040_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);   	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4040_a(dm); 
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }
    public void ad_nmd_4061_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4061_LDataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt      = Util.checkString(req.getParameter("clos_dt"));

    	
    	// DM Setting
    	AD_NMD_4061_LDM dm = new AD_NMD_4061_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);; 
      
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4061_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 
    public void ad_nmd_4062_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4062_ADataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt      = Util.checkString(req.getParameter("clos_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);

    	// DM Setting
    	AD_NMD_4062_ADM dm = new AD_NMD_4062_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);; 
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setIncmg_dept_cd(incmg_dept_cd);

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4062_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4063_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4063_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf     = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt       = Util.checkString(req.getParameter("clos_dt"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_NMD_4063_ADM dm = new AD_NMD_4063_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4063_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 
    public void ad_nmd_4070_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4070_LDataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String fr_dt       = Util.checkString(req.getParameter("fr_dt"));
    	String to_dt       = Util.checkString(req.getParameter("to_dt"));
    	String select_dt   = Util.checkString(req.getParameter("select_dt"));
    	String medi_cd     = Util.checkString(req.getParameter("medi_cd"));

    	
    	// DM Setting
    	AD_NMD_4070_LDM dm = new AD_NMD_4070_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFr_dt(fr_dt);
    	dm.setTo_dt(to_dt);
    	dm.setSelect_dt(select_dt);
    	dm.setMedi_cd(medi_cd);; 
      
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4070_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }  
    
    public void ad_nmd_4080_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_NMD_4080_MDataSet ds = null;
    	
//    	 DM Setting
    	AD_NMD_4080_MDM dm = new AD_NMD_4080_MDM();
    	dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.print();


        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4080_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
    }    
    public void ad_nmd_4081_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4081_LDataSet ds = null;

    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd   = Util.checkString(req.getParameter("medi_cd"));
    	String frdt      = Util.checkString(req.getParameter("frdt"));
    	String todt      = Util.checkString(req.getParameter("todt"));
    	String agn      = Util.checkString(req.getParameter("agn"));

    	
    	// DM Setting
    	AD_NMD_4081_LDM dm = new AD_NMD_4081_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setAgn(agn);

      
        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4081_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 
    public void ad_nmd_4082_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4082_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd       = Util.checkString(req.getParameter("medi_cd")); 
    	String flag          = Util.checkString(req.getParameter("flag"));
    	String slip_occr_dt  = Util.checkString(req.getParameter("occr_dt"));
    	String slip_seq      = Util.checkString(req.getParameter("seq"));
    	String make_dt       = Util.checkString(req.getParameter("make_dt"));
    	String agn           = Util.checkString(req.getParameter("agn"));
    	String agn_nm        = Util.checkString(req.getParameter("agn_nm"));
    	String fee           = Util.checkString(req.getParameter("fee"));
    	String fee_vat       = Util.checkString(req.getParameter("fee_vat"));
    	String tot_fee       = Util.checkString(req.getParameter("tot_fee"));
    	String semuro_no     = Util.checkString(req.getParameter("semuro_no"));
    	String tax_item      = Util.checkString(req.getParameter("tax_item"));
    	String tax_stmt_no   = Util.checkString(req.getParameter("tax_stmt_no"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_NMD_4082_ADM dm = new AD_NMD_4082_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setMedi_cd(medi_cd);
    	dm.setMake_dt(make_dt);
    	dm.setAgn(agn);
    	dm.setAgn_nm(agn_nm);
    	dm.setFee(fee);
    	dm.setFee_vat(fee_vat);
    	dm.setTot_fee(tot_fee);
    	dm.setSemuro_no(semuro_no);
    	dm.setTax_item(tax_item);
    	dm.setTax_stmt_no(tax_stmt_no);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4082_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4083_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4083_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf     = "23";//Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt       = Util.checkString(req.getParameter("occr_dt"));
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_NMD_4083_ADM dm = new AD_NMD_4083_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4083_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4084_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4084_ADataSet ds = null;

    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf     = "23";//Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt       = Util.checkString(req.getParameter("occr_dt"));   	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_NMD_4084_ADM dm = new AD_NMD_4084_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);   	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers); 

        dm.print();

        try {
        	AdNmd1000DAO	dao = new AdNmd1000DAO();
            ds = dao.ad_nmd_4084_a(dm); 
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }    
}
