/***************************************************************************************************
 * 파일명   : PSprint1101EJBHome.java
 * 기능     : 출력-출력화면의 코드값을 조회
 * 작성일자 : 2006-02-01
 * 작성자   : 전현표
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.print.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.print.ejb.*;
import chosun.ciis.ps.pbs.print.ds.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.dao.*;

/**
 * 출력-출력초기매뉴
 */

public class PSPrint1101WB {

    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_PRINT_INITDataSet ds = null;

        //사용자 세션정보
       String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // 회사코드
       String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //입력자아이디


        PS_S_PRINT_INITDM dm = new PS_S_PRINT_INITDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd); // 지국지사코드

        PSPrint1101EJBHome home = (PSPrint1101EJBHome) JNDIManager.getInstance().getHome("PSPrint1101EJB");
        try {

            PSPrint1101EJB ejb = home.create();
            ds = ejb.selectCodeList(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

}
