/***************************************************************************************************
* 파일명 : SE_SND_1600WB.java
* 기능 : 판매 - 발송관리 - 공장판별발송내역 조회
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

import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_1600DAO;
import chosun.ciis.se.snd.dm.SE_SND_1600_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1610_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1600_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1610_LDataSet;
/**
 * 
 */

public class SE_SND_1600WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1600_MDataSet ds = null;

        // DM Setting
        SE_SND_1600_MDM dm 		= new SE_SND_1600_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1600DAO dao = new SE_SND_1600DAO();
            ds = dao.se_snd_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1600EJBHome home = (SE_SND_1600EJBHome) JNDIManager.getInstance().getHome("SE_SND_1600EJB");
//        
//        try {
//        	SE_SND_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1600_m(dm);
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
    public void se_snd_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1610_LDataSet ds = null;

        // DM Setting
        SE_SND_1610_LDM dm 		= new SE_SND_1610_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
        String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no"		, true);
        String issu_dt			= Util.checkString(req.getParameter("issu_dt"		));
        String route_clsf		= Util.checkString(req.getParameter("route_clsf"	));
        String prt_plac_cd		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String medi_cd			= Util.checkString(req.getParameter("medi_cd"		));
        String spsl_gubun		= Util.checkString(req.getParameter("spsl_gubun"	));
        
        String token			= "";
        StringTokenizer st 		= new StringTokenizer(prt_plac_cd, "#");
        int i = 0;
        while ( st.hasMoreTokens() ){
        	i++;
        	if ( i > 1 ){
        		token			= token + ",";
        	}
        	token 				+= "\'" + st.nextToken() + "\'";
        }
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIssu_dt			(issu_dt		);
        dm.setRoute_clsf		(route_clsf		);
        dm.setPrt_plac_cd		(token	);
        dm.setMedi_cd			(medi_cd		);
        dm.setSpsl_gubun		(spsl_gubun		);
        
        try {
        	SE_SND_1600DAO dao = new SE_SND_1600DAO();
            ds = dao.se_snd_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1600EJBHome home = (SE_SND_1600EJBHome) JNDIManager.getInstance().getHome("SE_SND_1600EJB");
//        
//        try {
//        	SE_SND_1600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1610_l(dm);
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
