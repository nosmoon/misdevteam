/***************************************************************************************************
* ���ϸ� : SE_SAL_2000WB.java
* ��� : �Ǹ� - ������� - ������� - ��������ܰ�����
* �ۼ����� : 2009-04-08
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_2000DAO;
import chosun.ciis.se.sal.dm.SE_SAL_2000_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2010_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_2000_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2010_LDataSet;
/**
 * 
 */

public class SE_SAL_2000WB extends BaseWB{
	
	
	/**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_2000_MDataSet ds = null;

        // DM Setting
        SE_SAL_2000_MDM dm 		= new SE_SAL_2000_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);        

        try {
        	SE_SAL_2000DAO dao = new SE_SAL_2000DAO();
            ds = dao.se_sal_2000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_2000EJBHome home = (SE_SAL_2000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_2000EJB");
//        
//        try {
//        	SE_SAL_2000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_2000_m(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
    
    
    /**
     * ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_2010_LDataSet ds = null;

        // DM Setting
        SE_SAL_2010_LDM dm 		= new SE_SAL_2010_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        String bo_cd			= Util.checkString(req.getParameter("bo_cd"			));
        String bo_seq			= Util.checkString(req.getParameter("bo_seq"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
        dm.setBo_cd				(bo_cd		);
        dm.setBo_seq			(bo_seq		);
        
        try {
        	SE_SAL_2000DAO dao = new SE_SAL_2000DAO();
            ds = dao.se_sal_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_2000EJBHome home = (SE_SAL_2000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_2000EJB");
//        
//        try {
//        	SE_SAL_2000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_2010_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    } 
}
