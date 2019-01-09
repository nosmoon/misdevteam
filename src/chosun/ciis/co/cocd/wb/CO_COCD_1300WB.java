/***************************************************************************************************
* ���ϸ� : CO_COCD_1300WB
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

package chosun.ciis.co.cocd.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Hashtable;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.cocd.dao.CO_COCD_1300DAO;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.cocd.dm.CO_COCD_1300_MDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1310_LDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1320_IDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1330_UDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1340_DDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1350_MDM;
import chosun.ciis.co.cocd.ds.CO_COCD_1300_MDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1310_LDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1320_IDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1330_UDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1340_DDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1350_MDataSet;

/**
 * 
 */

public class CO_COCD_1300WB extends BaseWB{

    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1300_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	DBManager manager = new DBManager("MISCOM");
    	CO_COCD_1300_MDataSet ds = null;

        // DM Setting
        CO_COCD_1300_MDM dm = new CO_COCD_1300_MDM();
        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        
        dm.print();

        ds = (CO_COCD_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**��ȸ
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1310_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	DBManager manager = new DBManager("MISCOM");
    	CO_COCD_1310_LDataSet ds = null;

        // DM Setting
        CO_COCD_1310_LDM dm = new CO_COCD_1310_LDM();
        //dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
        dm.pgm_id = Util.checkString(req.getParameter("pgm_id"));
		dm.menu_id = Util.checkString(req.getParameter("menu_id"));
		dm.menu_nm = Util.checkString(req.getParameter("menu_nm"));
		dm.var_nm = Util.checkString(req.getParameter("var_nm"));
		dm.var_val = Util.checkString(req.getParameter("var_val"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
        
        dm.print();

        ds = (CO_COCD_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**���
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1320_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	DBManager manager = new DBManager("MISCOM");
    	CO_COCD_1320_IDataSet ds = null;

        // DM Setting
        CO_COCD_1320_IDM dm = new CO_COCD_1320_IDM();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_nm", true);		
        dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
        dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_nm", true);
        dm.chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);  
        
    	dm.cmpy_cd = Util.checkString((String) hash.get("cmpy_cd"));
		dm.pgm_id = Util.checkString((String) hash.get("pgm_id"));
		dm.var_nm = Util.checkString((String) hash.get("var_nm"));
		dm.var_val = Util.checkString((String) hash.get("var_val"));
		dm.descri = Util.checkString((String) hash.get("descri"));
		dm.menu_id = Util.checkString((String) hash.get("menu_id"));
        
        dm.print();
        
        ds = (CO_COCD_1320_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /**����
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1330_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	DBManager manager = new DBManager("MISCOM");
    	CO_COCD_1330_UDataSet ds = null;

        // DM Setting
        CO_COCD_1330_UDM dm = new CO_COCD_1330_UDM();
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_nm", true);
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);  
        
    	dm.cmpy_cd = Util.checkString((String) hash.get("cmpy_cd"));//PK
    	dm.var_nm = Util.checkString((String) hash.get("var_nm"));//PK
    	dm.pgm_id = Util.checkString((String) hash.get("pgm_id"));//PK
    	dm.descri = Util.checkString((String) hash.get("descri"));
    	dm.var_val = Util.checkString((String) hash.get("var_val"));
    	dm.menu_id = Util.checkString((String) hash.get("menu_id"));
    	
        dm.print();

        ds = (CO_COCD_1330_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**����
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1340_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	DBManager manager = new DBManager("MISCOM");
    	CO_COCD_1340_DDataSet ds = null;

        // DM Setting
        CO_COCD_1340_DDM dm = new CO_COCD_1340_DDM();
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);  
        
    	dm.cmpy_cd = Util.checkString((String) hash.get("cmpy_cd"));//PK
    	dm.var_nm = Util.checkString((String) hash.get("var_nm"));  //PK
    	dm.pgm_id = Util.checkString((String) hash.get("pgm_id"));  //PK
        
    	dm.print();

        ds = (CO_COCD_1340_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**�޴�idã���˾�
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1350_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	DBManager manager = new DBManager("MISCOM");
    	CO_COCD_1350_MDataSet ds = null;

        // DM Setting
        CO_COCD_1350_MDM dm = new CO_COCD_1350_MDM();
        dm.menu_id = Util.checkString(req.getParameter("menu_id"));
        
        dm.print();

        ds = (CO_COCD_1350_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
}
