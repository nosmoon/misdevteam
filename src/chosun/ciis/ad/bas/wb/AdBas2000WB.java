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
import chosun.ciis.ad.bas.dao.AdBas2000DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2010_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2010_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas2000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2010_LDataSet ds = null;
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

        // DM Setting
    	AD_BAS_2010_LDM dm = new AD_BAS_2010_LDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setBasi_dt(basi_dt);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	
    	dm.print();
    	
        try {
        	AdBas2000DAO dao = new AdBas2000DAO();
            ds = dao.ad_bas_2010_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }    	
//    	AdBas2000EJBHome home = (AdBas2000EJBHome) JNDIManager.getInstance().getHome("AdBas2000EJB");
//        try {
//        	AdBas2000EJB ejb = home.create();
//            ds = ejb.ad_bas_2010_l(dm);
//            req.setAttribute("ds", ds);
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
