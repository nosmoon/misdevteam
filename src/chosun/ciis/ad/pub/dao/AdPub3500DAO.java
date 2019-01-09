/***************************************************************************************************
 * 파일명 : AdPub3500DAO.java
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
public class AdPub3500DAO {

	public AD_PUB_3500_MDataSet ad_pub_3500_m(AD_PUB_3500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3500_MDataSet ds = (AD_PUB_3500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3510_LDataSet ad_pub_3510_l(AD_PUB_3510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3510_LDataSet ds = (AD_PUB_3510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3530_PDataSet ad_pub_3530_p(AD_PUB_3530_PDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3530_PDataSet ds = (AD_PUB_3530_PDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3550_LDataSet ad_pub_3550_l(AD_PUB_3550_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3550_LDataSet ds = (AD_PUB_3550_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}
