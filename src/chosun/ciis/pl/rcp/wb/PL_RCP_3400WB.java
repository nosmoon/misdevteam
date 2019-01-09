/***************************************************************************************************
 * 파일명 : PL_RCP_3400WB.java
 * 기능 : 입금관리-미수일람표
 * 작성일자 : 2009.04.27
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.rcp.dao.PL_RCP_3400DAO;
import chosun.ciis.pl.rcp.dm.PL_RCP_3400_MDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_3410_LDM;
import chosun.ciis.pl.rcp.ds.PL_RCP_3400_MDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_3410_LDataSet;

/**
 * 
 */
public class PL_RCP_3400WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 초기화면 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_rcp_3400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_3400_MDataSet ds = null;

        // DM Setting
        PL_RCP_3400_MDM dm = new PL_RCP_3400_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RCP_3400DAO dao = new PL_RCP_3400DAO();
            ds = dao.pl_rcp_3400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_3400EJBHome home = (PL_RCP_3400EJBHome) JNDIManager.getInstance().getHome("PL_RCP_3400EJB");
//        try {
//        	PL_RCP_3400EJB ejb = home.create();
//            ds = ejb.pl_rcp_3400_m(dm);
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
     * 조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_rcp_3410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_3410_LDataSet ds = null;

        // DM Setting
        PL_RCP_3410_LDM dm = new PL_RCP_3410_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));							//기준년월
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//매체구분
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//거래처구분
		String area = Util.checkString(req.getParameter("area"));									//지역
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//거래처순번

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_yymm(basi_yymm);
		dm.setMedi_clsf(medi_clsf);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_3400DAO dao = new PL_RCP_3400DAO();
            ds = dao.pl_rcp_3410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_3400EJBHome home = (PL_RCP_3400EJBHome) JNDIManager.getInstance().getHome("PL_RCP_3400EJB");
//        try {
//        	PL_RCP_3400EJB ejb = home.create();
//            ds = ejb.pl_rcp_3410_l(dm);
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
