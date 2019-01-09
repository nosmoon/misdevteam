/***************************************************************************************************
* ���ϸ� : SE_SND_2900WB.java
* ��� : �߼۰���-Ư�Ǻμ��߼۰���
* �ۼ����� : 2009-03-13
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_2900DAO;
import chosun.ciis.se.snd.dm.SE_SND_2900_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2910_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2920_UDM;
import chosun.ciis.se.snd.ds.SE_SND_2900_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2910_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2920_UDataSet;
/**
 * 
 */

public class SE_SND_2900WB extends BaseWB{

    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_snd_2900_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SND_2900_MDataSet ds = null;
		SE_SND_2900_MDM dm = new SE_SND_2900_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_SND_2900DAO dao = new SE_SND_2900DAO();
            ds = dao.se_snd_2900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_SND_2900EJBHome home = (SE_SND_2900EJBHome)JNDIManager.getInstance().getHome("SE_SND_2900EJB");
//			SE_SND_2900EJB ejb = home.create();
//
//			ds = ejb.se_snd_2900_m(dm);
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
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_snd_2910_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SND_2910_LDataSet ds = null;
		SE_SND_2910_LDM dm = new SE_SND_2910_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.issu_dt1 = Util.checkString(req.getParameter("issu_dt1"));
		dm.issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));
		dm.cnfm_stat_clsf = Util.checkString(req.getParameter("cnfm_stat_clsf"));

        try {
        	SE_SND_2900DAO dao = new SE_SND_2900DAO();
            ds = dao.se_snd_2910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//		try {
//			SE_SND_2900EJBHome home = (SE_SND_2900EJBHome)JNDIManager.getInstance().getHome("SE_SND_2900EJB");
//			SE_SND_2900EJB ejb = home.create();
//
//			ds = ejb.se_snd_2910_l(dm);
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
     * ���� ����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_snd_2920_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SND_2920_UDataSet ds = null;
		SE_SND_2920_UDM dm = new SE_SND_2920_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m");
    	dm.mode_ar = mode_ar.toUpperCase(); 
		dm.reg_dt_ar = (String)hash.get("reg_dt");
		dm.reg_seq_ar = (String)hash.get("reg_seq");
		dm.sect_cd_ar = (String)hash.get("sect_cd");
		dm.route_clsf_ar = (String)hash.get("route_clsf");
		dm.bo_cd_ar = (String)hash.get("bo_cd");
		dm.send_plac_seq_ar = (String)hash.get("send_plac_seq");

        try {
        	SE_SND_2900DAO dao = new SE_SND_2900DAO();
            ds = dao.se_snd_2920_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//		try {
//			SE_SND_2900EJBHome home = (SE_SND_2900EJBHome)JNDIManager.getInstance().getHome("SE_SND_2900EJB");
//			SE_SND_2900EJB ejb = home.create();
//
//			ds = ejb.se_snd_2920_u(dm);
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
