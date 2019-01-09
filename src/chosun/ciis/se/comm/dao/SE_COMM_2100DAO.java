/***************************************************************************************************
* ���ϸ� : SE_COMM_2100_MDM.java
* ��� :  ���۴ܰ� �˾�
* �ۼ����� : 2009.02.18
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.comm.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */
public class SE_COMM_2100DAO {
	
    public SE_COMM_2100_MDataSet se_comm_2100_m(SE_COMM_2100_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("111111111111111");
        SE_COMM_2100_MDataSet ds = (SE_COMM_2100_MDataSet) manager.executeCall(dm);
        System.out.println("222222222222222");
        if (!"".equals(ds.errcode)) {
        	System.out.println("errcord=" + ds.getErrcode());
        	System.out.println("errmsg="  + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_COMM_2110_LDataSet se_comm_2110_l(SE_COMM_2110_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("111111111111111");
        SE_COMM_2110_LDataSet ds = (SE_COMM_2110_LDataSet) manager.executeCall(dm);
        System.out.println("222222222222222");
        if (!"".equals(ds.errcode)) {
        	System.out.println("errcord=" + ds.getErrcode());
        	System.out.println("errmsg="  + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
