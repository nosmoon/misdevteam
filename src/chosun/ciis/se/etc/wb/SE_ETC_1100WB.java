/***************************************************************************************************
* 파일명 : SE_ETC_1100WB.java
* 기능 : 판매-기타관리-확장수당 지급내역 조회
* 작성일자 : 2009-03-04
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.etc.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.etc.dao.SE_ETC_1100DAO;
import chosun.ciis.se.etc.dm.SE_ETC_1100_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1110_LDM;
import chosun.ciis.se.etc.ds.SE_ETC_1100_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1110_LDataSet;
/**
 * 
 */

public class SE_ETC_1100WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1100_MDataSet ds = null;

        // DM Setting
        SE_ETC_1100_MDM dm 		= new SE_ETC_1100_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_ETC_1100DAO dao = new SE_ETC_1100DAO();
            ds = dao.se_etc_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1100EJBHome home = (SE_ETC_1100EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1100EJB");
//        
//        try {
//        	SE_ETC_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1100_m(dm);
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
     * 확장수당 지급내역 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1110_LDataSet ds = null;

        // DM Setting
        SE_ETC_1110_LDM dm = new SE_ETC_1110_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String searchForm		= Util.checkString(req.getParameter("searchForm"	));
        String pay_obj_clsf		= Util.checkString(req.getParameter("pay_obj_clsf"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setBgn_yymm			(bgn_yymm		);
        dm.setEnd_yymm			(end_yymm		);
        dm.setTeam				(team			);
        dm.setPart				(part			);
        dm.setArea				(area			);
        dm.setSearchform		(searchForm		);
        dm.setPay_obj_clsf		(pay_obj_clsf	);
        
        dm.print();
        try {
        	SE_ETC_1100DAO dao = new SE_ETC_1100DAO();
            ds = dao.se_etc_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1100EJBHome home = (SE_ETC_1100EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1100EJB");
//        
//        try {
//        	SE_ETC_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1110_l(dm);
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
