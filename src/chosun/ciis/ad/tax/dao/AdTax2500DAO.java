/***************************************************************************************************
 * 파일명 : AdTax2500DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_2500_MDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2500_MDataSet;

/**
 * 
 */
public class AdTax2500DAO {

    public AD_TAX_2500_MDataSet ad_tax_2500_m(AD_TAX_2500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2500_MDataSet ds = (AD_TAX_2500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
