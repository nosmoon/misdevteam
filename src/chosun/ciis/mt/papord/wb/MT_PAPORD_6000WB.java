/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_6000WB
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-16 
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
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
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * �����纰 ���� ���ֺ��� ��ȸ(���Ϲ��ֺ���)
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
	 * �����纰 ���� ���ֺ��� ��ȸ(�������ֺ���)
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
	 * �����纰 ���� ���ֺ��� ��ȸ(�������ֺ���)
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
