/**************************************************************************************************
* 파일명    : SLReader11000DAO.java_모바일용
* 기능      : 판매지국 독자 정보 관리
* 작성일자  :
* 작성자    :
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/

package chosun.ciis.ss.sal.rdr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ss.sal.rdr.dm.SL_E_READERINIDM;
import chosun.ciis.ss.sal.rdr.dm.SL_L_SUBS_CNTR_STOP_HISTDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_MOVM_RDRPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_NWSPSUBSCNTRPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_READERDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_VSPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_S_RDR_INFODM;
import chosun.ciis.ss.sal.rdr.ds.SL_E_READERINIDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_L_SUBS_CNTR_STOP_HISTDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_MOVM_RDRPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_NWSPSUBSCNTRPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_READERDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_VSPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_S_RDR_INFODataSet;

/**
 * 독자-독자정보관리
 */
public class SLReader11100DAO{

    /**
     * 독자정보관리(독자정보 초기화)
     * @param dm SL_E_READERINIDM
     * @return SL_E_READERINIDataSet
     * @throws AppException
     */
    public SL_E_READERINIDataSet selectCodeList(SL_E_READERINIDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_E_READERINIDataSet ds = (SL_E_READERINIDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


	/**
	 * 독자정보관리(독자목록검색)
	 *
	 * @param dm
	 *            SL_L_READERDM
	 * @return SL_L_READERDataSet
	 * @throws AppException
	 */
	public SL_MO_L_READERDataSet mo_selectReaderList(SL_MO_L_READERDM dm) //모바일용
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_MO_L_READERDataSet ds = (SL_MO_L_READERDataSet) manager
				.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		return ds;
	}

	/**
	 * 독자정보관리(독자상세보기) //모바일용_ 구역코드 커서 때문에 새로 생성함. SP_SL_S_RDR_INFO 프로시저  참조
	 *
	 * @param dm
	 *            SL_S_RDR_INFODM
	 * @return SL_S_RDR_INFODataSet
	 * @throws AppException
	 */
	public SL_MO_S_RDR_INFODataSet mo_selectReaderDetail(SL_MO_S_RDR_INFODM dm)
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_MO_S_RDR_INFODataSet ds = (SL_MO_S_RDR_INFODataSet) manager
				.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		return ds;
	}

	   /**
     * 독자정보관리(구독내역팝업-구독내역목록조회)
     * @param dm SL_MO_L_NWSPSUBSCNTRPTCRDM
     * @return SL_MO_L_NWSPSUBSCNTRPTCRDataSet
     * @throws AppException
     */
    public SL_MO_L_NWSPSUBSCNTRPTCRDataSet mo_selectSubsHistoryList(SL_MO_L_NWSPSUBSCNTRPTCRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_MO_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_MO_L_NWSPSUBSCNTRPTCRDataSet)manager.executeCall(dm);
/*        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * 독자정보관리(구독내역팝업-휴독내역목록조회)
     * @param dm SL_MO_L_VSPTCRDM
     * @return SL_MO_L_VSPTCRDataSet
     * @throws AppException
     */
    public SL_MO_L_VSPTCRDataSet mo_selectStopsHistoryList(SL_MO_L_VSPTCRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_MO_L_VSPTCRDataSet ds = (SL_MO_L_VSPTCRDataSet)manager.executeCall(dm);
/*        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * 독자정보관리(구독내역팝업-이사내역목록조회)
     * @param dm SL_MO_L_MOVM_RDRPTCRDM
     * @return SL_MO_L_MOVM_RDRPTCRDataSet
     * @throws AppException
     */
    public SL_MO_L_MOVM_RDRPTCRDataSet mo_selectMoveHistoryList(SL_MO_L_MOVM_RDRPTCRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_MO_L_MOVM_RDRPTCRDataSet ds = (SL_MO_L_MOVM_RDRPTCRDataSet)manager.executeCall(dm);
/*        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }




    /**
     * 독자정보관리(중지내역팝업-목록조회)
     * @param dm SL_L_SUBS_CNTR_STOP_HISTDM
     * @return ds SL_L_SUBS_CNTR_STOP_HISTDataSet
     * @throws AppException
     */
    public SL_L_SUBS_CNTR_STOP_HISTDataSet mo_selectStopHist(SL_L_SUBS_CNTR_STOP_HISTDM dm) throws AppException{ //모바일용
        DBManager manager = new DBManager("Oracle");
        SL_L_SUBS_CNTR_STOP_HISTDataSet ds = (SL_L_SUBS_CNTR_STOP_HISTDataSet)manager.executeCall(dm);
/*        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }


}
