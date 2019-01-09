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
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    //��/���ó �����Ȳ ��ȸ
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
