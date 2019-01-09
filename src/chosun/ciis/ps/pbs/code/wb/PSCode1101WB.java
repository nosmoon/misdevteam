/*****************************************************
 * ���ϸ�   : PSCode1101WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-02-20
 * �ۼ���   : ���ȯ
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
 *  ���Ǳ� �ڵ�-���ົ �ڱװ���ó�� WorkBean
 */
public class PSCode1101WB{


    /**
     * ���ົ �ڵ����ȭ���� �ʱ�ȭ��Ű��.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectCombolist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEPBK_CODEDataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

        PS_S_SEPBK_CODEDM dm = new PS_S_SEPBK_CODEDM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);

        PSCode1101EJBHome home = (PSCode1101EJBHome) JNDIManager.getInstance().getHome("PSCode1101EJB");
        try {
            PSCode1101EJB ejb = home.create();
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
     * ���ົ �ڵ� �󼼳����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectSepbkDtl(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEPBK_INFODataSet ds = null;

        //����� ��������
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

        String sep_bookcd = Util.checkString(req.getParameter("sep_bookcd"));

        PS_S_SEPBK_INFODM dm = new PS_S_SEPBK_INFODM();
        //dm�� ���� Setting�Ѵ�.
        dm.setCmpycd(cmpycd);
        dm.setSep_bookcd(sep_bookcd);

        PSCode1101EJBHome home = (PSCode1101EJBHome) JNDIManager.getInstance().getHome("PSCode1101EJB");
        try {
            PSCode1101EJB ejb = home.create();
            ds = ejb.selectSepbkDtl(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
    * ȸ�纰 ���ົ��� ������ ��ȸ�Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectList(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      PS_L_SEPBK_CODEDataSet ds = null;
      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�
      String medicd = Util.checkString(req.getParameter("medicd"));
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));
      String sep_bookcdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcdnm")));
      String pageno = Util.checkString(req.getParameter("pageno"));
      String pagesize = Util.checkString(req.getParameter("pagesize"));

      String sPageNo     = req.getParameter("curr_page_no"); // ����������
      int iPageSize      = 5000; // �������� Row�� �ϴ� 10����
      int iPageNo        = 1;    // ���� ������ 1�� ����
      if(sPageNo != null && !sPageNo.equals("")){ // ������ ���� ������ �缳��
         iPageNo = Integer.parseInt(sPageNo);
      }
      if(mediser_no == null || mediser_no.equals("")){
         mediser_no = "ALL";
      }
      if(sep_bookcdnm == null || sep_bookcdnm.equals("")){
         sep_bookcdnm = "ALL";
      }
      PS_L_SEPBK_CODEDM dm = new PS_L_SEPBK_CODEDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      dm.setSep_booknm(sep_bookcdnm);
      dm.setPageno(iPageNo);
      dm.setPagesize(iPageSize);
      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");
      try{
         PSCode1101EJB ejb = home.create();
         ds = ejb.selectList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         req.setAttribute("ds", ds); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

   /**
    * ���ົ �ڵ峻���� �Է��Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void insertSepbkCode(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request�� ��ȯ�� String Type �����

      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
      String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

      String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));				    //��ü�ڵ�
      String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));		    //��üȣ��
      String sep_bookcdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcdnm")));		//���ົ�ڵ��
      String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));		        //���ົ�ڵ�з�
      String issuclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issuclsf")));				//���౸��(ȸ���ڵ�)
      String basiyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basiyymm")));				//���س��
      String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));					    //�ܰ�
      String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));				//�����ܰ�
      String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));					//����
      String contclascd = Util.Uni2Ksc(Util.checkString(req.getParameter("contclascd")));			//����з��ڵ�
      String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));                   //����
      String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));					    //����
      String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));						    //�԰�
      String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));			            //�ʼ�
      String covermodl = Util.Uni2Ksc(Util.checkString(req.getParameter("covermodl")));	            //ǥ����
      String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));					//�������
      String extdtms = Util.Uni2Ksc(Util.checkString(req.getParameter("extdtms")));	                //����Ƚ��
      String absenceyn = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceyn")));				//���ǿ���
      String absencedt = Util.Uni2Ksc(Util.checkString(req.getParameter("absencedt")));				//��������
      String absenceprocdt =Util.Uni2Ksc(Util.checkString(req.getParameter("absenceprocdt")));		//����ó������
      String bundunit = Util.Uni2Ksc(Util.checkString(req.getParameter("bundunit")));				//��ġ����
      String unitmidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("unitmidlqunt")));		//�����߷�
      String pjbasimidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("pjbasimidlqunt")));	//���������߷�
      String sericd = Util.Uni2Ksc(Util.checkString(req.getParameter("sericd")));		            //�ø����ڵ�
      String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));		                //MEMO

      //�ܰ� String to Integer
      int iUprc =0;
      if(uprc != null && !uprc.equals("")){ //
         iUprc = Integer.parseInt(uprc);
      }
      //�����ܰ� String to Integer
      int iSubsuprc =0;
      if(subsuprc != null && !subsuprc.equals("")){ //
         iSubsuprc = Integer.parseInt(subsuprc);
      }
      //���� String to Integer
      int iDcrate =0;
      if(dcrate != null && !dcrate.equals("")){ //
         iDcrate = Integer.parseInt(dcrate);
      }
      //�ʼ� String to Integer
      int iPage =0;
      if(page != null && !page.equals("")){ //
         iPage = Integer.parseInt(page);
      }
      //����Ƚ�� String to Integer
      int iExtdtms =0;
      if(extdtms != null && !extdtms.equals("")){ //
         iExtdtms = Integer.parseInt(extdtms);
      }
      //��ġ���� String to Integer
      int iBundunit =0;
      if(bundunit != null && !bundunit.equals("")){ //
         iBundunit = Integer.parseInt(bundunit);
      }
      //�����߷� String to Integer
      int iUnitmidlqunt =0;
      if(unitmidlqunt != null && !unitmidlqunt.equals("")){ //
         iUnitmidlqunt = Integer.parseInt(unitmidlqunt);
      }
      //���������߷� String to Integer
      int iPjbasimidlqunt =0;
      if(pjbasimidlqunt != null && !pjbasimidlqunt.equals("")){ //
         iPjbasimidlqunt = Integer.parseInt(pjbasimidlqunt);
      }


      PS_I_SEPBK_CODEDM dm = new PS_I_SEPBK_CODEDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setIncmgpers(incmgpers);
      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      dm.setMedi_clsf(medi_clsf);
      dm.setSep_bookcdnm(sep_bookcdnm);
      dm.setIssuclsf(issuclsf);
      dm.setBasiyymm(basiyymm);
      dm.setUprc(iUprc);
      dm.setSubsuprc(iSubsuprc);
      dm.setDcrate(iDcrate);
      dm.setContclascd(contclascd);
      dm.setAuthor(author);
      dm.setType(type);
      dm.setStd(std);
      dm.setPage(iPage);
      dm.setCovermodl(covermodl);
      dm.setReg_dt(reg_dt);
      dm.setExtdtms(iExtdtms);
      dm.setAbsenceyn(absenceyn);
      dm.setAbsencedt(absencedt);
      dm.setAbsenceprocdt(absenceprocdt);
      dm.setBundunit(iBundunit);
      dm.setUnitmidlqunt(iUnitmidlqunt);
      dm.setPjbasimidlqunt(iPjbasimidlqunt);
      dm.setSericd(sericd);
      dm.setMemo(memo);


      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");

      try{
         PSCode1101EJB ejb = home.create();

         bResult = ejb.insertSepbkCode(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }

         req.setAttribute("result", sResult); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

   /**
    * ���ົ �ڵ峻���� �����Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void updateSepbkCode(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request�� ��ȯ�� String Type �����

      //����� ��������
      String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        //ȸ���ڵ�
      String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

      String sep_bookcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcd")));			//���ົ�ڵ�
      String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));				    //��ü�ڵ�
      String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));		    //��üȣ��
      String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));		        //���ົ�ڵ�з�
      String sep_bookcdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcdnm")));		//���ົ�ڵ��
      String issuclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issuclsf")));				//���౸��(ȸ���ڵ�)
      String basiyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basiyymm")));				//���س��
      String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));					    //�ܰ�
      String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));				//�����ܰ�
      String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));					//����
      String contclascd = Util.Uni2Ksc(Util.checkString(req.getParameter("contclascd")));			//����з��ڵ�
      String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));		            //����
      String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));					    //����
      String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));						    //�԰�
      String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));			            //�ʼ�
      String covermodl = Util.Uni2Ksc(Util.checkString(req.getParameter("covermodl")));	            //ǥ����
      String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));					//�������
      String extdtms = Util.Uni2Ksc(Util.checkString(req.getParameter("extdtms")));	                //����Ƚ��
      String absenceyn = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceyn")));				//���ǿ���
      String absencedt = Util.Uni2Ksc(Util.checkString(req.getParameter("absencedt")));				//��������
      String absenceprocdt = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceprocdt")));		//����ó������
      String bundunit = Util.Uni2Ksc(Util.checkString(req.getParameter("bundunit")));				//��ġ����
      String unitmidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("unitmidlqunt")));		//�����߷�
      String pjbasimidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("pjbasimidlqunt")));	//���������߷�
      String sericd =Util.Uni2Ksc(Util.checkString(req.getParameter("sericd")));		            //�ø����ڵ�
      String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));		                //MEMO

      //�ܰ� String to Integer
      int iUprc =0;
      if(uprc != null && !uprc.equals("")){ //
         iUprc = Integer.parseInt(uprc);
      }
      //�����ܰ� String to Integer
      int iSubsuprc =0;
      if(subsuprc != null && !subsuprc.equals("")){ //
         iSubsuprc = Integer.parseInt(subsuprc);
      }
      //���� String to Integer
      int iDcrate =0;
      if(dcrate != null && !dcrate.equals("")){ //
         iDcrate = Integer.parseInt(dcrate);
      }
      //�ʼ� String to Integer
      int iPage =0;
      if(page != null && !page.equals("")){ //
         iPage = Integer.parseInt(page);
      }
      //����Ƚ�� String to Integer
      int iExtdtms =0;
      if(extdtms != null && !extdtms.equals("")){ //
         iExtdtms = Integer.parseInt(extdtms);
      }
      //��ġ���� String to Integer
      int iBundunit =0;
      if(bundunit != null && !bundunit.equals("")){ //
         iBundunit = Integer.parseInt(bundunit);
      }
      //�����߷� String to Integer
      int iUnitmidlqunt =0;
      if(unitmidlqunt != null && !unitmidlqunt.equals("")){ //
         iUnitmidlqunt = Integer.parseInt(unitmidlqunt);
      }
      //���������߷� String to Integer
      int iPjbasimidlqunt =0;
      if(pjbasimidlqunt != null && !pjbasimidlqunt.equals("")){ //
         iPjbasimidlqunt = Integer.parseInt(pjbasimidlqunt);
      }

      PS_U_SEPBK_CODEDM dm = new PS_U_SEPBK_CODEDM();
      //dm�� ���� Setting�Ѵ�.
      dm.setCmpycd(cmpycd);
      dm.setChgpers(incmgpers);
      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      dm.setMedi_clsf(medi_clsf);
      dm.setSep_bookcdnm(sep_bookcdnm);
      dm.setIssuclsf(issuclsf);
      dm.setBasiyymm(basiyymm);
      dm.setUprc(iUprc);
      dm.setSubsuprc(iSubsuprc);
      dm.setDcrate(iDcrate);
      dm.setContclascd(contclascd);
      dm.setAuthor(author);
      dm.setType(type);
      dm.setStd(std);
      dm.setPage(iPage);
      dm.setCovermodl(covermodl);
      dm.setReg_dt(reg_dt);
      dm.setExtdtms(iExtdtms);
      dm.setAbsenceyn(absenceyn);
      dm.setAbsencedt(absencedt);
      dm.setAbsenceprocdt(absenceprocdt);
      dm.setBundunit(iBundunit);
      dm.setUnitmidlqunt(iUnitmidlqunt);
      dm.setPjbasimidlqunt(iPjbasimidlqunt);
      dm.setSericd(sericd);
      dm.setMemo(memo);

      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");

      try{
         PSCode1101EJB ejb = home.create();
         bResult = ejb.updateSepbkCode(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

   /**
    * ���ົ �ڵ峻���� �����Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void deleteSepbkCode(HttpServletRequest req, HttpServletResponse res) throws
       AppException{
      boolean bResult = false;
      String sResult = "false"; // request�� ��ȯ�� String Type �����

      //����� ��������
      String bocd      = Util.getSessionParameterValue(req, "cmpycd", true);        //ȸ���ڵ�
      String incmgpers = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

      String medicd = Util.checkString(req.getParameter("medicd"));				                    //��ü�ڵ�
      String mediser_no = Util.checkString(req.getParameter("mediser_no"));		                    //��üȣ��

      PS_D_SEPBK_CODEDM dm = new PS_D_SEPBK_CODEDM();
      //dm�� ���� Setting�Ѵ�.

      dm.setMedicd(medicd);
      dm.setMediser_no(mediser_no);
      PSCode1101EJBHome home = (PSCode1101EJBHome)JNDIManager.getInstance().getHome("PSCode1101EJB");

      try{
         PSCode1101EJB ejb = home.create();

         bResult = ejb.deleteSepbkCode(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
         if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request�� ������� ��´�.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }
   }

}