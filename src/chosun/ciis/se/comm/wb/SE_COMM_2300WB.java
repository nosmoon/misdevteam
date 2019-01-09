/***************************************************************************************************
* 파일명 : SE_COMM_2300WB.java
* 기능 : 판촉물관리 - 판촉물조회
* 작성일자 : 2009-04-28
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.comm.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.comm.dao.SE_COMM_2300DAO;
import chosun.ciis.se.comm.dm.SE_COMM_2310_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_2310_LDataSet;

/**
 * 
 */

public class SE_COMM_2300WB extends BaseWB{
    
    /**
     * 판촉물 팝업 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2310_LDataSet ds = null;

        // DM Setting
        SE_COMM_2310_LDM dm = new SE_COMM_2310_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true	);
        String incmg_pers		= Util.getSessionParameterValue(req, "uid"		, true	);
        String bns_item_cd		= Util.checkString(req.getParameter("bns_item_cd"		));
        String bns_item_nm		= Util.checkString(req.getParameter("bns_item_nm"		));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"			));
        String use_yn           = Util.checkString(req.getParameter("use_yn"			));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setBns_item_cd		(bns_item_cd	);
        dm.setBns_item_nm		(bns_item_nm	);
        dm.setMedi_cd			(medi_cd		);
        dm.setUse_yn            (use_yn         );
        
        try {
        	SE_COMM_2300DAO dao = new SE_COMM_2300DAO();
            ds = dao.se_comm_2310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2300EJBHome home = (SE_COMM_2300EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2300EJB");
//        try {
//        	SE_COMM_2300EJB ejb = home.create();
//            ds = ejb.se_comm_2310_l(dm);
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
