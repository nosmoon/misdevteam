/***************************************************************************************************
 * 파일명   : CoBank1000DAO.java
 * 기능     : 공통-통장입급내역 화면의 모든 이벤트를 처리
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/

package chosun.ciis.co.bank.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.co.bank.dm.CO_BANK_1000_MDM;
import chosun.ciis.co.bank.dm.CO_BANK_1010_LDM;
import chosun.ciis.co.bank.ds.CO_BANK_1000_MDataSet;
import chosun.ciis.co.bank.ds.CO_BANK_1010_LDataSet;


/**
 * 공통-통장입급내역
 */
 
public class CoBank1000DAO {
	
    /**
     * 공통-통장입급내역 목록조회
     * @param dm CO_JOB_1010_LDM
     * @return CO_JOB_1010_LDataSet
     * @throws AppException
     */
    public CO_BANK_1000_MDataSet co_bank_1000_m(CO_BANK_1000_MDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_BANK_1000_MDataSet ds = (CO_BANK_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }	
    /**
     * 공통-통장입급내역 목록조회
     * @param dm CO_BANK_1010_LDM
     * @return CO_BANK_1010_LDataSet
     * @throws AppException
     */
    public CO_BANK_1010_LDataSet co_bank_1010_l(CO_BANK_1010_LDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_BANK_1010_LDataSet ds = (CO_BANK_1010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

}
