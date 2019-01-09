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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1300DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1300_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1310_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1300_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1310_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas1300WB extends BaseWB {

    /**
     * 업무구분, 코드구분의 combobox 데이타가져오기
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1300_MDataSet ds = null;

        // DM Setting
    	AD_BAS_1300_MDM dm = new AD_BAS_1300_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
                 
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	AdBas1300DAO dao = new AdBas1300DAO();
            ds = dao.ad_bas_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
        
//    	AdBas1300EJBHome home = (AdBas1300EJBHome) JNDIManager.getInstance().getHome("AdBas1300EJB");
//        try {
//        	AdBas1300EJB ejb = home.create();
//            ds = ejb.ad_bas_1300_m(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//           SysException se = new SysException(e);
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
    public void ad_bas_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1310_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);    	
        String mortg_clsf = Util.checkString(req.getParameter("mortg_clsf"));
        String data_clsf = Util.checkString(req.getParameter("data_clsf"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String cntr_yymm  = Util.checkString(req.getParameter("cntr_yymm"));   
        String cg_gb = Util.checkString(req.getParameter("cg_gb"));
        String dlco_no = Util.checkString(req.getParameter("dlco_no"));        
        String dlco_clsf  = Util.checkString(req.getParameter("dlco_clsf"));   
        String curr_yn  = Util.checkString(req.getParameter("curr_yn"));   
        String prev_yn  = Util.checkString(req.getParameter("prev_yn"));
        String basi_dt = Util.checkString(req.getParameter("basi_dt"));
        String over_yn = Util.checkString(req.getParameter("over_yn"));

        // DM Setting
    	AD_BAS_1310_LDM dm = new AD_BAS_1310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);    	
    	dm.setMortg_clsf(mortg_clsf);
    	dm.setData_clsf(data_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setCntr_yymm(cntr_yymm);
    	dm.setCg_gb(cg_gb);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setCurr_yn(curr_yn);
    	dm.setPrev_yn(prev_yn);
    	dm.setBasi_dt(basi_dt);
    	dm.setOver_yn(over_yn);
        
        dm.print();
        
        try {
        	AdBas1300DAO dao = new AdBas1300DAO();
            ds = dao.ad_bas_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
                
//        AdBas1300EJBHome home = (AdBas1300EJBHome) JNDIManager.getInstance().getHome("AdBas1300EJB");
//        try {
//        	AdBas1300EJB ejb = home.create();
//            ds = ejb.ad_bas_1310_l(dm);
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
