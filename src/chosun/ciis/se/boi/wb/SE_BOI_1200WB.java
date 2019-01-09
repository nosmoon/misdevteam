/***************************************************************************************************
* 파일명 : SE_BOI_1200WB.java
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

package chosun.ciis.se.boi.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_1200DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1200_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1210_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1220_UDM;
import chosun.ciis.se.boi.ds.SE_BOI_1200_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1210_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1220_UDataSet;
/**
 * 
 */

public class SE_BOI_1200WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1200_MDataSet ds = null;

        // DM Setting
        SE_BOI_1200_MDM dm = new SE_BOI_1200_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1200DAO dao = new SE_BOI_1200DAO();
            ds = dao.se_boi_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1200EJBHome home = (SE_BOI_1200EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1200EJB");
//        try {
//        	SE_BOI_1200EJB ejb = home.create();
//            ds = ejb.se_boi_1200_m(dm);
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
     * 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1210_LDataSet ds = null;

        // DM Setting
        SE_BOI_1210_LDM dm = new SE_BOI_1210_LDM();

		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String chg_gb = Util.checkString(req.getParameter("chg_gb"));
		String sch_gb = Util.checkString(req.getParameter("sch_gb"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setArea_cd(area_cd);
		dm.setChg_gb(chg_gb);
		dm.setSch_gb(sch_gb);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1200DAO dao = new SE_BOI_1200DAO();
            ds = dao.se_boi_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1200EJBHome home = (SE_BOI_1200EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1200EJB");
//        try {
//        	SE_BOI_1200EJB ejb = home.create();
//            ds = ejb.se_boi_1210_l(dm);
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
     * 수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1220_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1220_UDataSet ds = null;
        // DM Setting
        SE_BOI_1220_UDM dm = new SE_BOI_1220_UDM();
		String chg_gb = Util.checkString(req.getParameter("chg_gb"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setChg_gb(chg_gb);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
    	String mode_ar = (String)hash.get("m"); 
		String bo_cd_ar = (String)hash.get("bo_cd"); 
		String zip_ar = (String)hash.get("zip");
		String addr_ar = (String)hash.get("addr");
		String dtls_addr_ar = (String)hash.get("dtls_addr");
		String tel_no1_ar = (String)hash.get("tel_no1");
		String tel_no2_ar = (String)hash.get("tel_no2");
		String tel_no3_ar = (String)hash.get("tel_no3");
		
		dm.setMode_ar(mode_ar.toUpperCase());
		dm.setBo_cd_ar(bo_cd_ar);
		dm.setZip_ar(zip_ar);
		dm.setAddr_ar(addr_ar);
		dm.setDtls_addr_ar(dtls_addr_ar);
		dm.setTel_no1_ar(tel_no1_ar);
		dm.setTel_no2_ar(tel_no2_ar);
		dm.setTel_no3_ar(tel_no3_ar);

        try {
        	SE_BOI_1200DAO dao = new SE_BOI_1200DAO();
            ds = dao.se_boi_1220_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_BOI_1200EJBHome home = (SE_BOI_1200EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1200EJB");
//        try {
//        	SE_BOI_1200EJB ejb = home.create();
//            ds = ejb.se_boi_1220_u(dm);
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

    
}
