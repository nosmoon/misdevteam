/***************************************************************************************************
 * 파일명 : AdDep1100DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_1100_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1101_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1110_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1111_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1120_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1121_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1130_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1100_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1101_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1110_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1111_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1120_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1121_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1130_ADataSet;

/**
 * 
 */
public class AdDep1100DAO {
	
    public AD_DEP_1100_MDataSet ad_dep_1100_m(AD_DEP_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1100_MDataSet ds = (AD_DEP_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }  
    public AD_DEP_1101_MDataSet ad_dep_1101_m(AD_DEP_1101_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1101_MDataSet ds = (AD_DEP_1101_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    public AD_DEP_1110_ADataSet ad_dep_1110_a(AD_DEP_1110_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1110_ADataSet ds = (AD_DEP_1110_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1111_ADataSet ad_dep_1111_a(AD_DEP_1111_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1111_ADataSet ds = (AD_DEP_1111_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }          
    public AD_DEP_1120_ADataSet ad_dep_1120_a(AD_DEP_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1120_ADataSet ds = (AD_DEP_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    public AD_DEP_1121_ADataSet ad_dep_1121_a(AD_DEP_1121_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1121_ADataSet ds = (AD_DEP_1121_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    public AD_DEP_1130_ADataSet ad_dep_1130_a(AD_DEP_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1130_ADataSet ds = (AD_DEP_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

}
