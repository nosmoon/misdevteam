/***************************************************************************************************
 * ���ϸ� : PSShare1301WB.java
 * ��� : ��������-�Խ��� �Ǹű� ó���� ���� Work Bean
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

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * ��������-�Խ��� �Ǹű� ���� WB
 *
 */

public class PSShare1301WB {

    public int filesize = 5 * 1024 * 1024;

    /**
     * ��������-�Խ��� �Ǹű�-�ʱ�ȭ�� / ��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_INFOEXG_INITDataSet ds = null;
        // Request Parameter Processing

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�

        String clsf = "102"; 												//�Խ��Ǳ��� ��������
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

        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
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
     * ��������-�Խ��� ���Ǳ�-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_INFOEXG_SRCHDataSet ds = null;
        // Request Parameter Processing
        String clsf = "102"; 												//�Խ��Ǳ��� ����(��������)

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�

        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
//        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));
        String rmsgexttcd = "";

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
        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
            ds = ejb.selectSrchList(dm);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
//            req.setAttribute("rmsgexttcd", rmsgexttcd);
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
     * ��������-�Խ��� ���Ǳ�-�۾�����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Request Parameter Processing
        String clsf = "102"; //�Խ��Ǳ��� �Ǹű�(��������)
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

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
     * ��������-�Խ��� ���Ǳ�-�亯������
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void answerInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Request Parameter Processing
        String clsf = "102"; //�Խ��Ǳ��� �Ǹű�
        String seq = Util.checkString(req.getParameter("seq"));
        String answergrp = Util.checkString(req.getParameter("answergrp"));
        String answerseq = Util.checkString(req.getParameter("answerseq"));
        String answerlevl = Util.checkString(req.getParameter("answerlevl"));
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));

        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        if ("".equals(pageno)) {
            pageno = "1"; }
        if ("".equals(pagesize)) {
            pagesize = "20"; }
        String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));

        try {
            req.setAttribute("seq", seq);
            req.setAttribute("answergrp", answergrp);
            req.setAttribute("answerseq", answerseq);
            req.setAttribute("answerlevl", answerlevl);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
            req.setAttribute("titl", titl);
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * ��������-�Խ��� �Ǹű�-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {

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
        String clsf = "102";
        if (clsf.equals("101")) {
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        } else if (clsf.equals("102")) {
            answerseq = "0";
            answerlevl = "0";
        }
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String cmpynm = Util.getSessionParameterValue(req, "cmpynm", true); //ȸ���
        //String cmpynm = Util.Uni2Ksc(Util.checkString( (String) ht.get("cmpynm")));
        String makepersnm = Util.Uni2Ksc(Util.checkString( (String) ht.get("makepersnm"))); //�Է��ھ��̵�

        String email = Util.checkString( (String) ht.get("email"));
        String hmpg = Util.checkString( (String) ht.get("hmpg"));
        //
        System.out.println("WB =================titl===================: " + ht.get("titl"));
        String titl = Util.Uni2Ksc(Util.checkString( (String) ht.get("titl")));
        //String titl = Util.checkString( (String) ht.get("titl"));
        System.out.println("WB =================titl===================: " + titl);
        String cont = Util.Uni2Ksc(Util.checkString( (String) ht.get("cont")));
        String filenm = Util.Uni2Ksc(Util.checkString( (String) ht.get("filenm")));
        String filepath = Util.Uni2Ksc(Util.checkString( (String) ht.get("filepath")));
        
        //System.out.println("WB =================titl===================: " + titl);
        //System.out.println("WB =================cont===================:" + cont);
        String search_word = Util.Uni2Ksc(Util.checkString( (String) ht.get("search_word")));
        String search_word_kind = Util.Uni2Ksc(Util.checkString( (String) ht.get("search_word_kind")));

        String pageno = Util.Uni2Ksc(Util.checkString( (String) ht.get("curr_page_no")));
        String pagesize = Util.Uni2Ksc(Util.checkString( (String) ht.get("records_per_page")));

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
        dm.setIncmgpers(incmgpers);
        if (!filenm.equals("")) {
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
            dm.setFilepath(filepath);
        }

        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
            //�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�
            if(upfilesize <= filesize ){
                bResult = ejb.insertInfoexg(dm);
            }

            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
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
     * ��������-�Խ��� �Ǹű�-����
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
        String clsf = "102";
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
            cont_tmp = Util.replace(cont, "\"", "&#34");
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
        dm.setIncmgpers(incmgpers);
        dm.setCmpycd(cmpycd);
        dm.setJobcd(jobcd);

        if (!filenm.equals("")) {
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
            dm.setFilepath(filepath);
        }

        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
            ////�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�
            if(upfilesize <= filesize ){
            bResult = ejb.updateInfoexg(dm);
            }
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
     * ��������-�Խ��� �Ǹű�-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_D_INFOEXGDataSet ds = null;

        boolean bResult = false;
        String sResult = "false"; // request�� ��ȯ�� String Type �����
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String jobcd     = Util.getSessionParameterValue(req, "jobcd", true);          //�����ڵ�

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));

        // DM Setting
        PS_D_INFOEXGDM dm = new PS_D_INFOEXGDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setJobcd(jobcd);

        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
            bResult = ejb.deleteInfoexg(dm);
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
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
     * ��������-�Խ��� ���Ǳ�-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInfoexgDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_INFOEXGDataSet ds_detail = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));

        // DM Setting
        PS_S_INFOEXGDM dm = new PS_S_INFOEXGDM();
        dm.setSeq(Long.parseLong(seq));
        if (!brwscnt.equals("")) {
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }
        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
            ds_detail = ejb.selectInfoexgDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
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
     * ��������-�Խ��� �Ǹű�-�亯(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertAnswerInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException {

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
            if( upfilesize <= filesize ){
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
        String clsf = Util.checkString( (String) ht.get("clsf"));
        if (clsf.equals("101")) {
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }
        answergrp = Util.checkString( (String) ht.get("answergrp"));
        answerseq = Util.checkString( (String) ht.get("answerseq"));
        answerlevl = Util.checkString( (String) ht.get("answerlevl"));
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�
        String makepersnm = Util.Uni2Ksc(Util.checkString( (String) ht.get("makepersnm"))); //�Է��ھ��̵�
        String cmpynm = Util.getSessionParameterValue(req, "cmpynm", true); //ȸ���

        //String cmpynm = Util.Uni2Ksc(Util.checkString( (String) ht.get("cmpynm")));

        String email = Util.checkString( (String) ht.get("email"));
        String hmpg = Util.checkString( (String) ht.get("hmpg"));
        String titl = Util.Uni2Ksc(Util.checkString( (String) ht.get("titl")));
        String cont = Util.Uni2Ksc(Util.checkString( (String) ht.get("cont")));
        String filenm = Util.Uni2Ksc(Util.checkString( (String) ht.get("filenm")));
        String filepath = Util.Uni2Ksc(Util.checkString( (String) ht.get("filepath")));

        String search_word = Util.Uni2Ksc(Util.checkString( (String) ht.get("search_word")));
        String search_word_kind = Util.Uni2Ksc(Util.checkString( (String) ht.get("search_word_kind")));

        String pageno = Util.Uni2Ksc(Util.checkString( (String) ht.get("curr_page_no")));
        String pagesize = Util.Uni2Ksc(Util.checkString( (String) ht.get("records_per_page")));

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
        PS_I_INFOEXG_ANSWERDM dm = new PS_I_INFOEXG_ANSWERDM();

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
        dm.setIncmgpers(incmgpers);

        if (!filenm.equals("")) {
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
            dm.setFilepath(filepath);
        }

        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
            //�Էµ� ������ ����� ���Ͽ� �Է��� �����Ѵ�
            if(upfilesize <= filesize ){

                bResult = ejb.insertAnswerInfoexg(dm);
            }
            if (bResult == true) { // ���������� �Էµ� ���
                sResult = "true";
            }

            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("cmpycd", cmpycd);
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
     * ��������-�Խ��� �Ǹű�-�ٿ�ε�
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
        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
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
     * ��������-�Խ��� �Ǹű�-��õ
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

        // DM Setting
        PS_U_INFOEXG_RECOMDM dm = new PS_U_INFOEXG_RECOMDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        if (!recomcnt.equals("")) {
            dm.setRecomcnt(Long.parseLong(recomcnt));
        }

        PSShare1301EJBHome home = (PSShare1301EJBHome) JNDIManager.getInstance().getHome("PSShare1301EJB");
        try {
            PSShare1301EJB ejb = home.create();
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
