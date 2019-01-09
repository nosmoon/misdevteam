/***************************************************************************************************
 * 파일명 : AdDep1500DAO.java
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
import chosun.ciis.ad.nmd.dm.AD_NMD_4400_MDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4410_LDM;
import chosun.ciis.ad.nmd.ds.AD_NMD_4400_MDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4410_LDataSet;

import chosun.ciis.ad.nmd.dm.AD_NMD_4450_MDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4451_LDM;
import chosun.ciis.ad.nmd.ds.AD_NMD_4450_MDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4451_LDataSet;

/**
 * 
 */
public class AdNmd4400DAO {
	
    public AD_NMD_4400_MDataSet ad_nmd_4400_m(AD_NMD_4400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4400_MDataSet ds = (AD_NMD_4400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_NMD_4410_LDataSet ad_nmd_4410_l(AD_NMD_4410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4410_LDataSet ds = (AD_NMD_4410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    
    public AD_NMD_4450_MDataSet ad_nmd_4450_m(AD_NMD_4450_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4450_MDataSet ds = (AD_NMD_4450_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_NMD_4451_LDataSet ad_nmd_4451_l(AD_NMD_4451_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4451_LDataSet ds = (AD_NMD_4451_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
}
