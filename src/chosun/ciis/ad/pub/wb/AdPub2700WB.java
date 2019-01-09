/***************************************************************************************************
* 파일명 : AdPub2700WB.java
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
import chosun.ciis.ad.pub.dao.AdPub2700DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2700_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2710_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2700_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2710_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2700WB extends BaseWB {
		
	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2700_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2700_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2700_MDM dm = new AD_PUB_2700_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String medi_cd    = "110";
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
        
        //dm.print();

        try {
        	AdPub2700DAO	dao = new AdPub2700DAO();
            ds = dao.ad_pub_2700_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2700EJBHome home = (AdPub2700EJBHome) JNDIManager.getInstance().getHome("AdPub2700EJB");
//     
//        try {
//        	AdPub2700EJB ejb = home.create();
//            ds = ejb.ad_pub_2700_m(dm);
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
    public void ad_pub_2710_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2710_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2710_LDM dm = new AD_PUB_2710_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String medi_cd    = "110";
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String today = Util.checkString(req.getParameter("today"));
        String sect_no = Util.checkString(req.getParameter("sect_no"));
        String sect = Util.checkString(req.getParameter("sect"));
        String frside = Util.checkString(req.getParameter("frside"));
        String toside = Util.checkString(req.getParameter("toside"));
        String sect_nm = Util.checkString(req.getParameter("sect_nm"));
        String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setToday(today);
        dm.setSect_no(sect_no);
        dm.setSect(sect);
        dm.setFrside(frside);
        dm.setToside(toside);
        dm.setSect_nm(sect_nm);
        dm.setChro_clsf(chro_clsf);
        
        //dm.print();

        try {
        	AdPub2700DAO	dao = new AdPub2700DAO();
            ds = dao.ad_pub_2710_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2700EJBHome home = (AdPub2700EJBHome) JNDIManager.getInstance().getHome("AdPub2700EJB");
//     
//        try {
//        	AdPub2700EJB ejb = home.create();
//            ds = ejb.ad_pub_2710_l(dm);
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
