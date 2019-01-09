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
import chosun.ciis.mt.etcbook.dm.MT_ETCBOOK_2002_ADM;
import chosun.ciis.mt.etcbook.ds.MT_ETCBOOK_2002_ADataSet;
import chosun.ciis.mt.etccar.dm.*;                    
import chosun.ciis.mt.etccar.ds.*;        
 
/**
 *  
 */

public class MT_ETCCAR_8000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    // 유류비단가 조회 
    public void mt_etccar_8001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_8001_LDataSet ds = null;
		
		MT_ETCCAR_8001_LDM dm = new MT_ETCCAR_8001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.drvr_cd = Util.checkString(req.getParameter("drvr_cd"));
		dm.drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_8001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    public void mt_etccar_8002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_8002_ADataSet ds = null;
		MT_ETCCAR_8002_ADM dm = new MT_ETCCAR_8002_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.drvr_cd = Util.checkString(req.getParameter("drvr_cd"));
		dm.drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (MT_ETCCAR_8002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {	
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);
	}
    

}
