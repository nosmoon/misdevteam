/***************************************************************************************************
* 파일명 : AdPub23200WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 : 
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.pub.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub3200DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_3200_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_3210_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_3220_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_3200_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3210_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3220_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub3200WB extends BaseWB {
		
	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3200_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3200_MDataSet ds = null;

        // DM Setting
    	AD_PUB_3200_MDM dm = new AD_PUB_3200_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        //dm.print();

        try {
        	AdPub3200DAO	dao = new AdPub3200DAO();
            ds = dao.ad_pub_3200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }  
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3210_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3210_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3210_LDM dm = new AD_PUB_3210_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= "110";//Util.checkString(req.getParameter("medi_cd"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String edt_yn 		= Util.checkString(req.getParameter("edt_yn"));
    	String pubc_yn 		= Util.checkString(req.getParameter("pubc_yn"));
    	String advt_yn 		= Util.checkString(req.getParameter("advt_yn"));
    	String low_uprc		= Util.checkString(req.getParameter("low_uprc"));
    	String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
    	String sect_nm_cd 	= Util.checkString(req.getParameter("sect_nm_cd"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setEdt_yn(edt_yn);
    	dm.setPubc_yn(pubc_yn);
    	dm.setAdvt_yn(advt_yn);
    	dm.setLow_uprc(low_uprc);
    	dm.setSect_clsf_cd(sect_clsf_cd);
    	dm.setSect_nm_cd(sect_nm_cd);
        dm.print();

        try {
        	AdPub3200DAO	dao = new AdPub3200DAO();
            ds = dao.ad_pub_3210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 

    }  
    
    public void ad_pub_3220_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3220_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3220_LDM dm = new AD_PUB_3220_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= "110";//Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt 		= Util.checkString(req.getParameter("pubc_dt"));
    	String edt_yn 		= Util.checkString(req.getParameter("edt_yn"));
    	String pubc_yn 		= Util.checkString(req.getParameter("pubc_yn"));
    	String advt_yn 		= Util.checkString(req.getParameter("advt_yn"));
    	String low_uprc		= Util.checkString(req.getParameter("low_uprc"));
    	String sect_cd      = Util.checkString(req.getParameter("sect_cd"));
    	String sect_seq 	= Util.checkString(req.getParameter("sect_seq"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_dt(pubc_dt);
    	dm.setEdt_yn(edt_yn);
    	dm.setPubc_yn(pubc_yn);
    	dm.setAdvt_yn(advt_yn);
    	dm.setLow_uprc(low_uprc);
    	dm.setSect_cd(sect_cd);
    	dm.setSect_seq(sect_seq);
        dm.print();

        try {
        	AdPub3200DAO	dao = new AdPub3200DAO();
            ds = dao.ad_pub_3220_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 

    } 
}
