/***************************************************************************************************
 * 파일명   : PSReader1701DAO.java
 * 기능     : 독자-독자입력리스트
 * 작성일자 : 2004-11-29
 * 작성자   : 전현표
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
 *  독자-독자입력리스트
 */
public class PSReader1701DAO {
    public PSReader1701DAO() {
    }

    /**
     *  독자-독자입력리스트
     * @param PS_L_TODAYINPUT_RDRDM
     * @return PS_L_TODAYINPUT_RDRDataSet
     */
    public PS_L_TODAYINPUT_RDRDataSet selectTodayInputList(PS_L_TODAYINPUT_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_TODAYINPUT_RDRDataSet ds = (PS_L_TODAYINPUT_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
