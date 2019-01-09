/***************************************************************************************************
 * 파일명 : CoJob3000DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.co.job.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.co.job.dm.CO_JOB_3000_MDM;
import chosun.ciis.co.job.dm.CO_JOB_3010_LDM;
import chosun.ciis.co.job.dm.CO_JOB_3020_ADM;
import chosun.ciis.co.job.dm.CO_JOB_3030_SDM;
import chosun.ciis.co.job.dm.CO_JOB_3040_UDM;
import chosun.ciis.co.job.ds.CO_JOB_3000_MDataSet;
import chosun.ciis.co.job.ds.CO_JOB_3010_LDataSet;
import chosun.ciis.co.job.ds.CO_JOB_3020_ADataSet;
import chosun.ciis.co.job.ds.CO_JOB_3030_SDataSet;
import chosun.ciis.co.job.ds.CO_JOB_3040_UDataSet;

/**
 * 
 */
public class CoJob3000DAO {

    public CO_JOB_3010_LDataSet co_job_3010_l(CO_JOB_3010_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_JOB_3010_LDataSet ds = (CO_JOB_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public CO_JOB_3020_ADataSet co_job_3020_a(CO_JOB_3020_ADM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_JOB_3020_ADataSet ds = (CO_JOB_3020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public CO_JOB_3030_SDataSet co_job_3030_s(CO_JOB_3030_SDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_JOB_3030_SDataSet ds = (CO_JOB_3030_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }  
    public CO_JOB_3000_MDataSet co_job_3000_m(CO_JOB_3000_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_JOB_3000_MDataSet ds = (CO_JOB_3000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public CO_JOB_3040_UDataSet co_job_3040_u(CO_JOB_3040_UDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_JOB_3040_UDataSet ds = (CO_JOB_3040_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
}
