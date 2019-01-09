/***************************************************************************************************
 * ���ϸ�   : PSSend2001WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004/03/12
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
 * �߼�-�����߰��߼�
 */
public class PSSend2001WB {

    /**
     * �����߰��߼�ó�� ����ȭ���� �ʱ�ȭ��Ų��.
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

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");
        try {
            PSSend2001EJB ejb = home.create();
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
     * �����߰��߼� ������ ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_SEND_GIROADDMDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

        String bocd = Util.checkString(req.getParameter("sendbrch"));
        String girosenddt = Util.checkString(req.getParameter("senddt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        if (bocd == null || bocd.equals("")) {
            bocd = "ALL";
        }

        String sPageNo = req.getParameter("curr_page_no"); // ����������
        int iPageSize = 20; // �������� Row�� �ϴ� 20����
        int iPageNo = 1; // ���� ������ 1�� ����
        if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(sPageNo);
        }

        PS_L_SEND_GIROADDMDM dm = new PS_L_SEND_GIROADDMDM();
        //dm�� ���� Setting�Ѵ�.

        dm.setBocd(bocd);
        dm.setCmpycd(cmpycd);
        dm.setGirosenddt(girosenddt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");

        try {
            PSSend2001EJB ejb = home.create();
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
     * �����߰��߼� �Է��Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void aceessGiroaddmsend(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����
        //��������
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //����ھ��̵�

        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));
        String issuseq = Util.checkString(req.getParameter("issuseq"));
        String senddt = Util.checkString(req.getParameter("senddt"));
        String agrmntdt = Util.checkString(req.getParameter("agrmntdt"));
        String agrmntamt = Util.checkString(req.getParameter("agrmntamt"));

        PS_A_SEND_GIROADDMDM dm = new PS_A_SEND_GIROADDMDM();
        //dm�� ���� Setting�Ѵ�.

        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setIssuseq(issuseq);
        dm.setSenddt(senddt);
        dm.setAgrmntdt(agrmntdt);
        dm.setAgrmntamt(Integer.parseInt(agrmntamt));
        dm.setPers(incmgpers);

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");

        try {
            PSSend2001EJB ejb = home.create();

            bResult = ejb.aceessGiroaddmsend(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * �����߰��߼� ������ ���� �Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @return void
     */
    public void deleteList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����
        //��������
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //����ھ��̵�

        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));
        String issuseq = Util.checkString(req.getParameter("issuseq"));

        PS_D_SEND_GIROADDMDM dm = new PS_D_SEND_GIROADDMDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setIssuseq(issuseq);
        dm.setPers(incmgpers);

        PSSend2001EJBHome home = (PSSend2001EJBHome) JNDIManager.getInstance().getHome("PSSend2001EJB");

        try {
            PSSend2001EJB ejb = home.create();
            bResult = ejb.deleteList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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

}