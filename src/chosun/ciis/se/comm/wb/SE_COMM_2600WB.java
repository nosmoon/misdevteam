/***************************************************************************************************
* 파일명 : SE_COMM_2600WB.java
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
import chosun.ciis.se.comm.dao.SE_COMM_2600DAO;
import chosun.ciis.se.comm.dm.SE_COMM_2610_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_2610_LDataSet;


/**
 * 
 */

public class SE_COMM_2600WB extends BaseWB{

    
    /**
     * 섹션 팝업 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_comm_2610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2610_LDataSet ds = null;

        // DM Setting
        SE_COMM_2610_LDM dm = new SE_COMM_2610_LDM();

        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers 			= Util.getSessionParameterValue(req, "emp_no", true);
        String pg_nm 				= Util.checkString(req.getParameter("pg_nm"));
        String dt 					= Util.checkString(req.getParameter("dt"));
        String team 				= Util.checkString(req.getParameter("team"));
        String part 				= Util.checkString(req.getParameter("part"));
        String area 				= Util.checkString(req.getParameter("area"));
        String val1 				= Util.checkString(req.getParameter("val1"));
        String val2 				= Util.checkString(req.getParameter("val2"));
        String val3 				= Util.checkString(req.getParameter("val3"));
        String val4 				= Util.checkString(req.getParameter("val4"));
        String val5	 				= Util.checkString(req.getParameter("val5"));
                
        dm.setCmpy_cd				(cmpy_cd			);
        dm.setIncmg_pers			(incmg_pers			);
        dm.setPg_nm					(pg_nm				);
        dm.setDt					(dt					);
        dm.setTeam					(team				);
        dm.setPart					(part				);
        dm.setArea					(area				);
        dm.setVal1					(val1				);
        dm.setVal2					(val2				);
        dm.setVal3					(val3				);
        dm.setVal4					(val4				);
        dm.setVal5					(val5				);
        
        //dm.print();        
        try {
        	SE_COMM_2600DAO	dao = new SE_COMM_2600DAO();
            ds = dao.se_comm_2610_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }  
        
//        SE_COMM_2600EJBHome home = (SE_COMM_2600EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2600EJB");
//        try {
//        	SE_COMM_2600EJB ejb = home.create();
//            ds = ejb.se_comm_2610_l(dm);
//           req.setAttribute("ds", ds);
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
