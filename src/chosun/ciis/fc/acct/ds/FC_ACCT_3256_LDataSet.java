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


public class FC_ACCT_3256_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList slip_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3256_LDataSet(){}
	public FC_ACCT_3256_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			FC_ACCT_3256_LSLIP_LISTRecord rec = new FC_ACCT_3256_LSLIP_LISTRecord();
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.sum_dr_amt = Util.checkString(rset0.getString("sum_dr_amt"));
			rec.sum_crdt_amt = Util.checkString(rset0.getString("sum_crdt_amt"));
			rec.diff_amt = Util.checkString(rset0.getString("diff_amt"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.clam_dept_nm = Util.checkString(rset0.getString("clam_dept_nm"));
			rec.incmg_emp_no = Util.checkString(rset0.getString("incmg_emp_no"));
			rec.incmg_emp_nm = Util.checkString(rset0.getString("incmg_emp_nm"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.setoff_slip_clsf_cd = Util.checkString(rset0.getString("setoff_slip_clsf_cd"));
			rec.fisc_seq = Util.checkString(rset0.getString("fisc_seq"));
			rec.fisc_no = Util.checkString(rset0.getString("fisc_no"));
			rec.reso_amt = Util.checkString(rset0.getString("reso_amt"));
			rec.slip_aprv_yn = Util.checkString(rset0.getString("slip_aprv_yn"));
			this.slip_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_3256_LDataSet ds = (FC_ACCT_3256_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.slip_list.size(); i++){
		FC_ACCT_3256_LSLIP_LISTRecord slip_listRec = (FC_ACCT_3256_LSLIP_LISTRecord)ds.slip_list.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= slip_listRec.slip_occr_dt%>
<%= slip_listRec.slip_seq%>
<%= slip_listRec.slip_sub_seq%>
<%= slip_listRec.rmks1%>
<%= slip_listRec.slip_clsf_cd%>
<%= slip_listRec.slip_no%>
<%= slip_listRec.sum_dr_amt%>
<%= slip_listRec.sum_crdt_amt%>
<%= slip_listRec.diff_amt%>
<%= slip_listRec.clam_dept_cd%>
<%= slip_listRec.clam_dept_nm%>
<%= slip_listRec.incmg_emp_no%>
<%= slip_listRec.incmg_emp_nm%>
<%= slip_listRec.fisc_dt%>
<%= slip_listRec.incmg_dt%>
<%= slip_listRec.setoff_slip_clsf_cd%>
<%= slip_listRec.fisc_seq%>
<%= slip_listRec.fisc_no%>
<%= slip_listRec.reso_amt%>
<%= slip_listRec.slip_aprv_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 21 16:44:53 KST 2014 */