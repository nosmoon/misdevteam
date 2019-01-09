/***************************************************************************************************
 * ���ϸ� : AdPub3500DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : ��ȣ��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
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
