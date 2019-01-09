/***************************************************************************************************
* 파일명 : SE_SND_2200WB.java
* 기능 : 판매-발송관리-발송리스트
* 작성일자 : 2009-05-12
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
import chosun.ciis.se.snd.dao.SE_SND_2200DAO;
import chosun.ciis.se.snd.dm.SE_SND_2200_MDM;
import chosun.ciis.se.snd.ds.SE_SND_2200_MDataSet;
/**
 * 
 */

public class SE_SND_2200WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2200_MDataSet ds = null;

        // DM Setting
        SE_SND_2200_MDM dm 		= new SE_SND_2200_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_2200DAO dao = new SE_SND_2200DAO();
            ds = dao.se_snd_2200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2200EJBHome home = (SE_SND_2200EJBHome) JNDIManager.getInstance().getHome("SE_SND_2200EJB");
//        
//        try {
//        	SE_SND_2200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2200_m(dm);
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
