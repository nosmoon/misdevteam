/***************************************************************************************************
 * 파일명 : AdPub1700DAO.java
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

package chosun.ciis.ad.pub.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.pub.dm.AD_PUB_1700_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1710_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1720_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1700_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1710_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1720_ADataSet;

/**
 * 
 */
public class AdPub1700DAO {
	
	public AD_PUB_1700_MDataSet ad_pub_1700_m(AD_PUB_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1700_MDataSet ds = (AD_PUB_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1710_SDataSet ad_pub_1710_s(AD_PUB_1710_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1710_SDataSet ds = (AD_PUB_1710_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1720_ADataSet ad_pub_1720_a(AD_PUB_1720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1720_ADataSet ds = (AD_PUB_1720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
}
