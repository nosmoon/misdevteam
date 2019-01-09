/***************************************************************************************************
* ���ϸ� : SE_ETC_1500WB.java
* ��� : �Ǹ� - ��Ÿ���� - �������ں����Ǻμ�
* �ۼ����� : 2010-05-25
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.etc.wb;

import java.util.Calendar;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.etc.dao.SE_ETC_1300DAO;
import chosun.ciis.se.etc.dao.SE_ETC_1500DAO;
import chosun.ciis.se.etc.dm.SE_ETC_1500_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1510_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1530_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1520_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1340_ADM;
import chosun.ciis.se.etc.ds.SE_ETC_1500_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1510_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1530_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1520_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1340_ADataSet;
/**
 * 
 */

public class SE_ETC_1500WB extends BaseWB{

    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1500_MDataSet ds = null;

        // DM Setting
        SE_ETC_1500_MDM dm 		= new SE_ETC_1500_MDM();

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
        	SE_ETC_1500DAO dao = new SE_ETC_1500DAO();
            ds = dao.se_etc_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1300_m(dm);
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
     * ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1510_LDataSet ds = null;

        // DM Setting
        SE_ETC_1510_LDM dm 		= new SE_ETC_1510_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String issu_dt			= Util.checkString(req.getParameter("issu_dt"		));
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        String schlevel			= Util.checkString(req.getParameter("schlevel"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setIssu_dt			(issu_dt	);
        dm.setTeam              (team       );
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setSchlevel			(schlevel	);
        
        try {
        	SE_ETC_1500DAO dao = new SE_ETC_1500DAO();
            ds = dao.se_etc_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1310_l(dm);
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
     * ���� �� ��ü ����/�������  
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1530_ADataSet ds = null;

        // DM Setting
        SE_ETC_1530_ADM dm 		= new SE_ETC_1530_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
       
        String selldeptcd 		= Util.checkString(req.getParameter("selldeptcd"));
        String issu_dt 			= Util.checkString(req.getParameter("issu_dt"));
        String clos_yn 			= Util.checkString(req.getParameter("clos_yn"));
        String areagb 			= Util.checkString(req.getParameter("areagb"));
        String area_cd 			= Util.checkString(req.getParameter("area_cd"));
       
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setSelldeptcd(selldeptcd);
        dm.setIssu_dt(issu_dt);
        dm.setClos_yn(clos_yn);
        dm.setAreagb(areagb);
        dm.setArea_cd(area_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_ETC_1500DAO dao = new SE_ETC_1500DAO();
            ds = dao.se_etc_1530_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1320_a(dm);
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
     * ���� 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1520_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1520_ADataSet ds = null;

        // DM Setting
        SE_ETC_1520_ADM dm 		= new SE_ETC_1520_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
		
		
		String issu_dt 				= Util.checkString((String) hash.get("issu_dt"));
		String bo_cd 				= Util.checkString((String) hash.get("bo_cd"));
		String bo_seq 				= Util.checkString((String) hash.get("bo_seq"));
		String area_cd 				= Util.checkString((String) hash.get("area_cd"));
		String area_nm 				= Util.checkString((String) hash.get("area_nm"));
		String stetsell_qty			= Util.checkString((String) hash.get("stetsell_qty"));
		String issu_qty     		= Util.checkString((String) hash.get("issu_qty"));
		String medi_cd      		= Util.checkString((String) hash.get("medi_cd"));
       
		dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(issu_dt);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setArea_cd(area_cd);
		dm.setArea_nm(area_nm);
		dm.setStetsell_qty(stetsell_qty);
		dm.setIssu_qty(issu_qty);
		dm.setMedi_cd(medi_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_ETC_1500DAO dao = new SE_ETC_1500DAO();
            ds = dao.se_etc_1520_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1330_a(dm);
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
     * ����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1340_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1340_ADataSet ds = null;

        // DM Setting
        SE_ETC_1340_ADM dm 		= new SE_ETC_1340_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String team 			= Util.checkString(req.getParameter("team"));
        String part 			= Util.checkString(req.getParameter("part"));
		String area 			= Util.checkString(req.getParameter("area"));
      
		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setTeam(team);
		dm.setPart(part);
		dm.setArea(area);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		
		
        try {
        	SE_ETC_1300DAO dao = new SE_ETC_1300DAO();
            ds = dao.se_etc_1340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1340_a(dm);
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
