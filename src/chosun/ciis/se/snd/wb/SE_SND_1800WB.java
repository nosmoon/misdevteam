/***************************************************************************************************
* 파일명 : SE_SND_1800WB.java
* 기능 : 판매 - 발송관리 - 노선조회
* 작성일자 : 2009.03.12
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_1800DAO;
import chosun.ciis.se.snd.dm.SE_SND_1800_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1810_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1800_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1810_LDataSet;
/**
 * 
 */

public class SE_SND_1800WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1800_MDataSet ds = null;

        // DM Setting
        SE_SND_1800_MDM dm 		= new SE_SND_1800_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
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
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        
        try {
        	SE_SND_1800DAO dao = new SE_SND_1800DAO();
            ds = dao.se_snd_1800_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1800EJBHome home = (SE_SND_1800EJBHome) JNDIManager.getInstance().getHome("SE_SND_1800EJB");
//        
//        try {
//        	SE_SND_1800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1800_m(dm);
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
    public void se_snd_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1810_LDataSet ds = null;

        // DM Setting
        SE_SND_1810_LDM dm 		= new SE_SND_1810_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        String route_clsf		= Util.checkString(req.getParameter("route_clsf"));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setTeam				(team			);
        dm.setPart				(part			);
        dm.setArea				(area			);
        dm.setRoute_clsf		(route_clsf		);
        dm.setMedi_cd			(medi_cd		);
        
        try {
        	SE_SND_1800DAO dao = new SE_SND_1800DAO();
            ds = dao.se_snd_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1800EJBHome home = (SE_SND_1800EJBHome) JNDIManager.getInstance().getHome("SE_SND_1800EJB");
//        
//        try {
//        	SE_SND_1800EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1810_l(dm);
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
