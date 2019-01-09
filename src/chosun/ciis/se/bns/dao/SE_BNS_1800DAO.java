/***************************************************************************************************
* 파일명 : SE_BNS_1800DAO.java
* 기능 : 판매-판촉물관리 - 판촉물리스트
* 작성일자 : 2009-05-11
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_1800_MDM;
import chosun.ciis.se.bns.ds.SE_BNS_1800_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_1800DAO {
	
    public SE_BNS_1800_MDataSet se_bns_1800_m(SE_BNS_1800_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1800_MDataSet ds = (SE_BNS_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

   
}
