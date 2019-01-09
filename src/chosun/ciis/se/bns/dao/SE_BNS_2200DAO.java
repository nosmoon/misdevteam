/***************************************************************************************************
* ���ϸ� : SE_BNS_2200DAO.java
* ��� : �Ǹ� - ���˹����� - ���˹����⸶��
* �ۼ����� : 2009-05-25
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_2210_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_2220_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_2210_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2220_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_2200DAO {
	
    public SE_BNS_2210_LDataSet se_bns_2210_l(SE_BNS_2210_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_2210_LDataSet ds = (SE_BNS_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_2220_ADataSet se_bns_2220_a(SE_BNS_2220_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_2220_ADataSet ds = (SE_BNS_2220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
