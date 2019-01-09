/***************************************************************************************************
* ���ϸ� : SSExtn3100WB.java
 * ��� : ����Ȯ�帶�� ���� Worker Bean
* �ۼ����� : 2015-03-01
* �ۼ��� : ������
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

public class SSExtn3100WB{	
    
	/**
	 * Ȯ��ν�����-�ʱ�ȭ��
	 * 
	 * @param HttpServletRequest  req
	 * @param HttpServletResponse res
	 * @throws AppException
	 */
    public void initExtnClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_RDR_EXTNCLOS_JM_INITDataSet ds = null;    	
        // Request Parameter Processing
        // DM Setting
        String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        
        SS_L_RDR_EXTNCLOS_JM_INITDM dm = new SS_L_RDR_EXTNCLOS_JM_INITDM();
        
        dm.setIncmg_pers(emp_no);
        dm.setCmpy_cd(cmpycd);
        
        SSExtn3100DAO dao = new SSExtn3100DAO();
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

		SL_L_EXTNCLOS_JMDataSet ds = null;
		SL_L_EXTNCLOS_JMDM dm = new SL_L_EXTNCLOS_JMDM();
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
		
		SSExtn3100DAO dao = new SSExtn3100DAO();
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
		SL_S_EXTNCLOS_JM_DTLSDataSet ds = null;
		SL_S_EXTNCLOS_JM_DTLSDM dm = new SL_S_EXTNCLOS_JM_DTLSDM();

		dm.bocd = Util.checkString(req.getParameter("bocd"));
		dm.extndt = Util.checkString(req.getParameter("extndt"));
		dm.rdr_no = Util.checkString(req.getParameter("rdr_no"));
		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.searchcd = Util.checkString(req.getParameter("searchcd"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();
			
		SSExtn3100DAO dao = new SSExtn3100DAO();
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
		SL_A_EXTNCLOS_JM_DTLSDataSet ds = null;
		SL_A_EXTNCLOS_JM_DTLSDM dm = new SL_A_EXTNCLOS_JM_DTLSDM();

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

		SSExtn3100DAO dao = new SSExtn3100DAO();
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
		SL_U_EXTNCLOS_JM_ISSUPDataSet ds = null;
		SL_U_EXTNCLOS_JM_ISSUPDM dm = new SL_U_EXTNCLOS_JM_ISSUPDM();

		String chgid = Util.getSessionParameterValue(req, "uid", true);

		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.chgid  = chgid;

		//dm.id = Util.checkString(req.getParameter("id"));
		//dm.frextndt = Util.checkString(req.getParameter("frextndt"));
		//dm.toextndt = Util.checkString(req.getParameter("toextndt"));
		//dm.frsuspdt = Util.checkString(req.getParameter("frsuspdt"));
		//dm.tosuspdt = Util.checkString(req.getParameter("tosuspdt"));

		//dm.print();

		SSExtn3100DAO dao = new SSExtn3100DAO();
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
		SL_L_EXTNCLOS_JM_REPORTDataSet ds = null;
		SL_L_EXTNCLOS_JM_REPORTDM dm = new SL_L_EXTNCLOS_JM_REPORTDM();
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

		SSExtn3100DAO dao = new SSExtn3100DAO();
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
		SL_U_EXTNCLOS_JM_CLOSEDataSet ds = null;
		SL_U_EXTNCLOS_JM_CLOSEDM dm = new SL_U_EXTNCLOS_JM_CLOSEDM();

		String chgid = Util.getSessionParameterValue(req, "uid", true);
		
		dm.closmm = Util.checkString(req.getParameter("closmm"));
		dm.chgid  = chgid;
		dm.workno = Util.checkString(req.getParameter("workno"));

		//dm.print();

		SSExtn3100DAO dao = new SSExtn3100DAO();
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
/*	public void selectExtnClosInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_A_EXTNCLOS_JM_CLOSINFODataSet ds = null;
		SL_A_EXTNCLOS_JM_CLOSINFODM dm = new SL_A_EXTNCLOS_JM_CLOSINFODM();

		dm.closmm = Util.checkString(req.getParameter("closmm"));

		dm.print();

    	SSExtn3100DAO dao = new SSExtn3100DAO();
        // DAO ��ü�� selectExtnMovmList ȣ��
        ds = dao.selectExtnClosInfo(dm);
        req.setAttribute("ds", ds);
	}*/
}

