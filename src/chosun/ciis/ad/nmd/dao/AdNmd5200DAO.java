/***************************************************************************************************
 * 파일명 : AdNmd_5200DAO.java
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
import chosun.ciis.ad.nmd.dm.AD_NMD_5200_MDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_5210_LDM;
import chosun.ciis.ad.nmd.ds.AD_NMD_5200_MDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_5210_LDataSet;

/**
 * 
 */
public class AdNmd5200DAO {

    public AD_NMD_5200_MDataSet ad_nmd_5200_m(AD_NMD_5200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5200_MDataSet ds = (AD_NMD_5200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_NMD_5210_LDataSet ad_nmd_5210_l(AD_NMD_5210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_5210_LDataSet ds = (AD_NMD_5210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
