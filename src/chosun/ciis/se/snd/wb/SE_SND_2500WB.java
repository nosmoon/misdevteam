/***************************************************************************************************
* 파일명 : SE_SND_2500WB.java
* 기능 : 판매-발송관리-발송비청구
* 작성일자 : 2009-02-24
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
import chosun.ciis.se.snd.dao.SE_SND_2500DAO;
import chosun.ciis.se.snd.dm.SE_SND_2500_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2510_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2520_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2530_ADM;
import chosun.ciis.se.snd.dm.SE_SND_2540_UDM;
import chosun.ciis.se.snd.dm.SE_SND_2550_ADM;
import chosun.ciis.se.snd.dm.SE_SND_2560_ADM;
import chosun.ciis.se.snd.dm.SE_SND_2580_LDM;
import chosun.ciis.se.snd.ds.SE_SND_2500_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2510_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2520_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2530_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_2540_UDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2550_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_2560_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_2580_LDataSet;
/**
 * 
 */

public class SE_SND_2500WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2500_MDataSet ds = null;

        // DM Setting
        SE_SND_2500_MDM dm = new SE_SND_2500_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2500_m(dm);
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
     * 수송비지급 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2510_LDataSet ds = null;

        // DM Setting
        SE_SND_2510_LDM dm = new SE_SND_2510_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no"	, true);
        String tran_uprc_clas	= Util.checkString(req.getParameter("tran_uprc_clas"));
        String bgn_pay_dt		= Util.checkString(req.getParameter("bgn_pay_dt"	));
        String end_pay_dt		= Util.checkString(req.getParameter("end_pay_dt"	));
        
        bgn_pay_dt				= bgn_pay_dt.replaceAll("-", "");
        end_pay_dt				= end_pay_dt.replaceAll("-", "");
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setTran_uprc_clas(tran_uprc_clas);
        dm.setBgn_pay_dt(bgn_pay_dt);
        dm.setEnd_pay_dt(end_pay_dt);
        
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2510_l(dm);
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
     * 수송비지급 내역조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2520_LDataSet ds = null;

        // DM Setting
        SE_SND_2520_LDM dm = new SE_SND_2520_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String reg_dt			= Util.checkString(req.getParameter("reg_dt"		));
        String reg_seq			= Util.checkString(req.getParameter("reg_seq"		));
        String prt_plac_cd		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf		= Util.checkString(req.getParameter("route_clsf"	));
        String cmpy_clsf		= Util.checkString(req.getParameter("cmpy_clsf"	));
        
        reg_dt					= reg_dt.replaceAll("-", "");
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setReg_dt(reg_dt);
        dm.setReg_seq(reg_seq);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setCmpy_clsf(cmpy_clsf);
        dm.print();
        
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2520_l(dm);
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
     * 수송비 지급, 지급내역 등록 수정 삭제   
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_2530_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_2530_ADM dm 			= new SE_SND_2530_ADM();
        
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
	    	String mode             = Util.checkString((String) hash.get("m"          		));
	    	String reg_dt           = Util.checkString((String) hash.get("reg_dt"           ));
	    	String reg_seq          = Util.checkString((String) hash.get("reg_seq"          ));
	    	String pay_dt           = Util.checkString((String) hash.get("pay_dt"           ));
	    	String tran_uprc_clas	= Util.checkString((String) hash.get("tran_uprc_clas"   ));
	    	String send_yymm        = Util.checkString((String) hash.get("send_yymm"        ));
	    	String send_frdt        = Util.checkString((String) hash.get("send_frdt"        ));
	    	String send_todt        = Util.checkString((String) hash.get("send_todt"        ));
	    	String tot_amt          = Util.checkString((String) hash.get("tot_amt"          ));
	    	String clos_yn          = Util.checkString((String) hash.get("clos_yn"          ));        
	    	String remk1            = Util.checkString((String) hash.get("remk"          	));        
	    	
	    	reg_dt					= reg_dt.replaceAll("-", "");
	    	
	    	dm.setMode        		(mode.toUpperCase()	);      
	    	dm.setReg_dt         	(reg_dt         	);
	    	dm.setReg_seq        	(reg_seq        	);
	    	dm.setTran_uprc_clas	(tran_uprc_clas		);
	    	dm.setPay_dt         	(pay_dt         	);
	    	dm.setSend_yymm      	(send_yymm      	);
	    	dm.setSend_frdt      	(send_frdt      	);
	    	dm.setSend_todt      	(send_todt      	);
	    	dm.setTot_amt        	(tot_amt        	);
	    	dm.setClos_yn        	(clos_yn        	);
	    	dm.setRemk1	        	(remk1	        	);
    	}
    	
    	if ( !"".equals(multiUpdateData2) ){
	    	hash 						= getHashMultiUpdateData(multiUpdateData2);
	    	
	    	String mode_sub            	= Util.checkString((String) hash.get("m"					));
	    	String reg_dt_sub           = Util.checkString((String) hash.get("reg_dt"	       		));         
	    	String reg_seq_sub          = Util.checkString((String) hash.get("reg_seq"      		));        
	    	String ptcr_seq             = Util.checkString((String) hash.get("ptcr_seq"       		));           
	    	String tran_cmpy_cd         = Util.checkString((String) hash.get("tran_cmpy_cd"     	));       
	    	String tran_uprc_cd         = Util.checkString((String) hash.get("tran_uprc_cd"       	));       
	    	String tran_uprc_route_nm   = Util.checkString((String) hash.get("tran_uprc_route_nm"   )); 
	    	String route_clsf           = Util.checkString((String) hash.get("route_clsf"       	));         
	    	String route_cd             = Util.checkString((String) hash.get("route_cd"       		));           
	    	String prt_plac_cd          = Util.checkString((String) hash.get("prt_plac_cd"       	));        
	    	String medi_cd              = Util.checkString((String) hash.get("medi_cd"       		));
	    	String sect_cd              = Util.checkString((String) hash.get("sect_cd"       		));
	    	String tran_cmpy_nm         = Util.checkString((String) hash.get("tran_cmpy_nm"       	));
	    	String dlco_clsf	        = Util.checkString((String) hash.get("dlco_clsf"	       	));
	    	String pay_mthd_clsf        = Util.checkString((String) hash.get("pay_mthd_clsf"       	));
	    	String stmt_clsf	        = Util.checkString((String) hash.get("stmt_clsf"	       	));
	    	String stmt_no		        = Util.checkString((String) hash.get("stmt_no"		       	));
	    	String elec_stmt_yn	        = Util.checkString((String) hash.get("elec_stmt_yn"	       	));
	    	String elec_stmt_id	        = Util.checkString((String) hash.get("elec_stmt_id"	       	));
	    	String rcpt_clsf	        = Util.checkString((String) hash.get("rcpt_clsf"	       	));
	    	String stmt_dt		        = Util.checkString((String) hash.get("stmt_dt"		       	));
	    	String acct_no              = Util.checkString((String) hash.get("acct_no"       		));
	    	String std_tran_uprc        = Util.checkString((String) hash.get("std_tran_uprc"   		));
	    	String pay_tran_uprc        = Util.checkString((String) hash.get("pay_tran_uprc"   		));
	    	String work_dds             = Util.checkString((String) hash.get("work_dds"       		));           
	    	String pay_tran_cost        = Util.checkString((String) hash.get("pay_tran_cost"   		));
	    	String vat			        = Util.checkString((String) hash.get("vat" 			  		));
	    	String car_no               = Util.checkString((String) hash.get("car_no"       		));             
	    	String eps_no               = Util.checkString((String) hash.get("eps_no"       		));
	    	String zip					= Util.checkString((String) hash.get("zip"                  ));
	    	String addr                 = Util.checkString((String) hash.get("addr"       			));               
	    	String dtls_addr            = Util.checkString((String) hash.get("dtls_addr"       		));          
	    	String tel_no               = Util.checkString((String) hash.get("tel_no"       		));
	    	String tran_uprc_clas_sub	= Util.checkString((String) hash.get("tran_uprc_clas"   	));
	    	String bank_cd				= Util.checkString((String) hash.get("bank_cd"   			));
	    	String remk2				= Util.checkString((String) hash.get("remk"   				));
	    	//String grp_assctn_yn        = Util.checkString((String) hash.get("grp_assctn_yn"   				));
	    	
	    	reg_dt_sub					= reg_dt_sub.replaceAll("-", "");
	    	
	    	dm.setMode_sub            	(mode_sub.toUpperCase()	);
	    	dm.setReg_dt_sub           	(reg_dt_sub        		);
	    	dm.setReg_seq_sub          	(reg_seq_sub       		);
	    	dm.setPtcr_seq             	(ptcr_seq          		);
	    	dm.setTran_cmpy_cd         	(tran_cmpy_cd      		);
	    	dm.setTran_uprc_cd         	(tran_uprc_cd      		);
	    	dm.setTran_uprc_route_nm   	(tran_uprc_route_nm		);
	    	dm.setRoute_clsf           	(route_clsf        		);
	    	dm.setRoute_cd             	(route_cd          		);
	    	dm.setPrt_plac_cd          	(prt_plac_cd       		);
	    	dm.setMedi_cd              	(medi_cd           		);
	    	dm.setSect_cd				(sect_cd				);
	    	dm.setTran_cmpy_nm         	(tran_cmpy_nm      		);
	    	dm.setDlco_clsf				(dlco_clsf				);
	    	dm.setPay_mthd_clsf			(pay_mthd_clsf 			);
	    	dm.setStmt_clsf				(stmt_clsf				);
	    	dm.setStmt_no				(stmt_no				);
	    	dm.setElec_stmt_yn			(elec_stmt_yn			);
	    	dm.setElec_stmt_id			(elec_stmt_id			);
	    	dm.setRcpt_clsf				(rcpt_clsf				);
	    	dm.setStmt_dt				(stmt_dt				);	    	
	    	dm.setAcct_no              	(acct_no           		);
	    	dm.setStd_tran_uprc        	(std_tran_uprc     		);
	    	dm.setPay_tran_uprc        	(pay_tran_uprc     		);
	    	dm.setWork_dds             	(work_dds          		);
	    	dm.setPay_tran_cost        	(pay_tran_cost     		);
	    	dm.setVat					(vat					);
	    	dm.setCar_no               	(car_no            		);
	    	dm.setEps_no               	(eps_no            		);
	    	dm.setZip					(zip					);
	    	dm.setAddr                 	(addr              		);
	    	dm.setDtls_addr            	(dtls_addr         		);
	    	dm.setTel_no               	(tel_no            		);
	    	dm.setTran_uprc_clas_sub	(tran_uprc_clas_sub		);
	    	dm.setBank_cd				(bank_cd				);
	    	dm.setRemk2					(remk2					);
	    	//dm.setGrp_assctn_yn			(grp_assctn_yn			);
    	}
    	
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2530_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2530_a(dm);
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
     * 수송비 지급 결재 처리   
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2540_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_2540_UDataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_2540_UDM dm 			= new SE_SND_2540_UDM();
        
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
    	String mode             	= Util.checkString((String) hash.get("m"          		));
    	String reg_dt           	= Util.checkString((String) hash.get("reg_dt"           ));
    	String reg_seq          	= Util.checkString((String) hash.get("reg_seq"          ));
    	
    	reg_dt						= reg_dt.replaceAll("-", "");
    	
    	dm.setMode        			(mode.toUpperCase()	);      
    	dm.setReg_dt         		(reg_dt         	);
    	dm.setReg_seq        		(reg_seq        	);
    	
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2540_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2540_u(dm);
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
     * 수송비 지급 마감 처리   
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2550_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_2550_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_2550_ADM dm 			= new SE_SND_2550_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd"		, true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        String selldeptcd			= Util.getSessionParameterValue(req, "selldeptcd"	, true);
        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	dm.setSelldeptcd			(selldeptcd			);
    	
    	Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
    	String mode             	= Util.checkString((String) hash.get("m"          		));
    	String reg_dt           	= Util.checkString((String) hash.get("reg_dt"           ));
    	String reg_seq          	= Util.checkString((String) hash.get("reg_seq"          ));
    	
    	reg_dt						= reg_dt.replaceAll("-", "");
    	
    	dm.setMode        			(mode.toUpperCase()	);      
    	dm.setReg_dt         		(reg_dt         	);
    	dm.setReg_seq        		(reg_seq        	);
    	
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2550_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2550_a(dm);
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
     * 수송비 지급 마감 취소 처리   
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2560_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_2560_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_2560_ADM dm 			= new SE_SND_2560_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd"		, true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no"			, true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        String selldeptcd			= Util.getSessionParameterValue(req, "selldeptcd"	, true);
        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	dm.setSelldeptcd			(selldeptcd			);
    	
    	Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
    	String mode             	= Util.checkString((String) hash.get("m"          		));
    	String reg_dt           	= Util.checkString((String) hash.get("reg_dt"           ));
    	String reg_seq          	= Util.checkString((String) hash.get("reg_seq"          ));
    	
    	reg_dt						= reg_dt.replaceAll("-", "");
    	
    	dm.setMode        			(mode.toUpperCase()	);      
    	dm.setReg_dt         		(reg_dt         	);
    	dm.setReg_seq        		(reg_seq        	);
    	
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2560_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2560_a(dm);
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
     * 수송비지급 내역조회(엑셀다운로드용)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2580_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2580_LDataSet ds = null;

        // DM Setting
        SE_SND_2580_LDM dm = new SE_SND_2580_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String reg_dt			= Util.checkString(req.getParameter("reg_dt"		));
        String reg_seq			= Util.checkString(req.getParameter("reg_seq"		));
        String prt_plac_cd		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf		= Util.checkString(req.getParameter("route_clsf"	));
        
        reg_dt					= reg_dt.replaceAll("-", "");
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setReg_dt(reg_dt);
        dm.setReg_seq(reg_seq);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setRoute_clsf(route_clsf);
        
        try {
        	SE_SND_2500DAO dao = new SE_SND_2500DAO();
            ds = dao.se_snd_2580_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_SND_2500EJBHome home = (SE_SND_2500EJBHome) JNDIManager.getInstance().getHome("SE_SND_2500EJB");
//        
//        try {
//        	SE_SND_2500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2580_l(dm);
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
