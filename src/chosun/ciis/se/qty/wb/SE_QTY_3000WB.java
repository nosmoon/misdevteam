/***************************************************************************************************
* 파일명 : SE_QTY_3000WB.java
* 기능 : 부수관리 - 발송부수 - 일일발송부수 증감조회
* 작성일자 : 2009-03-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.qty.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_3000DAO;
import chosun.ciis.se.qty.dm.SE_QTY_3000_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_3010_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_3020_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_3000_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_3010_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_3020_LDataSet;
/**
 * 
 */

public class SE_QTY_3000WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_3000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_3000_MDataSet ds = null;
		SE_QTY_3000_MDM dm = new SE_QTY_3000_MDM();

		dm.setCmpy_cd	(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		String auth_gb		= "1";
        String feat_clsf	= "";
        
        Calendar cal 			= Calendar.getInstance();
        String yyyy				= String.valueOf(cal.get(cal.YEAR));
        String mm				= String.valueOf(cal.get(cal.MONTH) + 1);
        mm						= mm.length() == 1 ? "0" + mm : mm;
    	String dd				= String.valueOf(cal.get(cal.DATE));
    	dd						= dd.length() == 1 ? "0" + dd : dd;
        
        dm.setAuth_gb		(auth_gb		);
        dm.setFeat_clsf		(feat_clsf		);
        dm.setBase_dt		(yyyy + mm + dd	);
        
        try {
        	SE_QTY_3000DAO dao = new SE_QTY_3000DAO();
            ds = dao.se_qty_3000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_3000EJBHome home = (SE_QTY_3000EJBHome)JNDIManager.getInstance().getHome("SE_QTY_3000EJB");
//			SE_QTY_3000EJB ejb = home.create();
//
//			ds = ejb.se_qty_3000_m(dm);
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
     * 컬럼수 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_3010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_3010_LDataSet ds = null;
		SE_QTY_3010_LDM dm = new SE_QTY_3010_LDM();

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		
        try {
        	SE_QTY_3000DAO dao = new SE_QTY_3000DAO();
            ds = dao.se_qty_3010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_3000EJBHome home = (SE_QTY_3000EJBHome)JNDIManager.getInstance().getHome("SE_QTY_3000EJB");
//			SE_QTY_3000EJB ejb = home.create();
//
//			ds = ejb.se_qty_3010_l(dm);
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
     * 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_3020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_3020_LDataSet ds = null;
		SE_QTY_3020_LDM dm = new SE_QTY_3020_LDM();

		dm.setCmpy_cd		(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIncmg_pers	(Util.getSessionParameterValue(req, "emp_no"	, true));
		String team			= Util.checkString(req.getParameter("team"		));
		String part			= Util.checkString(req.getParameter("part"		));
		String area			= Util.checkString(req.getParameter("area"		));
		String issu_dt		= Util.checkString(req.getParameter("issu_dt"	));
		String spsl_gubun	= Util.checkString(req.getParameter("spsl_gubun"));
		String schlevel	    = Util.checkString(req.getParameter("schlevel"));
		
		dm.setTeam			(team		);
		dm.setPart			(part		);
		dm.setArea			(area		);
		dm.setIssu_dt		(issu_dt	);
		dm.setSpsl_gubun	(spsl_gubun );
		dm.setSchlevel	    (schlevel );
		
        try {
        	SE_QTY_3000DAO dao = new SE_QTY_3000DAO();
            ds = dao.se_qty_3020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
		
//		try {
//			SE_QTY_3000EJBHome home = (SE_QTY_3000EJBHome)JNDIManager.getInstance().getHome("SE_QTY_3000EJB");
//			SE_QTY_3000EJB ejb = home.create();
//
//			ds = ejb.se_qty_3020_l(dm);
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
