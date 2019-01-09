/***************************************************************************************************
* ���ϸ� : SE_BNS_1500WB.java
* ��� : �Ǹ� - ���˹����� - ���˹����ó��
* �ۼ����� : 2009-05-06
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_1500DAO;
import chosun.ciis.se.bns.dm.SE_BNS_1510_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1520_SDM;
import chosun.ciis.se.bns.dm.SE_BNS_1530_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1510_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1520_SDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1530_ADataSet;
/**
 * 
 */

public class SE_BNS_1500WB extends BaseWB{

	/**
     * ���˹����ó�� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1510_LDataSet ds = null;

        // DM Setting
        SE_BNS_1510_LDM dm 		= new SE_BNS_1510_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"	));
        String tms				= Util.checkString(req.getParameter("tms"		));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setYymm				(yymm			);
        dm.setMedi_cd			(medi_cd		);
        dm.setTms				(tms			);
                
        try {
        	SE_BNS_1500DAO dao = new SE_BNS_1500DAO();
            ds = dao.se_bns_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1500EJBHome home = (SE_BNS_1500EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1500EJB");
//        
//        try {
//        	SE_BNS_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1510_l(dm);
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
     * ���˹���л��� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1520_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1520_SDataSet ds = null;

        // DM Setting
        SE_BNS_1520_SDM dm 		= new SE_BNS_1520_SDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"	));
        String tms				= Util.checkString(req.getParameter("tms"		));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setYymm				(yymm			);
        dm.setMedi_cd			(medi_cd		);
        dm.setTms				(tms			);
                
        try {
        	SE_BNS_1500DAO dao = new SE_BNS_1500DAO();
            ds = dao.se_bns_1520_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1500EJBHome home = (SE_BNS_1500EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1500EJB");
//        
//        try {
//        	SE_BNS_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1520_s(dm);
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
     * ���˹���л��� ���ó��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1530_ADataSet ds = null;

        // DM Setting
        SE_BNS_1530_ADM dm 		= new SE_BNS_1530_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"	));
        String tms				= Util.checkString(req.getParameter("tms"		));
        String bgn_dt			= Util.checkString(req.getParameter("bgn_dt"	));
        String end_dt			= Util.checkString(req.getParameter("end_dt"	));
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"	));
        String divn_dt			= Util.checkString(req.getParameter("divn_dt"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setMedi_cd			(medi_cd		);
        dm.setTms				(tms			);
        dm.setBgn_dt			(bgn_dt			);
        dm.setEnd_dt			(end_dt			);
        dm.setClos_yn			(clos_yn		);
        dm.setDivn_dt			(divn_dt		);
                
        try {
        	SE_BNS_1500DAO dao = new SE_BNS_1500DAO();
            ds = dao.se_bns_1530_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1500EJBHome home = (SE_BNS_1500EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1500EJB");
//        
//        try {
//        	SE_BNS_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1530_a(dm);
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
