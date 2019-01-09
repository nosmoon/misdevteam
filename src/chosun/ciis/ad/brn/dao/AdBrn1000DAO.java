/***************************************************************************************************
 * 파일명 : AdBrn1000DAO.java
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

package chosun.ciis.ad.brn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.brn.dm.AD_BRN_1000_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1010_SDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1020_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1030_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1000_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1010_SDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1020_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1030_LDataSet;

/**
 * 
 */
public class AdBrn1000DAO {
	
    public AD_BRN_1000_MDataSet ad_brn_1000_m(AD_BRN_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1000_MDataSet ds = (AD_BRN_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1010_SDataSet ad_brn_1010_s(AD_BRN_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1010_SDataSet ds = (AD_BRN_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1020_ADataSet ad_brn_1020_a(AD_BRN_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1020_ADataSet ds = (AD_BRN_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1030_LDataSet ad_brn_1030_l(AD_BRN_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1030_LDataSet ds = (AD_BRN_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
