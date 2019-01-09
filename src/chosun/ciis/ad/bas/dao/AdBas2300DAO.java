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
import chosun.ciis.ad.bas.dm.AD_BAS_2300_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2310_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2320_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2300_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2310_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2320_ADataSet;
/**
 * 
 */
public class AdBas2300DAO {

	public AD_BAS_2300_MDataSet ad_bas_2300_m(AD_BAS_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2300_MDataSet ds = (AD_BAS_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_BAS_2310_LDataSet ad_bas_2310_l(AD_BAS_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2310_LDataSet ds = (AD_BAS_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_BAS_2320_ADataSet ad_bas_2320_a(AD_BAS_2320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2320_ADataSet ds = (AD_BAS_2320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
