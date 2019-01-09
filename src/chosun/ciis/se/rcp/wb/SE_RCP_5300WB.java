/***************************************************************************************************
* 파일명 : SE_RCP_5300WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매출마감
* 작성일자 : 2009-04-10
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;
/**
 * 
 */

public class SE_RCP_5300WB extends BaseWB{

    /**
     * 초기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5300_MDataSet ds = null;

        // DM Setting
        SE_RCP_5300_MDM dm 		= new SE_RCP_5300_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.print();
        try {
        	SE_RCP_5300DAO dao = new SE_RCP_5300DAO();
            ds = dao.se_rcp_5300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1800EJBHome home = (SE_SAL_1800EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1800EJB");
//        
//        try {
//        	SE_SAL_1800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1800_m(dm);
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
     * 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5310_LDataSet ds = null;

        // DM Setting
        SE_RCP_5310_LDM dm 		= new SE_RCP_5310_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
        dm.print();
        
        try {
        	SE_RCP_5300DAO dao = new SE_RCP_5300DAO();
            ds = dao.se_rcp_5310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1800EJBHome home = (SE_SAL_1800EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1800EJB");
//        
//        try {
//        	SE_SAL_1800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1810_l(dm);
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
     * 매출마감/마감취소, 매출할인마감/마감취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5320_ADataSet ds = null;

        // DM Setting
        SE_RCP_5320_ADM dm 		= new SE_RCP_5320_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip   	= Util.checkString(req.getRemoteAddr()); 
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"	));
        String clos_gbn			= Util.checkString(req.getParameter("clos_gbn"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setClos_yn			(clos_yn		);
        dm.setClos_gbn			(clos_gbn		);

        dm.print();
        
        try {
        	SE_RCP_5300DAO dao = new SE_RCP_5300DAO();
            ds = dao.se_rcp_5320_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1800EJBHome home = (SE_SAL_1800EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1800EJB");
//        
//        try {
//        	SE_SAL_1800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1820_a(dm);
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
