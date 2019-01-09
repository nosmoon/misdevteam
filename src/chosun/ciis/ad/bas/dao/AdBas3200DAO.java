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
import chosun.ciis.ad.bas.dm.AD_BAS_3200_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3210_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3211_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3212_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3213_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3221_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3222_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3223_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3224_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3200_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3210_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3211_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3212_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3213_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3221_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3222_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3223_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3224_ADataSet;

/**
 * 
 */
public class AdBas3200DAO {
    
	public AD_BAS_3200_MDataSet ad_bas_3200_m(AD_BAS_3200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3200_MDataSet ds = (AD_BAS_3200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3211_LDataSet ad_bas_3211_l(AD_BAS_3211_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3211_LDataSet ds = (AD_BAS_3211_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3210_LDataSet ad_bas_3210_l(AD_BAS_3210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3210_LDataSet ds = (AD_BAS_3210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3212_LDataSet ad_bas_3212_l(AD_BAS_3212_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3212_LDataSet ds = (AD_BAS_3212_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3213_LDataSet ad_bas_3213_l(AD_BAS_3213_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3213_LDataSet ds = (AD_BAS_3213_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3221_ADataSet ad_bas_3221_a(AD_BAS_3221_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3221_ADataSet ds = (AD_BAS_3221_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3222_ADataSet ad_bas_3222_a(AD_BAS_3222_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3222_ADataSet ds = (AD_BAS_3222_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3223_ADataSet ad_bas_3223_a(AD_BAS_3223_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3223_ADataSet ds = (AD_BAS_3223_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3224_ADataSet ad_bas_3224_a(AD_BAS_3224_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3224_ADataSet ds = (AD_BAS_3224_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
