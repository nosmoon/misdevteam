/***************************************************************************************************
* ���ϸ� : SSShare2100WB.java
* ��� : ��������-Ÿ�絿�⺸�� ó���� ���� Work Bean
* �ۼ����� : 2003-12-29
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
 * ��������-Ÿ�絿�⺸�� ���� WB
 *
 */

public class SSShare2100WB{

    public int filesize = 5*1024*1024;
    /**
     * ��������-Ÿ�絿�⺸��-��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param HttpServletResponse res
     **/

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_OTHRPT_INITDataSet ds = null;

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
        SS_L_OTHRPT_INITDM dm = new SS_L_OTHRPT_INITDM();
        dm.setUid(uid);
        dm.setSb_dealdeptcd(sb_dealdeptcd);
        dm.setDeptplacyn(deptplacyn);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare2100DAO dao = new SSShare2100DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare2100EJBHome home = (SSShare2100EJBHome) JNDIManager.getInstance().getHome("SSShare2100EJB");
        try {
            SSShare2100EJB ejb = home.create();
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
     * ��������-Ÿ�絿�⺸��-�˻���ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_OTHRPT_SRCHDataSet ds = null;
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
        SS_L_OTHRPT_SRCHDM dm = new SS_L_OTHRPT_SRCHDM();

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

        SSShare2100DAO dao = new SSShare2100DAO();
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
        SSShare2100EJBHome home = (SSShare2100EJBHome) JNDIManager.getInstance().getHome("SSShare2100EJB");
        try {
            SSShare2100EJB ejb = home.create();
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
     * ��������-Ÿ�絿�⺸��-�۾�����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void writeOthrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{
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
     * ��������-Ÿ�絿�⺸��-����(���)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void insertOthrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{

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
            throw new AppException("[SSShare2100WB.insertDawnrpt()]","[SSShare2100WB.insertDawnrpt()]÷���� ������ ũ�Ⱑ �ʹ� ũ�ų�, ������ �ùٸ��� �ʽ��ϴ�.");
        } catch (Exception e) {
           e.printStackTrace(out);
        }

        // Session Processing
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);
        String deptcd    = Util.getSessionParameterValue(req, "selldeptcd", false);
        String deptnm 		= Util.getSessionParameterValue(req, "selldeptnm", false);
        String makepersid 	= Util.getSessionParameterValue(req, "uid", true);
        String makepersnm 	= Util.getSessionParameterValue(req, "emp_nm", false);

        // Request Parameter Processing(�Է�)
        String makedt 		= Util.checkString((String)ht.get("makedt"));
        String jungpoly  	= Util.Uni2Ksc(Util.checkString((String)ht.get("jungpoly")));
        String jungmovmt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("jungmovmt")));
        String jungetc  	= Util.Uni2Ksc(Util.checkString((String)ht.get("jungetc")));
        String dongpoly     = Util.Uni2Ksc(Util.checkString((String)ht.get("dongpoly")));
        String dongmovmt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("dongmovmt")));
        String dongetc   	= Util.Uni2Ksc(Util.checkString((String)ht.get("dongetc")));
        String etcpoly  	= Util.Uni2Ksc(Util.checkString((String)ht.get("etcpoly")));
        String etcmovmt     = Util.Uni2Ksc(Util.checkString((String)ht.get("etcmovmt")));
        String etcetc   	= Util.Uni2Ksc(Util.checkString((String)ht.get("etcetc")));
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
        tmp = Util.replace(jungpoly, "'", "&#39");
        jungpoly = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(jungpoly, "��", "&#183");
        jungpoly = tmp;

        tmp = Util.replace(jungmovmt, "'", "&#39");
        jungmovmt = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(jungmovmt, "��", "&#183");
        jungmovmt = tmp;

        tmp = Util.replace(jungetc, "'", "&#39");
        jungetc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(jungetc, "��", "&#183");
        jungetc = tmp;

        tmp = Util.replace(dongpoly, "'", "&#39");
        dongpoly = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(dongpoly, "��", "&#183");
        dongpoly = tmp;

        tmp = Util.replace(dongmovmt, "'", "&#39");
        dongmovmt = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(dongmovmt, "��", "&#183");
        dongmovmt = tmp;

        tmp = Util.replace(dongetc, "'", "&#39");
        dongetc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(dongetc, "��", "&#183");
        dongetc = tmp;

        tmp = Util.replace(etcpoly, "'", "&#39");
        etcpoly = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etcpoly, "��", "&#183");
        etcpoly = tmp;

        tmp = Util.replace(etcmovmt, "'", "&#39");
        etcmovmt = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etcmovmt, "��", "&#183");
        etcmovmt = tmp;

        tmp = Util.replace(etcetc, "'", "&#39");
        etcetc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etcetc, "��", "&#183");
        etcetc = tmp;

        // DM Setting
        SS_I_OTHRPTDM dm = new SS_I_OTHRPTDM();

        dm.setMakedt(makedt);
        dm.setMakepersid(makepersid);
        dm.setMakepersnm(makepersnm);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);

        dm.setJungpoly(jungpoly);
        dm.setJungmovmt(jungmovmt);
        dm.setJungetc(jungetc);
        dm.setDongpoly(dongpoly);
        dm.setDongmovmt(dongmovmt);
        dm.setDongetc(dongetc);
        dm.setEtcpoly(etcpoly);
        dm.setEtcmovmt(etcmovmt);
        dm.setEtcetc(etcetc);

        dm.setIncmgpers(incmgpers);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }
        
        SSShare2100DAO dao = new SSShare2100DAO();
		// DAO ��ü�� insertOthrpt ȣ��
        bResult = dao.insertOthrpt(dm);
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
        SSShare2100EJBHome home = (SSShare2100EJBHome) JNDIManager.getInstance().getHome("SSShare2100EJB");
        try {
            SSShare2100EJB ejb = home.create();
            bResult = ejb.insertOthrpt(dm);
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
     * ��������-Ÿ�絿�⺸��-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void updateOthrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{

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
            throw new AppException("[SSShare2100WB.updateOthrpt()]","[SSShare2100WB.updateOthrpt()]÷���� ������ ũ�Ⱑ �ʹ� ũ�ų�, ������ �ùٸ��� �ʽ��ϴ�.");
        } catch (Exception e) {
           e.printStackTrace(out);
        }

        // Request Parameter Processing
        String seq 			= Util.checkString((String)ht.get("seq"));
        String makedt 		= Util.checkString((String)ht.get("makedt"));
        String makepersid 	= Util.checkString((String)ht.get("makepersid"));
        String makepersnm   = Util.Uni2Ksc(Util.checkString((String)ht.get("makepersnm")));

        String jungpoly  	= Util.Uni2Ksc(Util.checkString((String)ht.get("jungpoly")));
        String jungmovmt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("jungmovmt")));
        String jungetc  	= Util.Uni2Ksc(Util.checkString((String)ht.get("jungetc")));
        String dongpoly     = Util.Uni2Ksc(Util.checkString((String)ht.get("dongpoly")));
        String dongmovmt 	= Util.Uni2Ksc(Util.checkString((String)ht.get("dongmovmt")));
        String dongetc   	= Util.Uni2Ksc(Util.checkString((String)ht.get("dongetc")));
        String etcpoly  	= Util.Uni2Ksc(Util.checkString((String)ht.get("etcpoly")));
        String etcmovmt     = Util.Uni2Ksc(Util.checkString((String)ht.get("etcmovmt")));
        String etcetc   	= Util.Uni2Ksc(Util.checkString((String)ht.get("etcetc")));
        String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));

        // Request Parameter Processing(ȭ��ó��)
        String search_word =  Util.Uni2Ksc(Util.checkString((String)ht.get("search_word")));
        String search_word_kind = Util.checkString((String)ht.get("search_word_kind"));
        String srchdeptcd = Util.checkString((String)ht.get("srchdeptcd"));//�˻����� �μ��ڵ�
        String makedt1 = Util.checkString((String)ht.get("makedt1"));
        String makedt2 = Util.checkString((String)ht.get("makedt2"));
        String pageno = Util.checkString((String)ht.get("curr_page_no"));
        String pagesize = Util.checkString((String)ht.get("records_per_page"));
        String brwscnt 		= Util.checkString((String)ht.get("brwscnt"));

        // ���� üũ
       String uid = Util.getSessionParameterValue(req, "uid", true); //�����ID
       if (!makepersid.equals(uid)) {
           throw new AppException("[SSShare2100WB.updateOthrpt()]", "[SSShare2100WB.updateOthrpt()] ���������� �����ϴ�.");
       }

       // ��� �Է½� Ư�� ���� ó��

        tmp = Util.replace(jungpoly, "'", "&#39");
        jungpoly = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(jungpoly, "��", "&#183");
        jungpoly = tmp;

        tmp = Util.replace(jungmovmt, "'", "&#39");
        jungmovmt = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(jungmovmt, "��", "&#183");
        jungmovmt = tmp;

        tmp = Util.replace(jungetc, "'", "&#39");
        jungetc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(jungetc, "��", "&#183");
        jungetc = tmp;

        tmp = Util.replace(dongpoly, "'", "&#39");
        dongpoly = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(dongpoly, "��", "&#183");
        dongpoly = tmp;

        tmp = Util.replace(dongmovmt, "'", "&#39");
        dongmovmt = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(dongmovmt, "��", "&#183");
        dongmovmt = tmp;

        tmp = Util.replace(dongetc, "'", "&#39");
        dongetc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(dongetc, "��", "&#183");
        dongetc = tmp;

        tmp = Util.replace(etcpoly, "'", "&#39");
        etcpoly = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etcpoly, "��", "&#183");
        etcpoly = tmp;

        tmp = Util.replace(etcmovmt, "'", "&#39");
        etcmovmt = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etcmovmt, "��", "&#183");
        etcmovmt = tmp;

        tmp = Util.replace(etcetc, "'", "&#39");
        etcetc = Util.replace(tmp, "\"", "&#34");
        tmp = Util.replace(etcetc, "��", "&#183");
        etcetc = tmp;

        // DM Setting
        SS_U_OTHRPTDM dm = new SS_U_OTHRPTDM();

        dm.setSeq(Long.parseLong(seq));

        dm.setMakedt(makedt);
        dm.setJungpoly(jungpoly);
        dm.setJungmovmt(jungmovmt);
        dm.setJungetc(jungetc);
        dm.setDongpoly(dongpoly);
        dm.setDongmovmt(dongmovmt);
        dm.setDongetc(dongetc);
        dm.setEtcpoly(etcpoly);
        dm.setEtcmovmt(etcmovmt);
        dm.setEtcetc(etcetc);

        dm.setChgpers(makepersid);
        if (!filenm.equals("")){
            dm.setFilenm(filenm);
            dm.setFilesize(Integer.toString(filecont.length));
            dm.setFilecont(filecont);
        }
        
        SSShare2100DAO dao = new SSShare2100DAO();
		// DAO ��ü�� updateOthrpt ȣ��
        bResult = dao.updateOthrpt(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         // ���� �� ����ȸ�� ���
         req.setAttribute("seq", seq);
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("srchdeptcd", srchdeptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         req.setAttribute("brwscnt", brwscnt);
         req.setAttribute("result", sResult); // request�� ������� ��´�.
         req.setAttribute("result", sResult); // request�� ������� ��´�.
		
         /*
        SSShare2100EJBHome home = (SSShare2100EJBHome) JNDIManager.getInstance().getHome("SSShare2100EJB");
        try {
            SSShare2100EJB ejb = home.create();
            bResult = ejb.updateOthrpt(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            // ���� �� ����ȸ�� ���
            req.setAttribute("seq", seq);

            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);
            req.setAttribute("srchdeptcd", srchdeptcd);
            req.setAttribute("makedt1", makedt1);
            req.setAttribute("makedt2", makedt2);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
            req.setAttribute("brwscnt", brwscnt);
            req.setAttribute("result", sResult); // request�� ������� ��´�.
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
     * ��������-Ÿ�絿�⺸��-����
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void deleteOthrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_D_OTHRPTDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // ���� üũ
        String uid 	= Util.getSessionParameterValue(req, "uid", true);//�����ID
        String makepersid = Util.checkString(req.getParameter("makepersid"));//�ۼ���ID

        if(!makepersid.equals(uid)){
            throw new AppException("[SSShare2100WB.deleteOthrpt()]","[SSShare2100WB.deleteOthrpt()] ���������� �����ϴ�.");
        }

        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String makedt1 = Util.checkString(req.getParameter("makedt1"));
        String makedt2 = Util.checkString(req.getParameter("makedt2"));
        String search_word =  Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
        String search_word_kind = Util.checkString(req.getParameter("search_word_kind"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));

        // DM Setting
        SS_D_OTHRPTDM dm = new SS_D_OTHRPTDM();

        dm.setSeq(Long.parseLong(seq));

        SSShare2100DAO dao = new SSShare2100DAO();
		// DAO ��ü�� deleteOthrpt ȣ��
        bResult = dao.deleteOthrpt(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("search_word_kind", search_word_kind);
         req.setAttribute("search_word", search_word);
         req.setAttribute("deptcd", deptcd);
         req.setAttribute("makedt1", makedt1);
         req.setAttribute("makedt2", makedt2);
         req.setAttribute("curr_page_no", pageno);
         req.setAttribute("records_per_page", pagesize);
         req.setAttribute("result", sResult); // request�� ������� ��´�.
		
         /*
        SSShare2100EJBHome home = (SSShare2100EJBHome) JNDIManager.getInstance().getHome("SSShare2100EJB");
        try {
            SSShare2100EJB ejb = home.create();
            bResult = ejb.deleteOthrpt(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("search_word_kind", search_word_kind);
            req.setAttribute("search_word", search_word);
            req.setAttribute("deptcd", deptcd);
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
     * ��������-Ÿ�絿�⺸��-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectOthrptDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_OTHRPTDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));

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
        SS_S_OTHRPTDM dm = new SS_S_OTHRPTDM();
        dm.setSeq(Long.parseLong(seq));
        if (!brwscnt.equals("")){
            dm.setBrwscnt(Long.parseLong(brwscnt));
        }
        
        SSShare2100DAO dao = new SSShare2100DAO();
		// DAO ��ü�� selectOthrptDetail ȣ��
		ds = dao.selectOthrptDetail(dm);
		req.setAttribute("search_word", search_word);
        req.setAttribute("search_word_kind", search_word_kind);
        req.setAttribute("srchdeptcd", srchdeptcd);
        req.setAttribute("makedt1", makedt1);
        req.setAttribute("makedt2", makedt2);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
        
        /*
        SSShare2100EJBHome home = (SSShare2100EJBHome) JNDIManager.getInstance().getHome("SSShare2100EJB");
        try {
            SSShare2100EJB ejb = home.create();
            ds = ejb.selectOthrptDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
     * ��������-Ÿ�絿�⺸��-�ٿ�ε�
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void dwloadOthrpt(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_OTHRPT_DWLOADDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));

        // DM Setting
        SS_S_OTHRPT_DWLOADDM dm = new SS_S_OTHRPT_DWLOADDM();
        dm.setSeq(Long.parseLong(seq));
        if (!dwloadcnt.equals("")){
            dm.setDwloadcnt(Long.parseLong(dwloadcnt));
        }
        
        SSShare2100DAO dao = new SSShare2100DAO();
		// DAO ��ü�� dwloadOthrpt ȣ��
		ds = dao.dwloadOthrpt(dm);
		req.setAttribute("filecont", ds.filecont); // request�� ������� ��´�.
        req.setAttribute("filenm", ds.filenm); // request�� ������� ��´�.
		
        /*
        SSShare2100EJBHome home = (SSShare2100EJBHome) JNDIManager.getInstance().getHome("SSShare2100EJB");
        try {
            SSShare2100EJB ejb = home.create();
            ds = ejb.dwloadOthrpt(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
