/***************************************************************************************************
* 파일명 : SE_SAL_1100WB.java
* 기능 : 판매 - 매출관리 - 월장려금 등록
 * 작성일자 : 2009.03.26
 * 작성자 :   김진경
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_1100DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1105_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1110_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1120_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1105_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1110_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1120_ADataSet;
/**
 * 
 */

public class SE_SAL_1100WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_1105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_1105_LDataSet ds = null;
		SE_SAL_1105_LDM dm = new SE_SAL_1105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_SAL_1100DAO dao = new SE_SAL_1100DAO();
            ds = dao.se_sal_1105_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		SE_SAL_1100EJBHome home = (SE_SAL_1100EJBHome)JNDIManager.getInstance().getHome("SE_SAL_1100EJB");
//		try {
//
//			SE_SAL_1100EJB ejb = home.create();
//
//			ds = ejb.se_sal_1105_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}
		
	public void se_sal_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_1110_LDataSet ds = null;                                                               
		SE_SAL_1110_LDM dm = new SE_SAL_1110_LDM();                                                   
	
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	    dm.yymm = Util.checkString(req.getParameter("yymm"));
	
        try {
        	SE_SAL_1100DAO dao = new SE_SAL_1100DAO();
            ds = dao.se_sal_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {                                                                                         
//			SE_SAL_1100EJBHome home = (SE_SAL_1100EJBHome)JNDIManager.getInstance().getHome("SE_SAL_1100EJB");
//			SE_SAL_1100EJB ejb = home.create();                                                         
//	                                                                                              
//			ds = ejb.se_sal_1110_l(dm);                                                                 
//			req.setAttribute("ds", ds);                                                                 
//		}                                                                                             
//		catch (CreateException e) {                                                                   
//			SysException se = new SysException(e);                                                      
//			LogManager.getInstance().log(se);                                                           
//			throw se;                                                                                   
//		}                                                                                             
//		catch (RemoteException e) {                                                                   
//			SysException se = new SysException(e);                                                      
//			LogManager.getInstance().log(se);                                                           
//			throw se;                                                                                   
//		}                                                                                             
	} 
	
	public void se_sal_1120_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_1120_ADataSet ds = null;
		SE_SAL_1120_ADM dm = new SE_SAL_1120_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		
		String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode = (String)hash.get("m"); 
		dm.mode = mode.toUpperCase();
		dm.basi_yymm = (String)hash.get("basi_yymm");
		dm.rcpm_yymm = (String)hash.get("rcpm_yymm");
		dm.thmm_1tms_rcpm_dt = (String)hash.get("thmm_1tms_rcpm_dt");
		dm.thmm_1tms_rcpm_wkdy = (String)hash.get("thmm_1tms_rcpm_wkdy");
		dm.thmm_2tms_rcpm_dt = (String)hash.get("thmm_2tms_rcpm_dt");
		dm.thmm_2tms_rcpm_wkdy = (String)hash.get("thmm_2tms_rcpm_wkdy");
		dm.thmm_1tms_encur_amt = (String)hash.get("thmm_1tms_encur_amt");
		dm.thmm_2tms_encur_amt = (String)hash.get("thmm_2tms_encur_amt");
		dm.thmm_un_pymt_encur_amt = (String)hash.get("thmm_un_pymt_encur_amt");
		dm.thmm_db_encur_amt = (String)hash.get("thmm_db_encur_amt");
		dm.prvmm_1tms_encur_amt = (String)hash.get("prvmm_1tms_encur_amt");
		dm.prvmm_2tms_encur_amt = (String)hash.get("prvmm_2tms_encur_amt");
		dm.prvmm_un_pymt_encur_amt = (String)hash.get("prvmm_un_pymt_encur_amt");
		dm.boy_fpymt_encur_amt = (String)hash.get("boy_fpymt_encur_amt");
		dm.boy_un_pymt_encur_amt = (String)hash.get("boy_un_pymt_encur_amt");
		dm.stetsell_fpymt_encur_amt = (String)hash.get("stetsell_fpymt_encur_amt");
		dm.stetsell_un_pymt_encur_amt = (String)hash.get("stetsell_un_pymt_encur_amt");
		dm.edus_fpymt_encur_amt = (String)hash.get("edus_fpymt_encur_amt");
		dm.edus_un_pymt_encur_amt = (String)hash.get("edus_un_pymt_encur_amt");
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_SAL_1100DAO dao = new SE_SAL_1100DAO();
            ds = dao.se_sal_1120_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_SAL_1100EJBHome home = (SE_SAL_1100EJBHome)JNDIManager.getInstance().getHome("SE_SAL_1100EJB");
//			SE_SAL_1100EJB ejb = home.create();
//
//			ds = ejb.se_sal_1120_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
	
	
}
