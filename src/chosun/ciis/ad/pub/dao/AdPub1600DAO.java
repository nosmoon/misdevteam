/***************************************************************************************************
 * 파일명 : AdPub1600DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1600_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1610_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1620_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1625_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1630_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1635_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1650_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1600_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1610_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1620_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1625_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1630_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1635_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1650_ADataSet;

/**
 * 
 */
public class AdPub1600DAO {
	
    public AD_PUB_1600_MDataSet ad_pub_1600_m(AD_PUB_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1600_MDataSet ds = (AD_PUB_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_PUB_1610_SDataSet ad_pub_1610_s(AD_PUB_1610_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1610_SDataSet ds = (AD_PUB_1610_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_PUB_1620_LDataSet ad_pub_1620_l(AD_PUB_1620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1620_LDataSet ds = (AD_PUB_1620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_PUB_1625_SDataSet ad_pub_1625_s(AD_PUB_1625_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1625_SDataSet ds = (AD_PUB_1625_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_PUB_1630_LDataSet ad_pub_1630_l(AD_PUB_1630_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1630_LDataSet ds = (AD_PUB_1630_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_PUB_1635_SDataSet ad_pub_1635_s(AD_PUB_1635_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1635_SDataSet ds = (AD_PUB_1635_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_PUB_1650_ADataSet ad_pub_1650_a(AD_PUB_1650_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1650_ADataSet ds = (AD_PUB_1650_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
