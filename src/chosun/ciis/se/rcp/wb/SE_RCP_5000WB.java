/***************************************************************************************************
* 파일명 : SE_RCP_5000WB.java
* 기능 : 판매- 입금관리 - 마감관리 - 일입금마감
* 작성일자 : 2009-05-20
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_5000DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_5000_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5010_SDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5020_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5030_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_5000_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5010_SDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5020_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5030_ADataSet;
/**
 * 
 */

public class SE_RCP_5000WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5000_MDataSet ds = null;

        // DM Setting
        SE_RCP_5000_MDM dm 		= new SE_RCP_5000_MDM();

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
        	SE_RCP_5000DAO dao = new SE_RCP_5000DAO();
            ds = dao.se_rcp_5000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_5000EJBHome home = (SE_RCP_5000EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5000EJB");
//        
//        try {
//        	SE_RCP_5000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5000_m(dm);
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
     * 팀 마감상태 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5010_SDataSet ds = null;

        // DM Setting
        SE_RCP_5010_SDM dm 		= new SE_RCP_5010_SDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String dt				= Util.checkString(req.getParameter("dt"	));
        String team				= Util.checkString(req.getParameter("team"	));
        String part				= Util.checkString(req.getParameter("part"	));
        String area				= Util.checkString(req.getParameter("area"	));
        String gubun			= Util.checkString(req.getParameter("gubun"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setDt				(dt			);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setGubun				(gubun		);

        try {
        	SE_RCP_5000DAO dao = new SE_RCP_5000DAO();
            ds = dao.se_rcp_5010_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_5000EJBHome home = (SE_RCP_5000EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5000EJB");
//        
//        try {
//        	SE_RCP_5000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5010_s(dm);
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
    public void se_rcp_5020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5020_LDataSet ds = null;

        // DM Setting
        SE_RCP_5020_LDM dm 		= new SE_RCP_5020_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String dt				= Util.checkString(req.getParameter("dt"			));
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String gubun			= Util.checkString(req.getParameter("gubun"			));
        String searchgubun		= Util.checkString(req.getParameter("searchgubun"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setDt				(dt			);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setGubun				(gubun		);
        dm.setSearchgubun		(searchgubun);
        
        try {
        	SE_RCP_5000DAO dao = new SE_RCP_5000DAO();
            ds = dao.se_rcp_5020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_5000EJBHome home = (SE_RCP_5000EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5000EJB");
//        
//        try {
//        	SE_RCP_5000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5020_l(dm);
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
     * 마감 / 마감 취소 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5030_ADataSet ds = null;

        // DM Setting
        SE_RCP_5030_ADM dm 		= new SE_RCP_5030_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip   	= Util.checkString(req.getRemoteAddr());
        String dt				= Util.checkString(req.getParameter("dt"			));
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String gubun			= Util.checkString(req.getParameter("gubun"			));
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"		));
        String clos_gubun		= Util.checkString(req.getParameter("clos_gubun"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setDt				(dt				);
        dm.setTeam				(team			);
        dm.setPart				(part			);
        dm.setArea				(area			);
        dm.setGubun				(gubun			);
        dm.setClos_yn			(clos_yn		);
        dm.setClos_gubun		(clos_gubun		);
        
        try {
        	SE_RCP_5000DAO dao = new SE_RCP_5000DAO();
            ds = dao.se_rcp_5030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_5000EJBHome home = (SE_RCP_5000EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5000EJB");
//        
//        try {
//        	SE_RCP_5000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5030_a(dm);
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
