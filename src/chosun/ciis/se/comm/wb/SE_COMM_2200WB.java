/***************************************************************************************************
* ���ϸ� : SE_COMM_2200EJB.java
* ��� :  ������ ���޳��� ��ȸ �˾�
* �ۼ����� : 2009.03.05
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
import chosun.ciis.se.comm.dao.SE_COMM_2200DAO;
import chosun.ciis.se.comm.dm.SE_COMM_2200_MDM;
import chosun.ciis.se.comm.dm.SE_COMM_2210_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_2200_MDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_2210_LDataSet;
/**
 * 
 */

public class SE_COMM_2200WB extends BaseWB{

    /**
     * ������ ���޳��� �˾� �ʱ�ȭ�� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2200_MDataSet ds = null;

        // DM Setting
        SE_COMM_2200_MDM dm = new SE_COMM_2200_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_COMM_2200DAO dao = new SE_COMM_2200DAO();
            ds = dao.se_comm_2200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2200EJBHome home = (SE_COMM_2200EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2200EJB");
//        try {
//        	SE_COMM_2200EJB ejb = home.create();
//            ds = ejb.se_comm_2200_m(dm);
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
     * ������ ���޳��� �˾� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2210_LDataSet ds = null;

        // DM Setting
        SE_COMM_2210_LDM dm = new SE_COMM_2210_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true	);
        String incmg_pers		= Util.getSessionParameterValue(req, "uid"		, true	);
        String bgn_yymm			= Util.checkString(req.getParameter("bgn_yymm"			));
        String end_yymm			= Util.checkString(req.getParameter("end_yymm"			));
        String bo_cd			= Util.checkString(req.getParameter("bo_cd"				));
        String bo_nm			= Util.checkString(req.getParameter("bo_nm"				));
        String team				= Util.checkString(req.getParameter("team"				));
        String part				= Util.checkString(req.getParameter("part"				));
        String area				= Util.checkString(req.getParameter("area"				));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setBgn_yymm			(bgn_yymm		);
        dm.setEnd_yymm			(end_yymm		);
        dm.setBo_cd				(bo_cd			);
        dm.setBo_nm				(bo_nm			);
        dm.setTeam				(team			);
        dm.setPart				(part			);
        dm.setArea				(area			);
        
        try {
        	SE_COMM_2200DAO dao = new SE_COMM_2200DAO();
            ds = dao.se_comm_2210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2200EJBHome home = (SE_COMM_2200EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2200EJB");
//        try {
//        	SE_COMM_2200EJB ejb = home.create();
//            ds = ejb.se_comm_2210_l(dm);
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
