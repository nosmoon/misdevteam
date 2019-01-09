/***************************************************************************************************
 * 파일명 : AdNmd1000DAO.java
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
import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class AdNmd4100DAO {
    public AD_NMD_4100_MDataSet ad_nmd_4100_m(AD_NMD_4100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4100_MDataSet ds = (AD_NMD_4100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_NMD_4110_SDataSet ad_nmd_4110_s(AD_NMD_4110_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4110_SDataSet ds = (AD_NMD_4110_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_NMD_4111_LDataSet ad_nmd_4111_l(AD_NMD_4111_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4111_LDataSet ds = (AD_NMD_4111_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_NMD_4112_LDataSet ad_nmd_4112_l(AD_NMD_4112_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4112_LDataSet ds = (AD_NMD_4112_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4113_LDataSet ad_nmd_4113_l(AD_NMD_4113_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4113_LDataSet ds = (AD_NMD_4113_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public AD_NMD_4120_ADataSet ad_nmd_4120_a(AD_NMD_4120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4120_ADataSet ds = (AD_NMD_4120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_4130_ADataSet ad_nmd_4130_a(AD_NMD_4130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4130_ADataSet ds = (AD_NMD_4130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4140_ADataSet ad_nmd_4140_a(AD_NMD_4140_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4140_ADataSet ds = (AD_NMD_4140_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public AD_NMD_4150_MDataSet ad_nmd_4150_m(AD_NMD_4150_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4150_MDataSet ds = (AD_NMD_4150_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_NMD_4151_LDataSet ad_nmd_4151_l(AD_NMD_4151_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4151_LDataSet ds = (AD_NMD_4151_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_NMD_4155_ADataSet ad_nmd_4155_a(AD_NMD_4155_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4155_ADataSet ds = (AD_NMD_4155_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
}
