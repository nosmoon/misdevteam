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

public class MT_ETCCAR_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    // 차량정비내역 등록  조회
    public void mt_etccar_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_3000_LDataSet ds = null;
		
		MT_ETCCAR_3000_LDM dm = new MT_ETCCAR_3000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.repa_dt_fr = Util.checkString(req.getParameter("repa_dt_fr"));
		dm.repa_dt_to = Util.checkString(req.getParameter("repa_dt_to"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.repa_clsf = Util.checkString(req.getParameter("repa_clsf"));
		dm.print();

		ds = (MT_ETCCAR_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 차량정비내역 등록
    public void mt_etccar_3001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_3001_ADataSet ds = null;
		
		MT_ETCCAR_3001_ADM dm = new MT_ETCCAR_3001_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.sub_seq = Util.checkString(req.getParameter("sub_seq"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.repa_dt = Util.checkString(req.getParameter("repa_dt"));
		dm.drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
		dm.repa_gag = Util.checkString(req.getParameter("repa_gag"));
		dm.repa_clsf = Util.checkString(req.getParameter("repa_clsf"));
		dm.repa_cont = Util.checkString(req.getParameter("repa_cont"));
		dm.oil_qunt = Util.checkString(req.getParameter("oil_qunt"));
		dm.repa_dtls_ptcr = Util.checkString(req.getParameter("repa_dtls_ptcr"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.gubun = Util.checkString(req.getParameter("gubun").toUpperCase());
		dm.print();

		ds = (MT_ETCCAR_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
