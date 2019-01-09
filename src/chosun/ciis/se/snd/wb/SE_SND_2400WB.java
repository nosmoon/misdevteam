/***************************************************************************************************
* 파일명 : SE_SND_2400WB.java
* 기능 : 판매-발송관리-수송단가변경
* 작성일자 : 2009-02-19
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_2400DAO;
import chosun.ciis.se.snd.dm.SE_SND_2400_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2410_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2420_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2430_ADM;
import chosun.ciis.se.snd.ds.SE_SND_2400_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2410_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2420_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2430_ADataSet;
/**
 * 
 */

public class SE_SND_2400WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2400_MDataSet ds = null;

        // DM Setting
        SE_SND_2400_MDM dm = new SE_SND_2400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_2400DAO dao = new SE_SND_2400DAO();
            ds = dao.se_snd_2400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2400EJBHome home = (SE_SND_2400EJBHome) JNDIManager.getInstance().getHome("SE_SND_2400EJB");
//        
//        try {
//        	SE_SND_2400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2400_m(dm);
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
     * 수송단가 변경 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2410_LDataSet ds = null;

        // DM Setting
        SE_SND_2410_LDM dm 		= new SE_SND_2410_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String route_cd			= Util.checkString(req.getParameter("route_cd"		));
        String prt_plac_cd		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf		= Util.checkString(req.getParameter("route_clsf"	));
        String tran_uprc_clas	= Util.checkString(req.getParameter("tran_uprc_clas"));
        String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
        String sect_cd 			= Util.checkString(req.getParameter("sect_cd"));
        String use_yn 			= Util.checkString(req.getParameter("use_yn"));
        
        dm.setCmpy_cd		(cmpy_cd		);
        dm.setIncmg_pers	(incmg_pers		);
        dm.setRoute_cd		(route_cd		);
        dm.setPrt_plac_cd	(prt_plac_cd	);
        dm.setRoute_clsf	(route_clsf		);
        dm.setTran_uprc_clas(tran_uprc_clas	);
        dm.setMedi_cd(medi_cd);
        dm.setSect_cd(sect_cd);
        dm.setUse_yn(use_yn);
        
        try {
        	SE_SND_2400DAO dao = new SE_SND_2400DAO();
            ds = dao.se_snd_2410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2400EJBHome home = (SE_SND_2400EJBHome) JNDIManager.getInstance().getHome("SE_SND_2400EJB");
//        
//        try {
//        	SE_SND_2400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2410_l(dm);
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
     * 수송단가 변경 내역 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2420_LDataSet ds = null;

        // DM Setting
        SE_SND_2420_LDM dm 		= new SE_SND_2420_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String tran_uprc_cd		= Util.checkString(req.getParameter("tran_uprc_cd"	));
        String aply_dt			= Util.checkString(req.getParameter("aply_dt"		));
        
        dm.setCmpy_cd		(cmpy_cd		);
        dm.setIncmg_pers	(incmg_pers		);
        dm.setTran_uprc_cd	(tran_uprc_cd	);
        dm.setAply_dt		(aply_dt		);
        
        try {
        	SE_SND_2400DAO dao = new SE_SND_2400DAO();
            ds = dao.se_snd_2420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2400EJBHome home = (SE_SND_2400EJBHome) JNDIManager.getInstance().getHome("SE_SND_2400EJB");
//        
//        try {
//        	SE_SND_2400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2420_l(dm);
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
     * 변경, 변경매체 등록 수정 삭제   
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_2430_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_2430_ADM dm 			= new SE_SND_2430_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip   	 	= Util.checkString(req.getRemoteAddr());
        
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
    	String medi_cd 				= Util.checkString(req.getParameter("medi_cd"));
    	String sect_cd				= Util.checkString(req.getParameter("sect_cd"));
    	//
    	
//    	System.out.println("multiUpdate=" + multiUpdateData);

    	
    	dm.setCmpy_cd				(cmpy_cd			);
    	dm.setIncmg_pers			(incmg_pers			);
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){
    	
	    	hash 						= getHashMultiUpdateData(multiUpdateData);
	    	String mode         		= Util.checkString((String) hash.get("m"					));
	    	String aply_dt_key          = (String) hash.get("aply_dt_key"			);
	    	String aply_dt              = (String) hash.get("aply_dt"				);
	    	String tran_uprc_clas       = (String) hash.get("tran_uprc_clas"		);
	    	String tran_uprc_cd         = (String) hash.get("tran_uprc_cd"			);
	    	String tran_uprc_route_nm   = (String) hash.get("tran_uprc_route_nm"	);
	    	String route_clsf           = (String) hash.get("route_clsf"			);
	    	String route_cd     		= (String) hash.get("route_cd"				);
	    	String prt_plac_cd          = (String) hash.get("prt_plac_cd"			);
	    	String load_wgt             = (String) hash.get("load_wgt"				);
	    	String route_lgth           = (String) hash.get("route_lgth"			);
	    	String use_yn             	= (String) hash.get("use_yn"					);
	    	String rmks             	= (String) hash.get("rmks"					);
	    	String cnsg_seqo			= (String) hash.get("cnsg_seqo"				);	
	    	String tran_cost            = (String) hash.get("tran_cost"				);
	    	String tran_cost_ren        = (String) hash.get("tran_cost_ren"				);
	    	String tran_uprc_qty_clsf   = (String) hash.get("tran_uprc_qty_clsf"	);
	    	String qty 					= (String) hash.get("qty"	);
	    	
	    	dm.setMode        			(mode.toUpperCase()	);      
	    	dm.setAply_dt_key			(aply_dt_key		);
	    	dm.setAply_dt				(aply_dt			);
	    	dm.setTran_uprc_clas		(tran_uprc_clas		);
	    	dm.setTran_uprc_cd			(tran_uprc_cd		);
	    	dm.setTran_uprc_route_nm	(tran_uprc_route_nm	);
	    	dm.setRoute_clsf			(route_clsf			);
	    	dm.setRoute_cd				(route_cd			);
	    	dm.setPrt_plac_cd			(prt_plac_cd		);
	    	dm.setLoad_wgt				(load_wgt			);
	    	dm.setRoute_lgth			(route_lgth			);
	    	dm.setUse_yn				(use_yn				);
	    	dm.setRmks					(rmks				);
	    	dm.setCnsg_seqo				(cnsg_seqo			);
	    	dm.setTran_cost				(tran_cost_ren			);
	    	dm.setTran_uprc_qty_clsf	(tran_uprc_qty_clsf	);
	    	dm.setMedi_cd				(medi_cd);
	    	dm.setSect_cd				(sect_cd);
	    	dm.setQty					(qty);
    	}
    	
        try {
        	SE_SND_2400DAO dao = new SE_SND_2400DAO();
            ds = dao.se_snd_2430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_SND_2400EJBHome home = (SE_SND_2400EJBHome) JNDIManager.getInstance().getHome("SE_SND_2400EJB");
//        
//        try {
//        	SE_SND_2400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2430_a(dm);
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
