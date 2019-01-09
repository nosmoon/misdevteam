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
 
public class PR_PRTEXEC_7000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**  
     * 인쇄처별면수부수 화면 설정정보 조회
     */ 
	public void pr_prtexec_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_7000_LDataSet ds = null;
		
		PR_PRTEXEC_7000_LDM dm = new PR_PRTEXEC_7000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (PR_PRTEXEC_7000_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_prtexec_7001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_7001_LDataSet ds = null;
		
		PR_PRTEXEC_7001_LDM dm = new PR_PRTEXEC_7001_LDM();
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.print();

		ds = (PR_PRTEXEC_7001_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_prtexec_7010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_7010_ADataSet ds = null;
		
		PR_PRTEXEC_7010_ADM dm = new PR_PRTEXEC_7010_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));  
		String[] converted                = convertMultiUpdateData(multiUpdateData);
		  
		//for (int i=0; i<converted.length; i++){
		//		System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun                      =converted[0];
		String fac_clsf                   =converted[19];
		String medi_cd                    =converted[3];
		String ecnt                       =converted[4];
		String advt_clr_pcnt              =converted[6];
		String advt_bw_pcnt               =converted[7];
		String atic_clr_pcnt              =converted[8];
		String clr_pcnt                   =converted[9];
		String bw_pcnt                    =converted[10];
		String prv_side_advt_clr_pcnt     =converted[11];
		String prv_side_advt_bw_pcnt      =converted[12];
		String wht_pj_qty                 =converted[13];
		String blk_pj_qty                 =converted[14];
		String sect_nm                    =converted[15];
		String sect_cnt                   =converted[16];
		String sect_pcnt                  =converted[17];
		String prt_dt                     =converted[18];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setGubun(gubun);
		dm.setFac_clsf(fac_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setEcnt(ecnt);
		dm.setAdvt_clr_pcnt(advt_clr_pcnt);
		dm.setAdvt_bw_pcnt(advt_bw_pcnt);
		dm.setAtic_clr_pcnt(atic_clr_pcnt);
		dm.setClr_pcnt(clr_pcnt);
		dm.setBw_pcnt(bw_pcnt);
		dm.setPrv_side_advt_clr_pcnt(prv_side_advt_clr_pcnt);
		dm.setPrv_side_advt_bw_pcnt(prv_side_advt_bw_pcnt);
		dm.setWht_pj_qty(wht_pj_qty);
		dm.setBlk_pj_qty(blk_pj_qty);
		dm.setSect_nm(sect_nm);
		dm.setSect_cnt(sect_cnt);
		dm.setSect_pcnt(sect_pcnt);
		dm.setPrt_dt(prt_dt);
		dm.setSect_clr_pcnt(Util.checkString(req.getParameter("sect_clr_pcnt")));
		dm.setSect_bw_pcnt(Util.checkString(req.getParameter("sect_bw_pcnt")));

		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr()); 
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		dm.print();

		ds = (PR_PRTEXEC_7010_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

}