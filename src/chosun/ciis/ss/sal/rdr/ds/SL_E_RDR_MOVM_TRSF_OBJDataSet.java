/***************************************************************************************************
* ���ϸ� : SL_E_RDR_MOVM_TRSF_OBJDataSet.java
* ��� : ���ұ�����������-�ΰ�-����� �߰��� ���� ������ ���ڼ��� ���Ѵ�.
* �ۼ����� : 2004-02-06
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * ���ұ�����������-�ΰ�-����� �߰��� ���� ������ ���ڼ��� ���Ѵ�.
 *
 */


public class SL_E_RDR_MOVM_TRSF_OBJDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long rdrcnt;

	public SL_E_RDR_MOVM_TRSF_OBJDataSet(){}
	public SL_E_RDR_MOVM_TRSF_OBJDataSet(String errcode, String errmsg, long rdrcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdrcnt = rdrcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdrcnt(long rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getRdrcnt(){
		return this.rdrcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdrcnt = cstmt.getLong(7);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SL_E_RDR_MOVM_TRSF_OBJDataSet ds = (SL_E_RDR_MOVM_TRSF_OBJDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdrcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 06 10:55:17 KST 2004 */