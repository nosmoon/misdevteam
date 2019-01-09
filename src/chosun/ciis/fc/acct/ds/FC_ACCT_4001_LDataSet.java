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


public class FC_ACCT_4001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_4001_LDataSet(){}
	public FC_ACCT_4001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_ACCT_4001_LCURLISTRecord rec = new FC_ACCT_4001_LCURLISTRecord();
			rec.check1 = Util.checkString(rset1.getString("check1"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.rmks = Util.checkString(rset1.getString("rmks"));
			rec.fisc_dt = Util.checkString(rset1.getString("fisc_dt"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			rec.rmks1 = Util.checkString(rset1.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset1.getString("rmks2"));
			rec.occr_amt = Util.checkString(rset1.getString("occr_amt"));
			rec.adjm_slip_no = Util.checkString(rset1.getString("adjm_slip_no"));
			rec.mang_clsf_cd = Util.checkString(rset1.getString("mang_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_4001_LDataSet ds = (FC_ACCT_4001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_4001_LCURLISTRecord curlistRec = (FC_ACCT_4001_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.slip_no%>
<%= curlistRec.rmks%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.occr_amt%>
<%= curlistRec.adjm_slip_no%>
<%= curlistRec.mang_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 17 09:54:43 KST 2009 */