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


public class FC_ACCT_8001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_8001_LDataSet(){}
	public FC_ACCT_8001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			FC_ACCT_8001_LCURLISTRecord rec = new FC_ACCT_8001_LCURLISTRecord();
			rec.incm_clsf_cd = Util.checkString(rset0.getString("incm_clsf_cd"));
			rec.slip = Util.checkString(rset0.getString("slip"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.pay_tot_amt = Util.checkString(rset0.getString("pay_tot_amt"));
			rec.need_cost = Util.checkString(rset0.getString("need_cost"));
			rec.incm_amt = Util.checkString(rset0.getString("incm_amt"));
			rec.rate = Util.checkString(rset0.getString("rate"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.incm_pers = Util.checkString(rset0.getString("incm_pers"));
			rec.incm_pers_prn = Util.checkString(rset0.getString("incm_pers_prn"));
			rec.incm_pers_addr = Util.checkString(rset0.getString("incm_pers_addr"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.setoff_slip_occr_dt = Util.checkString(rset0.getString("setoff_slip_occr_dt"));
			rec.setoff_slip_clsf_cd = Util.checkString(rset0.getString("setoff_slip_clsf_cd"));
			rec.setoff_slip_seq = Util.checkString(rset0.getString("setoff_slip_seq"));
			rec.setoff_slip_sub_seq = Util.checkString(rset0.getString("setoff_slip_sub_seq"));
			rec.setoff_slip_arow_no = Util.checkString(rset0.getString("setoff_slip_arow_no"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(15);
		while(rset1.next()){
			FC_ACCT_8001_LCURLIST2Record rec = new FC_ACCT_8001_LCURLIST2Record();
			rec.diff_amt = Util.checkString(rset1.getString("diff_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_8001_LDataSet ds = (FC_ACCT_8001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_8001_LCURLISTRecord curlistRec = (FC_ACCT_8001_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_8001_LCURLIST2Record curlist2Rec = (FC_ACCT_8001_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.slip%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.pay_tot_amt%>
<%= curlistRec.need_cost%>
<%= curlistRec.incm_amt%>
<%= curlistRec.rate%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.incm_pers%>
<%= curlistRec.incm_pers_prn%>
<%= curlistRec.incm_pers_addr%>
<%= curlistRec.budg_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.setoff_slip_occr_dt%>
<%= curlistRec.setoff_slip_clsf_cd%>
<%= curlistRec.setoff_slip_seq%>
<%= curlistRec.setoff_slip_sub_seq%>
<%= curlistRec.setoff_slip_arow_no%>
<%= curlistRec.acct_cd%>
<%= curlist2Rec.diff_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 30 10:21:50 KST 2009 */