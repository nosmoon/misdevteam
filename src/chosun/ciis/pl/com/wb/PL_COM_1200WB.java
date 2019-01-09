/***************************************************************************************************
 * 파일명 : PL_COM_1200WB.java
 * 기능 : 공통관리-사내판매출고처리
 * 작성일자 : 2009.04.06
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
import chosun.ciis.pl.com.dao.PL_COM_1200DAO;
import chosun.ciis.pl.com.dm.PL_COM_1210_SDM;
import chosun.ciis.pl.com.dm.PL_COM_1220_ADM;
import chosun.ciis.pl.com.ds.PL_COM_1210_SDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1220_ADataSet;

/**
 * 
 */
public class PL_COM_1200WB extends BaseWB {

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
	public void pl_com_1210_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1210_SDataSet ds = null;
		PL_COM_1210_SDM dm = new PL_COM_1210_SDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//매체구분
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));					//주문일자
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));		//주문그룹순번

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);

        try {
        	PL_COM_1200DAO dao = new PL_COM_1200DAO();
            ds = dao.pl_com_1210_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1200EJBHome home = (PL_COM_1200EJBHome)JNDIManager.getInstance().getHome("PL_COM_1200EJB");
//		try {
//			PL_COM_1200EJB ejb = home.create();
//
//			ds = ejb.pl_com_1210_s(dm);
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
     * 저장/삭제 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
	public void pl_com_1220_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1220_ADataSet ds = null;
		PL_COM_1220_ADM dm = new PL_COM_1220_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);			//사용자
		String incmg_pers_ip = req.getRemoteAddr();   									//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));				//처리구분
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//매체구분
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));					//주문일자
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));		//주문그룹순번
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));				//기준년월
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));					//기준일자
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));			//비고

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_clsf(medi_clsf);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.setRemk(remk);

        try {
        	PL_COM_1200DAO dao = new PL_COM_1200DAO();
            ds = dao.pl_com_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1200EJBHome home = (PL_COM_1200EJBHome)JNDIManager.getInstance().getHome("PL_COM_1200EJB");
//		try {
//			PL_COM_1200EJB ejb = home.create();
//
//			ds = ejb.pl_com_1220_a(dm);
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
