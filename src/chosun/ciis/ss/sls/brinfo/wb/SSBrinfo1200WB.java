/***************************************************************************************************
* ���ϸ� : SSBrinfo1200WB.java
* ��� : ����Info-���������� ó���� ���� Worker Bean
* �ۼ����� : 2004-02-02
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-���������� ���� WB
 */

public class SSBrinfo1200WB{

    /**
     * ����Info-���������� �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_BO_HEAD_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_BO_HEAD_INITDM dm = new SS_L_BO_HEAD_INITDM();
        
        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
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
     * ����Info-���������� ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoheadList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BO_HEADDataSet ds = null;
        // Request Parameter Processing
        String jmgystgb = Util.checkString(req.getParameter("jmgystgb"));   //��౸���ڵ�
        String deptcd = Util.checkString(req.getParameter("deptcd"));       //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));       //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));           //�����ڵ�
        String bo_headnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headnm"))); //�������
        String bjnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bjnm")));      //�����θ�

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_BO_HEADDM dm = new SS_L_BO_HEADDM();
        dm.setJmgystgb(jmgystgb);
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setBo_headnm(bo_headnm); //�������
        dm.setBjnm(bjnm);      //�����θ�

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
		// DAO ��ü�� selectBoheadList ȣ��
		ds = dao.selectBoheadList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
            ds = ejb.selectBoheadList(dm);
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
     * ����Info-����������-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoheadDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_BO_HEADDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String prn = Util.checkString(req.getParameter("prn"));
        String bjjgseq = Util.checkString(req.getParameter("bjjgseq"));
        String bjjuminno = Util.checkString(req.getParameter("bjjuminno"));

        // DM Setting
        SS_S_BO_HEADDM dm = new SS_S_BO_HEADDM();
        dm.setBocd(bocd);
        dm.setPrn(prn);
        dm.setBjjgseq(bjjgseq);
        dm.setBjjuminno(bjjuminno);
        
        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
        // DAO ��ü�� selectBoheadDetail ȣ��
        ds = dao.selectBoheadDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
            ds = ejb.selectBoheadDetail(dm);
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
     * ����Info-����������-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoheadSajin(HttpServletRequest req, HttpServletResponse res) throws AppException{
        byte[] sajin = null;
        // Request Parameter Processing
        String prn = Util.checkString(req.getParameter("bjjuminno"));//������ �ֹι�ȣ
        
        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
        // DAO ��ü�� selectBoheadDetail ȣ��
        sajin = dao.selectBoheadSajin(prn);
        req.setAttribute("sajin", sajin);

        /*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
            sajin = ejb.selectBoheadSajin(prn);
            req.setAttribute("sajin", sajin);
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
     * ����Info-����������-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void updateBohead(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_BO_HEADDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        //requesting parameters
        final String DELIMITER = "##";

        StringBuffer sb_seq  = new StringBuffer("");     //�������� ����(����)
        StringBuffer sb_flnm = new StringBuffer("");     //������(����)
        StringBuffer sb_rshp = new StringBuffer("");     //����(����)
        StringBuffer sb_bidt = new StringBuffer("");     //�������(����)

        String[] seqs  = req.getParameterValues("seq");
        String[] flnms = req.getParameterValues("flnm");
        String[] rshps = req.getParameterValues("rshp");
        String[] bidts = req.getParameterValues("bidt");


        for(int i=0; i<seqs.length; i++){
        	sb_seq.append(DELIMITER + seqs[i]);
        	sb_flnm.append(DELIMITER + Util.Uni2Ksc(flnms[i]));
        	sb_rshp.append(DELIMITER + Util.Uni2Ksc(rshps[i]));
        	sb_bidt.append(DELIMITER + bidts[i]);
        }
        if(seqs.length > 0){
            sb_seq.delete(0,DELIMITER.length());
            sb_flnm.delete(0,DELIMITER.length());
            sb_rshp.delete(0,DELIMITER.length());
            sb_bidt.delete(0,DELIMITER.length());
        }


        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String prn = Util.checkString(req.getParameter("prn"));
        String bjjgseq = Util.checkString(req.getParameter("bjjgseq"));
        String bjjuminno = Util.checkString(req.getParameter("bjjuminno"));

        String lastschir = Util.checkString(req.getParameter("lastschir"));
        String nativ = Util.checkString(req.getParameter("nativ"));
        String hby = Util.Uni2Ksc(Util.checkString(req.getParameter("hby")));
        String spc = Util.Uni2Ksc(Util.checkString(req.getParameter("spc")));
        String relg = Util.Uni2Ksc(Util.checkString(req.getParameter("relg")));
        String drink = Util.Uni2Ksc(Util.checkString(req.getParameter("drink")));
        String smok = Util.Uni2Ksc(Util.checkString(req.getParameter("smok")));
        String idea1 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea1")));
        String idea2 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea2")));
        String idea3 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea3")));

        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String ideamakepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("ideamakepersnm")));

        // DM Setting
        SS_U_BO_HEADDM dm = new SS_U_BO_HEADDM();
        dm.setBocd(bocd);
        dm.setPrn(prn);
        dm.setLastschir(lastschir);
        dm.setNativ(nativ);
        dm.setHby(hby);
        dm.setSpc(spc);
        dm.setRelg(relg);
        dm.setDrink(drink);
        dm.setSmok(smok);
        dm.setIdea1(idea1);
        dm.setIdea2(idea2);
        dm.setIdea3(idea3);
        dm.setIncmgpers(incmgpers);
        dm.setIdeamakepersnm(ideamakepersnm);
        dm.setSb_seq(sb_seq.toString());
        dm.setSb_flnm(sb_flnm.toString());
        dm.setSb_rshp(sb_rshp.toString());
        dm.setSb_bidt(sb_bidt.toString());

        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
		// DAO ��ü�� updateBohead ȣ��
        bResult = dao.updateBohead(dm);
        
        if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
        }
        req.setAttribute("bocd", bocd);
        req.setAttribute("prn", prn);
        req.setAttribute("bjjgseq", bjjgseq);
        req.setAttribute("bjjuminno", bjjuminno);
         
		/*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
            bResult = ejb.updateBohead(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("bocd", bocd);
            req.setAttribute("prn", prn);
            req.setAttribute("bjjgseq", bjjgseq);
            req.setAttribute("bjjuminno", bjjuminno);
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
     * ����Info-����������-������Ұ�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoheadIdeaList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BO_HEADIDEADataSet ds = null;
        // Request Parameter Processing
        String prn = Util.checkString(req.getParameter("prn"));
        String makepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_BO_HEADIDEADM dm = new SS_L_BO_HEADIDEADM();
        dm.setPrn(prn);
        dm.setMakepersnm(makepersnm);
        dm.setFrdt(frdt);
        dm.setTodt(todt);

        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
        
        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
        // DAO ��ü�� selectBoheadIdeaList ȣ��
        ds = dao.selectBoheadIdeaList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
            ds = ejb.selectBoheadIdeaList(dm);
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
     * ����Info-����������-������Ұ�-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoheadIdeaDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_BO_HEADIDEADataSet ds = null;
        // Request Parameter Processing
        String prn = Util.checkString(req.getParameter("prn"));
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        SS_S_BO_HEADIDEADM dm = new SS_S_BO_HEADIDEADM();
        dm.setPrn(prn);
        dm.setSeq(seq);
        
        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
        // DAO ��ü�� selectBoheadIdeaDetail ȣ��
        ds = dao.selectBoheadIdeaDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
            ds = ejb.selectBoheadIdeaDetail(dm);
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
     * ����Info-����������-������Ұ�-���,����,����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void accessBoheadIdea(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_BO_HEADIDEADataSet ds = null;

        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String makepersnm = Util.getSessionParameterValue(req, "emp_nm", false); // �ۼ��ڸ�

        String accflag = Util.checkString(req.getParameter("accflag"));
        String prn = Util.checkString(req.getParameter("prn"));
        String seq = Util.checkString(req.getParameter("seq"));
        String makedt = Util.checkString(req.getParameter("makedt"));
        String idea1 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea1")));
        String idea2 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea2")));
        String idea3 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea3")));

        // DM Setting
        SS_A_BO_HEADIDEADM dm = new SS_A_BO_HEADIDEADM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setPrn(prn);
        dm.setSeq(seq);
        dm.setMakedt(makedt);
        dm.setMakepersnm(makepersnm);
        dm.setIdea1(idea1);
        dm.setIdea2(idea2);
        dm.setIdea3(idea3);
        
        SSBrinfo1200DAO dao = new SSBrinfo1200DAO();
        // DAO ��ü�� accessBoheadIdea ȣ��
        ds = dao.accessBoheadIdea(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrinfo1200EJBHome home = (SSBrinfo1200EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1200EJB");
        try{
            SSBrinfo1200EJB ejb = home.create();
            ds = ejb.accessBoheadIdea(dm);
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