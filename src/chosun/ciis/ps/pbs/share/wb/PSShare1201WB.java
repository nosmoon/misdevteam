/***************************************************************************************************
 * ���ϸ� : PSShare1201WB.java
 * ��� : ��������-�Խ��� �������� ó���� ���� Work Bean
 * �ۼ����� : 2004-02-23
 * �ۼ��� : ����ǥ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.share.wb;

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
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.dao.*;
import chosun.ciis.ps.pbs.share.ejb.*;

import com.oreilly.servlet.multipart.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.IOException;

/**
 * ��������-�Խ��� �������� ���� WB
 *
 */

public class PSShare1201WB {

    public int filesize = 5 * 1024 * 1024;

    /**
     * ��������-�Խ��� ��������-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_INFOEXG_INITDataSet ds = null;

        String clsf = "101"; //�Խ��Ǳ��� ��������

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if ("".equals(pageno)) {
            pageno = "1"; }
        if ("".equals(pagesize)) {
            pagesize = "20"; }

        // DM Setting
        PS_L_INFOEXG_INITDM dm = new PS_L_INFOEXG_INITDM();
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);
        dm.setPub_branch(""); // ���Ǳ�/���� �������� ����
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
            PSShare1201EJB ejb = home.create();
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
        }
    }

    /**
     * ��������-�Խ��� ��������-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_INFOEXG_SRCHDataSet ds = null;
        // Request Parameter Processing
        String clsf = "101"; //�Խ��Ǳ��� ��������

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if ("".equals(pageno)) {
            pageno = "1"; }
        if ("".equals(pagesize)) {
            pagesize = "20"; }

        // DM Setting
        PS_L_INFOEXG_SRCHDM dm = new PS_L_INFOEXG_SRCHDM();
        dm.setClsf(clsf);
        dm.setSearch_word(search_word);
        dm.setSearch_word_kind(search_word_kind);
        dm.setCmpycd(cmpycd);
        dm.setPub_branch(""); // ���Ǳ�/���� �������� ����
        dm.setRmsgexttcd(rmsgexttcd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
            PSShare1201EJB ejb = home.create();
            ds = ejb.selectSrchList(dm);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
            req.setAttribute("rmsgexttcd", rmsgexttcd);
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
        }
    }

    /**
     * ��������-�Խ��� ��������-�۾�����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Request Parameter Processing
        String clsf = "101"; //�Խ��Ǳ��� �Ǹű�

        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if ("".equals(pageno)) {
            pageno = "1"; }
        if ("".equals(pagesize)) {
            pagesize = "20"; }

        try {
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * ��������-�Խ��� ��������-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String notifrdt = null; //�Խý������� (�������׿����� ���)
        String notitodt = null; //�Խ��������� (�������׿����� ���)
        String answergrp = null; //�亯�׷� (�Ǹű�,�̽�,�Ź���,����򿡼��� ���)
        String answerseq = null; //�亯���� (�Ǹű�,�̽�,�Ź���,����򿡼��� ���)
        String answerlevl = null; //�亯���� (�Ǹű�,�̽�,�Ź���,����򿡼��� ���)
        String tmp = null;
        String cont1 = null;
        String cont2 = null;
        String cont3 = null;
        String cont4 = null;
        String cont5 = null;
        int upfilesize =  req.getContentLength(); // �Էµ� ���ϻ���� ����.
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type ���
        byte[] filecont = null;

        //������ ByteArray�� ��� input name�� imput value�� Hashtable�� �����Ѵ�.

        try {
            out = res.getWriter();
            ////�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�
            if(upfilesize <= filesize ){
                MultipartParser multi = new MultipartParser(req, filesize, true, true);

                Part part = null;
                FilePart filePart = null;
                ParamPart parampart = null;
                String parmName = null;
                String parmValue = null;

                for (int i = 0; (part = multi.readNextPart()) != null; i++) {

                    if (part.isFile()) {
                        filePart = (FilePart) part;

                        //������ ÷������ ���
                        if (filePart.getFileName() != null) {
                            ht.put(part.getName(), filePart.getFileName());

                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

                            filePart.writeTo(byteArrayOutputStream);
                            filecont = byteArrayOutputStream.toByteArray();

                            break;
                        }
                        //������ ÷������ �ʾ��� ���
                        else {
                            ht.put(part.getName(), "");
                        }
                    } else if (part.isParam()) {
                        parampart = (ParamPart) part;
                        ht.put(part.getName(), parampart.getStringValue());
                    }
                }
            }
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Request Parameter Processing
        //String clsf = Util.checkString( (String) ht.get("clsf"));
        String clsf = "101";
        //���������ϰ��

        if (clsf.equals("101")) {
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }
        //���������� �ƴҰ��
        else if (clsf.equals("102")) {
            answergrp = Util.checkString( (String) ht.get("answergrp"));
            answerseq = Util.checkString( (String) ht.get("answerseq"));
            answerlevl = Util.checkString( (String) ht.get("answerlevl"));
        }

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String cmpynm = Util.getSessionParameterValue(req, "cmpynm", true); //ȸ���

        String makepersnm = Util.Uni2Ksc(Util.checkString( (String) ht.get("makepersnm"))); //�Է��ھ��̵�
        //String cmpynm = Util.Uni2Ksc(Util.checkString( (String) ht.get("cmpynm")));

        String rmsgdept = Util.checkString( (String) ht.get("rmsgdept"));
        String rmsgexttcd = Util.checkString( (String) ht.get("rmsgexttcd"));

        String email = Util.checkString( (String) ht.get("email"));
        String hmpg = Util.checkString( (String) ht.get("hmpg"));
        String titl = Util.Uni2Ksc(Util.checkString( (String) ht.get("titl")));
        String cont = Util.Uni2Ksc(Util.checkString( (String) ht.get("cont")));
        String filenm = Util.Uni2Ksc(Util.checkString( (String) ht.get("filenm")));
        String filepath = Util.Uni2Ksc(Util.checkString( (String) ht.get("filepath")));

        // ��� �Է½� Ư�� ���� ó��

        tmp = Util.replace(titl, "'", "&#39");
        titl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(titl, "��", "&#183");
        titl = tmp;

        // ���� üũ ����
        if (!cont.equals("")) {
            String cont_tmp = cont;
            String[] contents = new String[5];
            int k = 0;

            cont = Util.replace(cont_tmp, "'", "&#39");
            //cont_tmp = Util.replace(cont, "\"", "&#34");
            cont = Util.replace(cont_tmp, "��", "&#183");
            cont_tmp = cont;

            for (k = 0; cont_tmp.length() > 2000 && k < 5; k++) {
                contents[k] = cont_tmp.substring(0, 2000);
                cont_tmp = cont_tmp.substring(2000);
            }

            // ������ 2000����Ʈ���� �������
            if (cont_tmp.length() > 0 && k == 0) {
                cont1 = cont_tmp;
                cont2 = "";
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 2000 ũ�� 4000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 1) {
                cont1 = contents[0];
                cont2 = cont_tmp;
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 4000 ũ�� 6000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 2) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = cont_tmp;
                cont4 = "";
                cont5 = "";
            }
            //	������ 6000 ũ�� 8000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 3) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = cont_tmp;
                cont5 = "";
            }
            // ������ 8000 ũ�� 10000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 4) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = cont_tmp;
            }
            //	������ 10000����Ʈ���� Ŭ��� 10000����Ʈ �̻��� ����� ����
            else if (cont_tmp.length() > 0 && k == 5) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = contents[4];
            }
        }
        // ������ �Է����� �ʾ��� ���
        else {
            cont1 = "";
            cont2 = "";
            cont3 = "";
            cont4 = "";
            cont5 = "";
        }
        // ���� üũ ��

        // DM Setting
        PS_I_INFOEXGDM dm = new PS_I_INFOEXGDM();

        dm.setClsf(clsf);
        if (clsf.equals("101")) {
            dm.setNotifrdt(notifrdt);
            dm.setNotitodt(notitodt);
        } else if (clsf.equals("102")) {
            dm.setAnswergrp(Long.parseLong(answergrp));
            dm.setAnswerseq(Long.parseLong(answerseq));
            dm.setAnswerlevl(Long.parseLong(answerlevl));
        }
        dm.setMakepersnm(makepersnm);
        dm.setEmail(email);
        dm.setHmpg(hmpg);
        dm.setTitl(titl);
        dm.setCont1(cont1);
        dm.setCont2(cont2);
        dm.setCont3(cont3);
        dm.setCont4(cont4);
        dm.setCont5(cont5);
        dm.setCmpycd(cmpycd);
        dm.setCmpynm(cmpynm);
        dm.setRmsgdept(rmsgdept);
        dm.setRmsgexttcd(rmsgexttcd);
        dm.setIncmgpers(incmgpers);

        if (!filenm.equals("")) {
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
            dm.setFilepath(filepath);
        }

        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
            PSShare1201EJB ejb = home.create();
            //�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�
            if(upfilesize <= filesize ){
                bResult = ejb.insertInfoexg(dm);
            }

            if (bResult == true) { // ���������� �Էµ� ���
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
        }
    }

    /**
     * ��������-�Խ��� ��������-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void updateInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String notifrdt = null; //�Խý������� (�������׿����� ���)
        String notitodt = null; //�Խ��������� (�������׿����� ���)
        String tmp = null;
        String cont1 = null;
        String cont2 = null;
        String cont3 = null;
        String cont4 = null;
        String cont5 = null;
        int upfilesize =  req.getContentLength(); // �Էµ� ���ϻ���� ����.
        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type ���
        byte[] filecont = null; // ���ϴ��� ����

        //������ ByteArray�� ��� input name�� imput value�� Hashtable�� �����Ѵ�.
        try {
            out = res.getWriter();

            ////�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�

            if( upfilesize <= filesize ){
                MultipartParser multi = new MultipartParser(req, filesize, true, true);
	            Part part = null;
	            FilePart filePart = null;
	            ParamPart parampart = null;
	            String parmName = null;
	            String parmValue = null;

                for (int i = 0; (part = multi.readNextPart()) != null; i++) {

                    if (part.isFile()) {
                    	System.out.println("1201WB : =============0============ : ");
                        filePart = (FilePart) part;
                        //������ ÷������ ���
                        if (filePart.getFileName() != null) {
                        	System.out.println("1201WB : =============1============ : ");
                            ht.put(part.getName(), filePart.getFileName());
                            System.out.println("1201WB : =============2============ : ");

                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            System.out.println("1201WB : =============3============ : ");
                            filePart.writeTo(byteArrayOutputStream);
                            System.out.println("1201WB : =============4============ : ");
                            filecont = byteArrayOutputStream.toByteArray();
                            System.out.println("1201WB : =============5============ : ");
                            break;
                        }
                        //������ ÷������ �ʾ��� ���
                        else {
                            ht.put(part.getName(), "");
                        }
                    } else if (part.isParam()) {
                        parampart = (ParamPart) part;
                        ht.put(part.getName(), parampart.getStringValue());
                    }
                }
           }
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Request Parameter Processing
        //String clsf = Util.checkString( (String) ht.get("clsf"));
        String clsf = "101";
        if (clsf.equals("101")) {
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String jobcd     = Util.getSessionParameterValue(req, "jobcd", true);          //�����ڵ�
        String email = Util.checkString( (String) ht.get("email"));
        String hmpg = Util.checkString( (String) ht.get("hmpg"));
        String titl = Util.Uni2Ksc(Util.checkString( (String) ht.get("titl")));
        String cont = Util.Uni2Ksc(Util.checkString( (String) ht.get("cont")));
        String filenm = Util.Uni2Ksc(Util.checkString( (String) ht.get("filenm")));
        String filepath = Util.Uni2Ksc(Util.checkString( (String) ht.get("filepath")));
        String seq = Util.Uni2Ksc(Util.checkString( (String) ht.get("seq")));
        String search_word = Util.Uni2Ksc(Util.checkString( (String) ht.get("search_word")));
        String search_word_kind = Util.Uni2Ksc(Util.checkString( (String) ht.get("search_word_kind")));
        String pageno = Util.Uni2Ksc(Util.checkString( (String) ht.get("curr_page_no")));
        String pagesize = Util.Uni2Ksc(Util.checkString( (String) ht.get("records_per_page")));
        String brwscnt = Util.checkString( (String) ht.get("brwscnt"));
        String rmsgexttcd = Util.checkString( (String) ht.get("rmsgexttcd"));
        // ��� �Է½� Ư�� ���� ó��
        tmp = Util.replace(titl, "'", "&#39");
        titl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(titl, "��", "&#183");
        titl = tmp;

        // ���� üũ ����
        if (!cont.equals("")) {
            String cont_tmp = cont;
            String[] contents = new String[5];
            int k = 0;

            cont = Util.replace(cont_tmp, "'", "&#39");
            //cont_tmp = Util.replace(cont, "\"", "&#34");
            cont = Util.replace(cont_tmp, "��", "&#183");
            cont_tmp = cont;

            for (k = 0; cont_tmp.length() > 2000 && k < 5; k++) {
                contents[k] = cont_tmp.substring(0, 2000);
                cont_tmp = cont_tmp.substring(2000);
            }

            // ������ 2000����Ʈ���� �������
            if (cont_tmp.length() > 0 && k == 0) {
                cont1 = cont_tmp;
                cont2 = "";
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 2000 ũ�� 4000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 1) {
                cont1 = contents[0];
                cont2 = cont_tmp;
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 4000 ũ�� 6000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 2) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = cont_tmp;
                cont4 = "";
                cont5 = "";
            }
            //	������ 6000 ũ�� 8000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 3) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = cont_tmp;
                cont5 = "";
            }
            // ������ 8000 ũ�� 10000����Ʈ���� ���� ���
            else if (cont_tmp.length() > 0 && k == 4) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = cont_tmp;
            }
            //	������ 10000����Ʈ���� Ŭ��� 10000����Ʈ �̻��� ����� ����
            else if (cont_tmp.length() > 0 && k == 5) {
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = contents[4];
            }
        }
        // ������ �Է����� �ʾ��� ���
        else {
            cont1 = "";
            cont2 = "";
            cont3 = "";
            cont4 = "";
            cont5 = "";
        }
        // ���� üũ ��

        // DM Setting
        PS_U_INFOEXGDM dm = new PS_U_INFOEXGDM();

        dm.setClsf(clsf);
        if (clsf.equals("101")) {
            dm.setNotifrdt(notifrdt);
            dm.setNotitodt(notitodt);
        }

        //�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�
        if(upfilesize <= filesize ){
            dm.setSeq(Long.parseLong(seq));
        }

        dm.setEmail(email);
        dm.setHmpg(hmpg);
        dm.setTitl(titl);

        dm.setCont1(cont1);
        dm.setCont2(cont2);
        dm.setCont3(cont3);
        dm.setCont4(cont4);
        dm.setCont5(cont5);

        if (!filenm.equals("")) {
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
            dm.setFilepath(filepath);
        }

        dm.setIncmgpers(incmgpers);
        dm.setCmpycd(cmpycd);
        dm.setJobcd(jobcd);
        dm.setRmsgexttcd(rmsgexttcd);
        System.out.println("===================13====================");

        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
        	System.out.println("===================14====================");
            PSShare1201EJB ejb = home.create();

            System.out.println("===================15====================");
            ////�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�
            if(upfilesize <= filesize ){
            	System.out.println("===================16====================");
                bResult = ejb.updateInfoexg(dm);
            }
            if (bResult == true) { // ���������� �Էµ� ���
            	System.out.println("===================17====================");
                sResult = "true";
            }
            System.out.println("===================161====================");
            req.setAttribute("seq", seq);
            System.out.println("===================162====================");
            req.setAttribute("search_word_kind", search_word_kind);
            System.out.println("===================163====================");
            req.setAttribute("search_word", search_word);
            System.out.println("===================164====================");
            req.setAttribute("cmpycd", cmpycd);
            System.out.println("===================165====================");
            req.setAttribute("curr_page_no", pageno);
            System.out.println("===================166====================");
            req.setAttribute("records_per_page", pagesize);
            System.out.println("===================167====================");
            req.setAttribute("brwscnt", brwscnt);
            System.out.println("===================168====================");
            req.setAttribute("result", sResult); // request�� ������� ��´�.
            System.out.println("===================169====================");
            req.setAttribute("rmsgexttcd", rmsgexttcd);
            System.out.println("===================170====================");

        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            System.out.println("===================141====================" + se.toString());
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            System.out.println("===================142====================" + se.toString());
            throw se;
        } catch (IOException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            System.out.println("===================143====================" + se.toString());
            throw se;
        }
    }

    /**
     * ��������-�Խ��� ��������-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_D_INFOEXGDataSet ds = null;

        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����
        // Request Parameter Processing

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String jobcd     = Util.getSessionParameterValue(req, "jobcd", true);          //�����ڵ�

        String seq = Util.checkString(req.getParameter("seq"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));

        // DM Setting
        PS_D_INFOEXGDM dm = new PS_D_INFOEXGDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setJobcd(jobcd);

        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
            PSShare1201EJB ejb = home.create();
            bResult = ejb.deleteInfoexg(dm);
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
            req.setAttribute("rmsgexttcd", rmsgexttcd);
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
        }
    }

    /**
     * ��������-�Խ��� ��������-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInfoexgDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_INFOEXGDataSet ds_detail = null;
        // Request Parameter Processing

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String seq = Util.checkString(req.getParameter("seq"));
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));

        // DM Setting
        PS_S_INFOEXGDM dm = new PS_S_INFOEXGDM();
        dm.setSeq(Long.parseLong(seq));

        if (!brwscnt.equals("")) {
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }
        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
            PSShare1201EJB ejb = home.create();
            ds_detail = ejb.selectInfoexgDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
            req.setAttribute("rmsgexttcd", rmsgexttcd);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
            req.setAttribute("ds_detail", ds_detail); // request�� ������� ��´�.
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
     * ��������-�Խ��� ��������-�ٿ�ε�
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void dwloadInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_INFOEXG_DWLOADDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));

        // DM Setting
        PS_S_INFOEXG_DWLOADDM dm = new PS_S_INFOEXG_DWLOADDM();
        dm.setSeq(Long.parseLong(seq));
        if (!dwloadcnt.equals("")) {
            dm.setDwloadcnt(Long.parseLong(dwloadcnt));
        }
        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
            PSShare1201EJB ejb = home.create();
            ds = ejb.dwloadInfoexg(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
        }
    }

    /**
     * ��������-�Խ��� ��������-��õ
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void recomInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_U_INFOEXG_RECOMDataSet ds = null;

        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String seq = Util.checkString(req.getParameter("seq"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));
        String recomcnt = Util.checkString(req.getParameter("recomcnt"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));

        // DM Setting
        PS_U_INFOEXG_RECOMDM dm = new PS_U_INFOEXG_RECOMDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        if (!recomcnt.equals("")) {
            dm.setRecomcnt(Long.parseLong(recomcnt));
        }

        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {
            PSShare1201EJB ejb = home.create();
            bResult = ejb.recomInfoexg(dm);
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("seq", seq);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
            req.setAttribute("brwscnt", brwscnt);
            req.setAttribute("result", sResult); // request�� ������� ��´�.
            req.setAttribute("rmsgexttcd", rmsgexttcd);
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
     * �Խ��� ��������-�޺��ڽ�
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void selectCombo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_SEPBKDataSet ds = null;

        PS_S_SEPBKDM dm = new PS_S_SEPBKDM();

        PSShare1201EJBHome home = (PSShare1201EJBHome) JNDIManager.getInstance().getHome("PSShare1201EJB");
        try {

            PSShare1201EJB ejb = home.create();
            ds = ejb.selectCombo(dm);
            req.setAttribute("ds", ds);
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