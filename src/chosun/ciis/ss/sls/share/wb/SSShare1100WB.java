/***************************************************************************************************
* ���ϸ� : SSShare1100WB.java
* ��� : ��������-Ÿ��߼ۺμ� ó���� ���� Work Bean
* �ۼ����� : 2003-12-02
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/
package chosun.ciis.ss.sls.share.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.dao.*;

/**
 * ��������-Ÿ��߼ۺμ� ���� WB
 *
 */

public class SSShare1100WB{
    /**
     * ��������-Ÿ��߼ۺμ�-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectOthqtyList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_OTHQTYDataSet ds = null;
        // Request Parameter Processing

        String invsgdt = Util.checkString(req.getParameter("invsgdt"));
        String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pageno"));
        if( pageno == "") { pageno = "1"; }
        if( pagesize == "") { pagesize = "10"; }

        // DM Setting
        SS_L_OTHQTYDM dm = new SS_L_OTHQTYDM();
        dm.setInvsgdt(invsgdt);
        dm.setInvsgdt2(invsgdt2);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1100DAO dao = new SSShare1100DAO();
		// DAO ��ü�� selectTacomScheList ȣ��
		ds = dao.selectOthqtyList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1100EJBHome home = (SSShare1100EJBHome) JNDIManager.getInstance().getHome("SSShare1100EJB");
        try {
            SSShare1100EJB ejb = home.create();
            ds = ejb.selectOthqtyList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
}

/* �ۼ��ð� : Tue Nov 18 11:50:05 KST 2003 */