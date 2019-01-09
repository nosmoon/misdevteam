/***************************************************************************************************
* 파일명 : AdRes1700WB.java
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

package chosun.ciis.ad.res.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes1700DAO;
import chosun.ciis.ad.res.dm.AD_RES_1710_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1710_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1700WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1710_LDataSet ds = null;

        // DM Setting
    	AD_RES_1710_LDM dm = new AD_RES_1710_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setDlco_no(dlco_no);

        try {
        	AdRes1700DAO	dao = new AdRes1700DAO();
            ds = dao.ad_res_1710_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1700EJBHome home = (AdRes1700EJBHome) JNDIManager.getInstance().getHome("AdRes1700EJB");
//        try {
//        	AdRes1700EJB ejb = home.create();
//            ds = ejb.ad_res_1710_l(dm);
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
