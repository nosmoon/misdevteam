/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.job.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.rec.*;

/**
 * 
 */


public class HD_JOB_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_JOB_1200_LDataSet(){}
	public HD_JOB_1200_LDataSet(String errcode, String errmsg){
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
			HD_JOB_1200_LCURLISTRecord rec = new HD_JOB_1200_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.in_cmpy_posk_nm = Util.checkString(rset0.getString("in_cmpy_posk_nm"));
			rec.chrg_job = Util.checkString(rset0.getString("chrg_job"));
			rec.dtls_job = Util.checkString(rset0.getString("dtls_job"));
			rec.aprv_stat = Util.checkString(rset0.getString("aprv_stat"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dtls_cd1_1 = Util.checkString(rset0.getString("dtls_cd1_1"));
			rec.dtls_cd1_2 = Util.checkString(rset0.getString("dtls_cd1_2"));
			rec.dtls_cd2_1 = Util.checkString(rset0.getString("dtls_cd2_1"));
			rec.dtls_cd2_2 = Util.checkString(rset0.getString("dtls_cd2_2"));
			rec.dtls_nm1 = Util.checkString(rset0.getString("dtls_nm1"));
			rec.dtls_nm2 = Util.checkString(rset0.getString("dtls_nm2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_JOB_1200_LDataSet ds = (HD_JOB_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_JOB_1200_LCURLISTRecord curlistRec = (HD_JOB_1200_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.frdt%>
<%= curlistRec.part_nm%>
<%= curlistRec.in_cmpy_posk_nm%>
<%= curlistRec.chrg_job%>
<%= curlistRec.dtls_job%>
<%= curlistRec.aprv_stat%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.dtls_cd1_1%>
<%= curlistRec.dtls_cd1_2%>
<%= curlistRec.dtls_cd2_1%>
<%= curlistRec.dtls_cd2_2%>
<%= curlistRec.dtls_nm1%>
<%= curlistRec.dtls_nm2%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 13 17:01:43 KST 2017 */