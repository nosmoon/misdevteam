/***************************************************************************************************
 * 파일명 : AdPub3000DAO.java
 * 기능 : 광고매출분석
 * 작성일자 : 2010.09.10
 * 작성자 : KBS
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
public class AdPub3000DAO {
	
	public AD_PUB_3000_MDataSet ad_pub_3000_m(AD_PUB_3000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3000_MDataSet ds = (AD_PUB_3000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3010_LDataSet ad_pub_3010_l(AD_PUB_3010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3010_LDataSet ds = (AD_PUB_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3011_LDataSet ad_pub_3011_l(AD_PUB_3011_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3011_LDataSet ds = (AD_PUB_3011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3012_LDataSet ad_pub_3012_l(AD_PUB_3012_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3012_LDataSet ds = (AD_PUB_3012_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3013_LDataSet ad_pub_3013_l(AD_PUB_3013_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3013_LDataSet ds = (AD_PUB_3013_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3014_LDataSet ad_pub_3014_l(AD_PUB_3014_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3014_LDataSet ds = (AD_PUB_3014_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3015_LDataSet ad_pub_3015_l(AD_PUB_3015_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3015_LDataSet ds = (AD_PUB_3015_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3016_LDataSet ad_pub_3016_l(AD_PUB_3016_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3016_LDataSet ds = (AD_PUB_3016_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_3017_LDataSet ad_pub_3017_l(AD_PUB_3017_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3017_LDataSet ds = (AD_PUB_3017_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3018_LDataSet ad_pub_3018_l(AD_PUB_3018_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3018_LDataSet ds = (AD_PUB_3018_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	
	public AD_PUB_3020_MDataSet ad_pub_3020_m(AD_PUB_3020_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3020_MDataSet ds = (AD_PUB_3020_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_PUB_3021_ADataSet ad_pub_3021_a(AD_PUB_3021_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3021_ADataSet ds = (AD_PUB_3021_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_PUB_3026_ADataSet ad_pub_3026_a(AD_PUB_3026_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3026_ADataSet ds = (AD_PUB_3026_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_PUB_3027_ADataSet ad_pub_3027_a(AD_PUB_3027_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3027_ADataSet ds = (AD_PUB_3027_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3051_LDataSet ad_pub_3051_l(AD_PUB_3051_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3051_LDataSet ds = (AD_PUB_3051_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_3052_LDataSet ad_pub_3052_l(AD_PUB_3052_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3052_LDataSet ds = (AD_PUB_3052_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_3053_LDataSet ad_pub_3053_l(AD_PUB_3053_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3053_LDataSet ds = (AD_PUB_3053_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3100_MDataSet ad_pub_3100_m(AD_PUB_3100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3100_MDataSet ds = (AD_PUB_3100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_PUB_3110_LDataSet ad_pub_3110_l(AD_PUB_3110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISTV");
        //DBManager manager = new DBManager("MISADV");
        AD_PUB_3110_LDataSet ds = (AD_PUB_3110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_PUB_3120_LDataSet ad_pub_3120_l(AD_PUB_3120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISTV");
        //DBManager manager = new DBManager("MISADV");
        AD_PUB_3120_LDataSet ds = (AD_PUB_3120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
