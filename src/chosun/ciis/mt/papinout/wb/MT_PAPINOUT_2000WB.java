package chosun.ciis.mt.papinout.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

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

public class MT_PAPINOUT_2000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 작업진행상황 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2100(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2100_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2100_LDM dm = new MT_PAPINOUT_2100_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 작업진행상황 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2101_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2101_LDM dm = new MT_PAPINOUT_2101_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    /**
     * 자재 일괄 마감(마감취소)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2102_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2102_ADM dm = new MT_PAPINOUT_2102_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setJob_clsf(Util.checkString(req.getParameter("job_clsf")));
    	dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPers_ip_addr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_PAPINOUT_2102_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    /**
     * EIS 작업진행상황 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2103(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2103_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2103_LDM dm = new MT_PAPINOUT_2103_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.print();

    	ds = (MT_PAPINOUT_2103_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    /**
     * EIP 마감
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2104(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2104_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2104_ADM dm = new MT_PAPINOUT_2104_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setBase_dt(Util.checkString(req.getParameter("base_dt")));
    	dm.setMg_yn_10(Util.checkString(req.getParameter("mg_yn_10")));
    	dm.setMg_yn_20(Util.checkString(req.getParameter("mg_yn_20")));
    	dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPers_ip_addr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_PAPINOUT_2104_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    /**
     * EIP 마감취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2105(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2105_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2105_ADM dm = new MT_PAPINOUT_2105_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setBase_dt(Util.checkString(req.getParameter("base_dt")));
    	dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPers_ip_addr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_PAPINOUT_2105_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    /**
     * 공장 COMBO SETTING
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2200(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2200_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2200_LDM dm = new MT_PAPINOUT_2200_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (MT_PAPINOUT_2200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 전입/ 전출입 등록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2201(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2201_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2201_ADM dm = new MT_PAPINOUT_2201_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setEwh_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_fac_clsf(Util.checkString(req.getParameter("inout_fac_clsf")));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	dm.matr_cd     = (String)hash.get("matr_cd");
    	dm.dan         = (String)hash.get("purc_uprc");
    	dm.roll        = (String)hash.get("roll");
    	dm.wt          = (String)hash.get("wgt");
    	dm.ibgo_amt    = (String)hash.get("amt");
    	dm.ibgo_vat    = (String)hash.get("vat");
    	dm.print();

    	ds = (MT_PAPINOUT_2201_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 전출 등록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2202(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2202_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2202_ADM dm = new MT_PAPINOUT_2202_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());
     	dm.setOwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setOwh_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_fac_clsf(Util.checkString(req.getParameter("inout_fac_clsf")));
    	dm.setTot_jgwgt(Util.checkString(req.getParameter("tot_jgwgt")));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	System.out.println(multiUpdateData2);
    	String[] converted = convertMultiUpdateData(multiUpdateData2);

		for (int i=0; i<converted.length; i++){
			System.out.println("converted[" + i + "]=" + converted[i] );
		}

    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	dm.matr_cd     = (String)hash.get("matr_cd");
    	dm.dan         = (String)hash.get("purc_uprc");
    	dm.roll        = (String)hash.get("roll");
    	dm.wt          = (String)hash.get("wgt");
    	dm.ibgo_amt    = (String)hash.get("amt");
    	dm.ibgo_vat    = (String)hash.get("vat");
    	dm.cut_err_tms = (String)hash.get("cut_err_tms");

    	dm.medi_cd    = (String)hash2.get("medi_cd");
    	dm.sect_cd    = (String)hash2.get("sect_cd");
    	dm.issu_dt    = (String)hash2.get("issu_dt");
    	dm.prt_dt     = (String)hash2.get("prt_dt");
    	dm.prt_wgt    = (String)hash2.get("prt_wgt");
    	dm.issu_pcnt  = (String)hash2.get("issu_pcnt");
    	dm.clr_pcnt   = (String)hash2.get("clr_pcnt");
    	dm.print();

    	ds = (MT_PAPINOUT_2202_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 전입/전출입 내역 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2203(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2203_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2203_ADM dm = new MT_PAPINOUT_2203_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setEwh_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_fac_clsf(Util.checkString(req.getParameter("inout_fac_clsf")));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	dm.matr_cd     = (String)hash.get("matr_cd");
    	dm.print();

    	ds = (MT_PAPINOUT_2203_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 전출 내역 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2204(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2204_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2204_ADM dm = new MT_PAPINOUT_2204_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setOwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setOwh_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));

    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);


    	dm.matr_cd     = (String)hash.get("matr_cd");

    	dm.issu_dt =  (String)hash2.get("issu_dt");
    	dm.medi_cd =  (String)hash2.get("medi_cd");
    	dm.sect_cd =  (String)hash2.get("sect_cd");

    	dm.print();

    	ds = (MT_PAPINOUT_2204_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 매체별 소모 내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2205(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2205_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2205_LDM dm = new MT_PAPINOUT_2205_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2205_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 전입 내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2206(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2206_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2206_LDM dm = new MT_PAPINOUT_2206_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.setInout_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2206_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 전출내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2207(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2207_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2207_LDM dm = new MT_PAPINOUT_2207_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.setInout_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2207_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 스포츠 소모 중량 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2208(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2208_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2208_LDM dm = new MT_PAPINOUT_2208_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setSomo_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2208_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 심봉수 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2209(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2209_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2209_LDM dm = new MT_PAPINOUT_2209_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setInout_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2209_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 본사 소모량 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2210(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2210_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2210_LDM dm = new MT_PAPINOUT_2210_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.print();

    	ds = (MT_PAPINOUT_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 마감일자 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2211(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2211_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2211_LDM dm = new MT_PAPINOUT_2211_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setInout_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setInout_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2211_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 일 마감
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2212(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2212_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2212_ADM dm = new MT_PAPINOUT_2212_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setPer_ip_addr(Util.checkString(req.getRemoteAddr()));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("magam_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2212_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 마감  취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2213(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2213_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2213_ADM dm = new MT_PAPINOUT_2213_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setPer_ip_addr(Util.checkString(req.getRemoteAddr()));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("magam_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2213_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 소모량 파지량 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2214(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2214_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2214_LDM dm = new MT_PAPINOUT_2214_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2214_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 소모량 파지량 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2216(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2216_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2216_LDM dm = new MT_PAPINOUT_2216_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.print();

    	ds = (MT_PAPINOUT_2216_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 공장 마감 처리
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2217(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2217_MDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2217_MDM dm = new MT_PAPINOUT_2217_MDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setJob_clsf(Util.checkString(req.getParameter("job_clsf")));
    	dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setInout_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
     	dm.setPers_ip_addr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_PAPINOUT_2217_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 공장 마감 처리
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2218(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2218_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2218_LDM dm = new MT_PAPINOUT_2218_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setJob_clsf(Util.checkString(req.getParameter("job_clsf")));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setInout_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2218_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 공장 마감 여부 확인
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2219(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2219_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2219_LDM dm = new MT_PAPINOUT_2219_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2219_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_2220(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2220_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2220_LDM dm = new MT_PAPINOUT_2220_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setGubun(Util.checkString(req.getParameter("inout_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_2223(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2223_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2223_LDM dm = new MT_PAPINOUT_2223_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setInout_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setInout_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2223_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_papinout_2224(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2224_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2224_LDM dm = new MT_PAPINOUT_2224_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf_fr(Util.checkString(req.getParameter("fac_clsf_fr")));
    	dm.setFac_clsf_to(Util.checkString(req.getParameter("fac_clsf_to")));
    	dm.setInout_dt(Util.checkString(req.getParameter("inout_dt")));
    	dm.setInout_clsf(Util.checkString(req.getParameter("inout_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2224_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /*
     * 물품구입결제서 출력
     *
     */
    public void mt_papinout_2225(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2225_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2225_LDM dm = new MT_PAPINOUT_2225_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMagam_dt(Util.checkString(req.getParameter("magam_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2225_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    /*
     * 출고 마감
     *
     */
    public void mt_papinout_2226(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2226_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2226_ADM dm = new MT_PAPINOUT_2226_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setJob_clsf(Util.checkString(req.getParameter("job_clsf")));
    	dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setEwh_dt(Util.checkString(req.getParameter("inout_dt")));
     	dm.setPers_ip_addr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_PAPINOUT_2226_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    /**
     * 공장 COMBO SETTING
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2300(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2300_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2300_LDM dm = new MT_PAPINOUT_2300_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_2300_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 공장 COMBO SETTING
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2301(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2301_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2301_LDM dm = new MT_PAPINOUT_2301_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 전표 생성
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2302(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2302_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2302_ADM dm = new MT_PAPINOUT_2302_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("tax_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2302_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 전표삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2303(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2303_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2303_ADM dm = new MT_PAPINOUT_2303_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("tax_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2303_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 입고 / 전출 등록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2304(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2201_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2201_ADM dm = new MT_PAPINOUT_2201_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.setEwh_clsf(Util.checkString(req.getParameter("ewh_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_fac_clsf(Util.checkString(req.getParameter("inout_fac_clsf")));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	dm.matr_cd     = (String)hash.get("matr_cd");
    	dm.dan         = (String)hash.get("dan");
    	dm.roll        = (String)hash.get("roll");
    	dm.wt          = (String)hash.get("wt");
    	dm.ibgo_amt    = (String)hash.get("today_chg_amt");
    	dm.ibgo_vat    = (String)hash.get("today_chg_vat");
    	dm.print();

    	ds = (MT_PAPINOUT_2201_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 출고  등록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2305(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2202_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2202_ADM dm = new MT_PAPINOUT_2202_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());
    	dm.setOwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.setOwh_clsf(Util.checkString(req.getParameter("ewh_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_fac_clsf(Util.checkString(req.getParameter("inout_fac_clsf")));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	dm.matr_cd     = (String)hash.get("matr_cd");
    	dm.dan         = (String)hash.get("dan");
    	dm.roll        = (String)hash.get("roll");
    	dm.wt          = (String)hash.get("wt");
    	dm.ibgo_amt    = (String)hash.get("today_chg_amt");
    	dm.ibgo_vat    = (String)hash.get("today_chg_vat");
    	dm.cut_err_tms = (String)hash.get("cut_err_tms");
    	dm.print();

    	ds = (MT_PAPINOUT_2202_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 전입/전출입 내역 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2306(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2203_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2203_ADM dm = new MT_PAPINOUT_2203_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.setEwh_clsf(Util.checkString(req.getParameter("ewh_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setInout_fac_clsf(Util.checkString(req.getParameter("inout_fac_clsf")));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	dm.matr_cd     = (String)hash.get("matr_cd");
    	dm.print();

    	ds = (MT_PAPINOUT_2203_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 전출 내역 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2307(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2204_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2204_ADM dm = new MT_PAPINOUT_2204_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setOwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.setOwh_clsf(Util.checkString(req.getParameter("ewh_clsf")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	dm.matr_cd     = (String)hash.get("matr_cd");
    	dm.print();

    	ds = (MT_PAPINOUT_2204_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 공장 COMBO SETTING
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2400(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2400_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2400_LDM dm = new MT_PAPINOUT_2400_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_2400_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 용지입출고 재고 현황조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2401(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2401_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2401_LDM dm = new MT_PAPINOUT_2401_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	String   yy = Util.checkString(req.getParameter("ewh_yy"));
    	String   mm = Util.checkString(req.getParameter("ewh_mm"));
    	dm.setDate_yymm(yy+mm);
    	dm.print();

    	ds = (MT_PAPINOUT_2401_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 선택 된 달의 마감 여부
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2402(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2402_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2402_LDM dm = new MT_PAPINOUT_2402_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMagam_yy(Util.checkString(req.getParameter("ewh_yy")));
    	dm.setMagam_mm(Util.checkString(req.getParameter("ewh_mm")));
    	dm.print();

    	ds = (MT_PAPINOUT_2402_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 공장 COMBO SETTING
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2500(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2500_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2500_LDM dm = new MT_PAPINOUT_2500_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_2500_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 비축분 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2501(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2501_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2501_LDM dm = new MT_PAPINOUT_2501_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	String yy = Util.checkString(req.getParameter("base_yy"));
    	String mm = Util.checkString(req.getParameter("base_mm"));
    	dm.setBase_yymm(yy+mm);
    	dm.setBase_dt(Util.checkString(req.getParameter("base_dt")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.print();

    	ds = (MT_PAPINOUT_2501_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 비축분 등록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2502(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2502_IDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2502_IDM dm = new MT_PAPINOUT_2502_IDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	String yy = Util.checkString(req.getParameter("base_yy"));
    	String mm = Util.checkString(req.getParameter("base_mm"));
    	dm.setSave_yymm(yy+mm);
    	dm.setEwh_plan_roll(Util.checkString(req.getParameter("in_plan_roll")));
    	dm.setEwh_plan_wgt(Util.checkString(req.getParameter("in_plan_wt")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setOwh_plan_roll(Util.checkString(req.getParameter("out_plan_roll")));
    	dm.setOwh_plan_wgt(Util.checkString(req.getParameter("out_plan_wt")));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());
    	dm.setSave_fac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setSave_work_fr_dt(Util.checkString(req.getParameter("job_fr")));
    	dm.setSave_work_to_dt(Util.checkString(req.getParameter("job_to")));
    	dm.print();

    	ds = (MT_PAPINOUT_2502_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 비축분 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2503(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2503_DDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2503_DDM dm = new MT_PAPINOUT_2503_DDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	String yy = Util.checkString(req.getParameter("base_yy"));
    	String mm = Util.checkString(req.getParameter("base_mm"));
    	dm.setSave_yymm(yy+mm);
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setSave_fac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2503_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 공장 COMBO SETTING
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2600(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2600_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2600_LDM dm = new MT_PAPINOUT_2600_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_2600_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 비축업무 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2601(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2601_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2601_LDM dm = new MT_PAPINOUT_2601_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
        dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
        dm.setMov_fac_clsf(Util.checkString(req.getParameter("mov_fac_clsf")));
        dm.setOwh_fr_dt(Util.checkString(req.getParameter("owh_fr_dt")));
        dm.setOwh_to_dt(Util.checkString(req.getParameter("owh_to_dt")));
    	dm.print();

    	ds = (MT_PAPINOUT_2601_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 공장 COMBO SETTING
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2700(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2700_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2700_LDM dm = new MT_PAPINOUT_2700_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_PAPINOUT_2700_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 비축업무 내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2701(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2701_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2701_LDM dm = new MT_PAPINOUT_2701_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setSave_yymm(Util.checkString(req.getParameter("save_yymm")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setSave_fac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2701_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 비축업무 출고 계획조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2702(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2702_LDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2702_LDM dm = new MT_PAPINOUT_2702_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setSave_yymm(Util.checkString(req.getParameter("save_yymm")));
    	dm.setSave_fac_clsf(Util.checkString(req.getParameter("save_fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("save_matr_cd")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();

    	ds = (MT_PAPINOUT_2702_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 내역 등록 수정 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2703(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2703_ADataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2703_ADM dm = new MT_PAPINOUT_2703_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setPer_ip_addr(req.getRemoteAddr());
    	dm.setSave_yymm(Util.checkString(req.getParameter("save_yymm")));
    	dm.setSave_fac_clsf(Util.checkString(req.getParameter("save_fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("save_matr_cd")));

     	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
     	//System.out.println(multiUpdateData);
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

     	dm.fac_clsf      = (String)hash.get("fac_clsf");
     	dm.gubun         =  hash.get("m").toString().toUpperCase();
     	dm.seq           = (String)hash.get("seq");
     	dm.owh_plan_roll = (String)hash.get("owh_plan_roll");
     	dm.owh_plan_wgt  = (String)hash.get("owh_plan_wgt");
     	dm.owh_plan_dt   = (String)hash.get("owh_plan_dt");
    	dm.print();

    	ds = (MT_PAPINOUT_2703_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 내역 등록 내용 일괄 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_2704(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_2704_DDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_2704_DDM dm = new MT_PAPINOUT_2704_DDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setSave_yymm(Util.checkString(req.getParameter("save_yymm")));
    	dm.setSave_fac_clsf(Util.checkString(req.getParameter("save_fac_clsf")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("save_matr_cd")));
    	dm.print();

    	ds = (MT_PAPINOUT_2704_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
}