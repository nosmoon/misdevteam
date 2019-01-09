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

package chosun.ciis.mt.report.wb;

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
import chosun.ciis.mt.report.dm.*;
import chosun.ciis.mt.report.ds.*;
import chosun.ciis.mt.submatrcla.dm.MT_SUBMATRCLA_1105_MDM;
import chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_1105_MDataSet;
/** 
 *  
 */

public class MT_REPORT_1000WB extends BaseWB {
	public void mt_report_1105_p(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_REPORT_1105_PDataSet ds = null;
		
		MT_REPORT_1105_PDM dm = new MT_REPORT_1105_PDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mov_inout_dt = Util.checkString(req.getParameter("mov_inout_dt"));
		dm.print(); 
		
		ds = (MT_REPORT_1105_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_report_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_REPORT_1003_LDataSet ds = null;
		MT_REPORT_1003_LDM dm = new MT_REPORT_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.issu_dt = Util.checkString(req.getParameter("cnsm_dt"));

		dm.print(); 
		
		ds = (MT_REPORT_1003_LDataSet)manager.executeCall(dm);  

		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);

		
	}
	public void mt_report_1103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_REPORT_1103_LDataSet ds = null;
		MT_REPORT_1103_LDM dm = new MT_REPORT_1103_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.issu_dt = Util.checkString(req.getParameter("mov_inout_dt"));

		dm.print(); 
		
		ds = (MT_REPORT_1103_LDataSet)manager.executeCall(dm);  

		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);

		
	}
	public void mt_report_1701_500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_REPORT_1701_500_MDataSet ds = null;

        // DM Setting
    	MT_REPORT_1701_500_MDM dm = new MT_REPORT_1701_500_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.print();

        ds = (MT_REPORT_1701_500_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
}
