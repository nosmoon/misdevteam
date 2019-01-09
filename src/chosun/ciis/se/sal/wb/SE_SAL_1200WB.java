/***************************************************************************************************
* 파일명 : SE_SAL_1200WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매출생성
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
import chosun.ciis.se.sal.dao.SE_SAL_1200DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1200_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1210_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1220_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1200_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1210_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1220_ADataSet;
/**
 * 
 */

public class SE_SAL_1200WB extends BaseWB{

  
    /**
     * 초기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1200_MDataSet ds = null;

        // DM Setting
        SE_SAL_1200_MDM dm 		= new SE_SAL_1200_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        
        try {
        	SE_SAL_1200DAO dao = new SE_SAL_1200DAO();
            ds = dao.se_sal_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1200EJBHome home = (SE_SAL_1200EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1200EJB");
//        
//        try {
//        	SE_SAL_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1200_m(dm);
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
    public void se_sal_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1210_LDataSet ds = null;

        // DM Setting
        SE_SAL_1210_LDM dm 		= new SE_SAL_1210_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
        
        try {
        	SE_SAL_1200DAO dao = new SE_SAL_1200DAO();
            ds = dao.se_sal_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1200EJBHome home = (SE_SAL_1200EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1200EJB");
//        
//        try {
//        	SE_SAL_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1210_l(dm);
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
     * 생성 / 생성 취소 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1220_ADataSet ds = null;

        // DM Setting
        SE_SAL_1220_ADM dm 		= new SE_SAL_1220_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm" 		));
        String tms 				= Util.checkString(req.getParameter("tms"));
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"	));
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String medi_cd			= "";
        String selldeptcd		= "";
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setTms				(tms			);
        dm.setClos_yn			(clos_yn		);
        dm.setMedi_cd			(medi_cd		);
        dm.setSelldeptcd		(selldeptcd		);
        
        try {
        	SE_SAL_1200DAO dao = new SE_SAL_1200DAO();
            ds = dao.se_sal_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1200EJBHome home = (SE_SAL_1200EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1200EJB");
//        
//        try {
//        	SE_SAL_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1220_a(dm);
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
