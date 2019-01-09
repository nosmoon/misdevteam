/***************************************************************************************************
* ���ϸ�   : CoJob2000WB.java
* ���     : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
*            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
* �ۼ����� : 
* �ۼ���   : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/

package chosun.ciis.co.job.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.job.dao.CoJob2000DAO;
import chosun.ciis.co.job.dm.CO_JOB_2000_MDM;
import chosun.ciis.co.job.dm.CO_JOB_2010_ADM;
import chosun.ciis.co.job.ds.CO_JOB_2000_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_2010_ADataSet;
//import chosun.ciis.co.job.ejb.CoJob2000EJB;
//import chosun.ciis.co.job.ejb.CoJob2000EJBHome;

/**
 * 
 */

public class CoJob2000WB extends BaseWB {


    /**
     * 
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {    	
    	CO_JOB_2000_MDataSet ds = null;

        //����� ��������
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String acct_cd    = Util.getSessionParameterValue(req, "uid", true);
        
//        acct_cd			  =	"c181112";
        
        // DM Setting
    	CO_JOB_2000_MDM dm = new CO_JOB_2000_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAcct_cd(acct_cd);
        
    	dm.print();
        try {
        	CoJob2000DAO	dao = new CoJob2000DAO();
            ds = dao.co_job_2000_m(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob2000EJBHome home = (CoJob2000EJBHome) JNDIManager.getInstance().getHome("CoJob2000EJB");
//        
//        try {
//       	    CoJob2000EJB ejb = home.create();
//            ds = ejb.co_job_2000_m(dm);	// ������ dm������ EJB�� ȣ���Ѵ�.
//            req.setAttribute("ds", ds);	// request�� ������� ��´�.
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
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_job_2010_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {    	
    	
    	CO_JOB_2010_ADataSet ds = null;

        //����� ��������
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
        String acct_cd    	= Util.getSessionParameterValue(req, "uid", true);
        String incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
        
        String my_menu_nm 		= Util.checkString(req.getParameter("my_menu_nm_ar"));
        String menu_id 			= Util.checkString(req.getParameter("menu_id_ar"));
        String my_supr_menu_id 	= Util.checkString(req.getParameter("my_supr_menu_id_ar"));

//        acct_cd			  		=	"c181112";
        
        // DM Setting
    	CO_JOB_2010_ADM dm = new CO_JOB_2010_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAcct_cd(acct_cd);
    	dm.setMy_menu_nm(my_menu_nm);   
    	dm.setMenu_id(menu_id);
    	dm.setMy_supr_menu_id(my_supr_menu_id);
    	dm.setIncmg_pers(incmg_pers);

        try {
        	CoJob2000DAO	dao = new CoJob2000DAO();
            ds = dao.co_job_2010_a(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }
//        
//        CoJob2000EJBHome home = (CoJob2000EJBHome) JNDIManager.getInstance().getHome("CoJob2000EJB");
//        
//        try {
//       	    CoJob2000EJB ejb = home.create();
//            ds = ejb.co_job_2010_a(dm);	// ������ dm������ EJB�� ȣ���Ѵ�.
//            req.setAttribute("ds", ds);	// request�� ������� ��´�.
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
