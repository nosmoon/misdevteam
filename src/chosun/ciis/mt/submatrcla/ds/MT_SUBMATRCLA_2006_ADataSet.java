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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_2006_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String decid_key;
	public String ip_address;

	public MT_SUBMATRCLA_2006_ADataSet(){}
	public MT_SUBMATRCLA_2006_ADataSet(String errcode, String errmsg, String decid_key, String ip_address){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.decid_key = decid_key;
		this.ip_address = ip_address;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDecid_key(String decid_key){
		this.decid_key = decid_key;
	}

	public void setIp_address(String ip_address){
		this.ip_address = ip_address;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDecid_key(){
		return this.decid_key;
	}

	public String getIp_address(){
		return this.ip_address;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.decid_key = Util.checkString(cstmt.getString(3));
		this.ip_address = Util.checkString(cstmt.getString(4));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATRCLA_2006_ADataSet ds = (MT_SUBMATRCLA_2006_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDecid_key()%>
<%= ds.getIp_address()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 10 17:39:52 KST 2009 */