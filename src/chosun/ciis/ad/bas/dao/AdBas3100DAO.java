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
import chosun.ciis.ad.bas.dm.AD_BAS_3110_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3120_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3130_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3140_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3150_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_3110_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3120_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3130_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3140_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3150_LDataSet;

/**
 * 
 */
public class AdBas3100DAO {
    
	public AD_BAS_3110_LDataSet ad_bas_3110_l(AD_BAS_3110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3110_LDataSet ds = (AD_BAS_3110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3120_LDataSet ad_bas_3120_l(AD_BAS_3120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3120_LDataSet ds = (AD_BAS_3120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3130_LDataSet ad_bas_3130_l(AD_BAS_3130_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3130_LDataSet ds = (AD_BAS_3130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3140_LDataSet ad_bas_3140_l(AD_BAS_3140_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3140_LDataSet ds = (AD_BAS_3140_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3150_LDataSet ad_bas_3150_l(AD_BAS_3150_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3150_LDataSet ds = (AD_BAS_3150_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
