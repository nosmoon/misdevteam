/***************************************************************************************************
* ���ϸ� : SSShare1300WB.java
* ��� : ��������-�Խ��� �������� ó���� ���� Work Bean
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

import java.net.HttpURLConnection;
import java.net.URL;
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

//import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * ��������-�Խ��� �������� ���� WB /����Ͽ�
 *
 */

public class SSShare11300WB{

	public int filesize = 5*1024*1024;

	public final String API_KEY = "AIzaSyDuDdMS4IDBpHHQN6lu7ogeNVeSykiKHro";

    /**
     * ��������-�Խ��� ��������-�ʱ���ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_INFOEXG_INITDataSet ds = null;
        // Request Parameter Processing
        String clsf = "1";    //�Խ��Ǳ��� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
        String sb_areacd = Util.getSessionParameterValue(req, "areacd", true); 	//���������ڵ�(����)
        String sb_dealdeptcd = Util.getSessionParameterValue(req, "dealdeptcd", true); 	//�����μ��ڵ�(����)

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        System.out.println("clsf="+clsf);
        System.out.println("cmpycd="+cmpycd);
        System.out.println("incmgpers="+incmgpers);
        System.out.println("sb_areacd="+sb_areacd);
        System.out.println("sb_dealdeptcd="+sb_dealdeptcd);
        System.out.println("pageno="+pageno);
        System.out.println("pagesize="+pagesize);


        // DM Setting
        SS_L_INFOEXG_INITDM dm = new SS_L_INFOEXG_INITDM();
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);
        dm.setUid(incmgpers);
        dm.setSb_areacd(sb_areacd);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

        /*
		SSShare1300EJBHome home = (SSShare1300EJBHome) JNDIManager.getInstance().getHome("SSShare1300EJB");
        try {
            SSShare1300EJB ejb = home.create();
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
     * ��������-�Խ��� ��������-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void mo_selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{  //����Ͽ�
        SS_MO_L_INFOEXG_SRCHDataSet ds = null;
        // Request Parameter Processing
        String clsf = "1";    //�Խ��Ǳ��� ��������
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));	//ȸ���ڵ�
        String incmgpers = Util.checkString(req.getParameter("incmgpers")); 	//�Է��ھ��̵�
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));  //���Ź�������
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //���źμ�����
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //������������
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        System.out.println("clsf="+clsf);
        System.out.println("cmpycd="+cmpycd);
        System.out.println("incmgpers="+incmgpers);
        System.out.println("search_word="+search_word);
        System.out.println("search_word_kind="+search_word_kind);
        System.out.println("rmsgexttcd="+rmsgexttcd);
        System.out.println("rmsgdept="+rmsgdept);
        System.out.println("rmsgarea="+rmsgarea);
        System.out.println("pageno="+pageno);
        System.out.println("pagesize="+pagesize);

        // DM Setting
        SS_MO_L_INFOEXG_SRCHDM dm = new SS_MO_L_INFOEXG_SRCHDM();
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);
        dm.setUid(incmgpers);
        dm.setRmsgexttcd(rmsgexttcd);
        dm.setRmsgdept(rmsgdept);
        dm.setSearch_word(search_word);
        dm.setSearch_word_kind(search_word_kind);
        dm.setRmsgarea(rmsgarea);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        dm.print();

        SSShare11300DAO dao = new SSShare11300DAO();
		// DAO ��ü�� selectSrchList ȣ��
		ds = dao.mo_selectSrchList(dm);

		req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("rmsgexttcd", rmsgexttcd);
        req.setAttribute("rmsgdept", rmsgdept);
        req.setAttribute("rmsgarea", rmsgarea);
        req.setAttribute("pageno", pageno);
        req.setAttribute("pagesize", pagesize);
        req.setAttribute("ds", ds);

    }

    /**
     * ��������-�Խ��� ��������-��(��)_NEW ����ϸ� ����.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void mo_selectSrchDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{  //����Ͽ� agency/commun_11120
    	SL_S_INFOEXGDataSet ds = null;
        // Request Parameter Processing
		String seq = Util.checkString(req.getParameter("seq"));
		String clsf = Util.checkString(req.getParameter("clsf")); // �Խ��Ǳ���
		String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
		String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
		String curr_page_no = Util.checkString(req.getParameter("curr_page_no"));
		String records_per_page = Util.checkString(req.getParameter("records_per_page"));
		String brwscnt = Util.checkString(req.getParameter("brwscnt"));

		// DM Setting
		SL_S_INFOEXGDM dm = new SL_S_INFOEXGDM();
		dm.setSeq(Long.parseLong(seq));
		dm.setClsf(clsf);
		if (!brwscnt.equals("")) {
			dm.setBrwscnt(Long.parseLong(brwscnt));
		}

        SSShare11300DAO dao = new SSShare11300DAO();
		ds = dao.mo_selectInfoexgDetail(dm);
        req.setAttribute("ds", ds);

    }



    /**
     * ��������-�Խ��� ��������-�۾�����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_INFOEXG_SAVE_INITDataSet ds = null;

        // Request Parameter Processing
        String clsf = "1";    //�Խ��Ǳ��� �Ǹű�
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�

        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));  //���Ź�������
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //���źμ�����
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //������������
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        if( "".equals(pageno)) { pageno = "1"; }
        if( "".equals(pagesize)) { pagesize = "10"; }

        // DM Setting
        SS_L_INFOEXG_SAVE_INITDM dm = new SS_L_INFOEXG_SAVE_INITDM();
        dm.setClsf(clsf);
        dm.setCmpycd(cmpycd);

        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� writeInfoexg ȣ��
		ds = dao.writeInfoexg(dm);
		req.setAttribute("ds", ds);

        req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("rmsgexttcd", rmsgexttcd);
        req.setAttribute("rmsgdept", rmsgdept);
        req.setAttribute("rmsgarea", rmsgarea);
        req.setAttribute("pageno", pageno);
        req.setAttribute("pagesize", pagesize);

		/*
        SSShare1300EJBHome home = (SSShare1300EJBHome) JNDIManager.getInstance().getHome("SSShare1300EJB");
        try {
            SSShare1300EJB ejb = home.create();
            ds = ejb.writeInfoexg(dm);
            req.setAttribute("ds", ds);

            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgexttcd", rmsgexttcd);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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
     * ��������-�Խ��� ��������-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void mo_insertInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{ //����Ͽ�
    	System.out.println("291");
        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String notifrdt = null;    //�Խý������� (�������׿����� ���)
        String notitodt = null;    //�Խ��������� (�������׿����� ���)
        String answergrp = null;   //�亯�׷� (�Ǹű�,�̽�,�Ź���,����򿡼��� ���)
        String answerseq = null;   //�亯���� (�Ǹű�,�̽�,�Ź���,����򿡼��� ���)
        String answerlevl = null;  //�亯���� (�Ǹű�,�̽�,�Ź���,����򿡼��� ���)
        String tmp = null;
        String cont1 = null;
        String cont2 = null;
        String cont3 = null;
        String cont4 = null;
        String cont5 = null;

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
        	System.out.println("e : " + e.toString());
            throw new AppException("[SSShare1300WB.insertInfoexg()]","[SSShare1300WB.insertInfoexg()]÷���� ������ ũ�Ⱑ �ʹ� ũ�ų�, ������ �ùٸ��� �ʽ��ϴ�.");
        } catch (Exception e) {
        	System.out.println("e : " + e.toString());
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String deptcd 		= Util.checkString(req.getParameter("deptcd")); //�Ǹźμ��ڵ�
        String deptnm 		= Util.Uni2Ksc(Util.checkString(req.getParameter("deptnm"))); //�Ǹźμ���
        String makepersid 	= Util.checkString(req.getParameter("makepersid"));//�����ID
        String makepersnm 	=   Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));//����ڸ�

        // Request Parameter Processing
        String clsf 	        = Util.checkString((String)ht.get("clsf"));
        //���������ϰ��
        if(clsf.equals("1")){
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }
        //���������� �ƴҰ��
        else if(clsf.equals("2") || clsf.equals("3") || clsf.equals("4") || clsf.equals("5")){
            answergrp = Util.checkString( (String) ht.get("answergrp"));
            answerseq = Util.checkString( (String) ht.get("answerseq"));
            answerlevl = Util.checkString( (String) ht.get("answerlevl"));
        }

        String email 		= Util.checkString((String)ht.get("email"));
        String hmpg 		= Util.checkString((String)ht.get("hmpg"));
        String titl 		= Util.Uni2Ksc(Util.checkString((String)ht.get("titl")));
        // ���󿡵��� ����� ����ǥ���� ""�� �ʿ���. 20090410
        String cont 		= Util.Uni2Ksc(Util.checkString((String)ht.get("cont")));

        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));
        String rmsgexttcd 		= Util.checkString((String)ht.get("rmsgexttcd")); //���Ź���
        String rmsgdept 		= Util.checkString((String)ht.get("rmsgdept")); //���źμ�
        String rmsgarea 		= Util.checkString((String)ht.get("rmsgarea")); //��������

        //���Ź����� ��ü�� ��� ���źμ�, �������� �ʱ�ȭ
        if(rmsgexttcd.equals("40")) {
        	rmsgdept = "";
        	rmsgarea = "";
        }

        // ��� �Է½� Ư�� ���� ó��

        tmp = Util.replace(titl, "'", "&#39;");
        titl = Util.replace(tmp, "\"", "&#34;");
        tmp = Util.replace(titl, "��", "&#183;");
        titl = tmp;

        // ���� üũ ����
        if(!cont.equals("")){
            String cont_tmp = cont;
            String[] contents = new String[5];
            int k=0;

            cont = Util.replace(cont_tmp, "'", "&#39");
            //cont_tmp = Util.replace(cont, "\"", "&#34");
            cont = Util.replace(cont_tmp, "��", "&#183");
            cont_tmp = cont;

            for( k=0; cont_tmp.length() > 2000 && k < 5; k++){
                contents[k] = cont_tmp.substring(0, 2000);
                cont_tmp = cont_tmp.substring(2000);
            }
            // ������ 2000����Ʈ���� �������
            if(cont_tmp.length() > 0 && k == 0){
                cont1 = cont_tmp;
                cont2 = "";
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 2000 ũ�� 4000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 1){
                cont1 = contents[0];
                cont2 = cont_tmp;
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 4000 ũ�� 6000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 2){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = cont_tmp;
                cont4 = "";
                cont5 = "";
            }
            //	������ 6000 ũ�� 8000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 3){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = cont_tmp;
                cont5 = "";
            }
            // ������ 8000 ũ�� 10000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 4){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = cont_tmp;
            }
            //	������ 10000����Ʈ���� Ŭ��� 10000����Ʈ �̻��� ����� ����
            else if(cont_tmp.length() > 0 && k == 5){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = contents[4];
            }
        }
        // ������ �Է����� �ʾ��� ���
        else{
            cont1 = "";
            cont2 = "";
            cont3 = "";
            cont4 = "";
            cont5 = "";
        }
        // ���� üũ ��

        System.out.println("deptcd="+deptcd);
        System.out.println("deptnm="+deptnm);
        System.out.println("makepersid="+makepersid);
        System.out.println("makepersnm="+makepersnm);
        System.out.println("clsf="+clsf);
        System.out.println("email="+email);
        System.out.println("hmpg="+hmpg);
        System.out.println("titl="+titl);
        System.out.println("cont="+cont);
        System.out.println("filenm="+filenm);
        System.out.println("rmsgexttcd="+rmsgexttcd);
        System.out.println("rmsgdept="+rmsgdept);
        System.out.println("rmsgarea="+rmsgarea);
        System.out.println("cont1="+cont1);
        System.out.println("cont2="+cont2);
        System.out.println("cont3="+cont3);
        System.out.println("cont4="+cont4);
        System.out.println("cont5="+cont5);


        // DM Setting
        SS_I_INFOEXGDM dm = new SS_I_INFOEXGDM();

        dm.setClsf(clsf);
        if(clsf.equals("1")){
            dm.setNotifrdt(notifrdt);
            dm.setNotitodt(notitodt);
        }else if(clsf.equals("2") || clsf.equals("3") || clsf.equals("4") || clsf.equals("5")){
            dm.setAnswergrp(Long.parseLong(answergrp));
            dm.setAnswerseq(Long.parseLong(answerseq));
            dm.setAnswerlevl(Long.parseLong(answerlevl));
        }
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setEmail(email);
        dm.setHmpg(hmpg);
        dm.setTitl(titl);
        dm.setCont1(cont1);
        dm.setCont2(cont2);
        dm.setCont3(cont3);
        dm.setCont4(cont4);
        dm.setCont5(cont5);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setRmsgexttcd(rmsgexttcd);
        dm.setRmsgdept(rmsgdept);
        dm.setRmsgarea(rmsgarea);
        dm.setIncmgpers(makepersid);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� insertInfoexg ȣ��
        bResult = dao.insertInfoexg(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";


            //GCM Sending

        	String API_KEY = "AIzaSyA9_1WV0k74rUlYAwnCgEoWZzNND757BIo";

            try {
            	// Prepare JSON containing the GCM message content. What to send and where to send.
                JSONObject jGcmData = new JSONObject();
                System.out.println(jGcmData.toString());
                JSONObject jData = new JSONObject();
                System.out.println(jData.toString());
                jData.put("message", "NOTI");
//                jData.put("message", "NOTI");

                // Where to send GCM message.
                System.out.println();
                jGcmData.put("to", "/topics/global");
//                jGcmData.put("to", "/topics/19770");
//                jGcmData.put("to", "d3LI0dS2NGk:APA91bFlpzkL-RMNZez2sykixLzLMpJFGyYR43r6KC1UfiWYe3gPHMjuUpaclLF20-djbjbl8NppOnzbw-_24Q_JH0VsifNy8K4SfUUR1SKDq7p1Mg889lUi_yDalnB5Vi6vXURUnOtv");

                // What to send in GCM message.
                jGcmData.put("data", jData);
                // Create connection to send GCM Message request.
                URL url = new URL("https://android.googleapis.com/gcm/send");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestProperty("Authorization", "key=" + API_KEY);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                // Send GCM message content.
                OutputStream outputStream = conn.getOutputStream();
                outputStream.write(jGcmData.toString().getBytes());
                // Read GCM response.
                InputStream inputStream = conn.getInputStream();                
                //String resp = IOUtils.toString(inputStream);
                //System.out.println(resp);
                System.out.println("Check your device/emulator for notification or logcat for " +
                        "confirmation of the receipt of the GCM message.");
            } catch (Exception e) {
                System.out.println("Unable to send GCM message.");
                System.out.println("Please ensure that API_KEY has been replaced by the server " +
                        "API key, and that the device's registration token is correct (if specified)...");
                e.printStackTrace();
            }

         }
		System.out.println("sResult=="+sResult);
         req.setAttribute("result", sResult); // request�� ������� ��´�.
    }


    /**
     * ��������-�Խ��� ��������-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void updateInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{

        PrintWriter out = null;
        Hashtable ht = new Hashtable();
        String notifrdt = null;    //�Խý������� (�������׿����� ���)
        String notitodt = null;    //�Խ��������� (�������׿����� ���)
        String tmp = null;
        String cont1 = null;
        String cont2 = null;
        String cont3 = null;
        String cont4 = null;
        String cont5 = null;

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
            throw new AppException("[SSShare1300WB.updateInfoexg()]","[SSShare1300WB.updateInfoexg()]÷���� ������ ũ�Ⱑ �ʹ� ũ�ų�, ������ �ùٸ��� �ʽ��ϴ�.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Session Processing
        String makepersid 	= Util.getSessionParameterValue(req, "uid", true);//�����ID
        String makepersnm 	= Util.getSessionParameterValue(req, "emp_nm", false);//����ڸ�

        // Request Parameter Processing
        String clsf 	        = Util.checkString((String)ht.get("clsf"));
        if(clsf.equals("1")){
            notifrdt = Util.checkString( (String) ht.get("notifrdt"));
            notitodt = Util.checkString( (String) ht.get("notitodt"));
        }
        String email 		= Util.checkString((String)ht.get("email"));
        String hmpg 		= Util.checkString((String)ht.get("hmpg"));
        String titl 		= Util.Uni2Ksc(Util.checkString((String)ht.get("titl")));

        // ���󿡵��� ����� ����ǥ���� ""�� �ʿ���. 20090410
        //String cont 		= Util.Uni2Ksc(Util.checkString((String)ht.get("cont")));
        String cont 		= Util.Uni2Ksc((String)ht.get("cont"));

        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));
        String seq 				= Util.Uni2Ksc(Util.checkString((String)ht.get("seq")));
        String search_word 		= Util.Uni2Ksc(Util.checkString((String)ht.get("search_word")));
        String search_word_kind = Util.Uni2Ksc(Util.checkString((String)ht.get("search_word_kind")));
        String rmsgexttcd_param	= Util.checkString((String)ht.get("rmsgexttcd_param")); //���Ź��� param
        String rmsgdept_param 	= Util.checkString((String)ht.get("rmsgdept_param")); //���źμ� param
        String rmsgarea_param 	= Util.checkString((String)ht.get("rmsgarea_param")); //�������� param
        String pageno 			= Util.Uni2Ksc(Util.checkString((String)ht.get("pageno")));
        String pagesize 		= Util.Uni2Ksc(Util.checkString((String)ht.get("pagesize")));
        String brwscnt 			= Util.checkString((String)ht.get("brwscnt"));
        String rmsgexttcd 		= Util.checkString((String)ht.get("rmsgexttcd")); //���Ź���
        String rmsgdept 		= Util.checkString((String)ht.get("rmsgdept")); //���źμ�
        String rmsgarea 		= Util.checkString((String)ht.get("rmsgarea")); //��������

        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);
        //String incmgpers    = "user_id";

        // ��� �Է½� Ư�� ���� ó��

        tmp = Util.replace(titl, "'", "&#39");
        titl = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(titl, "��", "&#183");
        titl = tmp;

        // ���� üũ ����
        if(!cont.equals("")){
            String cont_tmp = cont;
            String[] contents = new String[5];
            int k=0;

            cont = Util.replace(cont_tmp, "'", "&#39");
            //cont_tmp = Util.replace(cont, "\"", "&#34");
            cont = Util.replace(cont_tmp, "��", "&#183");
            cont_tmp = cont;

            for( k=0; cont_tmp.length() > 2000 && k < 5; k++){
                contents[k] = cont_tmp.substring(0, 2000);
                cont_tmp = cont_tmp.substring(2000);
            }

            // ������ 2000����Ʈ���� �������
            if(cont_tmp.length() > 0 && k == 0){
                cont1 = cont_tmp;
                cont2 = "";
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 2000 ũ�� 4000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 1){
                cont1 = contents[0];
                cont2 = cont_tmp;
                cont3 = "";
                cont4 = "";
                cont5 = "";
            }
            //	������ 4000 ũ�� 6000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 2){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = cont_tmp;
                cont4 = "";
                cont5 = "";
            }
            //	������ 6000 ũ�� 8000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 3){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = cont_tmp;
                cont5 = "";
            }
            // ������ 8000 ũ�� 10000����Ʈ���� ���� ���
            else if(cont_tmp.length() > 0 && k == 4){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = cont_tmp;
            }
            //	������ 10000����Ʈ���� Ŭ��� 10000����Ʈ �̻��� ����� ����
            else if(cont_tmp.length() > 0 && k == 5){
                cont1 = contents[0];
                cont2 = contents[1];
                cont3 = contents[2];
                cont4 = contents[3];
                cont5 = contents[4];
            }
        }
        // ������ �Է����� �ʾ��� ���
        else{
            cont1 = "";
            cont2 = "";
            cont3 = "";
            cont4 = "";
            cont5 = "";
        }
        // ���� üũ ��

        // DM Setting
        SS_U_INFOEXGDM dm = new SS_U_INFOEXGDM();

        dm.setClsf(clsf);
        if(clsf.equals("1")){
            dm.setNotifrdt(notifrdt);
            dm.setNotitodt(notitodt);
        }
        dm.setSeq(Long.parseLong(seq));
        dm.setEmail(email);
        dm.setHmpg(hmpg);
        dm.setTitl(titl);
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setCont1(cont1);
        dm.setCont2(cont2);
        dm.setCont3(cont3);
        dm.setCont4(cont4);
        dm.setCont5(cont5);
        dm.setRmsgdept(rmsgdept);
        dm.setRmsgarea(rmsgarea);
        dm.setRmsgexttcd(rmsgexttcd);
        dm.setChgpers(incmgpers);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }

        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� updateInfoexg ȣ��
        bResult = dao.updateInfoexg(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("seq", seq);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("rmsgexttcd", rmsgexttcd_param);
         req.setAttribute("rmsgdept", rmsgdept_param);
         req.setAttribute("rmsgarea", rmsgarea_param);
         req.setAttribute("pageno", pageno);
         req.setAttribute("pagesize", pagesize);
         req.setAttribute("brwscnt", brwscnt);
         req.setAttribute("result", sResult); // request�� ������� ��´�.

    }
    /**
     * ��������-�Խ��� ��������-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_D_INFOEXGDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));  //���Ź�������
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //���źμ�����
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //������������
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));


        // DM Setting
        SS_D_INFOEXGDM dm = new SS_D_INFOEXGDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        dm.setIncmgpers(incmgpers);

        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� deleteInfoexg ȣ��
        bResult = dao.deleteInfoexg(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("search_word", search_word);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("rmsgexttcd", rmsgexttcd);
         req.setAttribute("rmsgdept", rmsgdept);
         req.setAttribute("rmsgarea", rmsgarea);
         req.setAttribute("pageno", pageno);
         req.setAttribute("pagesize", pagesize);
         req.setAttribute("result", sResult); // request�� ������� ��´�.
		/*
        SSShare1300EJBHome home = (SSShare1300EJBHome) JNDIManager.getInstance().getHome("SSShare1300EJB");
        try {
            SSShare1300EJB ejb = home.create();
            bResult = ejb.deleteInfoexg(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgexttcd", rmsgexttcd);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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
     * ��������-�Խ��� ��������-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectInfoexgDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_INFOEXGDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�

        /* 2006.06.12 ���� �߰� */
        String chgpers = Util.getSessionParameterValue(req, "uid", true); 	//��ȸ�� ���̵�

        //String cmpycd = "100";
        String clsf = "1";    //�Խ��Ǳ��� �Ǹű�

        String seq = Util.checkString(req.getParameter("seq"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));  //���Ź�������
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //���źμ�����
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //������������
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String brwscnt = Util.checkString(req.getParameter("brwscnt"));

        // DM Setting
        SS_S_INFOEXGDM dm = new SS_S_INFOEXGDM();
        dm.setCmpycd(cmpycd);
        dm.setClsf(clsf);
        dm.setSeq(Long.parseLong(seq));
        dm.setUid(chgpers); //2006.06.12 ���� �߰�
        if (!brwscnt.equals("")){
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }


        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� selectInfoexgDetail ȣ��
		ds = dao.selectInfoexgDetail(dm);
		req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("rmsgexttcd", rmsgexttcd);
        req.setAttribute("rmsgdept", rmsgdept);
        req.setAttribute("rmsgarea", rmsgarea);
        req.setAttribute("pageno", pageno);
        req.setAttribute("pagesize", pagesize);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
    }

    /**
     * ��������-�Խ��� ��������-�ٿ�ε�
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void dwloadInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_INFOEXG_DWLOADDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));

        // DM Setting
        SS_S_INFOEXG_DWLOADDM dm = new SS_S_INFOEXG_DWLOADDM();
        dm.setSeq(Long.parseLong(seq));
        if (!dwloadcnt.equals("")){
            dm.setDwloadcnt(Long.parseLong(dwloadcnt));
        }

        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� dwloadInfoexg ȣ��
		ds = dao.dwloadInfoexg(dm);
		req.setAttribute("filecont", ds.filecont); // request�� ������� ��´�.
        req.setAttribute("filenm", ds.filenm); // request�� ������� ��´�.

        /*
        SSShare1300EJBHome home = (SSShare1300EJBHome) JNDIManager.getInstance().getHome("SSShare1300EJB");
        try {
            SSShare1300EJB ejb = home.create();
            ds = ejb.dwloadInfoexg(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

//            req.setAttribute("ds", ds);
//20050708 ��뼷 ����            req.setAttribute("filecont", ds.filecont); // request�� ������� ��´�.

//20060608 ���� ����
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

    /**
     * ��������-�Խ��� ��������-��õ
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void recomInfoexg(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_INFOEXG_RECOMDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String rmsgexttcd = Util.checkString(req.getParameter("rmsgexttcd"));  //���Ź�������
        String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));  //���źμ�����
        String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));  //������������
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String brwscnt 	= Util.checkString(req.getParameter("brwscnt"));
        String recomcnt = Util.checkString(req.getParameter("recomcnt"));

        // DM Setting
        SS_U_INFOEXG_RECOMDM dm = new SS_U_INFOEXG_RECOMDM();

        dm.setSeq(Long.parseLong(seq));
        dm.setClsf(clsf);
        dm.setIncmgpers(incmgpers);
        if (!recomcnt.equals("")){
            dm.setRecomcnt(Long.parseLong(recomcnt));
        }

        SSShare1300DAO dao = new SSShare1300DAO();
		// DAO ��ü�� recomInfoexg ȣ��
        bResult = dao.recomInfoexg(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("seq", seq);
         req.setAttribute("search_word", search_word);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("rmsgexttcd", rmsgexttcd);
         req.setAttribute("rmsgdept", rmsgdept);
         req.setAttribute("rmsgarea", rmsgarea);
         req.setAttribute("pageno", pageno);
         req.setAttribute("pagesize", pagesize);
         req.setAttribute("brwscnt", brwscnt);
         req.setAttribute("result", sResult); // request�� ������� ��´�.

         /*
        SSShare1300EJBHome home = (SSShare1300EJBHome) JNDIManager.getInstance().getHome("SSShare1300EJB");
        try {
            SSShare1300EJB ejb = home.create();
            bResult = ejb.recomInfoexg(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("seq", seq);
            req.setAttribute("search_word", search_word);
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("rmsgexttcd", rmsgexttcd);
            req.setAttribute("rmsgdept", rmsgdept);
            req.setAttribute("rmsgarea", rmsgarea);
            req.setAttribute("pageno", pageno);
            req.setAttribute("pagesize", pagesize);
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
}

/* �ۼ��ð� : Tue Nov 18 11:50:05 KST 2003 */
