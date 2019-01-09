/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_2033_ADataSet ds = (TN_LNK_2033_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_2033_ACURLISTRecord curlistRec = (TN_LNK_2033_ACURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.file_data%>
<%= curlistRec.proofdata%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 25 16:58:35 KST 2016 */