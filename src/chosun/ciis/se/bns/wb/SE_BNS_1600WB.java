/***************************************************************************************************
* 파일명 : SE_BNS_1600WB.java
* 기능 : 판매-판촉물관리 - 판촉물정정처리
* 작성일자 : 2009-04-29
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import java.util.Calendar;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_1600DAO;
import chosun.ciis.se.bns.dm.SE_BNS_1600_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1610_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1620_SDM;
import chosun.ciis.se.bns.dm.SE_BNS_1630_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1600_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1610_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1620_SDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1630_ADataSet;
/**
 * 
 */

public class SE_BNS_1600WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1600_MDataSet ds = null;

        // DM Setting
        SE_BNS_1600_MDM dm 		= new SE_BNS_1600_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        String auth_gb			= "1";
        String feat_clsf		= "";
        
        Calendar cal 			= Calendar.getInstance();
        String yyyy				= String.valueOf(cal.get(cal.YEAR));
        String mm				= String.valueOf(cal.get(cal.MONTH) + 1);
        mm						= mm.length() == 1 ? "0" + mm : mm;
    	String dd				= String.valueOf(cal.get(cal.DATE));
    	dd						= dd.length() == 1 ? "0" + dd : dd;
        
        dm.setAuth_gb			(auth_gb		);
        dm.setFeat_clsf			(feat_clsf		);
        dm.setBase_dt			(yyyy + mm + dd	);
        
        try {
        	SE_BNS_1600DAO dao = new SE_BNS_1600DAO();
            ds = dao.se_bns_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1600EJBHome home = (SE_BNS_1600EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1600EJB");
//        
//        try {
//        	SE_BNS_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1600_m(dm);
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
    public void se_bns_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1610_LDataSet ds = null;

        // DM Setting
        SE_BNS_1610_LDM dm 		= new SE_BNS_1610_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String bns_item_cd		= Util.checkString(req.getParameter("bns_item_cd"	));
        String divn_dt			= Util.checkString(req.getParameter("divn_dt"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setBns_item_cd		(bns_item_cd);
        dm.setDivn_dt			(divn_dt	);
        
        
        try {
        	SE_BNS_1600DAO dao = new SE_BNS_1600DAO();
            ds = dao.se_bns_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1600EJBHome home = (SE_BNS_1600EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1600EJB");
//        
//        try {
//        	SE_BNS_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1610_l(dm);
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
     * 지국정보 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1620_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1620_SDataSet ds = null;

        // DM Setting
        SE_BNS_1620_SDM dm 		= new SE_BNS_1620_SDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String bo_cd			= Util.checkString(req.getParameter("bo_cd"			));
        String bo_seq			= Util.checkString(req.getParameter("bo_seq"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setBo_cd				(bo_cd		);
        dm.setBo_seq			(bo_seq		);
        
        try {
        	SE_BNS_1600DAO dao = new SE_BNS_1600DAO();
            ds = dao.se_bns_1620_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1600EJBHome home = (SE_BNS_1600EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1600EJB");
//        
//        try {
//        	SE_BNS_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1620_s(dm);
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
    public void se_bns_1630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1630_ADataSet ds = null;

        // DM Setting
        SE_BNS_1630_ADM dm 		= new SE_BNS_1630_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        
        String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
        System.out.println("multiUpdate=" + multiUpdateData);
        
        Hashtable hash			= new Hashtable();
        hash 					= getHashMultiUpdateData(multiUpdateData);
        
        String mode				= Util.checkString((String) hash.get("m"				));
        String bns_item_cd		= Util.checkString((String) hash.get("bns_item_cd"		));      
        String divn_dt          = Util.checkString((String) hash.get("divn_dt"			));
        String bo_cd            = Util.checkString((String) hash.get("bo_cd"			));
        String bo_seq           = Util.checkString((String) hash.get("bo_seq"			));
        String ewh_seq          = Util.checkString((String) hash.get("ewh_seq"			));
        String area_cd          = Util.checkString((String) hash.get("area_cd"			));
        String qunt             = Util.checkString((String) hash.get("qunt"				));
        String uprc             = Util.checkString((String) hash.get("uprc"				));
        String divn_uprc        = Util.checkString((String) hash.get("divn_uprc"		));
        String compen_divn_amt  = Util.checkString((String) hash.get("compen_divn_amt"	));
        String nocompen_divn_amt= Util.checkString((String) hash.get("nocompen_divn_amt"));
        
        dm.setMode				(mode.toUpperCase()	);
        dm.setBns_item_cd		(bns_item_cd		);
        dm.setDivn_dt			(divn_dt			);
        dm.setBo_cd				(bo_cd				);
        dm.setBo_seq			(bo_seq				);
        dm.setEwh_seq			(ewh_seq			);
        dm.setArea_cd			(area_cd			);
        dm.setQunt				(qunt				);
        dm.setUprc				(uprc				);
        dm.setDivn_uprc			(divn_uprc			);
        dm.setCompen_divn_amt	(compen_divn_amt	);
        dm.setNocompen_divn_amt	(nocompen_divn_amt	);
        
        try {
        	SE_BNS_1600DAO dao = new SE_BNS_1600DAO();
            ds = dao.se_bns_1630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1600EJBHome home = (SE_BNS_1600EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1600EJB");
//        
//        try {
//        	SE_BNS_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1630_a(dm);
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
