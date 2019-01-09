/***************************************************************************************************
 * ���ϸ�   : CoJob2000DAO.java
 * ���     : ��������-���ã�� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.co.job.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.co.job.dm.CO_JOB_2000_MDM;
import chosun.ciis.co.job.dm.CO_JOB_2010_ADM;
import chosun.ciis.co.job.ds.CO_JOB_2000_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_2010_ADataSet;


/**
 * ��������-���ã��
 */
 
public class CoJob2000DAO {
	
    /**
     * ��������-���ã�� �����ȸ
     */
    public CO_JOB_2000_MDataSet co_job_2000_m(CO_JOB_2000_MDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_2000_MDataSet ds = (CO_JOB_2000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    /**
     * ��������-���ã�� �����ȸ
     */
    public CO_JOB_2010_ADataSet co_job_2010_a(CO_JOB_2010_ADM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_JOB_2010_ADataSet ds = (CO_JOB_2010_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
}
