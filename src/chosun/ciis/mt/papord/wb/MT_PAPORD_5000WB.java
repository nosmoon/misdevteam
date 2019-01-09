/***************************************************************************************************
* 파일명 : MT_PRNPAP_5000WB
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
 
public class MT_PAPORD_5000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * 공장콤보
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5000_MDataSet ds = null;
		
		MT_PAPORD_5000_MDM dm = new MT_PAPORD_5000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPORD_5000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 제지사조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5001_LDataSet ds = null;
		
		MT_PAPORD_5001_LDM dm = new MT_PAPORD_5001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPORD_5001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    
    /**
	 * 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5002_LDataSet ds = null;
		
		MT_PAPORD_5002_LDM dm = new MT_PAPORD_5002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_5002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 제지사별 발주량
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5003_LDataSet ds = null;
		
		MT_PAPORD_5003_LDM dm = new MT_PAPORD_5003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_5003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 저장
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5004_ADataSet ds = null;
		
		MT_PAPORD_5004_ADM dm = new MT_PAPORD_5004_ADM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		String[] converted1		= convertMultiUpdateData(multiUpdateData1);
		String[] converted2		= convertMultiUpdateData(multiUpdateData2);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		
    	//dm.paper_clsf_head = (String)hash.get("paper_clsf_head");
		//for (int i=0; i<converted1.length; i++){
		//	System.out.println("converted1[" + i + "]=" + converted1[i] );
		//}
		//for (int i=0; i<converted2.length; i++){
		//	System.out.println("converted2[" + i + "]=" + converted2[i] );
		//}
		
		String mode               = (String) hash1.get("m");		//구분
		String ordr_dt            = (String) hash1.get("issu_dt");       //발주일자
		String papcmpy_cd         = (String) hash1.get("papcmpy_cd");       //제지사코드
		String matr_cd            = (String) hash1.get("matr_cd");;       //자재코드
		//String expt_roll_cnt      = (String) hash1.get("papcmpy_cd");;       //예상롤수
		//String expt_wgt           = (String) hash1.get("papcmpy_cd");;       //예상중량
		String ordr_roll_cnt      = (String) hash1.get("ord_roll");;       //발주롤수
		String ordr_wgt           = (String) hash1.get("ord_wgt");;      //발주중량
		//String car_occr_dt        = (String) hash1.get("papcmpy_cd");;      //차량적재발생일자
		//String car_seq            = (String) hash1.get("papcmpy_cd");;      //차량적재일련번호
		String car_prd_cnt        = (String) hash1.get("car_cnt");;      //차량대수
		
		String mix_ordr_dt        	= (String) hash2.get("issu_dt");       //발주일자
		String mix_matr_cd        	= (String) hash2.get("matr_cd");       //자재코드
		String mix_papcmpy_cd     	= (String) hash2.get("papcmpy_cd");       //제지사코드
		String mix_roll      		= (String) hash2.get("roll_cnt");       //발주롤수
		String mix_wgt           	= (String) hash2.get("wgt");      //발주중량
		//String mix_car_occr_dt     	= (String) hash1.get("m");      //차량적재발생일자
		//String mix_car_seq         	= (String) hash1.get("m");      //차량적재일련번호
		
		/*
		String mode               = converted1[0];		//구분
		String ordr_dt            = converted1[2];       //발주일자
		String papcmpy_cd         = converted1[3];       //제지사코드
		String matr_cd            = converted1[4];       //자재코드
		String expt_roll_cnt      = converted1[5];       //예상롤수
		String expt_wgt           = converted1[6];       //예상중량
		String ordr_roll_cnt      = converted1[7];       //발주롤수
		String ordr_wgt           = converted1[8];      //발주중량
		String car_occr_dt        = converted1[9];      //차량적재발생일자
		String car_seq            = converted1[10];      //차량적재일련번호
		String car_prd_cnt        = converted1[11];      //차량대수
		
		String mix_ordr_dt        = converted2[2];       //발주일자
		String mix_matr_cd            = converted2[3];       //자재코드
		String mix_papcmpy_cd         = converted2[4];       //제지사코드
		String mix_roll      = converted2[5];       //발주롤수
		String mix_wgt           = converted2[6];      //발주중량
		String mix_car_occr_dt        = converted2[7];      //차량적재발생일자
		String mix_car_seq            = converted2[8];      //차량적재일련번호
		*/
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.fac_clsf	= Util.checkString(req.getParameter("fac_clsf"));
		dm.setMode(mode);
		dm.setOrdr_dt(ordr_dt);
		dm.setMatr_cd(matr_cd);
		dm.setPapcmpy_cd(papcmpy_cd);
		//dm.setExpt_roll_cnt(expt_roll_cnt);
		//dm.setExpt_wgt(expt_wgt);
		dm.setOrdr_roll_cnt(ordr_roll_cnt);
		dm.setOrdr_wgt(ordr_wgt);
		//dm.setCar_occr_dt(car_occr_dt);
		//dm.setCar_seq(car_seq);
		dm.setCar_prd_cnt(car_prd_cnt);
		
		dm.setMix_ordr_dt(mix_ordr_dt);
		dm.setMix_papcmpy_cd(mix_papcmpy_cd);
		dm.setMix_matr_cd(mix_matr_cd);
		dm.setMix_roll(mix_roll);
		dm.setMix_wgt(mix_wgt);
		//dm.setMix_car_occr_dt(mix_car_occr_dt);
		//dm.setMix_car_seq(mix_car_seq);
		dm.print();

		ds = (MT_PAPORD_5004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 공장별 최대 수용량
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5005_LDataSet ds = null;
		
		MT_PAPORD_5005_LDM dm = new MT_PAPORD_5005_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_5005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 발주정보 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5006_LDataSet ds = null;
		
		MT_PAPORD_5006_LDM dm = new MT_PAPORD_5006_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_5006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 발주정보 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_5008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5008_LDataSet ds = null;
		
		MT_PAPORD_5008_LDM dm = new MT_PAPORD_5008_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.roll_a = Util.checkString(req.getParameter("roll_a"));
		dm.roll_b = Util.checkString(req.getParameter("roll_b"));
		dm.roll_c = Util.checkString(req.getParameter("roll_c"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_5008_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
