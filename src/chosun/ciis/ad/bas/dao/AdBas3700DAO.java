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
import chosun.ciis.ad.bas.dm.AD_BAS_3700_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3701_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3710_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3711_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3712_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3720_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3721_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3750_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3751_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3752_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3760_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3761_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_3700_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3701_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3710_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3711_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3712_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3720_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3721_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3750_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3751_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3752_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3760_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3761_LDataSet;
/**
 * 
 */
public class AdBas3700DAO {
	public AD_BAS_3700_MDataSet ad_bas_3700_m(AD_BAS_3700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3700_MDataSet ds = (AD_BAS_3700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3701_MDataSet ad_bas_3701_m(AD_BAS_3701_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3701_MDataSet ds = (AD_BAS_3701_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	public AD_BAS_3710_LDataSet ad_bas_3710_l(AD_BAS_3710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3710_LDataSet ds = (AD_BAS_3710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        System.out.print("DAO");
        return ds;
    }

	public AD_BAS_3711_LDataSet ad_bas_3711_l(AD_BAS_3711_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3711_LDataSet ds = (AD_BAS_3711_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        System.out.print("DAO");
        return ds;
    }
	
	public AD_BAS_3712_LDataSet ad_bas_3712_l(AD_BAS_3712_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3712_LDataSet ds = (AD_BAS_3712_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        System.out.print("DAO");
        return ds;
    }
	
	public AD_BAS_3720_LDataSet ad_bas_3720_l(AD_BAS_3720_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3720_LDataSet ds = (AD_BAS_3720_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        System.out.print("3720DAO");
        return ds;
    }
	
	public AD_BAS_3721_SDataSet ad_bas_3721_s(AD_BAS_3721_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3721_SDataSet ds = (AD_BAS_3721_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_BAS_3750_ADataSet ad_bas_3750_a(AD_BAS_3750_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3750_ADataSet ds = (AD_BAS_3750_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_BAS_3751_ADataSet ad_bas_3751_a(AD_BAS_3751_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3751_ADataSet ds = (AD_BAS_3751_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_BAS_3752_ADataSet ad_bas_3752_a(AD_BAS_3752_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3752_ADataSet ds = (AD_BAS_3752_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3760_ADataSet ad_bas_3760_a(AD_BAS_3760_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3760_ADataSet ds = (AD_BAS_3760_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	
	public AD_BAS_3761_LDataSet ad_bas_3761_l(AD_BAS_3761_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3761_LDataSet ds = (AD_BAS_3761_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}

