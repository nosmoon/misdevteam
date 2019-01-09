/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bas.wb;

import java.util.Calendar;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bas.dao.SE_BAS_1000DAO;
import chosun.ciis.se.bas.dm.SE_BAS_1010_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1020_SDM;
import chosun.ciis.se.bas.dm.SE_BAS_1030_ADM;
import chosun.ciis.se.bas.dm.SE_BAS_1040_MDM;
import chosun.ciis.se.bas.ds.SE_BAS_1010_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1020_SDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1030_ADataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1040_MDataSet;
/**
 * 
 */

public class SE_BAS_1000WB extends BaseWB {

    /**
     * 부서 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void getList(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1010_LDataSet ds = null;

        // DM Setting
        SE_BAS_1010_LDM dm = new SE_BAS_1010_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setCmpy_cd(cmpy_cd);

        try {
        	SE_BAS_1000DAO dao = new SE_BAS_1000DAO();
            ds = dao.getList(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1000EJBHome home = (SE_BAS_1000EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1000EJB");
//        try {
//        	SE_BAS_1000EJB ejb = home.create();
//            ds = ejb.getList(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 부서 상세조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void getDetail(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1020_SDataSet ds = null;

        // DM Setting
        SE_BAS_1020_SDM dm = new SE_BAS_1020_SDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.setCmpy_cd(cmpy_cd);
        dm.setDept_cd(dept_cd);       

        try {
        	SE_BAS_1000DAO dao = new SE_BAS_1000DAO();
            ds = dao.getDetail(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1000EJBHome home = (SE_BAS_1000EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1000EJB");
//        try {
//        	SE_BAS_1000EJB ejb = home.create();
//            ds = ejb.getDetail(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }

    /**
     * 
     * 리스트에서 멀티로 등록,수정,삭제 처리하기
     * 
     * 
     * @param req
     * @param res
     * @throws AppException
     */
    public void multiExec(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	SE_BAS_1030_ADataSet ds = null;  

		String accflag = Util.checkString(req.getParameter("accflag"));
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
		String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		String dept_cd = Util.checkString(req.getParameter("dept_cd"));
		String hdpt_cd = Util.checkString(req.getParameter("hdpt_cd"));
		String dept_nm = Util.checkString(req.getParameter("dept_nm"));
		String use_yn = Util.checkString(req.getParameter("use_yn"));
		String feat_clsf = Util.checkString(req.getParameter("feat_clsf"));
		String step = Util.checkString(req.getParameter("step"));
		String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));


    	String multiUpDate = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 

        // DM Setting
        SE_BAS_1030_ADM dm = new SE_BAS_1030_ADM();
       
		dm.setAccflag(accflag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setSupr_dept_cd(supr_dept_cd);
		dm.setChrg_pers(chrg_pers);
		dm.setDept_cd(dept_cd);
		dm.setHdpt_cd(hdpt_cd);
		dm.setDept_nm(dept_nm);
		dm.setUse_yn(use_yn);
		dm.setFeat_clsf(feat_clsf);
		dm.setStep(step);

        dm.setMode_ar(mode_ar.toUpperCase());
        
        dm.dept_cd_ar = (String)hash.get("dept_cd");
		dm.area_cd_ar = (String)hash.get("area_cd");
		dm.area_nm_ar = (String)hash.get("area_nm");
		dm.sido_cd_ar = (String)hash.get("sido_cd");
		dm.chrg_pers_ar = (String)hash.get("chrg_pers");
		dm.acct_sido_cd_ar = (String)hash.get("acct_sido_cd");
		dm.sell_sido_cd_ar = (String)hash.get("sell_sido_cd");
		dm.sell_srt_col_ar = (String)hash.get("sell_srt_col");
		dm.use_yn_ar = (String)hash.get("use_yn");

		dm.setIncmgpers(incmgpers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

        try {
        	SE_BAS_1000DAO dao = new SE_BAS_1000DAO();
            ds = dao.multiUpdate(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1000EJBHome home = (SE_BAS_1000EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1000EJB");
//        try {
//        	SE_BAS_1000EJB ejb = home.create();
//            ds = ejb.multiUpdate(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    
    /**
     * 팀, 파트/지사 콤보 초기값 셋 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1040_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	SE_BAS_1040_MDataSet ds = null;

        // DM Setting
        SE_BAS_1040_MDM dm = new SE_BAS_1040_MDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	= Util.getSessionParameterValue(req, "emp_no", true);
        String auth_gb		= "1";
        String feat_clsf	= "";
        
        Calendar cal 		= Calendar.getInstance();
        String yyyy			= String.valueOf(cal.get(cal.YEAR));
        String mm			= String.valueOf(cal.get(cal.MONTH) + 1);
        String dd			= String.valueOf(cal.get(cal.DATE));
        
        dm.setCmpy_cd		(cmpy_cd		);
        dm.setAuth_gb		(auth_gb		);
        dm.setIncmg_pers	(incmg_pers		);
        dm.setFeat_clsf		(feat_clsf		);
        dm.setBase_dt		(yyyy + mm + dd	);
        
        try {
        	SE_BAS_1000DAO dao = new SE_BAS_1000DAO();
            ds = dao.se_bas_1040_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BAS_1000EJBHome home = (SE_BAS_1000EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1000EJB");
//        
//        try {
//        	SE_BAS_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1040_m(dm);
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
