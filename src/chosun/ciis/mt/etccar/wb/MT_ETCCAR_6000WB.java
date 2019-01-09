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

package chosun.ciis.mt.etccar.wb;

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
import chosun.ciis.mt.etccar.dm.*;                    
import chosun.ciis.mt.etccar.ds.*;             
 
/**
 *  
 */

public class MT_ETCCAR_6000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    // 유류비단가 조회 
    public void mt_etccar_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_6000_LDataSet ds = null;
		
		MT_ETCCAR_6000_LDM dm = new MT_ETCCAR_6000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt_fr = Util.checkString(req.getParameter("aply_dt_fr"));
		dm.aply_dt_to = Util.checkString(req.getParameter("aply_dt_to"));
		dm.print();

		ds = (MT_ETCCAR_6000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 유류비단가 등록/삭제
    public void mt_etccar_6001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_ETCCAR_6001_ADataSet ds = null;
    	
		MT_ETCCAR_6001_ADM dm = new MT_ETCCAR_6001_ADM();
		String multiUpdateData 	= Util.checkString(req.getParameter("multiUpData"));
		String[] converted 		= convertMultiUpdateData(multiUpdateData); 
		String gubun 	  		= converted[0];
		String aply_dt 			= converted[2];
		String oil_clsf_1		= converted[3];
		String oil_clsf_2		= converted[4];
		String oil_clsf_3		= converted[5];
		String oil_clsf_4		= converted[6];
		String oil_clsf_5		= converted[7];
		String oil_clsf_6		= converted[8];
		
		dm.cmpy_cd           = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers        = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		
		dm.aply_dt           = aply_dt;
		dm.gubun             = gubun;
		dm.oil_clsf_1        = oil_clsf_1;  
		dm.oil_clsf_2        = oil_clsf_2;  
		dm.oil_clsf_3        = oil_clsf_3;  
		dm.oil_clsf_4        = oil_clsf_4;  
		dm.oil_clsf_5        = oil_clsf_5;  
		dm.oil_clsf_6        = oil_clsf_6;  
		dm.print();

		ds = (MT_ETCCAR_6001_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);
	}
}
