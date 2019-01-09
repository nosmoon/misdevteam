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
public class MT_COMMATR_8000DAO {
	
//	public MT_COMMATR_7000_MDataSet mt_commatr_7000_m(MT_COMMATR_7000_MDM dm) throws AppException {
//
//        DBManager manager 			= new DBManager("MISMAT");
//        MT_COMMATR_7000_MDataSet ds 	= (MT_COMMATR_7000_MDataSet) manager.executeCall(dm);
//        
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }	
	public MT_COMMATR_8101_LDataSet mt_commatr_8101_l(MT_COMMATR_8101_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_8101_LDataSet ds 	= (MT_COMMATR_8101_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public MT_COMMATR_8102_LDataSet mt_commatr_8102_l(MT_COMMATR_8102_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_8102_LDataSet ds 	= (MT_COMMATR_8102_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public MT_COMMATR_8103_LDataSet mt_commatr_8103_l(MT_COMMATR_8103_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_8103_LDataSet ds 	= (MT_COMMATR_8103_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public MT_COMMATR_8104_LDataSet mt_commatr_8104_l(MT_COMMATR_8104_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_8104_LDataSet ds 	= (MT_COMMATR_8104_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
