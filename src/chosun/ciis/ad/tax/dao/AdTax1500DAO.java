/***************************************************************************************************
 * 파일명 : AdTax1500DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1510_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1520_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1510_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1520_ADataSet;

/**
 * 
 */
public class AdTax1500DAO {

    public AD_TAX_1510_LDataSet ad_tax_1510_l(AD_TAX_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1510_LDataSet ds = (AD_TAX_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1520_ADataSet ad_tax_1520_a(AD_TAX_1520_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1520_ADataSet ds = (AD_TAX_1520_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    


}
