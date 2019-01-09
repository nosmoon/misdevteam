/***************************************************************************************************
 * 파일명 : PL_LST_1000WB.java
 * 기능 : 출력관리-거래내역
 * 작성일자 : 2009.05.25
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.lst.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.lst.dao.PL_LST_1000DAO;
import chosun.ciis.pl.lst.dm.PL_LST_1000_MDM;
import chosun.ciis.pl.lst.dm.PL_LST_1710_PDM;
import chosun.ciis.pl.lst.ds.PL_LST_1000_MDataSet;
import chosun.ciis.pl.lst.ds.PL_LST_1710_PDataSet;

/**
 * 
 */
public class PL_LST_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 초기 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_lst_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_LST_1000_MDataSet ds = null;

        // DM Setting
        PL_LST_1000_MDM dm = new PL_LST_1000_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	PL_LST_1000DAO dao = new PL_LST_1000DAO();
            ds = dao.pl_lst_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_LST_1000EJBHome home = (PL_LST_1000EJBHome) JNDIManager.getInstance().getHome("PL_LST_1000EJB");
//        try {
//        	PL_LST_1000EJB ejb = home.create();
//            ds = ejb.pl_lst_1000_m(dm);
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
     * 대행사 UPLOAD용 엑셀 DOWNLOAD Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_lst_1710_p(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_LST_1710_PDataSet ds = null;

        // DM Setting
        PL_LST_1710_PDM dm = new PL_LST_1710_PDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String fr_dt = Util.checkString(req.getParameter("fr_dt"));									//거래시작일자
		String to_dt = Util.checkString(req.getParameter("to_dt"));                                 //거래종료일자
		String kyobo_yn = Util.checkString(req.getParameter("kyobo_yn"));                           //교보여부
		String wh_cd = Util.checkString(req.getParameter("wh_cd"));                                 //창고코드
		String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));                         //거래구분
		String issu_cmpy = Util.checkString(req.getParameter("issu_cmpy"));                         //발행사
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));                             //거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));                           //거래처순번
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));                             //매체코드
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));                     //매체호수

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setFr_dt(fr_dt);
		dm.setTo_dt(to_dt);
		dm.setKyobo_yn(kyobo_yn);
		dm.setWh_cd(wh_cd);
		dm.setDeal_clsf(deal_clsf);
		dm.setIssu_cmpy(issu_cmpy);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_LST_1000DAO dao = new PL_LST_1000DAO();
            ds = dao.pl_lst_1710_p(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_LST_1000EJBHome home = (PL_LST_1000EJBHome) JNDIManager.getInstance().getHome("PL_LST_1000EJB");
//        try {
//        	PL_LST_1000EJB ejb = home.create();
//            ds = ejb.pl_lst_1710_p(dm);
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
