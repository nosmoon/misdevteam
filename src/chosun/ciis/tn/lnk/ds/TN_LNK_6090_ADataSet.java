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


public class TN_LNK_6090_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sdsi_seq;
	public String server_ip;
	public String server_port;
	public String tg_begin;
	public String header_result;
	public String header_msg;
	public String data_result;
	public String data_msg;
	public String tail_result;
	public String tail_msg;

	public TN_LNK_6090_ADataSet(){}
	public TN_LNK_6090_ADataSet(String errcode, String errmsg, String sdsi_seq, String server_ip, String server_port, String tg_begin, String header_result, String header_msg, String data_result, String data_msg, String tail_result, String tail_msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sdsi_seq = sdsi_seq;
		this.server_ip = server_ip;
		this.server_port = server_port;
		this.tg_begin = tg_begin;
		this.header_result = header_result;
		this.header_msg = header_msg;
		this.data_result = data_result;
		this.data_msg = data_msg;
		this.tail_result = tail_result;
		this.tail_msg = tail_msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSdsi_seq(String sdsi_seq){
		this.sdsi_seq = sdsi_seq;
	}

	public void setServer_ip(String server_ip){
		this.server_ip = server_ip;
	}

	public void setServer_port(String server_port){
		this.server_port = server_port;
	}

	public void setTg_begin(String tg_begin){
		this.tg_begin = tg_begin;
	}

	public void setHeader_result(String header_result){
		this.header_result = header_result;
	}

	public void setHeader_msg(String header_msg){
		this.header_msg = header_msg;
	}

	public void setData_result(String data_result){
		this.data_result = data_result;
	}

	public void setData_msg(String data_msg){
		this.data_msg = data_msg;
	}

	public void setTail_result(String tail_result){
		this.tail_result = tail_result;
	}

	public void setTail_msg(String tail_msg){
		this.tail_msg = tail_msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSdsi_seq(){
		return this.sdsi_seq;
	}

	public String getServer_ip(){
		return this.server_ip;
	}

	public String getServer_port(){
		return this.server_port;
	}

	public String getTg_begin(){
		return this.tg_begin;
	}

	public String getHeader_result(){
		return this.header_result;
	}

	public String getHeader_msg(){
		return this.header_msg;
	}

	public String getData_result(){
		return this.data_result;
	}

	public String getData_msg(){
		return this.data_msg;
	}

	public String getTail_result(){
		return this.tail_result;
	}

	public String getTail_msg(){
		return this.tail_msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.sdsi_seq = Util.checkString(cstmt.getString(7));
		this.server_ip = Util.checkString(cstmt.getString(8));
		this.server_port = Util.checkString(cstmt.getString(9));
		this.tg_begin = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			TN_LNK_6090_ACURLISTRecord rec = new TN_LNK_6090_ACURLISTRecord();
			rec.file_data = Util.checkString(rset0.getString("file_data"));
			this.curlist.add(rec);
		}
		this.header_result = Util.checkString(cstmt.getString(12));
		this.header_msg = Util.checkString(cstmt.getString(13));
		this.data_result = Util.checkString(cstmt.getString(14));
		this.data_msg = Util.checkString(cstmt.getString(15));
		this.tail_result = Util.checkString(cstmt.getString(16));
		this.tail_msg = Util.checkString(cstmt.getString(17));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6090_ADataSet ds = (TN_LNK_6090_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_6090_ACURLISTRecord curlistRec = (TN_LNK_6090_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSdsi_seq()%>
<%= ds.getServer_ip()%>
<%= ds.getServer_port()%>
<%= ds.getTg_begin()%>
<%= ds.getCurlist()%>
<%= ds.getHeader_result()%>
<%= ds.getHeader_msg()%>
<%= ds.getData_result()%>
<%= ds.getData_msg()%>
<%= ds.getTail_result()%>
<%= ds.getTail_msg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.file_data%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 29 11:28:44 KST 2016 */