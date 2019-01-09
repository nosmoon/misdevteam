/***************************************************************************************************
* ���ϸ�   : PSSend1801WB.java
* ��  ��   : �߼�-���ʽ��Ϲ߼� �߼�ó�� �ڵ�� �ʱ�ȭ��
* �ۼ����� : 2004-02-29
* �ۼ���   : ���ȣ
****************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ��  ��   :
****************************************************************************************************/

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

public class PSSend1801WB{

   /**
    * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_S_SEND_BNSBKDataSet ds = null;

      //����� ��������
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�
      String flag   = "P";

      PS_S_SEND_BNSBKDM dm = new PS_S_SEND_BNSBKDM();      // DM ���� Setting�Ѵ�.

      dm.setCmpycd(cmpycd);
      dm.setFlag(flag);

      PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
      try{

         PSSend1801EJB ejb = home.create();
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
    * ���ʽ��Ϲ߼� �߼�ó�� ����Ÿ�� ��ȸ�Ѵ�
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBnsbkList(HttpServletRequest req, HttpServletResponse res) throws AppException{
      PS_L_SEND_BNSBK_CONDataSet ds = null;

      //����� ��������
      String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�
      String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

      String senddt = Util.checkString(req.getParameter("slt_senddt"));
      String asinbocd = Util.checkString(req.getParameter("slt_asinbocd"));
      String sendmthd = Util.checkString(req.getParameter("slt_sendmthd"));

      PS_L_SEND_BNSBK_CONDM  dm = new PS_L_SEND_BNSBK_CONDM ();      // DM ���� Setting�Ѵ�.

      dm.setCmpycd(cmpycd);
      dm.setIncmgpers(incmgpers);
      dm.setSenddt(senddt);
      dm.setAsinbocd(asinbocd);
      dm.setSendmthd(sendmthd);

      PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
      try{

         PSSend1801EJB ejb = home.create();

         ds = ejb.selectBnsbkList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
       * ���ʽ��Ϲ߼� �߼�ó�� �󼼳��� ����Ÿ�� ��ȸ�Ѵ�
       * ��ȸ�� request���� set�Ѵ�.
       * @param HttpServletRequest req
       * @param HttpServletResponse res
       * @return void
       **/
      public void selectBnsbkDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
         PS_L_SEND_BNSBK_CON_DTLDataSet ds = null;

         //����� ��������
         String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

         String senddt = Util.checkString(req.getParameter("senddt"));
         String asinbocd = Util.checkString(req.getParameter("asinbocd"));
         String sendmthd = Util.checkString(req.getParameter("sendmthd"));
         String curr_page_no = req.getParameter("curr_page_no"); // ����������
         String records_per_page = req.getParameter("records_per_page"); // �������� Row��

         int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
         int iPageNo = 1; // ���� ������ 1�� ����
         if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
             iPageNo = Integer.parseInt(curr_page_no);
         }

         PS_L_SEND_BNSBK_CON_DTLDM  dm = new PS_L_SEND_BNSBK_CON_DTLDM ();      // DM ���� Setting�Ѵ�.

         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);
         dm.setSenddt(senddt);
         dm.setAsinbocd(asinbocd);
         dm.setSendmthd(sendmthd);
         dm.setPageno(iPageNo);
         dm.setPagesize(iPageSize);

         PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
         try{

            PSSend1801EJB ejb = home.create();

            ds = ejb.selectBnsbkDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
       * ���ʽ��Ϲ߼� �߼�ó�� ������
       * ��ȸ�� request���� set�Ѵ�.
       * @param HttpServletRequest req
       * @param HttpServletResponse res
       * @return void
       **/
      public void printBnsbkSticker(HttpServletRequest req, HttpServletResponse res) throws AppException{
         PS_P_SEND_BNSBK_STICKERDataSet ds = null;

         //����� ��������
         String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);          //����ȸ���ڵ�
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

         String senddt = Util.checkString(req.getParameter("slt_senddt"));
         String asinbocd = Util.checkString(req.getParameter("slt_asinbocd"));
         String sendmthd = Util.checkString(req.getParameter("slt_sendmthd"));

         PS_P_SEND_BNSBK_STICKERDM  dm = new PS_P_SEND_BNSBK_STICKERDM ();      // DM ���� Setting�Ѵ�.

         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);
         dm.setSenddt(senddt);
         dm.setAsinbocd(asinbocd);
         dm.setSendmthd(sendmthd);

         PSSend1801EJBHome home = (PSSend1801EJBHome)JNDIManager.getInstance().getHome("PSSend1801EJB");
         try{

            PSSend1801EJB ejb = home.create();

            ds = ejb.printBnsbkSticker(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
