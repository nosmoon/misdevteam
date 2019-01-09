/***************************************************************************************************
 * 파일명 : AdDep1000DAO.java
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

package chosun.ciis.ad.dep.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.dep.dm.AD_DEP_1000_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1010_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1011_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1012_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1013_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1020_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1030_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1040_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1050_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1051_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1055_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1000_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1010_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1011_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1012_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1013_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1020_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1030_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1040_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1050_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1051_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1055_ADataSet;

/**
 * 
 */
public class AdDep1000DAO {
	
    public AD_DEP_1000_MDataSet ad_dep_1000_m(AD_DEP_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1000_MDataSet ds = (AD_DEP_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

    public AD_DEP_1010_SDataSet ad_dep_1010_s(AD_DEP_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1010_SDataSet ds = (AD_DEP_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    
    public AD_DEP_1011_LDataSet ad_dep_1011_l(AD_DEP_1011_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1011_LDataSet ds = (AD_DEP_1011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_DEP_1012_LDataSet ad_dep_1012_l(AD_DEP_1012_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1012_LDataSet ds = (AD_DEP_1012_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_DEP_1013_LDataSet ad_dep_1013_l(AD_DEP_1013_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1013_LDataSet ds = (AD_DEP_1013_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }     
    public AD_DEP_1020_ADataSet ad_dep_1020_a(AD_DEP_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1020_ADataSet ds = (AD_DEP_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }       
    public AD_DEP_1030_ADataSet ad_dep_1030_a(AD_DEP_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1030_ADataSet ds = (AD_DEP_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }       
    public AD_DEP_1040_ADataSet ad_dep_1040_a(AD_DEP_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1040_ADataSet ds = (AD_DEP_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

    public AD_DEP_1050_MDataSet ad_dep_1050_m(AD_DEP_1050_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1050_MDataSet ds = (AD_DEP_1050_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_DEP_1051_LDataSet ad_dep_1051_l(AD_DEP_1051_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1051_LDataSet ds = (AD_DEP_1051_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_DEP_1055_ADataSet ad_dep_1055_a(AD_DEP_1055_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1055_ADataSet ds = (AD_DEP_1055_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
}
