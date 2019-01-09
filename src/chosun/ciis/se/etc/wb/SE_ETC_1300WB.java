/***************************************************************************************************
* 파일명 : SE_ETC_1300WB.java
* 기능 : 판매 - 기타관리 - 지국자체유가조회
* 작성일자 : 2009-05-26
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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
import chosun.ciis.se.etc.dm.SE_ETC_1300_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1310_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1320_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1330_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1340_ADM;
import chosun.ciis.se.etc.ds.SE_ETC_1300_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1310_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1320_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1330_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1340_ADataSet;
/**
 * 
 */

public class SE_ETC_1300WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1300_MDataSet ds = null;

        // DM Setting
        SE_ETC_1300_MDM dm 		= new SE_ETC_1300_MDM();

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
        	SE_ETC_1300DAO dao = new SE_ETC_1300DAO();
            ds = dao.se_etc_1300_m(dm);
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
     * 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1310_LDataSet ds = null;

        // DM Setting
        SE_ETC_1310_LDM dm 		= new SE_ETC_1310_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        String schlevel			= Util.checkString(req.getParameter("schlevel"		));
        String sell_net_clsf    = Util.checkString(req.getParameter("sell_net_clsf"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setTeam              (team       );
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setSchlevel			(schlevel	);
        dm.setSell_net_clsf		(sell_net_clsf	);
        
        dm.print();
        
        try {
        	SE_ETC_1300DAO dao = new SE_ETC_1300DAO();
            ds = dao.se_etc_1310_l(dm);
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
     * 지역 및 전체 마감/마감취소  
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1320_ADataSet ds = null;

        // DM Setting
        SE_ETC_1320_ADM dm 		= new SE_ETC_1320_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
       
        String selldeptcd 		= Util.checkString(req.getParameter("selldeptcd"));
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String clos_yn 			= Util.checkString(req.getParameter("clos_yn"));
        String areagb 			= Util.checkString(req.getParameter("areagb"));
        String area_cd 			= Util.checkString(req.getParameter("area_cd"));
       
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setSelldeptcd(selldeptcd);
        dm.setYymm(yymm);
        dm.setClos_yn(clos_yn);
        dm.setAreagb(areagb);
        dm.setArea_cd(area_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_ETC_1300DAO dao = new SE_ETC_1300DAO();
            ds = dao.se_etc_1320_a(dm);
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
     * 저장 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1330_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1330_ADataSet ds = null;

        // DM Setting
        SE_ETC_1330_ADM dm 		= new SE_ETC_1330_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
		
		
		String yymm 				= Util.checkString((String) hash.get("yymm"));
		String bo_cd 				= Util.checkString((String) hash.get("bo_cd"));
		String bo_seq 				= Util.checkString((String) hash.get("bo_seq"));
		String area_cd 				= Util.checkString((String) hash.get("area_cd"));
		String area_nm 				= Util.checkString((String) hash.get("area_nm"));
		String trmrd_qty_0 			= Util.checkString((String) hash.get("trmrd_qty_0"));
		String dscn_rdr_qty_0 		= Util.checkString((String) hash.get("dscn_rdr_qty_0"));
		String month_aft_qty_1 		= Util.checkString((String) hash.get("month_aft_qty_1"));
		String month_aft_qty_2 		= Util.checkString((String) hash.get("month_aft_qty_2"));
		String month_aft_qty_3 		= Util.checkString((String) hash.get("month_aft_qty_3"));
		String month_aft_qty_4 		= Util.checkString((String) hash.get("month_aft_qty_4"));
		String month_aft_qty_5 		= Util.checkString((String) hash.get("month_aft_qty_5"));
		String month_aft_qty_6 		= Util.checkString((String) hash.get("month_aft_qty_6"));
		String month_aft_qty_7 		= Util.checkString((String) hash.get("month_aft_qty_7"));
		String dnt_qty 				= Util.checkString((String) hash.get("dnt_qty"));
		String avg_send_qty 		= Util.checkString((String) hash.get("avg_send_qty"));
		String remk 				= Util.checkString((String) hash.get("remk"));
       
		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setArea_cd(area_cd);
		dm.setArea_nm(area_nm);
		dm.setTrmrd_qty_0(trmrd_qty_0);
		dm.setDscn_rdr_qty_0(dscn_rdr_qty_0);
		dm.setMonth_aft_qty_1(month_aft_qty_1);
		dm.setMonth_aft_qty_2(month_aft_qty_2);
		dm.setMonth_aft_qty_3(month_aft_qty_3);
		dm.setMonth_aft_qty_4(month_aft_qty_4);
		dm.setMonth_aft_qty_5(month_aft_qty_5);
		dm.setMonth_aft_qty_6(month_aft_qty_6);
		dm.setMonth_aft_qty_7(month_aft_qty_7);
		dm.setDnt_qty(dnt_qty);
		dm.setAvg_send_qty(avg_send_qty);
		dm.setRemk(remk);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_ETC_1300DAO dao = new SE_ETC_1300DAO();
            ds = dao.se_etc_1330_a(dm);
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
     * 생성
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
