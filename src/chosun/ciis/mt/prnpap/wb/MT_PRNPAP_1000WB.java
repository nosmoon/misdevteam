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
 
public class MT_PRNPAP_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * 용지품질시험결과관리 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_prnpap_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_1000_LDataSet ds = null;
    	
		MT_PRNPAP_1000_LDM dm = new MT_PRNPAP_1000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);	
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm.occr_dt_1 = Util.checkString(req.getParameter("occr_dt_1"));
		dm.occr_qq_1 = Util.checkString(req.getParameter("occr_qq_1"));
		dm.occr_dt_2 = Util.checkString(req.getParameter("occr_dt_2"));
		dm.occr_qq_2 = Util.checkString(req.getParameter("occr_qq_2"));
		dm.print();

		ds = (MT_PRNPAP_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 공장, 제지사
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_prnpap_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_1001_LDataSet ds = null;
    	
		MT_PRNPAP_1001_LDM dm = new MT_PRNPAP_1001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PRNPAP_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 측정항목, 단위, 기준치, 최대치, 최저치 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_prnpap_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_1002_LDataSet ds = null;
    	
		MT_PRNPAP_1002_LDM dm = new MT_PRNPAP_1002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PRNPAP_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 용지품질시험결과관리 저장 및 삭제
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_prnpap_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_1003_ADataSet ds = null;
		MT_PRNPAP_1003_ADM dm = new MT_PRNPAP_1003_ADM();
		
		String test_item_clsf    = "";
		String unit              = "";
		String ocom_val          = "";
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		test_item_clsf = converted[2];
		unit           = converted[5];
		ocom_val       = converted[4];
		
		dm.setTest_item_clsf(test_item_clsf);
		dm.setUnit(unit);
		dm.setOcom_val(ocom_val);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_qq = Util.checkString(req.getParameter("occr_qq"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf_i"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd_i"));
		dm.eqp_mchn_no = Util.checkString(req.getParameter("eqp_mchn_no"));
		dm.test_ask_dt = Util.checkString(req.getParameter("test_ask_dt"));
		dm.test_frdt = Util.checkString(req.getParameter("test_frdt"));
		dm.test_todt = Util.checkString(req.getParameter("test_todt"));
		dm.test_instt = Util.checkString(req.getParameter("test_instt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (MT_PRNPAP_1003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 용지품질시험결과조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_prnpap_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_1004_LDataSet ds = null;
    	
		MT_PRNPAP_1004_LDM dm = new MT_PRNPAP_1004_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt_detail = Util.checkString(req.getParameter("occr_dt_detail"));
		dm.seq_detail = Util.checkString(req.getParameter("seq_detail"));
		dm.print();

		ds = (MT_PRNPAP_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
