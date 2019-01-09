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
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_7010_LDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_7110_LDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_7210_LDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_7000_MDM;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_7010_LDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_7110_LDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_7210_LDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_7000_MDataSet;
/**
 * 
 */
public class MT_COMMATR_7000DAO {
	
	public MT_COMMATR_7000_MDataSet mt_commatr_7000_m(MT_COMMATR_7000_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_7000_MDataSet ds 	= (MT_COMMATR_7000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	public MT_COMMATR_7010_LDataSet mt_commatr_7010_l(MT_COMMATR_7010_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_7010_LDataSet ds 	= (MT_COMMATR_7010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMATR_7110_LDataSet mt_commatr_7110_l(MT_COMMATR_7110_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_7110_LDataSet ds 	= (MT_COMMATR_7110_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMATR_7210_LDataSet mt_commatr_7210_l(MT_COMMATR_7210_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_7210_LDataSet ds 	= (MT_COMMATR_7210_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMATR_7310_LDataSet mt_commatr_7310_l(MT_COMMATR_7310_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_7310_LDataSet ds 	= (MT_COMMATR_7310_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public MT_COMMATR_7320_ADataSet mt_commatr_7320(MT_COMMATR_7320_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_7320_ADataSet ds = (MT_COMMATR_7320_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_COMMATR_7330_ADataSet mt_commatr_7330(MT_COMMATR_7330_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_7330_ADataSet ds = (MT_COMMATR_7330_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_COMMATR_7410_LDataSet mt_commatr_7410_l(MT_COMMATR_7410_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_7410_LDataSet ds 	= (MT_COMMATR_7410_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


	public MT_COMMATR_7510_LDataSet mt_commatr_7510_l(MT_COMMATR_7510_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_7510_LDataSet ds 	= (MT_COMMATR_7510_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public MT_COMMATR_7520_ADataSet mt_commatr_7520(MT_COMMATR_7520_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_7520_ADataSet ds = (MT_COMMATR_7520_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	

}
