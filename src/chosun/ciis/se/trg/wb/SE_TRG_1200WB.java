/***************************************************************************************************
 * ���ϸ� : SE_TRG_1200WB.java
 * ��� : ��ǥ�����ȸ
 * �ۼ����� : 2009-04-03
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
import chosun.ciis.se.trg.dao.SE_TRG_1200DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1200_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1210_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1220_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1250_SDM;
import chosun.ciis.se.trg.ds.SE_TRG_1200_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1210_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1220_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1250_SDataSet;
/**
 * 
 */

public class SE_TRG_1200WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1200_MDataSet ds = null;
		SE_TRG_1200_MDM dm = new SE_TRG_1200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1200DAO dao = new SE_TRG_1200DAO();
            ds = dao.se_trg_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1200EJBHome home = (SE_TRG_1200EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1200EJB");
//			SE_TRG_1200EJB ejb = home.create();
//
//			ds = ejb.se_trg_1200_m(dm);
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
     * �������� ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1210_LDataSet ds = null;
		SE_TRG_1210_LDM dm = new SE_TRG_1210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.schlevel = Util.checkString(req.getParameter("schlevel"));

        try {
        	SE_TRG_1200DAO dao = new SE_TRG_1200DAO();
            ds = dao.se_trg_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1200EJBHome home = (SE_TRG_1200EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1200EJB");
//			SE_TRG_1200EJB ejb = home.create();
//
//			ds = ejb.se_trg_1210_l(dm);
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
     * ���� ������ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1220_LDataSet ds = null;
		SE_TRG_1220_LDM dm = new SE_TRG_1220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.schlevel = Util.checkString(req.getParameter("schlevel"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));

        try {
        	SE_TRG_1200DAO dao = new SE_TRG_1200DAO();
            ds = dao.se_trg_1220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_TRG_1200EJBHome home = (SE_TRG_1200EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1200EJB");
//			SE_TRG_1200EJB ejb = home.create();
//
//			ds = ejb.se_trg_1220_l(dm);
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
     * ��ǥ���� ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1250_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1250_SDataSet ds = null;
		SE_TRG_1250_SDM dm = new SE_TRG_1250_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        try {
        	SE_TRG_1200DAO dao = new SE_TRG_1200DAO();
            ds = dao.se_trg_1250_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1200EJBHome home = (SE_TRG_1200EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1200EJB");
//			SE_TRG_1200EJB ejb = home.create();
//
//			ds = ejb.se_trg_1250_s(dm);
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
