/***************************************************************************************************
 * 파일명   : PSReader1901DAO.java
 * 기  능   : 독자-수금입력목록
 * 작성일자 : 2008-07-14
 * 작성자   : 김재일
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
 *  독자-수금입력목록
 */
public class PSReader1901DAO {
    public PSReader1901DAO() {
    }

    /**
     *  독자-수금입력목록
     * @param PS_L_PBLMCLAMTDM
     * @return PS_L_PBLMCLAMTDataSet
     */
    public PS_L_PBLMCLAMTDataSet selectClamtList(PS_L_PBLMCLAMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_PBLMCLAMTDataSet ds = (PS_L_PBLMCLAMTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
