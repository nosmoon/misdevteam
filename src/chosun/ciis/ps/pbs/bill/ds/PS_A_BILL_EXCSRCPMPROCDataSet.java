/***************************************************************************************************
 * ���ϸ�   : PS_A_BILL_EXCSRCPMPROCDataSet.java
 * ���     : ����-�ʰ��Ա�ó�� ���/����
 * �ۼ����� : 2004-04-06
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * ����-�ʰ��Ա�ó�� ���/����
 */

public class PS_A_BILL_EXCSRCPMPROCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public PS_A_BILL_EXCSRCPMPROCDataSet(){}
	public PS_A_BILL_EXCSRCPMPROCDataSet(String errcode, String errmsg){
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
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_A_BILL_EXCSRCPMPROCDataSet ds = (PS_A_BILL_EXCSRCPMPROCDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 07 15:56:43 KST 2004 */