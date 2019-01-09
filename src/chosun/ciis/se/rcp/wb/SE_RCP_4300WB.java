/***************************************************************************************************
* 파일명 : SE_RCP_4300WB.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 스포츠관련발행
* 작성일자 : 2009-05-25
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_4300DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_4300_MDM;
import chosun.ciis.se.rcp.ds.SE_RCP_4300_MDataSet;
/**
 * 
 */

public class SE_RCP_4300WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_4300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_4300_MDataSet ds = null;

        // DM Setting
        SE_RCP_4300_MDM dm 		= new SE_RCP_4300_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        String auth_gb			= "1";
        String feat_clsf		= "";
        
        Calendar cal 			= Calendar.getInstance();
        String yyyy				= String.valueOf(cal.get(cal.YEAR));
        String mm				= String.valueOf(cal.get(cal.MONTH) + 1);
        mm						= mm.length() == 1 ? "0" + mm : mm;
    	String dd				= String.valueOf(cal.get(cal.DATE));
    	dd						= dd.length() == 1 ? "0" + dd : dd;
        
        dm.setAuth_gb			(auth_gb		);
        dm.setFeat_clsf			(feat_clsf		);
        dm.setBase_dt			(yyyy + mm + dd	);
        
        try {
        	SE_RCP_4300DAO dao = new SE_RCP_4300DAO();
            ds = dao.se_rcp_4300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_4300EJBHome home = (SE_RCP_4300EJBHome) JNDIManager.getInstance().getHome("SE_RCP_4300EJB");
//        
//        try {
//        	SE_RCP_4300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_4300_m(dm);
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
