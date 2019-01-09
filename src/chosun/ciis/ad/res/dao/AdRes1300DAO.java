/***************************************************************************************************
 * 파일명 : AdRes1300DAO.java
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
import chosun.ciis.ad.res.dm.AD_RES_1300_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1310_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1320_UDM;
import chosun.ciis.ad.res.ds.AD_RES_1300_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1310_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1320_UDataSet;
/**
 * 
 */
public class AdRes1300DAO {
	
    public AD_RES_1300_MDataSet ad_res_1300_m(AD_RES_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1300_MDataSet ds = (AD_RES_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_1310_LDataSet ad_res_1310_l(AD_RES_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1310_LDataSet ds = (AD_RES_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_RES_1320_UDataSet ad_res_1320_u(AD_RES_1320_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1320_UDataSet ds = (AD_RES_1320_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
