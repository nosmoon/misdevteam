/***************************************************************************************************
 * ���ϸ� : SE_RCP_2300WB.java
 * ��� : �Ա���Ȳ
 * �ۼ����� : 2009-04-15
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_2300DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_2310_LDM;
import chosun.ciis.se.rcp.ds.SE_RCP_2310_LDataSet;
/**
 * 
 */

public class SE_RCP_2300WB extends BaseWB {

    /**
     * ����Ʈ ��ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_2310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_2310_LDataSet ds = null;
		SE_RCP_2310_LDM dm = new SE_RCP_2310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yymm1 = Util.checkString(req.getParameter("yymm1"));
		dm.yymm2 = Util.checkString(req.getParameter("yymm2"));
		String bo_cdseq = Util.checkString(req.getParameter("bo_cd"));
		
		dm.bo_cd = bo_cdseq.substring(0,5);
		dm.bo_seq = bo_cdseq.substring(5,8);

        try {
        	SE_RCP_2300DAO dao = new SE_RCP_2300DAO();
            ds = dao.se_rcp_2310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_2300EJBHome home = (SE_RCP_2300EJBHome)JNDIManager.getInstance().getHome("SE_RCP_2300EJB");
//			SE_RCP_2300EJB ejb = home.create();
//
//			ds = ejb.se_rcp_2310_l(dm);
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
	
}
