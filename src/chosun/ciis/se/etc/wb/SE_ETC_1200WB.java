/***************************************************************************************************
* 파일명 : SE_ETC_1200WB.java
* 기능 : 판매-기타관리-구독료 지급등록
* 작성일자 : 2009-03-05
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.etc.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.etc.dao.SE_ETC_1200DAO;
import chosun.ciis.se.etc.dm.SE_ETC_1200_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1210_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1220_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1230_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1240_UDM;
import chosun.ciis.se.etc.ds.SE_ETC_1200_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1210_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1220_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1230_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1240_UDataSet;
/**
 * 
 */

public class SE_ETC_1200WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1200_MDataSet ds = null;

        // DM Setting
        SE_ETC_1200_MDM dm 		= new SE_ETC_1200_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_ETC_1200DAO dao = new SE_ETC_1200DAO();
            ds = dao.se_etc_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1200EJBHome home = (SE_ETC_1200EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1200EJB");
//        
//        try {
//        	SE_ETC_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1200_m(dm);
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
     * 구독료 지급 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1210_LDataSet ds = null;

        // DM Setting
        SE_ETC_1210_LDM dm = new SE_ETC_1210_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
        
        try {
        	SE_ETC_1200DAO dao = new SE_ETC_1200DAO();
            ds = dao.se_etc_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1200EJBHome home = (SE_ETC_1200EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1200EJB");
//        
//        try {
//        	SE_ETC_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1210_l(dm);
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
     * 구독료 지급내역 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1220_LDataSet ds = null;

        // DM Setting
        SE_ETC_1220_LDM dm = new SE_ETC_1220_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String pay_seq			= Util.checkString(req.getParameter("pay_seq"		));
        String dept_cd			= Util.checkString(req.getParameter("dept_cd"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setPay_seq			(pay_seq	);
        dm.setDept_cd			(dept_cd	);
        
        try {
        	SE_ETC_1200DAO dao = new SE_ETC_1200DAO();
            ds = dao.se_etc_1220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1200EJBHome home = (SE_ETC_1200EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1200EJB");
//        
//        try {
//        	SE_ETC_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1220_l(dm);
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
     * 구독료 지급, 구독료 지급내역 등록, 수정, 삭제    
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_ETC_1230_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_ETC_1230_ADM dm 			= new SE_ETC_1230_ADM();
        
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
	    	String dept_cd			= Util.checkString((String) hash.get("dept_cd"      ));
	    	String pay_descri		= Util.checkString((String) hash.get("pay_descri"   ));
	    	String pay_mthd_clsf	= Util.checkString((String) hash.get("pay_mthd_clsf")); 
	    	String uprc				= Util.checkString((String) hash.get("uprc"         ));           
	    	String draft_doc_no		= Util.checkString((String) hash.get("draft_doc_no" ));   
	    	String pay_dt			= Util.checkString((String) hash.get("pay_dt"       ));          
	    	String decid_stat		= Util.checkString((String) hash.get("decid_stat"   ));     
	    	String clos_yn			= Util.checkString((String) hash.get("clos_yn"      ));       
	 
	    	yymm					= yymm.replaceAll("-", "");
	    	pay_dt					= pay_dt.replaceAll("-", "");
	    	
	    	dm.setMode        		(mode.toUpperCase()	);      
	    	dm.setYymm				(yymm				);
	    	dm.setPay_seq			(pay_seq			);
	    	dm.setDept_cd			(dept_cd			);
	    	dm.setPay_descri		(pay_descri			);
	    	dm.setPay_mthd_clsf		(pay_mthd_clsf		);
	    	dm.setUprc				(uprc				);
	    	dm.setDraft_doc_no		(draft_doc_no	  	);
	    	dm.setPay_dt			(pay_dt				);
	    	dm.setDecid_stat		(decid_stat		  	);
	    	dm.setClos_yn			(clos_yn			);
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
	    	String prn					= Util.checkString((String) hash.get("prn"				));
	    	String medi_cd				= Util.checkString((String) hash.get("medi_cd"			));
	    	String qty					= Util.checkString((String) hash.get("qty"				));
	    	String uprc_sub				= Util.checkString((String) hash.get("uprc"				));
	    	String amt					= Util.checkString((String) hash.get("amt"				));
	    	String acct_no				= Util.checkString((String) hash.get("acct_no"			));
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
	    	dm.setPrn					(prn					);
	    	dm.setMedi_cd				(medi_cd				);
	    	dm.setQty					(qty					);
	    	dm.setUprc_sub				(uprc_sub		  		);
	    	dm.setAmt					(amt					);
	    	dm.setAcct_no				(acct_no				);
	    	dm.setRmks					(rmks				  	);
    	}
    	
        try {
        	SE_ETC_1200DAO dao = new SE_ETC_1200DAO();
            ds = dao.se_etc_1230_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_ETC_1200EJBHome home = (SE_ETC_1200EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1200EJB");
//        
//        try {
//        	SE_ETC_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1230_a(dm);
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
     * 구독료 지급 결재    
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1240_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_ETC_1240_UDataSet ds 	= null;
    	
    	//DM Setting
        SE_ETC_1240_UDM dm 			= new SE_ETC_1240_UDM();
        
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
    	
    	dm.setMode					(mode.toUpperCase()	);
    	dm.setYymm					(yymm				);
    	dm.setPay_seq				(pay_seq			);
    	
        try {
        	SE_ETC_1200DAO dao = new SE_ETC_1200DAO();
            ds = dao.se_etc_1240_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_ETC_1200EJBHome home = (SE_ETC_1200EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1200EJB");
//        
//        try {
//        	SE_ETC_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1240_u(dm);
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
