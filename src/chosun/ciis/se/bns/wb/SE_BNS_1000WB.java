/***************************************************************************************************
* 파일명 : SE_BNS_1000WB.java
* 기능 : 판매-판촉물관리 - 판촉물미수금현황
* 작성일자 : 2009-04-28
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
import chosun.ciis.se.bns.dao.SE_BNS_1000DAO;
import chosun.ciis.se.bns.dm.SE_BNS_1000_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1010_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1020_LDM;
import chosun.ciis.se.bns.ds.SE_BNS_1000_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1010_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1020_LDataSet;
/**
 * 
 */

public class SE_BNS_1000WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1000_MDataSet ds = null;

        // DM Setting
        SE_BNS_1000_MDM dm 		= new SE_BNS_1000_MDM();

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
        	SE_BNS_1000DAO dao = new SE_BNS_1000DAO();
            ds = dao.se_bns_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1000EJBHome home = (SE_BNS_1000EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1000EJB");
//        
//        try {
//        	SE_BNS_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1000_m(dm);
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
    public void se_bns_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1010_LDataSet ds = null;

        // DM Setting
        SE_BNS_1010_LDM dm 		= new SE_BNS_1010_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String searchgubun		= Util.checkString(req.getParameter("searchgubun"	));
        String divn_yymm		= Util.checkString(req.getParameter("divn_yymm" 	));
        String bns_item_cd		= Util.checkString(req.getParameter("bns_item_cd"	));
        String bal_yn		    = Util.checkString(req.getParameter("bal_yn"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setSearchgubun		(searchgubun);
        dm.setDivn_yymm 		(divn_yymm  );
        dm.setBns_item_cd		(bns_item_cd);
        dm.setBal_yn		(bal_yn);
        dm.print();
        
        try {
        	SE_BNS_1000DAO dao = new SE_BNS_1000DAO();
            ds = dao.se_bns_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1000EJBHome home = (SE_BNS_1000EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1000EJB");
//        
//        try {
//        	SE_BNS_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1010_l(dm);
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
    


	public void se_bns_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BNS_1020_LDataSet ds = null;
		SE_BNS_1020_LDM dm = new SE_BNS_1020_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.team = Util.checkString(req.getParameter("team"));
		dm.part = Util.checkString(req.getParameter("part"));
		dm.area = Util.checkString(req.getParameter("area"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		dm.bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
		dm.basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
		dm.searchgubun = Util.checkString(req.getParameter("searchgubun"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

        try {
        	SE_BNS_1000DAO dao = new SE_BNS_1000DAO();
            ds = dao.se_bns_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	}

}
