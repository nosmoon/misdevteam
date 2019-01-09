/***************************************************************************************************
 * ���ϸ�   : PSAllow1701WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ� EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2004-01-14
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.allow.ejb.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;

/**
 * ����-ķ���ΰ���
 */
public class PSAllow1701WB{

    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
      */
     public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
         PS_S_EMP_ALON_BASEDataSet ds = null;

         //�α��� ����� ��������
         String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

         PS_S_EMP_ALON_BASEDM dm = new PS_S_EMP_ALON_BASEDM();      // DM ���� Setting�Ѵ�.

         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);

         PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
         try{

             PSAllow1701EJB ejb = home.create();

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
     * ķ���� ������ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void insertCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_I_BO_CMPDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                           //���������ڵ�
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));                           //ķ���θ�
        String bgncampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgncampdt")));                     //ķ���ν�������
        String endcampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("endcampdt")));                     //ķ������������
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));                               //����

        //DM ���� Setting�Ѵ�.
        PS_I_BO_CMPDM dm = new PS_I_BO_CMPDM();

        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�Է»����ȣ
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setCampnm(campnm);                                                                                 //ķ���θ�
        dm.setBgncampdt(bgncampdt);                                                                           //ķ���ν�������
        dm.setEndcampdt(endcampdt);                                                                           //ķ������������
        dm.setCont(cont);                                                                                     //����

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.insertCampAlon(dm);                // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                 // request�� ������� ��´�.
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
     * ķ���� �˻��� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_CAMP_SEARCHDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_asinbocd")));                           //���������ڵ�
        String sh_bgncampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_bgncampdt")));               //ķ���ν�������
        String sh_endcampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_endcampdt")));               //ķ������������
        String sh_campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_campnm")));                     //ķ���θ�
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "15";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        PS_L_CAMP_SEARCHDM dm = new PS_L_CAMP_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                   //���������ڵ�
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setSh_bgncampdt(sh_bgncampdt);                                                                     //ķ���ν�������
        dm.setSh_endcampdt(sh_endcampdt);                                                                     //ķ������������
        dm.setSh_campnm(sh_campnm);                                                                           //ķ���θ�
        dm.setPageno(pageno);                                                                                 //����������
        dm.setPagesize(pagesize);                                                                             //�������� ������ �Ǽ�

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.selectCampAlon(dm);                // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                 // request�� ������� ��´�.
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
     * ķ���� ������ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void deleteCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_D_CAMP_PTCRDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String checkcntstr = Util.checkString(req.getParameter("checkcnt"));                                  //�� ���ڵ� ī��Ʈ
        if (checkcntstr.equals(""))   checkcntstr = "0";
        long   checkcnt = Long.parseLong(checkcntstr);
        StringBuffer campseqarr = new StringBuffer("");                                                       //���,�������� Array
        StringBuffer campbocdarr = new StringBuffer("");                                                      //�������� Array

        //ķ�����Ϸù�ȣ String Array�� ����
        for (int i=0 ; i < checkcnt ; i++) {
            campseqarr.append("##");                                                                          //������+
            campseqarr.append(Util.checkString(req.getParameter("camp_check"+i)));                            //ķ�����Ϸù�ȣ+
            campbocdarr.append("##");                                                                          //������+
            campbocdarr.append(Util.checkString(req.getParameter("camp_bocd"+i)));                            //��������+

        }

        campseqarr.delete(0,2);          //ó�� ## ����
        campbocdarr.delete(0,2);         //ó�� ## ����

        //DM ���� Setting�Ѵ�.
        PS_D_CAMP_PTCRDM dm = new PS_D_CAMP_PTCRDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setCambocdarr(campbocdarr.toString());
        dm.setCampseqarr(campseqarr.toString());

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.deleteCampAlon(dm);                // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                 // request�� ������� ��´�.
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
     * ķ���� �󼼳��� ������ ���ϱ� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCampaign(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_S_CAMPAIGNDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                         //���������ڵ�
        String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));                         //ķ�����Ϸù�ȣ

        //DM ���� Setting�Ѵ�.
        PS_S_CAMPAIGNDM dm = new PS_S_CAMPAIGNDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);                                                                           //�Է»����ȣ
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setCampseq(campseq);                                                                               //ķ�����Ϸù�ȣ

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.selectCampaign(dm);                // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                 // request�� ������� ��´�.
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
     * ���ķ���� ���� �˻��� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectEmpCampaign(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_EMPCAMP_SEARCHDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                              //���������ڵ�
        String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));                         //ķ�����Ϸù�ȣ
        String sh_boemp_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_boemp_no1")));               //�˻������ȣ1
        String sh_boemp_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_boemp_no2")));               //�˻������ȣ2
        String sh_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));                        //�˻��μ��ڵ�
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "10";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        PS_L_EMPCAMP_SEARCHDM dm = new PS_L_EMPCAMP_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //����ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�Է»����ȣ
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setCampseq(campseq);                                                                               //ķ�����Ϸù�ȣ
        dm.setSh_boemp_no1(sh_boemp_no1);                                                                     //�˻������ȣ1
        dm.setSh_boemp_no2(sh_boemp_no2);                                                                     //�˻������ȣ2
        dm.setSh_deptcd(sh_deptcd);                                                                           //�˻��μ��ڵ�
        dm.setPageno(pageno);                                                                                 //����������
        dm.setPagesize(pagesize);                                                                             //�������� ������ �Ǽ�

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.selectEmpCampaign(dm);                // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                 // request�� ������� ��´�.
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
     * ���ķ���� ���� ����� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void insertEmpCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_A_EMPCAMP_ALONDataSet ds = null;

        //�α��� ����� ��������
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //����ȸ���ڵ�
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                              //���������ڵ�
        String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));                         //ķ�����Ϸù�ȣ

        String checkcntstr = Util.checkString(req.getParameter("checkcnt"));                                  //�� ���ڵ� ī��Ʈ
        if (checkcntstr.equals(""))   checkcntstr = "0";
        long   checkcnt = Long.parseLong(checkcntstr);

        StringBuffer boemparr = new StringBuffer("");                                                    //���,ķ���μ��� Array
        StringBuffer bocdarr = new StringBuffer("");                                                     //���,ķ���μ��� Array
        StringBuffer amtarr = new StringBuffer("");                                                      //���,ķ���μ��� Array

        //ķ�����Ϸù�ȣ String Array�� ����
        for (int i=0 ; i < checkcnt ; i++) {
            boemparr.append("##");                                                                       //������+
            boemparr.append(Util.checkString(req.getParameter("keyboemp_no"+i)));                        //������������ȣ+
            amtarr.append("##");                                                                         //������+
            amtarr.append(Util.checkString(req.getParameter("amt"+i)));                                  //ķ���μ��� �Ǵ�ݾ�+
            bocdarr.append("##");                                                                        //������+
            bocdarr.append(Util.checkString(req.getParameter("keybocd_no"+i)));                          //���������ڵ�+
        }

        boemparr.delete(0,2);          //ó�� ## ����
        amtarr.delete(0,2);            //ó�� ## ����
        bocdarr.delete(0,2);           //ó�� ## ����

        //DM ���� Setting�Ѵ�.
        PS_A_EMPCAMP_ALONDM dm = new PS_A_EMPCAMP_ALONDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);                                                                           //�Է»����ȣ
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setCampseq(campseq);                                                                               //ķ�����Ϸù�ȣ
        dm.setBoemparr(boemparr.toString());                                                      //�����ķ���μ���迭
        dm.setBocdarr(bocdarr.toString());                                                      //�����ķ���μ���迭
        dm.setAmtarr(amtarr.toString());                                                      //�����ķ���μ���迭

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.insertEmpCampAlon(dm);                // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                 // request�� ������� ��´�.
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
