/***************************************************************************************************
 * 파일명 : .java
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

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_2800_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2810_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2820_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2830_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2800_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2810_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2820_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2830_LDataSet;

/**
 * 
 */
public class AdBas2800DAO {
    
	public AD_BAS_2810_LDataSet ad_bas_2810_l(AD_BAS_2810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2810_LDataSet ds = (AD_BAS_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_2820_LDataSet ad_bas_2820_l(AD_BAS_2820_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2820_LDataSet ds = (AD_BAS_2820_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_2830_LDataSet ad_bas_2830_l(AD_BAS_2830_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2830_LDataSet ds = (AD_BAS_2830_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_2800_MDataSet ad_bas_2800_m(AD_BAS_2800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2800_MDataSet ds = (AD_BAS_2800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
