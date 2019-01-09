/***************************************************************************************************
 * ���ϸ� : AdBas2700DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_2700_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2710_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2720_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2730_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_2740_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2700_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2710_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2720_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2730_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2740_ADataSet;

/**
 * �������-�����ڷ����
 */
 
public class AdBas2700DAO {
	
    /**
     * ��Ʈ���� �ʱ�
     * @param  AD_BAS_2700_MDM
     * @return AD_BAS_2700_MDataSet
     */
    public AD_BAS_2700_MDataSet ad_bas_2700_m(AD_BAS_2700_MDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BAS_2700_MDataSet ds = (AD_BAS_2700_MDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    

    /**
     * ��Ʈ���� ��ȸ
     * @param  AD_BAS_2710_LDM
     * @return AD_BAS_2710_LDataSet
     */
    public AD_BAS_2710_LDataSet ad_bas_2710_l(AD_BAS_2710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2710_LDataSet ds = (AD_BAS_2710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   

    /**
     * �������� ��ȸ
     * @param  AD_BAS_2720_LDM
     * @return AD_BAS_2720_LDataSet
     */
	public AD_BAS_2720_LDataSet ad_bas_2720_l(AD_BAS_2720_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
        AD_BAS_2720_LDataSet ds = (AD_BAS_2720_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ��Ʈ���� �Է�, ����, ����
     * @param  AD_BAS_2730_ADM
     * @return AD_BAS_2730_ADataSet
     */
	public AD_BAS_2730_ADataSet ad_bas_2730_a(AD_BAS_2730_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_2730_ADataSet ds = (AD_BAS_2730_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������� �Է�, ����, ����
     * @param  AD_BAS_2740_ADM
     * @return AD_BAS_2740_ADataSet
     */
	public AD_BAS_2740_ADataSet ad_bas_2740_a(AD_BAS_2740_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_2740_ADataSet ds = (AD_BAS_2740_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
