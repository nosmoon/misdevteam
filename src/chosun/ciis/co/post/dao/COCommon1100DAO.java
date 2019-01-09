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

package chosun.ciis.co.post.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.co.post.ds.*;
import chosun.ciis.co.post.dm.*;

/**
 * 판매국 공통 업무를 위한 DAO
 */
public class COCommon1100DAO {
    /**
     * 우편번호(목록조회)
     * @param dm CO_L_ZIPDM
     * @return CO_L_ZIPDataSet
     * @throws AppException
     */
    public CO_L_ZIPDataSet selectZipList(CO_L_ZIPDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 우편번호(목록조회)
     * @param dm CO_L_ZIP_ALLDM
     * @return CO_L_ZIP_ALLDataSet
     * @throws AppException
     */
    public CO_L_ZIP_ALLDataSet selectZipListAll(CO_L_ZIP_ALLDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_L_ZIP_ALLDataSet ds = (CO_L_ZIP_ALLDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
