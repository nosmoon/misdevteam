/***************************************************************************************************
 * ���ϸ�   : PSCommonWB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 *            ���Ǿ������� ������ workbeen
 * �ۼ����� : 2004-02-25
 * �ۼ���   : ����
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.common.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.common.ejb.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.dao.*;

public class PSCommonWB {

    /**
     * ���� �����ȣ�� �ּҸ� ã�� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectZipAddr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_L_TAOCC_PSTCDDataSet ds = null;

        //���������� Request�� ���� �Ķ����
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));                             //�˻���(��,��,��)
        String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));                                 //�����ȣ

        //DM ���� Setting�Ѵ�.
        PB_L_TAOCC_PSTCDDM dm = new PB_L_TAOCC_PSTCDDM();
        dm.setAddr3(addr3);                                                                                   //�˻���(��,��,��)
        dm.setZip(zip);                                                                                       //�����ȣ

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectZipAddr(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���� �����ȣ�� �ּҸ� ã�� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectZipAddr3(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_ZIP_BRANCHDataSet ds = null;

        //���������� Request�� ���� �Ķ����
        String bocd = ""; //Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                             //�˻���(��,��,��)
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));                             //�˻���(��,��,��)
        String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));                                 //�����ȣ


        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno"))); //����������
        if (pagenostr.equals(""))
            pagenostr = "1";
        long pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize"))); //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))
            pagesizestr = "1000";
        long pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        CO_L_ZIP_BRANCHDM dm = new CO_L_ZIP_BRANCHDM();
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        dm.setAddr3(addr3);                                                                                   //�˻���(��,��,��)
        dm.setZip(zip);                                                                                       //�����ȣ

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectZipAddr3(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��ȸ���ǿ� �ش�Ǵ� ������ �μ�����ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectEmpDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_S_CORBOEMPDataSet ds = null;

        //���������� Request�� ���� �Ķ����
        //String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));                               //���������ڵ�
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true);                                       //�����ID
        String boemp_no = req.getParameter("procpers");                                                         //�������� ����ڵ�

		//dm�� ���� Setting�Ѵ�.
        PB_S_CORBOEMPDM dm = new PB_S_CORBOEMPDM();
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setBoemp_no(boemp_no);                                                                             //�������� ����ڵ�

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");

        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectEmpDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);   // request�� ������� ��´�.
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
     * ���纰 �μ��� �˻��Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectBoDept(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_L_BOCDDEPTDataSet ds = null;

        //Session���� ���� ����Ÿ
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //���������ڵ�

		//dm�� ���� Setting�Ѵ�.
        PB_L_BOCDDEPTDM dm = new PB_L_BOCDDEPTDM();
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");

        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectBoDept(dm);  // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * �������ڸ� �˻��Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectExstRdr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_L_EXST_RDR_SEARCHDataSet ds = null;

        //Session���� ���� ����Ÿ
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //���������ڵ�
        String sh_rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_no")));                     //���ڹ�ȣ
        String sh_rdrtel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel1")));                   //��ȭ��ȣ1
        String sh_rdrtel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel2")));                   //��ȭ��ȣ2
        String sh_rdrtel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel3")));                   //��ȭ��ȣ3
        String sh_rdrpho1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho1")));                   //�޴�����ȣ1
        String sh_rdrpho2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho2")));                   //�޴�����ȣ2
        String sh_rdrpho3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho3")));                   //�޴�����ȣ3
        String sh_dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvzip")));                     //�����ȣ
        String sh_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvaddr")));                   //�ּ�
        String sh_dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvdtlsaddr")));           //���ּ�
        String sh_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn")));                           //�ֹι�ȣ
        String sh_email = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_email")));                       //�̸���
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        PB_L_EXST_RDR_SEARCHDM dm = new PB_L_EXST_RDR_SEARCHDM();
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�Է»����ȣ
        dm.setSh_rdr_no(sh_rdr_no);                                                                           //���ڹ�ȣ
        dm.setSh_rdrtel1(sh_rdrtel1);                                                                         //��ȭ��ȣ1
        dm.setSh_rdrtel2(sh_rdrtel2);                                                                         //��ȭ��ȣ2
        dm.setSh_rdrtel3(sh_rdrtel3);                                                                         //��ȭ��ȣ3
        dm.setSh_rdrpho1(sh_rdrpho1);                                                                         //�޴�����ȣ1
        dm.setSh_rdrpho2(sh_rdrpho2);                                                                         //�޴�����ȣ2
        dm.setSh_rdrpho3(sh_rdrpho3);                                                                         //�޴�����ȣ3
        dm.setSh_dlvzip(sh_dlvzip);                                                                           //�����ȣ
        dm.setSh_dlvaddr(sh_dlvaddr);                                                                         //�ּ�
        dm.setSh_dlvdtlsaddr(sh_dlvdtlsaddr);                                                                 //���ּ�
        dm.setSh_prn(sh_prn);                                                                                 //�ֹι�ȣ
        dm.setSh_email(sh_email);                                                                             //�̸���
        dm.setPageno(pageno);                                                                                 //����������
        dm.setPagesize(pagesize);                                                                             //�������� ������ �Ǽ�

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectExstRdr(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���ڹ�ȣ�� ���������� ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_RDRINFODataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�

        //���������� Request�� ���� �Ķ����
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                         //���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));                                         //��ü�ڵ�
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));                                 //���ⱸ����ȣ

		//dm�� ���� Setting�Ѵ�.
        PS_S_RDRINFODM dm = new PS_S_RDRINFODM();

        dm.setCmpycd(cmpycd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectReaderDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);      // request�� ������� ��´�.
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
     * ���ڹ�ȣ�� ��������(BOCD)�� ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectReaderDetailBocd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_RDRINFODataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�

        //���������� Request�� ���� �Ķ����
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                         //���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));                                         //��ü�ڵ�
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));                                 //���ⱸ����ȣ

        //dm�� ���� Setting�Ѵ�.
        PS_S_RDRINFODM dm = new PS_S_RDRINFODM();

        dm.setCmpycd(cmpycd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectReaderDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);      // request�� ������� ��´�.
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
     * �����˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBranchOfficeList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bonm = Util.Uni2Euc(Util.checkString(req.getParameter("bonm")));
        String addr3 = Util.Uni2Euc(Util.checkString(req.getParameter("addr3")));
        PS_L_BO_SRCHDM dm = new PS_L_BO_SRCHDM();

        dm.setBonm(bonm);
        dm.setAddr3(addr3);
        // JNDI lookup �� ���� EJB Home interface ��ü����
        PSCommonEJBHome home = (PSCommonEJBHome)JNDIManager.getInstance().getHome("PSCommonEJB");
        try{
            PSCommonEJB ejb = home.create();
            PS_L_BO_SRCHDataSet ds = null;
            ds = ejb.selectBranchOfficeList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
