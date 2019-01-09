/***************************************************************************************************
 * 파일명 : PL_LST_3000DAO.java
 * 기능 : 출력관리-마감내역
 * 작성일자 : 2009.06.09
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
public class PL_LST_3000DAO {
	
    /**
     * 초기
     * @param PL_LST_3000_MDM
     * @return PL_LST_3000_MDataSet
     */
    public PL_LST_3000_MDataSet pl_lst_3000_m(PL_LST_3000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_LST_3000_MDataSet ds = (PL_LST_3000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
