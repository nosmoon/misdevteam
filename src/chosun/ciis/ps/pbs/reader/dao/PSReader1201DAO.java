/***************************************************************************************************
 * 파일명   : PSReader1201DAO.java
 * 기능     : 독자-확장독자내역
 * 작성일자 : 2004-02-25
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-확장독자내역
 */
public class PSReader1201DAO {
    public PSReader1201DAO() {
    }

    /**
     * 확장독자내역-초기 및 검색
     * @param PS_L_RDR_EXTN_SEARCHDM
     * @return PS_L_RDR_EXTN_SEARCHDataSet
     */
    public PS_L_RDR_EXTN_SEARCHDataSet selectRdr_Extn_search(PS_L_RDR_EXTN_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_RDR_EXTN_SEARCHDataSet ds = (PS_L_RDR_EXTN_SEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
