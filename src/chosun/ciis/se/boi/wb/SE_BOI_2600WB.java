/***************************************************************************************************
* ���ϸ� : SE_BOI_2600WB.java
 * ��� : �ؾ���� - �������°˻�
 * �ۼ����� : 2009-05-29
 * �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.boi.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_2600DAO;
import chosun.ciis.se.boi.dm.SE_BOI_2600_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_2610_LDM;
import chosun.ciis.se.boi.ds.SE_BOI_2600_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2610_LDataSet;
/**
 * 
 */

public class SE_BOI_2600WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2600_MDataSet ds = null;
		SE_BOI_2600_MDM dm = new SE_BOI_2600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_2600DAO dao = new SE_BOI_2600DAO();
            ds = dao.se_boi_2600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2600EJBHome home = (SE_BOI_2600EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2600EJB");
//			SE_BOI_2600EJB ejb = home.create();
//
//			ds = ejb.se_boi_2600_m(dm);
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
     * ����Ʈ ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2610_LDataSet ds = null;
		SE_BOI_2610_LDM dm = new SE_BOI_2610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.searchgubun = Util.checkString(req.getParameter("searchgubun"));

        try {
        	SE_BOI_2600DAO dao = new SE_BOI_2600DAO();
            ds = dao.se_boi_2610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_2600EJBHome home = (SE_BOI_2600EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2600EJB");
//			SE_BOI_2600EJB ejb = home.create();
//
//			ds = ejb.se_boi_2610_l(dm);
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
