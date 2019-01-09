/***************************************************************************************************
 * 파일명 : AdMg1000DAO.java
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

package chosun.ciis.ad.mg.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.mg.dm.AD_MG_1010_LDM;
import chosun.ciis.ad.mg.dm.AD_MG_1020_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1030_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1040_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1050_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1060_ADM;
import chosun.ciis.ad.mg.ds.AD_MG_1010_LDataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1020_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1030_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1040_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1050_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1060_ADataSet;

/**
 * 
 */
public class AdMg1000DAO {

    public AD_MG_1010_LDataSet ad_mg_1010_l(AD_MG_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_MG_1010_LDataSet ds = (AD_MG_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_MG_1020_ADataSet ad_mg_1020_a(AD_MG_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_MG_1020_ADataSet ds = (AD_MG_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_MG_1030_ADataSet ad_mg_1030_a(AD_MG_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_MG_1030_ADataSet ds = (AD_MG_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_MG_1040_ADataSet ad_mg_1040_a(AD_MG_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_MG_1040_ADataSet ds = (AD_MG_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_MG_1050_ADataSet ad_mg_1050_a(AD_MG_1050_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_MG_1050_ADataSet ds = (AD_MG_1050_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_MG_1060_ADataSet ad_mg_1060_a(AD_MG_1060_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_MG_1060_ADataSet ds = (AD_MG_1060_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
