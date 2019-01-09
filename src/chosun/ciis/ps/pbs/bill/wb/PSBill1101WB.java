/***************************************************************************************************
 * ���ϸ�   : PSBill1101WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-03-29
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
import java.lang.*;
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
 * ����-�����Ա�
 */
public class PSBill1101WB {
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
     * ��ȸ���ǿ� �ش�Ǵ� �������ⰳ���Ա� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectSeprrecptList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_SEPRDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          //ȸ���ڵ�

        String cibocd = Util.checkString(req.getParameter("slt_bocd")); // ���������ڵ�
        String ciprocdt_1 = Util.checkString(req.getParameter("proc_dd_1")); // �Ա� ����
        String ciprocdt_2 = Util.checkString(req.getParameter("proc_dd_2")); // �Ա� ����
        String cirecpmthd = Util.checkString(req.getParameter("rcpm_mthd")); // �Աݹ��
        //String circpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd")); // �Աݱ����ڵ�
        String curr_page_no = Util.checkString(req.getParameter("curr_page_no")); // ����������
        String records_per_page = Util.checkString(req.getParameter("records_per_page")); // �������� ���ڵ��

        long iPageSize = 15; // �������� Row�� �ϴ� 10����
        long iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Long.parseLong(curr_page_no);
            iPageSize = Long.parseLong(records_per_page);
        }

        PS_L_BILL_SEPRDM dm = new PS_L_BILL_SEPRDM(); //dm�� ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);//ȸ���ڵ�
        dm.setBocd(cibocd); // �������� �ڵ�
        dm.setProc_dd_1(ciprocdt_1); // �Ա� ����
        dm.setProc_dd_2(ciprocdt_2); // �Ա� ����
        dm.setRcpm_mthd(cirecpmthd); // �Ա� ���
        //dm.setRcpmclsfcd(circpmclsfcd); // �Աݱ����ڵ�
        dm.setPageno(iPageNo); // ����������
        dm.setPagesize(iPageSize); // �������� Row��

        PSBill1101EJBHome home = (PSBill1101EJBHome) JNDIManager.getInstance().getHome("PSBill1101EJB");

        try {
            PSBill1101EJB ejb = home.create();
            ds = ejb.selectSeprrecpList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * �����Ա��� �ϴ� ȭ���̴�.
     * @param req
     * @param res
     * @throws AppException
     **/
    public void accessSeprrcpm(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_BILL_SEPRDataSet ds = null;
        boolean retValue = false;

        //����� ��������
        String ciincmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String cibocd    = Util.checkString(req.getParameter("bocd"));          //���������ڵ�
        String ciprocdt = Util.checkString(req.getParameter("procdt")); // �Ա� ����
        String cirecpmthd = Util.checkString(req.getParameter("recpmthd")); // �Ա� ���
        String circpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd")); // �Ա� �����ڵ�
        String ciclsfval = Util.checkString(req.getParameter("clsfval")); // �Է�,����,����
        String cirdr_no = Util.checkString(req.getParameter("rdr_no"));
        String cimedicd = Util.checkString(req.getParameter("medicd"));
        String citermsubsno = Util.checkString(req.getParameter("termsubsno"));
        String circpmseq = Util.checkString(req.getParameter("rcpmseq"));
        String cirecpdt = Util.checkString(req.getParameter("recpdt")); // ���� ����
        int circpmamt = Integer.parseInt(Util.convertNull(req.getParameter("rcpmamt"), "0")); // �Ա� �ݾ�

        PS_A_BILL_SEPRDM dm = new PS_A_BILL_SEPRDM(); //dm�� ���� Setting�Ѵ�.

        dm.setIncmgpers(ciincmgpers); // �Է�/������
        dm.setBocd(cibocd); // �������� �ڵ屸��
        dm.setProcdt(ciprocdt); // �Ա�����
        dm.setRecpmthd(cirecpmthd); // �Աݹ��
        dm.setRcpmclsfcd(circpmclsfcd); // �Ա� ���� �ڵ�
        dm.setClsfval(ciclsfval); // �Է�/����/����
        dm.setRdr_no(cirdr_no); // ���ڹ�ȣ
        dm.setMedicd(cimedicd); // ��ü�ڵ�
        dm.setTermsubsno(citermsubsno); // ���ⱸ����ȣ
        dm.setRcpmseq(circpmseq); // �Աݼ���
        dm.setRecpdt(cirecpdt); // ��������
        dm.setRcpmamt(circpmamt); // �Աݱݾ�

        PSBill1101EJBHome home = (PSBill1101EJBHome) JNDIManager.getInstance().getHome("PSBill1101EJB");

        try {
            PSBill1101EJB ejb = home.create();
            retValue = ejb.accessSeprrcpm(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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