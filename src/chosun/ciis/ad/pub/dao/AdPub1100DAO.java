/***************************************************************************************************
 * 파일명 : AdPub1100DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1100_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1110_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1115_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1120_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1125_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1150_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1160_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1165_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1100_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1110_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1115_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1120_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1125_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1150_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1160_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1165_ADataSet;

/**
 * 
 */
public class AdPub1100DAO {
	
	public AD_PUB_1100_MDataSet ad_pub_1100_m(AD_PUB_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1100_MDataSet ds = (AD_PUB_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1110_LDataSet ad_pub_1110_l(AD_PUB_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1110_LDataSet ds = (AD_PUB_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
	public AD_PUB_1115_LDataSet ad_pub_1115_l(AD_PUB_1115_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1115_LDataSet ds = (AD_PUB_1115_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1120_ADataSet ad_pub_1120_a(AD_PUB_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1120_ADataSet ds = (AD_PUB_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1125_ADataSet ad_pub_1125_a(AD_PUB_1125_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1125_ADataSet ds = (AD_PUB_1125_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1150_MDataSet ad_pub_1150_m(AD_PUB_1150_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1150_MDataSet ds = (AD_PUB_1150_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1160_SDataSet ad_pub_1160_s(AD_PUB_1160_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1160_SDataSet ds = (AD_PUB_1160_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
	public AD_PUB_1165_ADataSet ad_pub_1165_a(AD_PUB_1165_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1165_ADataSet ds = (AD_PUB_1165_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     

}
