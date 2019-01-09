/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.etccar.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
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
import chosun.ciis.mt.etccar.dm.*;                    
import chosun.ciis.mt.etccar.ds.*;                    
 
/**
 *  
 */

public class MT_ETCCAR_5000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    public void mt_etccar_5100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5100_LDataSet ds = null;
		
		MT_ETCCAR_5100_LDM dm = new MT_ETCCAR_5100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt_fr = Util.checkString(req.getParameter("driv_dt_fr"));
		dm.driv_dt_to = Util.checkString(req.getParameter("driv_dt_to"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.print();

		ds = (MT_ETCCAR_5100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
	public void mt_etccar_5200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5200_LDataSet ds = null;
		
		MT_ETCCAR_5200_LDM dm = new MT_ETCCAR_5200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt_fr = Util.checkString(req.getParameter("driv_dt_fr"));
		dm.driv_dt_to = Util.checkString(req.getParameter("driv_dt_to"));
		dm.oil_kind = Util.checkString(req.getParameter("oil_kind"));
		dm.print();

		ds = (MT_ETCCAR_5200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etccar_5300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5300_LDataSet ds = null;
		
		MT_ETCCAR_5300_LDM dm = new MT_ETCCAR_5300_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt_fr = Util.checkString(req.getParameter("driv_dt_fr"));
		dm.driv_dt_to = Util.checkString(req.getParameter("driv_dt_to"));
		dm.oil_kind = Util.checkString(req.getParameter("oil_kind"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.print();

		ds = (MT_ETCCAR_5300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etccar_5400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5400_LDataSet ds = null;
		
		MT_ETCCAR_5400_LDM dm = new MT_ETCCAR_5400_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.buy_dt_fr = Util.checkString(req.getParameter("buy_dt_fr"));
		dm.buy_dt_to = Util.checkString(req.getParameter("buy_dt_to"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.print();

		ds = (MT_ETCCAR_5400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etccar_5410_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5410_MDataSet ds = null;
		
		MT_ETCCAR_5410_MDM dm = new MT_ETCCAR_5410_MDM();	
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCCAR_5410_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_etccar_5420_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5420_ADataSet ds = null;
		
		MT_ETCCAR_5420_ADM dm = new MT_ETCCAR_5420_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.buy_lent_clsf = Util.checkString(req.getParameter("buy_lent_clsf"));
		dm.control = Util.checkString(req.getParameter("control"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.car_modl = Util.checkString(req.getParameter("car_modl"));
		dm.mnft_cmpy = Util.checkString(req.getParameter("mnft_cmpy"));
		dm.engn_dsplt = Util.checkString(req.getParameter("engn_dsplt"));
		dm.engnclsf = Util.checkString(req.getParameter("engnclsf"));
		dm.gearbx = Util.checkString(req.getParameter("gearbx"));
		dm.rid_nops = Util.checkString(req.getParameter("rid_nops"));
		dm.oil_kind = Util.checkString(req.getParameter("oil_kind"));
		dm.own_clsf = Util.checkString(req.getParameter("own_clsf"));
		dm.use_usag = Util.checkString(req.getParameter("use_usag"));
		dm.cmpy_mang_nm = Util.checkString(req.getParameter("cmpy_mang_nm"));
		dm.use_pers = Util.checkString(req.getParameter("use_pers"));
		dm.buy_dt = Util.checkString(req.getParameter("buy_dt"));
		dm.buy_amt = Util.checkString(req.getParameter("buy_amt"));
		dm.carp_car_clsf = Util.checkString(req.getParameter("carp_car_clsf"));
		dm.carp_car_dt = Util.checkString(req.getParameter("carp_car_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();

		ds = (MT_ETCCAR_5420_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_etccar_5500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");

		MT_ETCCAR_5500_LDataSet ds = null;
		MT_ETCCAR_5500_LDM dm = new MT_ETCCAR_5500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt_fr = Util.checkString(req.getParameter("driv_dt_fr"));
		dm.driv_dt_to = Util.checkString(req.getParameter("driv_dt_to"));

		dm.print();

		ds = (MT_ETCCAR_5500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

}
