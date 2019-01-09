/***************************************************************************************************
 * ���ϸ� : SE_TRG_1000WB.java
 * ��� : ������ ��ǥ���
 * �ۼ����� : 2009-03-20
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.trg.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.trg.dao.SE_TRG_1000DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1000_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1010_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1020_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1025_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1030_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1040_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1050_SDM;
import chosun.ciis.se.trg.dm.SE_TRG_1060_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1000_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1010_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1020_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1025_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1030_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1040_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1050_SDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1060_ADataSet;
/**
 * 
 */

public class SE_TRG_1000WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1000_MDataSet ds = null;
		SE_TRG_1000_MDM dm = new SE_TRG_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1000_m(dm);
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
     * ������ ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1010_LDataSet ds = null;
		SE_TRG_1010_LDM dm = new SE_TRG_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1010_l(dm);
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
     * ��ǥ���к� ������ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1020_LDataSet ds = null;
		SE_TRG_1020_LDM dm = new SE_TRG_1020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1020_l(dm);
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
     * ��ǥ���к� �����ٿ�ε�
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1025_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1025_LDataSet ds = null;
		SE_TRG_1025_LDM dm = new SE_TRG_1025_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1025_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1025_l(dm);
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
     * ��ǥ ���/����
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1030_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1030_ADataSet ds = null;
		SE_TRG_1030_ADM dm = new SE_TRG_1030_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.busn_dept_yn = Util.checkString(req.getParameter("busn_dept_yn"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		String trgt_clsf_ar = (String)hash.get("trgt_clsf"); 
		String trgt_01_ar = (String)hash.get("trgt_01"); 
		String trgt_02_ar = (String)hash.get("trgt_02"); 
		String trgt_03_ar = (String)hash.get("trgt_03"); 
		String trgt_04_ar = (String)hash.get("trgt_04"); 
		String trgt_05_ar = (String)hash.get("trgt_05"); 
		String trgt_06_ar = (String)hash.get("trgt_06"); 
		String trgt_07_ar = (String)hash.get("trgt_07"); 
		String trgt_08_ar = (String)hash.get("trgt_08"); 
		String trgt_09_ar = (String)hash.get("trgt_09"); 
		String trgt_10_ar = (String)hash.get("trgt_10"); 
		String trgt_11_ar = (String)hash.get("trgt_11"); 
		String trgt_12_ar = (String)hash.get("trgt_12"); 
		
		dm.mode_ar = mode_ar.toUpperCase();
		dm.trgt_clsf_ar = trgt_clsf_ar;
		dm.trgt_01_ar = trgt_01_ar;
		dm.trgt_02_ar = trgt_02_ar;
		dm.trgt_03_ar = trgt_03_ar;
		dm.trgt_04_ar = trgt_04_ar;
		dm.trgt_05_ar = trgt_05_ar;
		dm.trgt_06_ar = trgt_06_ar;
		dm.trgt_07_ar = trgt_07_ar;
		dm.trgt_08_ar = trgt_08_ar;
		dm.trgt_09_ar = trgt_09_ar;
		dm.trgt_10_ar = trgt_10_ar;
		dm.trgt_11_ar = trgt_11_ar;
		dm.trgt_12_ar = trgt_12_ar;
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1030_a(dm);
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
     * ���� ����/�������
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1040_ADataSet ds = null;
		SE_TRG_1040_ADM dm = new SE_TRG_1040_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		String area_cd_ar = (String)hash.get("area_cd"); 

		dm.mode_ar = mode_ar.toUpperCase();
		dm.area_cd_ar = area_cd_ar;

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1040_a(dm);
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
	public void se_trg_1050_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1050_SDataSet ds = null;
		SE_TRG_1050_SDM dm = new SE_TRG_1050_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1050_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1050_s(dm);
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
     * Ȯ���� ����(��ü����)
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1060_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1060_ADataSet ds = null;
		SE_TRG_1060_ADM dm = new SE_TRG_1060_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
		dm.selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", true);

        try {
        	SE_TRG_1000DAO dao = new SE_TRG_1000DAO();
            ds = dao.se_trg_1060_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_TRG_1000EJBHome home = (SE_TRG_1000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1000EJB");
//			SE_TRG_1000EJB ejb = home.create();
//
//			ds = ejb.se_trg_1060_a(dm);
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
