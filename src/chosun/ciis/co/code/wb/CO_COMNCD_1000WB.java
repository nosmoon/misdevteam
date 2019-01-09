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

package chosun.ciis.co.code.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;
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
import chosun.ciis.co.code.dm.*;
import chosun.ciis.co.code.ds.*;
//import chosun.ciis.co.code.ejb.CO_COMNCD_1000EJB;
//import chosun.ciis.co.code.ejb.CO_COMNCD_1000EJBHome;
/**
 * 
 */

public class CO_COMNCD_1000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * ����ŷ�ó ����Ʈ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_comncd_1000(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	//CO_COMNCD_SDataSet ds = null;

        // DM Setting
        CO_COMNCD_SDM dm = new CO_COMNCD_SDM();

        //dm.setCmpy_cd("100");
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setCd_clsf(Util.checkString(req.getParameter("cd_clsf")));
        dm.setJob_clsf(Util.checkString(req.getParameter("job_clsf")));
        dm.setCd(Util.checkString(req.getParameter("cd")));
        dm.print();

/*
        CO_COMNCD_1000EJBHome home = (CO_COMNCD_1000EJBHome) JNDIManager.getInstance().getHome("CO_COMNCD_1000EJB");
        try {
        	CO_COMNCD_1000EJB ejb = home.create();
            ds = ejb.getCo_Comncd_1000(dm);

            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/
        DBManager manager = new DBManager("MISCOM");
        
        CO_COMNCD_SDataSet ds = (CO_COMNCD_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("WB..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /**
     * �� ����ȭ�鿡�� ����ϴ� �޺��ڽ��� ����ŷ�ó ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1130(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	//CO_COCD_1130_LDataSet ds = null;

        // DM Setting
    	CO_COCD_1130_LDM dm = new CO_COCD_1130_LDM();

        dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
        dm.setCd_clsf(Util.checkString(req.getParameter("cd_clsf")));
        dm.setJob_clsf(Util.checkString(req.getParameter("job_clsf")));
        dm.setCnt(Util.checkString(req.getParameter("cnt")));
        dm.print();
/*
        CO_COMNCD_1000EJBHome home = (CO_COMNCD_1000EJBHome) JNDIManager.getInstance().getHome("CO_COMNCD_1000EJB");
        try {
        	CO_COMNCD_1000EJB ejb = home.create();
            ds = ejb.getCo_Cocd_1130(dm);

            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/
        DBManager manager = new DBManager("MISCOM");
        CO_COCD_1130_LDataSet ds = (CO_COCD_1130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("WB..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
}
