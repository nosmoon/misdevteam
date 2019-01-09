/***************************************************************************************************
* ���ϸ� : SE_RCP_2900DAO.java
* ��� : �Ǹ� - �Աݰ��� - �����Աݰ��� - ����Ʈ���
* �ۼ����� : 2009-05-22
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import chosun.ciis.se.rcp.dm.SE_RCP_2900_MDM;
import chosun.ciis.se.rcp.ds.SE_RCP_2900_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_2900DAO {
	
    public SE_RCP_2900_MDataSet se_rcp_2900_m(SE_RCP_2900_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_2900_MDataSet ds = (SE_RCP_2900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
