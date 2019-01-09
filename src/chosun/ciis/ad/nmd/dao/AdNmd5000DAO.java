/***************************************************************************************************
 * 파일명 : AdNax5000DAO.java
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

package chosun.ciis.ad.nmd.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;

/**
 * 
 */
public class AdNmd5000DAO {

    public AD_NMD_5000_MDataSet ad_nmd_5000_m(AD_NMD_5000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5000_MDataSet ds = (AD_NMD_5000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_5010_LDataSet ad_nmd_5010_l(AD_NMD_5010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5010_LDataSet ds = (AD_NMD_5010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_5011_SDataSet ad_nmd_5011_s(AD_NMD_5011_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5011_SDataSet ds = (AD_NMD_5011_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_CO_9004_SDataSet ad_nmd_5012_s(AD_CO_9004_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_CO_9004_SDataSet ds = (AD_CO_9004_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
   
    public AD_NMD_5021_ADataSet ad_nmd_5021_a(AD_NMD_5021_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5021_ADataSet ds = (AD_NMD_5021_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_NMD_5022_ADataSet ad_nmd_5022_a(AD_NMD_5022_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5022_ADataSet ds = (AD_NMD_5022_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
   
    public AD_NMD_5030_SDataSet ad_nmd_5030_s(AD_NMD_5030_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5030_SDataSet ds = (AD_NMD_5030_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_NMD_5040_ADataSet ad_nmd_5040_a(AD_NMD_5040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5040_ADataSet ds = (AD_NMD_5040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_NMD_5041_ADataSet ad_nmd_5041_a(AD_NMD_5041_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5041_ADataSet ds = (AD_NMD_5041_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_NMD_5050_LDataSet ad_nmd_5050_l(AD_NMD_5050_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5050_LDataSet ds = (AD_NMD_5050_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
     
}
