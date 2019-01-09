/***************************************************************************************************
 * ���ϸ� : SSExtn2900WB.java
* ��� : 
* �ۼ����� : 
* �ۼ��� :
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

public class SSExtn2900WB {

	public void selectKyoboEventList(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_L_KYOBO_EVENTDataSet ds = null;
		SS_L_KYOBO_EVENTDM dm = new SS_L_KYOBO_EVENTDM();

		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.bocd = Util.checkString(req.getParameter("bocd"));
		dm.rdrnm = Util.checkString(req.getParameter("rdrnm"));
		dm.subscnfmstat = Util.checkString(req.getParameter("subscnfmstat"));

		dm.print();

        SSExtn2900DAO dao = new SSExtn2900DAO();
        // DAO ��ü�� selectList ȣ��
        ds = dao.selectKyoboEventList(dm);
        req.setAttribute("ds", ds);
	}
	
	public void updateKyoboEventDeli(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_U_KYOBO_EVENTDataSet ds = null;
		SS_U_KYOBO_EVENTDM dm = new SS_U_KYOBO_EVENTDM();

		dm.rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
		dm.rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
		dm.chgpers = Util.getSessionParameterValue(req, "uid", true);

		dm.print();

        SSExtn2900DAO dao = new SSExtn2900DAO();
        // DAO ��ü�� selectList ȣ��
        ds = dao.updateKyoboEventDeli(dm);
        req.setAttribute("ds", ds);
	}

}
