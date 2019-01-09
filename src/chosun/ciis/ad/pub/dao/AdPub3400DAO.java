/***************************************************************************************************
 * 파일명 : AdPub33400DAO.java
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

package chosun.ciis.ad.pub.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;
/**
 * 
 */
public class AdPub3400DAO {

	public AD_PUB_3400_MDataSet ad_pub_3400_m(AD_PUB_3400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3400_MDataSet ds = (AD_PUB_3400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3410_LDataSet ad_pub_3410_l(AD_PUB_3410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3410_LDataSet ds = (AD_PUB_3410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_3420_ADataSet ad_pub_3420_a(AD_PUB_3420_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3420_ADataSet ds = (AD_PUB_3420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_3430_ADataSet ad_pub_3430_a(AD_PUB_3430_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3430_ADataSet ds = (AD_PUB_3430_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
