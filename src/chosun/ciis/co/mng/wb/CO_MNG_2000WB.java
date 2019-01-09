/***************************************************************************************************
* ���ϸ� : 
* ���? : 
 * �ۼ����� : 
 * �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ���? :
***************************************************************************************************/

package chosun.ciis.co.mng.wb;

import java.rmi.RemoteException;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.mng.dm.CO_MNG_2000_IDM;
import chosun.ciis.co.mng.ds.CO_MNG_2000_IDataSet;

//import chosun.ciis.co.mng.ejb.CO_MNG_1000EJB;
//import chosun.ciis.co.mng.ejb.CO_MNG_1000EJBHome;
/**
 * 
 */

public class CO_MNG_2000WB extends BaseWB{

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    
    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_mng_2000_i(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        //CO_MNG_1000_LDataSet ds = null;

        // DM Setting
        CO_MNG_2000_IDM dm = new CO_MNG_2000_IDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String user_id = Util.getSessionParameterValue(req, "uid", true);
        String page_id = Util.checkString(req.getParameter("page_id"));
        	
        dm.setCmpy_cd(cmpy_cd);
        dm.setUser_id(user_id);
        dm.setPage_id(page_id);
        
        dm.print();
/*        
        CO_MNG_1000EJBHome home = (CO_MNG_1000EJBHome) JNDIManager.getInstance().getHome("CO_MNG_1000EJB");
        
        try {
        	CO_MNG_1000EJB ejb = home.create();
            ds = ejb.co_mng_1000_l(dm);
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
        DBManager manager 			= new DBManager("MISCOM");
        CO_MNG_2000_IDataSet ds 	= (CO_MNG_2000_IDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }      
        req.setAttribute("ds", ds);
    }
        
}
 