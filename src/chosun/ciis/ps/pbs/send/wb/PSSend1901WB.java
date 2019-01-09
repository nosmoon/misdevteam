/***************************************************************************************************
 * ���ϸ�   : PSSend1901WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-03-11
 * �ۼ���   : ���ȯ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.send.wb;

import javax.ejb.*;
import java.rmi.*;
import java.lang.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ejb.*;

/**
 * �߼�-��������߼�
 */
public class PSSend1901WB {

    /**
     * ��������߼�ó�� ����ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_LUMP_PROCDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�
        String medicd      = Util.checkString(req.getParameter("medicd"));              //��ü�ڵ�
        String sendtype    = "01";

        PS_S_SEND_LUMP_PROCDM dm = new PS_S_SEND_LUMP_PROCDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setSendtype(sendtype);

        PSSend1901EJBHome home = (PSSend1901EJBHome) JNDIManager.getInstance().getHome("PSSend1901EJB");
        try {
            PSSend1901EJB ejb = home.create();
            ds = ejb.selectCombolist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * ���� ���� �߼� ����Ʈ�� �����ɴϴ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectNormsendList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_GIRONORMDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

        String cigirosenddt = Util.checkString(req.getParameter("girosenddt"));           // ���� �߼� ����
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no"));         // ���� ������
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // ������ �� Row ��
        String cibocd = Util.checkString(req.getParameter("sendbrch"));                   // ���� ���� �ڵ�

        long iPageSize = 20;
        long iPageNo = 1;
        if (curr_page_no != null && !curr_page_no.equals("")) {
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_SEND_GIRONORMDM dm = new PS_L_SEND_GIRONORMDM(); // DM ���� Setting�Ѵ�.

        if (cibocd == null || cibocd.equals("")) {
            cibocd = "ALL";
        }

        dm.setBocd(cibocd);
        dm.setCmpycd(cmpycd);
        dm.setGirosenddt(cigirosenddt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSend1901EJBHome home = (PSSend1901EJBHome) JNDIManager.getInstance().getHome("PSSend1901EJB");
        try {
            PSSend1901EJB ejb = home.create();
            ds = ejb.selectNormsendList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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