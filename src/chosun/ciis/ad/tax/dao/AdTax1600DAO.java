/***************************************************************************************************
 * 파일명 : AdTax1600DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1600_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1610_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1620_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1600_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1610_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1620_ADataSet;

/**
 * 
 */
public class AdTax1600DAO {

    public AD_TAX_1600_MDataSet ad_tax_1600_m(AD_TAX_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1600_MDataSet ds = (AD_TAX_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1610_LDataSet ad_tax_1610_l(AD_TAX_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1610_LDataSet ds = (AD_TAX_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1620_ADataSet ad_tax_1620_a(AD_TAX_1620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1620_ADataSet ds = (AD_TAX_1620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
