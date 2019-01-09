/***************************************************************************************************
* ���ϸ� : SE_BNS_1700DAO.java
* ��� : �Ǹ�-���˹����� - ���˹������Ȳ��ȸ
* �ۼ����� : 2009-05-04
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_1700_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1710_LDM;
import chosun.ciis.se.bns.ds.SE_BNS_1700_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1710_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_1700DAO {
	
    public SE_BNS_1700_MDataSet se_bns_1700_m(SE_BNS_1700_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1700_MDataSet ds = (SE_BNS_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BNS_1710_LDataSet se_bns_1710_l(SE_BNS_1710_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1710_LDataSet ds = (SE_BNS_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
