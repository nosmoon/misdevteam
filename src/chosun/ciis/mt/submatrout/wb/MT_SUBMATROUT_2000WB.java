package chosun.ciis.mt.submatrout.wb;

import java.rmi.RemoteException;

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

public class MT_SUBMATROUT_2000WB extends BaseWB {

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
     * 화면 셋팅 공장 콤보
     */
    public void mt_submatrout_2000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_2000_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_2000_LDM dm = new MT_SUBMATROUT_2000_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_2000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 전출입 내역 조회 HEAD
     */
    public void mt_submatrout_2001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_2001_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_2001_LDM dm = new MT_SUBMATROUT_2001_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMov_in_fac_cd(Util.checkString(req.getParameter("fac_clsf_in_1")));    //전입 코드
    	dm.setMov_out_fac_cd(Util.checkString(req.getParameter("fac_clsf_out_1")));  //전출 코드
    	dm.setMov_inout_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
    	dm.setMov_inout_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
    	dm.print();
    	    
    	ds = (MT_SUBMATROUT_2001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }

    /**
     * 부재료 전출입 상세 내역 조회
     */
    public void mt_submatrout_2002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_2002_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_2002_LDM dm = new MT_SUBMATROUT_2002_LDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_2002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 전출입 현재고 조회
     */
    public void mt_submatrout_2003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_2003_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_2003_LDM dm = new MT_SUBMATROUT_2003_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("inout_occr_dt")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf_out_2")));
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_2003_LDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
    	
   	    req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 전출입 마감
     */
    public void mt_submatrout_2004(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_2004_UDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_2004_UDM dm = new MT_SUBMATROUT_2004_UDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setState(Util.checkString(req.getParameter("magamState")));
       	dm.setPer_addr( req.getRemoteAddr());
       	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.print();
   	    
   	    ds = (MT_SUBMATROUT_2004_UDataSet) manager.executeCall(dm);
   	    if (!"".equals(ds.errcode)) {
   	    	System.out.println("DAO..error.");
   	    	throw new AppException(ds.errcode, ds.errmsg);
   	    }
   	    
   	    req.setAttribute("ds", ds);
    }
    
    /**
     * 부재료 전출입 마감
     */
    public void mt_submatrout_2005(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_2005_UDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_2005_UDM dm = new MT_SUBMATROUT_2005_UDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setState(Util.checkString(req.getParameter("magamState")));
   	    dm.setPer_addr( req.getRemoteAddr());
        dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_2005_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }


    /**
     * 부재료 전출입 삭제
     */
    public void mt_submatrout_2006(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_2006_ADataSet ds = null;
    	String   cmpy_cd = "";

        // DM Setting
    	MT_SUBMATROUT_2006_ADM dm = new MT_SUBMATROUT_2006_ADM();
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
        System.out.println(multiUpdateData);
        String[] converted = convertMultiUpdateData(multiUpdateData);
        String gubun			= converted[0];
        String sub_seq			= converted[2];
        String matr_cd          = converted[3];
        //전출 내역
        String mov_out_unit     = converted[5];
        String mov_out_qunt		= converted[7];
        String mov_out_uprc		= converted[8];
        String mov_out_amt      = converted[9];
        //String mov_out_vat		= converted[9]; -- 0으로 셋팅

        String medi_cd   		= converted[11];
        String medi_ser_no		= converted[12];
        String remk             = converted[14];

        //전입 내역
        String mov_in_unit      = converted[5];
        String mov_in_qunt      = converted[7];
        String mov_in_uprc		= converted[8];
        String mov_in_amt		= converted[9];
        //String mov_in_vat       = converted[9];-- 0으로 셋팅

        String mov_in_budg_cd   = converted[16];
        String mov_out_budg_cd	= converted[17];
        cmpy_cd  = Util.checkString(req.getParameter("cmpy_cd"));
        
        //System.out.println("length=" + converted.length);
        
        if( cmpy_cd.equals("")){

    	 	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));

         	dm.setGubun(gubun.toUpperCase());
            dm.setMatr_cd(matr_cd);
            dm.setMedi_cd(medi_cd);
            dm.setMedi_ser_no(medi_ser_no);
            dm.setMov_in_amt(mov_in_amt);
            dm.setMov_in_budg_cd(mov_in_budg_cd);
            dm.setMov_in_qunt(mov_in_qunt);
            dm.setMov_in_unit(mov_in_unit);
            dm.setMov_in_uprc(mov_in_uprc);
            dm.setMov_out_amt(mov_out_amt);
            dm.setMov_out_budg_cd(mov_out_budg_cd);
            dm.setMov_out_qunt(mov_out_qunt);
            dm.setMov_out_unit(mov_out_unit);
            dm.setMov_out_uprc(mov_out_uprc);
            //dm.setMov_in_vat(mov_in_vat);
            //dm.setMov_out_vat(mov_out_vat);
            dm.setRemk(remk);

            dm.setMov_out_fac_cd(Util.checkString(req.getParameter("fac_clsf_out_2")));
            dm.setMov_out_deptcd(Util.checkString(req.getParameter("dept_cd_out")));
            dm.setMov_inout_dt(Util.checkString(req.getParameter("inout_occr_dt")));
            dm.setMov_in_fac_cd(Util.checkString(req.getParameter("fac_clsf_in_2")));
            dm.setMov_in_deptcd(Util.checkString(req.getParameter("dept_cd_in")));
            dm.setIncmg_pers_ipaddr( req.getRemoteAddr());
            dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));

     	}
    	else {
    		dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
    		dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    		dm.setSeq(Util.checkString(req.getParameter("seq")));
    		dm.setMov_out_fac_cd(Util.checkString(req.getParameter("fac_clsf_out_2")));
    		dm.setMov_in_fac_cd(Util.checkString(req.getParameter("fac_clsf_in_2")));

    		dm.setGubun(gubun.toUpperCase());
    		dm.setSub_seq(sub_seq);
    		dm.setMatr_cd(matr_cd);
    	}
   	    dm.print();
   	    
    	ds = (MT_SUBMATROUT_2006_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
}