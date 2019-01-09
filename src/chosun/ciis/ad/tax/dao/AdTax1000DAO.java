/***************************************************************************************************
 * 파일명 : AdTax1000DAO.java
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
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;
import chosun.ciis.ad.tax.dm.AD_TAX_1000_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1010_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1020_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1021_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1022_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1023_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1030_SDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1040_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1041_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1050_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1060_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1070_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1071_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1011_SDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1000_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1010_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1020_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1021_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1022_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1023_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1030_SDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1040_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1041_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1050_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1060_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1070_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1071_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1011_SDataSet;

/**
 * 
 */
public class AdTax1000DAO {

    public AD_TAX_1000_MDataSet ad_tax_1000_m(AD_TAX_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1000_MDataSet ds = (AD_TAX_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1010_LDataSet ad_tax_1010_l(AD_TAX_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1010_LDataSet ds = (AD_TAX_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1011_SDataSet ad_tax_1011_s(AD_TAX_1011_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1011_SDataSet ds = (AD_TAX_1011_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_CO_9004_SDataSet ad_tax_1012_s(AD_CO_9004_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9004_SDataSet ds = (AD_CO_9004_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1020_ADataSet ad_tax_1020_a(AD_TAX_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1020_ADataSet ds = (AD_TAX_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1021_ADataSet ad_tax_1021_a(AD_TAX_1021_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1021_ADataSet ds = (AD_TAX_1021_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1022_ADataSet ad_tax_1022_a(AD_TAX_1022_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1022_ADataSet ds = (AD_TAX_1022_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1023_ADataSet ad_tax_1023_a(AD_TAX_1023_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1023_ADataSet ds = (AD_TAX_1023_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_TAX_1030_SDataSet ad_tax_1030_s(AD_TAX_1030_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1030_SDataSet ds = (AD_TAX_1030_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_TAX_1040_ADataSet ad_tax_1040_a(AD_TAX_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1040_ADataSet ds = (AD_TAX_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1041_ADataSet ad_tax_1041_a(AD_TAX_1041_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1041_ADataSet ds = (AD_TAX_1041_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_TAX_1050_LDataSet ad_tax_1050_l(AD_TAX_1050_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1050_LDataSet ds = (AD_TAX_1050_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_TAX_1060_LDataSet ad_tax_1060_l(AD_TAX_1060_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1060_LDataSet ds = (AD_TAX_1060_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_TAX_1070_ADataSet ad_tax_1070_a(AD_TAX_1070_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1070_ADataSet ds = (AD_TAX_1070_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_TAX_1071_ADataSet ad_tax_1071_a(AD_TAX_1071_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_1071_ADataSet ds = (AD_TAX_1071_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
}
