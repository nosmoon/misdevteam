package chosun.ciis.mt.submatrout.wb;

import java.rmi.RemoteException;
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

import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

public class MT_SUBMATROUT_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

   /*********************************** 부재료 전출입관리 *************************************/
    /**
     * 발주요청 데이터 셋팅
     */
    public void mt_submatrout_3000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3000_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3000_LDM dm = new MT_SUBMATROUT_3000_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));

   	    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
   	    System.out.println(multiUpdateData);
   	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

   	    dm.matr_cd       = (String)hash.get("matr_cd");
   	    dm.req_cnt       = (String)hash.get("req_cnt");
   	    dm.ordr_req_dd   = (String)hash.get("ordr_req_dd");
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_3000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 화면 셋팅 공장 콤보
     */
    public void mt_submatrout_3100(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3100_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3100_LDM dm = new MT_SUBMATROUT_3100_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_3100_LDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
     
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 발주 요청 내역 조회
     */
    public void mt_submatrout_3101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3101_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3101_LDM dm = new MT_SUBMATROUT_3101_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setOrdr_dt_fr(Util.checkString(req.getParameter("ordr_dt_fr")));
   	    dm.setOrdr_dt_to(Util.checkString(req.getParameter("ordr_dt_to")));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_3101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }

    /**
     * 화면 셋팅 공장 콤보
     */
    public void mt_submatrout_3200(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3200_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3200_LDM dm = new MT_SUBMATROUT_3200_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    //dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
   	    //dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_3200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 발주자 정보
     */
    public void mt_submatrout_3201(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3201_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3201_LDM dm = new MT_SUBMATROUT_3201_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	String emp_no = Util.checkString(req.getParameter("ordr_per"));

    	if(emp_no.equals("init")){
    		dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	}else {
    		dm.setEmp_no(emp_no);
    	}
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_3201_LDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
    	
   	    req.setAttribute("ds", ds);
    }

    /**
     * 부재료 거래처 정보
     */
    public void mt_submatrout_3202(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3202_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3202_LDM dm = new MT_SUBMATROUT_3202_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_3202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 거래처 정보
     */
    public void mt_submatrout_3203(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3203_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3203_LDM dm = new MT_SUBMATROUT_3203_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setOrdr_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
    	dm.setOrdr_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_3203_LDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
     
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 거래처 정보
     */
    public void mt_submatrout_3204(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3204_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3204_LDM dm = new MT_SUBMATROUT_3204_LDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_3204_LDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
    	
   	    req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 자재코드 조회
     */
    public void mt_submatrout_3205(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3205_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3205_LDM dm = new MT_SUBMATROUT_3205_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMatr_nm(Util.checkString(req.getParameter("matr_nm")));
    	dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_3205_LDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
    	
   	    req.setAttribute("ds", ds);
    }

    /**
     * 부재료 발주 입력/수정/건별삭제
     */
    public void mt_submatrout_3206(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3206_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3206_ADM dm = new MT_SUBMATROUT_3206_ADM();
    	String  cmpy_cd   = Util.checkString(req.getParameter("cmpy_cd"));
    	if( cmpy_cd.equals("")){
    		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	}
    	else {
    		dm.setCmpy_cd(cmpy_cd);
    	}
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());

    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));

    	dm.setOrdr_dt( Util.checkString(req.getParameter("ordr_dt")));
    	dm.setDlvs_dt( Util.checkString(req.getParameter("dlvs_dt")));
    	dm.setOrdr_per(Util.checkString(req.getParameter("ordr_per")));
    	dm.setOrdr_per_email(Util.checkString(req.getParameter("ordr_per_email")));
    	dm.setDlvs_fac_cd(Util.checkString(req.getParameter("dlvs_fac_cd")));
    	dm.setRemk(Util.checkString(req.getParameter("remk")));
    	dm.setAmt_pay_mthd(Util.checkString(req.getParameter("amt_pay_mthd")));

    	dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
    	dm.setDlvs_chrg_pers(Util.checkString(req.getParameter("dlco_per")));
   	    dm.setChrg_pers_cntc_plac(Util.checkString(req.getParameter("dlco_telno")));
   	    dm.setChrg_pers_email(Util.checkString(req.getParameter("dlco_email")));

   	    String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
   	    System.out.println(multiUpdateData);
   	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

   	    dm.gubun       =  hash.get("m").toString().toUpperCase();
   	    dm.sub_seq     = (String)hash.get("sub_seq");
   	    dm.matr_cd     = (String)hash.get("matr_cd");
   	    dm.matr_nm     = (String)hash.get("item_nm");
   	    dm.unit        = (String)hash.get("unit");
   	    dm.std_modl    = (String)hash.get("std_modl");
   	    dm.ordr_qunt   = (String)hash.get("ordr_qunt");
   	    dm.ordr_uprc   = (String)hash.get("ordr_uprc");
   	    dm.ordr_amt    = (String)hash.get("ordr_amt");
   	    dm.ordr_req_dd = (String)hash.get("ordr_req_dd");
   	    dm.remk_ar    = (String)hash.get("remk_ar");
    	dm.print();
    	
    	ds = (MT_SUBMATROUT_3206_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 발주 입력/수정/건별삭제
     */
    public void mt_submatrout_3207(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_3207_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_3207_LDM dm = new MT_SUBMATROUT_3207_LDM();
    	dm.setCmpy_cd( Util.checkString(req.getParameter("cmpy_cd")));
    	dm.setOccr_dt( Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq( Util.checkString(req.getParameter("seq")));
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_3207_LDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
     
    	req.setAttribute("ds", ds);
    }

}