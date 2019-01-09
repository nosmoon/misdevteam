package chosun.ciis.pr.prtexec.wb;

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

import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;
 
public class PR_PRTEXEC_6000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * TAB 1 ���� ���� ���
     */
    /**  
     * �޺� ����
     */ 
	public void pr_prtexec_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_6000_LDataSet ds = null;
		
		PR_PRTEXEC_6000_LDM dm = new PR_PRTEXEC_6000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_strt_yymm = Util.checkString(req.getParameter("aply_strt_yymm"));
		dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
		dm.print();

		ds = (PR_PRTEXEC_6000_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_prtexec_6010_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_6010_MDataSet ds = null;
		
		PR_PRTEXEC_6010_MDM dm = new PR_PRTEXEC_6010_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (PR_PRTEXEC_6010_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_prtexec_6020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_6020_ADataSet ds = null;
		
		PR_PRTEXEC_6020_ADM dm = new PR_PRTEXEC_6020_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.aply_strt_yymm = Util.checkString(req.getParameter("aply_strt_yymm"));
		dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
		dm.ecnt = Util.checkString(req.getParameter("ecnt"));
		dm.edt_nm = Util.checkString(req.getParameter("edt_nm"));
		dm.use_frdt = Util.checkString(req.getParameter("use_frdt"));
		dm.use_susp_dt = Util.checkString(req.getParameter("use_susp_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();

		ds = (PR_PRTEXEC_6020_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}