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

package chosun.ciis.mt.etcpc.wb;

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
import chosun.ciis.mt.etcpc.dm.*;                    
import chosun.ciis.mt.etcpc.ds.*;   
 
/**
 * 
 */

public class MT_ETCPC_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 모델 관리번호 콤보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_etcpc_1101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_ETCPC_1101_MDataSet ds = null;
    	
		MT_ETCPC_1101_MDM dm = new MT_ETCPC_1101_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.print();
		
		ds = (MT_ETCPC_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_ETCPC_1100_LDataSet ds = null;
    	
		MT_ETCPC_1100_LDM dm = new MT_ETCPC_1100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.modl_kind = Util.checkString(req.getParameter("modl_kind"));
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		dm.modl_nm = Util.checkString(req.getParameter("modl_nm"));
		dm.print();

		ds = (MT_ETCPC_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_1105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1105_ADataSet ds = null;
		
		MT_ETCPC_1105_ADM dm = new MT_ETCPC_1105_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
		String[] converted = convertMultiUpdateData(multiUpdateData);
		String gubun 	  = converted[0];
		String modl_mang_no 	  = converted[4];
		String modl_nm 			  = converted[5];		
		String modl_kind          = converted[3];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setModl_mang_no(modl_mang_no);
		dm.setModl_nm(modl_nm);
		dm.setModl_kind(modl_kind);	
		dm.setGubun(gubun);			
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
		dm.print();
		
		ds = (MT_ETCPC_1105_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_1201_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1201_MDataSet ds = null;
		
		MT_ETCPC_1201_MDM dm = new MT_ETCPC_1201_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (MT_ETCPC_1201_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1200_LDataSet ds = null;
		
		MT_ETCPC_1200_LDM dm = new MT_ETCPC_1200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		dm.print();
		
		ds = (MT_ETCPC_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_1202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1202_ADataSet ds = null;
		
		MT_ETCPC_1202_ADM dm = new MT_ETCPC_1202_ADM();
		String multiUpdateData_h = Util.checkString(req.getParameter("multiUpData_h"));
		String multiUpdateData_s = Util.checkString(req.getParameter("multiUpData_s"));
		String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		
		String[] converted_h = convertMultiUpdateData(multiUpdateData_h);
		String[] converted_s = convertMultiUpdateData(multiUpdateData_s);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		String incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		String incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		
		String gubun_h          = converted_h[0];
		String cmps_item_h      = converted_h[3];
		String brand_sw_h       = converted_h[4];
		String spec_h           = converted_h[5];
		String seq_h            = converted_h[6];
		String spec_clsf_h      = "";
		String modl_mang_no_h   = modl_mang_no;
		
		String endgbn_h = "";
		
		if(!cmps_item_h.equals("")) {
			spec_clsf_h = cmps_item_h.substring(0,1);
		}
		
		if(gubun_h.equals("")) {
			endgbn_h = "E";
		} else {
			endgbn_h = "C";
		}
		String gubun_s          = converted_s[0];
		String cmps_item_s      = converted_s[3];
		String brand_sw_s       = converted_s[4];
		String seq_s            = converted_s[5];
		String spec_s           = converted_s[6];
		
		String spec_clsf_s      = "";
		String modl_mang_no_s   = modl_mang_no;
		// spec 이 null 이면 "" 입력
		if("".equalsIgnoreCase(spec_s) || "#".equalsIgnoreCase(spec_s)){
			spec_s = " ";
		}
		
		if(!cmps_item_s.equals("")) {
			spec_clsf_s = cmps_item_s.substring(0,1);
		}
		String endgbn_s = "";
		
		if(gubun_s.equals("")) {
			endgbn_s = "E";
		} else {
			endgbn_s = "C";
		}
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
		dm.setIncmg_pers(incmg_pers);
		dm.setModl_mang_no_h(modl_mang_no_h);
		dm.setSeq_h(seq_h);
		dm.setCmps_item_h(cmps_item_h);
		dm.setSpec_clsf_h(spec_clsf_h);
		dm.setBrand_sw_h(brand_sw_h);
		dm.setSpec_h(spec_h);
		dm.setGubun_h(gubun_h);
		dm.setEndgbn_h(endgbn_h);
		dm.setModl_mang_no_s(modl_mang_no_s);
		dm.setSeq_s(seq_s);
		dm.setCmps_item_s(cmps_item_s);
		dm.setSpec_clsf_s(spec_clsf_s);
		dm.setBrand_sw_s(brand_sw_s);
		dm.setSpec_s(spec_s);
		dm.setGubun_s(gubun_s);
		dm.setEndgbn_s(endgbn_s);
		dm.print();
		
		ds = (MT_ETCPC_1202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_1203_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1203_MDataSet ds = null;
		
		MT_ETCPC_1203_MDM dm = new MT_ETCPC_1203_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (MT_ETCPC_1203_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 모델별 구매등록 품목종류 콤보
    public void mt_etcpc_1301_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1301_MDataSet ds = null;
		
		MT_ETCPC_1301_MDM dm = new MT_ETCPC_1301_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCPC_1301_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //모델별 구매등록 사용처 콤보
    public void mt_etcpc_1302_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1302_MDataSet ds = null;
		
		MT_ETCPC_1302_MDM dm = new MT_ETCPC_1302_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCPC_1302_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //모델별 구매등록 조회
    public void mt_etcpc_1303_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1303_LDataSet ds = null;
		
		MT_ETCPC_1303_LDM dm = new MT_ETCPC_1303_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);	
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		dm.use_usag = Util.checkString(req.getParameter("use_usag"));
		dm.buy_dt = Util.checkString(req.getParameter("buy_dt"));
		dm.print();
		
		ds = (MT_ETCPC_1303_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
     
    //모델별 구매등록 입력/수정/삭제
    public void mt_etcpc_1304_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1304_ADataSet ds = null;
		
		MT_ETCPC_1304_ADM dm = new MT_ETCPC_1304_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);	
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no").substring(0,5));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.buy_dt = Util.checkString(req.getParameter("buy_dt"));
		dm.use_usag = Util.checkString(req.getParameter("use_usag"));
		dm.buy_cnt = Util.checkString(req.getParameter("buy_cnt"));
		dm.draft_deptcd = Util.checkString(req.getParameter("draft_deptcd"));
		dm.draft_kind = Util.checkString(req.getParameter("draft_kind"));
		dm.draft_no = Util.checkString(req.getParameter("draft_no"));
		dm.nocompen_mant_frdt = Util.checkString(req.getParameter("nocompen_mant_frdt"));
		dm.nocompen_mant_todt = Util.checkString(req.getParameter("nocompen_mant_todt"));
		dm.compen_mant_frdt = Util.checkString(req.getParameter("compen_mant_frdt"));
		dm.compen_mant_todt = Util.checkString(req.getParameter("compen_mant_todt"));
		dm.compen_mant_cmpy = Util.checkString(req.getParameter("compen_mant_cmpy"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();
		
		ds = (MT_ETCPC_1304_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //부서코드입력시 부서명 조회
    public void mt_etcpc_1305_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1305_MDataSet ds = null;
		
		MT_ETCPC_1305_MDM dm = new MT_ETCPC_1305_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);	
		dm.draft_deptcd = Util.checkString(req.getParameter("dept_nm"));
		dm.print();
		
		ds = (MT_ETCPC_1305_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
