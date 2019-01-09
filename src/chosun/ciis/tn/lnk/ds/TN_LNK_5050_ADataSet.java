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


public class TN_LNK_5050_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long data_cnt;
	public long data_amt;
	public String server_ip;
	public String server_port;
	public String tg_begin;
	public String tg_end;

	public TN_LNK_5050_ADataSet(){}
	public TN_LNK_5050_ADataSet(String errcode, String errmsg, long data_cnt, long data_amt, String server_ip, String server_port, String tg_begin, String tg_end){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.data_cnt = data_cnt;
		this.data_amt = data_amt;
		this.server_ip = server_ip;
		this.server_port = server_port;
		this.tg_begin = tg_begin;
		this.tg_end = tg_end;
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

	public void setTg_end(String tg_end){
		this.tg_end = tg_end;
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

	public String getTg_end(){
		return this.tg_end;
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
		this.tg_end = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			TN_LNK_5050_ACURLISTRecord rec = new TN_LNK_5050_ACURLISTRecord();
			rec.filedata = Util.checkString(rset0.getString("filedata"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_5050_ADataSet ds = (TN_LNK_5050_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_5050_ACURLISTRecord curlistRec = (TN_LNK_5050_ACURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getData_cnt()%>
<%= ds.getData_amt()%>
<%= ds.getServer_ip()%>
<%= ds.getServer_port()%>
<%= ds.getTg_begin()%>
<%= ds.getTg_end()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.filedata%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Nov 02 14:52:34 KST 2016 */