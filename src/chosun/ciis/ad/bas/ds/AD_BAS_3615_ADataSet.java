/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */

public class AD_BAS_3615_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String cust_seq;

	
	public AD_BAS_3615_ADataSet(){}
	public AD_BAS_3615_ADataSet(String errcode, String errmsg, String cust_seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cust_seq = cust_seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}
	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	public void setCust_seq(String cust_seq) {
		this.cust_seq = cust_seq;
	}
	
	public String getErrcode(){
		return this.errcode;
	}
	public String getErrmsg(){
		return this.errmsg;
	}
	public String getCust_seq() {
		return cust_seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		this.cust_seq = Util.checkString(cstmt.getString(66));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_2130_ADataSet ds = (AD_BAS_2130_ADataSet)request.getAttribute("ds");
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


/* �ۼ��ð� : Tue Jan 20 17:59:50 KST 2009 */