/***************************************************************************************************
* 파일명 : SE_SAL_1800WB.java
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

package chosun.ciis.se.sal.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_1800DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1800_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1810_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1820_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1800_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1810_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1820_ADataSet;
/**
 * 
 */

public class SE_SAL_1800WB extends BaseWB{

    /**
     * 초기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1800_MDataSet ds = null;

        // DM Setting
        SE_SAL_1800_MDM dm 		= new SE_SAL_1800_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        
        try {
        	SE_SAL_1800DAO dao = new SE_SAL_1800DAO();
            ds = dao.se_sal_1800_m(dm);
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
    public void se_sal_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1810_LDataSet ds = null;

        // DM Setting
        SE_SAL_1810_LDM dm 		= new SE_SAL_1810_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
                
        try {
        	SE_SAL_1800DAO dao = new SE_SAL_1800DAO();
            ds = dao.se_sal_1810_l(dm);
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
    public void se_sal_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1820_ADataSet ds = null;

        // DM Setting
        SE_SAL_1820_ADM dm 		= new SE_SAL_1820_ADM();

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
        
        try {
        	SE_SAL_1800DAO dao = new SE_SAL_1800DAO();
            ds = dao.se_sal_1820_a(dm);
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
