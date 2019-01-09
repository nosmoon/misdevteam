/***************************************************************************************************
 * ���ϸ� : SE_COMM_1200DAO.java
 * ��� :   �뼱�����ڵ� �˾�
 * �ۼ����� : 2009.01.23
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
public class SE_COMM_1200DAO {
	
    public SE_COMM_1210_LDataSet se_comm_1210_l(SE_COMM_1210_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("111111111111111");
        SE_COMM_1210_LDataSet ds = (SE_COMM_1210_LDataSet) manager.executeCall(dm);
        System.out.println("222222222222222");
        if (!"".equals(ds.errcode)) {
        	System.out.println("errcord=" + ds.getErrcode());
        	System.out.println("errmsg="  + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_COMM_1220_SDataSet se_comm_1220_s(SE_COMM_1220_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        System.out.println("111111111111111");
        SE_COMM_1220_SDataSet ds = (SE_COMM_1220_SDataSet) manager.executeCall(dm);
        System.out.println("222222222222222");
        if (!"".equals(ds.errcode)) {
        	System.out.println("errcord=" + ds.getErrcode());
        	System.out.println("errmsg="  + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
