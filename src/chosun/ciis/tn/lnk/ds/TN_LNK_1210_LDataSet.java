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


public class TN_LNK_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_1210_LDataSet(){}
	public TN_LNK_1210_LDataSet(String errcode, String errmsg){
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
			TN_LNK_1210_LCURLISTRecord rec = new TN_LNK_1210_LCURLISTRecord();
			rec.rcpt_rpt_idx = Util.checkString(rset0.getString("rcpt_rpt_idx"));
			rec.dep_nm = Util.checkString(rset0.getString("dep_nm"));
			rec.create_date = Util.checkString(rset0.getString("create_date"));
			rec.cret_stnd = Util.checkString(rset0.getString("cret_stnd"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.rpt_dt = Util.checkString(rset0.getString("rpt_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_1210_LDataSet ds = (TN_LNK_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_1210_LCURLISTRecord curlistRec = (TN_LNK_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpt_rpt_idx%>
<%= curlistRec.dep_nm%>
<%= curlistRec.create_date%>
<%= curlistRec.cret_stnd%>
<%= curlistRec.cnt%>
<%= curlistRec.payprice%>
<%= curlistRec.rpt_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 22 14:19:27 KST 2016 */