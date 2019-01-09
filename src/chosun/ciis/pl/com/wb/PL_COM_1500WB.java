/***************************************************************************************************
 * 파일명 : PL_COM_1500WB.java
 * 기능 : 공통관리-할제리턴
 * 작성일자 : 2009.03.24
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
import chosun.ciis.pl.com.dao.PL_COM_1500DAO;
import chosun.ciis.pl.com.dm.PL_COM_1510_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1510_SDataSet;

/**
 * 
 */
public class PL_COM_1500WB extends BaseWB {

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
    public void pl_com_1510_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1510_SDataSet ds = null;

        // DM Setting
        PL_COM_1510_SDM dm = new PL_COM_1510_SDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//사용자ID

        //정상적으로 Request로 받을 파라메터
        String flag = Util.checkString(req.getParameter("flag"));
        String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
        String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
        String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
        String medi_cd = Util.checkString(req.getParameter("medi_cd"));
        String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
        
        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setFlag(flag);
        dm.setDeal_clsf(deal_clsf);
        dm.setDlco_cd(dlco_cd);
        dm.setDlco_seq(dlco_seq);
        dm.setMedi_cd(medi_cd);
        dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_COM_1500DAO dao = new PL_COM_1500DAO();
            ds = dao.pl_com_1510_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//	      PL_COM_1500EJBHome home = (PL_COM_1500EJBHome) JNDIManager.getInstance().getHome("PL_COM_1500EJB");
//        try {
//        	PL_COM_1500EJB ejb = home.create();
//            ds = ejb.pl_com_1510_s(dm);
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
