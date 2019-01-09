/***************************************************************************************************
* ���ϸ� : SS_U_SMSDataSet.java
* ��� : ����INFO-�߼۳뼱 SMS���� DS
* �ۼ����� 	: 2004-04-01
* �ۼ��� 	: ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * ����INFO-�߼۳뼱 SMS���� DS
 */


public class SS_U_SMSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public SS_U_SMSDataSet(){}
	public SS_U_SMSDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = "";
		this.errmsg = "";
	}
}

/* �ۼ��ð� : Tue Feb 17 16:29:37 KST 2004 */