/***************************************************************************************************
* 파일명 : MT_COMMATR_76000DAO.java
* 기능 :  자재-장표-장표환경설정
 * 작성일자 : 2012.06.20
 * 작성자 :   김성미
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.mt.commatr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

//import chosun.ciis.mt.commatr.dm.MT_COMMATR_4003_ADM;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;
/**
 * 
 */
public class MT_COMMATR_9000DAO {
	

	public MT_COMMATR_9101_LDataSet mt_commatr_9101_l(MT_COMMATR_9101_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_9101_LDataSet ds 	= (MT_COMMATR_9101_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMATR_9102_ADataSet mt_commatr_9102_a(MT_COMMATR_9102_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_9102_ADataSet ds 	= (MT_COMMATR_9102_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
