/***************************************************************************************************
* ���ϸ� : SS_MO_L_INFOEXG_SRCHBUSEOLISTRecord.java
* ��� : CIIS-�Ǹ�-���Ͱ���-��������-��������-����Ʈ_����Ͽ�
* �ۼ����� : 2017-01-24
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 *
 */


public class SS_MO_L_INFOEXG_SRCHBUSEOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_MO_L_INFOEXG_SRCHBUSEOLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBoksnm(){
		return this.boksnm;
	}
}

/* �ۼ��ð� : Tue Jan 24 17:40:46 KST 2017 */