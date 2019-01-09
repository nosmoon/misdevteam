/***************************************************************************************************
 * 파일명   : PSReader1301DAO.java
 * 기능     : 독자-중재요청 화면의 모든 이벤트를 처리
 * 작성일자 : 2004-02-24
 * 작성자   : 김건호
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
 * 독자-중재요청
 */
public class PSReader1301DAO {

    /**
     * 중재요청 초기화면
     * @param PS_S_RDR_ARBTDM
     * @return PS_S_RDR_ARBTDataSet
     */
    public PS_S_RDR_ARBTDataSet selectCodeList(PS_S_RDR_ARBTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_RDR_ARBTDataSet ds = (PS_S_RDR_ARBTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 중재요청 조회화면
     * @param PS_L_RDR_ARBTDM
     * @return PS_L_RDR_ARBTDataSet
     **/
    public PS_L_RDR_ARBTDataSet selectArbtList(PS_L_RDR_ARBTDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_RDR_ARBTDataSet ds = (PS_L_RDR_ARBTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * 중재요청 수정처리
     * @param dm PS_U_RDR_ARBTDM
     * @return boolean
     * @throws AppException
     **/
    public boolean updateArbt(PS_U_RDR_ARBTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_RDR_ARBTDataSet ds = (PS_U_RDR_ARBTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }
    /**
     * 중재요청 비교대상독자 조회화면
     * @param PS_L_ARBT_CMPROBJDM
     * @return PS_L_ARBT_CMPROBJDataSet
     **/
    public PS_L_ARBT_CMPROBJDataSet selectArbtCmprobjList(PS_L_ARBT_CMPROBJDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_ARBT_CMPROBJDataSet ds = (PS_L_ARBT_CMPROBJDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * 중재요청 비교대상독자 상세내역 조회화면
     * @param PS_S_RDR_CMPROBJDM
     * @return PS_S_RDR_CMPROBJDataSet
     **/
    public PS_S_RDR_CMPROBJDataSet selectCmprobjDetail(PS_S_RDR_CMPROBJDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_RDR_CMPROBJDataSet ds = (PS_S_RDR_CMPROBJDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


}
