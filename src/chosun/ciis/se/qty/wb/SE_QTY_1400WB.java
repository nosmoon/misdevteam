/***************************************************************************************************
* ���ϸ� : SE_QTY_1400WB.java
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

package chosun.ciis.se.qty.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_1400DAO;
import chosun.ciis.se.qty.dm.SE_QTY_1400_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_1410_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_1400_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1410_LDataSet;
/**
 * 
 */

public class SE_QTY_1400WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1400_MDataSet ds = null;

        // DM Setting
        SE_QTY_1400_MDM dm = new SE_QTY_1400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_1400DAO dao = new SE_QTY_1400DAO();
            ds = dao.se_qty_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_QTY_1400EJBHome home = (SE_QTY_1400EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1400EJB");
//        
//        try {
//        	SE_QTY_1400EJB ejb = home.create();
//            ds = ejb.se_qty_1400_m(dm);
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
     * �ϰ賻�� ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1410_LDataSet ds = null;

        // DM Setting
        SE_QTY_1410_LDM dm = new SE_QTY_1410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		String bo_cdseq = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_cd = bo_cdseq.substring(0,5);
		dm.bo_seq = bo_cdseq.substring(5,8);
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String yymm = Util.checkString(req.getParameter("yymm"));
		if(yymm.length()==8) yymm = yymm.substring(0,4);
		dm.yymm = yymm;
        
        try {
        	SE_QTY_1400DAO dao = new SE_QTY_1400DAO();
            ds = dao.se_qty_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
//        try {
//        	SE_QTY_1400EJBHome home = (SE_QTY_1400EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1400EJB");
//        	SE_QTY_1400EJB ejb = home.create();
//            ds = ejb.se_qty_1410_l(dm);
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
