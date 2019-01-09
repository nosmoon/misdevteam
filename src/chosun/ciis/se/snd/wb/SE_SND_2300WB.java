/***************************************************************************************************
* 파일명 : SE_SND_2300WB.java
* 기능 : 판매-발송관리-수송업자등록
* 작성일자 : 2009-02-13
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_2300DAO;
import chosun.ciis.se.snd.dm.SE_SND_2300_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2310_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2320_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2330_ADM;
import chosun.ciis.se.snd.dm.SE_SND_2340_SDM;
import chosun.ciis.se.snd.ds.SE_SND_2300_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2310_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2320_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2330_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_2340_SDataSet;
/**
 * 
 */

public class SE_SND_2300WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2300_MDataSet ds = null;

        // DM Setting
        SE_SND_2300_MDM dm 		= new SE_SND_2300_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_2300DAO dao = new SE_SND_2300DAO();
            ds = dao.se_snd_2300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2300EJBHome home = (SE_SND_2300EJBHome) JNDIManager.getInstance().getHome("SE_SND_2300EJB");
//        
//        try {
//        	SE_SND_2300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2300_m(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 수송업자 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2310_LDataSet ds = null;

        // DM Setting
        SE_SND_2310_LDM dm = new SE_SND_2310_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String tran_cmpy_cd		= Util.checkString(req.getParameter("tran_cmpy_cd"	));
        String tran_cmpy_nm		= Util.checkString(req.getParameter("tran_cmpy_nm"	));
        String route_cd			= Util.checkString(req.getParameter("route_cd"		));
        String route_clsf		= Util.checkString(req.getParameter("route_clsf"	));
        String prt_plac_cd		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String use_yn			= Util.checkString(req.getParameter("use_yn"		));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setTran_cmpy_cd(tran_cmpy_cd);
        dm.setTran_cmpy_nm(tran_cmpy_nm);
        dm.setRoute_cd(route_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setUse_yn(use_yn);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_2300DAO dao = new SE_SND_2300DAO();
            ds = dao.se_snd_2310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2300EJBHome home = (SE_SND_2300EJBHome) JNDIManager.getInstance().getHome("SE_SND_2300EJB");
//        
//        try {
//        	SE_SND_2300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2310_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 수송업자 이력 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2320_LDataSet ds = null;

        // DM Setting
        SE_SND_2320_LDM dm = new SE_SND_2320_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String tran_cmpy_cd		= Util.checkString(req.getParameter("tran_cmpy_cd"	));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setTran_cmpy_cd(tran_cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_2300DAO dao = new SE_SND_2300DAO();
            ds = dao.se_snd_2320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2300EJBHome home = (SE_SND_2300EJBHome) JNDIManager.getInstance().getHome("SE_SND_2300EJB");
//        
//        try {
//        	SE_SND_2300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2320_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 수송업자, 수송업자 이력 등록   
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2330_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_2330_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_2330_ADM dm 			= new SE_SND_2330_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
        
    	//발송노선 정보 그리드
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpdate1"));
    	String multiUpdateData2		= Util.checkString(req.getParameter("multiUpdate2"));
    	
    	Hashtable hash 				= new Hashtable();
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	dm.setIncmg_pers			(incmg_pers			);
    	if ( !"".equals(multiUpdateData) ){
	    	hash 						= getHashMultiUpdateData(multiUpdateData);
	    	//노선 정보
	    	String mode         		= Util.checkString((String)hash.get("m"				));
	    	String tran_cmpy_cd		    = (String) hash.get("tran_cmpy_cd"	);
	    	String dlco_no			    = (String) hash.get("dlco_no"		); 

	    	String setl_bank		    = (String) hash.get("setl_bank"		); 
	    	String acct_no			    = (String) hash.get("acct_no"		); 

	    	String car_no			    = (String) hash.get("car_no"		);
	    	String tran_cmpy_nm     	= (String) hash.get("tran_cmpy_nm"	); 
	    	String zip					= (String) hash.get("zip"			); 
	    	String addr				    = (String) hash.get("addr"			); 
	    	String dtls_addr		    = (String) hash.get("dtls_addr"		); 
	    	String tel_no		      	= (String) hash.get("tel_no"		); 
	    	String ptph_no			    = (String) hash.get("ptph_no"		); 
	    	String cntr_dt			    = (String) hash.get("cntr_dt"		); 
	    	String cctr_dt			    = (String) hash.get("cctr_dt"		); 
	    	String use_yn			    = (String) hash.get("use_yn"		); 
	    	
	    	zip 						= zip.replaceAll("-", "");
	    	//String zip_1				= zip.substring(0, 3);
	    	//String zip_2				= zip.substring(3, 6);
	    	
	    	String zip_1 = zip;
	    	String zip_2 = "";
	    	
			dm.setMode        	(mode.toUpperCase()	);      
	    	dm.setTran_cmpy_cd 	(tran_cmpy_cd		);      
	    	dm.setDlco_no	  	(dlco_no			);      

	    	dm.setSetl_bank	  	(setl_bank			);      
	    	dm.setAcct_no	  	(acct_no			);      

	    	dm.setCar_no		(car_no				);      
	    	dm.setTran_cmpy_nm	(tran_cmpy_nm 		);      
	    	dm.setZip_1			(zip_1				);      
	    	dm.setZip_2			(zip_2				);      
	    	dm.setAddr			(addr				);      
	    	dm.setDtls_addr		(dtls_addr			);      
	    	dm.setCntr_dt		(cntr_dt			);      
	    	dm.setCctr_dt		(cctr_dt			);      
	    	dm.setUse_yn		(use_yn				);      
	    	
	
	    	String sep = "", tel_no_1 = "", tel_no_2 = "", tel_no_3 = "", ptph_no_1 = "", ptph_no_2 = "", ptph_no_3 = "";
	    	
	    	if ( tel_no != null && ! "".equals(tel_no) ){
	    		String[] tel_ar			= tel_no.split("#");
	    		String tel_arr;
	    		for ( int i = 0 ; i < tel_ar.length ; i++ ){
	    			if ( i + 1 == tel_ar.length ){
	    				sep				= "";
	    			} else {
	    				sep				= "#";
	    			}
	    			
	    			tel_arr		= tel_ar[i].replaceAll("-", "");
	    			if ( tel_arr.length() == 10 ){
	    				tel_no_1	= tel_no_1 + tel_arr.substring(0, 3) + sep;
			    		tel_no_2	= tel_no_2 + tel_arr.substring(3, 6) + sep;
			    		tel_no_3	= tel_no_3 + tel_arr.substring(6, 10) + sep;
	    			} else if ( tel_arr.length() == 11 ){
	    				tel_no_1	= tel_no_1 + tel_arr.substring(0, 3) + sep;
			    		tel_no_2	= tel_no_2 + tel_arr.substring(3, 7) + sep;
			    		tel_no_3	= tel_no_3 + tel_arr.substring(7, 11) + sep;
	    			}
		    		
	    		}
	    	}
	    	
	    	dm.setTel_no_1(tel_no_1);
			dm.setTel_no_2(tel_no_2);
			dm.setTel_no_3(tel_no_3);
	    	
	    	if ( ptph_no != null && ! "".equals(ptph_no) ){
	    		String[] ptph_ar		= ptph_no.split("#");
	    		String ptph_arr;
	    		for ( int i = 0 ; i < ptph_ar.length ; i++ ){
	    			if ( i + 1 == ptph_ar.length ){
	    				sep				= "";
	    			} else {
	    				sep				= "#";
	    			}
		    		ptph_arr		= ptph_ar[i].replaceAll("-", "");
		    		
		    		if ( ptph_arr.length() == 10 ){
		    			ptph_no_1		= ptph_no_1 + ptph_arr.substring(0, 3) + sep;
			    		ptph_no_2		= ptph_no_2 + ptph_arr.substring(3, 6) + sep;
			    		ptph_no_3		= ptph_no_3 + ptph_arr.substring(6, 10) + sep;
	    			} else if ( ptph_arr.length() == 11 ){
	    				ptph_no_1		= ptph_no_1 + ptph_arr.substring(0, 3) + sep;
			    		ptph_no_2		= ptph_no_2 + ptph_arr.substring(3, 7) + sep;
			    		ptph_no_3		= ptph_no_3 + ptph_arr.substring(7, 11) + sep;
	    			}
	    		}
	    	}
	    	
	    	dm.setPtph_no_1(ptph_no_1);
			dm.setPtph_no_2(ptph_no_2);
			dm.setPtph_no_3(ptph_no_3);
    	}
    	
    	if ( !"".equals(multiUpdateData2 )){
    		hash						= getHashMultiUpdateData(multiUpdateData2);
	    	
	    	
	    	//노선 정보
	    	String mode_sub        		= Util.checkString((String) hash.get("m"				));
	    	String tran_cmpy_cd_sub		= (String) hash.get("tran_cmpy_cd"	);
	    	String tran_uprc_cd		    = (String) hash.get("tran_uprc_cd"	);
			String uprc_seq				= (String) hash.get("uprc_seq"		);
    	
			dm.setMode_sub(mode_sub.toUpperCase());
		    dm.setTran_cmpy_cd_sub(tran_cmpy_cd_sub);
		    dm.setTran_uprc_cd(tran_uprc_cd);
		    dm.setUprc_seq(uprc_seq);
    	}

        try {
        	SE_SND_2300DAO dao = new SE_SND_2300DAO();
            ds = dao.se_snd_2330_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_SND_2300EJBHome home = (SE_SND_2300EJBHome) JNDIManager.getInstance().getHome("SE_SND_2300EJB");
//        
//        try {
//        	SE_SND_2300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2330_a(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 수송업자 공통거래처 정보 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2340_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2340_SDataSet ds = null;

        // DM Setting
        SE_SND_2340_SDM dm = new SE_SND_2340_SDM();
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String dlco_no			= Util.checkString(req.getParameter("dlco_no"	));
        
        dm.setCmpy_cd       (cmpy_cd    );
        dm.setDlco_no		(dlco_no	);
        dm.setIncmg_pers	(incmg_pers	);
        
        try {
        	SE_SND_2300DAO dao = new SE_SND_2300DAO();
            ds = dao.se_snd_2340_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2300EJBHome home = (SE_SND_2300EJBHome) JNDIManager.getInstance().getHome("SE_SND_2300EJB");
//        
//        try {
//        	SE_SND_2300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2340_s(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
}
