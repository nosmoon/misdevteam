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


public class FC_ACCT_5301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5301_LDataSet(){}
	public FC_ACCT_5301_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_5301_LCURLISTRecord rec = new FC_ACCT_5301_LCURLISTRecord();
			rec.check1 = Util.checkString(rset0.getString("check1"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.clos_mm = Util.checkString(rset0.getString("clos_mm"));
			rec.slip_dtls_clas = Util.checkString(rset0.getString("slip_dtls_clas"));
			rec.bgn_dt = Util.checkString(rset0.getString("bgn_dt"));
			rec.end_dt = Util.checkString(rset0.getString("end_dt"));
			rec.clos_pers_emp_no = Util.checkString(rset0.getString("clos_pers_emp_no"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5301_LDataSet ds = (FC_ACCT_5301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5301_LCURLISTRecord curlistRec = (FC_ACCT_5301_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.clos_mm%>
<%= curlistRec.slip_dtls_clas%>
<%= curlistRec.bgn_dt%>
<%= curlistRec.end_dt%>
<%= curlistRec.clos_pers_emp_no%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers_ipadd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 13 10:41:02 KST 2009 */