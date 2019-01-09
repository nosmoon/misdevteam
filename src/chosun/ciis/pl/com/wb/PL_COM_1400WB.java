/***************************************************************************************************
 * 파일명 : PL_COM_1400WB.java
 * 기능 : 공통관리-거래처발송처검색팝업
 * 작성일자 : 2009.03.26
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.com.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.com.dao.PL_COM_1400DAO;
import chosun.ciis.pl.com.dm.PL_COM_1400_MDM;
import chosun.ciis.pl.com.dm.PL_COM_1410_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1420_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1400_MDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1410_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1420_SDataSet;

/**
 * 
 */
public class PL_COM_1400WB extends BaseWB {

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
    public void pl_com_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1400_MDataSet ds = null;

        // DM Setting
        PL_COM_1400_MDM dm = new PL_COM_1400_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_COM_1400DAO dao = new PL_COM_1400DAO();
            ds = dao.pl_com_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1400EJBHome home = (PL_COM_1400EJBHome) JNDIManager.getInstance().getHome("PL_COM_1400EJB");
//        try {
//        	PL_COM_1400EJB ejb = home.create();
//            ds = ejb.pl_com_1400_m(dm);
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
	public void pl_com_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1410_LDataSet ds = null;
		PL_COM_1410_LDM dm = new PL_COM_1410_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));				//거래처구분
		String area = Util.checkString(req.getParameter("area"));						//지역
		String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));					//거래처명
		String prv_curr_clsf = Util.checkString(req.getParameter("prv_curr_clsf"));		//전현임구분

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_nm(dlco_nm);
		dm.setPrv_curr_clsf(prv_curr_clsf);

        try {
        	PL_COM_1400DAO dao = new PL_COM_1400DAO();
            ds = dao.pl_com_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1400EJBHome home = (PL_COM_1400EJBHome)JNDIManager.getInstance().getHome("PL_COM_1400EJB");
//		try {
//			PL_COM_1400EJB ejb = home.create();
//
//			ds = ejb.pl_com_1410_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}
    
    /**
     * 1건조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
	public void pl_com_1420_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1420_SDataSet ds = null;
		PL_COM_1420_SDM dm = new PL_COM_1420_SDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));				//거래처구분
		String area = Util.checkString(req.getParameter("area"));						//지역
		String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));					//거래처명
		String prv_curr_clsf = Util.checkString(req.getParameter("prv_curr_clsf"));		//전현임구분

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_nm(dlco_nm);
		dm.setPrv_curr_clsf(prv_curr_clsf);

        try {
        	PL_COM_1400DAO dao = new PL_COM_1400DAO();
            ds = dao.pl_com_1420_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1400EJBHome home = (PL_COM_1400EJBHome)JNDIManager.getInstance().getHome("PL_COM_1400EJB");
//		try {
//			PL_COM_1400EJB ejb = home.create();
//
//			ds = ejb.pl_com_1420_s(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}
    
}
