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

public class MT_ETCPC_6000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    //모델/사용처 사용현황 조회
    public void mt_etcpc_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_6000_LDataSet ds = null;
		
		MT_ETCPC_6000_LDM dm = new MT_ETCPC_6000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.modl_kind = Util.checkString(req.getParameter("modl_kind"));
		dm.print();

		ds = (MT_ETCPC_6000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			System.out.println("DAO error");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		req.setAttribute("ds", ds);
	}
}
