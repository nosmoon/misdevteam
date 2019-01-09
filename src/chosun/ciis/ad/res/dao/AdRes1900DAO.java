/***************************************************************************************************
 * 파일명 : AdRes1900DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
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
import chosun.ciis.ad.res.dm.AD_RES_1900_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1910_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1911_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1920_IDM;
import chosun.ciis.ad.res.dm.AD_RES_1921_IDM;
import chosun.ciis.ad.res.dm.AD_RES_1930_ADM;
import chosun.ciis.ad.res.dm.AD_RES_1940_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1900_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1910_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1911_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1920_IDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1921_IDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1930_ADataSet;
import chosun.ciis.ad.res.ds.AD_RES_1940_LDataSet;
/**
 * 
 */
public class AdRes1900DAO {
	
    public AD_RES_1900_MDataSet ad_res_1900_m(AD_RES_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1900_MDataSet ds = (AD_RES_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public AD_RES_1910_LDataSet ad_res_1910_l(AD_RES_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1910_LDataSet ds = (AD_RES_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_RES_1911_LDataSet ad_res_1911_l(AD_RES_1911_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1911_LDataSet ds = (AD_RES_1911_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_RES_1920_IDataSet ad_res_1920_i(AD_RES_1920_IDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1920_IDataSet ds = (AD_RES_1920_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_RES_1921_IDataSet ad_res_1921_i(AD_RES_1921_IDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1921_IDataSet ds = (AD_RES_1921_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_RES_1930_ADataSet ad_res_1930_a(AD_RES_1930_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1930_ADataSet ds = (AD_RES_1930_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public AD_RES_1940_LDataSet ad_res_1940_l(AD_RES_1940_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1940_LDataSet ds = (AD_RES_1940_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
