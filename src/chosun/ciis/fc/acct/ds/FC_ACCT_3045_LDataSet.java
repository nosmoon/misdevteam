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


public class FC_ACCT_3045_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3045_LDataSet(){}
	public FC_ACCT_3045_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_3045_LCURLISTRecord rec = new FC_ACCT_3045_LCURLISTRecord();
			rec.x = Util.checkString(rset0.getString("x"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.dds = Util.checkString(rset0.getString("dds"));
			rec.pymt_dt = Util.checkString(rset0.getString("pymt_dt"));
			rec.prvmm_bal = Util.checkString(rset0.getString("prvmm_bal"));
			rec.thmm_dr = Util.checkString(rset0.getString("thmm_dr"));
			rec.thmm_crdt = Util.checkString(rset0.getString("thmm_crdt"));
			rec.thmm_bal = Util.checkString(rset0.getString("thmm_bal"));
			rec.prelae_pay_clsf_cd1 = Util.checkString(rset0.getString("prelae_pay_clsf_cd1"));
			rec.mang_clsf_cd1 = Util.checkString(rset0.getString("mang_clsf_cd1"));
			rec.pch_count = Util.checkString(rset0.getString("pch_count"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_3045_LDataSet ds = (FC_ACCT_3045_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_3045_LCURLISTRecord curlistRec = (FC_ACCT_3045_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.x%>
<%= curlistRec.prelae_pay_clsf_cd%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.won_amt%>
<%= curlistRec.dds%>
<%= curlistRec.pymt_dt%>
<%= curlistRec.prvmm_bal%>
<%= curlistRec.thmm_dr%>
<%= curlistRec.thmm_crdt%>
<%= curlistRec.thmm_bal%>
<%= curlistRec.prelae_pay_clsf_cd1%>
<%= curlistRec.mang_clsf_cd1%>
<%= curlistRec.pch_count%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 10 20:39:07 KST 2009 */