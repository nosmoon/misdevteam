/***************************************************************************************************
* 파일명 : SE_SAL_1300WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 지국별 순매출액 조정
* 작성일자 : 2009-03-31
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Calendar;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_1300DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1300_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1310_SDM;
import chosun.ciis.se.sal.dm.SE_SAL_1320_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1330_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1340_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1300_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1310_SDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1320_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1330_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1340_ADataSet;
/**
 * 
 */

public class SE_SAL_1300WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1300_MDataSet ds = null;

        // DM Setting
        SE_SAL_1300_MDM dm 		= new SE_SAL_1300_MDM();

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
        	SE_SAL_1300DAO dao = new SE_SAL_1300DAO();
            ds = dao.se_sal_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1300EJBHome home = (SE_SAL_1300EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1300EJB");
//        
//        try {
//        	SE_SAL_1300EJB ejb = home.create();
//            ds = ejb.se_sal_1300_m(dm);
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
     * 마감여부 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1310_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1310_SDataSet ds = null;

        // DM Setting
        SE_SAL_1310_SDM dm 		= new SE_SAL_1310_SDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String area_cd			= Util.checkString(req.getParameter("area"		));        
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setArea_cd			(area_cd	);
        
        try {
        	SE_SAL_1300DAO dao = new SE_SAL_1300DAO();
            ds = dao.se_sal_1310_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1300EJBHome home = (SE_SAL_1300EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1300EJB");
//        
//        try {
//        	SE_SAL_1300EJB ejb = home.create();
//            ds = ejb.se_sal_1310_s(dm);
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
     * 지국별 순매출내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1320_LDataSet ds = null;

        // DM Setting
        SE_SAL_1320_LDM dm 		= new SE_SAL_1320_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String searchgubun		= Util.checkString(req.getParameter("searchGubun"	));
        String cntr_uprc_fr		= Util.checkString(req.getParameter("cntr_uprc_fr"		));
        String cntr_uprc_to		= Util.checkString(req.getParameter("cntr_uprc_to"		));
        String jd_sell_net_clsf	= Util.checkString(req.getParameter("jd_sell_net_clsf"	));
        String sell_net_clsf			= Util.checkString(req.getParameter("sell_net_clsf"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setTeam				(team		);
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setSearchgubun		(searchgubun);
        dm.setCntr_uprc_fr		(cntr_uprc_fr	 );
        dm.setCntr_uprc_to		(cntr_uprc_to	 );
        dm.setJd_sell_net_clsf	(jd_sell_net_clsf);
        dm.setSell_net_clsf		(sell_net_clsf	);
        
        dm.print();
        
        try {
        	SE_SAL_1300DAO dao = new SE_SAL_1300DAO();
            ds = dao.se_sal_1320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

        //dm.print();
        
//        SE_SAL_1300EJBHome home = (SE_SAL_1300EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1300EJB");
//        
//        try {
//        	SE_SAL_1300EJB ejb = home.create();
//            ds = ejb.se_sal_1320_l(dm);
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
     * 지국별 순매출내역 조정 반영
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1330_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1330_ADataSet ds = null;

        // DM Setting
        SE_SAL_1330_ADM dm 		= new SE_SAL_1330_ADM();

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
        
        String mode				= Util.checkString((String) hash.get("m"			));
        String area_cd			= Util.checkString((String) hash.get("area_cd"		));
        String yymm				= Util.checkString((String) hash.get("yymm"			));
        String bo_cd			= Util.checkString((String) hash.get("bo_cd"		));
        String bo_seq			= Util.checkString((String) hash.get("bo_seq"		));
        String medi_cd			= Util.checkString((String) hash.get("medi_cd"		));
        String cntr_uprc		= Util.checkString((String) hash.get("cntr_uprc"	));
        
        dm.setMode				(mode.toUpperCase());
        dm.setArea_cd			(area_cd		);
        dm.setYymm				(yymm			);
        dm.setBo_cd				(bo_cd			);
        dm.setBo_seq			(bo_seq			);
        dm.setMedi_cd			(medi_cd		);
        dm.setCntr_uprc			(cntr_uprc		);
        
        try {
        	SE_SAL_1300DAO dao = new SE_SAL_1300DAO();
            ds = dao.se_sal_1330_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1300EJBHome home = (SE_SAL_1300EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1300EJB");
//        
//        try {
//        	SE_SAL_1300EJB ejb = home.create();
//            ds = ejb.se_sal_1330_a(dm);
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
     * 지국별 순매출내역 마감
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1340_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1340_ADataSet ds = null;

        // DM Setting
        SE_SAL_1340_ADM dm 		= new SE_SAL_1340_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String clos_yn			= "Y";
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setArea				(area			);
        dm.setClos_yn			(clos_yn		);
        
        try {
        	SE_SAL_1300DAO dao = new SE_SAL_1300DAO();
            ds = dao.se_sal_1340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1300EJBHome home = (SE_SAL_1300EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1300EJB");
//        
//        try {
//        	SE_SAL_1300EJB ejb = home.create();
//            ds = ejb.se_sal_1340_a(dm);
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
     * 지국별 순매출내역 마감취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1350_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1340_ADataSet ds = null;

        // DM Setting
        SE_SAL_1340_ADM dm 		= new SE_SAL_1340_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String area				= Util.checkString(req.getParameter("area"			));
        String clos_yn			= "N";
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setArea				(area			);
        dm.setClos_yn			(clos_yn		);
        
        try {
        	SE_SAL_1300DAO dao = new SE_SAL_1300DAO();
            ds = dao.se_sal_1340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1300EJBHome home = (SE_SAL_1300EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1300EJB");
//        
//        try {
//        	SE_SAL_1300EJB ejb = home.create();
//            ds = ejb.se_sal_1340_a(dm);
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
