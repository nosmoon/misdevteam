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

public class MT_PAPINOUT_8000WB extends BaseWB {

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
    public void mt_papinout_8001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8001_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8001_LDM dm = new MT_PAPINOUT_8001_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_8001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8002_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8002_LDM dm = new MT_PAPINOUT_8002_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8003_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8003_LDM dm = new MT_PAPINOUT_8003_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setGubun(Util.checkString(req.getParameter("gubun")));
    	dm.print();

    	ds = (MT_PAPINOUT_8003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8004(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8004_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8004_LDM dm = new MT_PAPINOUT_8004_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8005(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8005_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8005_LDM dm = new MT_PAPINOUT_8005_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8005_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8006(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8006_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8006_LDM dm = new MT_PAPINOUT_8006_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8006_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8007(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8007_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8007_LDM dm = new MT_PAPINOUT_8007_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8007_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8008(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8008_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8008_LDM dm = new MT_PAPINOUT_8008_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8008_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8009(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8009_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8009_LDM dm = new MT_PAPINOUT_8009_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8009_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8010(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8010_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8010_LDM dm = new MT_PAPINOUT_8010_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_8011(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_8011_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_8011_LDM dm = new MT_PAPINOUT_8011_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("search_fr_dt")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("search_to_dt")));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setFlag_1(Util.checkString(req.getParameter("flag_1")));
    	dm.setFlag_2(Util.checkString(req.getParameter("flag_2")));
    	dm.setFlag_3(Util.checkString(req.getParameter("flag_3")));
    	dm.setPrt_clsf(Util.checkString(req.getParameter("prt_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_8011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

}