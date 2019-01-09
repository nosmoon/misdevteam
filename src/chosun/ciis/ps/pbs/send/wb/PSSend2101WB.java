/***************************************************************************************************
 * ���ϸ�   : PSSend2101WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004/03/18
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
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.send.ejb.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;

/**
 * �߼�-�ݼ۰���
 */
public class PSSend2101WB {
    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_RETNDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_S_SEND_RETNDM dm = new PS_S_SEND_RETNDM(); // DM ���� Setting�Ѵ�.

        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

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
     * �ݼ۰��� ���� ��ȸ
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRetnList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_RETNDataSet ds = null;
        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        // ���Ǳ��� �ƴҰ��� ALL�� ��� ��ü�ڵ带 ��ȸ�Ѵ�.
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_bocd")));     // ���������ڵ�
        String retndt_fr = Util.checkString(req.getParameter("slt_retndt_fr"));         // �ݼ�����(From)
        String retndt_to = Util.checkString(req.getParameter("slt_retndt_to"));         // �ݼ�����(To)
        String retnclsf = Util.checkString(req.getParameter("slt_retnclsf"));           // �ݼ�����
        String boprocyn = Util.checkString(req.getParameter("slt_boprocyn"));           // ó�����
        String acqnm = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_acqnm")));   // �����θ�
        String curr_page_no = req.getParameter("curr_page_no");                         // ����������
        String records_per_page = req.getParameter("records_per_page");                 // �������� Row��
        int iPageSize = Integer.parseInt(records_per_page);             // �������� Row�� int�� ��ȯ
        int iPageNo = 1;                                                // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) {         // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_SEND_RETNDM dm = new PS_L_SEND_RETNDM();   // DM ���� Setting�Ѵ�.

        dm.setBocd(bocd);           // ���������ڵ�
        dm.setCmpycd(cmpycd);       // ȸ���ڵ�
        dm.setRetndt_fr(retndt_fr); // �ݼ�����(From)
        dm.setRetndt_to(retndt_to); // �ݼ�����(To)
        dm.setRetnclsf(retnclsf);   // �ݼ�����
        dm.setBoprocyn(boprocyn);   // ó�����
        dm.setAcqnm(acqnm);         // �����θ�
        dm.setPageno(iPageNo);      // ����������
        dm.setPagesize(iPageSize);  // �������� Row��

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");

        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.selectRetnList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * �ݼ۳��� �� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRetnDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEND_RETN_DTLDataSet ds = null;
        //����� ��������
        //String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        // ���Ǳ��� �ƴҰ��� ALL�� ��� ��ü�ڵ带 ��ȸ�Ѵ�.
        String bocd = Util.checkString(req.getParameter("slt_bocd")) ;// ���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no")); // ���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd")); // ��ü�ڵ�
        String termsubsno = Util.checkString(req.getParameter("termsubsno")); // ���⵶�ڹ�ȣ
        String retnseq = Util.checkString(req.getParameter("retnseq")); // �ݼۼ���

        PS_S_SEND_RETN_DTLDM dm = new PS_S_SEND_RETN_DTLDM(); // DM ���� Setting�Ѵ�.
        dm.setBocd(bocd); // ��������
        dm.setIncmgpers(incmgpers); // �Է���
        dm.setRdr_no(rdr_no); // ���ڹ�ȣ
        dm.setMedicd(medicd); // ��ü�ڵ�
        dm.setTermsubsno(termsubsno); // ���⵶�ڹ�ȣ
        dm.setRetnseq(retnseq); // �ݼۼ���

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.selectRetnDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * �ݼ۳��� ����ó��
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void accessRetn(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_RETN_PTCRDataSet ds = null;

        //����� ��������
        //String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //�������� Request��
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd"))); // ���������ڵ�
        String gbnflag = Util.checkString(req.getParameter("gbnflag"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String retnseq = Util.checkString(req.getParameter("retnseq"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));
        String retndt = Util.checkString(req.getParameter("retndt"));
        String retnclsf = Util.checkString(req.getParameter("retnclsf"));
        String retn_nmno = Util.checkString(req.getParameter("retn_nmno"));
        String bns_bookcd = Util.checkString(req.getParameter("bns_bookcd"));
        String agrmntdt = Util.checkString(req.getParameter("agrmntdt"));
        String agrmntamt = Util.checkString(req.getParameter("agrmntamt"));
        String retnresncd = Util.checkString(req.getParameter("retnresncd"));
        String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));
        String boprocdt = Util.checkString(req.getParameter("boprocdt"));
        String boprocmemo = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocmemo")));

        PS_A_RETN_PTCRDM dm = new PS_A_RETN_PTCRDM(); // DM ���� Setting�Ѵ�.

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setGbnflag(gbnflag);
        dm.setRdr_no(rdr_no);
        dm.setRetnseq(retnseq);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setRetndt(retndt);
        dm.setRetnclsf(retnclsf);
        dm.setRetn_nmno(retn_nmno);
        dm.setBns_bookcd(bns_bookcd);
        dm.setAgrmntdt(agrmntdt);
        dm.setAgrmntamt(agrmntamt);
        dm.setRetnresncd(retnresncd);
        dm.setMemo(memo);
        dm.setBoprocyn(boprocyn);
        dm.setBoprocdt(boprocdt);
        dm.setBoprocmemo(boprocmemo);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.accessRetn(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * �ݼ۰��� excel �Է�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void excelUpload(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_I_RETN_PTCR_LUMPDataSet ds = null;

        //����� ��������
        //String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //�������� Request��
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd"))); //���������ڵ�
        String retndt = Util.checkString(req.getParameter("retndt"));           //�ݼ�����        
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));           //���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));           //���ڹ�ȣ
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));   //���ڹ�ȣ
        String retnclsf = Util.checkString(req.getParameter("retnclsf"));       //�ݼ�����
        String retn_nmno = Util.checkString(req.getParameter("retn_nmno"));     //�ݼ�ȣ��
        String retnresncd = Util.checkString(req.getParameter("retnresncd"));   //�ݼۻ���
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));       //ó������

        PS_I_RETN_PTCR_LUMPDM dm = new PS_I_RETN_PTCR_LUMPDM(); // DM ���� Setting�Ѵ�.

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setRetndt(retndt);
        dm.setRetnclsf(retnclsf);
        dm.setRetn_nmno(retn_nmno);
        dm.setRetnresncd(retnresncd);
        dm.setBoprocyn(boprocyn);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.excelUpload(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * �ݼ۳��� �����ϱ� ���� ����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void deleteRetn(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_D_RETN_PTCR_DTLDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("add_rdr_no")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("add_medicd")));
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("add_termsubsno")));
        String retnseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("add_retnseq")));

        // DM ���� Setting�Ѵ�.
        PS_D_RETN_PTCR_DTLDM dm = new PS_D_RETN_PTCR_DTLDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setRetnseqarr(retnseqarr);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {
            PSSend2101EJB ejb = home.create();
            ds = ejb.deleteRetn(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectBnsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BNS_BOOK_CDDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        PS_L_BNS_BOOK_CDDM dm = new PS_L_BNS_BOOK_CDDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSSend2101EJBHome home = (PSSend2101EJBHome) JNDIManager.getInstance().getHome("PSSend2101EJB");
        try {

            PSSend2101EJB ejb = home.create();

            ds = ejb.selectBnsList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
