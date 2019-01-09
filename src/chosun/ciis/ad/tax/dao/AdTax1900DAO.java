/***************************************************************************************************
 * 파일명 : AdTax1900DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1900_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1910_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1920_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1900_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1910_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1920_LDataSet;

/**
 * 
 */
public class AdTax1900DAO {

	public AD_TAX_1900_MDataSet ad_tax_1900_m(AD_TAX_1900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_TAX_1900_MDataSet ds = (AD_TAX_1900_MDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}    

	public AD_TAX_1910_LDataSet ad_tax_1910_l(AD_TAX_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1910_LDataSet ds = (AD_TAX_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

	public AD_TAX_1920_LDataSet ad_tax_1920_l(AD_TAX_1920_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1920_LDataSet ds = (AD_TAX_1920_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
