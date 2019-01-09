/***************************************************************************************************
 * �Լ���   : PSBill1901WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 *             �ڵ���üû��������
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
 * �ڵ���üû�������� �޴��� ���õ� �޼ҵ带 ������ �ִ� Worker Bean Ŭ����
 */
public class PSBill1901WB {

    /**
     * �ڵ���üû��������
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamSsum(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SHFT_CLAM_SSUMDataSet ds = null;
        PS_L_SHFT_CLAM_SSUMDM dm = new PS_L_SHFT_CLAM_SSUMDM();

        // dm ���� ����
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);
        // dm ���� ��

        PSBill1901EJBHome home = (PSBill1901EJBHome) JNDIManager.getInstance().getHome("PSBill1901EJB");
        try {
            PSBill1901EJB ejb = home.create();
            ds = ejb.selectClamSsum(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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

    /**
     * �ڵ���üû�����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamOcomList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SHFT_CLAM_OCOMDataSet ds = null;
        PS_L_SHFT_CLAM_OCOMDM dm = new PS_L_SHFT_CLAM_OCOMDM();

        // dm ���� ����
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        String bocd = Util.checkString(req.getParameter("bocd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String sechcond = Util.checkString(req.getParameter("sechcond"));
        String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
        String subsmappli = Util.checkString(req.getParameter("subsmappli"));
        String erryn = Util.checkString(req.getParameter("erryn"));

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setPageno(Integer.parseInt(pageno));
        dm.setPagesize(Integer.parseInt(pagesize));
        dm.setSechcond(sechcond);
        dm.setSechcont(sechcont);
        dm.setBasidt(basidt);
        dm.setShftclsfcd(shftclsfcd);
        dm.setSubsmappli(subsmappli);
        dm.setErryn(erryn);
        // dm ���� ��

        PSBill1901EJBHome home = (PSBill1901EJBHome) JNDIManager.getInstance().getHome("PSBill1901EJB");
        try {
            PSBill1901EJB ejb = home.create();
            ds = ejb.selectClamOcomList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
