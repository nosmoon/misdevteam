

package chosun.ciis.hd.emsy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.rec.*;

/**
 * 
 */


public class HD_EMSY_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EMSY_1000_LDataSet(){}
	public HD_EMSY_1000_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_EMSY_1000_LCURLISTRecord rec = new HD_EMSY_1000_LCURLISTRecord();
			rec.sfromemail = Util.checkString(rset0.getString("sfromemail"));
			rec.smailsubject = Util.checkString(rset0.getString("smailsubject"));
			rec.smailcontent = Util.checkString(rset0.getString("smailcontent"));
			rec.saly_pay_dt = Util.checkString(rset0.getString("saly_pay_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EMSY_1000_LDataSet ds = (HD_EMSY_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EMSY_1000_LCURLISTRecord curlistRec = (HD_EMSY_1000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sfromemail%>
<%= curlistRec.smailsubject%>
<%= curlistRec.smailcontent%>
<%= curlistRec.saly_pay_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Oct 11 14:15:08 KST 2010 */