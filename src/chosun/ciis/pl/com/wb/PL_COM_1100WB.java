/***************************************************************************************************
 * 파일명 : PL_COM_1100WB.java
 * 기능 : 공통관리-매체검색팝업
 * 작성일자 : 2009.02.17
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
import chosun.ciis.pl.com.dao.PL_COM_1100DAO;
import chosun.ciis.pl.com.dm.PL_COM_1100_MDM;
import chosun.ciis.pl.com.dm.PL_COM_1110_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1120_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1100_MDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1110_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1120_SDataSet;

/**
 * 
 */
public class PL_COM_1100WB extends BaseWB {

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
    public void pl_com_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1100_MDataSet ds = null;

        // DM Setting
        PL_COM_1100_MDM dm = new PL_COM_1100_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_COM_1100DAO dao = new PL_COM_1100DAO();
            ds = dao.pl_com_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1100EJBHome home = (PL_COM_1100EJBHome) JNDIManager.getInstance().getHome("PL_COM_1100EJB");
//        try {
//        	PL_COM_1100EJB ejb = home.create();
//            ds = ejb.pl_com_1100_m(dm);
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
	public void pl_com_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1110_LDataSet ds = null;
		PL_COM_1110_LDM dm = new PL_COM_1110_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//매체구분
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));					//매체코드
		String medi_nm = Util.checkString(req.getParameter("medi_nm"));					//매체명
		String absence_clsf = Util.checkString(req.getParameter("absence_clsf"));		//절판구분

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_nm(medi_nm);
		dm.setAbsence_clsf(absence_clsf);

        try {
        	PL_COM_1100DAO dao = new PL_COM_1100DAO();
            ds = dao.pl_com_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1100EJBHome home = (PL_COM_1100EJBHome)JNDIManager.getInstance().getHome("PL_COM_1100EJB");
//			PL_COM_1100EJB ejb = home.create();
//
//			ds = ejb.pl_com_1110_l(dm);
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
	public void pl_com_1120_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1120_SDataSet ds = null;
		PL_COM_1120_SDM dm = new PL_COM_1120_SDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//매체구분
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));					//매체코드
		String medi_nm = Util.checkString(req.getParameter("medi_nm"));					//매체명
		String absence_clsf = Util.checkString(req.getParameter("absence_clsf"));		//절판구분

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_nm(medi_nm);
		dm.setAbsence_clsf(absence_clsf);

        try {
        	PL_COM_1100DAO dao = new PL_COM_1100DAO();
            ds = dao.pl_com_1120_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1100EJBHome home = (PL_COM_1100EJBHome)JNDIManager.getInstance().getHome("PL_COM_1100EJB");
//			PL_COM_1100EJB ejb = home.create();
//
//			ds = ejb.pl_com_1120_s(dm);
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
