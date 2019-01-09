/***************************************************************************************************
* 파일명 : SSExtn2200WB.java
 * 기능 : 지국확장마감 위한 Worker Bean
* 작성일자 : 2009-07-09
* 작성자 : 김용욱
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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
 * 확장현황-지국확장마감 을 위한 WB
 */

public class SSExtn2200WB{	

    /**
     * 확장현황-지국확장마감-초기화면
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
        // DAO 객체의 selectDetailServAdjmList 호출
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
     * 확장현황-지국확장마감-목록
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
        // DAO 객체의 selectExtnMovmList 호출
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
     * 확장현황-지국확장마감-저장
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
        // DAO 객체의 selectExtnMovmList 호출
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
     * 확장현황-지국중지마감-초기화면
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
        // DAO 객체의 selectDetailServAdjmList 호출
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
     * 확장현황-지국중지마감-초기화면
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
        // DAO 객체의 selectDetailServAdjmList 호출
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
     * 확장현황-지국중지마감-목록조회
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
        // DAO 객체의 selectExtnMovmList 호출
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
     * 확장현황-지국중지마감-저장
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
        // DAO 객체의 selectExtnMovmList 호출
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
	 * 확장부실점검-초기화면
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
        // DAO 객체의 init 호출
        ds = dao.initExtnClos(dm);
        req.setAttribute("ds", ds);
    }
    
    
	/**
	 * 확장부실점검-목록조회 조회된 request값을 set한다.
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
		dm.pageno   = ("".equals(pageno)) ? 1 : Long.parseLong(pageno); 		// 'pageno'가 Null일경우 1을반환
		dm.pagesize = ("".equals(pagesize)) ? 10 : Long.parseLong(pagesize); 	// 'pagesize'가

		//dm.print();
		
    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.selectExtnClosList(dm);
        req.setAttribute("ds", ds);
		
		/* JNDI lookup 을 통해 EJB Home interface 객체생성
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnClosList(dm); // 설정된 dm값으로 EJB를 호출
			req.setAttribute("ds", ds); // request에 결과값을 Binding
			
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
	 * 확장부실점검(상세정보조회) 조회된 request값을 set한다.
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
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.selectExtnClosDtls(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup 을 통해 EJB Home interface 객체생성
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnClosDtls(dm); // 설정된 dm값으로 EJB를 호출
			req.setAttribute("ds", ds); 	 // request에 결과값을 Binding
				
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
	 * 확장부실점검 저장(지국소견/담당확인내용)
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
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.selectExtnClosUpdate(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup 을 통해 EJB Home interface 객체생성
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnClosUpdate(dm); // 설정된 dm값으로 EJB를 호출
			req.setAttribute("ds", ds); 	   // request에 결과값을 Binding
				
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
	 * 확장부실점검 조선IS중지반영
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
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.updateExtnclosIssup(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup 을 통해 EJB Home interface 객체생성
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.updateExtnclosIssup(dm); // 설정된 dm값으로 EJB를 호출
			req.setAttribute("ds", ds); 	   // request에 결과값을 Binding
				
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
	 * 확장부실점검 장표조회
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
		dm.pageno   = ("".equals(pageno)) ? 1 : Long.parseLong(pageno); 		// 'pageno'가 Null일경우 1을반환
		dm.pagesize = ("".equals(pagesize)) ? 10 : Long.parseLong(pagesize); 	// 'pagesize'가
		
		//dm.pageno = Util.checkString(req.getParameter("pageno"));
		//dm.pagesize = Util.checkString(req.getParameter("pagesize"));

		//dm.print();

    	SSExtn2200DAO dao = new SSExtn2200DAO();
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.selectExtnclosReport(dm);
        req.setAttribute("ds", ds);
               
		/* JNDI lookup 을 통해 EJB Home interface 객체생성
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.selectExtnclosReport(dm); // 설정된 dm값으로 EJB를 호출
			req.setAttribute("ds", ds); 	   // request에 결과값을 Binding
				
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
	 * 확장부실점검 점검마감
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
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.updateExtnClosClose(dm);
        req.setAttribute("ds", ds);
        
		/* JNDI lookup 을 통해 EJB Home interface 객체생성
		SSExtn2200EJBHome home = (SSExtn2200EJBHome) JNDIManager
				.getInstance().getHome("SSExtn2200EJB");
		try {
			SSExtn2200EJB ejb = home.create();
			ds = ejb.updateExtnClosClose(dm); // 설정된 dm값으로 EJB를 호출
			req.setAttribute("ds", ds); 	   // request에 결과값을 Binding
				
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
	 * 확장관리-확장부실점검-마감여부/조선IS중지 반영여부 조회
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
        // DAO 객체의 selectExtnMovmList 호출
        ds = dao.selectExtnClosInfo(dm);
        req.setAttribute("ds", ds);
	}

	
	
	/**
	 * 확장관리-마감보고서 조회/엑셀저장
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
        // DAO 객체의 selectExtnMovmList 호출
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

