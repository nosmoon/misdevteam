/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_2033_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String filenm;
	public String filepath;
   	public transient Blob blob;
	
	public TN_LNK_2033_ADataSet(){}
	public TN_LNK_2033_ADataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	
	public void setFilenm(String filenm){
		this.filenm = filenm;
	}
	
	public void setFilepath(String filepath){
		this.filepath = filepath;
	}	

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public String getFilenm(){
		return this.filenm;
	}
	
	public String getFilepath(){
		return this.filepath;
	}	

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		this.filenm = Util.checkString(cstmt.getString(7));
		this.filepath = Util.checkString(cstmt.getString(8));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			TN_LNK_2033_ACURLISTRecord rec = new TN_LNK_2033_ACURLISTRecord();
			rec.file_data = Util.checkString(rset0.getString("file_data"));
			if(rset0.getBlob("proofdata") != null) {
				this.blob = rset0.getBlob("proofdata");
				rec.proofdata = blob.getBytes(1, (int)blob.length());
			} else {
				rec.proofdata = null;
			}

			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_2033_ADataSet ds = (TN_LNK_2033_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_2033_ACURLISTRecord curlistRec = (TN_LNK_2033_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.file_data%>
<%= curlistRec.proofdata%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 25 16:58:35 KST 2016 */