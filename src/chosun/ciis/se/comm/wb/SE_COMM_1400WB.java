/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
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
import chosun.ciis.se.comm.dao.SE_COMM_1400DAO;
import chosun.ciis.se.comm.dm.SE_COMM_1405_SDM;
import chosun.ciis.se.comm.dm.SE_COMM_1410_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_1405_SDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_1410_LDataSet;
/**
 * 
 */

public class SE_COMM_1400WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "##";


    /**
     * 1건 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_comm_1405_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_COMM_1405_SDataSet ds = null;
		SE_COMM_1405_SDM dm = new SE_COMM_1405_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));

        try {
        	SE_COMM_1400DAO dao = new SE_COMM_1400DAO();
            ds = dao.se_comm_1405_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_COMM_1400EJBHome home = (SE_COMM_1400EJBHome)JNDIManager.getInstance().getHome("SE_COMM_1400EJB");
//			SE_COMM_1400EJB ejb = home.create();
//
//			ds = ejb.se_comm_1405_s(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
	
    /**
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_1410_LDataSet ds = null;

        // DM Setting
        SE_COMM_1410_LDM dm = new SE_COMM_1410_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String cdnm = Util.checkString(req.getParameter("cdnm"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setCdnm(cdnm);

        try {
        	SE_COMM_1400DAO dao = new SE_COMM_1400DAO();
            ds = dao.se_comm_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
        
//        SE_COMM_1400EJBHome home = (SE_COMM_1400EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1400EJB");
//        try {
//        	SE_COMM_1400EJB ejb = home.create();
//            ds = ejb.se_comm_1410_l(dm);
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
