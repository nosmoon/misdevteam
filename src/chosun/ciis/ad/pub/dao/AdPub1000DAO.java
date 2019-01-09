/***************************************************************************************************
 * 파일명 : AdPub1000DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1000_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1010_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1020_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1025_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1030_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1035_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1050_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1000_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1010_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1020_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1025_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1030_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1035_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1050_ADataSet;
 
/**
 * 
 */
public class AdPub1000DAO {
	
    public AD_PUB_1000_MDataSet ad_pub_1000_m(AD_PUB_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1000_MDataSet ds = (AD_PUB_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg); 
        }
        return ds;
    }    
    public AD_PUB_1010_SDataSet ad_pub_1010_s(AD_PUB_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1010_SDataSet ds = (AD_PUB_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println(ds.errcode + ", " + ds.errmsg);        	
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_PUB_1020_LDataSet ad_pub_1020_l(AD_PUB_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1020_LDataSet ds = (AD_PUB_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_PUB_1025_SDataSet ad_pub_1025_s(AD_PUB_1025_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1025_SDataSet ds = (AD_PUB_1025_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_PUB_1030_LDataSet ad_pub_1030_l(AD_PUB_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1030_LDataSet ds = (AD_PUB_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    public AD_PUB_1035_SDataSet ad_pub_1035_s(AD_PUB_1035_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1035_SDataSet ds = (AD_PUB_1035_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_PUB_1050_ADataSet ad_pub_1050_a(AD_PUB_1050_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1050_ADataSet ds = (AD_PUB_1050_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

}
