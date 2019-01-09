/***************************************************************************************************
* 파일명 : SE_RCP_2800WB.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-24
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
import chosun.ciis.se.rcp.dao.SE_RCP_2800DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_2800_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_2810_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_2820_LDM;
import chosun.ciis.se.rcp.ds.SE_RCP_2800_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_2810_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_2820_LDataSet;
/**
 * 
 */

public class SE_RCP_2800WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_2800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_2800_MDataSet ds = null;

        // DM Setting
        SE_RCP_2800_MDM dm 		= new SE_RCP_2800_MDM();

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
        	SE_RCP_2800DAO dao = new SE_RCP_2800DAO();
            ds = dao.se_rcp_2800_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_2800EJBHome home = (SE_RCP_2800EJBHome) JNDIManager.getInstance().getHome("SE_RCP_2800EJB");
//        
//        try {
//        	SE_RCP_2800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_2800_m(dm);
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
    public void se_rcp_2810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_2810_LDataSet ds = null;

        // DM Setting
        SE_RCP_2810_LDM dm 		= new SE_RCP_2810_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        String gubun			= Util.checkString(req.getParameter("gubun"		));
        String gurt_yn			= Util.checkString(req.getParameter("gurt_yn"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setGubun				(gubun		);
        dm.setGurt_yn			(gurt_yn	);
        
        try {
        	SE_RCP_2800DAO dao = new SE_RCP_2800DAO();
            ds = dao.se_rcp_2810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_2800EJBHome home = (SE_RCP_2800EJBHome) JNDIManager.getInstance().getHome("SE_RCP_2800EJB");
//        
//        try {
//        	SE_RCP_2800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_2810_l(dm);
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
     * 보증인 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_2820_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_2820_LDataSet ds = null;

        // DM Setting
        SE_RCP_2820_LDM dm 		= new SE_RCP_2820_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String bo_cd			= Util.checkString(req.getParameter("bo_cd"		));
        String bo_seq			= Util.checkString(req.getParameter("bo_seq"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setBo_cd				(bo_cd		);
        dm.setBo_seq			(bo_seq		);
        
        try {
        	SE_RCP_2800DAO dao = new SE_RCP_2800DAO();
            ds = dao.se_rcp_2820_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_2800EJBHome home = (SE_RCP_2800EJBHome) JNDIManager.getInstance().getHome("SE_RCP_2800EJB");
//        
//        try {
//        	SE_RCP_2800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_2820_l(dm);
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
