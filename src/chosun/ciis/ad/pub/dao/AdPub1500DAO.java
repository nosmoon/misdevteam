/***************************************************************************************************
 * 파일명 : AdPub1500DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1500_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1510_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1520_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1530_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1550_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1560_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1500_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1510_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1520_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1530_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1550_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1560_ADataSet;
/**
 * 
 */
public class AdPub1500DAO {
	
	public AD_PUB_1500_MDataSet ad_pub_1500_m(AD_PUB_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1500_MDataSet ds = (AD_PUB_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1510_LDataSet ad_pub_1510_l(AD_PUB_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1510_LDataSet ds = (AD_PUB_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1520_SDataSet ad_pub_1520_s(AD_PUB_1520_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1520_SDataSet ds = (AD_PUB_1520_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1530_LDataSet ad_pub_1530_l(AD_PUB_1530_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1530_LDataSet ds = (AD_PUB_1530_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1550_ADataSet ad_pub_1550_a(AD_PUB_1550_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1550_ADataSet ds = (AD_PUB_1550_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_PUB_1560_ADataSet ad_pub_1560_a(AD_PUB_1560_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1560_ADataSet ds = (AD_PUB_1560_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
