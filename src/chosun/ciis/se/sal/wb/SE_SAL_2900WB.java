/***************************************************************************************************
* ���ϸ� : SE_SAL_2600WB.java
* ��� : �Ǹ� - ������� - �ܰǰ�꼭���
* �ۼ����� : 2009-07-20
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */

public class SE_SAL_2900WB extends BaseWB{

    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2910_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2910_LDataSet ds = null;
		SE_SAL_2910_LDM dm = new SE_SAL_2910_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.widr_yymm = Util.checkString(req.getParameter("widr_yymm"));
		dm.print();
		
        try {
        	SE_SAL_2900DAO dao = new SE_SAL_2900DAO();
            ds = dao.se_sal_2910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}


}
