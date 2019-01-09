/***************************************************************************************************
 * 파일명 : AdTax2300DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_2300_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2310_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2320_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2330_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2300_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2310_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2320_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2330_LDataSet;

/**
 * 
 */
public class AdTax2300DAO {

    public AD_TAX_2300_MDataSet ad_tax_2300_m(AD_TAX_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2300_MDataSet ds = (AD_TAX_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_2310_LDataSet ad_tax_2310_l(AD_TAX_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2310_LDataSet ds = (AD_TAX_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_2320_LDataSet ad_tax_2320_l(AD_TAX_2320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2320_LDataSet ds = (AD_TAX_2320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_TAX_2330_LDataSet ad_tax_2330_l(AD_TAX_2330_LDM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2330_LDataSet ds = (AD_TAX_2330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
