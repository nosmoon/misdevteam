/***************************************************************************************************
 * ���ϸ� : SSExtn3300DAO.java
 * ��� : �������˵��ڰ��� DAO
 * �ۼ����� : 2015.11.11
 * �ۼ��� : �弱��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;




/**
 * �������˵��ڰ��� DAO
 */
public class SSExtn3300DAO {

    /**
     * �������˵��ڰ���-������ϸ���Ʈ
     * @param  SS_L_MO_SVYDM
     * @return SS_L_MO_SVYDataSet
     * @throws AppException
     */
    public SS_L_MO_SVYDataSet selectMoSvyList(SS_L_MO_SVYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MO_SVYDataSet ds = (SS_L_MO_SVYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    
    
    /**
     * �������˵��ڰ���-������
     * @param  SS_S_MO_SVYDM
     * @return SS_S_MO_SVYDataSet
     * @throws AppException
     */
    public SS_S_MO_SVYDataSet selectMoSvyDetail(SS_S_MO_SVYDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_S_MO_SVYDataSet ds = (SS_S_MO_SVYDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }
    
    

    /**
     * �������˵��ڰ���-���� �߰�, ����, ����
     * @param  SS_A_MO_SVYDM
     * @return SS_A_MO_SVYDataSet
     * @throws AppException
     */
    public SS_A_MO_SVYDataSet MoSvyUpdate(SS_A_MO_SVYDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_A_MO_SVYDataSet ds = (SS_A_MO_SVYDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }
    
    public SS_U_MO_SVY_DELDataSet MoDelete(SS_U_MO_SVY_DELDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_U_MO_SVY_DELDataSet ds = (SS_U_MO_SVY_DELDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }
    
    
    
    
}
