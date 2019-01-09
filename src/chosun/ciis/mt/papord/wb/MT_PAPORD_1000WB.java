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

package chosun.ciis.mt.papord.wb;

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
import chosun.ciis.mt.papord.dm.*;                    
import chosun.ciis.mt.papord.ds.*;                    
 
public class MT_PAPORD_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * 공장combo
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1000_MDataSet ds = null;
		
		MT_PAPORD_1000_MDM dm = new MT_PAPORD_1000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);	
		dm.mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
		dm.print();

		ds = (MT_PAPORD_1000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1001_LDataSet ds = null;
		
		MT_PAPORD_1001_LDM dm = new MT_PAPORD_1001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.aply_dt_fr_s = Util.checkString(req.getParameter("aply_dt_fr_s"));
		dm.aply_dt_to_s = Util.checkString(req.getParameter("aply_dt_to_s"));
		dm.print();

		ds = (MT_PAPORD_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
   
    /**
	 * 용지Roll당중량 table Data 유무 확인
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1002_LDataSet ds = null;
		
		MT_PAPORD_1002_LDM dm = new MT_PAPORD_1002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print();

		ds = (MT_PAPORD_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1003_LDataSet ds = null;
		
		MT_PAPORD_1003_LDM dm = new MT_PAPORD_1003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.aply_dt_fr_s = Util.checkString(req.getParameter("aply_dt_fr_s"));
		dm.aply_dt_to_s = Util.checkString(req.getParameter("aply_dt_to_s"));
		dm.print();

		ds = (MT_PAPORD_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 공장별 용지 적정수용량 저장,수정,삭제
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1004_ADataSet ds = null;
		
		MT_PAPORD_1004_ADM dm = new MT_PAPORD_1004_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode              = converted[0];
		String aply_dt           = converted[3];
		String fac_clsf          = converted[4];
		String matr_cd           = converted[5];
		String std_ewh_roll_cnt  = converted[8];
		String std_ewh_wgt       = converted[9];
		String max_ewh_roll_cnt  = converted[10];
		String max_ewh_wgt       = converted[11];
		String oth_prts_ratio    = converted[12];
		String std_amss_ratio    = converted[13];
		String occr_dt           = converted[14];
		String seq               = converted[15];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setAply_dt(aply_dt);
		dm.setFac_clsf(fac_clsf);
		dm.setMatr_cd(matr_cd);
		dm.setStd_ewh_roll_cnt(std_ewh_roll_cnt);
		dm.setStd_ewh_wgt(std_ewh_wgt);
		dm.setMax_ewh_roll_cnt(max_ewh_roll_cnt);
		dm.setMax_ewh_wgt(max_ewh_wgt);
		dm.setOth_prts_ratio(oth_prts_ratio);
		dm.setStd_amss_ratio(std_amss_ratio);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.print();
		
		ds = (MT_PAPORD_1004_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1005_LDataSet ds = null;
		
		MT_PAPORD_1005_LDM dm = new MT_PAPORD_1005_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (MT_PAPORD_1005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1006_LDataSet ds = null;
		
		MT_PAPORD_1006_LDM dm = new MT_PAPORD_1006_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.print();

		ds = (MT_PAPORD_1006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 공장별 용지 적정수용량 저장,수정,삭제
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_1007_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1007_ADataSet ds = null;
		
		MT_PAPORD_1007_ADM dm = new MT_PAPORD_1007_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		
		String gubun             = converted[0];
		String matr_cd           = converted[3];
		String std_ewh_roll_cnt  = converted[5];
		String std_ewh_wgt       = converted[6];
		String occr_dt           = converted[7];
		String seq               = converted[8];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.max_ewh_wgt = Util.checkString(req.getParameter("max_ewh_wgt"));
		dm.oth_prts_ratio = Util.checkString(req.getParameter("oth_prts_ratio"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
		dm.setGubun(gubun);
		dm.setMatr_cd(matr_cd);
		dm.setStd_ewh_roll_cnt(std_ewh_roll_cnt);
		dm.setStd_ewh_wgt(std_ewh_wgt);
		dm.setOccr_dt2(occr_dt);
		dm.setSeq2(seq);
		dm.print();

		ds = (MT_PAPORD_1007_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
