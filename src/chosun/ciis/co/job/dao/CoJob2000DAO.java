/***************************************************************************************************
 * 파일명   : CoJob2000DAO.java
 * 기능     : 업무연락-즐겨찾기 화면의 모든 이벤트를 처리
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
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
 * 업무연락-즐겨찾기
 */
 
public class CoJob2000DAO {
	
    /**
     * 업무연락-즐겨찾기 목록조회
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
     * 업무연락-즐겨찾기 목록조회
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
