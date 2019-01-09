/***************************************************************************************************
 * ���ϸ�   : PSBill1301WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2003-12-12
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

import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.ejb.*;

/**
 * ����-�������Ա�
 */
public class PSBill1301WB {

    /**
     * ��ȸȭ�鿡 ���Ǵ� �߼۹���� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_ABNOR_SEPBKDataSet ds = null;
        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_S_ABNOR_SEPBKDM dm = new PS_S_ABNOR_SEPBKDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSBill1301EJBHome home = (PSBill1301EJBHome) JNDIManager.getInstance().getHome("PSBill1301EJB");
        try {
            PSBill1301EJB ejb = home.create();
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
     * ��ȸ���ǿ� �ش�Ǵ� ������ �Ա� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/

    public void selectNonrcpmList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_NONRCPMDataSet ds = null;

        //����� ��������
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String cibocd      = Util.checkString(req.getParameter("slt_bocd"));  //���������ڵ�
        String ciacqdt_1 = Util.checkString(req.getParameter("acqdt_1")); // ��������
        String ciacqdt_2 = Util.checkString(req.getParameter("acqdt_2")); // ��������
        String circpmrflyn = Util.checkString(req.getParameter("rcpmrflyn")); // �Աݹݿ�����

        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // ���� ������ No
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // ������ �� record ��

        long iPageSize = 15; // �������� Row��
        long iPageNo = 1; // ���� ������ 1�� ����

        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_NONRCPMDM dm = new PS_L_BILL_NONRCPMDM();

        dm.setBocd(cibocd); // ���� ���� �ڵ�
        dm.setAcqdt_1(ciacqdt_1); // ���� ����
        dm.setAcqdt_2(ciacqdt_2); // ���� ����
        dm.setRcpmrflyn(circpmrflyn);

        dm.setPageno(iPageNo); // ���� ������
        dm.setPagesize(iPageSize); // �������� Row ��

        PSBill1301EJBHome home = (PSBill1301EJBHome) JNDIManager.getInstance().getHome("PSBill1301EJB");

        try {
            PSBill1301EJB ejb = home.create();

            ds = ejb.selectNonrcpmList(dm);
            req.setAttribute("ds", ds);
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
     * ��ȸ���ǿ� �ش�Ǵ� ������ �Ա� ����� ����,������Ʈ
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void accessNonrcpm(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_BILL_NONRCPMDataSet ds = null;
        boolean retValue = false;

        //����� ��������
        String ciincmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String ciprocdt = Util.checkString(req.getParameter("procdt")); // �Ա�����(�ݿ�����)
        String cirecpdt = Util.checkString(req.getParameter("recpdt")); // ���� ����
        String circpmamt = Util.convertNull(req.getParameter("rcpmamt"), "0"); // ���� �ݾ�
        String cirecpbrchcd   = Util.checkString(req.getParameter("recpbrchcd"));     // ������ �ڵ�
        String cinormerrclsf = Util.checkString(req.getParameter("normerrclsf")); // ���� ���� ����(A��ǥ,Reject)
        String cirdr_no = Util.checkString(req.getParameter("rdr_no_chk")); // ���ڹ�ȣ
        String cimedicd = Util.checkString(req.getParameter("medicd_chk")); // ��ü�ڵ�
        String citermsubsno = Util.checkString(req.getParameter("termsubsno_chk")); // �������⵶�ڹ�ȣ
        String cibocd      = Util.checkString(req.getParameter("bocd_chk"));          //���������ڵ�
        String cicustbrwsno = Util.checkString(req.getParameter("custbrwsno")); // ������ȣ
        String ciseq = Util.checkString(req.getParameter("seq")); // ����
        String ciacqdt = Util.checkString(req.getParameter("acqdt")); // �Ա���
        String ciacqno = Util.checkString(req.getParameter("acqno")); // �Ա� ��ȣ

        PS_A_BILL_NONRCPMDM dm = new PS_A_BILL_NONRCPMDM();

        dm.setIncmgpers(ciincmgpers);
        dm.setBocd(cibocd);
        dm.setProcdt(ciprocdt);
        dm.setRecpdt(cirecpdt);
        dm.setRcpmamt(circpmamt);

        dm.setRecpbrchcd(cirecpbrchcd);
        dm.setNormerrclsf(cinormerrclsf);

        dm.setRdr_no(cirdr_no);
        dm.setMedicd(cimedicd);
        dm.setTermsubsno(citermsubsno);
        dm.setCustbrwsno(cicustbrwsno);

        dm.setSeq(ciseq);
        dm.setAcqdt(ciacqdt);
        dm.setAcqno(ciacqno);

        PSBill1301EJBHome home = (PSBill1301EJBHome) JNDIManager.getInstance().getHome("PSBill1301EJB");

        try {
            PSBill1301EJB ejb = home.create();
            retValue = ejb.accessNonrcpm(dm);
            req.setAttribute("ds", ds);
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