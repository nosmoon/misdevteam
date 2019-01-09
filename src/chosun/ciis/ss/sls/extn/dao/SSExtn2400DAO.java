/***************************************************************************************************
* ���ϸ� : SSExtn2400DAO.java
* ��� : Ȯ����Ȳ-��ŸȮ������۾��� ���� DAO
* �ۼ����� : 2012-02-20
* �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * Ȯ����Ȳ-��û��Ȳ �� ���� DAO
 */
public class SSExtn2400DAO {
    
    /**
     * Ȯ����Ȳ-��û��Ȳ Ȯ���û ���
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
	public SL_L_CAMPEXTN_UNIDataSet selectCampExtnUniList(SL_L_CAMPEXTN_UNIDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_CAMPEXTN_UNIDataSet ds = (SL_L_CAMPEXTN_UNIDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
