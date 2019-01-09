/***************************************************************************************************
* 파일명 : AdPub2600WB.java
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
import chosun.ciis.ad.pub.dao.AdPub2600DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2600_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2610_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2600_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2610_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2600WB extends BaseWB {
		
	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2600_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2600_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2600_MDM dm = new AD_PUB_2600_MDM();
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf      = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDealmedicd(dealmedicd);
        
        //dm.print();

        try {
        	AdPub2600DAO	dao = new AdPub2600DAO();
            ds = dao.ad_pub_2600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2600EJBHome home = (AdPub2600EJBHome) JNDIManager.getInstance().getHome("AdPub2600EJB");
//     
//        try {
//        	AdPub2600EJB ejb = home.create();
//            ds = ejb.ad_pub_2600_m(dm);
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
    public void ad_pub_2610_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2610_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2610_LDM dm = new AD_PUB_2610_LDM();

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);  //사코드
    	String pubc_dt_st = Util.checkString(req.getParameter("pubc_dt_st"));
    	String pubc_dt_ed = Util.checkString(req.getParameter("pubc_dt_ed"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String sec_no = Util.checkString(req.getParameter("sec_no"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPubc_dt_st(pubc_dt_st);
    	dm.setPubc_dt_ed(pubc_dt_ed);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setSec_no(sec_no);

        
        //dm.print();

        try {
        	AdPub2600DAO	dao = new AdPub2600DAO();
            ds = dao.ad_pub_2610_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2600EJBHome home = (AdPub2600EJBHome) JNDIManager.getInstance().getHome("AdPub2600EJB");
//     
//        try {
//        	AdPub2600EJB ejb = home.create();
//            ds = ejb.ad_pub_2610_l(dm);
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
