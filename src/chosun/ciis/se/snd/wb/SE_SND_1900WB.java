/***************************************************************************************************
* 파일명 : SE_SND_1900WB.java
* 기능 : 판매 - 발송관리 - 발송마스터
* 작성일자 : 2009.02.04
* 작성자 :   김대준
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
import chosun.ciis.se.snd.dao.SE_SND_1900DAO;
import chosun.ciis.se.snd.dm.SE_SND_1900_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1910_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1920_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1930_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1940_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1950_DDM;
import chosun.ciis.se.snd.ds.SE_SND_1900_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1910_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1920_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1930_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1940_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1950_DDataSet;
/**
 * 
 */

public class SE_SND_1900WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1900_MDataSet ds = null;

        // DM Setting
        SE_SND_1900_MDM dm 		= new SE_SND_1900_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1900DAO dao = new SE_SND_1900DAO();
            ds = dao.se_snd_1900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1900EJBHome home = (SE_SND_1900EJBHome) JNDIManager.getInstance().getHome("SE_SND_1900EJB");
//        
//        try {
//        	SE_SND_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1900_m(dm);
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
     * 노선상세조회, 수송업자조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1910_LDataSet ds = null;

        // DM Setting
        SE_SND_1910_LDM dm 		= new SE_SND_1910_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String bo_cd 			= Util.checkString(req.getParameter("bo_cd_req"			));
        String send_plac_seq 	= Util.checkString(req.getParameter("send_plac_seq_req"	));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setSend_plac_seq(send_plac_seq);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1900DAO dao = new SE_SND_1900DAO();
            ds = dao.se_snd_1910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1900EJBHome home = (SE_SND_1900EJBHome) JNDIManager.getInstance().getHome("SE_SND_1900EJB");
//        
//        try {
//        	SE_SND_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1910_l(dm);
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
     * 발송매체조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1920_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1920_LDataSet ds = null;

        // DM Setting
        SE_SND_1920_LDM dm 		= new SE_SND_1920_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String bo_cd 			= Util.checkString(req.getParameter("bo_cd_req"			));
        String send_plac_seq 	= Util.checkString(req.getParameter("send_plac_seq_req"	));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setSend_plac_seq(send_plac_seq);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1900DAO dao = new SE_SND_1900DAO();
            ds = dao.se_snd_1920_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1900EJBHome home = (SE_SND_1900EJBHome) JNDIManager.getInstance().getHome("SE_SND_1900EJB");
//        
//        try {
//        	SE_SND_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1920_l(dm);
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
     * 입력용 발송노선 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1930_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1930_LDataSet ds = null;

        // DM Setting
        SE_SND_1930_LDM dm 		= new SE_SND_1930_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1900DAO dao = new SE_SND_1900DAO();
            ds = dao.se_snd_1930_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1900EJBHome home = (SE_SND_1900EJBHome) JNDIManager.getInstance().getHome("SE_SND_1900EJB");
//        
//        try {
//        	SE_SND_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1930_l(dm);
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
     *  발송마스터 등록, 수정 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1940_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_1940_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_1940_ADM dm 			= new SE_SND_1940_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        String flag                 = Util.checkString(req.getParameter("flag"					));
        String bo_cd                = Util.checkString(req.getParameter("bo_cd"					));
        String send_plac_seq        = Util.checkString(req.getParameter("send_plac_seq"			));
        String send_plac_nm         = Util.checkString(req.getParameter("send_plac_nm"			));
        String area_cd              = Util.checkString(req.getParameter("area_cd"				));
        String bo_seq               = Util.checkString(req.getParameter("bo_seq"				));
        String send_plac_feat_clas  = Util.checkString(req.getParameter("send_plac_feat_clas"	));
        String ariv_nomn            = Util.checkString(req.getParameter("ariv_nomn"				));
        String band                 = Util.checkString(req.getParameter("band"					));
        String enclo_bo_cd          = Util.checkString(req.getParameter("bo_cd"					));
        String enclo_bo_seq         = Util.checkString(req.getParameter("bo_seq"				));
        String stetsell_clsf        = Util.checkString(req.getParameter("stetsell_clsf"			));
        String clas_clsf            = Util.checkString(req.getParameter("clas_clsf"				));
        String etc_area_clas		= Util.checkString(req.getParameter("etc_area_clas"			));
        String use_yn               = Util.checkString(req.getParameter("use_yn"				));
        
    	//발송노선 정보 그리드
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
    	    	
    	System.out.println("multiUpdate=" + multiUpdateData);
    	
    	Hashtable hash 				= getHashMultiUpdateData(multiUpdateData);
    	//노선 정보
    	String mode					= (String)hash.get("m"				);	//그리드 모드
    	String route_clsf           = (String) hash.get("route_clsf"	);
    	String route_cd             = (String) hash.get("route_cd"		);
    	String route_nm             = (String) hash.get("route_nm"		);
    	String route_rank           = (String) hash.get("route_rank"	);
    	String send_rank            = (String) hash.get("send_rank"		);
    	String cnsg_seqo            = (String) hash.get("cnsg_seqo"		);
    	String use_yn_route			= (String) hash.get("use_yn"		);

    	dm.setCmpy_cd				(cmpy_cd			);     
    	dm.setFlag					(flag				);
    	dm.setBo_cd					(bo_cd				);              
    	dm.setSend_plac_seq			(send_plac_seq		);      
    	dm.setSend_plac_nm			(send_plac_nm		);       
    	dm.setArea_cd				(area_cd			);            
    	dm.setBo_seq				(bo_seq				);             
    	dm.setSend_plac_feat_clas	(send_plac_feat_clas);
    	dm.setAriv_nomn				(ariv_nomn			);          
    	dm.setBand					(band				);               
    	dm.setEnclo_bo_cd			(enclo_bo_cd		);        
    	dm.setEnclo_bo_seq			(enclo_bo_seq		);       
    	dm.setStetsell_clsf			(stetsell_clsf		);      
    	dm.setClas_clsf				(clas_clsf			);          
    	dm.setEtc_area_clas			(etc_area_clas		);
    	dm.setUse_yn				(use_yn				);
    	dm.setMode					(mode.toUpperCase()	);
    	dm.setRoute_clsf			(route_clsf			);         
    	dm.setRoute_cd				(route_cd			);           
    	dm.setRoute_nm				(route_nm			);           
    	dm.setRoute_rank			(route_rank			);         
    	dm.setSend_rank				(send_rank			);          
    	dm.setCnsg_seqo				(cnsg_seqo			);          
    	dm.setUse_yn_route			(use_yn_route		);       
    	dm.setIncmg_pers_ip			(incmg_pers_ip		);      
    	dm.setIncmg_pers			(incmg_pers			);         

        try {
        	SE_SND_1900DAO dao = new SE_SND_1900DAO();
            ds = dao.se_snd_1940_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_SND_1900EJBHome home = (SE_SND_1900EJBHome) JNDIManager.getInstance().getHome("SE_SND_1900EJB");
//        
//        try {
//        	SE_SND_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1940_a(dm);
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
     * 발송상세 정보를 삭제 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1950_d(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1950_DDataSet ds = null;

        // DM Setting
        SE_SND_1950_DDM dm 		= new SE_SND_1950_DDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String bo_cd 			= Util.checkString(req.getParameter("bo_cd"			));
        String send_plac_seq 	= Util.checkString(req.getParameter("send_plac_seq"	));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setSend_plac_seq(send_plac_seq);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1900DAO dao = new SE_SND_1900DAO();
            ds = dao.se_snd_1950_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1900EJBHome home = (SE_SND_1900EJBHome) JNDIManager.getInstance().getHome("SE_SND_1900EJB");
//        
//        try {
//        	SE_SND_1900EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1950_d(dm);
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
