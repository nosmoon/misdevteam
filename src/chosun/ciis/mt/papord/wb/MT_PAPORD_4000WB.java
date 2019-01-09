/***************************************************************************************************
* 파일명 : MT_PRNPAP_4000WB
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-09 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.papord.wb;

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
import chosun.ciis.mt.papord.dm.*;                    
import chosun.ciis.mt.papord.ds.*;       

public class MT_PAPORD_4000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * 주간발행인쇄량산정(공장, 매체 콤보)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_4000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4000_MDataSet ds = null;
		
		MT_PAPORD_4000_MDM dm = new MT_PAPORD_4000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPORD_4000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 주간발행인쇄량산정(섹션 콤보)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_4001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4001_MDataSet ds = null;
		
		MT_PAPORD_4001_MDM dm = new MT_PAPORD_4001_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
		dm.print();

		ds = (MT_PAPORD_4001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 주간발행인쇄량산정(중량/1롤 콤보)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_4002_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4002_MDataSet ds = null;
		
		MT_PAPORD_4002_MDM dm = new MT_PAPORD_4002_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_4002_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 발행면수, 발행부수, 양출여부
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_4003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4003_LDataSet ds = null;
		
		MT_PAPORD_4003_LDM dm = new MT_PAPORD_4003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_s = Util.checkString(req.getParameter("issu_dt_s"));
		dm.fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.medi_cd_s = Util.checkString(req.getParameter("medi_cd_s"));
		dm.sect_cd_s = Util.checkString(req.getParameter("sect_cd_s"));
		dm.print();

		ds = (MT_PAPORD_4003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 주간발행인쇄량산정 저장,수정,삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4004_ADataSet ds = null;
		
		MT_PAPORD_4004_ADM dm = new MT_PAPORD_4004_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//String[] converted = convertMultiUpdateData(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String mode             = (String)hash.get("m");
		String issu_dt          = (String)hash.get("issu_dt");
		String fac_clsf         = (String)hash.get("fac_clsf");
		String medi_cd          = (String)hash.get("medi_cd");
		String sect_cd          = (String)hash.get("sect_cd");
		String prt_clsf         = (String)hash.get("prt_clsf");
		String issu_pcnt        = (String)hash.get("pcnt");
		String pap_std        	= (String)hash.get("std");
		String issu_qty         = (String)hash.get("slip_qty");
		String dual_out_clsf    = (String)hash.get("dual_out_clsf");
		String roll_wgt_a       = (String)hash.get("roll_wgt_a");
		String wgt_a            = (String)hash.get("wgt_a");
		String roll_cnt_a       = (String)hash.get("roll_cnt_a");
		String roll_wgt_b       = (String)hash.get("roll_wgt_b");
		String wgt_b            = (String)hash.get("wgt_b");
		String roll_cnt_b       = (String)hash.get("roll_cnt_b");
		String roll_wgt_c       = (String)hash.get("roll_wgt_c");
		String wgt_c            = (String)hash.get("wgt_c");
		String roll_cnt_c       = (String)hash.get("roll_cnt_c");
		String matr_cd_a        = (String)hash.get("matr_cd_a");
		String matr_cd_b        = (String)hash.get("matr_cd_b");
		String matr_cd_c        = (String)hash.get("matr_cd_c");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode.toUpperCase());
		dm.setIssu_dt(issu_dt);
		dm.setFac_clsf(fac_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setSect_cd(sect_cd);
		dm.setPrt_clsf(prt_clsf);
		dm.setPap_std(pap_std);
		dm.setIssu_pcnt(issu_pcnt);
		dm.setIssu_qty(issu_qty);
		dm.setDual_out_clsf(dual_out_clsf);
		dm.setRoll_wgt_a(roll_wgt_a);
		dm.setWgt_a(wgt_a);
		dm.setRoll_cnt_a(roll_cnt_a);
		dm.setRoll_wgt_b(roll_wgt_b);
		dm.setWgt_b(wgt_b);
		dm.setRoll_cnt_b(roll_cnt_b);
		dm.setRoll_wgt_c(roll_wgt_c);
		dm.setWgt_c(wgt_c);
		dm.setRoll_cnt_c(roll_cnt_c);
		dm.setMatr_cd_a(matr_cd_a);
		dm.setMatr_cd_b(matr_cd_b);
		dm.setMatr_cd_c(matr_cd_c);
		dm.print();
		
		ds = (MT_PAPORD_4004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4005_LDataSet ds = null;
		
		MT_PAPORD_4005_LDM dm = new MT_PAPORD_4005_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt_s"));
		dm.print();

		ds = (MT_PAPORD_4005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4006_LDataSet ds = null;
		
		MT_PAPORD_4006_LDM dm = new MT_PAPORD_4006_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_4006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4007_LDataSet ds = null;
		
		MT_PAPORD_4007_LDM dm = new MT_PAPORD_4007_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_yymm	= Util.checkString(req.getParameter("occr_yymm"));
		dm.fac_clsf		= Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_4007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4008_LDataSet ds = null;
		
		MT_PAPORD_4008_LDM dm = new MT_PAPORD_4008_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPORD_4008_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 주간발행조회 팝업
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4100_LDataSet ds = null;
		
		MT_PAPORD_4100_LDM dm = new MT_PAPORD_4100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.print();

		ds = (MT_PAPORD_4100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
