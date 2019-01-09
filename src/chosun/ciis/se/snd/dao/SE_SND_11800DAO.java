/***************************************************************************************************
* 파일명 : SE_SND_11800DAO.java
* 기능 : 판매 - 발송관리 - 노선조회_모바일용
* 작성일자 : 2017-01-06
* 작성자 :   장선희
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_MO_SND_1811_LDM;
import chosun.ciis.se.snd.ds.SE_MO_SND_1811_LDataSet;
import chosun.ciis.ss.sls.rdr.dm.SS_MO_L_RDR_SRCHDM;
import chosun.ciis.ss.sls.rdr.ds.SS_MO_L_RDR_SRCHDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;



/**
 *
 */
public class SE_SND_11800DAO {

    public SE_MO_SND_1811_LDataSet mo_se_snd_1811_l(SE_MO_SND_1811_LDM dm) throws AppException {  //모바일용
        DBManager manager = new DBManager("Oracle");
        SE_MO_SND_1811_LDataSet ds = (SE_MO_SND_1811_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }



}
