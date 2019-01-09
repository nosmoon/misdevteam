/***************************************************************************************************
* 파일명 : AdPub2400WB.java
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
import chosun.ciis.ad.pub.dao.AdPub2500DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2500_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2510_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2500_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2510_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2500WB extends BaseWB {
		
	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2500_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2500_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2500_MDM dm = new AD_PUB_2500_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        //dm.print();

        try {
        	AdPub2500DAO	dao = new AdPub2500DAO();
            ds = dao.ad_pub_2500_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2500EJBHome home = (AdPub2500EJBHome) JNDIManager.getInstance().getHome("AdPub2500EJB");
//     
//        try {
//        	AdPub2500EJB ejb = home.create();
//            ds = ejb.ad_pub_2500_m(dm);
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
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2510_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2510_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2510_LDM dm = new AD_PUB_2510_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= "110";//Util.checkString(req.getParameter("medi_cd"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String today 		= Util.checkString(req.getParameter("today"));
    	String wd_clsf      = Util.Uni2Ksc(Util.checkString(req.getParameter("wd_clsf")));
    	String dt_clfs      = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clfs")));
    	String nwsps 		= Util.checkString(req.getParameter("nwsps"));
    	String jasa_yb 		= Util.checkString(req.getParameter("jasa_yb"));
    	String chro_clsf 	= Util.checkString(req.getParameter("chro_clsf"));
    	String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
    	String sect_nm_cd 	= Util.checkString(req.getParameter("sect_nm_cd"));
    	String sect_all 	= Util.checkString(req.getParameter("sect_all"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setToday(today);
    	dm.setWd_clsf(wd_clsf);
    	dm.setDt_clfs(dt_clfs);
    	dm.setNwsps(nwsps);
    	dm.setJasa_yb(jasa_yb);
    	dm.setChro_clsf(chro_clsf);
    	dm.setSect_clsf_cd(sect_clsf_cd);
    	dm.setSect_nm_cd(sect_nm_cd);
    	dm.setSect_all(sect_all); 
        
        //dm.print();

        try {
        	AdPub2500DAO	dao = new AdPub2500DAO();
            ds = dao.ad_pub_2510_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2500EJBHome home = (AdPub2500EJBHome) JNDIManager.getInstance().getHome("AdPub2500EJB");
//     
//        try {
//        	AdPub2500EJB ejb = home.create();
//            ds = ejb.ad_pub_2510_l(dm);
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
