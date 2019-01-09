/***************************************************************************************************
* 파일명 : SE_SND_2800WB.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-25
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
import chosun.ciis.se.snd.dao.SE_SND_2800DAO;
import chosun.ciis.se.snd.dm.SE_SND_2810_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2820_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2830_ADM;
import chosun.ciis.se.snd.ds.SE_SND_2810_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2820_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2830_ADataSet;
/**
 * 
 */

public class SE_SND_2800WB extends BaseWB{

    /**
     * 발송정보 DOWNLOAD 이력 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2810_LDataSet ds = null;

        // DM Setting
        SE_SND_2810_LDM dm 		= new SE_SND_2810_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"	, true);
        String bgn_issu_dt		= Util.checkString(req.getParameter("bgn_issu_dt" 	));
        String end_issu_dt		= Util.checkString(req.getParameter("end_issu_dt" 	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setBgn_issu_dt		(bgn_issu_dt	);
        dm.setEnd_issu_dt		(end_issu_dt	);
        
        try {
        	SE_SND_2800DAO dao = new SE_SND_2800DAO();
            ds = dao.se_snd_2810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2800EJBHome home = (SE_SND_2800EJBHome) JNDIManager.getInstance().getHome("SE_SND_2800EJB");
//        
//        try {
//        	SE_SND_2800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2810_l(dm);
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
     * 발송정보 DOWNLOAD 대상 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2820_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2820_LDataSet ds = null;

        // DM Setting
        SE_SND_2820_LDM dm 		= new SE_SND_2820_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"	, true);
        String issu_dt			= Util.checkString(req.getParameter("issu_dt" 		));
        String tmsg_seq			= Util.checkString(req.getParameter("tmsg_seq" 		));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIssu_dt			(issu_dt		);
        dm.setTmsg_seq			(tmsg_seq		);
        
        try {
        	SE_SND_2800DAO dao = new SE_SND_2800DAO();
            ds = dao.se_snd_2820_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2800EJBHome home = (SE_SND_2800EJBHome) JNDIManager.getInstance().getHome("SE_SND_2800EJB");
//        
//        try {
//        	SE_SND_2800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2820_l(dm);
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
     * 발송정보 DOWNLOAD 다운로드
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2830_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2830_ADataSet ds = null;

        // DM Setting
        SE_SND_2830_ADM dm 		= new SE_SND_2830_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"	, true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate1"));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        
        Hashtable hash			= new Hashtable();
        hash 					= getHashMultiUpdateData(multiUpdateData);
        
        String mode				= Util.checkString((String) hash.get("m"			));
        String issu_dt			= Util.checkString((String) hash.get("issu_dt"		));
        String clos_tms			= Util.checkString((String) hash.get("clos_tms"		));
        String clos_dt			= Util.checkString((String) hash.get("clos_dt"		));
        String clos_tm			= Util.checkString((String) hash.get("clos_tm"		));
        String prt_dt			= Util.checkString((String) hash.get("prt_dt"		));
        String route_clsf		= Util.checkString((String) hash.get("route_clsf"	));
        String medi_cd			= Util.checkString((String) hash.get("medi_cd"		));
        String sect_cd			= Util.checkString((String) hash.get("sect_cd"		));
        String add_prt_seq		= Util.checkString((String) hash.get("add_prt_seq"	));
        String send_medi_cd		= Util.checkString((String) hash.get("send_medi_cd"	));
        String pcnt				= Util.checkString((String) hash.get("pcnt"			));
        String clr_pcnt			= Util.checkString((String) hash.get("clr_pcnt"		));
        String qty_index		= Util.checkString((String) hash.get("qty_index"	));
        String qty				= Util.checkString((String) hash.get("qty"			));
        String send_yn			= Util.checkString((String) hash.get("send_yn"		));
        String yn				= Util.checkString((String) hash.get("yn"			));
        
        dm.setMode				(mode			);
        dm.setIssu_dt			(issu_dt		);
        dm.setClos_tms			(clos_tms		);
        dm.setClos_dt			(clos_dt		);
        dm.setClos_tm			(clos_tm		);
        dm.setPrt_dt			(prt_dt			);
        dm.setRoute_clsf		(route_clsf		);
        dm.setMedi_cd			(medi_cd		);
        dm.setSect_cd			(sect_cd		);
        dm.setAdd_prt_seq		(add_prt_seq	);
        dm.setSend_medi_cd		(send_medi_cd	);
        dm.setPcnt				(pcnt			);
        dm.setClr_pcnt			(clr_pcnt		);
        dm.setQty_index			(qty_index		);
        dm.setQty				(qty			);
        dm.setSend_yn			(send_yn		);
        dm.setYn				(yn				);
        
        try {
        	SE_SND_2800DAO dao = new SE_SND_2800DAO();
            ds = dao.se_snd_2830_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2800EJBHome home = (SE_SND_2800EJBHome) JNDIManager.getInstance().getHome("SE_SND_2800EJB");
//        
//        try {
//        	SE_SND_2800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2830_a(dm);
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
