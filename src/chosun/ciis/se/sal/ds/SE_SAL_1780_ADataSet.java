/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ� - ������� - ��꼭���� - ���ڼ��ݰ�꼭 ����
* �ۼ����� : 2010-07-27
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1780_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String batch_id;
	public String smart_id;
	public String smart_pw;

	public SE_SAL_1780_ADataSet(){}
	public SE_SAL_1780_ADataSet(String errcode, String errmsg, String batch_id, String smart_id, String smart_pw){
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
		if(!"".equals(this.errcode)){			return;		}
		this.batch_id = Util.checkString(cstmt.getString(13));
		this.smart_id = Util.checkString(cstmt.getString(14));
		this.smart_pw = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SAL_1780_ADataSet ds = (SE_SAL_1780_ADataSet)request.getAttribute("ds");
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


/* �ۼ��ð� : Wed Jul 28 18:23:26 KST 2010 */