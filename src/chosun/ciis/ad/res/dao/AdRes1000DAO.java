/***************************************************************************************************
 * 파일명 : AdRes1000DAO.java
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

package chosun.ciis.ad.res.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.res.dm.AD_RES_1000_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1010_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1020_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1025_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1030_IDM;
import chosun.ciis.ad.res.dm.AD_RES_1040_ADM;
import chosun.ciis.ad.res.dm.AD_RES_1050_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1060_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1065_UDM;
import chosun.ciis.ad.res.ds.AD_RES_1000_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1010_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1020_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1025_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1030_IDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1040_ADataSet;
import chosun.ciis.ad.res.ds.AD_RES_1050_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1060_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1065_UDataSet;

/**
 * 
 */
public class AdRes1000DAO {
	
    public AD_RES_1000_MDataSet ad_res_1000_m(AD_RES_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1000_MDataSet ds = (AD_RES_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1010_SDataSet ad_res_1010_s(AD_RES_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1010_SDataSet ds = (AD_RES_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_1020_LDataSet ad_res_1020_l(AD_RES_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1020_LDataSet ds = (AD_RES_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_1025_LDataSet ad_res_1025_l(AD_RES_1025_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1025_LDataSet ds = (AD_RES_1025_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_RES_1030_IDataSet ad_res_1030_i(AD_RES_1030_IDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1030_IDataSet ds = (AD_RES_1030_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_RES_1040_ADataSet ad_res_1040_a(AD_RES_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1040_ADataSet ds = (AD_RES_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_RES_1050_UDataSet ad_res_1050_u(AD_RES_1050_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1050_UDataSet ds = (AD_RES_1050_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_RES_1060_UDataSet ad_res_1060_u(AD_RES_1060_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1060_UDataSet ds = (AD_RES_1060_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_RES_1065_UDataSet ad_res_1065_u(AD_RES_1065_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1065_UDataSet ds = (AD_RES_1065_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
