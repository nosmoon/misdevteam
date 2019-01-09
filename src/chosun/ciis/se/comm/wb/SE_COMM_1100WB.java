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
import chosun.ciis.se.comm.dao.SE_COMM_1100DAO;
import chosun.ciis.se.comm.dm.SE_COMM_1100_MDM;
import chosun.ciis.se.comm.dm.SE_COMM_1105_SDM;
import chosun.ciis.se.comm.dm.SE_COMM_1110_LDM;
import chosun.ciis.se.comm.dm.SE_COMM_1120_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_1100_MDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_1105_SDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_1110_LDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_1120_LDataSet;
/**
 * 
 */

public class SE_COMM_1100WB extends BaseWB {

    /**
     * 계약상태구분을 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_1100_MDataSet ds = null;

        // DM Setting
        SE_COMM_1100_MDM dm = new SE_COMM_1100_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        //dm.print();
        
        try {
        	SE_COMM_1100DAO dao = new SE_COMM_1100DAO();
            ds = dao.se_comm_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_COMM_1100EJBHome home = (SE_COMM_1100EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1100EJB");
//        try {
//        	SE_COMM_1100EJB ejb = home.create();
//            ds = ejb.se_comm_1100_m(dm);
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

    /**
     * 1건 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_comm_1105_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_COMM_1105_SDataSet ds = null;
		SE_COMM_1105_SDM dm = new SE_COMM_1105_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		String bo_cdseq = Util.checkString(req.getParameter("bo_cd"));
		if(bo_cdseq.length()==5){
			dm.bo_cd = bo_cdseq;
			dm.bo_seq = "";
		}else if(bo_cdseq.length()==8){
			dm.bo_cd = bo_cdseq.substring(0,5);
			dm.bo_seq = bo_cdseq.substring(5,8);
		}
		
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));

        try {
        	SE_COMM_1100DAO dao = new SE_COMM_1100DAO();
            ds = dao.se_comm_1105_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_COMM_1100EJBHome home = (SE_COMM_1100EJBHome)JNDIManager.getInstance().getHome("SE_COMM_1100EJB");
//			SE_COMM_1100EJB ejb = home.create();
//
//			ds = ejb.se_comm_1105_s(dm);
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
    public void se_comm_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_1110_LDataSet ds = null;

        // DM Setting
        SE_COMM_1110_LDM dm = new SE_COMM_1110_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String bo_nm = Util.checkString(req.getParameter("bo_nm"));
        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
        String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
        String dept_cd = Util.checkString(req.getParameter("dept_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_nm(bo_nm);
        dm.setBo_cd(bo_cd);
        dm.setBo_head_nm(bo_head_nm);
        dm.setCntr_stat_clsf(cntr_stat_clsf);
        dm.setDept_cd(dept_cd);
        
        try {
        	SE_COMM_1100DAO dao = new SE_COMM_1100DAO();
            ds = dao.se_comm_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_COMM_1100EJBHome home = (SE_COMM_1100EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1100EJB");
//        try {
//        	SE_COMM_1100EJB ejb = home.create();
//            ds = ejb.se_comm_1110_l(dm);
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
    
    /**
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_1120_LDataSet ds = null;

        // DM Setting
        SE_COMM_1120_LDM dm = new SE_COMM_1120_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String bo_nm = Util.checkString(req.getParameter("bo_nm"));
        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
        String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
        String dept_cd = Util.checkString(req.getParameter("dept_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_nm(bo_nm);
        dm.setBo_cd(bo_cd);
        dm.setBo_head_nm(bo_head_nm);
        dm.setCntr_stat_clsf(cntr_stat_clsf);
        dm.setDept_cd(dept_cd);
        
        try {
        	SE_COMM_1100DAO dao = new SE_COMM_1100DAO();
            ds = dao.se_comm_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_COMM_1100EJBHome home = (SE_COMM_1100EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1100EJB");
//        try {
//        	SE_COMM_1100EJB ejb = home.create();
//            ds = ejb.se_comm_1120_l(dm);
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
