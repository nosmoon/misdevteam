/***************************************************************************************************
* 파일명 : CoJob3000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.co.job.wb;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.job.dao.CoJob3000DAO;
import chosun.ciis.co.job.dm.CO_JOB_3000_MDM;
import chosun.ciis.co.job.dm.CO_JOB_3010_LDM;
import chosun.ciis.co.job.dm.CO_JOB_3020_ADM;
import chosun.ciis.co.job.dm.CO_JOB_3030_SDM;
import chosun.ciis.co.job.dm.CO_JOB_3040_UDM;
import chosun.ciis.co.job.ds.CO_JOB_3000_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_3010_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_3020_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_3030_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_3040_UDataSet;
/**
 * 
 */

public class CoJob3000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_3010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	CO_JOB_3010_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String sys_clsf 	= Util.checkString(req.getParameter("sys_clsf"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String emp_no 		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	// DM Setting
    	CO_JOB_3010_LDM dm = new CO_JOB_3010_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSys_clsf(sys_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setEmp_no(emp_no);

        try {
        	CoJob3000DAO	dao = new CoJob3000DAO();
            ds = dao.co_job_3010_l(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob3000EJBHome home = (CoJob3000EJBHome) JNDIManager.getInstance().getHome("CoJob3000EJB");
//        try {
//        	CoJob3000EJB ejb = home.create();
//            ds = ejb.co_job_3010_l(dm);
//            req.setAttribute("ds", ds);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_3020_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	CO_JOB_3020_ADataSet ds = null;

    	String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String sys_clsf 	= Util.checkString(req.getParameter("sys_clsf"));
    	String flag 		= Util.checkString(req.getParameter("flag"));
    	String seq 			= Util.checkString(req.getParameter("seq"));
    	String titl 		= Util.checkString(req.getParameter("titl"));
    	String cont 		= Util.checkString(req.getParameter("cont"));
    	String eis_fix 		= Util.checkString(req.getParameter("eis_fix"));
    	String incmg_pers_ip 	= Util.checkString(req.getParameter("incmg_pers_ip"));
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	

    	// DM Setting
    	CO_JOB_3020_ADM dm = new CO_JOB_3020_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFlag(flag);
    	dm.setSys_clsf(sys_clsf);
    	dm.setSeq(seq);
    	dm.setTitl(titl);
    	dm.setCont(StringUtil.replaceToXml(cont));
    	dm.setEis_fix(eis_fix);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);

        try {
        	CoJob3000DAO	dao = new CoJob3000DAO();
            ds = dao.co_job_3020_a(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob3000EJBHome home = (CoJob3000EJBHome) JNDIManager.getInstance().getHome("CoJob3000EJB");
//        try {
//        	CoJob3000EJB ejb = home.create();
//            ds = ejb.co_job_3020_a(dm);
//            req.setAttribute("ds", ds);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_3030_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	CO_JOB_3030_SDataSet ds = null;

    	String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String sys_clsf 	= Util.checkString(req.getParameter("sys_clsf"));
    	String seq 			= Util.checkString(req.getParameter("seq"));
    	
    	// DM Setting
    	CO_JOB_3030_SDM dm = new CO_JOB_3030_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSys_clsf(sys_clsf);
    	dm.setSeq(seq);

        try {
        	CoJob3000DAO	dao = new CoJob3000DAO();
            ds = dao.co_job_3030_s(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob3000EJBHome home = (CoJob3000EJBHome) JNDIManager.getInstance().getHome("CoJob3000EJB");
//        try {
//        	CoJob3000EJB ejb = home.create();
//            ds = ejb.co_job_3030_s(dm);
//            req.setAttribute("ds", ds);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_3000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	CO_JOB_3000_MDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String acct_cd    	= Util.getSessionParameterValue(req, "uid", true);
    	
    	// DM Setting
    	CO_JOB_3000_MDM dm = new CO_JOB_3000_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAcct_cd(acct_cd);

        try {
        	CoJob3000DAO	dao = new CoJob3000DAO();
            ds = dao.co_job_3000_m(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob3000EJBHome home = (CoJob3000EJBHome) JNDIManager.getInstance().getHome("CoJob3000EJB");
//        try {
//        	CoJob3000EJB ejb = home.create();
//            ds = ejb.co_job_3000_m(dm);
//            req.setAttribute("ds", ds);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_3040_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
    	CO_JOB_3040_UDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no    	= Util.getSessionParameterValue(req, "emp_no", true);
    	String sys_clsf = Util.checkString(req.getParameter("sys_clsf"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String eis_fix = Util.checkString(req.getParameter("eis_fix"));
    	
    	// DM Setting
    	CO_JOB_3040_UDM dm = new CO_JOB_3040_UDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSys_clsf(sys_clsf);
    	dm.setSeq(seq);
    	dm.setEis_fix(eis_fix);
    	dm.setEmp_no(emp_no);
        
    	dm.print();

        try {
        	CoJob3000DAO	dao = new CoJob3000DAO();
            ds = dao.co_job_3040_u(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob3000EJBHome home = (CoJob3000EJBHome) JNDIManager.getInstance().getHome("CoJob3000EJB");
//        try {
//        	CoJob3000EJB ejb = home.create();
//            ds = ejb.co_job_3040_u(dm);
//            req.setAttribute("ds", ds);
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
}
