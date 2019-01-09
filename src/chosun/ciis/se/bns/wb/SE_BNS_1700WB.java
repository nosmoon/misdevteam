/***************************************************************************************************
* 파일명 : SE_BNS_1700WB.java
* 기능 : 판매-판촉물관리 - 판촉물배분현황조회
* 작성일자 : 2009-05-04
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_1700DAO;
import chosun.ciis.se.bns.dm.SE_BNS_1700_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1710_LDM;
import chosun.ciis.se.bns.ds.SE_BNS_1700_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1710_LDataSet;
/**
 * 
 */

public class SE_BNS_1700WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1700_MDataSet ds = null;

        // DM Setting
        SE_BNS_1700_MDM dm 		= new SE_BNS_1700_MDM();

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
        	SE_BNS_1700DAO dao = new SE_BNS_1700DAO();
            ds = dao.se_bns_1700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1700EJBHome home = (SE_BNS_1700EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1700EJB");
//        
//        try {
//        	SE_BNS_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1700_m(dm);
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
     public void se_bns_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1710_LDataSet ds = null;

        // DM Setting
        SE_BNS_1710_LDM dm 		= new SE_BNS_1710_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String bns_item_cd		= Util.checkString(req.getParameter("bns_item_cd"	));
        String divn_yymm		= Util.checkString(req.getParameter("divn_yymm"		));
        String searchgubun		= Util.checkString(req.getParameter("searchgubun"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setBns_item_cd		(bns_item_cd);
        dm.setDivn_yymm			(divn_yymm	);
        dm.setSearchgubun		(searchgubun);
        
        try {
        	SE_BNS_1700DAO dao = new SE_BNS_1700DAO();
            ds = dao.se_bns_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1700EJBHome home = (SE_BNS_1700EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1700EJB");
//        
//        try {
//        	SE_BNS_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1710_l(dm);
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
