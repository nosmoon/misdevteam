/***************************************************************************************************
* 파일명 : SSCommon1100DAO.java
* 기능 : 부서,지역 등 공통 DAO
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 판매국 공통 업무를 위한 DAO
 */
public class SSCommon1100DAO {
    /**
     * 공통-부서코드,코드명 목록
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet selectDeptList(SS_L_NWBUSEOCDDM dm) throws AppException{
       DBManager manager = new DBManager("Oracle");
       SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * 공통-지역코드,코드명 목록
     * @param dm SS_L_JIYEOGCDDM
     * @return SS_L_JIYEOGCDDataSet
     * @throws AppException
     */
    public SS_L_JIYEOGCDDataSet selectAreaList(SS_L_JIYEOGCDDM dm) throws AppException{
       DBManager manager = new DBManager("Oracle");
       SS_L_JIYEOGCDDataSet ds = (SS_L_JIYEOGCDDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * 공통-지국검색 목록
     * @param dm SS_L_BO_SRCHDM
     * @return SS_L_BO_SRCHDataSet
     * @throws AppException
     */
    public SS_L_BO_SRCH_TEMPDataSet selectBOList(SS_L_BO_SRCH_TEMPDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_BO_SRCH_TEMPDataSet ds = (SS_L_BO_SRCH_TEMPDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * 공통-지국목록(LIST)
     * @param dm SS_L_BOLISTDM
     * @return SS_L_BOLISTDataSet
     * @throws AppException
     */
    public SS_L_BOLISTDataSet selectBoinfoList(SS_L_BOLISTDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       SS_L_BOLISTDataSet ds = (SS_L_BOLISTDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    /**
     * 우편번호(목록조회)
     * @param dm CO_L_ZIPDM
     * @return CO_L_ZIPDataSet
     * @throws AppException
     */
    public CO_L_ZIPDataSet selectZipList(CO_L_ZIPDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 매체코드검색(회사별)
     * @param dm SS_L_CMPY_MEDICDDM
     * @return SS_L_CMPY_MEDICDDataSet
     * @throws AppException
     */
    public SS_L_CMPY_MEDICDDataSet selectCmpyMedicdList(SS_L_CMPY_MEDICDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_CMPY_MEDICDDataSet ds = (SS_L_CMPY_MEDICDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지급기준코드검색(지급구분별-마일리지)
     * @param dm SS_L_MIG_CLSF_BASIDM
     * @return SS_L_MIG_CLSF_BASIDataSet
     * @throws AppException
     */
    public SS_L_MIG_CLSF_BASIDataSet selectClsfBasiList(SS_L_MIG_CLSF_BASIDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIG_CLSF_BASIDataSet ds = (SS_L_MIG_CLSF_BASIDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자상세조회팝업(수금형)(목록조회)
     * @param dm SS_L_RDR_DTLS_SECHDM
     * @return SS_L_RDR_DTLS_SECHDataSet
     * @throws AppException
     */
    public SS_L_RDR_DTLS_SECHDataSet selectReaderDetailList(SS_L_RDR_DTLS_SECHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DTLS_SECHDataSet ds = (SS_L_RDR_DTLS_SECHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자검색팝업(기본형)(목록조회)
     * @param dm SS_L_READER_01DM
     * @return ds SS_L_READER_01DataSet
     * @throws AppException
     */
    public SS_L_READER_01DataSet selectReaderList(SS_L_READER_01DM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_READER_01DataSet ds = (SS_L_READER_01DataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 공통-독자검색 목록
     * @param dm CO_L_RDR_SRCHDM
     * @return CO_L_RDR_SRCHDataSet
     * @throws AppException
     */
    public CO_L_RDR_SRCHDataSet selectRDRList(CO_L_RDR_SRCHDM dm) throws AppException {
       DBManager manager = new DBManager("Oracle");
       CO_L_RDR_SRCHDataSet ds = (CO_L_RDR_SRCHDataSet)manager.executeCall(dm);
       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
    }

    public SL_L_GUGUNDataSet selectGugunList(SL_L_GUGUNDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_GUGUNDataSet ds = (SL_L_GUGUNDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

    public CO_L_ZIP_AGENCYDataSet selectNewZipList(CO_L_ZIP_AGENCYDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_ZIP_AGENCYDataSet ds = (CO_L_ZIP_AGENCYDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

    public CO_L_NEWGUGUNDataSet selectNewGugunList(CO_L_NEWGUGUNDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_NEWGUGUNDataSet ds = (CO_L_NEWGUGUNDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

    public CO_L_NEW_ADDRDataSet selectNewAddrList(CO_L_NEW_ADDRDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_NEW_ADDRDataSet ds = (CO_L_NEW_ADDRDataSet) manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
}
