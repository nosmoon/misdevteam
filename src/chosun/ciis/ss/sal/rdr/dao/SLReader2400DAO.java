/**************************************************************************************************
* 파일명    : SLReader2400DAO.java
* 기능      : 독자-VacationStop관리를 위한 DAO
* 작성일자  : 2004-01-20
* 작성자    : 김영윤
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/

package chosun.ciis.ss.sal.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.dao.*;
import chosun.ciis.ss.sal.rdr.ds.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;

/**
 * 독자-VacationStop관리를 위한 DAO
 */
public class SLReader2400DAO {
    /**
     * VacationStop관리-초기화면
     * @param dm SL_L_VS_INITDM
     * @return SL_L_VS_INITDataSet
     * @throws AppException
     */
    public SL_L_VS_INITDataSet initVS(SL_L_VS_INITDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_VS_INITDataSet ds = (SL_L_VS_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop관리-목록조회
     * @param dm SL_L_VSDM
     * @return SL_L_VSDataSet
     * @throws AppException
     */
    public SL_L_VSDataSet selectVSList(SL_L_VSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_VSDataSet ds = (SL_L_VSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop관리-상세보기
     * @param dm SL_S_VSDM
     * @return SL_S_VSDataSet
     * @throws AppException
     */
    public SL_S_VSDataSet selectVSDetail(SL_S_VSDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_VSDataSet ds = (SL_S_VSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop관리-휴가지배달지역 목록조회
     * @param dm SL_L_VS_AREANMDM
     * @return SL_L_VS_AREANMDataSet
     * @throws AppException
     */
    public SL_L_VS_AREANMDataSet selectVSAreaRegn(SL_L_VS_AREANMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_VS_AREANMDataSet ds = (SL_L_VS_AREANMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop관리-휴가지배달지역 지국명,지국전화번호 상세
     * @param dm SL_S_VS_AREABODM
     * @return SL_S_VS_AREABODataSet
     * @throws AppException
     */
    public SL_S_VS_AREABODataSet selectVSBODetail(SL_S_VS_AREABODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_S_VS_AREABODataSet ds = (SL_S_VS_AREABODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * VacationStop관리-입력,수정,삭제
     * @param dm SL_A_VSDM
     * @return SL_A_VSDataSet
     * @throws AppException
     */
    public SL_A_VSDataSet accessVS(SL_A_VSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_A_VSDataSet ds = (SL_A_VSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
