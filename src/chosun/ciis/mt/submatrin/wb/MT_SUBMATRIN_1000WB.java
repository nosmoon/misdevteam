
package chosun.ciis.mt.submatrin.wb;

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
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;


public class MT_SUBMATRIN_1000WB extends BaseWB {

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
    
    public void mt_submatrin_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1100_MDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1100_MDM dm = new MT_SUBMATRIN_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

        ds = (MT_SUBMATRIN_1100_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    
    public void mt_submatrin_1101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1101_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1101_LDM dm = new MT_SUBMATRIN_1101_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.print();

        ds = (MT_SUBMATRIN_1101_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    /**
     * 부재료 입고 내역 조회 HEAD
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_submatrin_1102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1102_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1102_LDM dm = new MT_SUBMATRIN_1102_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setEwh_dt_fr(Util.checkString(req.getParameter("ewh_dt_fr")));
        dm.setEwh_dt_to(Util.checkString(req.getParameter("ewh_dt_to")));
        dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
        dm.print();
        
        ds = (MT_SUBMATRIN_1102_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 잉크 부재료 입고 내역 조회 HEAD
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_submatrin_1114(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1114_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1114_LDM dm = new MT_SUBMATRIN_1114_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setEwh_dt_fr(Util.checkString(req.getParameter("ewh_dt_fr")));
        dm.setEwh_dt_to(Util.checkString(req.getParameter("ewh_dt_to")));
        dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
        dm.setEwh_clsf(Util.checkString(req.getParameter("ewh_clsf")));
        dm.print();
        
        ds = (MT_SUBMATRIN_1114_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 입고 상세내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_submatrin_1103(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1103_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1103_LDM dm = new MT_SUBMATRIN_1103_LDM();
        dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
        dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
        dm.setSeq(Util.checkString(req.getParameter("seq")));
        dm.print();
        
        ds = (MT_SUBMATRIN_1103_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    /**
     * 자재코드에 따른 그리드 데이터 값 GET
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_submatrin_1104(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1104_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1104_LDM dm = new MT_SUBMATRIN_1104_LDM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
        dm.print();

        ds = (MT_SUBMATRIN_1104_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**
     * 자재코드에 따른 그리드 데이터 값 GET
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_submatrin_1105(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1105_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1105_LDM dm = new MT_SUBMATRIN_1105_LDM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
        dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
        dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
        dm.print();

        ds = (MT_SUBMATRIN_1105_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1106(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1106_ADataSet ds = null;

         // DM Setting
     	MT_SUBMATRIN_1106_ADM dm = new MT_SUBMATRIN_1106_ADM();

     	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));

     	dm.setRv_cmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
     	dm.setRv_occr_dt(Util.checkString(req.getParameter("occr_dt")));
     	dm.setRv_seq(Util.checkString(req.getParameter("seq")));

     	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip(req.getRemoteAddr());
     	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
     	dm.setMake_dt(Util.checkString(req.getParameter("make_dt")));
     	dm.setPurc_clsf(Util.checkString(req.getParameter("purc_clsf")));
     	dm.setProf_type_cd(Util.checkString(req.getParameter("prof_type_cd")));
     	dm.setRcpt_prof_clsf(Util.checkString(req.getParameter("rcpt_prof_clsf")));
     	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
     	dm.setImpt_yy(Util.checkString(req.getParameter("impt_yy")));
     	dm.setImpt_seq(Util.checkString(req.getParameter("impt_seq")));
     	dm.setLeas_clsf(Util.checkString(req.getParameter("leas_clsf")));
     	dm.setIncmg_slip_dt(Util.checkString(req.getParameter("incmg_slip_dt")));
     	dm.setSlip_no(Util.checkString(req.getParameter("slip_no")));
     	dm.setSuply_amt(Util.checkString(req.getParameter("suply_amt")));
     	dm.setVat_amt(Util.checkString(req.getParameter("vat_amt")));
     	dm.setDlco_cd(Util.checkString(req.getParameter("dlco_cd")));
     	dm.setDlco_cd_nm(Util.checkString(req.getParameter("dlco_nm")));
     	dm.setErn(Util.checkString(req.getParameter("ern")));
     	dm.setDlco_clsf_cd(Util.checkString(req.getParameter("dlco_clsf_cd")));
     	dm.setPurc_stmt_no(Util.checkString(req.getParameter("purc_stmt_no")));
     	dm.setSemuro_no(Util.checkString(req.getParameter("semuro_no")));

     	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
     	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
     	//System.out.println(multiUpdateData);
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
     	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

     	dm.gubun       = ((String)hash.get("m")).toUpperCase();
     	dm.matr_cd     = (String)hash.get("matr_cd");
     	dm.matr_cd_nm  = (String)hash.get("matr_nm");
     	dm.ewh_unit    = (String)hash.get("ewh_unit");
     	dm.ewh_uprc    = (String)hash.get("ewh_uprc");
     	dm.ewh_qunt    = (String)hash.get("ewh_qunt");
     	dm.ewh_amt     = (String)hash.get("ewh_amt");
     	dm.ewh_vat     = (String)hash.get("ewh_vat");
     	dm.ewh_budg_cd = (String)hash.get("ewh_budg_cd");
     	dm.owh_budg_cd = (String)hash.get("owh_budg_cd");
     	dm.bo_item_yn  = (String)hash.get("bo_item_yn");
     	dm.medi_cd     = (String)hash.get("medi_cd");
     	dm.medi_ser_no = (String)hash.get("medi_ser_no");
     	dm.use_deptcd  = (String)hash.get("usedeptcd");
     	dm.remk        = (String)hash.get("remk");
     	dm.owh_yn      = (String)hash.get("owh_yn");
     	
     	dm.clam_dt      = (String)hash1.get("clam_dt");
     	dm.clam_seq      = (String)hash1.get("clam_seq");
     	dm.clam_sub_seq  = (String)hash1.get("clam_sub_seq");
     	dm.clam_matr     = (String)hash1.get("clam_matr");
        dm.print();
        
        ds = (MT_SUBMATRIN_1106_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_submatrin_1110(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1110_MDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1110_MDM dm = new MT_SUBMATRIN_1110_MDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.setUser_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (MT_SUBMATRIN_1110_MDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
    	
        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1116(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1116_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1116_ADM dm = new MT_SUBMATRIN_1116_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt_fr")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("magam_dt")));
    	dm.setPer_addr(req.getRemoteAddr());
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1116_ADataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1116_500(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1116_500_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1116_500_ADM dm = new MT_SUBMATRIN_1116_500_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("ewh_dt_fr")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("ewh_dt_to")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("magam_dt")));
    	dm.setPer_addr(req.getRemoteAddr());
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1116_500_ADataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1117(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1117_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1117_LDM dm = new MT_SUBMATRIN_1117_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
    	dm.setFisc_fr_dt(Util.checkString(req.getParameter("fr_dt")));
    	dm.setFisc_to_dt(Util.checkString(req.getParameter("to_dt")));
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
    	dm.print();
    	ds = (MT_SUBMATRIN_1117_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
    	
        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1118(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1118_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1118_LDM dm = new MT_SUBMATRIN_1118_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setSeq_fr(Util.checkString(req.getParameter("fr_seq")));
    	dm.setSeq_to(Util.checkString(req.getParameter("to_seq")));
    	dm.setYy( Util.checkString(req.getParameter("yy")));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1118_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1119(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1119_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1119_ADM dm = new MT_SUBMATRIN_1119_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt_fr")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("magam_dt")));
    	dm.setPer_addr(req.getRemoteAddr());
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1119_ADataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1119_500(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1119_500_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1119_500_ADM dm = new MT_SUBMATRIN_1119_500_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("ewh_dt_fr")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("ewh_dt_to")));
    	dm.setMagam_dt(Util.checkString(req.getParameter("magam_dt")));
    	dm.setPer_addr(req.getRemoteAddr());
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1119_500_ADataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1120(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1120_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1120_LDM dm = new MT_SUBMATRIN_1120_LDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.print();

    	ds = (MT_SUBMATRIN_1120_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
    	
        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1201(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1201_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1201_LDM dm = new MT_SUBMATRIN_1201_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_SUBMATRIN_1201_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
    	
        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1202(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1202_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1202_LDM dm = new MT_SUBMATRIN_1202_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("ewh_dt_fr")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("ewh_dt_to")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fact_cd")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1202_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
/*  
    public void mt_submatrin_1203(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1203_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1203_LDM dm = new MT_SUBMATRIN_1203_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();

    	ds = (MT_SUBMATRIN_1203_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
    	
        req.setAttribute("ds", ds);
    }
  
    public void mt_submatrin_1204(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1204_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1204_LDM dm = new MT_SUBMATRIN_1204_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("ewh_dt_fr")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("ewh_dt_to")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fact_cd")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setPart_cd(Util.checkString(req.getParameter("part_cd")));
    	dm.setPart_clas1(Util.checkString(req.getParameter("part_clas1")));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1204_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
*/
    public void mt_submatrin_1301(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1301_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1301_LDM dm = new MT_SUBMATRIN_1301_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1301_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    
    public void mt_submatrin_1303(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1303_LDataSet ds = null;
    	String TmpDate = "";
        // DM Setting
    	MT_SUBMATRIN_1303_LDM dm = new MT_SUBMATRIN_1303_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setErn(Util.checkString(req.getParameter("ern")));
    	dm.setEwh_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
    	dm.setEwh_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setUse_deptcd(Util.checkString(req.getParameter("dept_cd")));
    	TmpDate = Util.checkString(req.getParameter("imcmg_slip_dt_fr"));

    	if (TmpDate.length() < 1 ) {
    		dm.setImcmg_slip_dt_fr("19000000");
    	} else {
    		dm.setImcmg_slip_dt_fr(TmpDate);
    	}
    	TmpDate = Util.checkString(req.getParameter("imcmg_slip_dt_to"));
    	
    	if (TmpDate.length() < 1 ) {
    		dm.setImcmg_slip_dt_to("99999999");
    	} else {
    		dm.setImcmg_slip_dt_to(TmpDate);
    	}

    	dm.setFac_clsf_cd(Util.checkString(req.getParameter("fact_cd")));
    	dm.setMatr_clas(Util.checkString(req.getParameter("matr_clas")));
    	dm.setChg_emp_no(Util.checkString(req.getParameter("chg_emp_no")));
    	dm.setEwh_budg_cd(Util.checkString(req.getParameter("ewh_budg_cd")));
    	dm.print();
    	
    	ds = (MT_SUBMATRIN_1303_LDataSet) manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }

    public void mt_submatrin_1304(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1304_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1304_LDM dm = new MT_SUBMATRIN_1304_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setErn(Util.checkString(req.getParameter("ern")));
    	dm.setOccr_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
    	dm.setOccr_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
        dm.print();

        ds = (MT_SUBMATRIN_1304_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    public void mt_submatrin_1305(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1305_LDataSet ds = null;
    	String TmpDate = "";
        // DM Setting
    	MT_SUBMATRIN_1305_LDM dm = new MT_SUBMATRIN_1305_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setErn(Util.checkString(req.getParameter("ern")));
    	dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fact_cd")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.setOccr_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
    	dm.setOccr_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
    	dm.setMatr_clas(Util.checkString(req.getParameter("matr_clas")));
    	dm.setChg_emp_no(Util.checkString(req.getParameter("chg_emp_no")));
    	dm.setEwh_budg_cd(Util.checkString(req.getParameter("ewh_budg_cd")));
    	TmpDate = Util.checkString(req.getParameter("imcmg_slip_dt_fr"));
    	
    	if (TmpDate.length() < 1 ){
    		dm.setIncmg_slip_dt_fr("19000000");
    	} else {
    		dm.setIncmg_slip_dt_fr(TmpDate);
    	}
    	TmpDate = Util.checkString(req.getParameter("imcmg_slip_dt_to"));
    	if (TmpDate.length() < 1 ){
    		dm.setIncmg_slip_dt_to("99999999");
    	} else {
    		dm.setIncmg_slip_dt_to(TmpDate);
    	}
        dm.print();

        ds = (MT_SUBMATRIN_1305_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }


    public void mt_submatrin_1400(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRIN_1400_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATRIN_1400_LDM dm = new MT_SUBMATRIN_1400_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setOccr_dt_ft( Util.checkString(req.getParameter("occr_dt_fr")) );
        dm.setOccr_dt_to( Util.checkString(req.getParameter("occr_dt_to")) );
        dm.setEsp( Util.checkString(req.getParameter("ern")) );
        dm.print();
        
        ds = (MT_SUBMATRIN_1400_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
}