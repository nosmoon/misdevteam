/***************************************************************************************************
 * 파일명 : AdBrn1300DAO.java
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
import chosun.ciis.ad.brn.dm.AD_BRN_1300_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1310_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1320_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1321_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1322_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1330_SDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1300_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1310_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1320_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1321_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1322_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1330_SDataSet;
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;

/**
 * 
 */
public class AdBrn1300DAO {

    public AD_BRN_1300_MDataSet ad_brn_1300_m(AD_BRN_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1300_MDataSet ds = (AD_BRN_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1310_LDataSet ad_brn_1310_l(AD_BRN_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1310_LDataSet ds = (AD_BRN_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_CO_9004_SDataSet ad_brn_1311_s(AD_CO_9004_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9004_SDataSet ds = (AD_CO_9004_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_BRN_1320_ADataSet ad_brn_1320_a(AD_BRN_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1320_ADataSet ds = (AD_BRN_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_BRN_1321_ADataSet ad_brn_1321_a(AD_BRN_1321_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1321_ADataSet ds = (AD_BRN_1321_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_BRN_1322_ADataSet ad_brn_1322_a(AD_BRN_1322_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1322_ADataSet ds = (AD_BRN_1322_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_BRN_1330_SDataSet ad_brn_1330_s(AD_BRN_1330_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1330_SDataSet ds = (AD_BRN_1330_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
     
}
