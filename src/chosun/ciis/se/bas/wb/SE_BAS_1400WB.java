/***************************************************************************************************
* 파일명 : SE_BAS_1400WB.java
* 기능 :  판매 - 기준정보 - 담당자 등록 
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bas.dao.SE_BAS_1400DAO;
import chosun.ciis.se.bas.dm.SE_BAS_1400_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1410_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1420_ADM;
import chosun.ciis.se.bas.ds.SE_BAS_1400_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1410_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1420_ADataSet;
/**
 * 
 */

public class SE_BAS_1400WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서 코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1400_MDataSet ds = null;

        // DM Setting
        SE_BAS_1400_MDM dm = new SE_BAS_1400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_BAS_1400DAO dao = new SE_BAS_1400DAO();
            ds = dao.se_bas_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1400EJBHome home = (SE_BAS_1400EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1400EJB");
//        
//        try {
//        	SE_BAS_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1400_m(dm);
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
    public void se_bas_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1410_LDataSet ds = null;

        // DM Setting
        SE_BAS_1410_LDM dm 	= new SE_BAS_1410_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String flnm     	= Util.checkString(req.getParameter("flnm"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setFlnm(flnm);
        
        
        try {
        	SE_BAS_1400DAO dao = new SE_BAS_1400DAO();
            ds = dao.se_bas_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1400EJBHome home = (SE_BAS_1400EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1400EJB");
//        
//        try {
//        	SE_BAS_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1410_l(dm);
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
     * 담당자를 등록, 수정, 삭제한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1420_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_BAS_1420_ADataSet ds = null;

        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        String[] converted = convertMultiUpdateData(multiUpdateData);
        
        int idx = 0;
        String mode 			= converted[idx++];
        String rownum       	= converted[idx++];
        String chrg_pers    	= converted[idx++];
        String flnm         	= converted[idx++];
        String clsf         	= converted[idx++];
        String dept_cd      	= converted[idx++];
        String use_yn       	= converted[idx++];
        String chrg_pers_key	= converted[idx++];
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        //DM Setting
        SE_BAS_1420_ADM dm = new SE_BAS_1420_ADM();
        
        dm.setMode(mode.toUpperCase());
        dm.setChrg_pers(chrg_pers);
        dm.setFlnm(flnm);
        dm.setClsf(clsf);
        dm.setDept_cd(dept_cd);
        dm.setUse_yn(use_yn);
        dm.setCmpy_cd(cmpy_cd);
        dm.setChrg_pers_key(chrg_pers_key);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_BAS_1400DAO dao = new SE_BAS_1400DAO();
            ds = dao.se_bas_1420_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("mode=" 		    + dm.getMode());
//        System.out.println("chrg_pers_key=" + dm.getChrg_pers_key());
//        System.out.println("chrg_pers="     + dm.getChrg_pers());
//        System.out.println("flnm=" 		    + dm.getFlnm());
//        System.out.println("clsf=" 		    + dm.getClsf());
//        System.out.println("dept_cd=" 	    + dm.getDept_cd());
//        System.out.println("use_yn=" 	    + dm.getUse_yn());
//        System.out.println("cmpy_cd=" 	    + dm.getCmpy_cd());
//        System.out.println("incmg_pers_ip=" + dm.getIncmg_pers_ip());
//        System.out.println("incmg_pers=" 	+ dm.getIncmg_pers());
//        
//        SE_BAS_1400EJBHome home = (SE_BAS_1400EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1400EJB");
//        
//        try {
//        	SE_BAS_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1420_a(dm);
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
