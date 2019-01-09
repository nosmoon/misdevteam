package chosun.ciis.mt.close.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException; 
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.close.dao.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;
//import chosun.ciis.mt.close.ejb.MT_CLOSE_8000EJB;
//import chosun.ciis.mt.close.ejb.MT_CLOSE_8000EJBHome;
 

public class MT_CLOSE_6000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 필름기준정보관리 화면조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void mt_close_6010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_6010_LDataSet ds = null;
		MT_CLOSE_6010_LDM dm = new MT_CLOSE_6010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm    = Util.checkString(req.getParameter("yymm"));
		//dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_6010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8000_l(dm);
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
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
    
    public void mt_close_6020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	MT_CLOSE_6020_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

        System.out.println("multiUpdateData: " + multiUpdateData);
    	Hashtable hash     = getHashMultiUpdateData(multiUpdateData);
    	String mode_ar     = (String)hash.get("m"); 
		String base_yymm_ar     = (String)hash.get("base_yymm");
		String fac_clsf_ar = (String)hash.get("fac_clsf");
		String seq_ar      = (String)hash.get("seq");
		String remk_ar     = (String)hash.get("remk");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "uid", true);
        
        //DM Setting
        MT_CLOSE_6020_ADM dm = new MT_CLOSE_6020_ADM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMode(mode_ar.toUpperCase());
        dm.setBase_yymm(base_yymm_ar);
        dm.setFac_clsf(fac_clsf_ar);
        dm.setSeq(seq_ar);
        dm.setRemk(remk_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	MT_CLOSE_6000DAO dao = new MT_CLOSE_6000DAO();
            ds = dao.mt_close_6020_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

        dm.print();
        
//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            ds = ejb.se_bas_1220_a(dm);
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