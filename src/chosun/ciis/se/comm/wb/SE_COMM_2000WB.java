/***************************************************************************************************
* 파일명 : SE_COMM_2000WB.java
* 기능 :   발송처 팝업
 * 작성일자 : 2009.01.29
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
import chosun.ciis.se.comm.dao.SE_COMM_2000DAO;
import chosun.ciis.se.comm.dm.SE_COMM_2000_MDM;
import chosun.ciis.se.comm.dm.SE_COMM_2010_LDM;
import chosun.ciis.se.comm.dm.SE_COMM_2020_SDM;
import chosun.ciis.se.comm.ds.SE_COMM_2000_MDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_2010_LDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_2020_SDataSet;
/**
 * 
 */

public class SE_COMM_2000WB extends BaseWB{

    /**
     * 발송처 지역 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2000_MDataSet ds = null;

        // DM Setting
        SE_COMM_2000_MDM dm = new SE_COMM_2000_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_COMM_2000DAO dao = new SE_COMM_2000DAO();
            ds = dao.se_comm_2000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2000EJBHome home = (SE_COMM_2000EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2000EJB");
//        try {
//        	SE_COMM_2000EJB ejb = home.create();
//            ds = ejb.se_comm_2000_m(dm);
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
     * 발송처 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2010_LDataSet ds = null;

        // DM Setting
        SE_COMM_2010_LDM dm = new SE_COMM_2010_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String area_cd 			= Util.checkString(req.getParameter("area_cd"		));
        String bo_cd 			= Util.checkString(req.getParameter("bo_cd"			));
        String adms_dstc_nm		= Util.checkString(req.getParameter("adms_dstc_nm"	));
        String send_plac_nm		= Util.checkString(req.getParameter("send_plac_nm"	));
        String send_plac_seq	= Util.checkString(req.getParameter("send_plac_seq" ));
        
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setArea_cd			(area_cd		);
        dm.setBo_cd				(bo_cd			);
        dm.setAdms_dstc_nm		(adms_dstc_nm	);
        dm.setSend_plac_nm		(send_plac_nm	);
        dm.setSend_plac_seq		(send_plac_seq	);
        
        try {
        	SE_COMM_2000DAO dao = new SE_COMM_2000DAO();
            ds = dao.se_comm_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2000EJBHome home = (SE_COMM_2000EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2000EJB");
//        try {
//        	SE_COMM_2000EJB ejb = home.create();
//            ds = ejb.se_comm_2010_l(dm);
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
     * 발송처 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2020_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2020_SDataSet ds = null;

        // DM Setting
        SE_COMM_2020_SDM dm = new SE_COMM_2020_SDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String bo_cd 			= Util.checkString(req.getParameter("bo_cd"			));
        String send_plac_seq	= Util.checkString(req.getParameter("send_plac_seq"	));
        String send_plac_nm		= Util.checkString(req.getParameter("send_plac_nm"  ));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setBo_cd				(bo_cd			);
        dm.setSend_plac_seq		(send_plac_seq	);
        dm.setSend_plac_nm		(send_plac_nm	);
        
        try {
        	SE_COMM_2000DAO dao = new SE_COMM_2000DAO();
            ds = dao.se_comm_2020_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2000EJBHome home = (SE_COMM_2000EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2000EJB");
//        try {
//        	SE_COMM_2000EJB ejb = home.create();
//            ds = ejb.se_comm_2020_s(dm);
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
