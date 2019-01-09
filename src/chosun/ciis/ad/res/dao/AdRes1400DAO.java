/***************************************************************************************************
 * 파일명 : AdRes1400DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.res.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.res.dm.AD_RES_1400_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1410_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1420_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1430_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1440_UDM;
import chosun.ciis.ad.res.ds.AD_RES_1400_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1410_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1420_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1430_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1440_UDataSet;
/**
 * 
 */
public class AdRes1400DAO {
	
    public AD_RES_1400_MDataSet ad_res_1400_m(AD_RES_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1400_MDataSet ds = (AD_RES_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1410_LDataSet ad_res_1410_l(AD_RES_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1410_LDataSet ds = (AD_RES_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1420_LDataSet ad_res_1420_l(AD_RES_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1420_LDataSet ds = (AD_RES_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1430_UDataSet ad_res_1430_u(AD_RES_1430_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1430_UDataSet ds = (AD_RES_1430_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1440_UDataSet ad_res_1440_u(AD_RES_1440_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1440_UDataSet ds = (AD_RES_1440_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
}
