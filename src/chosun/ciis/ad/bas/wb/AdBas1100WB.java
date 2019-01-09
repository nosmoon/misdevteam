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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1100DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1100_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1110_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1120_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1130_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1150_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1160_UDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1170_UDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1180_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1190_IDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1100_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1110_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1120_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1130_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1150_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1160_UDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1170_UDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1180_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1190_IDataSet;
import chosun.ciis.co.base.util.SMSSender;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1100_MDataSet ds = null;

        // DM Setting
    	AD_BAS_1100_MDM dm = new AD_BAS_1100_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
                
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }         
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create();
//            ds = ejb.ad_bas_1100_m(dm);
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
    public void ad_bas_1110_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1110_SDataSet ds = null;

        // DM Setting
    	AD_BAS_1110_SDM dm = new AD_BAS_1110_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);//erp
    	//String medi_clsf  = "1";//eip
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setDlco_no(dlco_no);
        dm.setDlco_nm(dlco_nm);
        dm.print();
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1110_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }          
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create();
//            ds = ejb.ad_bas_1110_s(dm);
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
    public void ad_bas_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1120_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1120_LDM dm = new AD_BAS_1120_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String dlco_no 	= Util.checkString(req.getParameter("dlco_no"));
    	String frdt 	= Util.checkString(req.getParameter("frdt"));
    	String todt 	= Util.checkString(req.getParameter("todt"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setDlco_no(dlco_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }           
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create();
//            ds = ejb.ad_bas_1120_l(dm);
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
    public void ad_bas_1150_a(HttpServletRequest req, HttpServletResponse res) throws  AppException {
    	
    	AD_BAS_1150_ADataSet ds = null;

    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String cntr_type = Util.checkString(req.getParameter("cntr_type"));
    	String cntr_prd_frdt = Util.checkString(req.getParameter("cntr_prd_frdt"));
    	String cntr_prd_todt = Util.checkString(req.getParameter("cntr_prd_todt"));
    	String fndt_dt = Util.checkString(req.getParameter("fndt_dt"));
    	String capt_amt = Util.checkString(req.getParameter("capt_amt"));
    	String mang_clsf = Util.checkString(req.getParameter("mang_clsf"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
    	String evlu_frdt = Util.checkString(req.getParameter("evlu_frdt"));
    	String evlu_todt = Util.checkString(req.getParameter("evlu_todt"));
    	String dhon_dt = Util.checkString(req.getParameter("dhon_dt"));
    	String cntr_frdt = Util.checkString(req.getParameter("cntr_frdt"));
    	String cntr_todt = Util.checkString(req.getParameter("cntr_todt"));
    	String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
    	String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
    	String agn_yn = Util.checkString(req.getParameter("agn_yn"));
    	String nmd_agn_yn = Util.checkString(req.getParameter("nmd_agn_yn"));
    	String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
    	String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
    	String del_yn = Util.checkString(req.getParameter("del_yn"));
    	String deal_ptcr_unissu_yn = Util.checkString(req.getParameter("deal_ptcr_unissu_yn"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));

    	String gurt_pers 		= Util.checkString(req.getParameter("gurt_pers"));
    	String gurt_pers_addr 	= Util.checkString(req.getParameter("gurt_pers_addr"));
    	String gurt_pers_prn 	= Util.checkString(req.getParameter("gurt_pers_prn"));  
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);


    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	System.out.println("multiUpdateData = " + multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
        String mode 			= Util.checkString((String)hash.get("m"));
        String seq	 			= Util.checkString((String)hash.get("seq"));
        String repl_rtcn_cnfm1	= Util.checkString((String)hash.get("repl_rtcn_cnfm1"));
        String repl_rtcn_cnfm3	= Util.checkString((String)hash.get("repl_rtcn_cnfm3"));
        String mortg_clsf 		= Util.checkString((String)hash.get("mortg_clsf"));
        String mortg_cont		= Util.checkString((String)hash.get("mortg_cont"));
        String mortg_amt		= Util.checkString((String)hash.get("mortg_amt"));
        String acct_no			= Util.checkString((String)hash.get("acct_no"));
        String gurt_frdt		= Util.checkString((String)hash.get("gurt_frdt"));
        String gurt_todt		= Util.checkString((String)hash.get("gurt_todt"));
        String ewh_dt			= Util.checkString((String)hash.get("ewh_dt"));
        String ewh_cnfm			= Util.checkString((String)hash.get("ewh_cnfm"));
        String owh_cnfm			= Util.checkString((String)hash.get("owh_cnfm"));
        String old_ewh_cnfm		= Util.checkString((String)hash.get("old_ewh_cnfm"));
        String old_owh_cnfm		= Util.checkString((String)hash.get("old_owh_cnfm"));        
        String remk				= Util.checkString((String)hash.get("remk"));
        String setup_pers		= Util.checkString((String)hash.get("setup_pers"));
        String eip_stat    		= Util.checkString((String)hash.get("eip_stat"));

    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	System.out.println("multiUpdateData2 = " + multiUpdateData2);
    	
    	Hashtable hash2 		= getHashMultiUpdateData(multiUpdateData2);

    	String chrg_mode 		= Util.checkString((String)hash2.get("m"));
    	String dept_nm 			= Util.checkString((String)hash2.get("dept_nm"));
    	String chrg_pers_nm 	= Util.checkString((String)hash2.get("chrg_pers_nm"));
    	String cntc_plac 		= Util.checkString((String)hash2.get("cntc_plac"));
    	String chrg_seq 		= Util.checkString((String)hash2.get("chrg_seq"));
    	
        // DM Setting
    	AD_BAS_1150_ADM dm = new AD_BAS_1150_ADM(); 

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setCntr_type(cntr_type);
    	dm.setCntr_prd_frdt(cntr_prd_frdt);
    	dm.setCntr_prd_todt(cntr_prd_todt);
    	dm.setFndt_dt(fndt_dt);
    	dm.setCapt_amt(capt_amt);
    	dm.setMang_clsf(mang_clsf);
    	dm.setGrp_cmpy_cd(grp_cmpy_cd);
    	dm.setEvlu_frdt(evlu_frdt);
    	dm.setEvlu_todt(evlu_todt);
    	dm.setDhon_dt(dhon_dt);
    	dm.setCntr_frdt(cntr_frdt);
    	dm.setCntr_todt(cntr_todt);
    	dm.setGnr_advcs_yn(gnr_advcs_yn);
    	dm.setArow_advcs_yn(arow_advcs_yn);
    	dm.setAgn_yn(agn_yn);
    	dm.setNmd_agn_yn(nmd_agn_yn);
    	dm.setAdvt_bo_yn(advt_bo_yn);
    	dm.setBo_bof_yn(bo_bof_yn);
    	dm.setDel_yn(del_yn);
    	dm.setDeal_ptcr_unissu_yn(deal_ptcr_unissu_yn);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setRepl_rtcn_cnfm1(repl_rtcn_cnfm1);
    	dm.setRepl_rtcn_cnfm3(repl_rtcn_cnfm3);
    	dm.setMortg_clsf(mortg_clsf);
    	dm.setMortg_cont(mortg_cont);
    	dm.setMortg_amt(mortg_amt);
    	dm.setAcct_no(acct_no);
    	dm.setGurt_frdt(gurt_frdt);
    	dm.setGurt_todt(gurt_todt);
    	dm.setEwh_dt(ewh_dt);
    	dm.setEwh_cnfm(ewh_cnfm);
    	dm.setOwh_cnfm(owh_cnfm);
    	dm.setRemk(remk);
    	dm.setSetup_pers(setup_pers);
    	dm.setGurt_pers(gurt_pers);
    	dm.setGurt_pers_addr(gurt_pers_addr);
    	dm.setGurt_pers_prn(gurt_pers_prn);
    	dm.setEip_stat(eip_stat);

    	dm.setChrg_mode(chrg_mode.toUpperCase());
    	dm.setChrg_seq(chrg_seq);
    	dm.setDept_nm(dept_nm);
    	dm.setChrg_pers_nm(chrg_pers_nm);
    	dm.setCntc_plac(cntc_plac);
        
        dm.print();  
        String sm_code = "MIS-" + cmpy_cd;
        String titl    = "";
        String in_titl    = "";
        String up_titl    = "";
        int n = 0;
        int m = 0;
        String sms_go = "N";
        System.out.println(sm_code);        
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1150_a(dm);
            req.setAttribute("ds", ds);
            //문자발송
            String[] old_ewh_cnfm_ar = StringUtil.toArray(old_ewh_cnfm,"#");
            String[] old_owh_cnfm_ar = StringUtil.toArray(old_owh_cnfm,"#");
            String[] ewh_cnfm_ar = StringUtil.toArray(dm.ewh_cnfm,"#");
            String[] owh_cnfm_ar = StringUtil.toArray(dm.owh_cnfm,"#");
            String[] ck_mode_ar = StringUtil.toArray(dm.mode,"#");
            for(int i=0; i<ck_mode_ar.length; i++){
            	if("I".equals(ck_mode_ar[i]) || "U".equals(ck_mode_ar[i])){
  	            	//for(int i=0; i<old_ewh_cnfm_ar.length; i++){
	            	System.out.println("ewh_cnfm_ar"+ewh_cnfm_ar[i]);
	            	System.out.println("old_ewh_cnfm_ar"+old_ewh_cnfm_ar[i]);
	            	System.out.println("owh_cnfm_ar"+owh_cnfm_ar[i]);
	            	System.out.println("old_owh_cnfm_ar"+old_owh_cnfm_ar[i]);
	            	if(!ewh_cnfm_ar[i].equals(old_ewh_cnfm_ar[i]) && "Y".equals(ewh_cnfm_ar[i])){
	            		n = n + 1;
	            		in_titl = n + "건 입고"; 
	            		sms_go = "Y";
	            	}
	            	if(!owh_cnfm_ar[i].equals(old_owh_cnfm_ar[i]) && "Y".equals(owh_cnfm_ar[i])){
	            		m = m + 1;
	            		up_titl = m + "건 출고";
	            		sms_go = "Y";
	            	}
	            	if("Y".equals(sms_go)){
	   	        		int ck_i = i + 1;
	   	        		System.out.println("ck_i::"+ck_i);
	   	        		System.out.println(old_ewh_cnfm_ar.length);
	   	            	if(ck_i == ck_mode_ar.length){//old_ewh_cnfm_ar.length){	       	
	   	            		titl = "거래처 "+dlco_nm+"("+dlco_no+") " + in_titl + up_titl +" 되었습니다";
	   	            		if("".equals(ds.errcode)){
		    	        		//SMS 전송.... 
	   	            			String[] ptph_no_ar = StringUtil.toArray("01063901254#","#");
	   	            			//String ptph_no = Util.checkString("01027963039");//관리자
	   	            			//String ptph_no = Util.checkString("01063901254");//이상록팀장
	   	            			//String ptph_no = Util.checkString("01053858396");//김영한과장
		    	        		String sm_rvmbno = Util.checkString("027245973"); //발신번호
		    	        		if(!"".equals(sm_rvmbno)){
		    	        			try{
		    			        		SMSSender sms = new SMSSender();
		    			        		System.out.println("title::"+titl);
		    			        		//sms.send_one(StringUtil.strip(sm_rvmbno, "-"), ptph_no, titl, sm_code);
		    			        		sms.send(StringUtil.strip(sm_rvmbno, "-"), ptph_no_ar, titl, sm_code);
		    			        	}catch(AppException ae){
		    	        				throw ae;
		    	        			}
		    	        		}  
		    	            }//if("".equals(ds.errcode))
		                }//if(ck_i == ck_mode_ar.length)
	            	}//if("Y".equals(sms_go))
            	}//if("I".equals(ck_mode_ar[i]) || "U".equals(ck_mode_ar[i]))
            }//for
        }
        catch (AppException e) {
        	throw e;
        }    	
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create();
//            ds = ejb.ad_bas_1150_a(dm);
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
    public void ad_bas_1160_u(HttpServletRequest req, HttpServletResponse res) throws  AppException {
    	
    	AD_BAS_1160_UDataSet ds = null;

    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        // DM Setting
    	AD_BAS_1160_UDM dm = new AD_BAS_1160_UDM();  
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
        String mode 		= Util.checkString((String)hash.get("m"));
        String seq	 		= Util.checkString((String)hash.get("seq")); 
        String ewh_cnfm		= Util.checkString((String)hash.get("ewh_cnfm")); 
        String owh_cnfm		= Util.checkString((String)hash.get("owh_cnfm")); 
        String old_ewh_cnfm	= Util.checkString((String)hash.get("old_ewh_cnfm")); 
        String old_owh_cnfm	= Util.checkString((String)hash.get("old_owh_cnfm"));         

        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        dm.setMode(mode.toUpperCase());
        dm.setSeq(seq);
        dm.setEwh_cnfm(ewh_cnfm);
        dm.setOwh_cnfm(owh_cnfm);
        dm.setIncmg_pers(incmg_pers);

        dm.print(); 
        
        String sm_code = "MIS-" + cmpy_cd;
        String titl    = "";
        String in_titl    = "";
        String up_titl    = "";
        int n = 0;
        int m = 0;
        String sms_go = "N";
        System.out.println(sm_code);        
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1160_u(dm);
            req.setAttribute("ds", ds);
            //문자발송
            String[] old_ewh_cnfm_ar = StringUtil.toArray(old_ewh_cnfm,"#");
            String[] old_owh_cnfm_ar = StringUtil.toArray(old_owh_cnfm,"#");
            String[] ewh_cnfm_ar = StringUtil.toArray(dm.ewh_cnfm,"#");
            String[] owh_cnfm_ar = StringUtil.toArray(dm.owh_cnfm,"#");
            String[] ck_mode_ar = StringUtil.toArray(dm.mode,"#");
            for(int i=0; i<ck_mode_ar.length; i++){
            	if("I".equals(ck_mode_ar[i]) || "U".equals(ck_mode_ar[i])){
  	            	//for(int i=0; i<old_ewh_cnfm_ar.length; i++){
	            	System.out.println("ewh_cnfm_ar"+ewh_cnfm_ar[i]);
	            	System.out.println("old_ewh_cnfm_ar"+old_ewh_cnfm_ar[i]);
	            	System.out.println("owh_cnfm_ar"+owh_cnfm_ar[i]);
	            	System.out.println("old_owh_cnfm_ar"+old_owh_cnfm_ar[i]);
	            	if(!ewh_cnfm_ar[i].equals(old_ewh_cnfm_ar[i]) && "Y".equals(ewh_cnfm_ar[i])){
	            		n = n + 1;
	            		in_titl = n + "건 입고 확인 "; 
	            		sms_go = "Y";
	            	}
	            	if(!owh_cnfm_ar[i].equals(old_owh_cnfm_ar[i]) && "Y".equals(owh_cnfm_ar[i])){
	            		m = m + 1;
	            		up_titl = m + "건 출고 확인 ";
	            		sms_go = "Y";
	            	}
	            	if("Y".equals(sms_go)){
	   	        		int ck_i = i + 1;
	   	        		System.out.println("ck_i::"+ck_i);
	   	        		System.out.println(old_ewh_cnfm_ar.length);
	   	            	if(ck_i == ck_mode_ar.length){//old_ewh_cnfm_ar.length){	       	
	   	            		titl = "거래처 "+dlco_nm+"("+dlco_no+") " + in_titl + up_titl +" 되었습니다";
	   	            		if("".equals(ds.errcode)){
		    	        		//SMS 전송....
	   	            			String[] ptph_no_ar = StringUtil.toArray("01063901254#","#");
	   	            			//String ptph_no = Util.checkString("01027963039");//
	   	            			//String ptph_no = Util.checkString("01063901254");//이상록팀장
	   	            			//String ptph_no = Util.checkString("01053858396");//김영한과장
		    	        		String sm_rvmbno = Util.checkString("027245945"); //발신번호
		    	        		if(!"".equals(sm_rvmbno)){
		    	        			try{
		    			        		SMSSender sms = new SMSSender();
		    			        		//sms.send_one(StringUtil.strip(sm_rvmbno, "-"), ptph_no, titl, sm_code);
		    			        		sms.send(StringUtil.strip(sm_rvmbno, "-"), ptph_no_ar, titl, sm_code);
		    			        	}catch(AppException ae){
		    	        				throw ae;
		    	        			}
		    	        		} 
		    	            }//if("".equals(ds.errcode))
		                }//if(ck_i == ck_mode_ar.length)
	            	}//if("Y".equals(sms_go))
            	}//if("I".equals(ck_mode_ar[i]) || "U".equals(ck_mode_ar[i]))
            }//for
        }
        catch (AppException e) {
            throw e;
        }         
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create(); 
//            ds = ejb.ad_bas_1160_u(dm);
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
    public void ad_bas_1170_u(HttpServletRequest req, HttpServletResponse res) throws  AppException {
    	
    	AD_BAS_1170_UDataSet ds = null;

    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        // DM Setting
    	AD_BAS_1170_UDM dm = new AD_BAS_1170_UDM();  
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
        String mode 			= (String)hash.get("m");
        String seq	 			= (String)hash.get("seq");
        String repl_rtcn_cnfm2	= (String)hash.get("repl_rtcn_cnfm2");
        String repl_rtcn_cnfm3	= (String)hash.get("repl_rtcn_cnfm3");
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        dm.setMode(mode.toUpperCase());
        dm.setSeq(seq);
        dm.setRepl_rtcn_cnfm2(repl_rtcn_cnfm2);
        dm.setRepl_rtcn_cnfm3(repl_rtcn_cnfm3);
        dm.setIncmg_pers(incmg_pers);
        
//        String sm_code = "MIS-" + cmpy_cd;
//        String titl    = "";
//        String in_titl    = "";
//        String up_titl    = "";
//        int n = 0;
//        int m = 0;
//        System.out.println(sm_code);        
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1170_u(dm);
            req.setAttribute("ds", ds);
            //문자발송
//            System.out.println("mode::"+dm.mode+"::"+mode);
//            String[] ck_mode_ar = StringUtil.toArray(dm.mode,"#");
//            for(int i=0; i<ck_mode_ar.length; i++){
//            	if("I".equals(ck_mode_ar[i]) || "U".equals(ck_mode_ar[i])){
//                	if("I".equals(ck_mode_ar[i])){
//                		n = n + 1;
//                		in_titl = n + "건 등록 ";
//                	}
//                	if("U".equals(ck_mode_ar[i])){
//                		m = m + 1;
//                		up_titl = m + "건 최종확인 ";
//                	}  	                	
//   	        		int ck_i = i + 1;
//   	            	if(ck_i == ck_mode_ar.length){	       	
//   	            		titl = "대행사/지사 담보현황  거래처 "+dlco_nm+"("+dlco_no+") 담보가 " + in_titl + up_titl +" 되었습니다.";
//   	            		System.out.println(titl);
//   	            		if("".equals(ds.errcode)){
//	    	        		//SMS 전송....
//	    	        		String[] ptph_no_ar = StringUtil.toArray("010-2796-3039#010-9109-3395","#");	        		
//	    	        		String sm_rvmbno = Util.checkString("027245945"); //발신번호
//	    	        		if(!"".equals(sm_rvmbno)){
////	    	        			try{System.out.println("1");
////	    			        		SMSSender sms = new SMSSender();
////	    			        		System.out.println("2");
////	    			        		sms.send(StringUtil.strip(sm_rvmbno, "-"), ptph_no_ar, titl, sm_code);
////	    			        		System.out.println("3");
////	    	        			}catch(AppException ae){
////	    	        				throw ae;
////	    	        			}
//	    	        		}  
//	    	            }
//	                }//if 
//            	}
//            }//for
        }
        catch (AppException e) {
            throw e;
        }         
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create(); 
//            ds = ejb.ad_bas_1170_u(dm);
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
    public void ad_bas_1180_l(HttpServletRequest req, HttpServletResponse res) throws  AppException {
    	
    	AD_BAS_1180_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	
        // DM Setting
    	AD_BAS_1180_LDM dm = new AD_BAS_1180_LDM();  
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1180_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }         
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create(); 
//            ds = ejb.ad_bas_1180_l(dm);
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
    public void ad_bas_1190_i(HttpServletRequest req, HttpServletResponse res) throws  AppException {
    	
    	AD_BAS_1190_IDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String oldkey = Util.checkString(req.getParameter("oldkey"));
    	String newkey = Util.checkString(req.getParameter("newkey"));
    	
    	String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
    	String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
    	
    	Hashtable hash_oldkey = getHashMultiUpdateData(oldkey);
    	Hashtable hash_newkey = getHashMultiUpdateData(newkey);
    	
        // DM Setting
    	AD_BAS_1190_IDM dm = new AD_BAS_1190_IDM();  
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        dm.setOld_seq((String)hash_oldkey.get("seq"));
        dm.setNew_seq((String)hash_newkey.get("seq"));
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
//        String sm_code = "MIS-" + cmpy_cd;
//        String titl    = "";
//        System.out.println(sm_code);  
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1190_i(dm);
            req.setAttribute("ds", ds);
            //문자발송
//            if(!"".equals((String)hash_oldkey.get("seq")) || !"".equals((String)hash_newkey.get("seq"))){
//            	titl = "대행사/지사 담보현황  거래처 "+dlco_nm+"("+dlco_no+") 담보가 담보 교체되었습니다.";
//	            if("".equals(ds.errcode)){
//	        		//SMS 전송....
//	        		String[] ptph_no = StringUtil.toArray("01027963039#01091093395","#");	        		
//	        		String sm_rvmbno = Util.checkString("027245945"); //발신번호
//	        		if(!"".equals(sm_rvmbno)){
////	        			try{
////			        		SMSSender sms = new SMSSender();
////			        		sms.send(StringUtil.strip(sm_rvmbno, "-"), ptph_no, titl, sm_code);
////	        			}catch(AppException ae){
////	        				throw ae;
////	        			}
//	        		}  
//	            }
//            }            
        }
        catch (AppException e) {
            throw e;
        }        
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create(); 
//            ds = ejb.ad_bas_1190_i(dm);
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
    public void ad_bas_1130_a(HttpServletRequest req, HttpServletResponse res) throws  AppException {
    	
    	AD_BAS_1130_ADataSet ds = null; 

    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	
        // DM Setting
    	AD_BAS_1130_ADM dm = new AD_BAS_1130_ADM();  
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	AdBas1100DAO dao = new AdBas1100DAO();
            ds = dao.ad_bas_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }          
//        AdBas1100EJBHome home = (AdBas1100EJBHome) JNDIManager.getInstance().getHome("AdBas1100EJB");
//        try {
//        	AdBas1100EJB ejb = home.create(); 
//            ds = ejb.ad_bas_1130_a(dm);
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
