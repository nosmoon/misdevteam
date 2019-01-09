/***************************************************************************************************
* 파일명 : SE_SND_3500WB.java
* 기능 : 판매 - 발송관리 - 기타매체인인쇄처관리
 * 작성일자 : 2009.03.19
 * 작성자 :   김진경
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
import chosun.ciis.se.snd.dao.SE_SND_3500DAO;
import chosun.ciis.se.snd.dm.SE_SND_3500_MDM;
import chosun.ciis.se.snd.dm.SE_SND_3510_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3520_ADM;
import chosun.ciis.se.snd.ds.SE_SND_3500_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3510_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3520_ADataSet;
/**
 * 
 */

public class SE_SND_3500WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3500_MDataSet ds = null;

        // DM Setting
        SE_SND_3500_MDM dm = new SE_SND_3500_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_SND_3500DAO dao = new SE_SND_3500DAO();
            ds = dao.se_snd_3500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd	=" + dm.getCmpy_cd());
//        
//        SE_SND_3500EJBHome home = (SE_SND_3500EJBHome) JNDIManager.getInstance().getHome("SE_SND_3500EJB");
//        
//        try {
//        	SE_SND_3500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3500_m(dm);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3510_LDataSet ds = null;

        // DM Setting
        SE_SND_3510_LDM dm = new SE_SND_3510_LDM();

        
        String prt_plac_cd 		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"	));
        String medi_cd	 		= Util.checkString(req.getParameter("medi_cd"		));
    	               
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setMedi_cd(medi_cd);
        dm.setPrt_plac_cd(prt_plac_cd);
                     
        try {
        	SE_SND_3500DAO dao = new SE_SND_3500DAO();
            ds = dao.se_snd_3510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3500EJBHome home = (SE_SND_3500EJBHome) JNDIManager.getInstance().getHome("SE_SND_3500EJB");
//        
//        try {
//        	SE_SND_3500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3510_l(dm);
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
     *  기타매체인쇄처정보 등록, 수정, 삭제 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3520_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_3520_ADataSet ds = null;
    	
    	//DM Setting
        SE_SND_3520_ADM dm = new SE_SND_3520_ADM();

    	
    	
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdate1=" + multiUpdateData);
    	
    	Hashtable hash 				= getHashMultiUpdateData(multiUpdateData);
    	//기타매체인쇄처 정보
    	String mode					= (String)hash.get("m"					);	//그리드 모드
       	String route_clsf			= (String)hash.get("route_clsf" 		);
       	String medi_cd		        = (String)hash.get("medi_cd" 			);
       	String prt_plac_cd		    = (String)hash.get("asin_prt_plac_cd" 	);
       	String real_prt_plac_cd		= (String)hash.get("real_prt_plac_cd" 	);
       	String remk					= (String)hash.get("remk" 				);
       	 	
       	String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMode(mode.toUpperCase());
        dm.setRoute_clsf(route_clsf); 
        dm.setMedi_cd(medi_cd);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setReal_prt_plac_cd(real_prt_plac_cd);
        dm.setRemk(remk);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_SND_3500DAO dao = new SE_SND_3500DAO();
            ds = dao.se_snd_3520_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3500EJBHome home = (SE_SND_3500EJBHome) JNDIManager.getInstance().getHome("SE_SND_3500EJB");
//        
//        try {
//        	SE_SND_3500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3520_a(dm);
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
