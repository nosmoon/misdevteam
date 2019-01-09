/***************************************************************************************************
 * 파일명 : AdTax1400DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1400_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1410_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1420_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1430_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1440_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1400_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1410_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1420_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1430_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1440_ADataSet;

/**
 * 
 */
public class AdTax1400DAO {
	
	public AD_TAX_1400_MDataSet ad_tax_1400_m(AD_TAX_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1400_MDataSet ds = (AD_TAX_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_TAX_1410_LDataSet ad_tax_1410_l(AD_TAX_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1410_LDataSet ds = (AD_TAX_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1420_LDataSet ad_tax_1420_l(AD_TAX_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1420_LDataSet ds = (AD_TAX_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1430_LDataSet ad_tax_1430_l(AD_TAX_1430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1430_LDataSet ds = (AD_TAX_1430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1440_ADataSet ad_tax_1440_a(AD_TAX_1440_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1440_ADataSet ds = (AD_TAX_1440_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
