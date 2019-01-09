
package chosun.ciis.se.sal.wb;

import java.util.Calendar;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_1000DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1000_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1010_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1020_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1030_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1040_DDM;
import chosun.ciis.se.sal.dm.SE_SAL_1050_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_1000_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1010_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1020_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1030_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1040_DDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1050_LDataSet;
/**
 * 
 */

public class SE_SAL_1000WB extends BaseWB{

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1000_MDataSet ds = null;

        // DM Setting
        SE_SAL_1000_MDM dm 		= new SE_SAL_1000_MDM();

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
        	SE_SAL_1000DAO dao = new SE_SAL_1000DAO();
            ds = dao.se_sal_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1000EJBHome home = (SE_SAL_1000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1000EJB");
//        
//        try {
//        	SE_SAL_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1000_m(dm);
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
     * vȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1010_LDataSet ds = null;

        // DM Setting
        SE_SAL_1010_LDM dm 		= new SE_SAL_1010_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        
        try {
        	SE_SAL_1000DAO dao = new SE_SAL_1000DAO();
            ds = dao.se_sal_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1000EJBHome home = (SE_SAL_1000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1000EJB");
//        
//        try {
//        	SE_SAL_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1010_l(dm);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1020_LDataSet ds = null;

        // DM Setting
        SE_SAL_1020_LDM dm 		= new SE_SAL_1020_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        
        try {
        	SE_SAL_1000DAO dao = new SE_SAL_1000DAO();
            ds = dao.se_sal_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1000EJBHome home = (SE_SAL_1000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1000EJB");
//        
//        try {
//        	SE_SAL_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1020_l(dm);
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
     *  
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SAL_1030_ADataSet ds = null;
    	
    	//DM Setting
        SE_SAL_1030_ADM dm = new SE_SAL_1030_ADM();

    	
    	
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdate1=" + multiUpdateData);
    	
    	Hashtable hash 				= getHashMultiUpdateData(multiUpdateData);
    	
       	 	
       	String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
    	
        dm.setCmpy_cd				(cmpy_cd		);
        dm.setIncmg_pers			(incmg_pers		);
        dm.setIncmg_pers_ip			(incmg_pers_ip	);
        
        String mode        			= Util.checkString((String) hash.get("mode"			));
        String yymm        			= Util.checkString((String) hash.get("yymm"			));
        String supr_dept_cd			= Util.checkString((String) hash.get("supr_dept_cd"	));
        String supr_dept_nm			= Util.checkString((String) hash.get("supr_dept_nm"	));
        String dept_cd     			= Util.checkString((String) hash.get("dept_cd"		));
        String dept_nm     			= Util.checkString((String) hash.get("dept_nm"		));
        String hdpt_cd     			= Util.checkString((String) hash.get("hdpt_cd"		));
        String sido_cd     			= Util.checkString((String) hash.get("sido_cd"		));
        String area_cd     			= Util.checkString((String) hash.get("area_cd"		));
        String chrg_pers   			= Util.checkString((String) hash.get("chrg_pers"	));
        String step        			= Util.checkString((String) hash.get("step"			));
        String gubun       			= Util.checkString((String) hash.get("gubun"		));
        
        dm.setMode					(mode.toUpperCase()	);
        dm.setYymm					(yymm				);
        dm.setSupr_dept_cd			(supr_dept_cd		);
        dm.setSupr_dept_nm			(supr_dept_nm		);
        dm.setDept_cd				(dept_cd			);
        dm.setDept_nm				(dept_nm			);
        dm.setHdpt_cd				(hdpt_cd			);
        dm.setSido_cd				(sido_cd			);
        dm.setArea_cd				(area_cd			);
        dm.setChrg_pers				(chrg_pers			);
        dm.setStep					(step				);
        dm.setGubun					(gubun				);
        
        try {
        	SE_SAL_1000DAO dao = new SE_SAL_1000DAO();
            ds = dao.se_sal_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1000EJBHome home = (SE_SAL_1000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1000EJB");
//        
//        try {
//        	SE_SAL_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1030_a(dm);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1040_d(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1040_DDataSet ds = null;

        // DM Setting
        SE_SAL_1040_DDM dm 		= new SE_SAL_1040_DDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        
        try {
        	SE_SAL_1000DAO dao = new SE_SAL_1000DAO();
            ds = dao.se_sal_1040_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1000EJBHome home = (SE_SAL_1000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1000EJB");
//        
//        try {
//        	SE_SAL_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1040_d(dm);
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
     * ¿¢¼¿ze 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1050_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1050_LDataSet ds = null;

        // DM Setting
        SE_SAL_1050_LDM dm 		= new SE_SAL_1050_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        
        try {
        	SE_SAL_1000DAO dao = new SE_SAL_1000DAO();
            ds = dao.se_sal_1050_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1000EJBHome home = (SE_SAL_1000EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1000EJB");
//        
//        try {
//        	SE_SAL_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1050_l(dm);
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
