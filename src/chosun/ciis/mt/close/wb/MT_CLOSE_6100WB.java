package chosun.ciis.mt.close.wb;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Hashtable;

import javax.ejb.CreateException;
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

import chosun.ciis.mt.close.dao.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;
//import chosun.ciis.mt.close.ejb.MT_CLOSE_8000EJB;
//import chosun.ciis.mt.close.ejb.MT_CLOSE_8000EJBHome;
 

public class MT_CLOSE_6100WB extends BaseWB {

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
    public void mt_close_6100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        MT_CLOSE_6100_MDataSet ds = null;

        // DM Setting
        MT_CLOSE_6100_MDM dm 		= new MT_CLOSE_6100_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String dept_cd          = Util.getSessionParameterValue(req, "deptcd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setDept_cd           (dept_cd    );
        dm.setIncmg_pers		(incmg_pers	);
      
        
        try {
        	MT_CLOSE_6100DAO dao = new MT_CLOSE_6100DAO();
            ds = dao.mt_close_6100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
  
    public void mt_close_6110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_6110_LDataSet ds = null;
		MT_CLOSE_6110_LDM dm = new MT_CLOSE_6110_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true);
        //Util.checkString(req.getParameter("cmpy_cd"));
        String bgn_yymm   = Util.checkString(req.getParameter("bgn_yymm"));
        String end_yymm   = Util.checkString(req.getParameter("end_yymm"));
        String base_mm    = Util.checkString(req.getParameter("base_mm"));
        String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
        String fac_clsf   = Util.checkString(req.getParameter("fac_clsf"));
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBgn_yymm(bgn_yymm);
        dm.setEnd_yymm(end_yymm);
        dm.setBase_mm(base_mm);
        dm.setMedi_cd(medi_cd);
        dm.setFac_clsf(fac_clsf);
        dm.setIncmg_pers(incmg_pers);
        
		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_6110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8000_l(dm);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}

    
    public void mt_close_6120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_6120_LDataSet ds = null;
		MT_CLOSE_6120_LDM dm = new MT_CLOSE_6120_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true);
        //Util.checkString(req.getParameter("cmpy_cd"));
        String bgn_yymm   = Util.checkString(req.getParameter("bgn_yymm"));
        String end_yymm   = Util.checkString(req.getParameter("end_yymm"));
        String base_mm    = Util.checkString(req.getParameter("base_mm"));
        String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
        String fac_clsf   = Util.checkString(req.getParameter("fac_clsf"));
        String sel_clsf   = Util.checkString(req.getParameter("sel_clsf"));
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBgn_yymm(bgn_yymm);
        dm.setEnd_yymm(end_yymm);
        dm.setBase_mm(base_mm);
        dm.setMedi_cd(medi_cd);
        dm.setFac_clsf(fac_clsf);
        dm.setSel_clsf(sel_clsf);
        dm.setIncmg_pers(incmg_pers);
        
		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_6120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8000_l(dm);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
    
    public void mt_close_6130_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_6130_LDataSet ds = null;
		MT_CLOSE_6130_LDM dm = new MT_CLOSE_6130_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true);
        //Util.checkString(req.getParameter("cmpy_cd"));
        String bgn_yymm   = Util.checkString(req.getParameter("bgn_yymm"));
        String end_yymm   = Util.checkString(req.getParameter("end_yymm"));
        String base_mm    = Util.checkString(req.getParameter("base_mm"));
        String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
        String fac_clsf   = Util.checkString(req.getParameter("fac_clsf"));
        String sel_clsf   = Util.checkString(req.getParameter("sel_clsf"));
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBgn_yymm(bgn_yymm);
        dm.setEnd_yymm(end_yymm);
        dm.setBase_mm(base_mm);
        dm.setMedi_cd(medi_cd);
        dm.setFac_clsf(fac_clsf);
        dm.setSel_clsf(sel_clsf);
        dm.setIncmg_pers(incmg_pers);
        
		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_6130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8000_l(dm);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
    
    
}