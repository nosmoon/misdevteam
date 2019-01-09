/***************************************************************************************************
* ���ϸ� : .java
* ��� : ȸ�����
* �ۼ����� : 2009-02-19
* �ۼ��� : �����
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
 * ȸ�����
 */


public class FC_ACCT_2841_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rcpmshetlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2841_LDataSet(){}
	public FC_ACCT_2841_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_2841_LRCPMSHETLISTRecord rec = new FC_ACCT_2841_LRCPMSHETLISTRecord();
			rec.rcpm_shet_kind = Util.checkString(rset0.getString("rcpm_shet_kind"));
			rec.rcpm_indc_bgn_no = Util.checkString(rset0.getString("rcpm_indc_bgn_no"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			rec.rcpm_shet_dlv_dt = Util.checkString(rset0.getString("rcpm_shet_dlv_dt"));
			rec.dlver_emp_no = Util.checkString(rset0.getString("dlver_emp_no"));
			rec.dlver_emp_nm = Util.checkString(rset0.getString("dlver_emp_nm"));
			rec.recp_pers_emp_no = Util.checkString(rset0.getString("recp_pers_emp_no"));
			rec.recp_pers_emp_nm = Util.checkString(rset0.getString("recp_pers_emp_nm"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			this.rcpmshetlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2841_LDataSet ds = (FC_ACCT_2841_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rcpmshetlist.size(); i++){
		FC_ACCT_2841_LRCPMSHETLISTRecord rcpmshetlistRec = (FC_ACCT_2841_LRCPMSHETLISTRecord)ds.rcpmshetlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpmshetlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= rcpmshetlistRec.rcpm_shet_kind%>
<%= rcpmshetlistRec.rcpm_indc_bgn_no%>
<%= rcpmshetlistRec.rcpm_clsf%>
<%= rcpmshetlistRec.rcpm_shet_dlv_dt%>
<%= rcpmshetlistRec.dlver_emp_no%>
<%= rcpmshetlistRec.dlver_emp_nm%>
<%= rcpmshetlistRec.recp_pers_emp_no%>
<%= rcpmshetlistRec.recp_pers_emp_nm%>
<%= rcpmshetlistRec.rcpm_shet_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 03 20:38:33 KST 2009 */