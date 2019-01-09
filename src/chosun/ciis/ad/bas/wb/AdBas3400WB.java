/***************************************************************************************************
* ���ϸ�   : AdBas3400WB.java
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

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas3400DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3400_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3410_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3420_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3430_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3400_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3410_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3420_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3430_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * �������-�����ڷ���� ��ǥ����(����) WorkBean
 */

public class AdBas3400WB extends BaseWB {

    /**
     * ��ǥ����(����) �ʱ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_3400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3400_MDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
    	AD_BAS_3400_MDM dm = new AD_BAS_3400_MDM();
    	
        dm.setCmpy_cd(cmpy_cd);
        

        try {
        	AdBas3400DAO dao = new AdBas3400DAO();
            ds = dao.ad_bas_3400_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3400EJBHome home = (AdBas3400EJBHome) JNDIManager.getInstance().getHome("AdBas3400EJB");
//        try {        
//       		AdBas3400EJB ejb = home.create();
//            ds = ejb.ad_bas_3400_m(dm);        
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
     * ��ǥ����(����) ��ȸ(��ü��)
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_3410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_3410_LDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf = Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm = Util.checkString(req.getParameter("trgt_yymm"));

        // DM Setting
    	AD_BAS_3410_LDM dm = new AD_BAS_3410_LDM();
    	
        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);
        dm.setTrgt_yymm(trgt_yymm);

        try {
        	AdBas3400DAO dao = new AdBas3400DAO();
            ds = dao.ad_bas_3410_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3400EJBHome home = (AdBas3400EJBHome) JNDIManager.getInstance().getHome("AdBas3400EJB");
//        try {
//        	AdBas3400EJB ejb = home.create();   
//            ds = ejb.ad_bas_3410_l(dm);        
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
     * ��ǥ����(����) ��ȸ(��纰)
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_3420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_3420_LDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf = Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm = Util.checkString(req.getParameter("trgt_yymm"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));    	

        // DM Setting
    	AD_BAS_3420_LDM dm = new AD_BAS_3420_LDM();
    	
        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);        
        dm.setTrgt_yymm(trgt_yymm);
        dm.setMedi_cd(medi_cd);
         

        try {
        	AdBas3400DAO dao = new AdBas3400DAO();
            ds = dao.ad_bas_3420_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3400EJBHome home = (AdBas3400EJBHome) JNDIManager.getInstance().getHome("AdBas3400EJB");
//        try {        
//        	AdBas3400EJB ejb = home.create();   
//            ds = ejb.ad_bas_3420_l(dm);
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
     * ��ǥ����(����) ��ǥ�� ����
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_3430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_3430_ADataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf = Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm = Util.checkString(req.getParameter("trgt_yymm"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip= req.getRemoteAddr();    	
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	  	
        Hashtable hash = getHashMultiUpdateData(multiUpDate);
        
        String flag 	 = (String)hash.get("m");
        String trgt_obj	 = (String)hash.get("trgt_obj");
        String trgt_amt	 = (String)hash.get("trgt_amt");

        
        // DM Setting
    	AD_BAS_3430_ADM dm = new AD_BAS_3430_ADM();

        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);
        dm.setTrgt_obj(trgt_obj);
        dm.setTrgt_yymm(trgt_yymm);
        dm.setTrgt_amt(trgt_amt);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
    	dm.setFlag(flag.toUpperCase());
    	

        try {
        	AdBas3400DAO dao = new AdBas3400DAO();
            ds = dao.ad_bas_3430_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3400EJBHome home = (AdBas3400EJBHome) JNDIManager.getInstance().getHome("AdBas3400EJB");
//        try {        
//        	AdBas3400EJB ejb = home.create();   
//            ds = ejb.ad_bas_3430_a(dm);
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
