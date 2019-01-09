/***************************************************************************************************
* 파일명 : SE_COMM_2500WB.java
* 기능 :  섹션 팝업
* 작성일자 : 2009.06.10
* 작성자 :   김대준
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
import chosun.ciis.se.comm.dao.SE_COMM_2500DAO;
import chosun.ciis.se.comm.dm.SE_COMM_2510_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_2510_LDataSet;


/**
 * 
 */

public class SE_COMM_2500WB extends BaseWB{

    
    /**
     * 섹션 팝업 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_comm_2510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2510_LDataSet ds = null;

        // DM Setting
        SE_COMM_2510_LDM dm = new SE_COMM_2510_LDM();

        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "uid", true);
        String medi_cd				= Util.checkString(req.getParameter("medi_cd"			));
        String sect_cd				= Util.checkString(req.getParameter("sect_cd"			));
        String sect_nm				= Util.checkString(req.getParameter("sect_nm"			));
        
        
        dm.setCmpy_cd				(cmpy_cd			);
        dm.setIncmg_pers			(incmg_pers			);
        dm.setMedi_cd				(medi_cd			);
        dm.setSect_cd				(sect_cd			);
        dm.setSect_nm				(sect_nm			);
        
        try {
        	SE_COMM_2500DAO dao = new SE_COMM_2500DAO();
            ds = dao.se_comm_2510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2500EJBHome home = (SE_COMM_2500EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2500EJB");
//        try {
//        	SE_COMM_2500EJB ejb = home.create();
//            ds = ejb.se_comm_2510_l(dm);
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
