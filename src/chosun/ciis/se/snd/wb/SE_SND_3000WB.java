/***************************************************************************************************
* 파일명 : SE_SND_3000EJBHome.java
* 기능 : 판매-발송관리-발송부수증감체크 및 조회
* 작성일자 : 2009-05-22
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_3000DAO;
import chosun.ciis.se.snd.dm.SE_SND_3010_LDM;
import chosun.ciis.se.snd.ds.SE_SND_3010_LDataSet;
/**
 * 
 */

public class SE_SND_3000WB extends BaseWB{

    /**
     * 매체별 전일발송부수, 입력일 발송부수, 증감, 오차 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3010_LDataSet ds = null;

        // DM Setting
        SE_SND_3010_LDM dm 		= new SE_SND_3010_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"	, true);
        String issu_dt			= Util.checkString(req.getParameter("issu_dt"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIssu_dt			(issu_dt		);
        
        try {
        	SE_SND_3000DAO dao = new SE_SND_3000DAO();
            ds = dao.se_snd_3010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3000EJBHome home = (SE_SND_3000EJBHome) JNDIManager.getInstance().getHome("SE_SND_3000EJB");
//        
//        try {
//        	SE_SND_3000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3010_l(dm);
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
    
}
