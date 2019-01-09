/***************************************************************************************************
* 파일명 : SE_QTY_2900WB.java
* 기능 : 부수관리 - 발송부수 - 발송부수변동현황
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_2900DAO;
import chosun.ciis.se.qty.dm.SE_QTY_2900_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_2910_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_2900_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2910_LDataSet;
/**
 * 
 */

public class SE_QTY_2900WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2900_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2900_MDataSet ds = null;
		SE_QTY_2900_MDM dm = new SE_QTY_2900_MDM();

		dm.setCmpy_cd	(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		
        try {
        	SE_QTY_2900DAO dao = new SE_QTY_2900DAO();
            ds = dao.se_qty_2900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2900EJBHome home = (SE_QTY_2900EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2900EJB");
//			SE_QTY_2900EJB ejb = home.create();
//
//			ds = ejb.se_qty_2900_m(dm);
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
     * 발송부수증감조회 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2910_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2910_LDataSet ds = null;
		SE_QTY_2910_LDM dm 		= new SE_QTY_2910_LDM();

		dm.setCmpy_cd			(Util.getSessionParameterValue(req, "cmpycd", true	));
		dm.setIncmg_pers		(Util.getSessionParameterValue(req, "emp_no"	, true	));
		
		String bgn_issu_dt		= Util.checkString(req.getParameter("bgn_issu_dt"	));
		String end_issu_dt		= Util.checkString(req.getParameter("end_issu_dt"	));
		String medi_cd			= Util.checkString(req.getParameter("medi_cd"		));
		String bo_cd			= Util.checkString(req.getParameter("bo_cd"			));
		String send_plac_seq	= Util.checkString(req.getParameter("send_plac_seq"	));
		String gubun			= Util.checkString(req.getParameter("gubun"			));
		String dept_cd			= Util.checkString(req.getParameter("dept_cd"		));
		String part_cd			= Util.checkString(req.getParameter("part_cd"		));
		String area_cd			= Util.checkString(req.getParameter("area_cd"		));
		
		dm.setBgn_issu_dt		(bgn_issu_dt	);
		dm.setEnd_issu_dt		(end_issu_dt	);
		dm.setMedi_cd			(medi_cd		);
		dm.setBo_cd				(bo_cd			);
		dm.setSend_plac_seq		(send_plac_seq	);
		dm.setGubun				(gubun			);
		dm.setDept_cd			(dept_cd		);
		dm.setPart_cd			(part_cd		);
		dm.setArea_cd			(area_cd		);
		
        try {
        	SE_QTY_2900DAO dao = new SE_QTY_2900DAO();
            ds = dao.se_qty_2910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
		
//		try {
//			SE_QTY_2900EJBHome home = (SE_QTY_2900EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2900EJB");
//			SE_QTY_2900EJB ejb = home.create();
//
//			ds = ejb.se_qty_2910_l(dm);
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
