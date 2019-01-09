/***************************************************************************************************
 * ���ϸ� : AdPub2500DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_2600_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2610_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2600_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2610_LDataSet;
/**
 * 
 */
public class AdPub2600DAO {
	
	public AD_PUB_2600_MDataSet ad_pub_2600_m(AD_PUB_2600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2600_MDataSet ds = (AD_PUB_2600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_2610_LDataSet ad_pub_2610_l(AD_PUB_2610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2610_LDataSet ds = (AD_PUB_2610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}
