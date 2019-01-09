package chosun.ciis.mt.papinout.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

public class MT_PAPINOUT_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 시스템구분 공통코드 콤보 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_1001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_1001_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_1001_LDM dm = new MT_PAPINOUT_1001_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
    	
    	ds = (MT_PAPINOUT_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    public void mt_papinout_1002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_1002_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_1002_LDM dm = new MT_PAPINOUT_1002_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.print();
    	
    	ds = (MT_PAPINOUT_1002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_1003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_1003_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_1003_LDM dm = new MT_PAPINOUT_1003_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.print();
    	
    	ds = (MT_PAPINOUT_1003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
}