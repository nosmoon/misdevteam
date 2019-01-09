/***************************************************************************************************
 * 파일명 : AdRes1700DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.res.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.res.dm.AD_RES_1710_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1710_LDataSet;
/**
 * 
 */
public class AdRes1700DAO {
	
    public AD_RES_1710_LDataSet ad_res_1710_l(AD_RES_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1710_LDataSet ds = (AD_RES_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
}
