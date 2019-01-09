/***************************************************************************************************
 * ���ϸ�   : PSBill1201WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-03-28
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.bill.ejb.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * ����-�ϰ��Ա�
 */
public class PSBill1201WB {
    /**
     * ��ȸȭ�鿡 ���Ǵ� �Աݹ�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_BILL_SEPRDataSet ds = null;
        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_S_BILL_SEPRDM dm = new PS_S_BILL_SEPRDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSBill1101EJBHome home = (PSBill1101EJBHome) JNDIManager.getInstance().getHome("PSBill1101EJB");
        try {
            PSBill1101EJB ejb = home.create();
            ds = ejb.selectCodeList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��ȸ���ǿ� �ش�Ǵ� �ϰ��Ա� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectLumprcpmList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_TACOM_GRRCPCMDataSet ds = null;

        //����� ��������
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�

        String cibocd = Util.checkString(req.getParameter("slt_bocd")); // ���� ����
        String ciacqdt_1 = Util.checkString(req.getParameter("acqdt_1")); // ���� ����
        String ciacqdt_2 = Util.checkString(req.getParameter("acqdt_2")); // ���� ����
        String circpmrflendyn = Util.checkString(req.getParameter("rcpmrflendyn")); // �Ա�ó�� ����
        if (circpmrflendyn.equals("01"))
            circpmrflendyn = "N";
        else if (circpmrflendyn.equals("02"))
            circpmrflendyn = "Y";
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // ����������
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // �������� ���ڵ��
        long iPageSize = 5; // �������� Row�� �ϴ� 10����
        long iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_TACOM_GRRCPCMDM dm = new PS_L_BILL_TACOM_GRRCPCMDM(); //dm�� ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);   //���� �ڵ�
        dm.setBocd(cibocd);     // �������� �ڵ�
        dm.setAcqdt_1(ciacqdt_1); // ���� ����
        dm.setAcqdt_2(ciacqdt_2); // ���� ����
        dm.setRcpmrflendyn(circpmrflendyn); // �Ա� ó�� ����
        dm.setPageno(iPageNo); // ����������
        dm.setPagesize(iPageSize); // �������� Row��

        PSBill1201EJBHome home = (PSBill1201EJBHome) JNDIManager.getInstance().getHome("PSBill1201EJB");

        try {
            PSBill1201EJB ejb = home.create();
            ds = ejb.selectLumprcpmList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * ��ȸ���ǿ� �ش�Ǵ� �ϰ��Ա� �� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectLumprcpmDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_TACOD_GRRCPCMDataSet ds = null;

        String cigirono = Util.checkString(req.getParameter("girono")); // �������� ���� ��ȣ
        String ciacqdt = Util.checkString(req.getParameter("acqdt")); // ���� ����
        String ciacqno = Util.checkString(req.getParameter("acqno")); // �ڵ��
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // ����������
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // �������� ���ڵ��

        long iPageSize = 10; // �������� Row�� �ϴ� 10����
        long iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_TACOD_GRRCPCMDM dm = new PS_L_BILL_TACOD_GRRCPCMDM(); //dm�� ���� Setting�Ѵ�.

        dm.setGirono(cigirono); // �������� ���� ��ȣ
        dm.setAcqdt(ciacqdt); // ���� ����
        dm.setAcqno(ciacqno); // ���� ��ȣ
        dm.setPageno(iPageNo); // ����������
        dm.setPagesize(iPageSize); // �������� Row��

        PSBill1201EJBHome home = (PSBill1201EJBHome) JNDIManager.getInstance().getHome("PSBill1201EJB");

        try {
            PSBill1201EJB ejb = home.create();
            ds = ejb.selectLumprcpmDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
