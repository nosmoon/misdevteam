/***************************************************************************************************
* 파일명 : SE_RCP_4300DAO.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 스포츠관련발행
* 작성일자 : 2009-05-25
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import chosun.ciis.se.rcp.dm.SE_RCP_4300_MDM;
import chosun.ciis.se.rcp.ds.SE_RCP_4300_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_4300DAO {
	
    public SE_RCP_4300_MDataSet se_rcp_4300_m(SE_RCP_4300_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_4300_MDataSet ds = (SE_RCP_4300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
