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


public class FC_ACCT_3015_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3015_ADataSet(){}
	public FC_ACCT_3015_ADataSet(String errcode, String errmsg){
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
			FC_ACCT_3015_ACURLISTRecord rec = new FC_ACCT_3015_ACURLISTRecord();
			rec.x = Util.checkString(rset0.getString("x"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.pymt_amt = Util.checkString(rset0.getString("pymt_amt"));
			rec.cntr_bal = Util.checkString(rset0.getString("cntr_bal"));
			rec.pymt_cnt = Util.checkString(rset0.getString("pymt_cnt"));
			rec.int_rate = Util.checkString(rset0.getString("int_rate"));
			rec.prvmm_bal = Util.checkString(rset0.getString("prvmm_bal"));
			rec.thmm_dr = Util.checkString(rset0.getString("thmm_dr"));
			rec.thmm_crdt = Util.checkString(rset0.getString("thmm_crdt"));
			rec.thmm_bal = Util.checkString(rset0.getString("thmm_bal"));
			rec.famt1 = Util.checkString(rset0.getString("famt1"));
			rec.lcnt1 = Util.checkString(rset0.getString("lcnt1"));
			rec.lcnt2 = Util.checkString(rset0.getString("lcnt2"));
			rec.famt2 = Util.checkString(rset0.getString("famt2"));
			rec.famt3 = Util.checkString(rset0.getString("famt3"));
			rec.prelae_pay_clsf_cd1 = Util.checkString(rset0.getString("prelae_pay_clsf_cd1"));
			rec.mang_clsf_cd1 = Util.checkString(rset0.getString("mang_clsf_cd1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_3015_ADataSet ds = (FC_ACCT_3015_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_3015_ACURLISTRecord curlistRec = (FC_ACCT_3015_ACURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.pymt_amt%>
<%= curlistRec.cntr_bal%>
<%= curlistRec.pymt_cnt%>
<%= curlistRec.int_rate%>
<%= curlistRec.prvmm_bal%>
<%= curlistRec.thmm_dr%>
<%= curlistRec.thmm_crdt%>
<%= curlistRec.thmm_bal%>
<%= curlistRec.famt1%>
<%= curlistRec.lcnt1%>
<%= curlistRec.lcnt2%>
<%= curlistRec.famt2%>
<%= curlistRec.famt3%>
<%= curlistRec.prelae_pay_clsf_cd1%>
<%= curlistRec.mang_clsf_cd1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 17 17:54:24 KST 2009 */