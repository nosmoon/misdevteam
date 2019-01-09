package chosun.ciis.mt.close.wb;

import java.rmi.RemoteException;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException; 
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;
 
public class MT_CLOSE_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 필름기준정보관리 화면조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_1000_LDataSet ds = null;
		MT_CLOSE_1000_LDM dm = new MT_CLOSE_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_1000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
		 /* EJB 수정전 시작	
		try {
			MT_CLOSE_1000EJBHome home = (MT_CLOSE_1000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_1000EJB");
			MT_CLOSE_1000EJB ejb = home.create();

			ds = ejb.mt_close_1000_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aply_dt = (String)hash.get("aply_dt");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aply_dt = Util.getSessionParameterValue(req,"aply_dt",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.matr_cd = Util.getSessionParameterValue(req,"matr_cd",true);
		*******************************************************************************************/
	}

    /**
     * 필름기준정보관리 화면의 콤보(매체,섹션,공장,자재(필름,현상액) 셋팅
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_1001_LDataSet ds = null;
		MT_CLOSE_1001_LDM dm = new MT_CLOSE_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작
		try {
			MT_CLOSE_1000EJBHome home = (MT_CLOSE_1000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_1000EJB");
			MT_CLOSE_1000EJB ejb = home.create();

			ds = ejb.mt_close_1001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

    /**
     * 필름기준정보관리 데이터 저장 및 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */    
    public void mt_close_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_1002_ADataSet ds = null;
		MT_CLOSE_1002_ADM dm = new MT_CLOSE_1002_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.row = (String)hash.get("rownum");
		dm.aply_from_dt = (String)hash.get("aply_from_dt");
		dm.aply_to_dt = (String)hash.get("aply_to_dt");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		dm.shet_qunt = (String)hash.get("shet_qunt");
		dm.chemi_cd1 = (String)hash.get("chemi_cd1");
		dm.chemi_cd2 = (String)hash.get("chemi_cd2");
		dm.chemi_cd3 = (String)hash.get("chemi_cd3");
		dm.chemi_cd4 = (String)hash.get("chemi_cd4");
		dm.chemi_cd5 = (String)hash.get("chemi_cd5");
		dm.seq = (String)hash.get("seq");

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_1002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작
		try {
			MT_CLOSE_1000EJBHome home = (MT_CLOSE_1000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_1000EJB");
			MT_CLOSE_1000EJB ejb = home.create();

			ds = ejb.mt_close_1002_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.row = (String)hash.get("row");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aply_from_dt = (String)hash.get("aply_from_dt");
		dm.aply_to_dt = (String)hash.get("aply_to_dt");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		dm.shet_qunt = (String)hash.get("shet_qunt");
		dm.chemi_cd1 = (String)hash.get("chemi_cd1");
		dm.chemi_cd2 = (String)hash.get("chemi_cd2");
		dm.chemi_cd3 = (String)hash.get("chemi_cd3");
		dm.chemi_cd4 = (String)hash.get("chemi_cd4");
		dm.chemi_cd5 = (String)hash.get("chemi_cd5");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers_ipaddr = (String)hash.get("incmg_pers_ipaddr");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.row = Util.getSessionParameterValue(req,"row",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aply_from_dt = Util.getSessionParameterValue(req,"aply_from_dt",true);
		dm.aply_to_dt = Util.getSessionParameterValue(req,"aply_to_dt",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.matr_cd = Util.getSessionParameterValue(req,"matr_cd",true);
		dm.shet_qunt = Util.getSessionParameterValue(req,"shet_qunt",true);
		dm.chemi_cd1 = Util.getSessionParameterValue(req,"chemi_cd1",true);
		dm.chemi_cd2 = Util.getSessionParameterValue(req,"chemi_cd2",true);
		dm.chemi_cd3 = Util.getSessionParameterValue(req,"chemi_cd3",true);
		dm.chemi_cd4 = Util.getSessionParameterValue(req,"chemi_cd4",true);
		dm.chemi_cd5 = Util.getSessionParameterValue(req,"chemi_cd5",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.incmg_pers_ipaddr = Util.getSessionParameterValue(req,"incmg_pers_ipaddr",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}

}