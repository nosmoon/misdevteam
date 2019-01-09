/***************************************************************************************************
* ���ϸ� : SSShare1800WB.java
* ��� : ��������-���Ͼ������� ó���� ���� Work Bean
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
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * ��������-���Ͼ������� ���� WB
 *
 */

public class SSShare1800WB{
    public int filesize = 5*1024*1024;
    /**
     * ��������-���Ͼ�������-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_JOBREC_INITDataSet ds = null;

        // Session Processing
        String uid 	= Util.getSessionParameterValue(req, "uid", true);//�����ID
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", false);//�����μ��ڵ�(����)
        String deptplacyn = Util.getSessionParameterValue(req, "deptplacyn", false);//�����忩��

        // Request Parameter Processing
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // DM Setting
        SS_L_JOBREC_INITDM dm = new SS_L_JOBREC_INITDM();
        dm.setUid(uid);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setDeptplacyn(deptplacyn);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1800DAO dao = new SSShare1800DAO();
	      // DAO ��ü�� selectInitList ȣ��
	      ds = dao.selectInitList(dm);
	      req.setAttribute("ds", ds);
	     /* 
        SSShare1800EJBHome home = (SSShare1800EJBHome) JNDIManager.getInstance().getHome("SSShare1800EJB");
        try {
            SSShare1800EJB ejb = home.create();
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
     * ��������-���Ͼ�������-�˻���ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_JOBREC_SRCHDataSet ds = null;

        // Session Processing
        String uid 	= Util.getSessionParameterValue(req, "uid", true);//�����ID
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", false);//�����μ��ڵ�(����)
        String deptplacyn = Util.getSessionParameterValue(req, "deptplacyn", false);//�����忩��

        // Request Parameter Processing(ȭ��ó��)
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));//�μ��ڵ�(�˻�����)
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // DM Setting
        SS_L_JOBREC_SRCHDM dm = new SS_L_JOBREC_SRCHDM();

        dm.setUid(uid);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setDeptplacyn(deptplacyn);
        dm.setSrchdeptcd(srchdeptcd);
        dm.setSearch_word(search_word);
        dm.setSearch_word_kind(search_word_kind);
        dm.setMakedt1(makedt1);
        dm.setMakedt2(makedt2);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        
        SSShare1800DAO dao = new SSShare1800DAO();
      	// DAO ��ü�� selectSrchList ȣ��
      	ds = dao.selectSrchList(dm);
      	req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("srchdeptcd", srchdeptcd);
        req.setAttribute("makedt1", makedt1);
        req.setAttribute("makedt2", makedt2);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
        req.setAttribute("ds", ds);
      	
        /*
        SSShare1800EJBHome home = (SSShare1800EJBHome) JNDIManager.getInstance().getHome("SSShare1800EJB");
        try {
            SSShare1800EJB ejb = home.create();
            ds = ejb.selectSrchList(dm);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * ��������-���Ͼ�������-�۾�����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeJobrec(HttpServletRequest req, HttpServletResponse res) throws AppException{
        // Request Parameter Processing
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));//�˻����� �μ��ڵ�
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        try {
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * ��������-���Ͼ�������-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertJobrec(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();

        String tmp = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type ���
        byte[] filecont = null;

        //������ ByteArray�� ��� input name�� imput value�� Hashtable�� �����Ѵ�.
        try {
            out = res.getWriter();
            MultipartParser multi = new MultipartParser(req, filesize, true, true);
            Part part = null;
            FilePart filePart = null;
            ParamPart parampart = null;
            String parmName = null;
            String parmValue = null;


            for (int i=0; (part = multi.readNextPart()) != null;i++ ) {

                if (part.isFile()) {
                    filePart = (FilePart) part;
                    //������ ÷������ ���
                    if(filePart.getFileName() != null){
	                    ht.put(part.getName(), filePart.getFileName());

	                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	                    filePart.writeTo(byteArrayOutputStream);
	                    filecont = byteArrayOutputStream.toByteArray();
                    	break;
                    }
                    //������ ÷������ �ʾ��� ���
                    else{
                    	ht.put(part.getName(), "");
                    }
                }
                else if(part.isParam()){
                    parampart = (ParamPart)part;
                    ht.put(part.getName(), parampart.getStringValue());
                }
            }
        } catch (IOException e) {
            throw new AppException("[SSShare1800WB.insertJobrec()]","[SSShare1800WB.insertJobrec()]÷���� ������ ũ�Ⱑ �ʹ� ũ�ų�, ������ �ùٸ��� �ʽ��ϴ�.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);
        String deptcd    = Util.getSessionParameterValue(req, "selldeptcd", false);
        String deptnm 		= Util.getSessionParameterValue(req, "selldeptnm", false);
        String makepersid 	= Util.getSessionParameterValue(req, "uid", true);
        String makepersnm 	= Util.getSessionParameterValue(req, "emp_nm", false);

        // Request Parameter Processing(�Է�)
        String makedt 		= Util.checkString((String)ht.get("makedt"));
        String curddplan 	= Util.Uni2Ksc(Util.checkString((String)ht.get("curddplan")));
        String prvddproc 	= Util.Uni2Ksc(Util.checkString((String)ht.get("prvddproc")));
        String etc 			= Util.Uni2Ksc(Util.checkString((String)ht.get("etc")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));

        // Request Parameter Processing(ȭ��ó��)
        String search_word =  Util.Uni2Ksc(Util.checkString((String)ht.get("search_word")));
        String search_word_kind = Util.checkString((String)ht.get("search_word_kind"));
        String srchdeptcd = Util.checkString((String)ht.get("srchdeptcd"));//�˻����� �μ��ڵ�
        String makedt1 = Util.checkString((String)ht.get("makedt1"));
        String makedt2 = Util.checkString((String)ht.get("makedt2"));
        String pageno = Util.checkString((String)ht.get("curr_page_no"));
        String pagesize = Util.checkString((String)ht.get("records_per_page"));

        // ��� �Է½� Ư�� ���� ó��

        tmp = Util.replace(curddplan, "'", "&#39");
        curddplan = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(curddplan, "��", "&#183");
        curddplan = tmp;

        tmp = Util.replace(prvddproc, "'", "&#39");
        prvddproc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(prvddproc, "��", "&#183");
        prvddproc = tmp;

        tmp = Util.replace(etc, "'", "&#39");
        etc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etc, "��", "&#183");
        etc = tmp;

        // DM Setting
        SS_I_JOBRECDM dm = new SS_I_JOBRECDM();

        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setCurddplan(curddplan);
        dm.setPrvddproc(prvddproc);
        dm.setEtc(etc);
        dm.setIncmgpers(incmgpers);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1800DAO dao = new SSShare1800DAO();
      	// DAO ��ü�� insertJobrec ȣ��
        bResult = dao.insertJobrec(dm);
      	if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request�� ������� ��´�.
         req.setAttribute("search_word", search_word);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("srchdeptcd", srchdeptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         
         /*
        SSShare1800EJBHome home = (SSShare1800EJBHome) JNDIManager.getInstance().getHome("SSShare1800EJB");
        try {
            SSShare1800EJB ejb = home.create();
            bResult = ejb.insertJobrec(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * ��������-���Ͼ�������-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void updateJobrec(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String tmp = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type ���
        byte[] filecont = null;         // ���ϴ��� ����

        //������ ByteArray�� ��� input name�� imput value�� Hashtable�� �����Ѵ�.
        try {
            out = res.getWriter();
            MultipartParser multi = new MultipartParser(req, filesize, true, true);
            Part part = null;
            FilePart filePart = null;
            ParamPart parampart = null;
            String parmName = null;
            String parmValue = null;


            for (int i=0; (part = multi.readNextPart()) != null;i++ ) {

                if (part.isFile()) {
                    filePart = (FilePart) part;
                    //������ ÷������ ���
                    if(filePart.getFileName() != null){
	                    ht.put(part.getName(), filePart.getFileName());

	                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	                    filePart.writeTo(byteArrayOutputStream);
	                    filecont = byteArrayOutputStream.toByteArray();
                    	break;
                    }
                    //������ ÷������ �ʾ��� ���
                    else{
                    	ht.put(part.getName(), "");
                    }
                }
                else if(part.isParam()){
                    parampart = (ParamPart)part;
                    ht.put(part.getName(), parampart.getStringValue());
                }
            }
        } catch (IOException e) {
            throw new AppException("[SSShare1800WB.updateJobrec()]","[SSShare1800WB.updateJobrec()]÷���� ������ ũ�Ⱑ �ʹ� ũ�ų�, ������ �ùٸ��� �ʽ��ϴ�.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Request Parameter Processing
        String makedt 		= Util.checkString((String)ht.get("makedt"));
        String makepersid 	= Util.checkString((String)ht.get("makepersid"));
        String makepersnm 	= Util.Uni2Ksc(Util.checkString((String)ht.get("makepersnm")));
        String curddplan 	= Util.Uni2Ksc(Util.checkString((String)ht.get("curddplan")));
        String prvddproc 	= Util.Uni2Ksc(Util.checkString((String)ht.get("prvddproc")));
        String etc 			= Util.Uni2Ksc(Util.checkString((String)ht.get("etc")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));

        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);

        // ���� üũ
        String uid = Util.getSessionParameterValue(req, "uid", true); //�����ID
        if (!makepersid.equals(uid)) {
            throw new AppException("[SSShare1800WB.updateJobrec()]", "[SSShare1800WB.updateJobrec()] ���������� �����ϴ�.");
        }

        // Request Parameter Processing(ȭ��ó��)
        String search_word =  Util.Uni2Ksc(Util.checkString((String)ht.get("search_word")));
        String search_word_kind = Util.checkString((String)ht.get("search_word_kind"));
        String srchdeptcd = Util.checkString((String)ht.get("srchdeptcd"));//�˻����� �μ��ڵ�
        String makedt1 = Util.checkString((String)ht.get("makedt1"));
        String makedt2 = Util.checkString((String)ht.get("makedt2"));
        String pageno = Util.checkString((String)ht.get("curr_page_no"));
        String pagesize = Util.checkString((String)ht.get("records_per_page"));
        String brwscnt 		= Util.checkString((String)ht.get("brwscnt"));

        // ��� �Է½� Ư�� ���� ó��

        tmp = Util.replace(curddplan, "'", "&#39");
        curddplan = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(curddplan, "��", "&#183");
        curddplan = tmp;

        tmp = Util.replace(prvddproc, "'", "&#39");
        prvddproc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(prvddproc, "��", "&#183");
        prvddproc = tmp;

        tmp = Util.replace(etc, "'", "&#39");
        etc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etc, "��", "&#183");
        etc = tmp;

        // DM Setting
        SS_U_JOBRECDM dm = new SS_U_JOBRECDM();

        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        dm.setCurddplan(curddplan);
        dm.setPrvddproc(prvddproc);
        dm.setEtc(etc);
        dm.setChgpers(makepersid);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1800DAO dao = new SSShare1800DAO();
      	// DAO ��ü�� updateJobrec ȣ��
        bResult = dao.updateJobrec(dm);
      	if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         // ���� �� ����ȸ�� ���
         req.setAttribute("makedt", makedt);
         req.setAttribute("makepersid", makepersid);

         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("srchdeptcd", srchdeptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         req.setAttribute("brwscnt", brwscnt);
         req.setAttribute("result", sResult); // request�� ������� ��´�.
      	/*
        SSShare1800EJBHome home = (SSShare1800EJBHome) JNDIManager.getInstance().getHome("SSShare1800EJB");
        try {
            SSShare1800EJB ejb = home.create();
            bResult = ejb.updateJobrec(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            // ���� �� ����ȸ�� ���
            req.setAttribute("makedt", makedt);
            req.setAttribute("makepersid", makepersid);

            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
            req.setAttribute("brwscnt", brwscnt);
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
     * ��������-���Ͼ�������-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteJobrec(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_D_JOBRECDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����
        // Request Parameter Processing
        String makedt = Util.checkString(req.getParameter("makedt"));
        String makepersid = Util.checkString(req.getParameter("makepersid"));

        // ���� üũ
        String uid 	= Util.getSessionParameterValue(req, "uid", true);//�����ID
        if(!makepersid.equals(uid)){
            throw new AppException("[SSShare1800WB.deleteJobrec()]","[SSShare1800WB.deleteJobrec()] ���������� �����ϴ�.");
        }

        // Request Parameter Processing(ȭ��ó��)
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));

        // DM Setting
        SS_D_JOBRECDM dm = new SS_D_JOBRECDM();

        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);

        SSShare1800DAO dao = new SSShare1800DAO();
		// DAO ��ü�� deleteJobrec ȣ��
        bResult = dao.deleteJobrec(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("srchdeptcd", srchdeptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         req.setAttribute("result", sResult); // request�� ������� ��´�.
		
         /*
        SSShare1800EJBHome home = (SSShare1800EJBHome) JNDIManager.getInstance().getHome("SSShare1800EJB");
        try {
            SSShare1800EJB ejb = home.create();
            bResult = ejb.deleteJobrec(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * ��������-���Ͼ�������-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectJobrecDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_JOBRECDataSet ds = null;
        // Request Parameter Processing
        String makedt = Util.checkString(req.getParameter("makedt"));
        String makepersid = Util.checkString(req.getParameter("makepersid"));

        // Request Parameter Processing(ȭ��ó��)
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String srchdeptcd = Util.checkString(req.getParameter("srchdeptcd"));//�˻����� �μ��ڵ�
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));

        // DM Setting
        SS_S_JOBRECDM dm = new SS_S_JOBRECDM();
        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        if (!brwscnt.equals("")){
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }
        
        SSShare1800DAO dao = new SSShare1800DAO();
      	// DAO ��ü�� selectJobrecDetail ȣ��
      	ds = dao.selectJobrecDetail(dm);
      	req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("srchdeptcd", srchdeptcd);
        req.setAttribute("makedt1", makedt1);
        req.setAttribute("makedt2", makedt2);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
      	
        /*
        SSShare1800EJBHome home = (SSShare1800EJBHome) JNDIManager.getInstance().getHome("SSShare1800EJB");
        try {
            SSShare1800EJB ejb = home.create();
            ds = ejb.selectJobrecDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * ��������-���Ͼ�������-�ٿ�ε�
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void dwloadJobrec(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_JOBREC_DWLOADDataSet ds = null;
        // Request Parameter Processing
        String makedt = Util.checkString(req.getParameter("makedt"));
        String makepersid = Util.checkString(req.getParameter("makepersid"));
        String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));

        // DM Setting
        SS_S_JOBREC_DWLOADDM dm = new SS_S_JOBREC_DWLOADDM();
        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        if (!dwloadcnt.equals("")){
            dm.setDwloadcnt(Long.parseLong(dwloadcnt));
        }
        
        SSShare1800DAO dao = new SSShare1800DAO();
		// DAO ��ü�� dwloadJobrec ȣ��
		ds = dao.dwloadJobrec(dm);
		req.setAttribute("filecont", ds.filecont); // request�� ������� ��´�.
        req.setAttribute("filenm", ds.filenm); // request�� ������� ��´�.
		
        /*
        SSShare1800EJBHome home = (SSShare1800EJBHome) JNDIManager.getInstance().getHome("SSShare1800EJB");
        try {
            SSShare1800EJB ejb = home.create();
            ds = ejb.dwloadJobrec(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("filecont", ds.filecont); // request�� ������� ��´�.
            req.setAttribute("filenm", ds.filenm); // request�� ������� ��´�.
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

/* �ۼ��ð� : Tue Nov 18 11:50:05 KST 2003 */
