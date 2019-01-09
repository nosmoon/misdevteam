/***************************************************************************************************
 * 파일명 : AdRes1100DAO.java
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
import chosun.ciis.ad.res.dm.AD_RES_1100_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1110_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1120_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1130_IDM;
import chosun.ciis.ad.res.ds.AD_RES_1100_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1110_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1120_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1130_IDataSet;

/**
 * 
 */
public class AdRes1100DAO {
	
    public AD_RES_1100_MDataSet ad_res_1100_m(AD_RES_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1100_MDataSet ds = (AD_RES_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    
	
    public AD_RES_1110_LDataSet ad_res_1110_l(AD_RES_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1110_LDataSet ds = (AD_RES_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
	
    public AD_RES_1120_UDataSet ad_res_1120_u(AD_RES_1120_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1120_UDataSet ds = (AD_RES_1120_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_1130_IDataSet ad_res_1130_i(AD_RES_1130_IDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1130_IDataSet ds = (AD_RES_1130_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
