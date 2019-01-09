/***************************************************************************************************
 * 파일명 : AdTax2100DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_2100_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2110_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2120_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_2100_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2110_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2120_ADataSet;

/**
 * 
 */
public class AdTax2100DAO {

    public AD_TAX_2100_MDataSet ad_tax_2100_m(AD_TAX_2100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2100_MDataSet ds = (AD_TAX_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_2110_LDataSet ad_tax_2110_l(AD_TAX_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2110_LDataSet ds = (AD_TAX_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_2120_ADataSet ad_tax_2120_a(AD_TAX_2120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2120_ADataSet ds = (AD_TAX_2120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
