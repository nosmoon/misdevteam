/***************************************************************************************************
 * 파일명 : AdTax1800DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1800_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1810_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1820_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1800_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1810_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1820_ADataSet;

/**
 * 
 */
public class AdTax1800DAO {

    public AD_TAX_1800_MDataSet ad_tax_1800_m(AD_TAX_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1800_MDataSet ds = (AD_TAX_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1810_LDataSet ad_tax_1810_l(AD_TAX_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1810_LDataSet ds = (AD_TAX_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1820_ADataSet ad_tax_1820_a(AD_TAX_1820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1820_ADataSet ds = (AD_TAX_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    


}
