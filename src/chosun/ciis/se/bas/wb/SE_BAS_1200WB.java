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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bas.dao.SE_BAS_1200DAO;
import chosun.ciis.se.bas.dm.SE_BAS_1200_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1210_LDM;
import chosun.ciis.se.bas.dm.SE_BAS_1220_ADM;
import chosun.ciis.se.bas.ds.SE_BAS_1200_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1210_LDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1220_ADataSet;
/**
 * 
 */

public class SE_BAS_1200WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서 코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1200_MDataSet ds = null;

        // DM Setting
        SE_BAS_1200_MDM dm = new SE_BAS_1200_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_BAS_1200DAO dao = new SE_BAS_1200DAO();
            ds = dao.se_bas_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            ds = ejb.se_bas_1200_m(dm);
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
     * 검색조건에 맞는 담당자 이력 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1210_LDataSet ds = null;

        // DM Setting
        SE_BAS_1210_LDM dm 	= new SE_BAS_1210_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String aply_yymm_fr = Util.checkString(req.getParameter("aply_yymm_fr"));
        String aply_yymm_to = Util.checkString(req.getParameter("aply_yymm_to"));
        String medi_cd = Util.checkString(req.getParameter("medi_cd"));
        String sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setAply_yymm_fr(aply_yymm_fr);
        dm.setAply_yymm_to(aply_yymm_to);
        dm.setMedi_cd(medi_cd);
        dm.setSell_net_clsf(sell_net_clsf);
        
        
        try {
        	SE_BAS_1200DAO dao = new SE_BAS_1200DAO();
            ds = dao.se_bas_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1210_l(dm);
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
    public void se_bas_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_BAS_1220_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

        System.out.println("multiUpdateData: " + multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	System.out.println("11111111111111111111111");
    	String mode_ar = (String)hash.get("m"); 
    	System.out.println("2222222222222222222222");
		String aply_yymm_ar = (String)hash.get("aply_yymm");
		System.out.println("333333333333333333333");
		String medi_cd_ar = (String)hash.get("medi_cd");
		System.out.println("44444444444444444444444444");
		String sell_net_clsf_ar = (String)hash.get("sell_net_clsf");
		System.out.println("55555555555555555555555");
		String uprc_amt_ar = (String)hash.get("uprc_amt");
		System.out.println("6666666666666666666666");
		String uprc_aply_clsf_ar = (String)hash.get("uprc_aply_clsf");
		System.out.println("777777777777777777777");
		String remk_ar = (String)hash.get("remk");
		System.out.println("8888888888888888888888");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "uid", true);
        
        //DM Setting
        SE_BAS_1220_ADM dm = new SE_BAS_1220_ADM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMode(mode_ar.toUpperCase());
        dm.setAply_yymm(aply_yymm_ar);
        dm.setMedi_cd(medi_cd_ar);
        dm.setSell_net_clsf(sell_net_clsf_ar);
        dm.setUprc_amt(uprc_amt_ar);
        dm.setUprc_aply_clsf(uprc_aply_clsf_ar);
        dm.setRemk(remk_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_BAS_1200DAO dao = new SE_BAS_1200DAO();
            ds = dao.se_bas_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            ds = ejb.se_bas_1220_a(dm);
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
