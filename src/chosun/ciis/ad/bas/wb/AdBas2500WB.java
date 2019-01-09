/***************************************************************************************************
* 파일명 : .java
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

package chosun.ciis.ad.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas2500DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2510_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2510_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas2500WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2510_LDataSet ds = null;

        // DM Setting
    	AD_BAS_2510_LDM dm = new AD_BAS_2510_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd    = "110";
    	String dt         = Util.checkString(req.getParameter("dt"));
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDt(dt);
        
    	//dm.print(); 

        try {
        	AdBas2500DAO dao = new AdBas2500DAO();
            ds = dao.ad_bas_2510_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
        
//    	AdBas2500EJBHome home = (AdBas2500EJBHome) JNDIManager.getInstance().getHome("AdBas2500EJB");
//        try {
//        	AdBas2500EJB ejb = home.create();
//            ds = ejb.ad_bas_2510_l(dm);
//            req.setAttribute("ds", ds);
//
//            long end_tm = System.currentTimeMillis();
//            
//            System.out.println("elapsed = " + (end_tm - start_tm));
//            
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    
}
