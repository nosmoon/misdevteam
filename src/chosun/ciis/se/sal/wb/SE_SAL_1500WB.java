/***************************************************************************************************
* ���ϸ� : SE_SAL_1500WB.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-14
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
import chosun.ciis.se.sal.dao.SE_SAL_1500DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1500_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1510_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1520_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1500_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1510_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1520_ADataSet;
/**
 * 
 */

public class SE_SAL_1500WB extends BaseWB{

	/**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1500_MDataSet ds = null;

        // DM Setting
        SE_SAL_1500_MDM dm 		= new SE_SAL_1500_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        
        
        try {
        	SE_SAL_1500DAO dao = new SE_SAL_1500DAO();
            ds = dao.se_sal_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1500EJBHome home = (SE_SAL_1500EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1500EJB");
//        
//        try {
//        	SE_SAL_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1500_m(dm);
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
    public void se_sal_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1510_LDataSet ds = null;

        // DM Setting
        SE_SAL_1510_LDM dm 		= new SE_SAL_1510_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
                
        try {
        	SE_SAL_1500DAO dao = new SE_SAL_1500DAO();
            ds = dao.se_sal_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1500EJBHome home = (SE_SAL_1500EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1500EJB");
//        
//        try {
//        	SE_SAL_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1510_l(dm);
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
     * ��꼭 1�� ����/���, 2�� ����/���
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1520_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1520_ADataSet ds = null;

        // DM Setting
        SE_SAL_1520_ADM dm 		= new SE_SAL_1520_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip   	= Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"	));
        String tms				= Util.checkString(req.getParameter("tms"		));
         
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setClos_yn			(clos_yn		);
        dm.setTms				(tms			);
        
        try {
        	SE_SAL_1500DAO dao = new SE_SAL_1500DAO();
            ds = dao.se_sal_1520_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1500EJBHome home = (SE_SAL_1500EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1500EJB");
//        
//        try {
//        	SE_SAL_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1520_a(dm);
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
