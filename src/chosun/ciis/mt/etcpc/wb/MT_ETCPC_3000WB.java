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

public class MT_ETCPC_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    //S/W라이센스 팝업 조회
    public void mt_etcpc_3001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3001_MDataSet ds = null;
		
		MT_ETCPC_3001_MDM dm = new MT_ETCPC_3001_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.swnm = Util.checkString(req.getParameter("swnm"));
		dm.swkind = Util.checkString(req.getParameter("swkind"));
		dm.swver = Util.checkString(req.getParameter("swver"));
		dm.buy_dt = Util.checkString(req.getParameter("buy_dt"));

		ds = (MT_ETCPC_3001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //S/W라이센스 조회
    public void mt_etcpc_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3000_LDataSet ds = null;
		
		MT_ETCPC_3000_LDM dm = new MT_ETCPC_3000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.swmang_no = Util.checkString(req.getParameter("swmang_no"));

		ds = (MT_ETCPC_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds); 
	}
    
    // S/W 라이센스 입력/수정/삭제
    public void mt_etcpc_3002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3002_ADataSet ds = null;
		
		MT_ETCPC_3002_ADM dm = new MT_ETCPC_3002_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.swmang_no = Util.checkString(req.getParameter("swmang_no"));
		//dm.swnm = Util.checkString(req.getParameter("swnm").substring(8));
		dm.swnm = Util.checkString(req.getParameter("swnm"));
		dm.swkind = Util.checkString(req.getParameter("swkind"));
		dm.swver = Util.checkString(req.getParameter("swver"));
		dm.use_usag = Util.checkString(req.getParameter("use_usag"));
		dm.buy_dt = Util.checkString(req.getParameter("buy_dt"));
		dm.buy_draft_dept = Util.checkString(req.getParameter("buy_draft_dept"));
		dm.buy_draft_no = Util.checkString(req.getParameter("buy_draft_no"));
		dm.swlics_cnt = Util.checkString(req.getParameter("swlics_cnt"));
		dm.make_cmpy = Util.checkString(req.getParameter("make_cmpy"));
		dm.gds_key = Util.checkString(req.getParameter("gds_key"));
		dm.lics_certi_no = Util.checkString(req.getParameter("lics_certi_no"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (MT_ETCPC_3002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {			
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //S/W 라이센스 S/W명 콤보 조회
    public void mt_etcpc_3003_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3003_MDataSet ds = null;
		
		MT_ETCPC_3003_MDM dm = new MT_ETCPC_3003_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.print();

		ds = (MT_ETCPC_3003_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
