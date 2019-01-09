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


public class FC_ACCT_2375_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2375_LDataSet(){}
	public FC_ACCT_2375_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_ACCT_2375_LCURLISTRecord rec = new FC_ACCT_2375_LCURLISTRecord();
			rec.check1 = Util.checkString(rset0.getString("check1"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.sum_cbamt = Util.checkString(rset0.getString("sum_cbamt"));
			rec.sum_dbamt = Util.checkString(rset0.getString("sum_dbamt"));
			rec.incmg_emp_no = Util.checkString(rset0.getString("incmg_emp_no"));
			rec.chrg_emp_no = Util.checkString(rset0.getString("chrg_emp_no"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.draft_doc_no = Util.checkString(rset0.getString("draft_doc_no"));
			rec.draft_expn_amt = Util.checkString(rset0.getString("draft_expn_amt"));
			rec.draft_impt_amt = Util.checkString(rset0.getString("draft_impt_amt"));
			rec.draft_doc_dept_cd = Util.checkString(rset0.getString("draft_doc_dept_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2375_LDataSet ds = (FC_ACCT_2375_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2375_LCURLISTRecord curlistRec = (FC_ACCT_2375_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.check1%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.rmks1%>
<%= curlistRec.sum_cbamt%>
<%= curlistRec.sum_dbamt%>
<%= curlistRec.incmg_emp_no%>
<%= curlistRec.chrg_emp_no%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.slip_no%>
<%= curlistRec.draft_doc_no%>
<%= curlistRec.draft_expn_amt%>
<%= curlistRec.draft_impt_amt%>
<%= curlistRec.draft_doc_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 17 18:04:47 KST 2009 */