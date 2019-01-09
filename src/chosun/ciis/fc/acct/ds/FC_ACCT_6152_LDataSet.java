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


public class FC_ACCT_6152_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6152_LDataSet(){}
	public FC_ACCT_6152_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6152_LCURLIST1Record rec = new FC_ACCT_6152_LCURLIST1Record();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.obj_acct_cd = Util.checkString(rset0.getString("obj_acct_cd"));
			rec.from_fisc_dt = Util.checkString(rset0.getString("from_fisc_dt"));
			rec.to_fisc_dt = Util.checkString(rset0.getString("to_fisc_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			FC_ACCT_6152_LCURLIST2Record rec = new FC_ACCT_6152_LCURLIST2Record();
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.suply_amt = Util.checkString(rset1.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset1.getString("vat_amt"));
			rec.prof_type_cd = Util.checkString(rset1.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.acct_cd = Util.checkString(rset1.getString("acct_cd"));
			rec.from_fisc_dt = Util.checkString(rset1.getString("from_fisc_dt"));
			rec.to_fisc_dt = Util.checkString(rset1.getString("to_fisc_dt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_6152_LDataSet ds = (FC_ACCT_6152_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_6152_LCURLIST1Record curlist1Rec = (FC_ACCT_6152_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_6152_LCURLIST2Record curlist2Rec = (FC_ACCT_6152_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.crdt_amt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.obj_acct_cd%>
<%= curlist1Rec.from_fisc_dt%>
<%= curlist1Rec.to_fisc_dt%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.suply_amt%>
<%= curlist2Rec.vat_amt%>
<%= curlist2Rec.prof_type_cd%>
<%= curlist2Rec.slip_clsf_cd%>
<%= curlist2Rec.acct_cd%>
<%= curlist2Rec.from_fisc_dt%>
<%= curlist2Rec.to_fisc_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 15 15:49:28 KST 2009 */