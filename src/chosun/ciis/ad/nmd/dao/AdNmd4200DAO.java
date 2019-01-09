/***************************************************************************************************
 * 파일명 : AdNmd4200DAO.java
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
public class AdNmd4200DAO {

    public AD_NMD_4200_MDataSet ad_nmd_4200_m(AD_NMD_4200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4200_MDataSet ds = (AD_NMD_4200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_4210_ADataSet ad_nmd_4210_a(AD_NMD_4210_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4210_ADataSet ds = (AD_NMD_4210_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_4220_ADataSet ad_nmd_4220_a(AD_NMD_4220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4220_ADataSet ds = (AD_NMD_4220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       

     
}
