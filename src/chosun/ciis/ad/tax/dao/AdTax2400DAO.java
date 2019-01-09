/***************************************************************************************************
 * 파일명 : AdTax2400DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_2400_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2410_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2400_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2410_LDataSet;

/**
 * 
 */
public class AdTax2400DAO {

    public AD_TAX_2400_MDataSet ad_tax_2400_m(AD_TAX_2400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2400_MDataSet ds = (AD_TAX_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_2410_LDataSet ad_tax_2410_l(AD_TAX_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2410_LDataSet ds = (AD_TAX_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
