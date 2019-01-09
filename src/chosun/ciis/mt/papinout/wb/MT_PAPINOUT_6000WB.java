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

public class MT_PAPINOUT_6000WB extends BaseWB {

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
    public void mt_papinout_6101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6101_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6101_LDM dm = new MT_PAPINOUT_6101_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_6101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_6102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6102_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6102_LDM dm = new MT_PAPINOUT_6102_LDM();
    	dm.setYyyymm(Util.checkString(req.getParameter("yyyymm")));
    	dm.print();
    	
    	ds = (MT_PAPINOUT_6102_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_6103(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6103_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6103_LDM dm = new MT_PAPINOUT_6103_LDM();
    	dm.setYyyymm(Util.checkString(req.getParameter("yyyymm")));
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDd_fr(Util.checkString(req.getParameter("dd_fr")));
    	dm.setDd_to(Util.checkString(req.getParameter("dd_to")));
    	dm.setEps_no(Util.checkString(req.getParameter("eps_no")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.print();
    	
    	ds = (MT_PAPINOUT_6103_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_6104(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6104_IDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6104_IDM dm = new MT_PAPINOUT_6104_IDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEps_no(Util.checkString(req.getParameter("eps_no")));
    	dm.setYyyymm(Util.checkString(req.getParameter("yyyymm")));
    	dm.setDd_fr(Util.checkString(req.getParameter("dd_fr")));
    	dm.setDd_to(Util.checkString(req.getParameter("dd_to")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setSuply_amt(Util.checkString(req.getParameter("suply_amt")));
    	dm.setVat_amt(Util.checkString(req.getParameter("vat_amt")));
    	dm.per_ip_addr = Util.checkString(req.getRemoteAddr());
		dm.per_id = Util.getSessionParameterValue(req,"emp_no",true);
    	dm.print();
    	
    	ds = (MT_PAPINOUT_6104_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_6105(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6105_DDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6105_DDM dm = new MT_PAPINOUT_6105_DDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setYyyymm(Util.checkString(req.getParameter("yyyymm")));
    	dm.setTax_num(Util.checkString(req.getParameter("stmt_dt")));
    	dm.setTax_seq(Util.checkString(req.getParameter("stmt_seq")));
		dm.per_id = Util.getSessionParameterValue(req,"emp_no",true);
    	dm.print();
    	
    	ds = (MT_PAPINOUT_6105_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_6106(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6106_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6106_LDM dm = new MT_PAPINOUT_6106_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setStmt_dt(Util.checkString(req.getParameter("stmt_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_6106_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    
    public void mt_papinout_6107(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6107_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6107_ADM dm = new MT_PAPINOUT_6107_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setYyyymm(Util.checkString(req.getParameter("yyyymm")));
    	dm.setDd_fr(Util.checkString(req.getParameter("dd_fr")));
    	dm.setDd_to(Util.checkString(req.getParameter("dd_to")));
    	dm.setEps_no(Util.checkString(req.getParameter("eps_no")));
    	dm.setGubun(Util.checkString(req.getParameter("gubun")));
    	dm.per_ip_addr = Util.checkString(req.getRemoteAddr());
		dm.per_id = Util.getSessionParameterValue(req,"emp_no",true);
    	dm.print();
    	
    	ds = (MT_PAPINOUT_6107_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_6201(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6201_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6201_LDM dm = new MT_PAPINOUT_6201_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_6201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_6202(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_6202_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_6202_LDM dm = new MT_PAPINOUT_6202_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_6202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

}