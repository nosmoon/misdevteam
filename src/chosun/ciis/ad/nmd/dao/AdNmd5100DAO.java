/***************************************************************************************************
 * 파일명 : AdNax50100DAO.java
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
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;

/**
 * 
 */
public class AdNmd5100DAO {

    public AD_NMD_5100_MDataSet ad_nmd_5100_m(AD_NMD_5100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5100_MDataSet ds = (AD_NMD_5100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_5110_LDataSet ad_nmd_5110_l(AD_NMD_5110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5110_LDataSet ds = (AD_NMD_5110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_5120_ADataSet ad_nmd_5120_a(AD_NMD_5120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5120_ADataSet ds = (AD_NMD_5120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_NMD_5121_ADataSet ad_nmd_5121_a(AD_NMD_5121_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5121_ADataSet ds = (AD_NMD_5121_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_NMD_5122_ADataSet ad_nmd_5122_a(AD_NMD_5122_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5122_ADataSet ds = (AD_NMD_5122_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
   
    public AD_NMD_5130_SDataSet ad_nmd_5130_s(AD_NMD_5130_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5130_SDataSet ds = (AD_NMD_5130_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
 
     
}
