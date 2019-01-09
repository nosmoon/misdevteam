/***************************************************************************************************
 * 파일명 : PilotDAO.java
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

package chosun.ciis.hd.dtbas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.dtbas.dm.*;
import chosun.ciis.hd.dtbas.ds.*;

/**
 * 
 */
public class HD_DTBAS_1000DAO {
	
	public HD_DTBAS_1101_LDataSet getHd_dtbas_1101(HD_DTBAS_1101_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_DTBAS_1101_LDataSet ds = (HD_DTBAS_1101_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	System.out.println("DAO..error.");
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_DTBAS_1102_LDataSet getHd_dtbas_1102(HD_DTBAS_1102_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_DTBAS_1102_LDataSet ds = (HD_DTBAS_1102_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	System.out.println("DAO..error.");
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
}
