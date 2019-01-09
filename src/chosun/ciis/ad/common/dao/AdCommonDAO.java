/***************************************************************************************************
 * 파일명 : AdCommonDAO.java
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

package chosun.ciis.ad.common.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.common.dm.AD_CO_1000_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1001_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1100_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1101_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1200_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1300_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1400_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1410_ADM;
import chosun.ciis.ad.common.dm.AD_CO_1510_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1600_MDM;
import chosun.ciis.ad.common.dm.AD_CO_1610_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1700_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1800_MDM;
import chosun.ciis.ad.common.dm.AD_CO_1810_SDM;
import chosun.ciis.ad.common.dm.AD_CO_1820_ADM;
import chosun.ciis.ad.common.dm.AD_CO_9000_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9001_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9002_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9003_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9007_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9008_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9009_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9010_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9100_SDM;
import chosun.ciis.ad.common.ds.AD_CO_1000_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1001_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1100_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1101_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1200_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1300_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1400_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1410_ADataSet;
import chosun.ciis.ad.common.ds.AD_CO_1510_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1600_MDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1610_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1700_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1800_MDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1810_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1820_ADataSet;
import chosun.ciis.ad.common.ds.AD_CO_9000_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9001_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9002_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9003_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9007_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9008_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9009_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9010_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9100_SDataSet;

/**
 * 
 */
public class AdCommonDAO {
	
    public AD_CO_1000_LDataSet ad_co_1000_l(AD_CO_1000_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1000_LDataSet ds = (AD_CO_1000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_CO_1001_LDataSet ad_co_1001_l(AD_CO_1001_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1001_LDataSet ds = (AD_CO_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_CO_1100_LDataSet ad_co_1100_l(AD_CO_1100_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1100_LDataSet ds = (AD_CO_1100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_CO_1101_LDataSet ad_co_1101_l(AD_CO_1101_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1101_LDataSet ds = (AD_CO_1101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_CO_1200_LDataSet ad_co_1200_l(AD_CO_1200_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1200_LDataSet ds = (AD_CO_1200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   

    public AD_CO_1300_LDataSet ad_co_1300_l(AD_CO_1300_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1300_LDataSet ds = (AD_CO_1300_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }         

    public AD_CO_1400_LDataSet ad_co_1400_l(AD_CO_1400_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1400_LDataSet ds = (AD_CO_1400_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_CO_1410_ADataSet ad_co_1410_a(AD_CO_1410_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1410_ADataSet ds = (AD_CO_1410_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_CO_1510_LDataSet ad_co_1510_l(AD_CO_1510_LDM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1510_LDataSet ds = (AD_CO_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_CO_1600_MDataSet ad_co_1600_m(AD_CO_1600_MDM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1600_MDataSet ds = (AD_CO_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_CO_1610_LDataSet ad_co_1610_l(AD_CO_1610_LDM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1610_LDataSet ds = (AD_CO_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_CO_1700_LDataSet ad_co_1700_l(AD_CO_1700_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1700_LDataSet ds = (AD_CO_1700_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public AD_CO_1800_MDataSet ad_co_1800_m(AD_CO_1800_MDM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1800_MDataSet ds = (AD_CO_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_CO_1810_SDataSet ad_co_1810_s(AD_CO_1810_SDM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1810_SDataSet ds = (AD_CO_1810_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_CO_1820_ADataSet ad_co_1820_a(AD_CO_1820_ADM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_CO_1820_ADataSet ds = (AD_CO_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode))
        {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_CO_9000_SDataSet ad_co_9000_s(AD_CO_9000_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9000_SDataSet ds = (AD_CO_9000_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_CO_9001_SDataSet ad_co_9001_s(AD_CO_9001_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9001_SDataSet ds = (AD_CO_9001_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_CO_9002_SDataSet ad_co_9002_s(AD_CO_9002_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9002_SDataSet ds = (AD_CO_9002_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }        

    public AD_CO_9003_SDataSet ad_co_9003_s(AD_CO_9003_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9003_SDataSet ds = (AD_CO_9003_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }        
    public AD_CO_9007_SDataSet ad_co_9007_s(AD_CO_9007_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9007_SDataSet ds = (AD_CO_9007_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }         
    public AD_CO_9008_SDataSet ad_co_9008_s(AD_CO_9008_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9008_SDataSet ds = (AD_CO_9008_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }        
    public AD_CO_9009_SDataSet ad_co_9009_s(AD_CO_9009_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9009_SDataSet ds = (AD_CO_9009_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }          
    public AD_CO_9010_SDataSet ad_co_9010_s(AD_CO_9010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9010_SDataSet ds = (AD_CO_9010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_CO_9100_SDataSet ad_co_9100_s(AD_CO_9100_SDM dm) throws AppException
    {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9100_SDataSet ds = (AD_CO_9100_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
}
