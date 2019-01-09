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

package chosun.ciis.hd.card.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;


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
import chosun.ciis.hd.card.dm.*;
import chosun.ciis.hd.card.ds.*;
/**
 * 
 */

public class HD_CARD_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    
    public void hd_card_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CARD_1000_LDataSet ds = null;
		HD_CARD_1000_LDM dm = new HD_CARD_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cmpy_ck = Util.checkString(req.getParameter("cmpy_ck"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.open_invit_clsf	= Util.checkString(req.getParameter("open_invit_clsf"));
		dm.open_invit_desty	= Util.checkString(req.getParameter("open_invit_desty"));
		dm.print();

		ds = (HD_CARD_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_card_1020_M(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CARD_1020_MDataSet ds = null;
		HD_CARD_1020_MDM dm = new HD_CARD_1020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_CARD_1020_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_card_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CARD_1100_LDataSet ds = null;
		HD_CARD_1100_LDM dm = new HD_CARD_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();

		ds = (HD_CARD_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_card_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_CARD_1101_LDataSet ds = null;
		HD_CARD_1101_LDM dm = new HD_CARD_1101_LDM();

		//dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));
		
		dm.print();

		ds = (HD_CARD_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
