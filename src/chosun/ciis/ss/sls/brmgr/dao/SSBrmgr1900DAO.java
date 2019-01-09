/***************************************************************************************************
 * 파일명 : SSBrmgr1900DAO.java
 * 기능 : 지국경영-아파트투입률을 위한 DAO
 * 작성일자 : 2004-11-20
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * 지국경영-아파트투입률을 위한 DAO
 */
public class SSBrmgr1900DAO {

    /**
     * 지국발송처리 코드관리 초기 Combo Box설정
     * @param dm SS_S_BO_SEND_INITDM
     * @return SS_S_BO_SEND_INITDataSet
     * @throws AppException
     */
    public SS_S_BO_SEND_INITDataSet selectCombolist(SS_S_BO_SEND_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BO_SEND_INITDataSet ds = (SS_S_BO_SEND_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국발송처리 리스트 조회
     * @param dm SS_L_SEND_PBLMEDISENDBODM
     * @return SS_L_SEND_PBLMEDISENDBODataSet
     * @throws AppException
     */
    public SS_L_SEND_PBLMEDISENDBODataSet selectList(SS_L_SEND_PBLMEDISENDBODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SEND_PBLMEDISENDBODataSet ds = (SS_L_SEND_PBLMEDISENDBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국발송처리 지국별 상세조회
     * @param dm SS_L_BOSEND_LUMPDM
     * @return SS_L_BOSEND_LUMPDataSet
     * @throws AppException
     */
    public SS_L_BOSEND_LUMPDataSet selectBoList(SS_L_BOSEND_LUMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOSEND_LUMPDataSet ds = (SS_L_BOSEND_LUMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국발송처리 출력 엑셀
     * @param dm SS_P_SEND_PBLMEDISENDBODataSet
     * @return SS_P_SEND_PBLMEDISENDBODM
     * @throws AppException
     */
    public SS_P_SEND_PBLMEDISENDBODataSet printSticker(SS_P_SEND_PBLMEDISENDBODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_SEND_PBLMEDISENDBODataSet ds = (SS_P_SEND_PBLMEDISENDBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자-지국 독자 검색
     * @param SS_L_BO_READER_SEARCHDM
     * @return SS_L_BO_READER_SEARCHDataSet
     */
    public SS_L_BO_READER_SEARCHDataSet selectBoReaderList(SS_L_BO_READER_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_READER_SEARCHDataSet ds = (SS_L_BO_READER_SEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 독자-지국 독자 상세검색
     * @param SS_S_BO_READERINFODM
     * @return SS_S_BO_READERINFODataSet
     */
    public SS_S_BO_READERINFODataSet selectBoReaderDetail(SS_S_BO_READERINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BO_READERINFODataSet ds = (SS_S_BO_READERINFODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 구독자관리--지국구독자 수정
     * @param SS_U_BO_READERINFO_ONEDM
     * @return SB_U_BO_READERINFO_ONEDataSet
     */
    public SS_U_BO_READERINFO_ONEDataSet updateBoReaderInfo(SS_U_BO_READERINFO_ONEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_BO_READERINFO_ONEDataSet ds = (SS_U_BO_READERINFO_ONEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
