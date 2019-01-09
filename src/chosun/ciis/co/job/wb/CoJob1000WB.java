/***************************************************************************************************
* 파일명   : CoJob1000WB.java
* 기능     : Servlet에서 받은 parameter를 이용하여 dm을 set하고
*            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/

package chosun.ciis.co.job.wb;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.*;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.SMSSender;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.job.dao.CoJob1000DAO;
import chosun.ciis.co.job.dm.CO_JOB_1000_MDM;
import chosun.ciis.co.job.dm.CO_JOB_1002_MDM;
import chosun.ciis.co.job.dm.CO_JOB_1001_MDM;
import chosun.ciis.co.job.dm.CO_JOB_1010_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1015_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1016_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1020_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1025_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1030_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1040_ADM;
import chosun.ciis.co.job.dm.CO_JOB_1050_ADM;
import chosun.ciis.co.job.dm.CO_JOB_1060_SDM;
import chosun.ciis.co.job.dm.CO_JOB_1070_ADM;
import chosun.ciis.co.job.dm.CO_JOB_1080_LDM;
import chosun.ciis.co.job.dm.CO_JOB_1081_LDM;
import chosun.ciis.co.job.ds.CO_JOB_1000_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1002_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1001_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1010_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1015_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1016_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1020_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1025_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1030_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1040_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_1050_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_1060_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1070_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_1080_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_1081_LDataSet;

/**
 * 광고관리-업무연락 확인처리관리 WorkBean
 */

public class CoJob1000WB extends BaseWB {

	public void co_job_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	
    	CO_JOB_1000_MDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String deptcd     = Util.getSessionParameterValue(req, "deptcd", true);
        
        // DM Setting
    	CO_JOB_1000_MDM dm = new CO_JOB_1000_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDept_cd(deptcd);
        
    	dm.print();
        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
        	ds = dao.co_job_1000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//       	    CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1001_m(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
	public void co_job_1002_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	
    	CO_JOB_1002_MDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String deptcd     = Util.checkString(req.getParameter("orga_cd"));
        
        // DM Setting
    	CO_JOB_1002_MDM dm = new CO_JOB_1002_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDept_cd(deptcd);
        
    	dm.print();
        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
        	ds = dao.co_job_1002_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//       	    CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1001_m(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    /**
     * 업무지시 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	
    	CO_JOB_1001_MDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String deptcd     = Util.getSessionParameterValue(req, "deptcd", true);
        
        // DM Setting
    	CO_JOB_1001_MDM dm = new CO_JOB_1001_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDept_cd(deptcd);
        
    	dm.print();
        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1001_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//       	    CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1001_m(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 업무지시 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	
    	CO_JOB_1010_LDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String emp_no	  = Util.getSessionParameterValue(req, "emp_no", true);
        String deptcd	  = Util.getSessionParameterValue(req, "deptcd", true);  
        String frdt 	  = Util.checkString(req.getParameter("frdt"));
        String todt       = Util.checkString(req.getParameter("todt"));
        String wr_clsf    = Util.checkString(req.getParameter("wr_clsf"));
        String orga_cd    = Util.checkString(req.getParameter("orga_cd"));
        String empno      = Util.checkString(req.getParameter("empno"));
        
        // DM Setting
    	CO_JOB_1010_LDM dm = new CO_JOB_1010_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setEmp_no(emp_no);
    	dm.setDept_cd(deptcd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setWr_clsf(wr_clsf);      
        dm.setOrga_cd(orga_cd);
        dm.setEmpno(empno);
    	
    	dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//       	    CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1010_l(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    

    /**
     * 업무지시 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1015_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	
    	CO_JOB_1015_SDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no   = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String job_clsf = Util.checkString(req.getParameter("job_clsf"));
    	String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));
        
        // DM Setting
    	CO_JOB_1015_SDM dm = new CO_JOB_1015_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setCntc_seq(cntc_seq);    
    	dm.setEmp_no(emp_no);

//    	//dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1015_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//       	    CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1015_s(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    

    /**
     * 업무지시 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1016_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	
    	CO_JOB_1016_SDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no   = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String epView_seq = Util.checkString(req.getParameter("epView_seq"));
        
        // DM Setting
    	CO_JOB_1016_SDM dm = new CO_JOB_1016_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setEmp_no(emp_no);
    	dm.setEpview_seq(epView_seq);

    	////dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1016_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//       	    CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1016_s(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    
    /**
     * 업무지시 내용을 상세조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1020_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	

    	CO_JOB_1020_SDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd     	= Util.getSessionParameterValue(req, "cmpycd", true);
//        String emp_no      = Util.getSessionParameterValue(req, "emp_no", true);
        String job_clsf 	= Util.checkString(req.getParameter("job_clsf"));
        String cntc_seq 	= Util.checkString(req.getParameter("cntc_seq"));    
         
    	// DM Setting
    	CO_JOB_1020_SDM dm = new CO_JOB_1020_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setCntc_seq(cntc_seq);            
        
//    	//dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1020_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//            CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1020_s(dm); // 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }        
    }
    

    /**
     * 답변목록 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1025_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	

    	CO_JOB_1025_LDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd     	= Util.getSessionParameterValue(req, "cmpycd", true);
//        String emp_no      = Util.getSessionParameterValue(req, "emp_no", true);
        String job_clsf 	= Util.checkString(req.getParameter("job_clsf"));
        String cntc_seq 	= Util.checkString(req.getParameter("cntc_seq"));    
         
    	// DM Setting
    	CO_JOB_1025_LDM dm = new CO_JOB_1025_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setCntc_seq(cntc_seq);            
        
//    	//dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1025_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//            CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1025_l(dm); // 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }        
    }
        
    /**
     * 업무지시 답변을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1030_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	

    	CO_JOB_1030_LDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String make_pers  = Util.getSessionParameterValue(req, "emp_no", true);

        // DM Setting
    	CO_JOB_1030_LDM dm = new CO_JOB_1030_LDM();
    	
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);    
    	String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));	//일련번호      
         
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setCntc_seq(Long.parseLong(cntc_seq));             

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1030_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//            CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1030_l(dm); // 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }        
    }    

    /**
     * 업무지시 답변을 입력, 수정, 삭제한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1040_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
    	
    	CO_JOB_1040_ADataSet ds = null;
    	
        byte[] add_file = (byte[])req.getAttribute("add_file");

        // Request Parameter Processing
        String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip = req.getRemoteAddr();
    	
        String job_clsf    	= Util.checkString(req.getParameter("job_clsf"));
        String cntc_seq    	= Util.checkString(req.getParameter("cntc_seq"));
        String answer_cont 	= Util.checkString(req.getParameter("answer_cont"));
        String add_file_nm 	= Util.checkString(req.getParameter("add_file_nm"));
        String file_delyn  	= Util.checkString(req.getParameter("file_delyn"));
//
//        try{
//        	answer_cont = new String(answer_cont.getBytes("8859_1"), "EUC-KR");
//	        add_file_nm	= new String(add_file_nm.getBytes("8859_1"), "EUC-KR");	
//        }catch(Exception e){
//        }
        
        // DM Setting
        CO_JOB_1040_ADM dm = new CO_JOB_1040_ADM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCntc_seq(cntc_seq);
        dm.setAnswer_cont(answer_cont);
        dm.setAdd_file_nm(add_file_nm);
        dm.setAdd_file(add_file);
        dm.setFile_delyn(file_delyn);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1040_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        try {
//            CoJob1000EJB ejb = home.create();            
//            ds = ejb.co_job_1040_a(dm);         
//            req.setAttribute("ds", ds); // request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);  
//            LogManager.getInstance().log(se);
//            throw se;
//        }        
    }    

    /**
     * 업무지시 내용을 입력, 수정, 삭제한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1050_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
    	//System.out.println("@@@@@  0");
    	String file_name = "";
    	int sizeLimit = 10 * 1024 * 1024 ;//10MB
    	byte[] add_file = new byte[10485760]; //(byte[])req.getAttribute("add_file");
    	//System.out.println("@@@@@  00"+ req);
    	Hashtable ht = new Hashtable();
    	MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR");
    	//System.out.println("@@@@@  000");
    	Part part; 
    	//System.out.println("@@@@@  0000");
    	CO_JOB_1050_ADM dm = new CO_JOB_1050_ADM();
    	//System.out.println("@@@@@  1");
    	while ((part = mp.readNextPart()) != null) {

		    if(part instanceof FilePart){
				if(((FilePart) part).getFileName() != null) {
					ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
					((FilePart)part).writeTo(byteArrayOutputStream);
					add_file = byteArrayOutputStream.toByteArray();
					ht.put(part.getName(), add_file);
					ht.put("add_file_nm", ( (FilePart) part).getFileName());
					ht.put("add_file_size", String.valueOf(add_file.length));
				}
			}else if(part instanceof ParamPart){
				ht.put(part.getName(), ((ParamPart)part).getStringValue());
				//System.out.println(part.getName()+"  : "+((ParamPart)part).getStringValue());
			}
		}
    	
    	CO_JOB_1050_ADataSet ds = null;
        
        String cmpy_cd    	 = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip = req.getRemoteAddr();
        String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
        String uid 			 = Util.getSessionParameterValue(req, "uid", true);
//System.out.println("#####################################"+cmpy_cd);

        String flag 		= Util.checkString((String) ht.get("flag"));
        String job_clsf 	= Util.checkString((String) ht.get("job_clsf"));
        String cntc_seq 	= Util.checkString((String) ht.get("cntc_seq"));
        String make_dt 		= Util.checkString((String) ht.get("make_dt"));
        String answer_yn 	= StringUtil.nvl((String) ht.get("answer_yn"), "N");
        String sms_yn 		= StringUtil.nvl((String) ht.get("sms_yn"), "N");
        String titl 		= Util.checkString((String) ht.get("titl"));
        String cont 		= Util.checkString((String) ht.get("cont"));
        String add_file_nm 	= Util.checkString((String) ht.get("add_file_nm"));
        String file_delyn		= StringUtil.nvl((String) ht.get("file_delyn"));
        String multiUpdateData	= Util.checkString((String) ht.get("multiUpdateData"));
        String frdt				= Util.checkString((String) ht.get("frdt"));
        String todt				= Util.checkString((String) ht.get("todt"));
        
//        try{
//	        titl 		= new String(titl.getBytes("8859_1"), "EUC-KR");
//	        cont 		= new String(cont.getBytes("8859_1"), "EUC-KR");
//	        add_file_nm	= new String(add_file_nm.getBytes("8859_1"), "EUC-KR");	
//	        multiUpdateData = new String(multiUpdateData.getBytes("8859_1"), "EUC-KR");	
//        }catch(Exception e){
//        }
//        
        
        //System.out.println(cont);
        //System.out.println(multiUpdateData);
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        String team_cd 		= Util.checkString((String)hash.get("team_cd"));
        String team_nm 		= Util.checkString((String)hash.get("team"));
        String part_cd 		= Util.checkString((String)hash.get("part_cd"));
        String part_nm 		= Util.checkString((String)hash.get("part"));
        String rmsg_pers 	= Util.checkString((String)hash.get("rmsg_pers"));
        String ptph_no 		= Util.checkString((String)hash.get("ptph_no"));
        
        // DM Setting
        
        dm.setFlag(flag);
        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCntc_seq(cntc_seq);
        dm.setTeam_cd(team_cd);
        dm.setTeam_nm(team_nm);
        dm.setPart_cd(part_cd);
        dm.setPart_nm(part_nm);
        dm.setRmsg_pers(rmsg_pers);
        dm.setPtph_no(ptph_no);
        dm.setMake_dt(make_dt);
        dm.setAnswer_yn(answer_yn);
        dm.setSms_yn(sms_yn);
        dm.setTitl(titl);
        dm.setCont(StringUtil.replaceToXml(cont));
        dm.setAdd_file_nm(add_file_nm);
        dm.setAdd_file(add_file);
        dm.setFile_delyn(file_delyn);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        dm.setUid(uid);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        
        dm.print();        
        String sm_code = "MIS-" + cmpy_cd;
        System.out.println(sm_code);
        
        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1050_a(dm);
            req.setAttribute("ds", ds); 
            if("I".equals(dm.flag) || "U".equals(dm.flag)){
	            if("".equals(ds.errcode) && "Y".equals(dm.sms_yn)){
	        		//SMS 전송....
	        		String[] ptph_no_arr = StringUtil.toArray(ptph_no, "#");	        		
	        		String   sm_rvmbno = Util.checkString(ds.sm_rvmbno); //발신번호
	        		if(!"".equals(sm_rvmbno)){
	        			try{
			        		SMSSender sms = new SMSSender();
			        		sms.send(StringUtil.strip(sm_rvmbno, "-"), ptph_no_arr, titl, sm_code);
	        			}catch(AppException ae){
	        				throw ae;
	        			}
	        		}  
	            }
            }            
        }
        catch (AppException e) {
            throw e;
        }
        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        try {
//            CoJob1000EJB ejb = home.create();        
//            ds = ejb.co_job_1050_a(dm);             
//            req.setAttribute("ds", ds); // request에 결과값을 담는다.
//            if("I".equals(dm.flag) || "U".equals(dm.flag)){
//	            if("".equals(ds.errcode) && "Y".equals(dm.sms_yn)){
//	        		//SMS 전송....
//	        		String[] ptph_no_arr = StringUtil.toArray(ptph_no, "#");	        		
//	        		String   sm_rvmbno = Util.checkString(ds.sm_rvmbno); //발신번호
//	        		if(!"".equals(sm_rvmbno)){
//	        			try{
//			        		SMSSender sms = new SMSSender();
//			        		sms.send(StringUtil.strip(sm_rvmbno, "-"), ptph_no_arr, titl, "MIS");
//	        			}catch(AppException ae){
//	        				throw ae;
//	        			}
//	        		}
//	            }
//            }
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }        
    }
    
    /**
     * 업무지시 답변을 상세조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_1060_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {   	

    	CO_JOB_1060_SDataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
//      String make_pers   = Util.getSessionParameterValue(req, "emp_no", true);
        
        // DM Setting
    	CO_JOB_1060_SDM dm = new CO_JOB_1060_SDM();
    	
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);      
    	String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));	//일련번호      
    	String answer_seq = Util.checkString(req.getParameter("answer_seq"));	//답변일련번호
         
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setCntc_seq(Long.parseLong(cntc_seq));
    	dm.setAnswer_seq(Long.parseLong(answer_seq));

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1060_s(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//        
//        try {
//            CoJob1000EJB ejb = home.create();
//            ds = ejb.co_job_1060_s(dm); // 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }        
    }        

    /**
     * 업무지시 첨부파일을 다운로드한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @throws IOException 
     **/

    public void co_job_1070_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {

        CO_JOB_1070_ADataSet ds = null;
        
        //사용자 세션정보
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
//      String make_pers   = Util.getSessionParameterValue(req, "emp_no", true);

        String job_clsf = Util.checkString(req.getParameter("job_clsf"));	//업무구분
    	String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));	//연락일련번호    
    	String rmsg_seq = Util.checkString(req.getParameter("rmsg_seq"));	//수신일련번호    	
    	
    	CO_JOB_1070_ADM dm = new CO_JOB_1070_ADM();    	
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setCntc_seq(cntc_seq);
    	dm.setRmsg_seq(rmsg_seq);
    	
    	dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1070_a(dm);
            req.setAttribute("ds", ds); 
            req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
            req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.
        }
        catch (AppException e) {
            throw e;
        }
//    	
//    	CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//    	    	
//        try {
//           	CoJob1000EJB ejb = home.create();        
//            ds = ejb.co_job_1070_a(dm); // 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
//            req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.
//            
//        } catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        } catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }      
    
    /**
     * 업무지시 수신처목록조회
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void co_job_1080_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	
    	CO_JOB_1080_LDataSet ds = null;

        //사용자 세션정보
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String job_clsf   = Util.checkString(req.getParameter("job_clsf"));        
        String selected   = Util.checkString(req.getParameter("selected"));        
    	
    	CO_JOB_1080_LDM dm = new CO_JOB_1080_LDM();    	
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setSelected(selected); 
    	dm.setIncmg_pers(incmg_pers);  
    	
//    	//dm.print();  

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1080_l(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//    	CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//    	    	
//        try {
//           	CoJob1000EJB ejb = home.create();        
//           	ds = ejb.co_job_1080_l(dm); // 설정된 dm값으로 EJB를 호출한다.
//           	req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        } catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        } catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }

    /**
     * 업무지시 수신처목록조회
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void co_job_1081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	CO_JOB_1081_LDataSet ds = null;

        //사용자 세션정보
        String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
        
        String job_clsf   	= Util.checkString(req.getParameter("job_clsf"));        
        String cntc_seq 	= Util.checkString(req.getParameter("cntc_seq"));
        String selected     = Util.checkString(req.getParameter("selected"));
        
        Hashtable hash = getHashMultiUpdateData(selected);
        
        String rmsg_pers    = Util.checkString((String)hash.get("rmsg_pers"));
    	
    	CO_JOB_1081_LDM dm = new CO_JOB_1081_LDM();    	
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setCntc_seq(cntc_seq);
    	dm.setRmsg_pers(rmsg_pers);
    	
//    	//dm.print();

        try {
        	CoJob1000DAO	dao = new CoJob1000DAO();
            ds = dao.co_job_1081_l(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//    	CoJob1000EJBHome home = (CoJob1000EJBHome) JNDIManager.getInstance().getHome("CoJob1000EJB");
//    	    	
//        try {
//           	CoJob1000EJB ejb = home.create();        
//           	ds = ejb.co_job_1081_l(dm); // 설정된 dm값으로 EJB를 호출한다.
//           	req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        } catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        } catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    
}
