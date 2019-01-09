/***************************************************************************************************
 * �Լ���   : PSBill1401WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2003-11-18
 * �ۼ���   : ���ȣ
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
 * ����-�ʰ��Ա�ó��
 */
public class PSBill1401WB {

    /**
     * �ʰ��Ա�ó�� �ʱ�ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_C_EXCSRCPMPROCDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_C_EXCSRCPMPROCDM dm = new PS_C_EXCSRCPMPROCDM();

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");
        try {
            PSBill1401EJB ejb = home.create();
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
     * �ʰ��Ա� ������ ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BILL_EXCSRCPMPROCDataSet ds = null;

        String bocd = Util.checkString(req.getParameter("slt_bocd"));
        String subsyy = Util.checkString(req.getParameter("subsyy"));
        String excsrcpmporcyn = Util.checkString(req.getParameter("excsrcpmporcyn"));
        String procdtbgn = Util.checkString(req.getParameter("procdtbgn"));
        String procdtend = Util.checkString(req.getParameter("procdtend"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String sPageNo = req.getParameter("curr_page_no"); // ����������
        int iPageSize = 10; // �������� Row�� �ϴ� 10����
        int iPageNo = 1; // ���� ������ 1�� ����
        if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(sPageNo);
        }

        PS_L_BILL_EXCSRCPMPROCDM dm = new PS_L_BILL_EXCSRCPMPROCDM();
        //dm�� ���� Setting�Ѵ�.

        dm.setBocd(bocd);
        dm.setSubsyy(subsyy);
        dm.setProcyn(excsrcpmporcyn);
        dm.setProcdtbgn(procdtbgn);
        dm.setProcdtend(procdtend);
        dm.setPageno(iPageNo); // ����������
        dm.setPagesize(iPageSize); //�������� Row��

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");
        try {
            PSBill1401EJB ejb = home.create();
            ds = ejb.selectList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * �ʰ��Ա��� �Է��Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void aceessExcsamt(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //����� ��������
        String pers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String bocd    = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_bocd")));         //���������ڵ�
        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
        String procdt = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt")));
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno"))); //���ⱸ�Ϲ�ȣ
        String procclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("procclsf")));
        String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
        String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
        String procamt = Util.Uni2Ksc(Util.checkString(req.getParameter("procamt")));
        String aftsubsendser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("extdtms")));

        PS_A_BILL_EXCSRCPMPROCDM dm = new PS_A_BILL_EXCSRCPMPROCDM();
        //dm�� ���� Setting�Ѵ�.

        dm.setAccflag(accflag);
        dm.setProcdt(procdt);
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno); //���ⱸ�Ϲ�ȣ
        dm.setProcclsf(procclsf);
        dm.setSeq(seq);
        dm.setMemo(memo);
        dm.setProcamt(procamt);
        dm.setAftsubsendser_no(aftsubsendser_no);
        dm.setPers(pers);

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");

        try {
            PSBill1401EJB ejb = home.create();

            bResult = ejb.aceessExcsamt(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }
    }

    /**
     * ���� ���������� �˻��Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectRdrinfoPart(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PB_S_RDRINFO_PARTDataSet ds = null;

        //����� ��������
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String bocd = Util.checkString(req.getParameter("slt_bocd"));                                         //���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                         //���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));                                         //��ü�ڵ�
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));                                 //���ⱸ����ȣ

        //DM ���� Setting�Ѵ�.
        PB_S_RDRINFO_PARTDM dm = new PB_S_RDRINFO_PARTDM();
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setRdr_no(rdr_no);                                                                                 //���ڹ�ȣ
        dm.setMedicd(medicd);                                                                                 //��ü�ڵ�
        dm.setTermsubsno(termsubsno);                                                                         //���ⱸ����ȣ

        PSBill1401EJBHome home = (PSBill1401EJBHome) JNDIManager.getInstance().getHome("PSBill1401EJB");

        try{
            PSBill1401EJB ejb = home.create();
            ds = ejb.selectRdrinfoPart(dm);             // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                 // request�� ������� ��´�.
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

}