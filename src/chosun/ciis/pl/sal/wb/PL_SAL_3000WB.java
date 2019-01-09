/***************************************************************************************************
 * 파일명 : PL_SAL_3000WB.java
 * 기능 : 배본관리-발송계산서(일괄)
 * 작성일자 : 2009.04.08
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.sal.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.sal.dao.PL_SAL_3000DAO;
import chosun.ciis.pl.sal.dm.PL_SAL_3000_MDM;
import chosun.ciis.pl.sal.dm.PL_SAL_3010_LDM;
import chosun.ciis.pl.sal.ds.PL_SAL_3000_MDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_3010_LDataSet;

/**
 * 
 */
public class PL_SAL_3000WB extends BaseWB {

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
    public void pl_sal_3000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_3000_MDataSet ds = null;

        // DM Setting
        PL_SAL_3000_MDM dm = new PL_SAL_3000_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_SAL_3000DAO dao = new PL_SAL_3000DAO();
            ds = dao.pl_sal_3000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_3000EJBHome home = (PL_SAL_3000EJBHome) JNDIManager.getInstance().getHome("PL_SAL_3000EJB");
//        try {
//        	PL_SAL_3000EJB ejb = home.create();
//            ds = ejb.pl_sal_3000_m(dm);
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
    public void pl_sal_3010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_3010_LDataSet ds = null;

        // DM Setting
        PL_SAL_3010_LDM dm = new PL_SAL_3010_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));							//기준년월
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//매체순번
		String sendclsf = Util.checkString(req.getParameter("sendclsf"));							//발송구분
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//거래처구분
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//거래처순번

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_yymm(basi_yymm);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setSendclsf(sendclsf);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_SAL_3000DAO dao = new PL_SAL_3000DAO();
            ds = dao.pl_sal_3010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_3000EJBHome home = (PL_SAL_3000EJBHome) JNDIManager.getInstance().getHome("PL_SAL_3000EJB");
//        try {
//        	PL_SAL_3000EJB ejb = home.create();
//            ds = ejb.pl_sal_3010_l(dm);
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
    
