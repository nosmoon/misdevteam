/***************************************************************************************************
 * 파일명 : SSExtn2400WB.java
* 기능 : 확장현황-기타확장관련작업을 위한 Worker bean
* 작성일자 : 2012-02-20
* 작성자 : 이혁
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * 확장현황-신청현황 을 위한 WB
 */

public class SSExtn2400WB {
    
    /**
     * 확장현황-대학생캠페인확장 목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
	public void selectCampExtnUniList(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SL_L_CAMPEXTN_UNIDataSet ds = null;
		SL_L_CAMPEXTN_UNIDM dm = new SL_L_CAMPEXTN_UNIDM();

		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));

		dm.print();

        	SSExtn2400DAO dao = new SSExtn2400DAO();
        	// DAO 객체의 selectList 호출
        	ds = dao.selectCampExtnUniList(dm);
        	req.setAttribute("ds", ds);
	}

}
