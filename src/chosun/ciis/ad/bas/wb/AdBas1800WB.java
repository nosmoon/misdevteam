/***************************************************************************************************
* 파일명 : .java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1800DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1810_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1820_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1830_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1810_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1820_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1830_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1800WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1810_LDataSet ds = null;
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


        // DM Setting
    	AD_BAS_1810_LDM dm = new AD_BAS_1810_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
        
    	dm.print();
    	
        try {
        	AdBas1800DAO dao = new AdBas1800DAO();
            ds = dao.ad_bas_1810_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
        
//    	AdBas1800EJBHome home = (AdBas1800EJBHome) JNDIManager.getInstance().getHome("AdBas1800EJB");
//        try {
//        	AdBas1800EJB ejb = home.create();
//            ds = ejb.ad_bas_1810_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
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
    public void ad_bas_1820_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1820_SDataSet ds = null;
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String make_dt = Util.checkString(req.getParameter("make_dt"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


        // DM Setting
    	AD_BAS_1820_SDM dm = new AD_BAS_1820_SDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setMake_dt(make_dt);
    	dm.setDlco_no(dlco_no);
        
    	dm.print();
    	
        try {
        	AdBas1800DAO dao = new AdBas1800DAO();
            ds = dao.ad_bas_1820_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//    	AdBas1800EJBHome home = (AdBas1800EJBHome) JNDIManager.getInstance().getHome("AdBas1800EJB");
//        try {
//        	AdBas1800EJB ejb = home.create();
//            ds = ejb.ad_bas_1820_s(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
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
    public void ad_bas_1830_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1830_ADataSet ds = null;
    	String cmpy_cd    	 = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	 = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);

    	if("3".equals(medi_clsf)){
    		medi_clsf	=	"1";
    	}


    	String flag = Util.checkString(req.getParameter("flag"));
    	String make_dt = Util.checkString(req.getParameter("make_dt"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String diary_titl = Util.checkString(req.getParameter("diary_titl"));
    	String make_pers = Util.checkString(req.getParameter("make_pers"));
    	String diary_cont = Util.checkString(req.getParameter("diary_cont"));  
    	String opn = Util.checkString(req.getParameter("opn"));
    	
        // DM Setting
    	AD_BAS_1830_ADM dm = new AD_BAS_1830_ADM();
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setMake_dt(make_dt);
    	dm.setDlco_no(dlco_no);
    	dm.setDiary_titl(diary_titl);
    	dm.setMake_pers(make_pers);
    	dm.setDiary_cont(diary_cont);
    	dm.setOpn(opn);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
        
    	dm.print();
    	
        try {
        	AdBas1800DAO dao = new AdBas1800DAO();
            ds = dao.ad_bas_1830_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//    	AdBas1800EJBHome home = (AdBas1800EJBHome) JNDIManager.getInstance().getHome("AdBas1800EJB");
//        try {
//        	AdBas1800EJB ejb = home.create();
//            ds = ejb.ad_bas_1830_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }         
}
