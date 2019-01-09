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
import chosun.ciis.ad.tax.dm.AD_TAX_2700_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2710_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2750_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_2751_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2700_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2710_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2750_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2751_LDataSet;

/**
 * 
 */
public class AdTax2700DAO {

    public AD_TAX_2700_MDataSet ad_tax_2700_m(AD_TAX_2700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2700_MDataSet ds = (AD_TAX_2700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_2710_LDataSet ad_tax_2710_l(AD_TAX_2710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2710_LDataSet ds = (AD_TAX_2710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_2750_ADataSet ad_tax_2750_a(AD_TAX_2750_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2750_ADataSet ds = (AD_TAX_2750_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_TAX_2751_LDataSet ad_tax_2751_l(AD_TAX_2751_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2751_LDataSet ds = (AD_TAX_2751_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}
