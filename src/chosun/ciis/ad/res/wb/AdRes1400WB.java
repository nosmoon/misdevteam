/***************************************************************************************************
* 파일명 : AdRes1300WB.java
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

package chosun.ciis.ad.res.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes1400DAO;
import chosun.ciis.ad.res.dm.AD_RES_1400_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1410_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1420_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1430_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1440_UDM;
import chosun.ciis.ad.res.ds.AD_RES_1400_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1410_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1420_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1430_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1440_UDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1400_MDataSet ds = null;

        // DM Setting
    	AD_RES_1400_MDM dm = new AD_RES_1400_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);

        try {
        	AdRes1400DAO	dao = new AdRes1400DAO();
            ds = dao.ad_res_1400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1400EJBHome home = (AdRes1400EJBHome) JNDIManager.getInstance().getHome("AdRes1400EJB");
//        try {
//        	AdRes1400EJB ejb = home.create();
//            ds = ejb.ad_res_1400_m(dm);
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
    public void ad_res_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1410_LDataSet ds = null;

        // DM Setting
    	AD_RES_1410_LDM dm = new AD_RES_1410_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);
        
        //dm.print();

        try {
        	AdRes1400DAO	dao = new AdRes1400DAO();
            ds = dao.ad_res_1410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1400EJBHome home = (AdRes1400EJBHome) JNDIManager.getInstance().getHome("AdRes1400EJB");
//        try {
//        	AdRes1400EJB ejb = home.create();
//            ds = ejb.ad_res_1410_l(dm);
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
    public void ad_res_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1420_LDataSet ds = null;

        // DM Setting
    	AD_RES_1420_LDM dm = new AD_RES_1420_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);
        dm.setPubc_clsf(pubc_clsf);

        try {
        	AdRes1400DAO	dao = new AdRes1400DAO();
            ds = dao.ad_res_1420_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1400EJBHome home = (AdRes1400EJBHome) JNDIManager.getInstance().getHome("AdRes1400EJB");
//        try {
//        	AdRes1400EJB ejb = home.create();
//            ds = ejb.ad_res_1420_l(dm);
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
    public void ad_res_1430_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1430_UDataSet ds = null;

        // DM Setting
    	AD_RES_1430_UDM dm = new AD_RES_1430_UDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String unasin_uprc = Util.checkString(req.getParameter("unasin_uprc"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData0 = Util.checkString(req.getParameter("multiUpdateData0"));
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
    	String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5"));
    	String multiUpdateData6 = Util.checkString(req.getParameter("multiUpdateData6"));
    	String multiUpdateData7 = Util.checkString(req.getParameter("multiUpdateData7"));
    	String multiUpdateData8 = Util.checkString(req.getParameter("multiUpdateData8"));

    	Hashtable hash0 = getHashMultiUpdateData(multiUpdateData0);
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
    	Hashtable hash6 = getHashMultiUpdateData(multiUpdateData6);
    	Hashtable hash7 = getHashMultiUpdateData(multiUpdateData7);
    	Hashtable hash8 = getHashMultiUpdateData(multiUpdateData8);

    	String mode0		 	= Util.checkString((String)hash0.get("m"));
    	String preng_occr_seq0 	= Util.checkString((String)hash0.get("preng_occr_seq"));
    	String issu_side0  	  	= Util.checkString((String)hash0.get("issu_side"));    	
    	String sect_cd0 		= Util.checkString((String)hash0.get("sect_cd"));
    	String sect_seq0 		= Util.checkString((String)hash0.get("sect_seq"));
    	String cm0 	  			= Util.checkString((String)hash0.get("cm"));
    	String dn0 	  			= Util.checkString((String)hash0.get("dn"));
    	String chro_clsf0 		= Util.checkString((String)hash0.get("chro_clsf"));    	
    	String advt_cont0 		= Util.checkString((String)hash0.get("advt_cont"));
    	String uprc0 			= Util.checkString((String)hash0.get("uprc"));
    	String advt_fee0    	= Util.checkString((String)hash0.get("advt_fee"));
    	String slcrg_pers0  	= Util.checkString((String)hash0.get("slcrg_pers"));
    	String agn0         	= Util.checkString((String)hash0.get("agn"));
    	String dlco_clsf0      	= Util.checkString((String)hash0.get("dlco_clsf"));
    	
    	String mode1		 	= Util.checkString((String)hash1.get("m"));
    	String preng_occr_seq1 	= Util.checkString((String)hash1.get("preng_occr_seq"));
    	String issu_side1  	  	= Util.checkString((String)hash1.get("issu_side"));    	
    	String sect_cd1 		= Util.checkString((String)hash1.get("sect_cd"));
    	String sect_seq1 		= Util.checkString((String)hash1.get("sect_seq"));
    	String cm1 	  			= Util.checkString((String)hash1.get("cm"));
    	String dn1 	  			= Util.checkString((String)hash1.get("dn"));
    	String chro_clsf1 		= Util.checkString((String)hash1.get("chro_clsf"));    	
    	String advt_cont1 		= Util.checkString((String)hash1.get("advt_cont"));
    	String uprc1 			= Util.checkString((String)hash1.get("uprc"));
    	String advt_fee1    	= Util.checkString((String)hash1.get("advt_fee"));
    	String slcrg_pers1  	= Util.checkString((String)hash1.get("slcrg_pers"));
    	String agn1         	= Util.checkString((String)hash1.get("agn"));
    	String dlco_clsf1      	= Util.checkString((String)hash1.get("dlco_clsf"));

    	String mode2		 	= Util.checkString((String)hash2.get("m"));
    	String preng_occr_seq2 	= Util.checkString((String)hash2.get("preng_occr_seq"));
    	String issu_side2  	  	= Util.checkString((String)hash2.get("issu_side"));    	
    	String sect_cd2 		= Util.checkString((String)hash2.get("sect_cd"));
    	String sect_seq2 		= Util.checkString((String)hash2.get("sect_seq"));
    	String cm2 	  			= Util.checkString((String)hash2.get("cm"));
    	String dn2 	  			= Util.checkString((String)hash2.get("dn"));
    	String chro_clsf2 		= Util.checkString((String)hash2.get("chro_clsf"));    	
    	String advt_cont2 		= Util.checkString((String)hash2.get("advt_cont"));
    	String uprc2 			= Util.checkString((String)hash2.get("uprc"));
    	String advt_fee2    	= Util.checkString((String)hash2.get("advt_fee"));
    	String slcrg_pers2  	= Util.checkString((String)hash2.get("slcrg_pers"));
    	String agn2         	= Util.checkString((String)hash2.get("agn"));
    	String dlco_clsf2      	= Util.checkString((String)hash2.get("dlco_clsf"));

    	String mode3		 	= Util.checkString((String)hash3.get("m"));
    	String preng_occr_seq3 	= Util.checkString((String)hash3.get("preng_occr_seq"));
    	String issu_side3  	  	= Util.checkString((String)hash3.get("issu_side"));    	
    	String sect_cd3 		= Util.checkString((String)hash3.get("sect_cd"));
    	String sect_seq3 		= Util.checkString((String)hash3.get("sect_seq"));
    	String cm3 	  			= Util.checkString((String)hash3.get("cm"));
    	String dn3 	  			= Util.checkString((String)hash3.get("dn"));
    	String chro_clsf3 		= Util.checkString((String)hash3.get("chro_clsf"));    	
    	String advt_cont3 		= Util.checkString((String)hash3.get("advt_cont"));
    	String uprc3 			= Util.checkString((String)hash3.get("uprc"));
    	String advt_fee3    	= Util.checkString((String)hash3.get("advt_fee"));
    	String slcrg_pers3  	= Util.checkString((String)hash3.get("slcrg_pers"));
    	String agn3         	= Util.checkString((String)hash3.get("agn"));
    	String dlco_clsf3      	= Util.checkString((String)hash3.get("dlco_clsf"));

    	String mode4		 	= Util.checkString((String)hash4.get("m"));
    	String preng_occr_seq4 	= Util.checkString((String)hash4.get("preng_occr_seq"));
    	String issu_side4  	  	= Util.checkString((String)hash4.get("issu_side"));    	
    	String sect_cd4 		= Util.checkString((String)hash4.get("sect_cd"));
    	String sect_seq4 		= Util.checkString((String)hash4.get("sect_seq"));
    	String cm4 	  			= Util.checkString((String)hash4.get("cm"));
    	String dn4 	  			= Util.checkString((String)hash4.get("dn"));
    	String chro_clsf4 		= Util.checkString((String)hash4.get("chro_clsf"));    	
    	String advt_cont4 		= Util.checkString((String)hash4.get("advt_cont"));
    	String uprc4 			= Util.checkString((String)hash4.get("uprc"));
    	String advt_fee4    	= Util.checkString((String)hash4.get("advt_fee"));
    	String slcrg_pers4  	= Util.checkString((String)hash4.get("slcrg_pers"));
    	String agn4         	= Util.checkString((String)hash4.get("agn"));    	
    	String dlco_clsf4      	= Util.checkString((String)hash4.get("dlco_clsf"));

    	String mode5		 	= Util.checkString((String)hash5.get("m"));
    	String preng_occr_seq5 	= Util.checkString((String)hash5.get("preng_occr_seq"));
    	String issu_side5  	  	= Util.checkString((String)hash5.get("issu_side"));    	
    	String sect_cd5 		= Util.checkString((String)hash5.get("sect_cd"));
    	String sect_seq5 		= Util.checkString((String)hash5.get("sect_seq"));
    	String cm5 	  			= Util.checkString((String)hash5.get("cm"));
    	String dn5 	  			= Util.checkString((String)hash5.get("dn"));
    	String chro_clsf5 		= Util.checkString((String)hash5.get("chro_clsf"));    	
    	String advt_cont5 		= Util.checkString((String)hash5.get("advt_cont"));
    	String uprc5 			= Util.checkString((String)hash5.get("uprc"));
    	String advt_fee5    	= Util.checkString((String)hash5.get("advt_fee"));
    	String slcrg_pers5  	= Util.checkString((String)hash5.get("slcrg_pers"));
    	String agn5         	= Util.checkString((String)hash5.get("agn"));
    	String dlco_clsf5      	= Util.checkString((String)hash5.get("dlco_clsf"));
    	
    	String mode6		 	= Util.checkString((String)hash6.get("m"));
    	String preng_occr_seq6 	= Util.checkString((String)hash6.get("preng_occr_seq"));
    	String issu_side6  	  	= Util.checkString((String)hash6.get("issu_side"));    	
    	String sect_cd6 		= Util.checkString((String)hash6.get("sect_cd"));
    	String sect_seq6 		= Util.checkString((String)hash6.get("sect_seq"));
    	String cm6 	  			= Util.checkString((String)hash6.get("cm"));
    	String dn6 	  			= Util.checkString((String)hash6.get("dn"));
    	String chro_clsf6 		= Util.checkString((String)hash6.get("chro_clsf"));    	
    	String advt_cont6 		= Util.checkString((String)hash6.get("advt_cont"));
    	String uprc6 			= Util.checkString((String)hash6.get("uprc"));
    	String advt_fee6    	= Util.checkString((String)hash6.get("advt_fee"));
    	String slcrg_pers6  	= Util.checkString((String)hash6.get("slcrg_pers"));
    	String agn6         	= Util.checkString((String)hash6.get("agn"));
    	String dlco_clsf6      	= Util.checkString((String)hash6.get("dlco_clsf"));
    	
    	String mode7		 	= Util.checkString((String)hash7.get("m"));
    	String preng_occr_seq7 	= Util.checkString((String)hash7.get("preng_occr_seq"));
    	String issu_side7  	  	= Util.checkString((String)hash7.get("issu_side"));    	
    	String sect_cd7 		= Util.checkString((String)hash7.get("sect_cd"));
    	String sect_seq7 		= Util.checkString((String)hash7.get("sect_seq"));
    	String cm7 	  			= Util.checkString((String)hash7.get("cm"));
    	String dn7 	  			= Util.checkString((String)hash7.get("dn"));
    	String chro_clsf7 		= Util.checkString((String)hash7.get("chro_clsf"));    	
    	String advt_cont7 		= Util.checkString((String)hash7.get("advt_cont"));
    	String uprc7 			= Util.checkString((String)hash7.get("uprc"));
    	String advt_fee7    	= Util.checkString((String)hash7.get("advt_fee"));
    	String slcrg_pers7  	= Util.checkString((String)hash7.get("slcrg_pers"));
    	String agn7         	= Util.checkString((String)hash7.get("agn"));
    	String dlco_clsf7      	= Util.checkString((String)hash7.get("dlco_clsf"));    	
    	
    	String mode8		 	= Util.checkString((String)hash8.get("m"));
    	String preng_occr_seq8 	= Util.checkString((String)hash8.get("preng_occr_seq"));
    	String issu_side8  	  	= Util.checkString((String)hash8.get("issu_side"));    	
    	String sect_cd8 		= Util.checkString((String)hash8.get("sect_cd"));
    	String sect_seq8 		= Util.checkString((String)hash8.get("sect_seq"));
    	String cm8 	  			= Util.checkString((String)hash8.get("cm"));
    	String dn8 	  			= Util.checkString((String)hash8.get("dn"));
    	String chro_clsf8 		= Util.checkString((String)hash8.get("chro_clsf"));    	
    	String advt_cont8 		= Util.checkString((String)hash8.get("advt_cont"));
    	String uprc8 			= Util.checkString((String)hash8.get("uprc"));
    	String advt_fee8    	= Util.checkString((String)hash8.get("advt_fee"));
    	String slcrg_pers8  	= Util.checkString((String)hash8.get("slcrg_pers"));
    	String agn8         	= Util.checkString((String)hash8.get("agn"));
    	String dlco_clsf8      	= Util.checkString((String)hash8.get("dlco_clsf"));    	
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);

        dm.setMode0(mode0.toUpperCase());
        dm.setPreng_occr_seq0(preng_occr_seq0);
        dm.setIssu_side0(issu_side0);
        dm.setSect_cd0(sect_cd0);
        dm.setSect_seq0(sect_seq0);
        dm.setCm0(cm0);
        dm.setDn0(dn0);
        dm.setChro_clsf0(chro_clsf0);
        dm.setAdvt_cont0(advt_cont0);  
        dm.setUprc0(uprc0);
        dm.setAdvt_fee0(advt_fee0);
        dm.setSlcrg_pers0(slcrg_pers0);
        dm.setAgn0(agn0);
        dm.setDlco_clsf0(dlco_clsf0);
        
        dm.setMode1(mode1.toUpperCase());
        dm.setPreng_occr_seq1(preng_occr_seq1);
        dm.setIssu_side1(issu_side1);
        dm.setSect_cd1(sect_cd1);
        dm.setSect_seq1(sect_seq1);
        dm.setCm1(cm1);
        dm.setDn1(dn1);
        dm.setChro_clsf1(chro_clsf1);
        dm.setAdvt_cont1(advt_cont1);
        dm.setUprc1(uprc1);
        dm.setAdvt_fee1(advt_fee1);
        dm.setSlcrg_pers1(slcrg_pers1);
        dm.setAgn1(agn1);
        dm.setDlco_clsf1(dlco_clsf1);

        dm.setMode2(mode2.toUpperCase());
        dm.setPreng_occr_seq2(preng_occr_seq2);
        dm.setIssu_side2(issu_side2);
        dm.setSect_cd2(sect_cd2);
        dm.setSect_seq2(sect_seq2);
        dm.setCm2(cm2);
        dm.setDn2(dn2);
        dm.setChro_clsf2(chro_clsf2);
        dm.setAdvt_cont2(advt_cont2);
        dm.setUprc2(uprc2);
        dm.setAdvt_fee2(advt_fee2);
        dm.setSlcrg_pers2(slcrg_pers2);
        dm.setAgn2(agn2);
        dm.setDlco_clsf2(dlco_clsf2);

        dm.setMode3(mode3.toUpperCase());
        dm.setPreng_occr_seq3(preng_occr_seq3);
        dm.setIssu_side3(issu_side3);
        dm.setSect_cd3(sect_cd3);
        dm.setSect_seq3(sect_seq3);
        dm.setCm3(cm3);
        dm.setDn3(dn3);
        dm.setChro_clsf3(chro_clsf3);
        dm.setAdvt_cont3(advt_cont3);
        dm.setUprc3(uprc3);
        dm.setAdvt_fee3(advt_fee3);
        dm.setSlcrg_pers3(slcrg_pers3);
        dm.setAgn3(agn3);
        dm.setDlco_clsf3(dlco_clsf3);

        dm.setMode4(mode4.toUpperCase());
        dm.setPreng_occr_seq4(preng_occr_seq4);
        dm.setIssu_side4(issu_side4);
        dm.setSect_cd4(sect_cd4);
        dm.setSect_seq4(sect_seq4);
        dm.setCm4(cm4);
        dm.setDn4(dn4);
        dm.setChro_clsf4(chro_clsf4);
        dm.setAdvt_cont4(advt_cont4);
        dm.setUprc4(uprc4);
        dm.setAdvt_fee4(advt_fee4);
        dm.setSlcrg_pers4(slcrg_pers4);
        dm.setAgn4(agn4);
        dm.setDlco_clsf4(dlco_clsf4);

        dm.setMode5(mode5.toUpperCase());
        dm.setPreng_occr_seq5(preng_occr_seq5);
        dm.setIssu_side5(issu_side5);
        dm.setSect_cd5(sect_cd5);
        dm.setSect_seq5(sect_seq5);
        dm.setCm5(cm5);
        dm.setDn5(dn5);
        dm.setChro_clsf5(chro_clsf5);
        dm.setAdvt_cont5(advt_cont5);
        dm.setUprc5(uprc5);
        dm.setAdvt_fee5(advt_fee5);
        dm.setSlcrg_pers5(slcrg_pers5);
        dm.setAgn5(agn5);    
        dm.setDlco_clsf5(dlco_clsf5);    
        

        dm.setMode6(mode6.toUpperCase());
        dm.setPreng_occr_seq6(preng_occr_seq6);
        dm.setIssu_side6(issu_side6);
        dm.setSect_cd6(sect_cd6);
        dm.setSect_seq6(sect_seq6);
        dm.setCm6(cm6);
        dm.setDn6(dn6);
        dm.setChro_clsf6(chro_clsf6);
        dm.setAdvt_cont6(advt_cont6);
        dm.setUprc6(uprc6);
        dm.setAdvt_fee6(advt_fee6);
        dm.setSlcrg_pers6(slcrg_pers6);
        dm.setAgn6(agn6);    
        dm.setDlco_clsf6(dlco_clsf6);    
        
        dm.setMode7(mode7.toUpperCase());
        dm.setPreng_occr_seq7(preng_occr_seq7);
        dm.setIssu_side7(issu_side7);
        dm.setSect_cd7(sect_cd7);
        dm.setSect_seq7(sect_seq7);
        dm.setCm7(cm7);
        dm.setDn7(dn7);
        dm.setChro_clsf7(chro_clsf7);
        dm.setAdvt_cont7(advt_cont7);
        dm.setUprc7(uprc7);
        dm.setAdvt_fee7(advt_fee7);
        dm.setSlcrg_pers7(slcrg_pers7);
        dm.setAgn7(agn7);    
        dm.setDlco_clsf7(dlco_clsf7);    

        dm.setMode8(mode8.toUpperCase());
        dm.setPreng_occr_seq8(preng_occr_seq8);
        dm.setIssu_side8(issu_side8);
        dm.setSect_cd8(sect_cd8);
        dm.setSect_seq8(sect_seq8);
        dm.setCm8(cm8);
        dm.setDn8(dn8);
        dm.setChro_clsf8(chro_clsf8);
        dm.setAdvt_cont8(advt_cont8);
        dm.setUprc8(uprc8);
        dm.setAdvt_fee8(advt_fee8);
        dm.setSlcrg_pers8(slcrg_pers8);
        dm.setAgn8(agn8);    
        dm.setDlco_clsf8(dlco_clsf8);    
        
        dm.setUnasin_uprc(unasin_uprc);
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.setIncmg_pers(incmg_pers);

        dm.print();

        try {
        	AdRes1400DAO	dao = new AdRes1400DAO();
            ds = dao.ad_res_1430_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1400EJBHome home = (AdRes1400EJBHome) JNDIManager.getInstance().getHome("AdRes1400EJB");
//        try {
//        	AdRes1400EJB ejb = home.create();
//            ds = ejb.ad_res_1430_u(dm);
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
    public void ad_res_1440_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1440_UDataSet ds = null;

        // DM Setting
    	AD_RES_1440_UDM dm = new AD_RES_1440_UDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
    	String preng_clos_yn = Util.checkString(req.getParameter("preng_clos_yn"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);
        dm.setClos_clsf(clos_clsf);
        dm.setPreng_clos_yn(preng_clos_yn);
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.setIncmg_pers(incmg_pers);

        try {
        	AdRes1400DAO	dao = new AdRes1400DAO();
            ds = dao.ad_res_1440_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1400EJBHome home = (AdRes1400EJBHome) JNDIManager.getInstance().getHome("AdRes1400EJB");
//        try {
//        	AdRes1400EJB ejb = home.create();
//            ds = ejb.ad_res_1440_u(dm);
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
