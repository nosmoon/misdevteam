/***************************************************************************************************
 * ���ϸ�   : PSReader1801WB.java
 * ��  ��   : ����-������ȸ �ڵ�� �ʱ�ȭ��
 * �ۼ����� : 2004-02-29
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

public class PSReader1801WB {

    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    /*
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_PUBL_RDRDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�α��λ����

        PS_S_PUBL_RDRDM dm = new PS_S_PUBL_RDRDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSReader1401EJBHome home = (PSReader1401EJBHome) JNDIManager.getInstance().getHome("PSReader1401EJB");
        try {

            PSReader1401EJB ejb = home.create();
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
    */

    /**
     * ������ȸ ����Ÿ�� ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_RDR_PUBL_ETCDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�α��λ����

        String aplcdtfr = Util.checkString(req.getParameter("aplcdtfr"));
        String aplcdtto = Util.checkString(req.getParameter("aplcdtto"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String asinbocd = Util.checkString(req.getParameter("asinbocd"));
        String prn1 = Util.checkString(req.getParameter("prn1"));
        String prn2 = Util.checkString(req.getParameter("prn2"));
        String tel_kubun = Util.checkString(req.getParameter("tel_kubun"));
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
        String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
        String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
        String curr_page_no = req.getParameter("curr_page_no"); // ����������
        String records_per_page = req.getParameter("records_per_page"); // �������� Row��
        String flnm_yn = req.getParameter("flnm_yn") ;      // ���ڸ�/�����θ� �� ����

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_RDR_PUBL_ETCDM dm = new PS_L_RDR_PUBL_ETCDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setAplcdtfr(aplcdtfr);
        dm.setAplcdtto(aplcdtto);
        dm.setMedicd(medicd);
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setAsinbocd(asinbocd);
        dm.setPrn1(prn1);
        dm.setPrn2(prn2);
        dm.setTel_kubun(tel_kubun);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setAddr(addr);
        dm.setEmail(email);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);
        dm.setFlnm_yn(flnm_yn);

        PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
        try {

            PSReader1801EJB ejb = home.create();
            ds = ejb.selectRdrList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * �����ڰ��� �� ��ȸ
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    /*
    public void selectDetailInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_READERINFODataSet ds = null;

        //����� ��������
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);         // �����

        //���������� Request�� ���� �Ķ����
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_rdr_no"))); //���ڹ�ȣ
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_medicd"))); //��ü��ȣ
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_termsubsno"))); //���ⱸ���ڹ�ȣ

        //DM ���� Setting�Ѵ�.
        PS_S_READERINFODM dm = new PS_S_READERINFODM();
        dm.setIncmgpers(incmgpers); // �����
        dm.setRdr_no(rdr_no); //���ڹ�ȣ
        dm.setMedicd(medicd); //��ü��ȣ
        dm.setTermsubsno(termsubsno); //���ⱸ���ڹ�ȣ

        PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");

        try {
            PSReader1801EJB ejb = home.create();
            ds = ejb.selectDetailInfo(dm); //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); //request�� ������� ��´�.
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
    */


   /**
    * ���� ����
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_BO_READER_SEARCHDataSet ds = null;

       //Session���� ���� ����Ÿ
       String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
       //String bocd = Util.getSessionParameterValue(req, "bocd", true);

       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
       String gubun1 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun1")));
       String nmtext = Util.Uni2Ksc(Util.checkString(req.getParameter("nmtext")));
       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
       String gubun2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun2")));
       String phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone1")));
       String phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone2")));
       String phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone3")));
       String gubun3 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun3")));
       String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
       String sendmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_sendmthd")));
       String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
       String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
       String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));

       String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������
       if (pagenostr.equals(""))   pagenostr = "1";
       long   pageno = Long.parseLong(pagenostr);
       String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
       if (pagesizestr.equals(""))   pagesizestr = "5";
       long   pagesize = Long.parseLong(pagesizestr);

       //DM ���� Setting�Ѵ�.
       PS_L_BO_READER_SEARCHDM dm = new PS_L_BO_READER_SEARCHDM();

       dm.setCmpycd(cmpycd);
       dm.setMedicd(medicd);
       dm.setGubun1(gubun1);
       dm.setNmtext(nmtext);
       dm.setRdr_no(rdr_no);
       dm.setGubun2(gubun2);
       dm.setPhone1(phone1);
       dm.setPhone2(phone2);
       dm.setPhone3(phone3);
       dm.setGubun3(gubun3);
       dm.setDlvdtlsaddr(dlvdtlsaddr);
       dm.setSendmthd(sendmthd);
       dm.setAreacd(areacd);
       dm.setDeptcd(deptcd);
       dm.setBocd(bocd);
       dm.setPageno(pageno);
       dm.setPagesize(pagesize);

       PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
       try {

           PSReader1801EJB ejb = home.create();
           ds = ejb.selectBoReaderList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
    * ���� ����
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_S_BO_READERINFODataSet ds = null;

       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
       String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));

       //DM ���� Setting�Ѵ�.
       PS_S_BO_READERINFODM dm = new PS_S_BO_READERINFODM();

       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);

       PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
       try {

           PSReader1801EJB ejb = home.create();
           ds = ejb.selectBoReaderDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
    * ������ ������ ������ Set
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBoReaderInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_U_BO_READERINFO_ONEDataSet ds = null;

       //����� ��������
       //String bocd = Util.getSessionParameterValue(req, "bocd", true); //���������ڵ�
       String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //ȸ���ڵ�
       String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

       //���������� Request�� ���� �Ķ����
       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no"))); //���ڹ�ȣ
       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd"))); //��ü�ڵ�
       String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno"))); //���ⱸ����ȣ

       String acq_bocd = Util.checkString(req.getParameter("acq_bocd"));
       String sendmthd = Util.checkString(req.getParameter("sendmthd"));
       String dstccd = Util.checkString(req.getParameter("dstccd"));
       String dlvno = Util.checkString(req.getParameter("dlvno"));
       String bo_rdr_no = Util.checkString(req.getParameter("bo_rdr_no"));

       //DM ���� Setting�Ѵ�.
       PS_U_BO_READERINFO_ONEDM dm = new PS_U_BO_READERINFO_ONEDM();

       dm.setIncmgpers(incmgpers); //�Է»����ȣ
       dm.setRdr_no(rdr_no); //���ڹ�ȣ
       dm.setMedicd(medicd); //��ü�ڵ�
       dm.setTermsubsno(termsubsno); //���ⱸ����ȣ

       dm.setAcq_bocd(acq_bocd);       //�����������ڵ�
       dm.setSendmthd(sendmthd);
       dm.setDstccd(dstccd);
       dm.setDlvno(dlvno);
       dm.setBo_rdr_no(bo_rdr_no);

       PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
       try {
           PSReader1801EJB ejb = home.create();
           ds = ejb.updateBoReaderInfo(dm); //������ dm������ EJB�� ȣ���Ѵ�.
           req.setAttribute("ds", ds); //request�� ������� ��´�.
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
