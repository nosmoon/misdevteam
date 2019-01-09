/***************************************************************************************************
* 파일명 : SE_ETC_1400WB.java
* 기능 : 판매 - 기타관리 - 리스트
* 작성일자 : 2009-08-21
* 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.etc.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.etc.dao.SE_ETC_1400DAO;
import chosun.ciis.se.etc.dm.SE_ETC_1400_MDM;
import chosun.ciis.se.etc.ds.SE_ETC_1400_MDataSet;
/**
 * 
 */

public class SE_ETC_1400WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1400_MDataSet ds = null;

        // DM Setting
        SE_ETC_1400_MDM dm 		= new SE_ETC_1400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);

		String auth_gb			= "1";
		String feat_clsf		= "";

		dm.setCmpy_cd(cmpy_cd);
		dm.setAuth_gb(auth_gb);
		dm.setIncmg_pers(incmg_pers);
		dm.setFeat_clsf(feat_clsf);
        
        try {
        	SE_ETC_1400DAO dao = new SE_ETC_1400DAO();
            ds = dao.se_etc_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_ETC_1400EJBHome home = (SE_ETC_1400EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1400EJB");
//        
//        try {
//        	SE_ETC_1400EJB ejb = home.create();
//            ds = ejb.se_etc_1400_m(dm);
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
