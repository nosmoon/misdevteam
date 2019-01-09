/***************************************************************************************************
 * 파일명 : AdPub3600DAO.java
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
public class AdPub3600DAO {

	public AD_PUB_3600_MDataSet ad_pub_3600_m(AD_PUB_3600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3600_MDataSet ds = (AD_PUB_3600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3610_LDataSet ad_pub_3610_l(AD_PUB_3610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3610_LDataSet ds = (AD_PUB_3610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_3620_ADataSet ad_pub_3620_a(AD_PUB_3620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3620_ADataSet ds = (AD_PUB_3620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
