/***************************************************************************************************
 * 파일명   : PSSupport1301DAO.java
 * 기능     : 불편접수-이사처리
 * 작성일자 : 2005-02-15
 * 작성자   : 전현표
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 불편접수-이사처리
 */
public class PSSupport1301DAO {

    /**
     * 이사처리 내역검색
     * @param PS_L_MOVM_RDRDM
     * @return PS_L_MOVM_RDRDataSet
     */
    public PS_L_MOVM_RDRDataSet selectMoveList(PS_L_MOVM_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_MOVM_RDRDataSet ds = (PS_L_MOVM_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사처리 상세내역보기
     * @param PS_S_MOVM_RDRDM
     * @return PS_S_MOVM_RDRDataSet
     **/
    public PS_S_MOVM_RDRDataSet selectMoveDetail(PS_S_MOVM_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_MOVM_RDRDataSet ds = (PS_S_MOVM_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사처리 지사배정
     * @param PS_U_MOVM_RDRDM
     * @return PS_U_MOVM_RDRDataSet
     **/

    public PS_U_MOVM_RDRDataSet updateBranchMove(PS_U_MOVM_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_MOVM_RDRDataSet ds = (PS_U_MOVM_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}