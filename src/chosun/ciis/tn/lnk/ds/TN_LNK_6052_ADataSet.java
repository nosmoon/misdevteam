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


public class TN_LNK_6052_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long data_cnt;
	public long data_amt;
	public String server_ip;
	public String server_port;
	public String tg_begin;

	public TN_LNK_6052_ADataSet(){}
	public TN_LNK_6052_ADataSet(String errcode, String errmsg, long data_cnt, long data_amt, String server_ip, String server_port, String tg_begin){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.data_cnt = data_cnt;
		this.data_amt = data_amt;
		this.server_ip = server_ip;
		this.server_port = server_port;
		this.tg_begin = tg_begin;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setData_cnt(long data_cnt){
		this.data_cnt = data_cnt;
	}

	public void setData_amt(long data_amt){
		this.data_amt = data_amt;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getData_cnt(){
		return this.data_cnt;
	}

	public long getData_amt(){
		return this.data_amt;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.data_cnt = cstmt.getLong(7);
		this.data_amt = cstmt.getLong(8);
		this.server_ip = Util.checkString(cstmt.getString(9));
		this.server_port = Util.checkString(cstmt.getString(10));
		this.tg_begin = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			TN_LNK_6052_ACURLISTRecord rec = new TN_LNK_6052_ACURLISTRecord();
			rec.file_data = Util.checkString(rset0.getString("file_data"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6052_ADataSet ds = (TN_LNK_6052_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_6052_ACURLISTRecord curlistRec = (TN_LNK_6052_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getData_cnt()%>
<%= ds.getData_amt()%>
<%= ds.getServer_ip()%>
<%= ds.getServer_port()%>
<%= ds.getTg_begin()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.file_data%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 29 14:52:57 KST 2016 */