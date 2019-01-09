/***************************************************************************************************
* 파일명 : SE_SAL_1600WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 정정
* 작성일자 : 2009-04-14
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
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_1600DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1600_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1610_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1620_UDM;
import chosun.ciis.se.sal.dm.SE_SAL_1630_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1600_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1610_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1620_UDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1630_ADataSet;
/**
 * 
 */

public class SE_SAL_1600WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1600_MDataSet ds = null;

        // DM Setting
        SE_SAL_1600_MDM dm 		= new SE_SAL_1600_MDM();

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
        	SE_SAL_1600DAO dao = new SE_SAL_1600DAO();
            ds = dao.se_sal_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1600EJBHome home = (SE_SAL_1600EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1600EJB");
//        
//        try {
//        	SE_SAL_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1600_m(dm);
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
    public void se_sal_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1610_LDataSet ds = null;

        // DM Setting
        SE_SAL_1610_LDM dm 		= new SE_SAL_1610_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String search_gubun		= Util.checkString(req.getParameter("search_gubun"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setBgn_yymm			(bgn_yymm		);
        dm.setEnd_yymm			(end_yymm		);
        dm.setTeam				(team			);
        dm.setPart				(part			);
        dm.setArea				(area			);
        dm.setSearch_gubun		(search_gubun	);
                
        try {
        	SE_SAL_1600DAO dao = new SE_SAL_1600DAO();
            ds = dao.se_sal_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1600EJBHome home = (SE_SAL_1600EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1600EJB");
//        
//        try {
//        	SE_SAL_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1610_l(dm);
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
     * 저장
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1620_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1620_UDataSet ds = null;

        // DM Setting
        SE_SAL_1620_UDM dm 		= new SE_SAL_1620_UDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"	, true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        
        System.out.println("multiUpdate=" + multiUpdateData);
        
        Hashtable hash			= new Hashtable();
        hash 					= getHashMultiUpdateData(multiUpdateData);
        
        String mode				= Util.checkString((String) hash.get("m"			));
        String slip_occr_dt		= Util.checkString((String) hash.get("slip_occr_dt"	));
        String slip_clsf_cd		= Util.checkString((String) hash.get("slip_clsf_cd"	));
        String slip_seq			= Util.checkString((String) hash.get("slip_seq"		));
        String prof_type_cd		= Util.checkString((String) hash.get("prof_type_cd"	));
        String issu_clsf		= Util.checkString((String) hash.get("issu_clsf"	));
        String make_dt			= Util.checkString((String) hash.get("make_dt"		));
        
        dm.setMode				(mode.toUpperCase()	);
        dm.setSlip_occr_dt		(slip_occr_dt		);
        dm.setSlip_clsf_cd		(slip_clsf_cd		);
        dm.setSlip_seq			(slip_seq			);
        dm.setProf_type_cd		(prof_type_cd		);
        dm.setIssu_clsf			(issu_clsf			);
        dm.setMake_dt			(make_dt			);
        
        try {
        	SE_SAL_1600DAO dao = new SE_SAL_1600DAO();
            ds = dao.se_sal_1620_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1600EJBHome home = (SE_SAL_1600EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1600EJB");
//        
//        try {
//        	SE_SAL_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1620_u(dm);
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
     * 정정 처리 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1630_ADataSet ds = null;

        // DM Setting
        SE_SAL_1630_ADM dm 		= new SE_SAL_1630_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setBgn_yymm			(bgn_yymm		);
        dm.setEnd_yymm			(end_yymm		);
                
        try {
        	SE_SAL_1600DAO dao = new SE_SAL_1600DAO();
            ds = dao.se_sal_1630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1600EJBHome home = (SE_SAL_1600EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1600EJB");
//        
//        try {
//        	SE_SAL_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1630_a(dm);
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
