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

public class MT_ETCPC_2000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    
    public void mt_etcpc_2001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2001_MDataSet ds = null;
		
		MT_ETCPC_2001_MDM dm = new MT_ETCPC_2001_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		
		ds = (MT_ETCPC_2001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    
    public void mt_etcpc_2002_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2002_MDataSet ds = null;
		
		MT_ETCPC_2002_MDM dm = new MT_ETCPC_2002_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.modl_kind = Util.checkString(req.getParameter("searchBFmodl"));

		ds = (MT_ETCPC_2002_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_2003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2003_LDataSet ds = null;
		
		MT_ETCPC_2003_LDM dm = new MT_ETCPC_2003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		dm.buy_dt = Util.checkString(req.getParameter("buy_dt"));
		dm.serl_no = Util.checkString(req.getParameter("serl_no"));
		dm.use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
		dm.print();

		ds = (MT_ETCPC_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
   
    // 기기등록 조회
    public void mt_etcpc_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2000_LDataSet ds = null;
		
		MT_ETCPC_2000_LDM dm = new MT_ETCPC_2000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.modl_kind = Util.checkString(req.getParameter("modl_kind"));
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		dm.mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
		dm.use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
		dm.print();

		ds = (MT_ETCPC_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 기기등록,수정,삭제
    public void mt_etcpc_2103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2103_ADataSet ds = null;
		
		MT_ETCPC_2103_ADM dm = new MT_ETCPC_2103_ADM();
		String wste_obj_item_yn = Util.checkString(req.getParameter("wste_obj_item_yn"));
		String repa_item_yn =  Util.checkString(req.getParameter("repa_item_yn"));
		String lend_item_yn =  Util.checkString(req.getParameter("lend_item_yn"));
		if(!"Y".equals(wste_obj_item_yn)) wste_obj_item_yn = "N";
		if(!"Y".equals(repa_item_yn)) repa_item_yn = "N";
		if("".equals(lend_item_yn)){
			lend_item_yn = "N";
		}else{
			lend_item_yn = "Y";
		}

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		dm.serl_no = Util.checkString(req.getParameter("serl_no"));
		dm.buy_dt = Util.checkString(req.getParameter("buy_dt"));
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
		dm.use_pers = Util.checkString(req.getParameter("use_pers"));
		//dm.use_pers_flnm = Util.getSessionParameterValue(req,"emp_nm",true);
		dm.use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
		dm.use_deptcd = Util.checkString(req.getParameter("use_deptcd"));
		dm.use_dept_nm = Util.checkString(req.getParameter("use_deptnm"));
		dm.use_usag = Util.checkString(req.getParameter("use_usag"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.pay_kind = Util.checkString(req.getParameter("pay_kind"));
		dm.mchn_stat = Util.checkString(req.getParameter("mchn_stat"));
		dm.kep_plac = Util.checkString(req.getParameter("kep_plac"));
		dm.acpt_dt = Util.checkString(req.getParameter("acpt_dt"));
		dm.rsrt_dt = Util.checkString(req.getParameter("rsrt_dt"));
		dm.wste_dd_pers = Util.checkString(req.getParameter("wste_dd_pers"));
		dm.monitor_mang_no = Util.checkString(req.getParameter("monitor_mang_no"));
		dm.repa_item_yn = repa_item_yn;
		dm.wste_obj_item_yn = wste_obj_item_yn;
		dm.lend_item_rsrt_plan_dt = Util.checkString(req.getParameter("lend_item_rsrt_plan_dt"));
		dm.lend_item_yn = lend_item_yn;
		dm.ipaddr = Util.checkString(req.getParameter("ipaddr"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		if("".equalsIgnoreCase(dm.mchn_mang_no)){ //insert일경우
			dm.mchn_mang_no = dm.modl_mang_no.substring(0,1); //종류구분자(A,B,C,D,E)를 가져간다
		}
		dm.print();

		ds = (MT_ETCPC_2103_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			System.out.println("##getErrcode : " + ds.getErrcode());
			System.out.println("##getErrmsg : " + ds.getErrmsg());
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //기기등록 H/W 조회
    public void mt_etcpc_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2200_LDataSet ds = null;
		
		MT_ETCPC_2200_LDM dm = new MT_ETCPC_2200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
		
		ds = (MT_ETCPC_2200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etcpc_2201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2201_ADataSet ds = null;
		
		MT_ETCPC_2201_ADM dm = new MT_ETCPC_2201_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String gubun          		= converted[0];
		String addm_clsf      		= converted[3];
		String cmps_item_clsf       = converted[4];
		String cmps_item_brand      = converted[5];
		String cmps_item_spec       = converted[6];
		String estb_dt      		= converted[7];
		String seq           		= converted[8];
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		String incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		String incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		String mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));		
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
		dm.setIncmg_pers(incmg_pers);
		dm.setGubun(gubun);
		dm.setAddm_clsf(addm_clsf);
		dm.setCmps_item_clsf(cmps_item_clsf);
		dm.setCmps_item_brand(cmps_item_brand);
		dm.setCmps_item_spec(cmps_item_spec);
		dm.setEstb_dt(estb_dt);
		dm.setSeq(seq);
		dm.setMchn_mang_no(mchn_mang_no);
		dm.print();
		
		ds = (MT_ETCPC_2201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //기기등록 S/W 조회 및 설치라이센스 , 보유라이센스
    public void mt_etcpc_2300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2300_LDataSet ds = null;
		
		MT_ETCPC_2300_LDM dm = new MT_ETCPC_2300_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);	
		dm.mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
		dm.swlics_no = Util.checkString(req.getParameter("swlics_no"));
		dm.print();

		ds = (MT_ETCPC_2300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 기기등록 S/W 저장/삭제
    public void mt_etcpc_2301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2301_ADataSet ds = null;
		
		MT_ETCPC_2301_ADM dm = new MT_ETCPC_2301_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String gubun          		= converted[0];		
		String swlics_no    		= converted[3];
		String swver                = converted[4];
		//String swnm      			= converted[3];
		String swestb_dt	        = converted[7];
		String swclsf   	        = converted[8];
		String remk			        = converted[9];
		String mchn_mang_no    		= converted[10];
		String seq       			= converted[11];
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		String incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		String incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.setCmpy_cd(cmpy_cd); 						// 회사코드
		dm.setMchn_mang_no(mchn_mang_no);				// 기기관리번호 
		dm.setSeq(seq);									// 일련번호 
		dm.setSwlics_no(swlics_no);						// 라이센스번호
		//dm.setSwnm(swnm);								// s/w 명
		dm.setSwver(swver);								// s/w 버전
		dm.setSwestb_dt(swestb_dt);						// 설치일자
		dm.setRemk(remk);								// 비고 
		dm.setSwclsf(swclsf);							// s/w구분
		dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);		// IP
		dm.setIncmg_pers(incmg_pers); 					// 사용자
		dm.setGubun(gubun);								// 구분
		dm.print();

		ds = (MT_ETCPC_2301_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
