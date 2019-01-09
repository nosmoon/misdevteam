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

package chosun.ciis.hd.dtbas.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

//import javax.ejb.CreateException;
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
import chosun.ciis.hd.ddemp.ds.HD_DDEMP_1000_LDataSet;
import chosun.ciis.hd.dtbas.dm.*;
import chosun.ciis.hd.dtbas.ds.*;
//import chosun.ciis.hd.dtbas.ejb.HD_DTBAS_1000EJB;
//import chosun.ciis.hd.dtbas.ejb.HD_DTBAS_1000EJBHome;
/**
 * 
 */

public class HD_DTBAS_1000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * �λ� �������ޱ��ؿ����� �����ڵ�
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_dtbas_1101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	HD_DTBAS_1101_LDataSet ds = null;

        // DM Setting
        HD_DTBAS_1101_LDM dm = new HD_DTBAS_1101_LDM();
        String cmpy_cd = "100";
        dm.setCmpy_cd(cmpy_cd);
        dm.setCd_clsf("52");
        dm.setJob_clsf("01");
        dm.setCnt("1");
        dm.print();

		ds = (HD_DTBAS_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    /**
     * �λ� �������ޱ��ؿ����� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_dtbas_1102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_DTBAS_1102_LDataSet ds = null;

        // DM Setting
        HD_DTBAS_1102_LDM dm = new HD_DTBAS_1102_LDM();
        String cmpy_cd = "100";
        dm.setCmpy_cd(cmpy_cd);
        dm.setDuty_alon_cd(Util.checkString(req.getParameter("duty_alon_cd")));
        dm.setSearch_bgn(Util.checkString(req.getParameter("search_bgn")));
        dm.setSearch_end(Util.checkString(req.getParameter("search_end")));
        dm.print();

		ds = (HD_DTBAS_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
}
