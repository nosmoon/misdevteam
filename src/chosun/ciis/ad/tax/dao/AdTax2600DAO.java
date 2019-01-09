/***************************************************************************************************
 * 파일명 : AdTax2600DAO.java
 * 기능 : 
 * 작성일자 : 2010.05.26
 * 작성자 : KBS
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

import chosun.ciis.ad.tax.dm.AD_TAX_2600_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2601_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2610_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_2611_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_2600_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2601_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2610_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2611_ADataSet;

/**
 * 
 */
public class AdTax2600DAO
{	
    public AD_TAX_2600_MDataSet ad_tax_2600_m(AD_TAX_2600_MDM dm) throws AppException 
    {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2600_MDataSet ds = (AD_TAX_2600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        return ds; 
    }    
    public AD_TAX_2601_MDataSet ad_tax_2601_m(AD_TAX_2601_MDM dm) throws AppException 
    {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2601_MDataSet ds = (AD_TAX_2601_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        return ds; 
    }
    public AD_TAX_2610_ADataSet ad_tax_2610_a(AD_TAX_2610_ADM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2610_ADataSet ds = (AD_TAX_2610_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        return ds; 
    }   
    public AD_TAX_2611_ADataSet ad_tax_2611_a(AD_TAX_2611_ADM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_TAX_2611_ADataSet ds = (AD_TAX_2611_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        return ds; 
    }
}
