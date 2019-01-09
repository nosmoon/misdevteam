/***************************************************************************************************
 * 파일명 : AdTax1200DAO.java
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
import chosun.ciis.ad.tax.dm.AD_TAX_1200_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1210_SDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1215_SDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1220_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1230_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1250_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1200_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1210_SDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1215_SDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1220_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1230_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1250_LDataSet;

/**
 * 
 */
public class AdTax1200DAO {

    public AD_TAX_1200_MDataSet ad_tax_1200_m(AD_TAX_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1200_MDataSet ds = (AD_TAX_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_TAX_1210_SDataSet ad_tax_1210_s(AD_TAX_1210_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1210_SDataSet ds = (AD_TAX_1210_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1215_SDataSet ad_tax_1215_s(AD_TAX_1215_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1215_SDataSet ds = (AD_TAX_1215_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1220_ADataSet ad_tax_1220_a(AD_TAX_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1220_ADataSet ds = (AD_TAX_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1230_ADataSet ad_tax_1230_a(AD_TAX_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1230_ADataSet ds = (AD_TAX_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1250_LDataSet ad_tax_1250_l(AD_TAX_1250_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1250_LDataSet ds = (AD_TAX_1250_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
