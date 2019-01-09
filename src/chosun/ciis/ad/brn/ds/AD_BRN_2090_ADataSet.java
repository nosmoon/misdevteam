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


package chosun.ciis.ad.brn.ds;

import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_BRN_2090_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String add_file_nm;
	public byte[] add_file;
   	public transient Blob blob;

	public AD_BRN_2090_ADataSet(){}
	public AD_BRN_2090_ADataSet(String errcode, String errmsg, String add_file_nm, byte[] add_file){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.add_file_nm = add_file_nm;
		this.add_file = add_file;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setAdd_file(byte[] add_file){
		this.add_file = add_file;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public byte[] getAdd_file(){
		return this.add_file;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.add_file_nm = Util.checkString(cstmt.getString(8));
//		this.add_file = Util.checkString(cstmt.getString(9));
       	this.blob = cstmt.getBlob(9);        	
       	this.add_file = blob.getBytes(1, (int)blob.length());
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BRN_2090_ADataSet ds = (AD_BRN_2090_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAdd_file_nm()%>
<%= ds.getAdd_file()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 22 21:33:27 KST 2009 */