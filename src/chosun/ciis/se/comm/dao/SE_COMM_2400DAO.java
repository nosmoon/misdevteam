/***************************************************************************************************
* ���ϸ� : SE_COMM_2400DAO.java
* ��� :  ���۾��� �˾�
* �ۼ����� : 2009.06.09
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
public class SE_COMM_2400DAO {
	
    public SE_COMM_2400_MDataSet se_comm_2400_m(SE_COMM_2400_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("111111111111111");
        SE_COMM_2400_MDataSet ds = (SE_COMM_2400_MDataSet) manager.executeCall(dm);
        System.out.println("222222222222222");
        if (!"".equals(ds.errcode)) {
        	System.out.println("errcord=" + ds.getErrcode());
        	System.out.println("errmsg="  + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_COMM_2410_LDataSet se_comm_2410_l(SE_COMM_2410_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("111111111111111");
        SE_COMM_2410_LDataSet ds = (SE_COMM_2410_LDataSet) manager.executeCall(dm);
        System.out.println("222222222222222");
        if (!"".equals(ds.errcode)) {
        	System.out.println("errcord=" + ds.getErrcode());
        	System.out.println("errmsg="  + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
