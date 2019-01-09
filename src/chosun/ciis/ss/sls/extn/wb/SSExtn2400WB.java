/***************************************************************************************************
 * ���ϸ� : SSExtn2400WB.java
* ��� : Ȯ����Ȳ-��ŸȮ������۾��� ���� Worker bean
* �ۼ����� : 2012-02-20
* �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * Ȯ����Ȳ-��û��Ȳ �� ���� WB
 */

public class SSExtn2400WB {
    
    /**
     * Ȯ����Ȳ-���л�ķ����Ȯ�� �����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
	public void selectCampExtnUniList(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_L_CAMPEXTN_UNIDataSet ds = null;
		SL_L_CAMPEXTN_UNIDM dm = new SL_L_CAMPEXTN_UNIDM();

		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));

		dm.print();

        	SSExtn2400DAO dao = new SSExtn2400DAO();
        	// DAO ��ü�� selectList ȣ��
        	ds = dao.selectCampExtnUniList(dm);
        	req.setAttribute("ds", ds);
	}

}
