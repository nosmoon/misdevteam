/***************************************************************************************************
* ���ϸ� : SSExtn1800WB.java
* ��� : �����濵-���־���Ʈ��Ȳ�� ���� Worker Bean
* �ۼ����� : 2006-06-01
* �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

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
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �����濵-���־���Ʈ��Ȳ�� ���� WB
 */

public class SSExtn1800WB{

    /**
     * �����濵-���־���Ʈ��Ȳ-������Ȯ����Ȳ-�����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveinExtnList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SL_L_MOVEIN_EXTNDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String fromdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        String moveinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinyn")));
        String moveinteam = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinteam")));

        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SL_L_MOVEIN_EXTNDM dm = new SL_L_MOVEIN_EXTNDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setStafnm(stafnm);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
        dm.setMoveinyn(moveinyn);
        dm.setMoveinteam(moveinteam);

        
        SSExtn1800DAO dao = new SSExtn1800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.selectMoveinExtnList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

        try{
            SSExtn1800EJB ejb = home.create();
            ds = ejb.selectMoveinExtnList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * �����濵-���־���Ʈ��Ȳ-������Ȯ����Ȳ-��������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoveinExtnListPrint(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SL_L_MOVEIN_EXTN_PRINTDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String fromdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String moveinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinyn")));
        String moveinteam = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinteam")));

        SL_L_MOVEIN_EXTN_PRINTDM dm = new SL_L_MOVEIN_EXTN_PRINTDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setStafnm(stafnm);
        dm.setMoveinyn(moveinyn);
        dm.setMoveinteam(moveinteam);

        SSExtn1800DAO dao = new SSExtn1800DAO();
        // DAO ��ü�� initApt ȣ��
        ds = dao.selectMoveinExtnListPrint(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

        try{
            SSExtn1800EJB ejb = home.create();
            ds = ejb.selectMoveinExtnListPrint(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * �����濵-���־���Ʈ��Ȳ-���־���Ʈ-��ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
     public void selectMoveinAptList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SL_L_MOVEIN_APTDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String fromdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String moveinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinyn")));
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));

        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SL_L_MOVEIN_APTDM dm = new SL_L_MOVEIN_APTDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setMoveinyn(moveinyn);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSExtn1800DAO dao = new SSExtn1800DAO();
        // DAO ��ü�� initApt ȣ��
        ds = dao.selectMoveinAptList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

        try{
            SSExtn1800EJB ejb = home.create();
            ds = ejb.selectMoveinAptList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
      * �����濵-���־���Ʈ��Ȳ-���־���Ʈ-��������
      * @param req HttpServletRequest
      * @param res HttpServletResponse
      * @throws AppException
      **/
     public void selectMoveinAptPrint(HttpServletRequest req, HttpServletResponse res) throws AppException{

         SL_L_MOVEIN_APT_PRINTDataSet ds = null;

         //request process
         String deptcd = Util.checkString(req.getParameter("deptcd"));
         String partcd = Util.checkString(req.getParameter("partcd"));
         String areacd = Util.checkString(req.getParameter("areacd"));
         String bocd = Util.checkString(req.getParameter("bocd"));
         String fromdt = Util.checkString(req.getParameter("fromdt"));
         String todt = Util.checkString(req.getParameter("todt"));
         String moveinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinyn")));


         SL_L_MOVEIN_APT_PRINTDM dm = new SL_L_MOVEIN_APT_PRINTDM();
         dm.setDeptcd(deptcd);
         dm.setPartcd(partcd);
         dm.setAreacd(areacd);
         dm.setBocd(bocd);
         dm.setFromdt(fromdt);
         dm.setTodt(todt);
         dm.setMoveinyn(moveinyn);

         SSExtn1800DAO dao = new SSExtn1800DAO();
         // DAO ��ü�� initApt ȣ��
         ds = dao.selectMoveinAptPrint(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

         try{
             SSExtn1800EJB ejb = home.create();
             ds = ejb.selectMoveinAptPrint(dm);
             req.setAttribute("ds", ds);
         } catch(CreateException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         } catch(RemoteException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }*/
    }
     
     /**
      * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� �ʱ�ȭ��
      * @param req HttpServletRequest
      * @param res HttpServletResponse
      * @throws AppException
      **/
     public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SS_L_EXTN_APT_INITDataSet ds = null;

         //request process

         SS_L_EXTN_APT_INITDM dm = new SS_L_EXTN_APT_INITDM();

         SSExtn1800DAO dao = new SSExtn1800DAO();
         // DAO ��ü�� initApt ȣ��
         ds = dao.selectInitList(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

         try{
             SSExtn1800EJB ejb = home.create();
             ds = ejb.selectInitList(dm);
             req.setAttribute("ds", ds);
         } catch(CreateException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         } catch(RemoteException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }*/
     }
     
     /**
      * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ���� ���ε�
      * @param req HttpServletRequest
      * @param res HttpServletResponse
      * @throws AppException
      **/
     public void uploadExcel(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 
    	 String uid = Util.getSessionParameterValue(req, "uid", true);   //�Է��� ���̵�
    	 String aptnm = Util.checkString(req.getParameter("aptnm"));   
    	 String deptcd = Util.checkString(req.getParameter("deptcd"));
    	 String addr1 = Util.checkString(req.getParameter("addr1"));
    	 String addr2 = Util.checkString(req.getParameter("addr2"));
    	 String addr3 = Util.checkString(req.getParameter("addr3"));
    	 String tothoscnt = Util.checkString(req.getParameter("tothoscnt"));
    	 String pyong = Util.checkString(req.getParameter("pyong"));
    	 String pyongothin = Util.checkString(req.getParameter("pyongothin"));
    	 String hoscnt = Util.checkString(req.getParameter("hoscnt"));
    	 String saledd = Util.checkString(req.getParameter("saledd"));
    	 String mvinplandd = Util.checkString(req.getParameter("mvinplandd"));
    	 String constcmpynm = Util.checkString(req.getParameter("constcmpynm"));
    	 String apttype = Util.checkString(req.getParameter("apttype"));
    	 
    	 SS_I_EXTN_APT_UPLOADDataSet ds = null;

         //request process

    	 SS_I_EXTN_APT_UPLOADDM dm = new SS_I_EXTN_APT_UPLOADDM();
    	 dm.setUid(uid);
    	 dm.setAptnm(aptnm);
    	 dm.setDeptcd(deptcd);
    	 dm.setAddr1(addr1);
    	 dm.setAddr2(addr2);
    	 dm.setAddr3(addr3);
    	 dm.setTothoscnt(tothoscnt);
    	 dm.setPyong(pyong);
    	 dm.setPyongothin(pyongothin);
    	 dm.setHoscnt(hoscnt);
    	 dm.setSaledd(saledd);
    	 dm.setMvinplandd(mvinplandd);
    	 dm.setConstcmpynm(constcmpynm);
    	 dm.setApttype(apttype);

    	 SSExtn1800DAO dao = new SSExtn1800DAO();
         // DAO ��ü�� initApt ȣ��
         ds = dao.uploadExcel(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

         try{
             SSExtn1800EJB ejb = home.create();
             ds = ejb.uploadExcel(dm);
             req.setAttribute("ds", ds);
         } catch(CreateException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         } catch(RemoteException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }*/
     }
     
     /**
      * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ��ȸ
      * @param req HttpServletRequest
      * @param res HttpServletResponse
      * @throws AppException
      **/
     public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 
    	 String uid = Util.getSessionParameterValue(req, "uid", true);   //�Է��� ���̵�
    	 String yyyy = Util.checkString(req.getParameter("yyyy"));
    	 String aptnm = Util.checkString(req.getParameter("aptnm"));
    	 String addr1 = Util.checkString(req.getParameter("addr1"));
    	 String addr2 = Util.checkString(req.getParameter("addr2"));
    	 
    	 SS_L_EXTN_APTDataSet ds = null;

         //request process
    	 SS_L_EXTN_APTDM dm = new SS_L_EXTN_APTDM();
    	 dm.setUid(uid);
    	 dm.setYyyy(yyyy);
    	 dm.setAptnm(aptnm);
    	 dm.setAddr1(addr1);
    	 dm.setAddr2(addr2);

    	 SSExtn1800DAO dao = new SSExtn1800DAO();
         // DAO ��ü�� initApt ȣ��
         ds = dao.selectList(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

         try{
             SSExtn1800EJB ejb = home.create();
             ds = ejb.selectList(dm);
             req.setAttribute("ds", ds);
         } catch(CreateException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         } catch(RemoteException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }*/
     }
     
     /**
      * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ����
      * @param req HttpServletRequest
      * @param res HttpServletResponse
      * @throws AppException
      **/
     public void apprList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 
    	 String uid = Util.getSessionParameterValue(req, "uid", true);   //�Է��� ���̵�
    	 String aptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aptcd")));
    	 String aptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aptnm")));
    	 String addr1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1")));
    	 String addr2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2")));
    	 String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
    	 String tothoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("tothoscnt")));
    	 String pyong = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong")));
    	 String pyongothin = Util.Uni2Ksc(Util.checkString(req.getParameter("pyongothin")));
    	 String hoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt")));
    	 String saledd = Util.Uni2Ksc(Util.checkString(req.getParameter("saledd")));
    	 String mvinplandd = Util.Uni2Ksc(Util.checkString(req.getParameter("mvinplandd")));
    	 String constcmpynm = Util.Uni2Ksc(Util.checkString(req.getParameter("constcmpynm")));
    	 String apttype = Util.Uni2Ksc(Util.checkString(req.getParameter("apttype")));
    	 String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	 String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	 String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	 String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	 
    	 SS_U_EXTN_APT_APPRDataSet ds = null;

         //request process
    	 SS_U_EXTN_APT_APPRDM dm = new SS_U_EXTN_APT_APPRDM();
    	 dm.setUid(uid);
    	 dm.setAptcd(aptcd);
    	 dm.setAptnm(aptnm);
    	 dm.setAddr1(addr1);
    	 dm.setAddr2(addr2);
    	 dm.setAddr3(addr3);
    	 dm.setTothoscnt(tothoscnt);
    	 dm.setPyong(pyong);
    	 dm.setPyongothin(pyongothin);
    	 dm.setHoscnt(hoscnt);
    	 dm.setSaledd(saledd);
    	 dm.setMvinplandd(mvinplandd);
    	 dm.setConstcmpynm(constcmpynm);
    	 dm.setApttype(apttype);
    	 dm.setDeptcd(deptcd);
    	 dm.setPartcd(partcd);
    	 dm.setAreacd(areacd);
    	 dm.setBocd(bocd);

    	 SSExtn1800DAO dao = new SSExtn1800DAO();
         // DAO ��ü�� initApt ȣ��
         ds = dao.apprList(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

         try{
             SSExtn1800EJB ejb = home.create();
             ds = ejb.apprList(dm);
             req.setAttribute("ds", ds);
         } catch(CreateException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         } catch(RemoteException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }*/
     } 
     
     /**
      * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� �������
      * @param req HttpServletRequest
      * @param res HttpServletResponse
      * @throws AppException
      **/
     public void cancelList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 
    	 String uid = Util.getSessionParameterValue(req, "uid", true);   //�Է��� ���̵�
    	 String aptcd = Util.checkString(req.getParameter("aptcd"));
    	 
    	 SS_U_EXTN_APT_CANCELDataSet ds = null;

         //request process
    	 SS_U_EXTN_APT_CANCELDM dm = new SS_U_EXTN_APT_CANCELDM();
    	 dm.setUid(uid);
    	 dm.setAptcd(aptcd);

    	 SSExtn1800DAO dao = new SSExtn1800DAO();
         // DAO ��ü�� initApt ȣ��
         ds = dao.cancelList(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

         try{
             SSExtn1800EJB ejb = home.create();
             ds = ejb.cancelList(dm);
             req.setAttribute("ds", ds);
         } catch(CreateException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         } catch(RemoteException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }*/
     }
     
     /**
      * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ����(����)
      * @param req HttpServletRequest
      * @param res HttpServletResponse
      * @throws AppException
      **/
     public void updateList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 
    	 String uid = Util.getSessionParameterValue(req, "uid", true);   //�Է��� ���̵�
    	 String aptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aptcd")));
    	 String aptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aptnm")));
    	 String addr1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1")));
    	 String addr2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2")));
    	 String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
    	 String tothoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("tothoscnt")));
    	 String pyong = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong")));
    	 String pyongothin = Util.Uni2Ksc(Util.checkString(req.getParameter("pyongothin")));
    	 String hoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt")));
    	 String saledd = Util.Uni2Ksc(Util.checkString(req.getParameter("saledd")));
    	 String mvinplandd = Util.Uni2Ksc(Util.checkString(req.getParameter("mvinplandd")));
    	 String constcmpynm = Util.Uni2Ksc(Util.checkString(req.getParameter("constcmpynm")));
    	 String apttype = Util.Uni2Ksc(Util.checkString(req.getParameter("apttype")));
    	 String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	 String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	 String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	 String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	 
    	 SS_U_EXTN_APTDataSet ds = null;

         //request process
    	 SS_U_EXTN_APTDM dm = new SS_U_EXTN_APTDM();
    	 dm.setUid(uid);
    	 dm.setAptcd(aptcd);
    	 dm.setAptnm(aptnm);
    	 dm.setAddr1(addr1);
    	 dm.setAddr2(addr2);
    	 dm.setAddr3(addr3);
    	 dm.setTothoscnt(tothoscnt);
    	 dm.setPyong(pyong);
    	 dm.setPyongothin(pyongothin);
    	 dm.setHoscnt(hoscnt);
    	 dm.setSaledd(saledd);
    	 dm.setMvinplandd(mvinplandd);
    	 dm.setConstcmpynm(constcmpynm);
    	 dm.setApttype(apttype);
    	 dm.setDeptcd(deptcd);
    	 dm.setPartcd(partcd);
    	 dm.setAreacd(areacd);
    	 dm.setBocd(bocd);

    	 
    	 SSExtn1800DAO dao = new SSExtn1800DAO();
         // DAO ��ü�� initApt ȣ��
         ds = dao.updateList(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1800EJBHome home = (SSExtn1800EJBHome)JNDIManager.getInstance().getHome("SSExtn1800EJB");

         try{
             SSExtn1800EJB ejb = home.create();
             ds = ejb.updateList(dm);
             req.setAttribute("ds", ds);
         } catch(CreateException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         } catch(RemoteException e){
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw se;
         }*/
     } 
}

