/***************************************************************************************************
* 파일명   : SP_AD_BAS_1555_A.java
* 기능     : 기초자료관리-일일보고 첨부파일 다운로드
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;
/**
 * 업무연락-업무지시 첨부파일 다운로드
 *
 */


public class AD_BAS_1555_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String add_file_nm;	
	public byte[] add_file;
   	public transient Blob blob;

	public AD_BAS_1555_ADataSet(){}
	public AD_BAS_1555_ADataSet(String errcode, String errmsg, String add_file_nm, byte[] add_file){
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
		if(!"".equals(this.errcode)){			return;		}
		this.add_file_nm = Util.checkString(cstmt.getString(8));
       	this.blob = cstmt.getBlob(9);
        	
       	this.add_file = blob.getBytes(1, (int)blob.length());
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1555_ADataSet ds = (AD_BAS_1555_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAdd_file_nm()%>
<%= ds.getAdd_file()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 30 19:32:49 KST 2003 */