/***************************************************************************************************
 * 파일명 : PL_COM_1600WB.java
 * 기능 : 공통관리-은행코드검색팝업
 * 작성일자 : 2009.04.22
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
import chosun.ciis.pl.com.dao.PL_COM_1600DAO;
import chosun.ciis.pl.com.dm.PL_COM_1610_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1620_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1610_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1620_SDataSet;

/**
 * 
 */
public class PL_COM_1600WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
	public void pl_com_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1610_LDataSet ds = null;
		PL_COM_1610_LDM dm = new PL_COM_1610_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
		String bank_cd = Util.checkString(req.getParameter("bank_cd"));					//은행코드
		String bank_nm = Util.checkString(req.getParameter("bank_nm"));					//은행지점명

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setBank_cd(bank_cd);
		dm.setBank_nm(bank_nm);

        try {
        	PL_COM_1600DAO dao = new PL_COM_1600DAO();
            ds = dao.pl_com_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1600EJBHome home = (PL_COM_1600EJBHome)JNDIManager.getInstance().getHome("PL_COM_1600EJB");
//			PL_COM_1600EJB ejb = home.create();
//
//			ds = ejb.pl_com_1610_l(dm);
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
	public void pl_com_1620_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1620_SDataSet ds = null;
		PL_COM_1620_SDM dm = new PL_COM_1620_SDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
		String bank_cd = Util.checkString(req.getParameter("bank_cd"));					//은행코드

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setBank_cd(bank_cd);

        try {
        	PL_COM_1600DAO dao = new PL_COM_1600DAO();
            ds = dao.pl_com_1620_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1600EJBHome home = (PL_COM_1600EJBHome)JNDIManager.getInstance().getHome("PL_COM_1600EJB");
//			PL_COM_1600EJB ejb = home.create();
//
//			ds = ejb.pl_com_1620_s(dm);
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
