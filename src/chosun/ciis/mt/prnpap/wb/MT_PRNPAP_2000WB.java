/***************************************************************************************************
* 파일명 : MT_PRNPAP_1000WB
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-03-30 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.prnpap.wb;

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
import chosun.ciis.mt.prnpap.dm.*;                    
import chosun.ciis.mt.prnpap.ds.*;      
 
public class MT_PRNPAP_2000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
   
	public void mt_prnpap_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2000_LDataSet ds = null;
		
		MT_PRNPAP_2000_LDM dm = new MT_PRNPAP_2000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no =Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_PRNPAP_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_prnpap_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2010_LDataSet ds = null;
		MT_PRNPAP_2010_LDM dm = new MT_PRNPAP_2010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.prt_plan_dd_pers_fr = Util.checkString(req.getParameter("prt_plan_dd_pers_fr"));
		dm.prt_plan_dd_pers_to = Util.checkString(req.getParameter("prt_plan_dd_pers_to"));
		dm.prt_nm = Util.checkString(req.getParameter("prt_nm"));
		dm.print();

		ds = (MT_PRNPAP_2010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_prnpap_2020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2020_ADataSet ds = null;
		
		MT_PRNPAP_2020_ADM dm = new MT_PRNPAP_2020_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		
		String gubun 	        = converted[0];
		String real_matr_clsf   = converted[7];
		String unit             = converted[5];
		String qunt             = converted[3];
		String uprc             = converted[4];
		String amt              = converted[6];
		String sub_seq          = converted[9];
		String occr_dt_s          = converted[10];
		String endgbn_s = "";

		if(gubun.equals("")) {
			endgbn_s = "E";
		} else {
			endgbn_s = "C";
		}
		dm.setGubun(gubun);
		dm.setReal_matr_clsf(real_matr_clsf);
		dm.setUnit(unit);
		dm.setQunt(qunt);
		dm.setUprc(uprc);
		dm.setAmt(amt);
		dm.setSub_seq(sub_seq);
		dm.setOccr_dt_s(occr_dt_s);
		dm.setEndgbn_s(endgbn_s);
		
		dm.gubun_s = Util.checkString(req.getParameter("gubun_s"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.prt_nm = Util.checkString(req.getParameter("prt_nm"));
		dm.prt_plan_dd_pers = Util.checkString(req.getParameter("prt_plan_dd_pers"));
		dm.prt_frdt = Util.checkString(req.getParameter("prt_frdt"));
		dm.prt_todt = Util.checkString(req.getParameter("prt_todt"));
		dm.prt_tms = Util.checkString(req.getParameter("prt_tms"));
		dm.paper_std = Util.checkString(req.getParameter("paper_std"));
		dm.issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
		dm.clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
		dm.bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
		dm.prt_qty = Util.checkString(req.getParameter("prt_qty"));
		dm.prt_paper_clsf = Util.checkString(req.getParameter("prt_paper_clsf"));
		dm.qunt_out_yn = Util.checkString(req.getParameter("qunt_out_yn"));
		dm.paper_gm = Util.checkString(req.getParameter("paper_gm"));
		dm.brk_rate = Util.checkString(req.getParameter("brk_rate"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.real_paper_std = Util.checkString(req.getParameter("real_paper_std"));
		dm.real_prt_paper_clsf = Util.checkString(req.getParameter("real_prt_paper_clsf"));
		dm.matr_clsf = Util.checkString(req.getParameter("matr_clsf"));
		
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_PRNPAP_2020_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_prnpap_2030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2030_LDataSet ds = null;
		
		MT_PRNPAP_2030_LDM dm = new MT_PRNPAP_2030_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.prt_plan_dd_pers_fr = Util.checkString(req.getParameter("prt_plan_dd_pers_fr"));
		dm.prt_plan_dd_pers_to = Util.checkString(req.getParameter("prt_plan_dd_pers_to"));
		dm.prt_nm = Util.checkString(req.getParameter("prt_nm"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (MT_PRNPAP_2030_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
