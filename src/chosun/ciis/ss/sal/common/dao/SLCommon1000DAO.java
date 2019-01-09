/**************************************************************************************************
* 파일명    : SLReader1100DAO.java
* 기능      : 판매지국 공통
* 작성일자  : 2003-12-09
* 작성자    : 김영윤
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * 판매지국 공통를 위한 Data Access Object
 */
public class SLCommon1000DAO{

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
     * 독자상세조회팝업(수금형)(목록조회)
     * @param dm SL_L_RDR_DTLS_SECHDM
     * @return SL_L_RDR_DTLS_SECHDataSet
     * @throws AppException
     */
    public SL_L_RDR_DTLS_SECHDataSet selectReaderDetailList(SL_L_RDR_DTLS_SECHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_RDR_DTLS_SECHDataSet ds = (SL_L_RDR_DTLS_SECHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자검색팝업(기본형)(목록조회)
     * @param dm SL_L_READER_01DM
     * @return ds SL_L_READER_01DataSet
     * @throws AppException
     */
    public SL_L_READER_01DataSet selectReaderList(SL_L_READER_01DM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_READER_01DataSet ds = (SL_L_READER_01DataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 공통코드 목록조회
     * @param dm CO_L_TAOCC_CDVDM
     * @return CO_L_TAOCC_CDVDataSet
     * @throws AppException
     */
    public CO_L_TAOCC_CDVDataSet selectCommCdList(CO_L_TAOCC_CDVDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        CO_L_TAOCC_CDVDataSet ds = (CO_L_TAOCC_CDVDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장자검색(목록조회)
     * @param dm SL_L_EXTNPERSDM
     * @return SL_L_EXTNPERSDataSet
     * @throws AppException
     */
    public SL_L_EXTNPERSDataSet selectExtnPersList(SL_L_EXTNPERSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 공통코드 목록조회(업무구분 코드 선택에 의한 하위코드 목록조회)
     * @param dm SL_L_EXTNPERSDM
     * @return SL_L_EXTNPERSDataSet
     * @throws AppException
     */
    public SL_L_EXTNPERSDataSet selectClsfCodeList(SL_L_EXTNPERSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국검색
     * @param dm SL_L_BO_SRCHDM
     * @return SL_L_BO_SRCHDataSet
     * @throws AppException
     */
    public SL_L_BO_SRCHDataSet selectBranchOfficeList(SL_L_BO_SRCHDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BO_SRCHDataSet ds = (SL_L_BO_SRCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 판촉물 코드 목록조회
     * @param dm SL_L_BNSITEMDM
     * @return SL_L_BNSITEMDataSet
     * @throws AppException
     */
    public SL_L_BNSITEMDataSet selectBnsItemCdList(SL_L_BNSITEMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국취급매체(목록조회)
     * 검색조건으로써 iframe에서 call하는 것을 원칙으로 한다.
     * @param SL_L_BOMEDIDM
     * @return SL_L_BOMEDIDataSet
     * @throws AppException
     */
    public SL_L_BOMEDIDataSet selectBoHndlMediList(SL_L_BOMEDIDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BOMEDIDataSet ds = (SL_L_BOMEDIDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
	 * 공통-실행내역관리
	 * 검색조건으로써 iframe에서 call하는 것을 원칙으로 한다.
	 * @param CO_A_RUNLOGDM
	 * @return CO_A_RUNLOGDataSet
	 * @throws AppException
	 */
	public CO_A_RUNLOGDataSet activeRunLog(CO_A_RUNLOGDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		CO_A_RUNLOGDataSet ds = (CO_A_RUNLOGDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
    }

    /**
     * 지국 구역정보(목록조회)
     * 검색조건으로써 iframe에서 call하는 것을 원칙으로 한다.
     * @param SL_L_DSTCINFOCDDM
     * @return SL_L_DSTCINFOCDDataSet
     * @throws AppException
     */
    public SL_L_DSTCINFOCDDataSet selectDsctList(SL_L_DSTCINFOCDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_DSTCINFOCDDataSet ds = (SL_L_DSTCINFOCDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
         * 공통-통합 회원 서비스 조회
         *
         * @param dm
         *            CO_S_RDR_SERVICEDM 객체
         * @return CO_S_RDR_SERVICEDataSet 객체
         * @throws AppException
         */
        public CO_S_RDR_SERVICEDataSet selectRDR_SERVICE(CO_S_RDR_SERVICEDM dm)throws AppException {
                //System.out.println("#######begin manager#######");
            DBManager manager = new DBManager("PRI");
                //System.out.println("#######end manager#######");
            CO_S_RDR_SERVICEDataSet ds = (CO_S_RDR_SERVICEDataSet) manager.executeCall(dm);
                //System.out.println("#######data set#######");
            if (!"".equals(ds.errcode)) {
                throw new AppException(ds.errcode, ds.errmsg);
            }
            return ds;
	}
}
