/***************************************************************************************************
 * 파일명 : PL_COM_1600DAO.java
 * 기능 : 공통관리-은행코드검색팝업
 * 작성일자 : 2009.04.22
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */
public class PL_COM_1600DAO {
	
    /**
     * 조회
     * @param PL_COM_1610_LDM
     * @return PL_COM_1610_LDataSet
     */
	public PL_COM_1610_LDataSet pl_com_1610_l(PL_COM_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1610_LDataSet ds = (PL_COM_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    /**
     * 1건조회
     * @param PL_COM_1620_SDM
     * @return PL_COM_1620_SDataSet
     */
	public PL_COM_1620_SDataSet pl_com_1620_s(PL_COM_1620_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1620_SDataSet ds = (PL_COM_1620_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
