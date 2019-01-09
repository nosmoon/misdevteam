/***************************************************************************************************
* 파일명 : SE_BNS_1900WB.java
* 기능 : 판매-판촉물관리 - 판촉물정정처리
* 작성일자 : 2009-04-30
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_1900DAO;
import chosun.ciis.se.bns.dm.SE_BNS_1910_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1920_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1910_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1920_ADataSet;
/**
 * 
 */

public class SE_BNS_1900WB extends BaseWB{
  
    /**
     * 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1910_LDataSet ds = null;

        // DM Setting
        SE_BNS_1910_LDM dm 		= new SE_BNS_1910_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"		));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"		));
        String stmt_issu_clsf	= Util.checkString(req.getParameter("stmt_issu_clsf"));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setBgn_yymm			(bgn_yymm		);
        dm.setEnd_yymm			(end_yymm		);
        dm.setStmt_issu_clsf	(stmt_issu_clsf	);
        
        try {
        	SE_BNS_1900DAO dao = new SE_BNS_1900DAO();
            ds = dao.se_bns_1910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1900EJBHome home = (SE_BNS_1900EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1900EJB");
//        
//        try {
//        	SE_BNS_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1910_l(dm);
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
     * 생성 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1920_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1920_ADataSet ds = null;

        // DM Setting
        SE_BNS_1920_ADM dm 		= new SE_BNS_1920_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"		));
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String tms				= Util.checkString(req.getParameter("tms"		));
        String stmt_issu_clsf	= Util.checkString(req.getParameter("stmt_issu_clsf"));
        String selldeptcd		= "";
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setClos_yn			(clos_yn		);
        dm.setYymm				(yymm			);
        dm.setTms				(tms			);
        dm.setSelldeptcd		(selldeptcd		);
        dm.setStmt_issu_clsf	(stmt_issu_clsf	);
        
        try {
        	SE_BNS_1900DAO dao = new SE_BNS_1900DAO();
            ds = dao.se_bns_1920_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1900EJBHome home = (SE_BNS_1900EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1900EJB");
//        
//        try {
//        	SE_BNS_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1920_a(dm);
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
