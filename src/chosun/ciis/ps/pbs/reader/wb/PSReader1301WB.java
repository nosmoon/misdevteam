/***************************************************************************************************
* ���ϸ�   : PSReader1301WB.java
* ��  ��   : ����-�����û �ڵ�� �ʱ�ȭ��
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

public class PSReader1301WB{

   /**
    * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_S_RDR_ARBTDataSet ds = null;

      //����� ��������
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

      PS_S_RDR_ARBTDM dm = new PS_S_RDR_ARBTDM();      // DM ���� Setting�Ѵ�.

      dm.setCmpycd(cmpycd);

      PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
      try{

         PSReader1301EJB ejb = home.create();
         ds = ejb.selectCodeList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         req.setAttribute("ds", ds); // request�� ������� ��´�.
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

   /**
    * �����û ����Ÿ�� ��ȸ�Ѵ�
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectArbtList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_RDR_ARBTDataSet ds = null;

      //����� ��������
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

      String bocd = Util.checkString(req.getParameter("bocd"));
      String aprvproccd = Util.checkString(req.getParameter("slt_aprvproccd"));
      String arbtaplcdtfr = Util.checkString(req.getParameter("arbtaplcdtfr"));
      String arbtaplcdtto = Util.checkString(req.getParameter("arbtaplcdtto"));
      String curr_page_no = req.getParameter("curr_page_no"); // ����������
      String records_per_page = req.getParameter("records_per_page"); // �������� Row��

      int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
      int iPageNo = 1; // ���� ������ 1�� ����
      if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
          iPageNo = Integer.parseInt(curr_page_no);
      }

      PS_L_RDR_ARBTDM  dm = new PS_L_RDR_ARBTDM ();      // DM ���� Setting�Ѵ�.

      dm.setCmpycd(cmpycd);
      dm.setBocd(bocd);
      dm.setAprvproccd(aprvproccd);
      dm.setArbtaplcdtfr(arbtaplcdtfr);
      dm.setArbtaplcdtto(arbtaplcdtto);
      dm.setPageno(iPageNo);
      dm.setPagesize(iPageSize);

      PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
      try{

         PSReader1301EJB ejb = home.create();

         ds = ejb.selectArbtList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

         req.setAttribute("ds", ds); // request�� ������� ��´�.
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

   /**
    * �����û ���峻���� �����Ѵ�
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
     public void updateArbt(HttpServletRequest req, HttpServletResponse res) throws AppException {
         boolean bResult = false;
         String sResult = "false"; // request�� ��ȯ�� String Type �����

         //�α��� ����� ��������
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);      //����ȸ���ڵ�
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

         String arbtno =  Util.checkString(req.getParameter("all_arbtno"));
         String arbtaplcdt = Util.checkString(req.getParameter("all_arbtaplcdt"));
         String aprvproccd =  Util.checkString(req.getParameter("all_aprvproccd"));
         String arbtprocresn = Util.Uni2Ksc(Util.checkString(req.getParameter("all_arbtprocresn")));

         PS_U_RDR_ARBTDM dm = new PS_U_RDR_ARBTDM();
         //dm�� ���� Setting�Ѵ�.
         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);
         dm.setArbtno(arbtno);
         dm.setArbtaplcdt(arbtaplcdt);
         dm.setAprvproccd(aprvproccd);
         dm.setArbtprocresn(arbtprocresn);

         PSReader1301EJBHome home = (PSReader1301EJBHome) JNDIManager.getInstance().getHome("PSReader1301EJB");

         try {
             PSReader1301EJB ejb = home.create();

             bResult = ejb.updateArbt(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
      * �����û �񱳴���� ����Ÿ�� ��ȸ�Ѵ�
      * ��ȸ�� request���� set�Ѵ�.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @return void
      **/
     public void selectArbtCmprobjList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_ARBT_CMPROBJDataSet ds = null;

        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�

        String arbtno = Util.checkString(req.getParameter("arbtno"));
        String arbtaplcdt = Util.checkString(req.getParameter("arbtaplcdt"));

        PS_L_ARBT_CMPROBJDM  dm = new PS_L_ARBT_CMPROBJDM ();      // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setArbtno(arbtno);
        dm.setArbtaplcdt(arbtaplcdt);

        PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
        try{

           PSReader1301EJB ejb = home.create();
           ds = ejb.selectArbtCmprobjList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

           req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     /**
      * �����û �񱳴���� �󼼳��� ����Ÿ�� ��ȸ�Ѵ�
      * ��ȸ�� request���� set�Ѵ�.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @return void
      **/
     public void selectCmprobjDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_S_RDR_CMPROBJDataSet ds = null;

        //����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�
        
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));

        PS_S_RDR_CMPROBJDM  dm = new PS_S_RDR_CMPROBJDM ();      // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);

        PSReader1301EJBHome home = (PSReader1301EJBHome)JNDIManager.getInstance().getHome("PSReader1301EJB");
        try{

           PSReader1301EJB ejb = home.create();
           ds = ejb.selectCmprobjDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

           req.setAttribute("ds", ds); // request�� ������� ��´�.
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
/***************************************************************************************************
* ������     :
* �������ڵ� :
****************************************************************************************************/
