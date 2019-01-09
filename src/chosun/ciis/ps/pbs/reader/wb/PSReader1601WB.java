/***************************************************************************************************
 * ���ϸ�   : PSReader1601WB.java
 * ��  ��   : ����-���ڵ�޺ο�
 * �ۼ����� : 2004-04-22
 * �ۼ���   : ���ȣ
 ****************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 ****************************************************************************************************/

package chosun.ciis.ps.pbs.reader.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.reader.ejb.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;

public class PSReader1601WB {

    /**
     * ���ڵ�ް��� ��޽�û������ ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectGradAplcList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_RDRCRTS_GRAD_APLCDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //���������ڵ�
        String callpgclsf = "PS";                                                                             //ȣ������������
        String sh_aplcdt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcdt_fr")));               //��û��������
        String sh_aplcdt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcdt_to")));               //��û��������
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //��ü�ڵ�
        String sh_rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_no")));                     //���ڹ�ȣ
        String sh_apl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_apl_nm")));                     //��û�ڸ�
        String sh_rdr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_nm")));                     //���ڸ�
        String sh_prn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn1")));                         //�ֹι�ȣ1
        String sh_prn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn2")));                         //�ֹι�ȣ2
        String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));                     //��ȭ��ȣ1
        String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));                     //��ȭ��ȣ2
        String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));                     //��ȭ��ȣ3
        String sh_dtlsprocstat = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dtlsprocstat")));         //��ó������
        String sh_dtlsprocclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dtlsprocclsf")));         //��ó������
        String sh_cashrcptstat = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_cashrcptstat")));         //���ݿ���������
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);
               
        //DM ���� Setting�Ѵ�.
        CO_L_RDRCRTS_GRAD_APLCDM dm = new CO_L_RDRCRTS_GRAD_APLCDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setCallpgclsf(callpgclsf);
        dm.setSh_aplcdt_fr(sh_aplcdt_fr);
        dm.setSh_aplcdt_to(sh_aplcdt_to);
        dm.setSh_medicd(sh_medicd);
        dm.setSh_rdr_no(sh_rdr_no);
        dm.setSh_rdr_nm(sh_rdr_nm);
        dm.setSh_apl_nm(sh_apl_nm);
        dm.setSh_prn1(sh_prn1);
        dm.setSh_prn2(sh_prn2);
        dm.setSh_phone1(sh_phone1);
        dm.setSh_phone2(sh_phone2);
        dm.setSh_phone3(sh_phone3);
        dm.setSh_dtlsprocstat(sh_dtlsprocstat);
        dm.setSh_dtlsprocclsf(sh_dtlsprocclsf);
        dm.setSh_cashrcptstat(sh_cashrcptstat);
        dm.setSh_mblestat("");
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        PSReader1601EJBHome home = (PSReader1601EJBHome) JNDIManager.getInstance().getHome("PSReader1601EJB");
        try {

            PSReader1601EJB ejb = home.create();
            ds = ejb.selectGradAplcList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���ڵ�ް��� ��޽�û������ �����Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void updateGradAplcGrnt(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_U_RDRCRTS_GRAD_GRNTDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        /*String listcntstr = Util.checkString(req.getParameter("listcnt"));                                    //�� ���ڵ� ī��Ʈ
        if (listcntstr.equals(""))   listcntstr = "0";
        long   listcnt = Long.parseLong(listcntstr);*/

        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //���������ڵ�
        String callpgclsf = "PS";                                                                             //ȣ������������

        //String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
        //String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        //String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        //String callpgclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("callpgclsf")));
        String onlmembseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("onlmembseq")));
        String regdtarr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
        String regnoarr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
        String bocdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String medicdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String rdr_noarr = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
        String rdrgradarr = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrgrad")));
        String dtlsprocstatarr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsprocstat")));
        String errresncdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("errresncd")));
        String cashrcptstat = Util.Uni2Ksc(Util.checkString(req.getParameter("cashrcptstat")));
        String chkseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("chkseq")));
        
        /*StringBuffer onlmembseqarr   = new StringBuffer("");                                                  //�¶���ȸ���Ϸù�ȣ Array
        StringBuffer regdtarr        = new StringBuffer("");                                                  //��û���� Array
        StringBuffer regnoarr        = new StringBuffer("");                                                  //��û��ȣ Array
        StringBuffer bocdarr         = new StringBuffer("");                                                  //���������ڵ� Array
        StringBuffer medicdarr       = new StringBuffer("");                                                  //��ü�ڵ� Array
        StringBuffer rdr_noarr       = new StringBuffer("");                                                  //���ڹ�ȣ Array
        StringBuffer rdrgradarr      = new StringBuffer("");                                                  //�񱳵�� Array
        StringBuffer dtlsprocstatarr = new StringBuffer("");                                                  //��ó������ Array
        StringBuffer errresncdarr    = new StringBuffer("");                                                  //�������� Array
        StringBuffer chkseqarr       = new StringBuffer("");                                                  //üũ���� Array
        StringBuffer cashrcptstatarr = new StringBuffer("");                                                  //üũ���� Array

        //String Array�� ����
        for (int i=0 ; i < listcnt ; i++) {
            if ("SEL".equals(Util.checkString(req.getParameter("grad_check"+i)))) {
                onlmembseqarr.append("##");
                onlmembseqarr.append(Util.checkString(req.getParameter("onlmembseq"+i)));                     //�¶���ȸ���Ϸù�ȣ

                regdtarr.append("##");
                regdtarr.append(Util.checkString(req.getParameter("aplcdt"+i)));                              //��û����

                regnoarr.append("##");
                regnoarr.append(Util.checkString(req.getParameter("aplcno"+i)));                              //��û��ȣ

                bocdarr.append("##");
                bocdarr.append(Util.checkString(req.getParameter("bocd"+i)));                                 //���������ڵ�

                medicdarr.append("##");
                medicdarr.append(Util.checkString(req.getParameter("medicd"+i)));                             //��ü�ڵ�

                rdr_noarr.append("##");
                rdr_noarr.append(Util.checkString(req.getParameter("rdr_no"+i)));                             //���ڹ�ȣ

                rdrgradarr.append("##");
                rdrgradarr.append(Util.checkString(req.getParameter("rdrgrad"+i)));                           //�񱳵��

                dtlsprocstatarr.append("##");
                dtlsprocstatarr.append(Util.checkString(req.getParameter("dtlsprocstat"+i)));                 //��ó������

                chkseqarr.append("##");
                chkseqarr.append(Util.checkString(req.getParameter("chkseq"+i)));                             //üũ����

                errresncdarr.append("##");
                errresncdarr.append(Util.checkString(req.getParameter("errresncd"+i)));                       //üũ����

                cashrcptstatarr.append("##");
                cashrcptstatarr.append(Util.checkString(req.getParameter("cashrcptstat"+i)));                       //üũ����
            }
        }

        onlmembseqarr.delete(0,2);      //ó�� ## ����
        regdtarr.delete(0,2);           //ó�� ## ����
        regnoarr.delete(0,2);           //ó�� ## ����
        bocdarr.delete(0,2);            //ó�� ## ����
        medicdarr.delete(0,2);          //ó�� ## ����
        rdr_noarr.delete(0,2);          //ó�� ## ����
        rdrgradarr.delete(0,2);         //ó�� ## ����
        dtlsprocstatarr.delete(0,2);    //ó�� ## ����
        chkseqarr.delete(0,2);          //ó�� ## ����
        errresncdarr.delete(0,2);       //ó�� ## ����
        cashrcptstatarr.delete(0,2);    //ó�� ## ����*/

        //DM ���� Setting�Ѵ�.
        CO_U_RDRCRTS_GRAD_GRNTDM dm = new CO_U_RDRCRTS_GRAD_GRNTDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setCallpgclsf(callpgclsf);
        dm.setOnlmembseqarr(onlmembseqarr);
        dm.setRegdtarr(regdtarr);
        dm.setRegnoarr(regnoarr);
        dm.setBocdarr(bocdarr);
        dm.setMedicdarr(medicdarr);
        dm.setRdr_noarr(rdr_noarr);
        dm.setRdrgradarr(rdrgradarr);
        dm.setDtlsprocstatarr(dtlsprocstatarr);
        dm.setErrresncdarr(errresncdarr);
        dm.setCashrcptstat(cashrcptstat);
        dm.setChkseqarr(chkseqarr);
        
        /*dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setCallpgclsf(callpgclsf);
        dm.setOnlmembseqarr(onlmembseqarr.toString());
        dm.setRegdtarr(regdtarr.toString());
        dm.setRegnoarr(regnoarr.toString());
        dm.setBocdarr(bocdarr.toString());
        dm.setMedicdarr(medicdarr.toString());
        dm.setRdr_noarr(rdr_noarr.toString());
        dm.setRdrgradarr(rdrgradarr.toString());
        dm.setDtlsprocstatarr(dtlsprocstatarr.toString());
        dm.setChkseqarr(chkseqarr.toString());
        dm.setErrresncdarr(errresncdarr.toString());
        dm.setCashrcptstat(cashrcptstatarr.toString());*/

        PSReader1601EJBHome home = (PSReader1601EJBHome) JNDIManager.getInstance().getHome("PSReader1601EJB");
        try {

            PSReader1601EJB ejb = home.create();
            ds = ejb.updateGradAplcGrnt(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���ڵ�޺ο� ���ں񱳴���� ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectAplcCmprList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_RDRCRTS_APLC_CMPRDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //���������ڵ�
        String callpgclsf = "PS";                                                                             //ȣ������������
        String sh_searcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_searcd")));                     //�˻������ڵ�
        if (sh_searcd.equals(""))   sh_searcd = "NO";                                                         //�˻������ڵ尡 ������� DEFAULT�� ���ڹ�ȣ
        String sh_searnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_searnm")));                     //�˻���
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //��ü�ڵ�
        String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));                     //��ȭ��ȣ1
        String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));                     //��ȭ��ȣ2
        String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));                     //��ȭ��ȣ3
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        CO_L_RDRCRTS_APLC_CMPRDM dm = new CO_L_RDRCRTS_APLC_CMPRDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setCallpgclsf(callpgclsf);
        dm.setSh_searcd(sh_searcd);
        dm.setSh_searnm(sh_searnm);
        dm.setSh_medicd(sh_medicd);
        dm.setSh_phone1(sh_phone1);
        dm.setSh_phone2(sh_phone2);
        dm.setSh_phone3(sh_phone3);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        PSReader1601EJBHome home = (PSReader1601EJBHome) JNDIManager.getInstance().getHome("PSReader1601EJB");
        try {

            PSReader1601EJB ejb = home.create();
            ds = ejb.selectAplcCmprList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ���ڵ�ް���-����÷��� ȸ�� �˻�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void select_mplist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_S_TASOM_RDRIDDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd_p")));                               //���������ڵ�
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no_p")));                     //�˻������ڵ�
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd_p")));                     //�˻���

        //DM ���� Setting�Ѵ�.
        CO_S_TASOM_RDRIDDM dm = new CO_S_TASOM_RDRIDDM();

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);

        PSReader1601EJBHome home = (PSReader1601EJBHome) JNDIManager.getInstance().getHome("PSReader1601EJB");
        try {

            PSReader1601EJB ejb = home.create();
            ds = ejb.select_mplist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
}
/***************************************************************************************************
 * ������     :
 * �������ڵ� :
**************************************************************************************************/
