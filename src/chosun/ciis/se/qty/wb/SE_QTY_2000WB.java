/***************************************************************************************************
* 파일명 : SE_QTY_2000WB.java
 * 기능 : 부수관리
 * 작성일자 : 일일변동부수 증감내역
 * 작성자 : 배창희
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
import chosun.ciis.se.qty.dao.SE_QTY_2000DAO;
import chosun.ciis.se.qty.dm.SE_QTY_2000_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_2010_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_2000_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2010_LDataSet;
/**
 * 
 */

public class SE_QTY_2000WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2000_MDataSet ds = null;
		SE_QTY_2000_MDM dm = new SE_QTY_2000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_2000DAO dao = new SE_QTY_2000DAO();
            ds = dao.se_qty_2000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2000EJBHome home = (SE_QTY_2000EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2000EJB");
//			SE_QTY_2000EJB ejb = home.create();
//
//			ds = ejb.se_qty_2000_m(dm);
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
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2010_LDataSet ds = null;
		SE_QTY_2010_LDM dm = new SE_QTY_2010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.schlevel = Util.checkString(req.getParameter("schlevel"));

        try {
        	SE_QTY_2000DAO dao = new SE_QTY_2000DAO();
            ds = dao.se_qty_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2000EJBHome home = (SE_QTY_2000EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2000EJB");
//			SE_QTY_2000EJB ejb = home.create();
//
//			ds = ejb.se_qty_2010_l(dm);
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
