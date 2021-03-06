/***************************************************************************************************
* 파일명 : SE_QTY_3100WB.java
* 기능 : 부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-11
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
import chosun.ciis.se.qty.dao.SE_QTY_3100DAO;
import chosun.ciis.se.qty.dm.SE_QTY_3100_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_3110_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_3120_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_3100_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_3110_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_3120_LDataSet;
/**
 * 
 */

public class SE_QTY_3100WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_3100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_3100_MDataSet ds = null;
		SE_QTY_3100_MDM dm = new SE_QTY_3100_MDM();

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
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
        	SE_QTY_3100DAO dao = new SE_QTY_3100DAO();
            ds = dao.se_qty_3100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_3100EJBHome home = (SE_QTY_3100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_3100EJB");
//			SE_QTY_3100EJB ejb = home.create();
//
//			ds = ejb.se_qty_3100_m(dm);
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
     * 발송부수증감현황 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_3110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_3110_LDataSet ds = null;
		SE_QTY_3110_LDM dm = new SE_QTY_3110_LDM();

		dm.setCmpy_cd			(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIncmg_pers		(Util.getSessionParameterValue(req, "emp_no"	, true));
		
		String team				= Util.checkString(req.getParameter("team"			));
		String part				= Util.checkString(req.getParameter("part"			));
		String area				= Util.checkString(req.getParameter("area"			));
		String bgn_issu_dt		= Util.checkString(req.getParameter("bgn_issu_dt"	));
		String end_issu_dt		= Util.checkString(req.getParameter("end_issu_dt"	));
		String bo_cd			= Util.checkString(req.getParameter("bo_cd"			));
		String send_plac_seq	= Util.checkString(req.getParameter("send_plac_seq"	));
		String medi_cd			= Util.checkString(req.getParameter("medi_cd"		));
		String spsl_gubun		= Util.checkString(req.getParameter("spsl_gubun"	));
		
		dm.setTeam				(team			);
		dm.setPart				(part			);
		dm.setArea				(area			);
		dm.setBgn_issu_dt		(bgn_issu_dt	);
		dm.setEnd_issu_dt		(end_issu_dt	);
		dm.setBo_cd				(bo_cd			);
		dm.setSend_plac_seq		(send_plac_seq	);
		dm.setMedi_cd			(medi_cd		);
		dm.setSpsl_gubun		(spsl_gubun		);
		
        try {
        	SE_QTY_3100DAO dao = new SE_QTY_3100DAO();
            ds = dao.se_qty_3110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
		
//		try {
//			SE_QTY_3100EJBHome home = (SE_QTY_3100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_3100EJB");
//			SE_QTY_3100EJB ejb = home.create();
//
//			ds = ejb.se_qty_3110_l(dm);
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
     * 발송부수증감현황 세부조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_3120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_3120_LDataSet ds = null;
		SE_QTY_3120_LDM dm = new SE_QTY_3120_LDM();

		dm.setCmpy_cd			(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIncmg_pers		(Util.getSessionParameterValue(req, "emp_no"	, true));
		
		String team				= Util.checkString(req.getParameter("team"			));
		String part				= Util.checkString(req.getParameter("part"			));
		String area				= Util.checkString(req.getParameter("area"			));
		String issu_dt			= Util.checkString(req.getParameter("issu_dt"		));
		String bo_cd			= Util.checkString(req.getParameter("bo_cd"			));
		String send_plac_seq	= Util.checkString(req.getParameter("send_plac_seq"	));
		String medi_cd			= Util.checkString(req.getParameter("medi_cd"		));
		String spsl_gubun		= Util.checkString(req.getParameter("spsl_gubun"	));
		String searchForm		= Util.checkString(req.getParameter("searchForm"    ));
		
		issu_dt					= issu_dt.replaceAll("-", "");
		
		dm.setTeam				(team			);
		dm.setPart				(part			);
		dm.setArea				(area			);
		dm.setIssu_dt			(issu_dt		);
		dm.setBo_cd				(bo_cd			);
		dm.setSend_plac_seq		(send_plac_seq	);
		dm.setMedi_cd			(medi_cd		);
		dm.setSpsl_gubun		(spsl_gubun		);
		dm.setSearchForm		(searchForm		);
		
        try {
        	SE_QTY_3100DAO dao = new SE_QTY_3100DAO();
            ds = dao.se_qty_3120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
		
//		try {
//			SE_QTY_3100EJBHome home = (SE_QTY_3100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_3100EJB");
//			SE_QTY_3100EJB ejb = home.create();
//
//			ds = ejb.se_qty_3120_l(dm);
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
