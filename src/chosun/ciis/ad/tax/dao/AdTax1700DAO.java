/***************************************************************************************************
 * 파일명 : AdTax1700DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1700_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1710_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1720_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1730_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1700_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1710_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1720_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1730_LDataSet;

/**
 * 
 */
public class AdTax1700DAO {

	public AD_TAX_1700_MDataSet ad_tax_1700_m(AD_TAX_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1700_MDataSet ds = (AD_TAX_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1710_LDataSet ad_tax_1710_l(AD_TAX_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1710_LDataSet ds = (AD_TAX_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1720_ADataSet ad_tax_1720_a(AD_TAX_1720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1720_ADataSet ds = (AD_TAX_1720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1730_LDataSet ad_tax_1730_l(AD_TAX_1730_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1730_LDataSet ds = (AD_TAX_1730_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
