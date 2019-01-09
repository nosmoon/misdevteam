/***************************************************************************************************
* ���ϸ� : SSExtn2200WB.java
 * ��� : ����Ȯ�帶�� ���� Worker Bean
* �ۼ����� : 2009-07-09
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
 * Ȯ����Ȳ-����Ȯ�帶�� �� ���� WB
 */

public class SSExtn2200WB{	

    /**
     * Ȯ����Ȳ-����Ȯ�帶��-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void extnExtnclosInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_TASLM_RDREXTNCLOS_INITDataSet ds = null;
    	
        // Request Parameter Processing
    	String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));

        // DM Setting
    	SS_L_TASLM_RDREXTNCLOS_INITDM dm = new SS_L_TASLM_RDREXTNCLOS_INITDM();
    	dm.setYyyymm(yyyymm);

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectDetailServAdjmList ȣ��
        ds = dao.extnExtnclosInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2200EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2200EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnExtnclosInit(dm);
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
     * Ȯ����Ȳ-����Ȯ�帶��-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void extnExtnclosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_TASLM_RDREXTNCLOSDataSet ds = null;

        // Request Parameter Processing
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String type1 = Util.Uni2Ksc(Util.checkString(req.getParameter("type1")));
    	String type2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type2")));
    	String resitype = Util.Uni2Ksc(Util.checkString(req.getParameter("resitype")));
    	String aplcpath = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpath")));
    	String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
    	String frqty = Util.Uni2Ksc(Util.checkString(req.getParameter("frqty")));
    	String toqty = Util.Uni2Ksc(Util.checkString(req.getParameter("toqty")));
    	
        // DM Setting
        SS_L_TASLM_RDREXTNCLOSDM dm = new SS_L_TASLM_RDREXTNCLOSDM();
        
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setType1(type1);
        dm.setType2(type2);
        dm.setResitype(resitype);
        dm.setAplcpath(aplcpath);
        dm.setFrdt(frdt);
        dm.setFlag(flag);
        dm.setFrqty(frqty);
        dm.setToqty(toqty);

        SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.extnExtnclosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2200EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2200EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnExtnclosList(dm);
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
     * Ȯ����Ȳ-����Ȯ�帶��-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void extnExtnclosUpdate(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_TASLM_RDREXTNCLOSDataSet ds = null;

        // Request Parameter Processing
    	String rdr_extnexclyn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnexclyn")));
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
    	
        // DM Setting
    	SS_U_TASLM_RDREXTNCLOSDM dm = new SS_U_TASLM_RDREXTNCLOSDM();
        
    	dm.setRdr_extnexclyn(rdr_extnexclyn);
    	dm.setCmpycd(cmpycd);
    	dm.setClosmm(closmm);
    	dm.setBocd(bocd);
    	dm.setRdr_no(rdr_no);
    	dm.setCntrno(cntrno);
    	dm.setMedicd(medicd);
    	dm.setSeq(seq);
    	   	
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.extnExtnclosUpdate(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2200EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2200EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnExtnclosUpdate(dm);
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
     * Ȯ����Ȳ-������������-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void extnBosuspclosInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_TASLM_BOSUSPCLOS_INITDataSet ds = null;

    	String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        // Request Parameter Processing

        // DM Setting
    	SS_L_TASLM_BOSUSPCLOS_INITDM dm = new SS_L_TASLM_BOSUSPCLOS_INITDM();
    	dm.setYyyymm(yyyymm);
    	dm.setIncmg_pers(emp_no);
        dm.setCmpy_cd(cmpycd);
        
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectDetailServAdjmList ȣ��
        ds = dao.extnBosuspclosInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2200EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2200EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnBosuspclosInit(dm);
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
     * Ȯ����Ȳ-������������-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void boclosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_BOCLOS_2DataSet ds = null;

    	String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fryy")));
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        // Request Parameter Processing

        // DM Setting
        SS_L_BOCLOS_2DM dm = new SS_L_BOCLOS_2DM();
    	dm.setYymm(yymm);
        
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectDetailServAdjmList ȣ��
        ds = dao.boclosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2200EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2200EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnBosuspclosInit(dm);
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
     * Ȯ����Ȳ-������������-�����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void extnBosuspclosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_TASLM_BOSUSPCLOSDataSet ds = null;

        // Request Parameter Processing
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String type1 = Util.Uni2Ksc(Util.checkString(req.getParameter("type1")));
    	String type2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type2")));
    	String resitype = Util.Uni2Ksc(Util.checkString(req.getParameter("resitype")));
    	String aplcpath = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpath")));
    	String suspresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("suspresncd")));
    	String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
    	String frqty = Util.Uni2Ksc(Util.checkString(req.getParameter("frqty")));
    	String toqty = Util.Uni2Ksc(Util.checkString(req.getParameter("toqty")));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	
        // DM Setting
    	SS_L_TASLM_BOSUSPCLOSDM dm = new SS_L_TASLM_BOSUSPCLOSDM();
        
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setType1(type1);
    	dm.setType2(type2);
    	dm.setResitype(resitype);
    	dm.setAplcpath(aplcpath);
    	dm.setSuspresncd(suspresncd);
    	dm.setFrdt(frdt);
    	dm.setFlag(flag);
    	dm.setFrqty(frqty);
    	dm.setToqty(toqty);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers(incmg_pers);

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.extnBosuspclosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2200EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2200EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnBosuspclosList(dm);
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
     * Ȯ����Ȳ-������������-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void extnBosuspclosUpdate(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_TASLM_BOSUSPCLOSDataSet ds = null;

        // Request Parameter Processing
    	String suspexclyn = Util.Uni2Ksc(Util.checkString(req.getParameter("suspexclyn")));
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
        // DM Setting
    	SS_U_TASLM_BOSUSPCLOSDM dm = new SS_U_TASLM_BOSUSPCLOSDM();
        
    	dm.setSuspexclyn(suspexclyn);
    	dm.setCmpycd(cmpycd);
    	dm.setClosmm(closmm);
    	dm.setBocd(bocd);
    	dm.setRdr_no(rdr_no);
    	dm.setSeq(seq);
    	
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.extnBosuspclosUpdate(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2200EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2200EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnBosuspclosUpdate(dm);
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
	 * Ȯ��ν�����-�ʱ�ȭ��
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
    public void initExtnClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_RDR_EXTNCLOS_INITDataSet ds = null;    	
        // Request Parameter Processing
        // DM Setting
        String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        
        SS_L_RDR_EXTNCLOS_INITDM dm = new SS_L_RDR_EXTNCLOS_INITDM();
        
        dm.setIncmg_pers(emp_no);
        dm.setCmpy_cd(cmpycd);
        
        SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� init ȣ��
        ds = dao.initExtnClos(dm);
        req.setAttribute("ds", ds);
    }
    
    
	/**
	 * Ȯ��ν�����-�����ȸ ��ȸ�� request���� set�Ѵ�.
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
	public void selectExtnClosList(HttpServletRequest req, HttpServletResponse res) throws AppException {

		SL_L_EXTNCLOSDataSet ds = null;
		SL_L_EXTNCLOSDM dm = new SL_L_EXTNCLOSDM();
		String pageno;
		String pagesize;
		
		dm.deptcd = Util.checkString(req.getParameter("deptcd"));
		dm.partcd = Util.checkString(req.getParameter("partcd"));
		dm.areacd = Util.checkString(req.getParameter("areacd"));
		dm.bocd   = Util.checkString(req.getParameter("bocd"));
		dm.closmm = Util.checkString(req.getParameter("closmm"));
		//dm.frextndt = Util.checkString(req.getParameter("frextndt"));
		//dm.toextndt = Util.checkString(req.getParameter("toextndt"));
		dm.extntype1 = Util.checkString(req.getParameter("extntype1"));
		dm.extntype2 = Util.checkString(req.getParameter("extntype2"));
		dm.searchcd = Util.checkString(req.getParameter("searchcd"));
		dm.ddremk = Util.checkString(req.getParameter("ddremk"));
		dm.issuspyn = Util.checkString(req.getParameter("issuspyn"));
		dm.bocfmyn = Util.checkString(req.getParameter("bocfmyn"));
		dm.ddcfmyn = Util.checkString(req.getParameter("ddcfmyn"));
		
		//dm.isremk = Util.checkString(req.getParameter("isremk"));
		dm.common_deptcd = Util.checkString(req.getParameter("common_deptcd"));
		dm.common_partcd = Util.checkString(req.getParameter("common_partcd"));
		dm.common_areacd = Util.checkString(req.getParameter("common_areacd"));

		pageno      = Util.checkString(req.getParameter("curr_page_no"));		//Long.parseLong(req.getParameter("pageno"));
		pagesize    = Util.checkString(req.getParameter("records_per_page")); 	//Long.parseLong(req.getParameter("pagesize"));
		dm.pageno   = ("".equals(pageno)) ? 1 : Long.parseLong(pageno); 		// 'pageno'�� Null�ϰ�� 1����ȯ
		dm.pagesize = ("".equals(pagesize)) ? 10 : Long.parseLong(pagesize); 	// 'pagesize'��

		//dm.print();
		
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.selectExtnClosList(dm);
        req.setAttribute("ds", ds);
		
		/* JNDI lookup �� ���� EJB Home interface ��ü����
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnClosList(dm); // ������ dm������ EJB�� ȣ��
			req.setAttribute("ds", ds); // request�� ������� Binding
			
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
	 * Ȯ��ν�����(��������ȸ) ��ȸ�� request���� set�Ѵ�.
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
	public void selectExtnClosDtls(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_S_EXTNCLOS_DTLSDataSet ds = null;
		SL_S_EXTNCLOS_DTLSDM dm = new SL_S_EXTNCLOS_DTLSDM();

		dm.bocd = Util.checkString(req.getParameter("bocd"));
		dm.extndt = Util.checkString(req.getParameter("extndt"));
		dm.rdr_no = Util.checkString(req.getParameter("rdr_no"));
		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.searchcd = Util.checkString(req.getParameter("searchcd"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();
			
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.selectExtnClosDtls(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup �� ���� EJB Home interface ��ü����
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnClosDtls(dm); // ������ dm������ EJB�� ȣ��
			req.setAttribute("ds", ds); 	 // request�� ������� Binding
				
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/

	}
	
	
	/**
	 * Ȯ��ν����� ����(�����Ұ�/���Ȯ�γ���)
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
	public void selectExtnClosUpdate(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_A_EXTNCLOS_DTLSDataSet ds = null;
		SL_A_EXTNCLOS_DTLSDM dm = new SL_A_EXTNCLOS_DTLSDM();

		String chgid = Util.getSessionParameterValue(req, "uid", true);
		
		dm.bocd = Util.checkString(req.getParameter("bocd"));
		dm.extndt = Util.checkString(req.getParameter("extndt"));
		dm.rdr_no = Util.checkString(req.getParameter("rdr_no"));
		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.workflag = Util.checkString(req.getParameter("workflag"));
		dm.bocont = Util.Uni2Ksc(Util.checkString(req.getParameter("bocont")));
		dm.ddcont = Util.Uni2Ksc(Util.checkString(req.getParameter("ddcont")));
		dm.seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
		dm.chgid = chgid;
		
		dm.print();

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.selectExtnClosUpdate(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup �� ���� EJB Home interface ��ü����
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnClosUpdate(dm); // ������ dm������ EJB�� ȣ��
			req.setAttribute("ds", ds); 	   // request�� ������� Binding
				
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/
	}
	
	
	/**
	 * Ȯ��ν����� ����IS�����ݿ�
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
	public void updateExtnclosIssup(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_U_EXTNCLOS_ISSUPDataSet ds = null;
		SL_U_EXTNCLOS_ISSUPDM dm = new SL_U_EXTNCLOS_ISSUPDM();

		String chgid = Util.getSessionParameterValue(req, "uid", true);

		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.chgid  = chgid;

		//dm.id = Util.checkString(req.getParameter("id"));
		//dm.frextndt = Util.checkString(req.getParameter("frextndt"));
		//dm.toextndt = Util.checkString(req.getParameter("toextndt"));
		//dm.frsuspdt = Util.checkString(req.getParameter("frsuspdt"));
		//dm.tosuspdt = Util.checkString(req.getParameter("tosuspdt"));

		//dm.print();

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.updateExtnclosIssup(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup �� ���� EJB Home interface ��ü����
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.updateExtnclosIssup(dm); // ������ dm������ EJB�� ȣ��
			req.setAttribute("ds", ds); 	   // request�� ������� Binding
				
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/
	}
	
	
	/**
	 * Ȯ��ν����� ��ǥ��ȸ
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
	public void selectExtnclosReport(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_L_EXTNCLOS_REPORTDataSet ds = null;
		SL_L_EXTNCLOS_REPORTDM dm = new SL_L_EXTNCLOS_REPORTDM();
		String pageno;
		String pagesize;

		dm.frextndt = Util.checkString(req.getParameter("frextndt"));
		dm.toextndt = Util.checkString(req.getParameter("toextndt"));
		dm.pageflag = Util.checkString(req.getParameter("pageflag"));
		
		pageno      = Util.checkString(req.getParameter("curr_page_no"));		//Long.parseLong(req.getParameter("pageno"));
		pagesize    = Util.checkString(req.getParameter("records_per_page")); 	//Long.parseLong(req.getParameter("pagesize"));
		dm.pageno   = ("".equals(pageno)) ? 1 : Long.parseLong(pageno); 		// 'pageno'�� Null�ϰ�� 1����ȯ
		dm.pagesize = ("".equals(pagesize)) ? 10 : Long.parseLong(pagesize); 	// 'pagesize'��
		
		//dm.pageno = Util.checkString(req.getParameter("pageno"));
		//dm.pagesize = Util.checkString(req.getParameter("pagesize"));

		//dm.print();

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.selectExtnclosReport(dm);
        req.setAttribute("ds", ds);
               
		/* JNDI lookup �� ���� EJB Home interface ��ü����
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnclosReport(dm); // ������ dm������ EJB�� ȣ��
			req.setAttribute("ds", ds); 	   // request�� ������� Binding
				
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/

	}
	
	
	/**
	 * Ȯ��ν����� ���˸���
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
	public void updateExtnClosClose(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_U_EXTNCLOS_CLOSEDataSet ds = null;
		SL_U_EXTNCLOS_CLOSEDM dm = new SL_U_EXTNCLOS_CLOSEDM();

		String chgid = Util.getSessionParameterValue(req, "uid", true);
		
		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.chgid  = chgid;
		dm.workno = Util.checkString(req.getParameter("workno"));

		//dm.print();

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.updateExtnClosClose(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup �� ���� EJB Home interface ��ü����
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.updateExtnClosClose(dm); // ������ dm������ EJB�� ȣ��
			req.setAttribute("ds", ds); 	   // request�� ������� Binding
				
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/
	}
	

	/**
	 * Ȯ�����-Ȯ��ν�����-��������/����IS���� �ݿ����� ��ȸ
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */	
	public void selectExtnClosInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_A_EXTNCLOS_CLOSINFODataSet ds = null;
		SL_A_EXTNCLOS_CLOSINFODM dm = new SL_A_EXTNCLOS_CLOSINFODM();

		dm.closmm = Util.checkString(req.getParameter("closmm"));

		dm.print();

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.selectExtnClosInfo(dm);
        req.setAttribute("ds", ds);
	}

	
	
	/**
	 * Ȯ�����-�������� ��ȸ/��������
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */	
	public void selectClosReport(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_L_CLOS_REPORTDataSet ds = null;
		SL_L_CLOS_REPORTDM dm = new SL_L_CLOS_REPORTDM();

		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.searchcd = Util.checkString(req.getParameter("searchcd"));

		dm.print();
		
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.selectClosReport(dm);
        req.setAttribute("ds", ds);

        /*
		try {
			SL_L_CLOS_REPORTEJBHome home = (SL_L_CLOS_REPORTEJBHome)JNDIManager.getInstance().getHome("SL_L_CLOS_REPORTEJB");
			SL_L_CLOS_REPORTEJB ejb = home.create();

			ds = ejb.sl_l_clos_report(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		*/
	}
}

