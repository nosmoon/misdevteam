/***************************************************************************************************
* 파일명 : SE_BAS_1300WB.java
* 기능 :  판매 - 기준정보 - 매체단가조회 
 * 작성일자 : 2009.02.21
 * 작성자 :   이민효
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
import chosun.ciis.se.bas.dao.SE_BAS_1300DAO;
import chosun.ciis.se.bas.dm.SE_BAS_1300_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1310_LDM;
import chosun.ciis.se.bas.ds.SE_BAS_1300_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1310_LDataSet;
/**
 * 
 */

public class SE_BAS_1300WB extends BaseWB{
    
    /**
     * 담당자 구분과 담당부서 코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1300_MDataSet ds = null;

        // DM Setting
        SE_BAS_1300_MDM dm = new SE_BAS_1300_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_BAS_1300DAO dao = new SE_BAS_1300DAO();
            ds = dao.se_bas_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1300EJBHome home = (SE_BAS_1300EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1300EJB");
//        
//        try {
//        	SE_BAS_1300EJB ejb = home.create();
//            ds = ejb.se_bas_1300_m(dm);
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
     * 검색조건에 맞는 담당자 이력 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bas_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1310_LDataSet ds = null;

        // DM Setting
        SE_BAS_1310_LDM dm 	= new SE_BAS_1310_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
        String gb = Util.checkString(req.getParameter("gb"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setAply_yymm(aply_yymm);
        dm.setGb(gb);

        try {
        	SE_BAS_1300DAO dao = new SE_BAS_1300DAO();
            ds = dao.se_bas_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
//        SE_BAS_1300EJBHome home = (SE_BAS_1300EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1300EJB");
//        
//        try {
//        	SE_BAS_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1310_l(dm);
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
