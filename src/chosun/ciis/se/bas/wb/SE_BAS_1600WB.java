/***************************************************************************************************
 * 파일명 : SE_BAS_1600WB.java
 * 기능 : 판매 - 기준정보 - 소년편입률관리
 * 작성일자 : 2009-07-17
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bas.dao.SE_BAS_1600DAO;
import chosun.ciis.se.bas.dm.SE_BAS_1600_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1610_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1620_UDM;
import chosun.ciis.se.bas.ds.SE_BAS_1600_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1610_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1620_UDataSet;
/**
 * 
 */

public class SE_BAS_1600WB extends BaseWB{

    /**
     * 초기화면
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bas_1600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BAS_1600_MDataSet ds = null;
		SE_BAS_1600_MDM dm = new SE_BAS_1600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BAS_1600DAO dao = new SE_BAS_1600DAO();
            ds = dao.se_bas_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BAS_1600EJBHome home = (SE_BAS_1600EJBHome)JNDIManager.getInstance().getHome("SE_BAS_1600EJB");
//			SE_BAS_1600EJB ejb = home.create();
//
//			ds = ejb.se_bas_1600_m(dm);
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
    
    /**
     * 내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bas_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BAS_1610_LDataSet ds = null;
		SE_BAS_1610_LDM dm = new SE_BAS_1610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));

        try {
        	SE_BAS_1600DAO dao = new SE_BAS_1600DAO();
            ds = dao.se_bas_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BAS_1600EJBHome home = (SE_BAS_1600EJBHome)JNDIManager.getInstance().getHome("SE_BAS_1600EJB");
//			SE_BAS_1600EJB ejb = home.create();
//
//			ds = ejb.se_bas_1610_l(dm);
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
    
    /**
     * 수정
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_bas_1620_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BAS_1620_UDataSet ds = null;
		SE_BAS_1620_UDM dm = new SE_BAS_1620_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		dm.mode_ar = mode_ar.toUpperCase();
		dm.sell_net_clsf_ar = (String)hash.get("sell_net_clsf");
		dm.aply_mm_ar = (String)hash.get("aply_mm");
		dm.aply_bgn_dd_ar = (String)hash.get("aply_bgn_dd");
		dm.enty_rate_ar = (String)hash.get("enty_rate");
		dm.remk_ar = (String)hash.get("remk");

        try {
        	SE_BAS_1600DAO dao = new SE_BAS_1600DAO();
            ds = dao.se_bas_1620_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
//		try {
//			SE_BAS_1600EJBHome home = (SE_BAS_1600EJBHome)JNDIManager.getInstance().getHome("SE_BAS_1600EJB");
//			SE_BAS_1600EJB ejb = home.create();
//
//			ds = ejb.se_bas_1620_u(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.mode_ar = (String)hash.get("mode_ar");
		dm.sell_net_clsf_ar = (String)hash.get("sell_net_clsf_ar");
		dm.aply_mm_ar = (String)hash.get("aply_mm_ar");
		dm.aply_bgn_dd_ar = (String)hash.get("aply_bgn_dd_ar");
		dm.enty_rate_ar = (String)hash.get("enty_rate_ar");
		dm.remk_ar = (String)hash.get("remk_ar");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		*******************************************************************************************/
	}
    
}
