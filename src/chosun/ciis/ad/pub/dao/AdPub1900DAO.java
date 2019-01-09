/***************************************************************************************************
 * ���ϸ� : AdPub1900DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1900_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1910_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1900_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1910_LDataSet;
/**
 * 
 */
public class AdPub1900DAO {
	
	public AD_PUB_1900_MDataSet ad_pub_1900_m(AD_PUB_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1900_MDataSet ds = (AD_PUB_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1910_LDataSet ad_pub_1910_l(AD_PUB_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1910_LDataSet ds = (AD_PUB_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
