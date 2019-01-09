/***************************************************************************************************
 * 파일명 : AdTax1300DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1300_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1310_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1320_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1330_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1340_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1300_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1310_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1320_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1330_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1340_ADataSet;

/**
 * 
 */
public class AdTax1300DAO {
	
	public AD_TAX_1300_MDataSet ad_tax_1300_m(AD_TAX_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1300_MDataSet ds = (AD_TAX_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_TAX_1310_LDataSet ad_tax_1310_l(AD_TAX_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1310_LDataSet ds = (AD_TAX_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1320_LDataSet ad_tax_1320_l(AD_TAX_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1320_LDataSet ds = (AD_TAX_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1330_LDataSet ad_tax_1330_l(AD_TAX_1330_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1330_LDataSet ds = (AD_TAX_1330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1340_ADataSet ad_tax_1340_a(AD_TAX_1340_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1340_ADataSet ds = (AD_TAX_1340_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
