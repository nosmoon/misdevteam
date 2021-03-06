/***************************************************************************************************
 * 파일명 : PL_RCP_3000WB.java
 * 기능 : 입금관리-입금전표조회
 * 작성일자 : 2009.04.24
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
import chosun.ciis.pl.rcp.dao.PL_RCP_3000DAO;
import chosun.ciis.pl.rcp.dm.PL_RCP_3010_LDM;
import chosun.ciis.pl.rcp.ds.PL_RCP_3010_LDataSet;

/**
 * 
 */
public class PL_RCP_3000WB extends BaseWB {

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
    public void pl_rcp_3010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_3010_LDataSet ds = null;

        // DM Setting
        PL_RCP_3010_LDM dm = new PL_RCP_3010_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String fr_dt = Util.checkString(req.getParameter("fr_dt"));									//기간FROM
		String to_dt = Util.checkString(req.getParameter("to_dt"));									//기간TO
		String rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));							//입금구분
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//거래처순번

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setFr_dt(fr_dt);
		dm.setTo_dt(to_dt);
		dm.setRcpm_clsf(rcpm_clsf);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_3000DAO dao = new PL_RCP_3000DAO();
            ds = dao.pl_rcp_3010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_3000EJBHome home = (PL_RCP_3000EJBHome) JNDIManager.getInstance().getHome("PL_RCP_3000EJB");
//        try {
//        	PL_RCP_3000EJB ejb = home.create();
//            ds = ejb.pl_rcp_3010_l(dm);
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
