/***************************************************************************************************
* 파일명 : SE_ETC_1000WB.java
* 기능 : 판매-기타관리-확장수당등록
* 작성일자 : 2009-03-02
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.etc.wb;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.etc.dao.SE_ETC_1000DAO;
import chosun.ciis.se.etc.dm.SE_ETC_1000_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1010_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1020_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1030_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1040_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1050_UDM;
import chosun.ciis.se.etc.dm.SE_ETC_1060_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1070_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1090_ADM;
import chosun.ciis.se.etc.ds.SE_ETC_1000_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1010_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1020_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1030_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1040_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1050_UDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1060_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1070_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1090_ADataSet;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;
/**
 * 
 */

public class SE_ETC_1000WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1000_MDataSet ds = null;

        // DM Setting
        SE_ETC_1000_MDM dm 	= new SE_ETC_1000_MDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd		(cmpy_cd	);
        dm.setIncmg_pers	(incmg_pers	);
        
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1000_m(dm);
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
     * 확장수당 지급 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1010_LDataSet ds = null;

        // DM Setting
        SE_ETC_1010_LDM dm = new SE_ETC_1010_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"	, true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
        
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1010_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//            System.out.println("3333333333333333333333::::::::::");
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
     * 확장수당 지급내역 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1020_LDataSet ds = null;

        // DM Setting
        SE_ETC_1020_LDM dm = new SE_ETC_1020_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String pay_seq			= Util.checkString(req.getParameter("pay_seq"	));
        String dept_cd			= Util.checkString(req.getParameter("dept_cd"	));
        
        yymm					= yymm.replaceAll("-", "");
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setPay_seq			(pay_seq	);
        dm.setDept_cd			(dept_cd	);
        
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1020_l(dm);
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
     * 공통거래처 정보를 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1030_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1030_LDataSet ds = null;

        // DM Setting
        SE_ETC_1030_LDM dm = new SE_ETC_1030_LDM();
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String dlco_no			= Util.checkString(req.getParameter("dlco_no"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setDlco_no			(dlco_no	);
        
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1030_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1030_l(dm);
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
     * 확장수당 지급, 확장수당 지급내역 등록, 수정, 삭제    
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_ETC_1040_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_ETC_1040_ADM dm 			= new SE_ETC_1040_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
    	String multiUpdateData2		= Util.checkString(req.getParameter("multiUpDate2"));
    	
    	System.out.println("multiUpdate=" + multiUpdateData);
    	System.out.println("multiUpdate2=" + multiUpdateData2);
    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){
    	
	    	hash 					= getHashMultiUpdateData(multiUpdateData);
	    	String mode				= Util.checkString((String) hash.get("m"          	));             
	    	String yymm				= Util.checkString((String) hash.get("yymm"         ));           
	    	String pay_seq			= Util.checkString((String) hash.get("pay_seq"      ));       
	    	String budg_yymm		= Util.checkString((String) hash.get("budg_yymm"      ));       
	    	String evnt_nm			= Util.checkString((String) hash.get("evnt_nm"      ));       
	    	String dept_cd			= Util.checkString((String) hash.get("dept_cd"      ));       
	    	String pay_mthd_clsf	= Util.checkString((String) hash.get("pay_mthd_clsf")); 
	    	String pay_obj_clsf		= Util.checkString((String) hash.get("pay_obj_clsf" ));   
	    	String tax_yn			= Util.checkString((String) hash.get("tax_yn"       ));         
	    	String uprc				= Util.checkString((String) hash.get("uprc"         ));           
	    	String draft_doc_no		= Util.checkString((String) hash.get("draft_doc_no" ));   
	    	String pay_dt			= Util.checkString((String) hash.get("pay_dt"       ));          
	    	String decid_stat		= Util.checkString((String) hash.get("decid_stat"   ));     
	    	String clos_yn			= Util.checkString((String) hash.get("clos_yn"      ));
	    	String ddqty_yn	   	    = Util.checkString((String) hash.get("ddqty_yn"     ));
	 
	    	yymm					= yymm.replaceAll("-", "");
	    	pay_dt					= pay_dt.replaceAll("-", "");
	    	
	    	dm.setMode        		(mode.toUpperCase()	);      
	    	dm.setYymm				(yymm				);
	    	dm.setPay_seq			(pay_seq			);
	    	dm.setBudg_yymm			(budg_yymm			);
	    	dm.setEvnt_nm			(evnt_nm			);
	    	dm.setDept_cd			(dept_cd			);
	    	dm.setPay_mthd_clsf		(pay_mthd_clsf		);
	    	dm.setPay_obj_clsf		(pay_obj_clsf	  	);
	    	dm.setTax_yn			(tax_yn				);
	    	dm.setUprc				(uprc				);
	    	dm.setDraft_doc_no		(draft_doc_no	  	);
	    	dm.setPay_dt			(pay_dt				);
	    	dm.setDecid_stat		(decid_stat		  	);
	    	dm.setClos_yn			(clos_yn			);
	    	dm.setDdqty_yn			(ddqty_yn			); //유가편입여부(일계표포함여부) 2017.08.25 추가
	 	}
    	
    	if ( !"".equals(multiUpdateData2) ){
	    	hash 						= getHashMultiUpdateData(multiUpdateData2);
	    	
	    	String mode_sub            	= Util.checkString((String) hash.get("m"				));
	    	String yymm_sub				= Util.checkString((String) hash.get("yymm"				));
	    	String pay_seq_sub			= Util.checkString((String) hash.get("pay_seq"			));
	    	String pay_ptcr_seq			= Util.checkString((String) hash.get("pay_ptcr_seq"		));
	    	String recp_pers_nm			= Util.checkString((String) hash.get("recp_pers_nm"		));
	    	String bo_cd				= Util.checkString((String) hash.get("bo_cd"			));
	    	String bo_seq				= Util.checkString((String) hash.get("bo_seq"			));
	    	String dept_cd_sub			= Util.checkString((String) hash.get("dept_cd"			));
	    	String sub_dept_cd			= Util.checkString((String) hash.get("sub_dept_cd"		));
	    	String area_cd				= Util.checkString((String) hash.get("area_cd"			));
	    	String chrg_pers			= Util.checkString((String) hash.get("chrg_pers"		));
	    	String tax_yn_sub			= Util.checkString((String) hash.get("tax_yn"			));
	    	String prn					= Util.checkString((String) hash.get("prn"				));
	    	String medi_cd				= Util.checkString((String) hash.get("medi_cd"			));
	    	String qty					= Util.checkString((String) hash.get("qty"				));
	    	String uprc_sub				= Util.checkString((String) hash.get("uprc"				));
	    	String amt					= Util.checkString((String) hash.get("amt"				));
	    	String incm_tax				= Util.checkString((String) hash.get("incm_tax"			));
	    	String res_tax				= Util.checkString((String) hash.get("res_tax"			));
	    	String acct_no				= Util.checkString((String) hash.get("acct_no"			));
	    	String bank_cd				= Util.checkString((String) hash.get("bank_cd"			));
	    	String rmks					= Util.checkString((String) hash.get("rmks"				));
	    	
	    	yymm_sub					= yymm_sub.replaceAll("-", "");
	    	prn							= prn.replaceAll("-", "");
	    	
	    	dm.setMode_sub            	(mode_sub.toUpperCase()	);
	    	dm.setYymm_sub				(yymm_sub				);
	    	dm.setPay_seq_sub			(pay_seq_sub			);
	    	dm.setPay_ptcr_seq			(pay_ptcr_seq 			);
	    	dm.setRecp_pers_nm			(recp_pers_nm			);
	    	dm.setBo_cd					(bo_cd					);
	    	dm.setBo_seq				(bo_seq			  		);
	    	dm.setDept_cd_sub			(dept_cd_sub			);
	    	dm.setSub_dept_cd			(sub_dept_cd			);
	    	dm.setArea_cd				(area_cd				);
	    	dm.setChrg_pers				(chrg_pers				);
	    	dm.setTax_yn_sub			(tax_yn_sub	  			);
	    	dm.setPrn					(prn					);
	    	dm.setMedi_cd				(medi_cd				);
	    	dm.setQty					(qty					);
	    	dm.setUprc_sub				(uprc_sub		  		);
	    	dm.setAmt					(amt					);
	    	dm.setIncm_tax				(incm_tax		  		);
	    	dm.setRes_tax				(res_tax				);
	    	dm.setAcct_no				(acct_no				);
	    	dm.setBank_cd				(bank_cd				);
	    	dm.setRmks					(rmks				  	);
    	}
    	
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1040_a(dm);
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
     * 확장수당 지급 결재    
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1050_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_ETC_1050_UDataSet ds 	= null;
    	
    	//DM Setting
        SE_ETC_1050_UDM dm 			= new SE_ETC_1050_UDM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
    	
    	System.out.println("multiUpdate=" + multiUpdateData);
    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	
    	Hashtable hash				= new Hashtable();
    	
    	hash 						= getHashMultiUpdateData(multiUpdateData);
    	String mode					= Util.checkString((String) hash.get("m"          	));             
    	String yymm					= Util.checkString((String) hash.get("yymm"         ));           
    	String pay_seq				= Util.checkString((String) hash.get("pay_seq"      ));       
 
    	yymm						= yymm.replaceAll("-", "");
    	
    	dm.setMode       	 		(mode.toUpperCase()	);      
    	dm.setYymm					(yymm				);
    	dm.setPay_seq				(pay_seq			);
    	
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1050_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1050_u(dm);
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
     * 확장수당 마감 처리    
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1060_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_ETC_1060_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_ETC_1060_ADM dm 			= new SE_ETC_1060_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String selldeptcd			= Util.getSessionParameterValue(req, "selldeptcd"	, true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"	));
    	
    	String jsis					= Util.checkString(req.getParameter("jsis"			));		
    	System.out.println("multiUpdate=" + multiUpdateData);
    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	dm.setSelldeptcd			(selldeptcd			);
    	dm.setJsis					(jsis				);
    	Hashtable hash				= new Hashtable();
    	
    	hash 						= getHashMultiUpdateData(multiUpdateData);
    	String mode					= Util.checkString((String) hash.get("m"          	));             
    	String yymm					= Util.checkString((String) hash.get("yymm"         ));           
    	String pay_seq				= Util.checkString((String) hash.get("pay_seq"      ));       
 
    	yymm						= yymm.replaceAll("-", "");
    	
    	dm.setMode        			(mode.toUpperCase()	);      
    	dm.setYymm					(yymm				);
    	dm.setPay_seq				(pay_seq			);
    		
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1060_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1060_a(dm);
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
     * 확장수당 마감 취소 처리    
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1070_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_ETC_1070_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_ETC_1070_ADM dm 			= new SE_ETC_1070_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"	));
    	
    	System.out.println("multiUpdate=" + multiUpdateData);
    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	Hashtable hash				= new Hashtable();
    	
    	hash 						= getHashMultiUpdateData(multiUpdateData);
    	String mode					= Util.checkString((String) hash.get("m"          	));             
    	String yymm					= Util.checkString((String) hash.get("yymm"         ));           
    	String pay_seq				= Util.checkString((String) hash.get("pay_seq"      ));       
 
    	yymm						= yymm.replaceAll("-", "");
    	
    	dm.setMode        			(mode.toUpperCase()	);      
    	dm.setYymm					(yymm				);
    	dm.setPay_seq				(pay_seq			);
    	
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1070_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//        
//        try {
//        	SE_ETC_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1070_a(dm);
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
     * 확장 수당 대상지국 엑셀 저장    
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1090_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_ETC_1090_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_ETC_1090_ADM dm 			= new SE_ETC_1090_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
        
    	 int limitsize = 10*1024*1024;  // 파일크기
         Hashtable ht = new Hashtable();
         String filenm = "";
         File upfile = null;
         
         String imgpath = "/jsp/se/etc/xls_up/";     
         
         String svrRoot = req.getSession().getServletContext().getRealPath("/")+imgpath;

      
  	try {
            MultipartParser multi = new MultipartParser(req, limitsize, true, true, "8859_1");            
             Part part = null;
             
            	for (int i = 0; (part = multi.readNextPart()) != null; i++) {
            		if(part instanceof FilePart){
            			if(((FilePart) part).getFileName() != null) {
            				
            				FilePart filePart = (FilePart) part; 
            				filenm = filePart.getFileName(); 
            			
            				if (filenm != null){
            					File f = new File(svrRoot);
            					if (!f.exists()){
            						f.mkdirs();            					
            					}
            			        upfile = new File(svrRoot);
            					long size = filePart.writeTo(upfile); 
            					
            				}

            			}
            		}else if(part instanceof ParamPart){
            			ht.put(part.getName(), ((ParamPart)part).getStringValue());
            		}
            	}
            	
         } catch (IOException e) {
             throw new AppException("[SE_ETC_1000WB.se_etc_1090_a()]","[SE_ETC_1000WB.se_etc_1090_a()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
         } catch (Exception e) {
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }

        WorkbookSettings settings = new WorkbookSettings();   
         settings.setInitialFileSize(20);
       
         Workbook workbook = null;
         Sheet sheet = null;
         Cell cell = null;
         File xlsfile = new File(svrRoot+"/"+filenm);
         
         
         String dept_nm = ""; //부서명
         String area_nm = ""; //지역명
         String bonm	= ""; //지국명
         String bo_cd	= ""; //지국코드
         String qty		= ""; //수당 지급부수
         String amt		= ""; //수당 지급 금액
         
         try
         {
             //엑셀파일을 인식
        	 
        	 
             workbook = Workbook.getWorkbook(xlsfile);

             //엑셀파일에 포함된 sheet의 배열을 리턴한다.
             //workbook.getSheets();
             
             if( workbook != null)
             {
                 //엑셀파일에서 첫번째 Sheet를 인식
                 sheet = workbook.getSheet(0);

                 if( sheet != null)
                 {
                     //셀인식 Cell a1 = sheet.getCell( 컬럼 Index, 열 Index);
                     //셀 내용 String stringa1 = a1.getContents();

                     //기록물철의 경우 실제 데이터가 시작되는 Row지정
                     int nRowStartIndex = 5;
                     //기록물철의 경우 실제 데이터가 끝 Row지정
                     int nRowEndIndex   = sheet.getColumn(0).length - 1;

                     //기록물철의 경우 실제 데이터가 시작되는 Column지정
                     int nColumnStartIndex = 0;
                     //기록물철의 경우 실제 데이터가 끝나는 Column지정
                     int nColumnEndIndex = sheet.getRow( 2).length - 1;

                     for( int nRow = nRowStartIndex; nRow <= nRowEndIndex; nRow++ )
                     {
                    	 
                    	if(!sheet.getCell( 0, nRow).getContents().equals("")){
	                    	 if(nRow>5){
	                    		 dept_nm = dept_nm + "#";
	                    		 area_nm = area_nm + "#";
	                    		 bonm 	 = bonm + "#";
	                    		 bo_cd 	 = bo_cd + "#";
	                    		 qty     = qty + "#";
	                    		 amt 	 = amt + "#";
	                    	 }
                    		 dept_nm = dept_nm+sheet.getCell( 0, nRow).getContents();                    		
                        	 area_nm = area_nm+sheet.getCell( 1, nRow).getContents();
                        	 bonm 	= bonm+sheet.getCell(2, nRow).getContents();
                        	 bo_cd 	= bo_cd+sheet.getCell(4, nRow).getContents();
                        	 qty 	= qty+sheet.getCell( 5, nRow).getContents();
                        	 amt 	= amt+sheet.getCell( 6, nRow).getContents();
                        	
                    	}
                    
                     }
	                 	
                 }
                 else
                 {
                     System.out.println( "Sheet is null!!" );
                 }
             }
             else
             {
                 System.out.println( "WorkBook is null!!" );
             }
         }
         catch( Exception e)
         {
             e.printStackTrace();
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }    
         finally
         {
             if( workbook != null)
             {
                 workbook.close();
             }
         }
         
     
         //엑셀읽은후 파일삭제
         xlsfile.delete();
         
         String yymm 		= Util.checkString((String)ht.get("yymm"));    //년월
         String pay_seq 	= Util.checkString((String)ht.get("pay_seq"));    //지급순번
    
        
         dm.setCmpy_cd(cmpy_cd);
         dm.setYymm(yymm);
         dm.setPay_seq(pay_seq);
         dm.setDept_nm(dept_nm);
         dm.setArea_nm(area_nm);
         dm.setBonm(bonm);
         dm.setBo_cd(bo_cd);
         dm.setQty(qty);
         dm.setAmt(amt);
         dm.setIncmg_pers_ip(incmg_pers_ip);
         dm.setIncmg_pers(incmg_pers);
       
        try {
        	SE_ETC_1000DAO dao = new SE_ETC_1000DAO();
            ds = dao.se_etc_1090_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

       //  dm.print();
         
//         SE_ETC_1000EJBHome home = (SE_ETC_1000EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1000EJB");
//         
//         try {
//         	SE_ETC_1000EJB ejb = home.create();
//             System.out.println("1111111111111111111111::::::::::");
//             ds = ejb.se_etc_1090_a(dm);
//             System.out.println("2222222222222222222222::::::::::");
//             req.setAttribute("ds", ds);
//         }
//         catch (CreateException e) {
//             SysException se = new SysException(e);
//             System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//             LogManager.getInstance().log(se);
//             throw se;
//         }
//         catch (RemoteException e) {
//             SysException se = new SysException(e);
//             System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//             LogManager.getInstance().log(se);
//             throw se;
//         }
//         
         

         String yyyy = Util.checkString((String)ht.get("yyyy"));    //년도
         
         
 	}
}
