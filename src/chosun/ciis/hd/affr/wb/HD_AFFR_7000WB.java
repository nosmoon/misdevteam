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

package chosun.ciis.hd.affr.wb;

import java.rmi.RemoteException;
import java.util.*;


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
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */
 
public class HD_AFFR_7000WB extends BaseWB {
 
	public void hd_affr_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_7000_LDataSet ds = null;
		HD_AFFR_7000_LDM dm = new HD_AFFR_7000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.certi_clsf_ck = Util.checkString(req.getParameter("certi_clsf_ck"));
		dm.print();

		ds = (HD_AFFR_7000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_7010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_7010_LDataSet ds = null;
		HD_AFFR_7010_LDM dm = new HD_AFFR_7010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.st_issu_dt = Util.checkString(req.getParameter("st_issu_dt"));
		dm.et_issu_dt = Util.checkString(req.getParameter("et_issu_dt"));
		dm.certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
		dm.certi_clsf_ck = Util.checkString(req.getParameter("certi_clsf_ck"));
		dm.print();
		
		ds = (HD_AFFR_7010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_7011_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_7011_ADataSet ds = null;
		HD_AFFR_7011_ADM dm = new HD_AFFR_7011_ADM();

		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		int idx = 0;
		    
		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);
		
		
		String mode		= converted[0];
		String emp_no	= converted[2];
		String korn_flnm= converted[3];
		
		String certi_clsf	= converted[8];
		String dty_cd		= converted[14];
		String posi_cd		= converted[15];
		String issu_num_shet	= converted[9];
		String usag	= converted[10];
		String occr_dt	= converted[11];
		String seq	= converted[12];
		String cmpy_cd  = converted[13];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.u_id = Util.checkString(req.getParameter("u_id"));
		dm.u_ipadd = Util.checkString(req.getParameter("u_ipadd"));

		dm.setMode(mode.toUpperCase());
		dm.setEmp_no(emp_no);
		dm.setCerti_clsf(certi_clsf);
		dm.setDty_cd(dty_cd);
		dm.setPosi_cd(posi_cd);
		dm.setIssu_num_shet(issu_num_shet);
		dm.setUsag(usag);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		//dm.setCmpy_cd(cmpy_cd);
		dm.setKorn_flnm(korn_flnm);
		dm.print();

		ds = (HD_AFFR_7011_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_7012_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_7012_LDataSet ds = null;
		HD_AFFR_7012_LDM dm = new HD_AFFR_7012_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_AFFR_7012_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}