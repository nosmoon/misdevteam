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


public class FC_ACCT_3016_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3016_LDataSet(){}
	public FC_ACCT_3016_LDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			FC_ACCT_3016_LCURLISTRecord rec = new FC_ACCT_3016_LCURLISTRecord();
			rec.x = Util.checkString(rset2.getString("x"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset2.getString("prelae_pay_clsf_cd"));
			rec.mang_clsf_cd = Util.checkString(rset2.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset2.getString("mang_no"));
			rec.comp_dt = Util.checkString(rset2.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.pymt_amt = Util.checkString(rset2.getString("pymt_amt"));
			rec.cntr_bal = Util.checkString(rset2.getString("cntr_bal"));
			rec.pymt_cnt = Util.checkString(rset2.getString("pymt_cnt"));
			rec.int_rate = Util.checkString(rset2.getString("int_rate"));
			rec.prvmm_bal = Util.checkString(rset2.getString("prvmm_bal"));
			rec.thmm_dr = Util.checkString(rset2.getString("thmm_dr"));
			rec.thmm_crdt = Util.checkString(rset2.getString("thmm_crdt"));
			rec.thmm_bal = Util.checkString(rset2.getString("thmm_bal"));
			rec.slip_no = Util.checkString(rset2.getString("slip_no"));
			rec.slip_sub_seq = Util.checkString(rset2.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset2.getString("slip_arow_no"));
			rec.prelae_pay_clsf_cd1 = Util.checkString(rset2.getString("prelae_pay_clsf_cd1"));
			rec.mang_clsf_cd1 = Util.checkString(rset2.getString("mang_clsf_cd1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_3016_LDataSet ds = (FC_ACCT_3016_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_3016_LCURLISTRecord curlistRec = (FC_ACCT_3016_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.slip_no%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.prelae_pay_clsf_cd1%>
<%= curlistRec.mang_clsf_cd1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 17 16:28:02 KST 2009 */