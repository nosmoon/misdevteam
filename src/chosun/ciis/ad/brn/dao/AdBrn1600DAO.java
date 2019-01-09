/***************************************************************************************************
 * 파일명 : AdBrn1600DAO.java
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
import chosun.ciis.ad.brn.dm.AD_BRN_1600_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1610_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1620_SDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1630_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1650_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1600_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1610_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1620_SDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1630_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1650_ADataSet;

/**
 * 
 */
public class AdBrn1600DAO {
	
    public AD_BRN_1600_MDataSet ad_brn_1600_m(AD_BRN_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1600_MDataSet ds = (AD_BRN_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1610_LDataSet ad_brn_1610_l(AD_BRN_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1610_LDataSet ds = (AD_BRN_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1620_SDataSet ad_brn_1620_s(AD_BRN_1620_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1620_SDataSet ds = (AD_BRN_1620_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1630_LDataSet ad_brn_1630_l(AD_BRN_1630_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1630_LDataSet ds = (AD_BRN_1630_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_BRN_1650_ADataSet ad_brn_1650_a(AD_BRN_1650_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1650_ADataSet ds = (AD_BRN_1650_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
