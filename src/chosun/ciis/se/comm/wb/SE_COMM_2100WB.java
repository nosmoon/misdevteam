/***************************************************************************************************
* ���ϸ� : SE_COMM_2100WB.java
* ��� :  ���۴ܰ� �˾�
* �ۼ����� : 2009.02.18
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.comm.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.comm.dao.SE_COMM_2100DAO;
import chosun.ciis.se.comm.dm.SE_COMM_2100_MDM;
import chosun.ciis.se.comm.dm.SE_COMM_2110_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_2100_MDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_2110_LDataSet;
/**
 * 
 */

public class SE_COMM_2100WB extends BaseWB{

    /**
     * ���۴ܰ� �˾� �ʱ�ȭ�� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2100_MDataSet ds = null;

        // DM Setting
        SE_COMM_2100_MDM dm = new SE_COMM_2100_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "uid", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_COMM_2100DAO dao = new SE_COMM_2100DAO();
            ds = dao.se_comm_2100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2100EJBHome home = (SE_COMM_2100EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2100EJB");
//        try {
//        	SE_COMM_2100EJB ejb = home.create();
//            ds = ejb.se_comm_2100_m(dm);
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
     * ���۴ܰ� �˾� ���۴ܰ� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2110_LDataSet ds = null;

        // DM Setting
        SE_COMM_2110_LDM dm = new SE_COMM_2110_LDM();

        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "uid", true);
        String tran_uprc_cd			= Util.checkString(req.getParameter("tran_uprc_cd"	));
        String bgn_aply_dt			= Util.checkString(req.getParameter("bgn_aply_dt"	));
        String end_aply_dt			= Util.checkString(req.getParameter("end_aply_dt"	));
        String tran_uprc_nm			= Util.checkString(req.getParameter("tran_uprc_nm"	));
        String tran_uprc_clas		= Util.checkString(req.getParameter("tran_uprc_clas"));
        String route_clsf			= Util.checkString(req.getParameter("route_clsf"	));
        String prt_plac_cd			= Util.checkString(req.getParameter("prt_plac_cd"	));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setTran_uprc_cd(tran_uprc_cd);
        dm.setBgn_aply_dt(bgn_aply_dt);
        dm.setEnd_aply_dt(end_aply_dt);
        dm.setTran_uprc_nm(tran_uprc_nm);
        dm.setTran_uprc_clas(tran_uprc_clas);
        dm.setRoute_clsf(route_clsf);
        dm.setPrt_plac_cd(prt_plac_cd);
        
        try {
        	SE_COMM_2100DAO dao = new SE_COMM_2100DAO();
            ds = dao.se_comm_2110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2100EJBHome home = (SE_COMM_2100EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2100EJB");
//        try {
//        	SE_COMM_2100EJB ejb = home.create();
//            ds = ejb.se_comm_2110_l(dm);
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
