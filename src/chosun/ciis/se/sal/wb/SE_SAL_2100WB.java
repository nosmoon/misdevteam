/***************************************************************************************************
* 파일명 : SE_SAL_2100WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 순매출액산출현황
* 작성일자 : 2009-04-07
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_2100DAO;
import chosun.ciis.se.sal.dm.SE_SAL_2100_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2110_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_2100_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2110_LDataSet;
/**
 * 
 */

public class SE_SAL_2100WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_2100_MDataSet ds = null;

        // DM Setting
        SE_SAL_2100_MDM dm 		= new SE_SAL_2100_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        String auth_gb			= "1";
        String feat_clsf		= "";
        
        Calendar cal 			= Calendar.getInstance();
        String yyyy				= String.valueOf(cal.get(cal.YEAR));
        String mm				= String.valueOf(cal.get(cal.MONTH) + 1);
        mm						= mm.length() == 1 ? "0" + mm : mm;
    	String dd				= String.valueOf(cal.get(cal.DATE));
    	dd						= dd.length() == 1 ? "0" + dd : dd;
        
        dm.setAuth_gb			(auth_gb		);
        dm.setFeat_clsf			(feat_clsf		);
        dm.setBase_dt			(yyyy + mm + dd	);
        
        try {
        	SE_SAL_2100DAO dao = new SE_SAL_2100DAO();
            ds = dao.se_sal_2100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_2100EJBHome home = (SE_SAL_2100EJBHome) JNDIManager.getInstance().getHome("SE_SAL_2100EJB");
//        
//        try {
//        	SE_SAL_2100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_2100_m(dm);
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
    public void se_sal_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_2110_LDataSet ds = null;

        // DM Setting
        SE_SAL_2110_LDM dm 		= new SE_SAL_2110_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"		));
        String searchgubun		= Util.checkString(req.getParameter("searchGubun"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBgn_yymm			(bgn_yymm	);
        dm.setEnd_yymm			(end_yymm	);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setMedi_cd			(medi_cd	);
        dm.setSearchgubun		(searchgubun);
        
        try {
        	SE_SAL_2100DAO dao = new SE_SAL_2100DAO();
            ds = dao.se_sal_2110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_2100EJBHome home = (SE_SAL_2100EJBHome) JNDIManager.getInstance().getHome("SE_SAL_2100EJB");
//        
//        try {
//        	SE_SAL_2100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_2110_l(dm);
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
