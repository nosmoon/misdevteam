/***************************************************************************************************
 * ���ϸ� : SE_TRG_1600WB.java
 * ��� : �����򰡰����ȸ
 * �ۼ����� : 2009-04-06
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.trg.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.trg.dao.SE_TRG_1600DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1600_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1610_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1620_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1630_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1640_LDM;
import chosun.ciis.se.trg.ds.SE_TRG_1600_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1610_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1620_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1630_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1640_LDataSet;
/**
 * 
 */

public class SE_TRG_1600WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1600_MDataSet ds = null;
		SE_TRG_1600_MDM dm = new SE_TRG_1600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1600DAO dao = new SE_TRG_1600DAO();
            ds = dao.se_trg_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1600EJBHome home = (SE_TRG_1600EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1600EJB");
//			SE_TRG_1600EJB ejb = home.create();
//
//			ds = ejb.se_trg_1600_m(dm);
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
     * �����⳻�� ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1610_LDataSet ds = null;
		SE_TRG_1610_LDM dm = new SE_TRG_1610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrgpers = Util.checkString(req.getParameter("chrgpers"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_TRG_1600DAO dao = new SE_TRG_1600DAO();
            ds = dao.se_trg_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1600EJBHome home = (SE_TRG_1600EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1600EJB");
//			SE_TRG_1600EJB ejb = home.create();
//
//			ds = ejb.se_trg_1610_l(dm);
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
     * ���հ�� ������ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1620_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1620_LDataSet ds = null;
		SE_TRG_1620_LDM dm = new SE_TRG_1620_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrgpers = Util.checkString(req.getParameter("chrgpers"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_TRG_1600DAO dao = new SE_TRG_1600DAO();
            ds = dao.se_trg_1620_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1600EJBHome home = (SE_TRG_1600EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1600EJB");
//			SE_TRG_1600EJB ejb = home.create();
//
//			ds = ejb.se_trg_1620_l(dm);
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
     * Ȯ���� ����
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1630_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1630_LDataSet ds = null;
		SE_TRG_1630_LDM dm = new SE_TRG_1630_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrgpers = Util.checkString(req.getParameter("chrgpers"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_TRG_1600DAO dao = new SE_TRG_1600DAO();
            ds = dao.se_trg_1630_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1600EJBHome home = (SE_TRG_1600EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1600EJB");
//			SE_TRG_1600EJB ejb = home.create();
//
//			ds = ejb.se_trg_1630_l(dm);
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
     * �Ǽ����� ����
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1640_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1640_LDataSet ds = null;
		SE_TRG_1640_LDM dm = new SE_TRG_1640_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.chrgpers = Util.checkString(req.getParameter("chrgpers"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_TRG_1600DAO dao = new SE_TRG_1600DAO();
            ds = dao.se_trg_1640_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1600EJBHome home = (SE_TRG_1600EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1600EJB");
//			SE_TRG_1600EJB ejb = home.create();
//
//			ds = ejb.se_trg_1640_l(dm);
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
