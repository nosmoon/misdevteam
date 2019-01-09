/***************************************************************************************************
 * 파일명 : PL_LST_3000WB.java
 * 기능 : 출력관리-마감내역
 * 작성일자 : 2009.06.09
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
import chosun.ciis.pl.lst.dao.PL_LST_3000DAO;
import chosun.ciis.pl.lst.dm.PL_LST_3000_MDM;
import chosun.ciis.pl.lst.ds.PL_LST_3000_MDataSet;

/**
 * 
 */
public class PL_LST_3000WB extends BaseWB {

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
    public void pl_lst_3000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_LST_3000_MDataSet ds = null;

        // DM Setting
        PL_LST_3000_MDM dm = new PL_LST_3000_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	PL_LST_3000DAO dao = new PL_LST_3000DAO();
            ds = dao.pl_lst_3000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_LST_3000EJBHome home = (PL_LST_3000EJBHome) JNDIManager.getInstance().getHome("PL_LST_3000EJB");
//        try {
//        	PL_LST_3000EJB ejb = home.create();
//            ds = ejb.pl_lst_3000_m(dm);
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
