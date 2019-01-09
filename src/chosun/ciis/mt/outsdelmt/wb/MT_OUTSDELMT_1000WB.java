package chosun.ciis.mt.outsdelmt.wb;

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

import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.ds.*;

public class MT_OUTSDELMT_1000WB extends BaseWB {

	/**
	 * 멀티레코드처리 row 구분자
	 */
	public final String ROW_SEPARATOR = "|";
	/**
	 * 멀티레코드처리 column 구분자
	 */
	public final String COL_SEPARATOR = "#";


	/**
	 * 외부요소구분 코드 조회
	 */
	public void getMt_outsdelmt_1000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_OUTSDELMT_1000_LDataSet ds = null;

		// DM Setting
		MT_OUTSDELMT_1000_LDM dm = new MT_OUTSDELMT_1000_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();
		
		ds = (MT_OUTSDELMT_1000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
		req.setAttribute("ds", ds);
	}
    
	/**
	 * 외부요소 코드 조회
	 */
	public void getMt_outsdelmt_1001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_OUTSDELMT_1001_LDataSet ds = null;

		// DM Setting
		MT_OUTSDELMT_1001_LDM dm = new MT_OUTSDELMT_1001_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setOutsd_elmt_clsf(Util.checkString(req.getParameter("outsd_elmt_clsf")));
		dm.print();
		
		ds = (MT_OUTSDELMT_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
		req.setAttribute("ds", ds);
	}
    
	/**
	 * 외부요소 조회
	 */
	public void getMt_outsdelmt_1002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_OUTSDELMT_1002_LDataSet ds = null;

		// DM Setting
		MT_OUTSDELMT_1002_LDM dm = new MT_OUTSDELMT_1002_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setAply_dt_fr(Util.checkString(req.getParameter("aply_dt_fr")));
    	dm.setAply_dt_to(Util.checkString(req.getParameter("aply_dt_to")));
    	dm.setOutsd_elmt_clsf(Util.checkString(req.getParameter("outsd_elmt_clsf")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_1002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
		req.setAttribute("ds", ds);
	}
    
	/**
	 * 외부요소 등록(멀티업데이트)
	 */
	public void getMt_outsdelmt_1003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_OUTSDELMT_1003_ADataSet ds = null;
		
        // DM Setting
		MT_OUTSDELMT_1003_ADM dm = new MT_OUTSDELMT_1003_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun				= converted[0];
		String aply_dt				= converted[2];
		String outsd_elmt_clsf		= converted[3];
		String outsd_elmt_cd		= converted[4];
		String unit					= converted[6];
		String amt					= converted[7];
		String occr_dt				= converted[8];
		String seq					= converted[9];
		
		dm.setMode(gubun.toUpperCase());
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setAply_dt(aply_dt);
   	    dm.setOutsd_elmt_clsf(outsd_elmt_clsf);
   	    dm.setOutsd_elmt_cd(outsd_elmt_cd);
   	    dm.setUnit(unit);
   	    dm.setAmt(amt);
   	    dm.setOccr_dt(occr_dt);
   	    dm.setSeq(seq);
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
   	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_1003_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
	/**
	 * 외부요소의 단위 정보 조회
	 */
	public void getMt_outsdelmt_1004(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_OUTSDELMT_1004_LDataSet ds = null;

		// DM Setting
		MT_OUTSDELMT_1004_LDM dm = new MT_OUTSDELMT_1004_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOutsd_elmt_clsf(Util.checkString(req.getParameter("outsd_elmt_clsf")));
    	dm.setOutsd_elmt_cd(Util.checkString(req.getParameter("outsd_elmt_cd")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_1004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
		req.setAttribute("ds", ds);
	}
	
	/**
	 * 외부요소 자동생성
	 */
	public void getMt_outsdelmt_1005(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_OUTSDELMT_1005_ADataSet ds = null;    
		
        // DM Setting
		MT_OUTSDELMT_1005_ADM dm = new MT_OUTSDELMT_1005_ADM();
		dm.setAply_dt(Util.checkString(req.getParameter("aply_dt")));
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
   	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_1005_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
	
    /**
     * 외부요소 월평균정보 조회
     */
    public void getMt_outsdelmt_2000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_2000_LDataSet ds = null;
				
        // DM Setting
		MT_OUTSDELMT_2000_LDM dm = new MT_OUTSDELMT_2000_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setYyyymm(Util.checkString(req.getParameter("yyyymm")));
   	    dm.setOutsd_elmt_clsf(Util.checkString(req.getParameter("outsd_elmt_clsf")));
   	    dm.setOutsd_elmt_clsf(Util.checkString(req.getParameter("outsd_elmt_cd")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_2000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 외부요소를 기반으로 외부요소월월평균 정보 생성
     */
    public void getMt_outsdelmt_2001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_2001_ADataSet ds = null;

        // DM Setting
    	MT_OUTSDELMT_2001_ADM dm = new MT_OUTSDELMT_2001_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setAply_yymm(Util.checkString(req.getParameter("aply_yymm")));
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_2001_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 외부요소월평균 정보 등록(멀티업데이트) 
     */
    public void getMt_outsdelmt_2002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_2002_ADataSet ds = null;

        // DM Setting
    	MT_OUTSDELMT_2002_ADM dm = new MT_OUTSDELMT_2002_ADM();
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun				= converted[0];
		String aply_yymm			= converted[2];
		String outsd_elmt_clsf		= converted[3];
		String outsd_elmt_cd		= converted[4];
		String unit					= converted[6];
		String avg_amt				= converted[7];
		String occr_dt				= converted[8];
		String seq					= converted[9];
		
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOccr_dt(occr_dt);
   	    dm.setSeq(seq);
   	    dm.setMode(gubun.toUpperCase());
   	    dm.setAply_yymm(aply_yymm);
   	    dm.setOutsd_elmt_clsf(outsd_elmt_clsf);
   	    dm.setOutsd_elmt_cd(outsd_elmt_cd);
   	    dm.setUnit(unit);
   	    dm.setAvg_amt(avg_amt);
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_2002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 외부요소 월평균정보 조회
     */
    public void getMt_outsdelmt_3000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_3000_LDataSet ds = null;
				
        // DM Setting
		MT_OUTSDELMT_3000_LDM dm = new MT_OUTSDELMT_3000_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_3000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 외부요소 월평균정보 조회
     */
    public void getMt_outsdelmt_3001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_3001_LDataSet ds = null;
				
        // DM Setting
		MT_OUTSDELMT_3001_LDM dm = new MT_OUTSDELMT_3001_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_3001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 외부요소 변동내역 저장
     */
    public void getMt_outsdelmt_3002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_3002_ADataSet ds = null;
		
        // DM Setting
		MT_OUTSDELMT_3002_ADM dm = new MT_OUTSDELMT_3002_ADM();

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun				= converted[0];
		String outsd_elmt_clsf		= converted[2];
		String outsd_elmt_cd		= converted[3];
		String outsd_elmt_amt		= converted[5];
		String cmps_calc			= converted[6];
		String cmps_cost			= converted[7];
		String chg_cost				= converted[8];
		String sub_seq				= converted[11];
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setSub_seq(sub_seq);
   	    dm.setM_gubun(Util.checkString(req.getParameter("m_gubun")));
   	    dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
   	    dm.setOutsd_elmt_aply_clsf(Util.checkString(req.getParameter("outsd_elmt_aply_clsf")));
   	    dm.setAply_dt(Util.checkString(req.getParameter("aply_dt")));
   	    dm.setAply_yymm(Util.checkString(req.getParameter("aply_yymm")));
   	    dm.setMatr_uprc(Util.checkString(req.getParameter("matr_uprc")));
   	    dm.setRatio_yn(Util.checkString(req.getParameter("ratio_yn")));
   	    dm.setFix_item_cost(Util.checkString(req.getParameter("fix_item_cost")));
   	    dm.setFix_item_ratio(Util.checkString(req.getParameter("fix_item_ratio")));
   	    dm.setMarjn_cost(Util.checkString(req.getParameter("marjn_cost")));
	    dm.setMarjn_ratio(Util.checkString(req.getParameter("marjn_ratio")));
	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
	    dm.setMode(gubun.toUpperCase());
	    dm.setOutsd_elmt_clsf(outsd_elmt_clsf);
	    dm.setOutsd_elmt_cd(outsd_elmt_cd);
	    dm.setOutsd_elmt_amt(outsd_elmt_amt);
	    dm.setCmps_cost(cmps_cost);
	    dm.setCmps_calc(cmps_calc);
	    dm.setChg_cost(chg_cost);
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_3002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 자재코드의 단가 조회
     */
    public void getMt_outsdelmt_3003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_3003_LDataSet ds = null;
				
        // DM Setting
		MT_OUTSDELMT_3003_LDM dm = new MT_OUTSDELMT_3003_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_3003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 외부요소변동의 적용구분에 따른 외부요소코드 조회
     */
    public void getMt_outsdelmt_3004(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_3004_LDataSet ds = null;
				
        // DM Setting
		MT_OUTSDELMT_3004_LDM dm = new MT_OUTSDELMT_3004_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setAply_clsf(Util.checkString(req.getParameter("aply_clsf")));
   	    dm.setAply_yymm(Util.checkString(req.getParameter("aply_yymm")));
   	    dm.setAply_dt(Util.checkString(req.getParameter("aply_dt")));
   	    dm.setOutsd_elmt_clsf(Util.checkString(req.getParameter("outsd_elmt_clsf")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_3004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 자재코드의 단가 조회
     */
    public void getMt_outsdelmt_5000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_OUTSDELMT_5000_LDataSet ds = null;
				
        // DM Setting
		MT_OUTSDELMT_5000_LDM dm = new MT_OUTSDELMT_5000_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.print();
    	
    	ds = (MT_OUTSDELMT_5000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
    	req.setAttribute("ds", ds);
    }
}