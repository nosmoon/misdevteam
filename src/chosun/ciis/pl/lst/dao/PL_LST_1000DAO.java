/***************************************************************************************************
 * 파일명 : PL_LST_1000DAO.java
 * 기능 : 출력관리-거래내역
 * 작성일자 : 2009.05.25
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.lst.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.lst.dm.*;
import chosun.ciis.pl.lst.ds.*;

/**
 * 
 */
public class PL_LST_1000DAO {
	
    /**
     * 초기
     * @param PL_LST_1000_MDM
     * @return PL_LST_1000_MDataSet
     */
    public PL_LST_1000_MDataSet pl_lst_1000_m(PL_LST_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_LST_1000_MDataSet ds = (PL_LST_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 대행사 UPLOAD용 엑셀 DOWNLOAD
     * @param PL_LST_1710_PDM
     * @return PL_LST_1710_PDataSet
     */
    public PL_LST_1710_PDataSet pl_lst_1710_p(PL_LST_1710_PDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_LST_1710_PDataSet ds = (PL_LST_1710_PDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
