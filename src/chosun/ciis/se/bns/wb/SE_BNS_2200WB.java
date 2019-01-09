/***************************************************************************************************
* 파일명 : SE_BNS_2200WB.java
* 기능 : 판매 - 판촉물관리 - 판촉물매출마감
* 작성일자 : 2009-05-25
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_2200DAO;
import chosun.ciis.se.bns.dm.SE_BNS_2210_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_2220_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_2210_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2220_ADataSet;
/**
 * 
 */

public class SE_BNS_2200WB extends BaseWB{

    /**
     * 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_2210_LDataSet ds = null;

        // DM Setting
        SE_BNS_2210_LDM dm 		= new SE_BNS_2210_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_dt			= Util.checkString(req.getParameter("bgn_dt"		));
        String end_dt			= Util.checkString(req.getParameter("end_dt"		));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setBgn_dt			(bgn_dt			);
        dm.setEnd_dt			(end_dt			);
                
        try {
        	SE_BNS_2200DAO dao = new SE_BNS_2200DAO();
            ds = dao.se_bns_2210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_2200EJBHome home = (SE_BNS_2200EJBHome) JNDIManager.getInstance().getHome("SE_BNS_2200EJB");
//        
//        try {
//        	SE_BNS_2200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_2210_l(dm);
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
    
    /**
     * 마감/마감취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_2220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_2220_ADataSet ds = null;

        // DM Setting
        SE_BNS_2220_ADM dm 		= new SE_BNS_2220_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"	, true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"	));
        String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setClos_yn			(clos_yn		);
        
        System.out.println("multiUpdate=" + multiUpdateData);
        
        Hashtable hash			= new Hashtable();
        hash 					= getHashMultiUpdateData(multiUpdateData);
        
        String mode				= Util.checkString((String) hash.get("m"			));
        String divn_dt			= Util.checkString((String) hash.get("divn_dt"		));
        
        dm.setMode				(mode.toUpperCase()	);
        dm.setDivn_dt			(divn_dt			);
        
//        dm.print();
        
        try {
        	SE_BNS_2200DAO dao = new SE_BNS_2200DAO();
            ds = dao.se_bns_2220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BNS_2200EJBHome home = (SE_BNS_2200EJBHome) JNDIManager.getInstance().getHome("SE_BNS_2200EJB");
//        
//        try {
//        	SE_BNS_2200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_2220_a(dm);
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
