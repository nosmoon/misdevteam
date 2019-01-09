/***************************************************************************************************
 * ���ϸ� : AdPub2400DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_2400_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2410_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2420_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2430_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_2440_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2450_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_2460_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2400_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2410_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2420_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2430_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2440_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2450_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2460_LDataSet;

/**
 * 
 */
public class AdPub2400DAO {

	//�ʱ�ȭ��
	public AD_PUB_2400_MDataSet ad_pub_2400_m(AD_PUB_2400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2400_MDataSet ds = (AD_PUB_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
	//��������ȸ(��������ȸ)
	public AD_PUB_2410_LDataSet ad_pub_2410_l(AD_PUB_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2410_LDataSet ds = (AD_PUB_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	
	//��������ȸ(�Ϲݱ�����ȸ)
	public AD_PUB_2420_LDataSet ad_pub_2420_l(AD_PUB_2420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2420_LDataSet ds = (AD_PUB_2420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	//�������� ���/����/����
	public AD_PUB_2430_ADataSet ad_pub_2430_a(AD_PUB_2430_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2430_ADataSet ds = (AD_PUB_2430_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	//��������ȸ(��籤����ȸ)
	public AD_PUB_2440_LDataSet ad_pub_2440_l(AD_PUB_2440_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2440_LDataSet ds = (AD_PUB_2440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	//��籤�� ���/����/����
	public AD_PUB_2450_ADataSet ad_pub_2450_a(AD_PUB_2450_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2450_ADataSet ds = (AD_PUB_2450_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	//��������ȸ(Ÿ�μ�����������ȸ)
	public AD_PUB_2460_LDataSet ad_pub_2460_l(AD_PUB_2460_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2460_LDataSet ds = (AD_PUB_2460_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}
