/***************************************************************************************************
* 파일명 : SE_BAS_1500WB.java
* 기능 :  판매 - 기준정보 - 담당월업무처리현황
* 작성일자 : 2009.08.25
* 작성자 :   김상옥
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bas.dao.SE_BAS_1500DAO;
import chosun.ciis.se.bas.dm.SE_BAS_1500_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1510_LDM;
import chosun.ciis.se.bas.ds.SE_BAS_1500_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1510_LDataSet;
/**
 * 
 */

public class SE_BAS_1500WB extends BaseWB{

    /**
     * 초기셋팅을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1500_MDataSet ds = null;

        // DM Setting
        SE_BAS_1500_MDM dm = new SE_BAS_1500_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);

		String auth_gb			= "1";
		String feat_clsf		= "";

		dm.setCmpy_cd(cmpy_cd);
		dm.setAuth_gb(auth_gb);
		dm.setIncmg_pers(incmg_pers);
		dm.setFeat_clsf(feat_clsf);
        
        try {
        	SE_BAS_1500DAO dao = new SE_BAS_1500DAO();
            ds = dao.se_bas_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1500EJBHome home = (SE_BAS_1500EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1500EJB");
//        
//        try {
//        	SE_BAS_1500EJB ejb = home.create();
//            ds = ejb.se_bas_1500_m(dm);
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
     * 검색조건에 맞는 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1510_LDataSet ds = null;

        // DM Setting
        SE_BAS_1510_LDM dm 	= new SE_BAS_1510_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);

        String team				= Util.checkString(req.getParameter("team"			));
        String part				= Util.checkString(req.getParameter("part"			));
        String area				= Util.checkString(req.getParameter("area"			));
		String bas_yymm			= Util.checkString(req.getParameter("bas_yymm"		));
		String srchgb			= Util.checkString(req.getParameter("srchgb"		));

		dm.setCmpy_cd(cmpy_cd);
		dm.setTeam(team);
		dm.setPart(part);
		dm.setArea(area);
		dm.setBas_yymm(bas_yymm);
		dm.setIncmg_pers(incmg_pers);
		dm.setSrchgb(srchgb);
        
        try {
        	SE_BAS_1500DAO dao = new SE_BAS_1500DAO();
            ds = dao.se_bas_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1500EJBHome home = (SE_BAS_1500EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1500EJB");
//        
//        try {
//        	SE_BAS_1500EJB ejb = home.create();
//            ds = ejb.se_bas_1510_l(dm);
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
