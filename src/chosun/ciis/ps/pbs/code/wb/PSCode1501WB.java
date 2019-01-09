/*****************************************************
 * ���ϸ�   : PSCode1501WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2006-11-09
 * �ۼ���   : ����ǥ
 ********************************************************/
package chosun.ciis.ps.pbs.code.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.code.ejb.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;

/**
 * ����-����������°��� WorkBean
 */
public class PSCode1501WB {

    /**
     * ����������°��� �ʱ�ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BOACCTDataSet ds = null;
        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String bocd = Util.checkString(req.getParameter("slt_bocd")); // ���õ� ���������ڵ�

        PS_L_BOACCTDM dm = new PS_L_BOACCTDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);

        PSCode1501EJBHome home = (PSCode1501EJBHome) JNDIManager.getInstance().getHome("PSCode1501EJB");
        try {
            PSCode1501EJB ejb = home.create();

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
     * ���������ڵ���� ������ ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void selectBoacctlist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BOACCTDataSet ds = null;

        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

        String bocd = Util.checkString(req.getParameter("slt_bocd")); // ���õ� ���������ڵ�

        PS_L_BOACCTDM dm = new PS_L_BOACCTDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);

        PSCode1501EJBHome home = (PSCode1501EJBHome) JNDIManager.getInstance().getHome("PSCode1501EJB");
        try {
            PSCode1501EJB ejb = home.create();
            ds = ejb.selectBoacctlist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���������ڵ���� ������ �����Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/

    public void accessBoacct(HttpServletRequest req, HttpServletResponse res) throws AppException {
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
        String bocd = Util.checkString(req.getParameter("asinbocd"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String depskind = Util.checkString(req.getParameter("depskind"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String seq = Util.checkString(req.getParameter("seq"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        PS_A_BOACCTDM dm = new PS_A_BOACCTDM();
        //dm�� ���� Setting�Ѵ�.

        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setSeq(seq);
        dm.setAcctitem(acctitem);
        dm.setDepskind(depskind);
        dm.setBankcd(bankcd);
        dm.setDeps_persnm(deps_persnm);
        dm.setAcctno(acctno);
        dm.setRemk(remk);

        PSCode1501EJBHome home = (PSCode1501EJBHome) JNDIManager.getInstance().getHome("PSCode1501EJB");

        try {
            PSCode1501EJB ejb = home.create();
            bResult = ejb.accessBoacct(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
