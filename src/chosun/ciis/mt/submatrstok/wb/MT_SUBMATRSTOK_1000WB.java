/***************************************************************************************************
* 파일명 : MT_SUBMATRSTOK_1000WB
* 기능 :  분공장 자재일보
* 작성일자 : 2013-04-29
* 작성자 : 김성미
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.submatrstok.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
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
import chosun.ciis.mt.submatrstok.dm.*;
import chosun.ciis.mt.submatrstok.ds.*;
import chosun.ciis.pr.prtexec.dm.PR_PRTEXEC_5070_ADM;
import chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_5070_ADataSet;

public class MT_SUBMATRSTOK_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    // 용지일일재고및파지확인 팝업 조회
    public void mt_submatrstok_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRSTOK_1000_MDataSet ds = null;

		MT_SUBMATRSTOK_1000_MDM dm = new MT_SUBMATRSTOK_1000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.print();

		ds = (MT_SUBMATRSTOK_1000_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
    
    public void mt_submatrstok_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1010_LDataSet ds = null;
		
		MT_SUBMATRSTOK_1010_LDM dm = new MT_SUBMATRSTOK_1010_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_SUBMATRSTOK_1010_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
 
    public void mt_submatrstok_1020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1020_ADataSet ds = null;
		MT_SUBMATRSTOK_1020_ADM dm 	= new MT_SUBMATRSTOK_1020_ADM();
		String gubun          	= "";
		String cmpy_cd          	= "";
		String occr_dt			= "";
		String seq				= "";
		String fac_clsf       	= "";
		String sect_cd        	= "";
		String medi_cd        	= "";
		String issu_pcnt      	= "";
		String bw_pcnt        	= "";
		String clr_pcnt       	= "";
		String slip_qty       	= "";
		String prt_bgn_tm   	= "";
		String prt_end_tm  		= "";
		String real_prt_qty    	= "";
		String err_tms  		= "";
		
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		String[] converted1      = convertMultiUpdateData(multiUpdateData1);
		
		gubun          	= converted1[0];
		bw_pcnt        	= converted1[3];
		clr_pcnt       	= converted1[4];
		issu_pcnt      	= converted1[5];
		slip_qty       	= converted1[6];
		real_prt_qty   	= converted1[7];
		prt_bgn_tm     	= converted1[8];
		prt_end_tm     	= converted1[9];
		err_tms     	= converted1[10];
		
		cmpy_cd        	= converted1[11];
		occr_dt        	= converted1[12];
		seq        		= converted1[13];
		fac_clsf       	= converted1[14];
		sect_cd        	= converted1[15];
		medi_cd        	= converted1[16];
		
		dm.setGubun(gubun.toUpperCase());
		dm.setBw_pcnt(bw_pcnt);
		dm.setClr_pcnt(clr_pcnt);
		dm.setIssu_pcnt(issu_pcnt);
		dm.setSlip_qty(slip_qty);
		dm.setReal_prt_qty(real_prt_qty);
		dm.setPrt_bgn_tm(prt_bgn_tm);
		dm.setPrt_end_tm(prt_end_tm);
		dm.setErr_tms(err_tms);
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setFac_clsf(fac_clsf);
		dm.setSect_cd(sect_cd);
		dm.setMedi_cd(medi_cd);
		
		String gubun2          	= "";
		String cmpy_cd2         = "";
		String occr_dt2			= "";
		String seq2				= "";
		String fac_clsf2       	= "";

		String ewh_wgt          = "";
		String jego_wgt			= "";
		String req_wgt			= "";
		String matr_cd       	= "";
		String remk       	= "";
		String req_remk       	= "";
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
		String[] converted2      = convertMultiUpdateData(multiUpdateData2);
	
		
		gubun2          	= converted2[0];
		cmpy_cd2        	= converted2[11];
		occr_dt2        	= converted2[12];
		seq2        		= converted2[13];
		fac_clsf2       	= converted2[14];
		
		ewh_wgt        		= converted2[5];
		jego_wgt       		= converted2[7];
		req_wgt      		= converted2[10];
		matr_cd       		= converted2[15];
		remk				= converted2[16];
		req_remk			= converted2[17];
		
		dm.setGubun2(gubun2.toUpperCase());
		dm.setCmpy_cd2(cmpy_cd2);
		dm.setOccr_dt2(occr_dt2);
		dm.setSeq2(seq2);
		dm.setFac_clsf2(fac_clsf2);
		
		dm.setEwh_wgt(ewh_wgt);
		dm.setJego_wgt(jego_wgt);
		dm.setReq_wgt(req_wgt);
		dm.setMatr_cd(matr_cd);
		dm.setRemk(remk);
		dm.setReq_remk(req_remk);
		
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_SUBMATRSTOK_1020_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
   
    public void mt_submatrstok_1030_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1030_ADataSet ds = null;
		MT_SUBMATRSTOK_1030_ADM dm 	= new MT_SUBMATRSTOK_1030_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_SUBMATRSTOK_1030_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    public void mt_submatrstok_1031_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1031_ADataSet ds = null;
		MT_SUBMATRSTOK_1031_ADM dm 	= new MT_SUBMATRSTOK_1031_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_SUBMATRSTOK_1031_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_submatrstok_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1110_LDataSet ds = null;
		
		MT_SUBMATRSTOK_1110_LDM dm = new MT_SUBMATRSTOK_1110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_SUBMATRSTOK_1110_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_submatrstok_1120_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1120_ADataSet ds = null;
		MT_SUBMATRSTOK_1120_ADM dm 	= new MT_SUBMATRSTOK_1120_ADM();
		String gubun          	= "";
		String cmpy_cd          	= "";
		String occr_dt			= "";
		String seq				= "";
		String fac_clsf       	= "";
		String sect_cd        	= "";
		String issu_pcnt      	= "";
		String bw_pcnt        	= "";
		String clr_pcnt       	= "";
		String slip_qty       	= "";
		String prt_bgn_tm   	= "";
		String prt_end_tm  		= "";
		String real_prt_qty    	= "";
		String err_tms  		= "";
		
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		String[] converted1      = convertMultiUpdateData(multiUpdateData1);
		
		gubun          	= converted1[0];
		bw_pcnt        	= converted1[3];
		clr_pcnt       	= converted1[4];
		issu_pcnt      	= converted1[5];
		slip_qty       	= converted1[6];
		real_prt_qty   	= converted1[7];
		prt_bgn_tm     	= converted1[8];
		prt_end_tm     	= converted1[9];
		err_tms     	= converted1[10];
		
		cmpy_cd        	= converted1[11];
		occr_dt        	= converted1[12];
		seq        		= converted1[13];
		fac_clsf       	= converted1[14];
		sect_cd        	= converted1[15];
		
		dm.setGubun(gubun.toUpperCase());
		dm.setBw_pcnt(bw_pcnt);
		dm.setClr_pcnt(clr_pcnt);
		dm.setIssu_pcnt(issu_pcnt);
		dm.setSlip_qty(slip_qty);
		dm.setReal_prt_qty(real_prt_qty);
		dm.setPrt_bgn_tm(prt_bgn_tm);
		dm.setPrt_end_tm(prt_end_tm);
		dm.setErr_tms(err_tms);
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setFac_clsf(fac_clsf);
		dm.setSect_cd(sect_cd);
		
		String gubun2          	= "";
		String cmpy_cd2         = "";
		String occr_dt2			= "";
		String seq2				= "";
		String fac_clsf2       	= "";

		String ewh_wgt          = "";
		String jego_wgt			= "";
		String ewh_roll         = "";
		String jego_roll		= "";
		String req_roll			= "";
		String matr_cd       	= "";
		
		
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
		String[] converted2      = convertMultiUpdateData(multiUpdateData2);
	
		
		gubun2          	= converted2[0];
		cmpy_cd2        	= converted2[14];
		occr_dt2        	= converted2[15];
		seq2        		= converted2[16];
		fac_clsf2       	= converted2[17];
		
		ewh_roll        	= converted2[6];
		ewh_wgt        		= converted2[7];
		jego_roll       	= converted2[10];
		jego_wgt       		= converted2[11];
		matr_cd       		= converted2[18];
		
		
		dm.setGubun2(gubun2.toUpperCase());
		dm.setCmpy_cd2(cmpy_cd2);
		dm.setOccr_dt2(occr_dt2);
		dm.setSeq2(seq2);
		dm.setFac_clsf2(fac_clsf2);
		
		dm.setEwh_wgt(ewh_wgt);
		dm.setJego_wgt(jego_wgt);
		dm.setMatr_cd(matr_cd);
		dm.setEwh_roll(ewh_roll);
		dm.setJego_roll(jego_roll);
		
		
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_SUBMATRSTOK_1120_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    public void mt_submatrstok_1130_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1130_ADataSet ds = null;
		MT_SUBMATRSTOK_1130_ADM dm 	= new MT_SUBMATRSTOK_1130_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_SUBMATRSTOK_1130_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
 }
