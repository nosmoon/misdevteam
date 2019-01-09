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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2907_IDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2907_IDataSet(){}
	public FC_ACCT_2907_IDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(18);
		while(rset1.next()){
			FC_ACCT_2907_ICURLISTRecord rec = new FC_ACCT_2907_ICURLISTRecord();
			rec.aprv_slip_occr_dt = Util.checkString(rset1.getString("aprv_slip_occr_dt"));
			rec.aprv_slip_clsf = Util.checkString(rset1.getString("aprv_slip_clsf"));
			rec.aprv_slip_occr_seqo = Util.checkString(rset1.getString("aprv_slip_occr_seqo"));
			rec.aprv_slip_occr_sub_seq = Util.checkString(rset1.getString("aprv_slip_occr_sub_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2907_IDataSet ds = (FC_ACCT_2907_IDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2907_ICURLISTRecord curlistRec = (FC_ACCT_2907_ICURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aprv_slip_occr_dt%>
<%= curlistRec.aprv_slip_clsf%>
<%= curlistRec.aprv_slip_occr_seqo%>
<%= curlistRec.aprv_slip_occr_sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Oct 19 13:40:41 KST 2009 */