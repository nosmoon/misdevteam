/***************************************************************************************************
* 파일명 : SE_BNS_1400WB.java
* 기능 : 판매-판촉물관리 - 판촉물발송일자관리
* 작성일자 : 2009-04-28
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_1400DAO;
import chosun.ciis.se.bns.dm.SE_BNS_1400_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1410_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1420_ADM;
import chosun.ciis.se.bns.dm.SE_BNS_1430_DDM;
import chosun.ciis.se.bns.ds.SE_BNS_1400_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1410_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1420_ADataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1430_DDataSet;
/**
 * 
 */

public class SE_BNS_1400WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1400_MDataSet ds = null;

        // DM Setting
        SE_BNS_1400_MDM dm 		= new SE_BNS_1400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_BNS_1400DAO dao = new SE_BNS_1400DAO();
            ds = dao.se_bns_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1400EJBHome home = (SE_BNS_1400EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1400EJB");
//        
//        try {
//        	SE_BNS_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1400_m(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
  
    /**
     * 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1410_LDataSet ds = null;

        // DM Setting
        SE_BNS_1410_LDM dm 		= new SE_BNS_1410_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setMedi_cd			(medi_cd	);
        
        try {
        	SE_BNS_1400DAO dao = new SE_BNS_1400DAO();
            ds = dao.se_bns_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1400EJBHome home = (SE_BNS_1400EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1400EJB");
//        
//        try {
//        	SE_BNS_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1410_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 저장
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1420_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1420_ADataSet ds = null;

        // DM Setting
        SE_BNS_1420_ADM dm 		= new SE_BNS_1420_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        
        String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
        System.out.println("multiUpdate=" + multiUpdateData);
        
        Hashtable hash			= new Hashtable();
        hash 					= getHashMultiUpdateData(multiUpdateData);
        
        String mode				= Util.checkString((String) hash.get("m"			));
        String dt				= Util.checkString((String) hash.get("dt"			));
        String basi_mm			= Util.checkString((String) hash.get("basi_mm"		));
        String bns_item_cd		= Util.checkString((String) hash.get("bns_item_cd"	));
        String divn_dt			= Util.checkString((String) hash.get("divn_dt"		));
        String chg_issu_dt		= Util.checkString((String) hash.get("chg_issu_dt"	));
        
        dm.setMode				(mode.toUpperCase());
        dm.setYymm				(yymm			);
        dm.setMedi_cd			(medi_cd		);
        dm.setDt				(dt				);
        dm.setBasi_mm			(basi_mm		);
        dm.setBns_item_cd		(bns_item_cd	);
        dm.setDivn_dt			(divn_dt		);
        dm.setChg_issu_dt		(chg_issu_dt	);
        
        try {
        	SE_BNS_1400DAO dao = new SE_BNS_1400DAO();
            ds = dao.se_bns_1420_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1400EJBHome home = (SE_BNS_1400EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1400EJB");
//        
//        try {
//        	SE_BNS_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1420_a(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 삭제 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1430_d(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1430_DDataSet ds = null;

        // DM Setting
        SE_BNS_1430_DDM dm 		= new SE_BNS_1430_DDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"	));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setMedi_cd			(medi_cd	);
        
        try {
        	SE_BNS_1400DAO dao = new SE_BNS_1400DAO();
            ds = dao.se_bns_1430_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1400EJBHome home = (SE_BNS_1400EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1400EJB");
//        
//        try {
//        	SE_BNS_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1430_d(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
}
