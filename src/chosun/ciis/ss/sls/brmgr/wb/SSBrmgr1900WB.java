/***************************************************************************************************
* ���ϸ� : SSBrmgr1900WB.java
* ��� : �����濵-����Ʈ���Է��� ���� Worker Bean
* �ۼ����� : 2004-11-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.util.*;				//�߰�
import java.lang.*;				//�߰�
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �����濵-����Ʈ���Է��� ���� WB
 */

public class SSBrmgr1900WB{

    /**
     * �ϰ��߼� �߼�ó�� ����ȭ���� �ʱ�ȭ��Ų��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_BO_SEND_INITDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
        String medicd      = Util.checkString(req.getParameter("medicd"));              //��ü�ڵ�
        String deptcd      = Util.checkString(req.getParameter("deptcd"));              //�μ��ڵ�

        SS_S_BO_SEND_INITDM dm = new SS_S_BO_SEND_INITDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setDeptcd(deptcd);

        SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
        ds = dao.selectCombolist(dm);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
        
        /*
        SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
        try {
            SSBrmgr1900EJB ejb = home.create();
            ds = ejb.selectCombolist(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
        }*/
    }


   /**
    * �ϰ��߼� �߼�ó�� ���纰Ȯ�γ����� ��ȸ�Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      SS_L_SEND_PBLMEDISENDBODataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

      String medicd = Util.checkString(req.getParameter("medicd"));
      String senddt = Util.checkString(req.getParameter("senddt"));
      String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
      String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
      String deptcd = Util.checkString(req.getParameter("deptcd"));
      String areacd = Util.checkString(req.getParameter("areacd"));

      String bocd = Util.checkString(req.getParameter("corrbocd"));
      String sPageNo = req.getParameter("pageno"); // ����������
      String records_per_page = req.getParameter("pagesize"); // �������� Row��

      int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

      int iPageNo = 1; // ���� ������ 1�� ����
      if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
          iPageNo = Integer.parseInt(sPageNo);
      }

      SS_L_SEND_PBLMEDISENDBODM dm = new SS_L_SEND_PBLMEDISENDBODM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setMedicd(medicd);
      dm.setSenddt(senddt);
      dm.setMediser_fr(mediser_no_fr);
      dm.setMediser_to(mediser_no_to);
      dm.setDeptcd(deptcd);
      dm.setAreacd(areacd);
      dm.setBocd(bocd);

      dm.setPageno(iPageNo);
      dm.setPagesize(iPageSize);

      SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
      ds = dao.selectList(dm);
      req.setAttribute("ds", ds); // request�� ������� ��´�.
      
      /*
      SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
      try{
         SSBrmgr1900EJB ejb = home.create();
         ds = ejb.selectList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         req.setAttribute("ds", ds); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }

   /**
    * �ϰ��߼� �߼�ó�� �߼۹���� �󼼳����� ��ȸ�Ѵ�
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */
   public void selectBoList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_L_BOSEND_LUMPDataSet ds = null;

       String bocd = Util.checkString(req.getParameter("bocd"));
       String mediser_no = Util.checkString(req.getParameter("mediser_no"));
       String medicd = Util.checkString(req.getParameter("medicd"));

       String sPageNo = req.getParameter("pageno"); // ����������

       String records_per_page = req.getParameter("pagesize"); // �������� Row��

       int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

       int iPageNo = 1; // ���� ������ 1�� ����
       if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
           iPageNo = Integer.parseInt(sPageNo);
       }

       SS_L_BOSEND_LUMPDM dm = new SS_L_BOSEND_LUMPDM();
       //dm�� ���� Setting�Ѵ�.

       dm.setAcq_bocd(bocd);
       dm.setMediser_no(mediser_no);
       dm.setMedicd(medicd);
       dm.setPageno(iPageNo);
       dm.setPagesize(iPageSize);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.selectBoList(dm);
       req.setAttribute("ds", ds); // request�� ������� ��´�.

       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {
           SSBrmgr1900EJB ejb = home.create();
           ds = ejb.selectBoList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
           req.setAttribute("ds", ds); // request�� ������� ��´�.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       }*/
   }

   /**
    * �ϰ��߼� �߼�ó�� ������ ���
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void printSticker(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_P_SEND_PBLMEDISENDBODataSet ds = null;

       //����� ��������
       String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

       String medicd = Util.checkString(req.getParameter("medicd"));
       String senddt = Util.checkString(req.getParameter("senddt"));
       String mediser_no_fr = Util.checkString(req.getParameter("mediser_no_fr"));
       String mediser_no_to = Util.checkString(req.getParameter("mediser_no_to"));
       String deptcd = Util.checkString(req.getParameter("deptcd"));
       String areacd = Util.checkString(req.getParameter("areacd"));

       String bocd = Util.checkString(req.getParameter("corrbocd"));
       String sPageNo = req.getParameter("pageno"); // ����������
       String records_per_page = req.getParameter("pagesize"); // �������� Row��

       int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ

       int iPageNo = 1; // ���� ������ 1�� ����
       if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
           iPageNo = Integer.parseInt(sPageNo);
       }

       SS_P_SEND_PBLMEDISENDBODM dm = new SS_P_SEND_PBLMEDISENDBODM();
       //dm�� ���� Setting�Ѵ�.
       dm.setCmpycd(cmpycd);
       dm.setMedicd(medicd);
       dm.setSenddt(senddt);
       dm.setMediser_fr(mediser_no_fr);
       dm.setMediser_to(mediser_no_to);
       dm.setDeptcd(deptcd);
       dm.setAreacd(areacd);
       dm.setBocd(bocd);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.printSticker(dm);
       req.setAttribute("ds", ds); // request�� ������� ��´�.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {
           SSBrmgr1900EJB ejb = home.create();
           ds = ejb.printSticker(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
           req.setAttribute("ds", ds); // request�� ������� ��´�.
       } catch (CreateException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       } catch (RemoteException e) {
           SysException se = new SysException(e);
           LogManager.getInstance().log(se);
       }*/
   }


   /**
    * ���� ����
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_L_BO_READER_SEARCHDataSet ds = null;

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
       SS_L_BO_READER_SEARCHDM dm = new SS_L_BO_READER_SEARCHDM();

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

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.selectBoReaderList(dm);
       req.setAttribute("ds", ds);      // request�� ������� ��´�.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {

           SSBrmgr1900EJB ejb = home.create();
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
       }*/
   }

   /**
    * ���� ����
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_S_BO_READERINFODataSet ds = null;

       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
       String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));

       //DM ���� Setting�Ѵ�.
       SS_S_BO_READERINFODM dm = new SS_S_BO_READERINFODM();

       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.selectBoReaderDetail(dm);
       req.setAttribute("ds", ds);      // request�� ������� ��´�.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {

           SSBrmgr1900EJB ejb = home.create();
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
       }*/
   }

   /**
    * ������ ������ ������ Set
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBoReaderInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
       SS_U_BO_READERINFO_ONEDataSet ds = null;

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
       SS_U_BO_READERINFO_ONEDM dm = new SS_U_BO_READERINFO_ONEDM();

       dm.setIncmgpers(incmgpers); //�Է»����ȣ
       dm.setRdr_no(rdr_no); //���ڹ�ȣ
       dm.setMedicd(medicd); //��ü�ڵ�
       dm.setTermsubsno(termsubsno); //���ⱸ����ȣ

       dm.setAcq_bocd(acq_bocd);       //�����������ڵ�
       dm.setSendmthd(sendmthd);
       dm.setDstccd(dstccd);
       dm.setDlvno(dlvno);
       dm.setBo_rdr_no(bo_rdr_no);

       SSBrmgr1900DAO dao = new SSBrmgr1900DAO();
       ds = dao.updateBoReaderInfo(dm);
       req.setAttribute("ds", ds); //request�� ������� ��´�.
       
       /*
       SSBrmgr1900EJBHome home = (SSBrmgr1900EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1900EJB");
       try {
           SSBrmgr1900EJB ejb = home.create();
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
       }*/
    }
}
