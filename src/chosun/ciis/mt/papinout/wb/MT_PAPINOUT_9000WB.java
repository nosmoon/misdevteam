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

public class MT_PAPINOUT_9000WB extends BaseWB {

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
    public void mt_papinout_9101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9101_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9101_LDM dm = new MT_PAPINOUT_9101_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_9101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9102_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9102_LDM dm = new MT_PAPINOUT_9102_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();
    	
    	ds = (MT_PAPINOUT_9102_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9103(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9103_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9103_LDM dm = new MT_PAPINOUT_9103_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9103_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9104(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9104_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9104_LDM dm = new MT_PAPINOUT_9104_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9104_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9105(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9105_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9105_LDM dm = new MT_PAPINOUT_9105_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9105_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9106(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9106_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9106_LDM dm = new MT_PAPINOUT_9106_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9106_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9107(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9107_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9107_LDM dm = new MT_PAPINOUT_9107_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9107_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9108(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9108_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9108_LDM dm = new MT_PAPINOUT_9108_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9108_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9109(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9109_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9109_LDM dm = new MT_PAPINOUT_9109_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9109_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9110(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9110_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9110_LDM dm = new MT_PAPINOUT_9110_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9111(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9111_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9111_LDM dm = new MT_PAPINOUT_9111_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9111_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9112(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9112_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9112_LDM dm = new MT_PAPINOUT_9112_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9112_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9113(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9113_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9113_LDM dm = new MT_PAPINOUT_9113_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9113_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9114(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9114_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9114_LDM dm = new MT_PAPINOUT_9114_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9114_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9115(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9115_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9115_LDM dm = new MT_PAPINOUT_9115_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9115_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9116(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9116_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9116_LDM dm = new MT_PAPINOUT_9116_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9116_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9117(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9117_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9117_LDM dm = new MT_PAPINOUT_9117_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9117_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9118(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9118_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9118_LDM dm = new MT_PAPINOUT_9118_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9118_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    public void mt_papinout_9119(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9119_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9119_LDM dm = new MT_PAPINOUT_9119_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setFlag(Util.checkString(req.getParameter("flag")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9119_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    public void mt_papinout_9201(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9201_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9201_LDM dm = new MT_PAPINOUT_9201_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_9201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9202(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9202_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9202_LDM dm = new MT_PAPINOUT_9202_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_claf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_papinout_9203(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_9203_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_9203_LDM dm = new MT_PAPINOUT_9203_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("paper_claf")));
    	dm.print();

    	ds = (MT_PAPINOUT_9203_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
}