/**************************************************************************************************
* ���ϸ� 	: SS_S_SMSDM.java
* ��� 		: ����INFO-�߼۳뼱 SMS�ҷ����� DM
* �ۼ����� 	: 2004-04-01
* �ۼ��� 	: ��â��
**************************************************************************************************/
/**************************************************************************************************
* �������� 	:
* ������ 	:
* �������� 	:
* ��� 		:
**************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * ����INFO-�߼۳뼱 SMS�ҷ����� DM
 */

public class SS_S_SMSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;

	public SS_S_SMSDM(){}
	public SS_S_SMSDM(String bocd){
		this.bocd = bocd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getBocd(){
		return this.bocd;
	}

    public String getSQL(){
         return "";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_S_SMSDM dm = (SS_S_SMSDM)bdm;
    }

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_S_SMSDataSet();
	}
}

/* �ۼ��ð� : Wed Feb 11 11:39:13 KST 2004 */