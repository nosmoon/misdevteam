/***************************************************************************************************
 * 파일명 : AdTax2200DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_2200_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2210_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2200_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2210_LDataSet;

/**
 * 
 */
public class AdTax2200DAO {

    public AD_TAX_2200_MDataSet ad_tax_2200_m(AD_TAX_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2200_MDataSet ds = (AD_TAX_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_2210_LDataSet ad_tax_2210_l(AD_TAX_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2210_LDataSet ds = (AD_TAX_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
