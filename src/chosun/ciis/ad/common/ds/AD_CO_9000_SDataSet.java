/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 2009-01-29
* �ۼ��� : ���±�
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.common.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_CO_9000_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String srch_cd;
	public String srch_nm;

	public AD_CO_9000_SDataSet(){}
	public AD_CO_9000_SDataSet(String errcode, String errmsg, String srch_cd, String srch_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.srch_cd = srch_cd;
		this.srch_nm = srch_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSrch_cd(String srch_cd){
		this.srch_cd = srch_cd;
	}

	public void setSrch_nm(String srch_nm){
		this.srch_nm = srch_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSrch_cd(){
		return this.srch_cd;
	}

	public String getSrch_nm(){
		return this.srch_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.srch_cd = Util.checkString(cstmt.getString(5));
		this.srch_nm = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_CO_9000_SDataSet ds = (AD_CO_9000_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSrch_cd()%>
<%= ds.getSrch_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 27 19:13:41 KST 2009 */