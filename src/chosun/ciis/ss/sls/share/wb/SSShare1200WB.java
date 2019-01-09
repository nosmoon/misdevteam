/***************************************************************************************************
* ���ϸ� : SSShare1200WB.java
* ��� : ��������-�ǽð� ���� �������� ó���� ���� Work Bean
* �ۼ����� : 2003-12-02
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/
package chosun.ciis.ss.sls.share.wb;

import javax.ejb.*;

import java.rmi.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.dao.*;


/**
 * ��������-�ǽð������������� ���� WB
 *
 */

public class SSShare1200WB{

	/**
     * ��������-�ǽð�������������-�ʱ�ȭ��
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_ANNCBO_INITDataSet ds = null;
        // Request Parameter Processing
        String clsf = "1";    //�Խ��Ǳ��� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
        String sb_areacd = Util.getSessionParameterValue(req, "areacd", true); 	//���������ڵ�(����)
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", true); 	//�����μ��ڵ�(����)

        // DM Setting
        SS_L_ANNCBO_INITDM dm = new SS_L_ANNCBO_INITDM();

        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();         
            ds = ejb.selectInitList(dm);
            req.setAttribute("ds", ds);
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
     * ��������-�ǽð�������������-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_ANNCBODataSet ds = null;
        // Request Parameter Processing
        String clsf = "1";    //�Խ��Ǳ��� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
        String uid = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
        String jobcd = ""; // ���������ڵ�
        String makepersid = Util.getSessionParameterValue(req, "uid", true);       //����� ���̵�
        String makepersnm = Util.getSessionParameterValue(req, "emp_nm", false);    //����� �̸�
        String posicd = Util.getSessionParameterValue(req, "posicd", false);        //����� ��å �ڵ�
        String posinm = Util.getSessionParameterValue(req, "posinm", false);        //����� ��å �̸�
                
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));	//�˻���
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));	//�˻�����        
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ� 
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm"));  //�������۽ð�
        String anncendtm = Util.checkString(req.getParameter("anncendtm"));  //��������ð�        
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "5000"; }

        // DM Setting
        SS_L_ANNCBODM dm = new SS_L_ANNCBODM();
        dm.setUid(uid);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setMakepersnm(makepersnm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setSearch_word(search_word);
        dm.setSearch_word_kind(search_word_kind);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
              
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO ��ü�� selectSrchList ȣ��
		ds = dao.selectSrchList(dm);
		req.setAttribute("uid", uid);
        req.setAttribute("deptcd", deptcd);
        req.setAttribute("areacd", areacd);
        req.setAttribute("makepersnm", makepersnm);
        req.setAttribute("anncbgntm", anncbgntm);
        req.setAttribute("anncbgntm", anncbgntm);
        req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("pageno", pageno);
        req.setAttribute("pagesize", pagesize);
        req.setAttribute("ds", ds);
        
        /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();
            ds = ejb.selectSrchList(dm);
            req.setAttribute("uid", uid);
            req.setAttribute("deptcd", deptcd);
            req.setAttribute("areacd", areacd);
            req.setAttribute("makepersnm", makepersnm);
            req.setAttribute("anncbgntm", anncbgntm);
            req.setAttribute("anncbgntm", anncbgntm);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
            req.setAttribute("ds", ds);
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
     * ��������-�ǽð�������������-�۾�����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        // Request Parameter Processing
        SS_L_NWBUSEOCDDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectCodeSP ȣ��
        ds = dao.selectDeptList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectDeptList(dm);
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
     * ��������-�ǽð� ������������-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

	public void insertAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_I_ANNCBODataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        String makepersid = Util.getSessionParameterValue(req, "uid", true);       //����� ���̵�
        String makepersnm = Util.getSessionParameterValue(req, "emp_nm", false);    //����� �̸�
        String posicd = Util.getSessionParameterValue(req, "posicd", false);        //����� ��å �ڵ�
        String posinm = Util.getSessionParameterValue(req, "posinm", false);        //����� ��å �̸�
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false);    //����� �Ǹźμ��ڵ�
        String deptnm = Util.getSessionParameterValue(req, "selldeptnm", false);    //����� �Ǹźμ��̸�

        // Request Parameter Processing
        String rmsgclsf = Util.checkString(req.getParameter("rmsgclsf")); // ���ű����ڵ�
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept")); // ���źμ��ڵ�
        String rmsgdeptnm =  Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm"))); //���źμ���
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea")); // ���������ڵ�
        String rmsgareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgareanm"))); // ����������
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm")); // ������������
        String anncendtm = Util.checkString(req.getParameter("anncendtm")); // ������������
        String annctitl =  Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl"))); // ����
        String annccont =  Util.Uni2Ksc(Util.checkString(req.getParameter("annccont"))); // ����

        String tmp = Util.replace(annctitl, "'", "&#39");
        annctitl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(annctitl, "��", "&#183");
        annctitl = tmp;

        String cont_tmp = Util.replace(annccont, "'", "&#39");
        //annccont = Util.replace(cont_tmp, "\"", "&#34");
        cont_tmp = Util.replace(annccont, "��", "&#183");
        annccont = cont_tmp;
        
        // DM Setting
        SS_I_ANNCBODM dm = new SS_I_ANNCBODM();
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setPosicd(posicd);
        dm.setPosinm(posinm);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setRmsgclsf(rmsgclsf);
        dm.setRmsgdept(rmsgdept);
        dm.setRmsgdeptnm(rmsgdeptnm);
        dm.setRmsgarea(rmsgarea);
        dm.setRmsgareanm(rmsgareanm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setAnnctitl(annctitl);
        dm.setAnnccont(annccont);
        dm.setIncmgpers(makepersid);

        
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO ��ü�� insertInfoexg ȣ��
        bResult = dao.insertAnncbo(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
		
		/*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();

            bResult = ejb.insertAnncbo(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }

            req.setAttribute("result", sResult); // request�� ������� ��´�.

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
     * ��������-�ǽð� ������������-����(����)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

	public void updateAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_ANNCBODataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        String uid = Util.getSessionParameterValue(req, "uid", true);       //����� ���̵�

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq")); // �Ϸù�ȣ
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept")); // ���źμ��ڵ�
        String rmsgdeptnm =  Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm"))); //���źμ���
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea")); // ���������ڵ�
        String rmsgareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgareanm"))); // ����������
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm")); // ������������
        String anncendtm = Util.checkString(req.getParameter("anncendtm")); // ������������
        String annctitl =  Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl"))); // ����
        String annccont =  Util.Uni2Ksc(Util.checkString(req.getParameter("annccont"))); // ����

        String tmp = Util.replace(annctitl, "'", "&#39");
        annctitl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(annctitl, "��", "&#183");
        annctitl = tmp;

        String cont_tmp = Util.replace(annccont, "'", "&#39");
        //annccont = Util.replace(cont_tmp, "\"", "&#34");
        cont_tmp = Util.replace(annccont, "��", "&#183");
        annccont = cont_tmp;

        // DM Setting
        SS_U_ANNCBODM dm = new SS_U_ANNCBODM();
        dm.setUid(uid);

        dm.setSeq(Long.parseLong(seq));

        dm.setRmsgdept(rmsgdept);
        dm.setRmsgdeptnm(rmsgdeptnm);
        dm.setRmsgarea(rmsgarea);
        dm.setRmsgareanm(rmsgareanm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setAnnctitl(annctitl);
        dm.setAnnccont(annccont);
        
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO ��ü�� insertInfoexg ȣ��
        bResult = dao.updateAnncbo(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request�� ������� ��´�.
         
         /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();
            bResult = ejb.updateAnncbo(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
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
     * ��������-�ǽð� ��������-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteAnncbo(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_D_ANNCBODataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����
        
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        SS_D_ANNCBODM dm = new SS_D_ANNCBODM();
        dm.setSeq(seq);

        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO ��ü�� deleteInfoexg ȣ��
        bResult = dao.deleteAnncbo(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
        
        req.setAttribute("seq", seq);
        req.setAttribute("result", sResult); // request�� ������� ��´�.
        /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();

            bResult = ejb.deleteAnncbo(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            if(bResult == true){ // ���������� �Էµ� ���
                sResult = "true";
             }
            
            req.setAttribute("seq", seq);
            req.setAttribute("result", sResult); // request�� ������� ��´�.
            //req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ��������-�ǽð� ��������-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchDtls(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_ANNCBODataSet ds = null;

        String seq = Util.checkString(req.getParameter("seq"));
        
        // DM Setting
        SS_S_ANNCBODM dm = new SS_S_ANNCBODM();

        dm.setSeq(Long.parseLong(seq));

        
        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO ��ü�� selectSrchList ȣ��
		ds = dao.selectSrchDtls(dm);
		req.setAttribute("seq", seq);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
		
        /*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();

            ds = ejb.selectSrchDtls(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("seq", seq);
            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ��������-�ǽð� �Ǹű�����-�۾�����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeAnncsls(HttpServletRequest req, HttpServletResponse res) throws AppException{
        // Request Parameter Processing
        SS_L_NWBUSEOCDDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectCodeSP ȣ��
        ds = dao.selectDeptList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectDeptList(dm);
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
     * ��������-�ǽð� �Ǹű�����-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

	public void insertAnncsls(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_I_ANNCSLSDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        String makepersid = Util.getSessionParameterValue(req, "uid", true);       //����� ���̵�
        String makepersnm = Util.getSessionParameterValue(req, "emp_nm", false);    //����� �̸�
        String posicd = Util.getSessionParameterValue(req, "posicd", false);        //����� ��å �ڵ�
        String posinm = Util.getSessionParameterValue(req, "posinm", false);        //����� ��å �̸�
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false);    //����� �Ǹźμ��ڵ�
        String deptnm = Util.getSessionParameterValue(req, "selldeptnm", false);    //����� �Ǹźμ��̸�

        // Request Parameter Processing
        String rmsgclsf = Util.checkString(req.getParameter("rmsgclsf")); // ���ű����ڵ�
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept")); // ���źμ��ڵ�
        String rmsgdeptnm =  Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm"))); //���źμ���
        String anncbgntm = Util.checkString(req.getParameter("anncbgntm")); // ������������
        String anncendtm = Util.checkString(req.getParameter("anncendtm")); // ������������
        String annctitl =  Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl"))); // ����
        String annccont =  Util.Uni2Ksc(Util.checkString(req.getParameter("annccont"))); // ����

        String tmp = Util.replace(annctitl, "'", "&#39");
        annctitl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(annctitl, "��", "&#183");
        annctitl = tmp;

        String cont_tmp = Util.replace(annccont, "'", "&#39");
        annccont = Util.replace(cont_tmp, "\"", "&#34");
        cont_tmp = Util.replace(annccont, "��", "&#183");
        annccont = cont_tmp;


        // DM Setting
        SS_I_ANNCSLSDM dm = new SS_I_ANNCSLSDM();
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setPosicd(posicd);
        dm.setPosinm(posinm);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setRmsgclsf(rmsgclsf);
        dm.setRmsgdept(rmsgdept);
        dm.setRmsgdeptnm(rmsgdeptnm);
        dm.setAnncbgntm(anncbgntm);
        dm.setAnncendtm(anncendtm);
        dm.setAnnctitl(annctitl);
        dm.setAnnccont(annccont);
        dm.setIncmgpers(makepersid);

        SSShare1200DAO dao = new SSShare1200DAO();
		// DAO ��ü�� insertInfoexg ȣ��
        bResult = dao.insertAnncsls(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
		
		/*
        SSShare1200EJBHome home = (SSShare1200EJBHome) JNDIManager.getInstance().getHome("SSShare1200EJB");
        try {
            SSShare1200EJB ejb = home.create();
            bResult = ejb.insertAnncsls(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
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
