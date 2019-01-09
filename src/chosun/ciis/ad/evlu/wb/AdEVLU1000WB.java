/***************************************************************************************************
* 파일명 : AdMg1000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.evlu.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdEVLU1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void ad_evlu_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_1000_LDataSet ds = null;
		AD_EVLU_1000_LDM dm = new AD_EVLU_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pubc_yyyymmdd = Util.checkString(req.getParameter("search_ymd"));

		dm.print();

		ds = (AD_EVLU_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_1001_MDataSet ds = null;
		AD_EVLU_1001_MDM dm = new AD_EVLU_1001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (AD_EVLU_1001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_1010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_1010_ADataSet ds = null;
		AD_EVLU_1010_ADM dm = new AD_EVLU_1010_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_ymd = Util.checkString(req.getParameter("search_ymd"));
		dm.acct_id = (String)hash.get("acct_id");
		dm.team_cd = (String)hash.get("team_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.paper_scor = (String)hash.get("paper_scor");
		dm.paper_remk = (String)hash.get("paper_remk");
		dm.pubsh_scor = (String)hash.get("pubsh_scor");
		dm.pubsh_remk = (String)hash.get("pubsh_remk");
		dm.pric_scor = (String)hash.get("pric_scor");
		dm.pric_remk = (String)hash.get("pric_remk");
		dm.spcl_scor = (String)hash.get("spcl_scor");
		dm.spcl_remk = (String)hash.get("spcl_remk");
		dm.adj_evlu_scor = (String)hash.get("adj_evlu_scor");
		dm.adj_evlu_remk = (String)hash.get("adj_evlu_remk");
		dm.incmg_pers_ip = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자

		dm.print();

		ds = (AD_EVLU_1010_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_1100_LDataSet ds = null;
		AD_EVLU_1100_LDM dm = new AD_EVLU_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pubc_yyyymmdd = Util.checkString(req.getParameter("search_ym"));
		dm.dept_cd = Util.checkString(req.getParameter("search_dept"));

		dm.print();

		ds = (AD_EVLU_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_2000_LDataSet ds = null;
		AD_EVLU_2000_LDM dm = new AD_EVLU_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pubc_yyyy = Util.checkString(req.getParameter("search_ymd"));

		dm.print();

		ds = (AD_EVLU_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
		System.out.println("DAO..error.");
	    throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ad_evlu_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_1110_LDataSet ds = null;
		AD_EVLU_1110_LDM dm = new AD_EVLU_1110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.pubc_yyyymmdd = Util.checkString(req.getParameter("pubc_yyyymmdd"));
		dm.scorecode = Util.checkString(req.getParameter("scorecode"));

		dm.print();

		ds = (AD_EVLU_1110_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
		System.out.println("DAO..error.");
	    throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_2100_LDataSet ds = null;
		AD_EVLU_2100_LDM dm = new AD_EVLU_2100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pubc_yyyymmdd = Util.checkString(req.getParameter("search_ym"));
		dm.dept_cd = Util.checkString(req.getParameter("search_dept"));

		dm.print();

		ds = (AD_EVLU_2100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
		System.out.println("DAO..error.");
	    throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_2200_LDataSet ds = null;
		AD_EVLU_2200_LDM dm = new AD_EVLU_2200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("search_dept"));
		dm.pubc_yyyymmdd = Util.checkString(req.getParameter("search_ym"));

		dm.print();

		ds = (AD_EVLU_2200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
		System.out.println("DAO..error.");
	    throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_2210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_2210_LDataSet ds = null;
		AD_EVLU_2210_LDM dm = new AD_EVLU_2210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("search_emp_no"));
		dm.pubc_yyyymmdd = Util.checkString(req.getParameter("search_ym"));
		dm.scorecode = Util.checkString(req.getParameter("search_scorcode"));

		dm.print();

		ds = (AD_EVLU_2210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
		System.out.println("DAO..error.");
	    throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void ad_evlu_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISADV");
		
		AD_EVLU_1020_LDataSet ds = null;
		AD_EVLU_1020_LDM dm = new AD_EVLU_1020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (AD_EVLU_1020_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
		System.out.println("DAO..error.");
	    throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
}
