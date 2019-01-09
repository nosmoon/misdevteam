/***************************************************************************************************
 * �Լ���   : PSBill1801WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 *             �ڵ���üû���������
 * �ۼ����� : 2006-04-14
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.bill.ejb.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.dao.*;

/**
 * �ڵ���üû��������� �޴��� ���õ� �޼ҵ带 ������ �ִ� Worker Bean Ŭ����
 */
public class PSBill1801WB {
    /**
     * �ڵ���üû��������ϰ˻�
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPlanList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SHFT_CLAM_PLANDataSet ds = null;
        PS_L_SHFT_CLAM_PLANDM dm = new PS_L_SHFT_CLAM_PLANDM();

        // dm ���� ����
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        String bocd = Util.checkString(req.getParameter("bocd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String sechcond = Util.checkString(req.getParameter("sechcond"));
        String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
        String rcpmmthd = Util.checkString(req.getParameter("rcpmmthd"));
        String clammthd = Util.checkString(req.getParameter("clammthd"));

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setPageno(Integer.parseInt(pageno));
        dm.setPagesize(Integer.parseInt(pagesize));
        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);
        dm.setRcpmmthd(rcpmmthd);
        dm.setClammthd(clammthd);
        // dm ���� ��

        PSBill1801EJBHome home = (PSBill1801EJBHome) JNDIManager.getInstance().getHome("PSBill1801EJB");
        try {
            PSBill1801EJB ejb = home.create();
            ds = ejb.selectPlanList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
}
