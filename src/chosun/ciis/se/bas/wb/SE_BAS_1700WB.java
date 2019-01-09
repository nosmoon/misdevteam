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
import chosun.ciis.se.bas.dao.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;


public class SE_BAS_1700WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서 코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1700_MDataSet ds = null;

        // DM Setting
        SE_BAS_1700_MDM dm = new SE_BAS_1700_MDM(); 
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_BAS_1700DAO dao = new SE_BAS_1700DAO();
            ds = dao.se_bas_1700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
    /**
     * 검색조건에 맞는 담당자 이력 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1710_LDataSet ds = null;

        // DM Setting
        SE_BAS_1710_LDM dm 	= new SE_BAS_1710_LDM();

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
        	SE_BAS_1700DAO dao = new SE_BAS_1700DAO();
            ds = dao.se_bas_1710_l(dm); 
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
    /**
     * 담당자를 등록, 수정, 삭제한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_BAS_1720_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    	
    	System.out.println("multiUpdateData: " + multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	String mode_ar = (String)hash.get("m"); 
		String aply_yymm_ar = (String)hash.get("aply_yymm");
		String medi_cd_ar = (String)hash.get("medi_cd");
		String bo_cd = (String)hash.get("bo_cd");
		String uprc_amt_ar = (String)hash.get("uprc_amt");
		String uprc_aply_clsf_ar = (String)hash.get("uprc_aply_clsf");
		String remk_ar = (String)hash.get("remk");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "uid", true);
        
        //DM Setting
        SE_BAS_1720_ADM dm = new SE_BAS_1720_ADM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMode(mode_ar.toUpperCase());
        dm.setAply_yymm(aply_yymm_ar);
        dm.setMedi_cd(medi_cd_ar);
        dm.setBo_cd(bo_cd);
        dm.setUprc_amt(uprc_amt_ar);
        dm.setUprc_aply_clsf(uprc_aply_clsf_ar);
        dm.setRemk(remk_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_BAS_1700DAO dao = new SE_BAS_1700DAO();
            ds = dao.se_bas_1720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
}
