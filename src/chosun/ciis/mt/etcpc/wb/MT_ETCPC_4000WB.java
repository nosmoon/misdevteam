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

public class MT_ETCPC_4000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    //������ ��볻��
    public void mt_etcpc_4100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_4100_LDataSet ds = null;
		
		MT_ETCPC_4100_LDM dm = new MT_ETCPC_4100_LDM();
		String wste_obj_item_yn = "";
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
		dm.use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
		dm.use_deptcd = Util.checkString(req.getParameter("use_deptcd"));
	
		if("2".equals(Util.checkString(req.getParameter("wste_obj_item_yn")))){           
			wste_obj_item_yn = "2";     		                                        
		}else if("3".equals(Util.checkString(req.getParameter("wste_obj_item_yn")))){           
			wste_obj_item_yn = "1";     		                                        
		}else{
			wste_obj_item_yn = "";
		}
		
		dm.wste_obj_item_yn = wste_obj_item_yn;
		dm.mchn_stat = Util.checkString(req.getParameter("mchn_stat"));
		
		String lend_item_yn = Util.checkString(req.getParameter("lend_item_yn"));
		if(!"1".equals(lend_item_yn)) lend_item_yn = "";
		dm.lend_item_yn = lend_item_yn; 
		
		dm.rsrt_dt_fr = Util.checkString(req.getParameter("rsrt_dt_fr"));
		dm.rsrt_dt_to = Util.checkString(req.getParameter("rsrt_dt_to"));
		dm.wste_dd_pers_fr = Util.checkString(req.getParameter("wste_dd_pers_fr"));
		dm.wste_dd_pers_to = Util.checkString(req.getParameter("wste_dd_pers_to"));
		dm.pay_dt_fr = Util.checkString(req.getParameter("pay_dt_fr"));
		dm.pay_dt_to = Util.checkString(req.getParameter("pay_dt_to"));
		dm.print();

		ds = (MT_ETCPC_4100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //��ġ s/w �˾�
    public void mt_etcpc_4201_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_4201_MDataSet ds = null;
		
		MT_ETCPC_4201_MDM dm = new MT_ETCPC_4201_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.swnm = Util.checkString(req.getParameter("swnm"));
		dm.make_cmpy = Util.checkString(req.getParameter("make_cmpy"));
		dm.print();

		ds = (MT_ETCPC_4201_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    //����Ʈ���� ��볻�� ��ȸ
    public void mt_etcpc_4200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_4200_LDataSet ds = null;
		
		MT_ETCPC_4200_LDM dm = new MT_ETCPC_4200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);		
		dm.use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
		dm.use_pers = Util.checkString(req.getParameter("use_pers"));
		dm.swlics_no = Util.checkString(req.getParameter("swlics_no"));
		dm.swmang_no = Util.checkString(req.getParameter("swlics_no"));
		dm.print();

		ds = (MT_ETCPC_4200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
