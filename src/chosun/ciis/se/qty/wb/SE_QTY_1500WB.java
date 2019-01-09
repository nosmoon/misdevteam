/***************************************************************************************************
* ���ϸ� : SE_QTY_1500WB.java
 * ��� : �μ����� - �����μ�����ڷ�
 * �ۼ����� : 2009-02-20 
 * �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.qty.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_1500DAO;
import chosun.ciis.se.qty.dm.SE_QTY_1500_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_1510_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_1500_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1510_LDataSet;
/**
 * 
 */

public class SE_QTY_1500WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1500_MDataSet ds = null;

        // DM Setting
        SE_QTY_1500_MDM dm = new SE_QTY_1500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_1500DAO dao = new SE_QTY_1500DAO();
            ds = dao.se_qty_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_QTY_1500EJBHome home = (SE_QTY_1500EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1500EJB");
//        
//        try {
//        	SE_QTY_1500EJB ejb = home.create();
//            ds = ejb.se_qty_1500_m(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * ����Ʈ ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1510_LDataSet ds = null;

        // DM Setting
        SE_QTY_1510_LDM dm = new SE_QTY_1510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.schgb = Util.checkString(req.getParameter("schgb"));
		dm.qty1 = Util.checkString(req.getParameter("qty1"));
		dm.qty2 = Util.checkString(req.getParameter("qty2"));
		dm.schlevel = Util.checkString(req.getParameter("schlevel"));
        
		if(dm.yymm.length()==8) dm.yymm = dm.yymm.substring(0,6);

        try {
        	SE_QTY_1500DAO dao = new SE_QTY_1500DAO();
            ds = dao.se_qty_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//        try {
//        	SE_QTY_1500EJBHome home = (SE_QTY_1500EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1500EJB");
//        	SE_QTY_1500EJB ejb = home.create();
//            ds = ejb.se_qty_1510_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    
}
