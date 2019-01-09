/***************************************************************************************************
 * 파일명 : SSBrmgr1800DAO.java
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
public class SSBrmgr1800DAO {

    /**
     * 지국경영-아파트투입률-초기화면(아파트)
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet initApt(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
      * 지국경영-아파트투입률-아파트목록(조사지인쇄 1853)
      * @param dm SL_L_APTLISTDM
      * @return SL_L_APTLISTDataSet
      * @throws AppException
      */
     public SL_L_APTLISTDataSet selectAptAddrList(SL_L_APTLISTDM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         SL_L_APTLISTDataSet ds = (SL_L_APTLISTDataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }


    /**
     * 지국경영-아파트투입률-목록(아파트)
     * @param dm SS_L_APTDM
     * @return SS_L_APTDataSet
     * @throws AppException
     */
    public SS_L_APTDataSet selectAptList(SS_L_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDataSet ds = (SS_L_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 아파트투입현황(리스트)
     * @param dm SS_L_COMM_APT_THRWDM
     * @return SS_L_COMM_APT_THRWDataSet
     * @throws AppException
     */
    public SS_L_COMM_APT_THRWDataSet selectThrwList(SS_L_COMM_APT_THRWDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * 아파트투입현황(현황 상세보기)
     * @param dm SL_S_COMM_APT_THRWDM
     * @return SL_S_COMM_APT_THRWDataSet
     * @throws AppException
     */
    public SL_S_COMM_APT_THRWDataSet selectThrwDetail(SL_S_COMM_APT_THRWDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_COMM_APT_THRWDataSet ds = (SL_S_COMM_APT_THRWDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }


    /**
     * 아파트투입현황(아파트 구조)
     * @param dm SL_S_COMM_APT_STRUCTDM
     * @return SL_S_COMM_APT_STRUCTDataSet
     * @throws AppException
     */
    public SL_S_COMM_APT_STRUCTDataSet selectAptinfo(SL_S_COMM_APT_STRUCTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_COMM_APT_STRUCTDataSet ds = (SL_S_COMM_APT_STRUCTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * 아파트투입현황(아파트 구조)바로가기
     * @param dm SL_S_COMM_APT_QSEARCHDM
     * @return SL_S_COMM_APT_QSEARCHDataSet
     * @throws AppException
     */
    public SL_S_COMM_APT_QSEARCHDataSet selectAptQuickSearch(SL_S_COMM_APT_QSEARCHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_COMM_APT_QSEARCHDataSet ds = (SL_S_COMM_APT_QSEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * 아파트투입현황(동 리스트)
     * @param dm SL_L_COMM_APT_DONGNODM
     * @return SL_L_COMM_APT_DONGNODataSet
     * @throws AppException
     */
    public SL_L_COMM_APT_DONGNODataSet selectDongList(SL_L_COMM_APT_DONGNODM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_COMM_APT_DONGNODataSet ds = (SL_L_COMM_APT_DONGNODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * 아파트투입현황(동 리스트)
     * @param dm SS_L_ADDR_TO_APTDM
     * @return SS_L_ADDR_TO_APTDataSet
     * @throws AppException
     */
    public SS_L_ADDR_TO_APTDataSet selectAddrToAptList(SS_L_ADDR_TO_APTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_ADDR_TO_APTDataSet ds = (SS_L_ADDR_TO_APTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }



    /**
     * 아파트투입현황(직원검색)
     * @param SL_L_BOEMPDM
     * @return SL_L_BOEMPDataSet
     * @throws AppException
     */
    public SL_L_BOEMPDataSet selectBoempList(SL_L_BOEMPDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BOEMPDataSet ds = (SL_L_BOEMPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }



    /**
     * 아파트투입현황(매체약어 리스트)
     * @param dm SL_L_COMM_MEDIYNMDM
     * @return SL_L_COMM_MEDIYNMDataSet
     * @throws AppException
     **/
    public SL_L_COMM_MEDIYNMDataSet selectMediyList(SL_L_COMM_MEDIYNMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_COMM_MEDIYNMDataSet ds = (SL_L_COMM_MEDIYNMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * 아파트투입현황(현황 등록,수정)
     * @param dm SL_A_COMM_APT_THRWDM
     * @return SL_A_COMM_APT_THRWDataSet
     * @throws AppException
     */
    public SL_A_COMM_APT_THRWDataSet accessThrw(SL_A_COMM_APT_THRWDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_COMM_APT_THRWDataSet ds = (SL_A_COMM_APT_THRWDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }


    /**
     * 아파트투입현황-활동사항(조회,수정,삭제)
     * @param dm SS_A_ACTMEMODM
     * @return SS_A_ACTMEMODataSet
     * @throws AppException
     */
    public SS_A_ACTMEMODataSet accessActMemo(SS_A_ACTMEMODM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_A_ACTMEMODataSet ds = (SS_A_ACTMEMODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * 아파트투입현황(결과보기)
     * @param dm SS_L_COMM_APT_RESULTDM
     * @return SS_L_COMM_APT_RESULTDataSet
     * @throws AppException
     */
    public SS_L_COMM_APT_RESULTDataSet selectResult(SS_L_COMM_APT_RESULTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_COMM_APT_RESULTDataSet ds = (SS_L_COMM_APT_RESULTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

    /**
     * 아파트투입현황(투입률계산)
     * @param dm SL_L_COMM_THRW_RATEDM
     * @return SL_L_COMM_THRW_RATEDataSet
     * @throws AppException
     */
    public SL_L_COMM_THRW_RATEDataSet calcThrwRate(SL_L_COMM_THRW_RATEDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_COMM_THRW_RATEDataSet ds = (SL_L_COMM_THRW_RATEDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

}
