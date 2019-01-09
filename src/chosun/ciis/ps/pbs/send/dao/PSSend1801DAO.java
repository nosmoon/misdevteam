/***************************************************************************************************
 * 파일명   : PSSend1801DAO.java
 * 기능     : 발송-보너스북발송 발송처리 화면의 모든 이벤트를 처리
 * 작성일자 : 2004-02-24
 * 작성자   : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.send.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-보너스북발송 발송처리
 */
public class PSSend1801DAO {

    /**
     * 보너스북발송 확인처리 초기화면
     * @param PS_S_SEND_BNSBKDM
     * @return PS_S_SEND_BNSBKDataSet
     */
    public PS_S_SEND_BNSBKDataSet selectCodeList(PS_S_SEND_BNSBKDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_BNSBKDataSet ds = (PS_S_SEND_BNSBKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보너스북발송 발송처리 조회화면
     * @param PS_L_SEND_BNSBK_CONDM
     * @return PS_L_SEND_BNSBK_CONDataSet
     **/
    public PS_L_SEND_BNSBK_CONDataSet selectBnsbkList(PS_L_SEND_BNSBK_CONDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_BNSBK_CONDataSet ds = (PS_L_SEND_BNSBK_CONDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보너스북발송 발송처리 상세내역 조회화면
     * @param dm PS_L_SEND_BNSBK_CON_DTLDM
     * @return PS_L_SEND_BNSBK_CON_DTLDataSet
     * @throws AppException
     **/
    public PS_L_SEND_BNSBK_CON_DTLDataSet selectBnsbkDetail(PS_L_SEND_BNSBK_CON_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_BNSBK_CON_DTLDataSet ds = (PS_L_SEND_BNSBK_CON_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return ds;
        }
    }

    /**
     * 보너스북발송 발송처리 엑셀
     * @param dm PS_P_SEND_BNSBK_STICKERDM
     * @return PS_P_SEND_BNSBK_STICKERDataSet
     * @throws AppException
     **/
    public PS_P_SEND_BNSBK_STICKERDataSet printBnsbkSticker(PS_P_SEND_BNSBK_STICKERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_SEND_BNSBK_STICKERDataSet ds = (PS_P_SEND_BNSBK_STICKERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return ds;
        }
    }
}
