/***************************************************************************************************
* ���ϸ� : SE_SND_11800DAO.java
* ��� : �Ǹ� - �߼۰��� - �뼱��ȸ_����Ͽ�
* �ۼ����� : 2017-01-06
* �ۼ��� :   �弱��
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
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

    public SE_MO_SND_1811_LDataSet mo_se_snd_1811_l(SE_MO_SND_1811_LDM dm) throws AppException {  //����Ͽ�
        DBManager manager = new DBManager("Oracle");
        SE_MO_SND_1811_LDataSet ds = (SE_MO_SND_1811_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }



}
