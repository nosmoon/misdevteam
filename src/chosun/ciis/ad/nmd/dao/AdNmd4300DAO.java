/***************************************************************************************************
 * 파일명 : AdNmd4300DAO.java
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
import chosun.ciis.ad.nmd.dm.AD_NMD_4300_MDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4310_LDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4320_SDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4325_SDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4330_ADM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4340_ADM;
import chosun.ciis.ad.nmd.ds.AD_NMD_4300_MDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4310_LDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4320_SDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4325_SDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4330_ADataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4340_ADataSet;

/**
 * 
 */
public class AdNmd4300DAO {
	
    public AD_NMD_4300_MDataSet ad_nmd_4300_m(AD_NMD_4300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4300_MDataSet ds = (AD_NMD_4300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_NMD_4310_LDataSet ad_nmd_4310_l(AD_NMD_4310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4310_LDataSet ds = (AD_NMD_4310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_NMD_4320_SDataSet ad_nmd_4320_s(AD_NMD_4320_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4320_SDataSet ds = (AD_NMD_4320_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_NMD_4325_SDataSet ad_nmd_4325_s(AD_NMD_4325_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4325_SDataSet ds = (AD_NMD_4325_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_NMD_4330_ADataSet ad_nmd_4330_a(AD_NMD_4330_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4330_ADataSet ds = (AD_NMD_4330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }       
    public AD_NMD_4340_ADataSet ad_nmd_4340_a(AD_NMD_4340_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4340_ADataSet ds = (AD_NMD_4340_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
}
