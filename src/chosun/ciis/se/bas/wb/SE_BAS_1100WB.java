/***************************************************************************************************
* 파일명 : SE_BAS_1100WB.java
* 기능 :  판매 - 기준정보 - 지역관리 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bas.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bas.dao.SE_BAS_1100DAO;
import chosun.ciis.se.bas.dm.SE_BAS_1100_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1110_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1120_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1130_ADM;
import chosun.ciis.se.bas.ds.SE_BAS_1100_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1110_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1120_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1130_ADataSet;
/**
 * 
 */

public class SE_BAS_1100WB extends BaseWB{

    /**
     * 초기값 셋 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	SE_BAS_1100_MDataSet ds = null;

        // DM Setting
        SE_BAS_1100_MDM dm = new SE_BAS_1100_MDM();

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
        	SE_BAS_1100DAO dao = new SE_BAS_1100DAO();
            ds = dao.se_bas_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BAS_1100EJBHome home = (SE_BAS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1100EJB");
//        
//        try {
//        	SE_BAS_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1100_m(dm);
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
     * 검색조건에 맞는 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1110_LDataSet ds = null;

        // DM Setting
        SE_BAS_1110_LDM dm = new SE_BAS_1110_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	= Util.getSessionParameterValue(req, "emp_no", true);
        String team_cd 		= Util.checkString(req.getParameter("team_cd_combo"	));
        String bo_cd   		= Util.checkString(req.getParameter("bo_cd_combo"	));
        String area_cd 		= Util.checkString(req.getParameter("area_cd_combo"	));
        
        dm.setCmpy_cd		(cmpy_cd	);
        dm.setTeam_cd		(team_cd	);
        dm.setBo_cd			(bo_cd		);
        dm.setArea_cd		(area_cd	);
        dm.setIncmg_pers	(incmg_pers	);
        
        try {
        	SE_BAS_1100DAO dao = new SE_BAS_1100DAO();
            ds = dao.se_bas_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BAS_1100EJBHome home = (SE_BAS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1100EJB");
//        
//        try {
//        	SE_BAS_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1110_l(dm);
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
     * 검색조건에 맞는 담당자 이력 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1120_LDataSet ds = null;

        // DM Setting
        SE_BAS_1120_LDM dm 	= new SE_BAS_1120_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	= Util.getSessionParameterValue(req, "emp_no", true);
        String area_cd  	= Util.checkString(req.getParameter("area_cd"));
        
        dm.setCmpy_cd		(cmpy_cd	);
        dm.setArea_cd		(area_cd	);
        dm.setIncmg_pers	(incmg_pers	);
        
        try {
        	SE_BAS_1100DAO dao = new SE_BAS_1100DAO();
            ds = dao.se_bas_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BAS_1100EJBHome home = (SE_BAS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1100EJB");
//        
//        try {
//        	SE_BAS_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1120_l(dm);
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
     *  지역과 담당자 등록, 수정, 삭제한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1130_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_BAS_1130_ADataSet ds = null;

        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        String[] converted = convertMultiUpdateData(multiUpdateData);
        
        int idx = 0;
        String mode 			= converted[idx++];
        String rownum       	= converted[idx++];
        String area_cd			= converted[idx++];
        String area_nm			= converted[idx++];
        String sido_cd			= converted[idx++];
        String sido_nm			= converted[idx++];
        String chrg_pers		= converted[idx++];
        String flnm				= converted[idx++];
        String dept_nm			= converted[idx++];
        String use_yn			= converted[idx++];
        String dept_cd			= converted[idx++];
        String area_cd_key		= converted[idx++];
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        //DM Setting
        SE_BAS_1130_ADM dm = new SE_BAS_1130_ADM();
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setArea_cd_key(area_cd_key);
        dm.setMode(mode.toUpperCase());
        dm.setArea_cd(area_cd);
        dm.setArea_nm(area_nm);
        dm.setSido_cd(sido_cd);
        dm.setSido_nm(sido_nm);
        dm.setChrg_pers(chrg_pers);
        dm.setFlnm(flnm);
        dm.setUse_yn(use_yn);
        dm.setDept_cd(dept_cd);
        
        try {
        	SE_BAS_1100DAO dao = new SE_BAS_1100DAO();
            ds = dao.se_bas_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd    =" + dm.getCmpy_cd()    );
//        System.out.println("area_cd_key=" + dm.getArea_cd_key());
//        System.out.println("mode       =" + dm.getMode()       );
//        System.out.println("area_cd    =" + dm.getArea_cd()    );
//        System.out.println("area_nm    =" + dm.getArea_nm()    );
//        System.out.println("sido_cd    =" + dm.getSido_cd()    );
//        System.out.println("sido_nm    =" + dm.getSido_nm()    );
//        System.out.println("chrg_pers  =" + dm.getChrg_pers()  );
//        System.out.println("flnm       =" + dm.getFlnm()       );
//        System.out.println("use_yn     =" + dm.getUse_yn()     );
//        System.out.println("dept_cd    =" + dm.getDept_cd()    );
//
//        SE_BAS_1100EJBHome home = (SE_BAS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1100EJB");
//        
//        try {
//        	SE_BAS_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1130_a(dm);
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
