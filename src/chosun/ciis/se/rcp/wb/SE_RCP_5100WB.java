/***************************************************************************************************
* 파일명 : SE_RCP_5100WB.java
* 기능 : 판매- 입금관리 - 마감관리 - 전표생성
* 작성일자 : 2009-05-18
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_5100DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_5100_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5110_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5120_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_5100_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5110_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5120_ADataSet;
/**
 * 
 */

public class SE_RCP_5100WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5100_MDataSet ds = null;

        // DM Setting
        SE_RCP_5100_MDM dm 		= new SE_RCP_5100_MDM();

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
        	SE_RCP_5100DAO dao = new SE_RCP_5100DAO();
            ds = dao.se_rcp_5100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_5100EJBHome home = (SE_RCP_5100EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5100EJB");
//        
//        try {
//        	SE_RCP_5100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5100_m(dm);
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
    public void se_rcp_5110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5110_LDataSet ds = null;

        // DM Setting
        SE_RCP_5110_LDM dm 		= new SE_RCP_5110_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String team				= Util.checkString(req.getParameter("team"	));
        String bgn_dt			= Util.checkString(req.getParameter("bgn_dt"));
        String end_dt			= Util.checkString(req.getParameter("end_dt"));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setTeam				(team		);
        dm.setBgn_dt			(bgn_dt		);
        dm.setEnd_dt			(end_dt		);
        
        try {
        	SE_RCP_5100DAO dao = new SE_RCP_5100DAO();
            ds = dao.se_rcp_5110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_5100EJBHome home = (SE_RCP_5100EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5100EJB");
//        
//        try {
//        	SE_RCP_5100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5110_l(dm);
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
     * 입금전표생성   
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_RCP_5120_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_RCP_5120_ADM dm 			= new SE_RCP_5120_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip   	 	= Util.checkString(req.getRemoteAddr());
        String clos_yn				= Util.checkString(req.getParameter("clos_yn"	)); 
        String dt					= Util.checkString(req.getParameter("dt"	)); 

/*        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpdate"));
    	
    	System.out.println("multiUpdate=" + multiUpdateData);
*/    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	dm.setClos_yn				(clos_yn			);
    	dm.setMode        			(""					);      
    	dm.setDt					(dt					);
    	dm.setTeam					(""					);

        try {
        	SE_RCP_5100DAO dao = new SE_RCP_5100DAO();
            ds = dao.se_rcp_5120_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

/*    	
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){
    	
	    	hash 						= getHashMultiUpdateData(multiUpdateData);
	    	String mode         		= Util.checkString((String) hash.get("m"					));
	    	String dt  		        	= (String) hash.get("occr_dt"			);
	    	String team              	= (String) hash.get("dept_cd"			);
	    	
	    	dm.setMode        			(mode.toUpperCase()	);      
	    	dm.setDt					(dt					);
	    	dm.setTeam					(team				);
    	}
*/    	
        
//    	dm.print();

//        SE_RCP_5100EJBHome home = (SE_RCP_5100EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5100EJB");
//        
//        try {
//        	SE_RCP_5100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5120_a(dm);
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
