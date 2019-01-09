/***************************************************************************************************
* 파일명 : MT_PRNPAP_6000WB
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-16 
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
 
public class MT_PAPORD_6000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * 제지사별 용지 발주비율 조회(일일발주비율)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6000_LDataSet ds = null;
		
		MT_PAPORD_6000_LDM dm = new MT_PAPORD_6000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
		dm.ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
		dm.print();

		ds = (MT_PAPORD_6000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 제지사별 용지 발주비율 조회(월별발주비율)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6001_LDataSet ds = null;
		
		MT_PAPORD_6001_LDM dm = new MT_PAPORD_6001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
		dm.ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
		dm.print();

		ds = (MT_PAPORD_6001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 제지사별 용지 발주비율 조회(누적발주비율)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_6002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6002_LDataSet ds = null;
		
		MT_PAPORD_6002_LDM dm = new MT_PAPORD_6002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
		dm.ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
		dm.print();

		ds = (MT_PAPORD_6002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
