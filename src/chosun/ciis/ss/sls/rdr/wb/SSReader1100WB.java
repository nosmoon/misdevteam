/***************************************************************************************************
* ���ϸ� : SSReader1100WB.java
* ��� : ������Ȳ-���ں��� ó���� ���� Worker Bean
* �ۼ����� : 2004-01-12
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.move.dao.SSMove1000DAO;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDRDM;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDR_INITDM;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDRDataSet;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDR_INITDataSet;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dao.SSCommon1100DAO;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-���ں��� ���� WB
 */

public class SSReader1100WB{

    /**
     * ������Ȳ-���ں���-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_DSCT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_RDR_DSCT_INITDM dm = new SS_L_RDR_DSCT_INITDM();

        SSReader1100DAO dao = new SSReader1100DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1100EJBHome home = (SSReader1100EJBHome)JNDIManager.getInstance().getHome("SSReader1100EJB");
        try{
            SSReader1100EJB ejb = home.create();
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
     * ������Ȳ-���ں��� ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectRdrDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));  //����ڵ�
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //�Ⱓ��������
        String frdt = Util.checkString(req.getParameter("frdt")); //������
        String todt = Util.checkString(req.getParameter("todt")); //������
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm"))); //���ڸ�
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no"))); //���ڹ�ȣ
        String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl"))); //����
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont"))); //����
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //��������Ȯ�λ���
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));  //��������ó������ (Y:ó��, N:��ó��)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));  //�����Ҹ����� �ڵ�

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
        String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));     
        
        String expt_cic = Util.Uni2Ksc(Util.checkString(req.getParameter("expt_cic")));
        
        System.out.println("expt_cic : "+expt_cic);
        // DM Setting

        SS_L_RDR_DSCTDM dm = new SS_L_RDR_DSCTDM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setFromtogb(fromtogb);  //�Ⱓ����
        dm.setFrdt(frdt);   //������
        dm.setTodt(todt);   //������
        dm.setRdrnm(rdrnm); //���ڸ�
        dm.setRdr_no(rdr_no); //���ڹ�ȣ
        dm.setTitl(titl); //����
        dm.setCont(cont); //����
        dm.setBocnfmyn(bocnfmyn);  //��������Ȯ�λ���
        dm.setBoprocyn(boprocyn);  //��������ó������ (Y:ó��, N:��ó��)
        dm.setAcpnpathcd(acpnpathcd);  //����ڵ�
        dm.setDscttypecd(dscttypecd);  //�����Ҹ����� �ڵ�
        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        dm.setCns_empnm(cns_empnm);
        dm.setProcpers(procpers);
        dm.setExpt_cic(expt_cic);
        
        SSReader1100DAO dao = new SSReader1100DAO();
		// DAO ��ü�� selectRdrDsctList ȣ��
		ds = dao.selectRdrDsctList(dm);
		req.setAttribute("ds", ds);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
		
        /*
        SSReader1100EJBHome home = (SSReader1100EJBHome)JNDIManager.getInstance().getHome("SSReader1100EJB");
        try{
            SSReader1100EJB ejb = home.create();
            ds = ejb.selectRdrDsctList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * ������Ȳ-���ں���-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectRdrDsctDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_RDR_DSCTDM dm = new SS_S_RDR_DSCTDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSReader1100DAO dao = new SSReader1100DAO();
		// DAO ��ü�� selectRdrDsctDetail ȣ��
		ds = dao.selectRdrDsctDetail(dm);
		req.setAttribute("ds", ds);
		
		/*
		SSReader1100EJBHome home = (SSReader1100EJBHome)JNDIManager.getInstance().getHome("SSReader1100EJB");
        try{
            SSReader1100EJB ejb = home.create();
            ds = ejb.selectRdrDsctDetail(dm);
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
    
    public void initCampTm(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_CAMP_TM_EXTN_INITDataSet ds = null;
        
    	SS_L_CAMP_TM_EXTN_INITDM dm = new SS_L_CAMP_TM_EXTN_INITDM();

    	SSReader1100DAO dao = new SSReader1100DAO();
        // DAO ��ü�� init ȣ��
        ds = dao.initCampTm(dm);
        req.setAttribute("ds", ds);
    }

    public void selectCampTmList(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_CAMP_TM_EXTNDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String date_flag = Util.checkString(req.getParameter("date_flag"));
        String search_frdt = Util.checkString(req.getParameter("search_frdt"));
        String search_todt = Util.checkString(req.getParameter("search_todt"));
        String db_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("db_gubun")));
        String agentid = Util.checkString(req.getParameter("agentid"));
        String rdrnm = Util.checkString(req.getParameter("rdrnm"));
        String conn_gubun = Util.checkString(req.getParameter("conn_gubun"));
        String bocnfm = Util.checkString(req.getParameter("bocnfm"));
        String subscnfmstat = Util.checkString(req.getParameter("subscnfmstat"));
        String campid = Util.checkString(req.getParameter("campid"));

        // DM Setting
        SS_L_CAMP_TM_EXTNDM dm = new SS_L_CAMP_TM_EXTNDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setDate_flag(date_flag);
        dm.setSearch_frdt(search_frdt);
        dm.setSearch_todt(search_todt);
        dm.setDb_gubun(db_gubun);
        dm.setAgentnm(agentid);
        dm.setRdrnm(rdrnm);
        dm.setConn_gubun(conn_gubun);
        dm.setBocnfm(bocnfm);
        dm.setSubscnfmstat(subscnfmstat);
        dm.setCampid(campid);
        
        dm.print();
       
        SSReader1100DAO dao = new SSReader1100DAO();
        // DAO ��ü�� selectMoveList ȣ��
        ds = dao.selectCampTmList(dm);
        req.setAttribute("ds", ds);
        
    }
    
    public void selectTmAgentList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_L_TM_AGENTLISTDataSet ds = null;
        // Request Parameter Processing
        String search_frdt = Util.checkString(req.getParameter("search_frdt"));
        String search_todt = Util.checkString(req.getParameter("search_todt"));

        // DM Setting
        SS_L_TM_AGENTLISTDM dm = new SS_L_TM_AGENTLISTDM();
        dm.setSearch_frdt(search_frdt);
        dm.setSearch_todt(search_todt);
        
        dm.print();

        SSReader1100DAO dao = new SSReader1100DAO();
        // DAO ��ü�� selectBOList ȣ��
        ds = dao.selectTmAgentList(dm);
        req.setAttribute("ds", ds);
       
    }
    
    public void selectTmCampList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_L_TM_CAMPLISTDataSet ds = null;
        // Request Parameter Processing
        String search_frdt = Util.checkString(req.getParameter("search_frdt"));
        String search_todt = Util.checkString(req.getParameter("search_todt"));

        // DM Setting
        SS_L_TM_CAMPLISTDM dm = new SS_L_TM_CAMPLISTDM();
        dm.setSearch_frdt(search_frdt);
        dm.setSearch_todt(search_todt);
        
        dm.print();

        SSReader1100DAO dao = new SSReader1100DAO();
        // DAO ��ü�� selectBOList ȣ��
        ds = dao.selectTmCampList(dm);
        req.setAttribute("ds", ds);
       
    }
}
