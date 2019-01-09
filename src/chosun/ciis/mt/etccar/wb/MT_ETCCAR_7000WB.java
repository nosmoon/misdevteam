/***************************************************************************************************
* ���ϸ� : 
* ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
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

public class MT_ETCCAR_7000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    
    // ������ܰ� ��ȸ 
    public void mt_etccar_7001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_7001_LDataSet ds = null;
		
		MT_ETCCAR_7001_LDM dm = new MT_ETCCAR_7001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_7001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
		
		
		
	}
    public void mt_etccar_7002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_7002_ADataSet ds = null;
		
		MT_ETCCAR_7002_ADM dm = new MT_ETCCAR_7002_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.close_yymm = Util.checkString(req.getParameter("close_yymm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_7002_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
}
