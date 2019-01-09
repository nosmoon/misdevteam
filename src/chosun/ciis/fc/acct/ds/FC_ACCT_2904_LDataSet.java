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


public class FC_ACCT_2904_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2904_LDataSet(){}
	public FC_ACCT_2904_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2904_LCURLISTRecord rec = new FC_ACCT_2904_LCURLISTRecord();
			rec.aprv_slip_occr_dt = Util.checkString(rset0.getString("aprv_slip_occr_dt"));
			rec.aprv_slip_clsf = Util.checkString(rset0.getString("aprv_slip_clsf"));
			rec.aprv_slip_occr_seqo = Util.checkString(rset0.getString("aprv_slip_occr_seqo"));
			rec.aprv_slip_occr_sub_seq = Util.checkString(rset0.getString("aprv_slip_occr_sub_seq"));
			rec.aprv_slip_no = Util.checkString(rset0.getString("aprv_slip_no"));
			rec.aprv_slip_no1 = Util.checkString(rset0.getString("aprv_slip_no1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2904_LDataSet ds = (FC_ACCT_2904_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2904_LCURLISTRecord curlistRec = (FC_ACCT_2904_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.aprv_slip_no%>
<%= curlistRec.aprv_slip_no1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 06 16:01:18 KST 2009 */