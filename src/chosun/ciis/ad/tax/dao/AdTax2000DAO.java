/***************************************************************************************************
 * 파일명 : AdTax2000DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_2000_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2010_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2000_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2010_LDataSet;

/**
 * 
 */
public class AdTax2000DAO {

	public AD_TAX_2000_MDataSet ad_tax_2000_m(AD_TAX_2000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2000_MDataSet ds = (AD_TAX_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_TAX_2010_LDataSet ad_tax_2010_l(AD_TAX_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2010_LDataSet ds = (AD_TAX_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
	
}
