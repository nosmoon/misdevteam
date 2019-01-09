/***************************************************************************************************
 * 파일명 : AdTax1100DAO.java
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

package chosun.ciis.ad.tax.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;
import chosun.ciis.ad.tax.dm.AD_TAX_1100_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1110_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1120_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1121_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1122_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1130_SDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1100_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1110_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1120_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1121_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1122_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1130_SDataSet;

/**
 * 
 */
public class AdTax1100DAO {

    public AD_TAX_1100_MDataSet ad_tax_1100_m(AD_TAX_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1100_MDataSet ds = (AD_TAX_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_CO_9004_SDataSet ad_tax_1105_s(AD_CO_9004_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9004_SDataSet ds = (AD_CO_9004_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    
    public AD_TAX_1110_LDataSet ad_tax_1110_l(AD_TAX_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1110_LDataSet ds = (AD_TAX_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_TAX_1120_ADataSet ad_tax_1120_a(AD_TAX_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1120_ADataSet ds = (AD_TAX_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1121_ADataSet ad_tax_1121_a(AD_TAX_1121_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1121_ADataSet ds = (AD_TAX_1121_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_TAX_1122_ADataSet ad_tax_1122_a(AD_TAX_1122_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1122_ADataSet ds = (AD_TAX_1122_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1130_SDataSet ad_tax_1130_s(AD_TAX_1130_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1130_SDataSet ds = (AD_TAX_1130_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
}
