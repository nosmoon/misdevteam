/***************************************************************************************************
 * 파일명 : AdRes1800DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
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
import chosun.ciis.ad.res.dm.AD_RES_1800_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1810_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1800_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1810_LDataSet;
/**
 * 
 */
public class AdRes1800DAO {
	
    public AD_RES_1800_MDataSet ad_res_1800_m(AD_RES_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1800_MDataSet ds = (AD_RES_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_1810_LDataSet ad_res_1810_l(AD_RES_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1810_LDataSet ds = (AD_RES_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}
