/***************************************************************************************************
* 파일명 : MT_PRNPAP_7000WB
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-17 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.papord.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.mt.papord.dm.*;                    
import chosun.ciis.mt.papord.ds.*;                 
 
public class MT_PAPORD_8000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    
     
    /**
     * 용지자동발주를 위한 공통의 공장코드 조회
     */
    public void mt_papord_8000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8000_MDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8000_MDM dm = new MT_PAPORD_8000_MDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
    	dm.print();
    	
    	ds = (MT_PAPORD_8000_MDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }

    /**
     * 용지자동발주 대상 조회
     */
    public void mt_papord_8002_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8002_LDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8002_LDM dm = new MT_PAPORD_8002_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.print();
    	
    	ds = (MT_PAPORD_8002_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    /**
     * PM실의 주간발행정보를 조회
     */
    public void mt_papord_8003_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8003_LDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8003_LDM dm = new MT_PAPORD_8003_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOccr_yymm(Util.checkString(req.getParameter("occr_yymm")));
    	dm.print();
    	
    	ds = (MT_PAPORD_8003_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    public void mt_papord_8004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8004_ADataSet ds = null;
		MT_PAPORD_8004_ADM dm = new MT_PAPORD_8004_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		
		dm.occr_dt = Util.checkString((String)hash.get("issu_dt"));
		dm.medi_cd = Util.checkString((String)hash.get("medi_cd"));
		dm.sect_cd = Util.checkString((String)hash.get("sect_cd"));
		dm.issu_pcnt = Util.checkString((String)hash.get("pcnt"));
		dm.slip_qty = Util.checkString((String)hash.get("slip_qty"));
		dm.dual_out_clsf = Util.checkString((String)hash.get("dual_out_clsf"));
		dm.pap_row = Util.checkString((String)hash.get("row_num"));
		dm.papcmpy_cd = Util.checkString((String)hash.get("papcmpy_cd"));
		dm.use_a = Util.checkString((String)hash.get("use_a"));
		dm.use_c = Util.checkString((String)hash.get("use_c"));
		dm.use_b = Util.checkString((String)hash.get("use_b"));
		dm.roll_wgt_a = Util.checkString((String)hash.get("roll_wgt_a"));
		dm.roll_wgt_c = Util.checkString((String)hash.get("roll_wgt_c"));
		dm.roll_wgt_b = Util.checkString((String)hash.get("roll_wgt_b"));
		dm.roll_cnt_a = Util.checkString((String)hash.get("roll_cnt_a"));
		dm.roll_cnt_a = Util.checkString((String)hash.get("roll_cnt_c"));
		dm.roll_cnt_b = Util.checkString((String)hash.get("roll_cnt_b"));
		
		dm.ewh_roll_cnt_a = Util.checkString((String)hash.get("ewh_roll_a"));
		dm.ewh_wgt_a = Util.checkString((String)hash.get("ewh_wgt_a"));
		dm.bal_roll_cnt_a = Util.checkString((String)hash.get("bal_roll_a"));
		dm.bal_wgt_a = Util.checkString((String)hash.get("bal_wgt_a"));
		dm.rs_roll_cnt_a = Util.checkString((String)hash.get("roll_a"));
		dm.rs_wgt_a = Util.checkString((String)hash.get("wgt_a"));
		dm.car_cnt_a = Util.checkString((String)hash.get("car_cnt"));
		
		dm.ewh_roll_cnt_b = Util.checkString((String)hash.get("ewh_roll_b"));
		dm.ewh_wgt_b = Util.checkString((String)hash.get("ewh_wgt_b"));
		dm.bal_roll_cnt_b = Util.checkString((String)hash.get("bal_roll_b"));
		dm.bal_wgt_b = Util.checkString((String)hash.get("bal_wgt_b"));
		dm.rs_roll_cnt_b = Util.checkString((String)hash.get("roll_b"));
		dm.rs_wgt_b = Util.checkString((String)hash.get("wgt_b"));
		dm.car_cnt_b = Util.checkString((String)hash.get("car_b"));
		
		dm.ewh_roll_cnt_c = Util.checkString((String)hash.get("ewh_roll_c"));
		dm.ewh_wgt_c = Util.checkString((String)hash.get("ewh_wgt_c"));
		dm.bal_roll_cnt_c = Util.checkString((String)hash.get("bal_roll_c"));
		dm.bal_wgt_c = Util.checkString((String)hash.get("bal_wgt_c"));
		dm.rs_roll_cnt_c = Util.checkString((String)hash.get("roll_c"));
		dm.rs_wgt_c = Util.checkString((String)hash.get("wgt_c"));
		dm.car_cnt_c = Util.checkString((String)hash.get("car_c"));
		
		dm.setCmpy_cd(cmpy_cd);
		
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_PAPORD_8004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    

    /**
     * 용지사용량을 조회
     */
    public void mt_papord_8005_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8005_LDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8005_LDM dm = new MT_PAPORD_8005_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.dual_out_clsf = Util.checkString(req.getParameter("dual_out_clsf"));
		dm.pcnt = Util.checkString(req.getParameter("pcnt"));
		dm.slip_qty = Util.checkString(req.getParameter("slip_qty"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.add_prt_seq = Util.checkString(req.getParameter("add_prt_seq"));

    	dm.print();
    	
    	ds = (MT_PAPORD_8005_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 용지자동발주 리스트 조회
     */
    public void mt_papord_8101_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8101_LDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8101_LDM dm = new MT_PAPORD_8101_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		
    	dm.print();
    	
    	ds = (MT_PAPORD_8101_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    /**
     * 용지자동발주 대상 조회
     */
    public void mt_papord_8006_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8006_LDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8006_LDM dm = new MT_PAPORD_8006_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();
    	
    	ds = (MT_PAPORD_8006_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    } 
    
    
    public void mt_papord_8007_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8007_UDataSet ds = null;
		MT_PAPORD_8007_UDM dm = new MT_PAPORD_8007_UDM();


		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
		
		dm.setCmpy_cd(cmpy_cd);
		
		dm.print();

		ds = (MT_PAPORD_8007_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    

    
    /**
     * 용지자동발주 리스트 조회
     */
    public void mt_papord_8201_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8201_LDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8201_LDM dm = new MT_PAPORD_8201_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		
    	dm.print();
    	
    	ds = (MT_PAPORD_8201_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 용지자동발주 입고 조회
     */
    public void mt_papord_8008_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_8008_LDataSet ds = null;

        // DM Setting
    	MT_PAPORD_8008_LDM dm = new MT_PAPORD_8008_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.setGubun(Util.checkString(req.getParameter("gubun")));
    	dm.print();
    	
    	ds = (MT_PAPORD_8008_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    public void mt_papord_8009_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8009_DDataSet ds = null;
		MT_PAPORD_8009_DDM dm = new MT_PAPORD_8009_DDM();


		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		
		dm.setCmpy_cd(cmpy_cd);
		
		dm.print();

		ds = (MT_PAPORD_8009_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    
}
