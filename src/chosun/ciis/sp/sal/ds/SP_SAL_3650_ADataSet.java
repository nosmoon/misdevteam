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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3650_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String batch_id;
	public String smart_id;
	public String smart_pw;

	public SP_SAL_3650_ADataSet(){}
	public SP_SAL_3650_ADataSet(String errcode, String errmsg, String batch_id, String smart_id, String smart_pw){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.batch_id = batch_id;
		this.smart_id = smart_id;
		this.smart_pw = smart_pw;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBatch_id(String batch_id){
		this.batch_id = batch_id;
	}

	public void setSmart_id(String smart_id){
		this.smart_id = smart_id;
	}

	public void setSmart_pw(String smart_pw){
		this.smart_pw = smart_pw;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBatch_id(){
		return this.batch_id;
	}

	public String getSmart_id(){
		return this.smart_id;
	}

	public String getSmart_pw(){
		return this.smart_pw;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.batch_id = Util.checkString(cstmt.getString(11));
		this.smart_id = Util.checkString(cstmt.getString(12));
		this.smart_pw = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SP_SAL_3650_ADataSet ds = (SP_SAL_3650_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBatch_id()%>
<%= ds.getSmart_id()%>
<%= ds.getSmart_pw()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jul 29 13:55:46 KST 2012 */