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


public class FC_ACCT_7001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_7001_LDataSet(){}
	public FC_ACCT_7001_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_7001_LCURLISTRecord rec = new FC_ACCT_7001_LCURLISTRecord();
			rec.card_mang_no = Util.checkString(rset0.getString("card_mang_no"));
			rec.card_no = Util.checkString(rset0.getString("card_no"));
			rec.use_pers_emp_no = Util.checkString(rset0.getString("use_pers_emp_no"));
			rec.use_pers_emp_nm = Util.checkString(rset0.getString("use_pers_emp_nm"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.decid_dd = Util.checkString(rset0.getString("decid_dd"));
			rec.wste_dt = Util.checkString(rset0.getString("wste_dt"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.decid_bank_cd = Util.checkString(rset0.getString("decid_bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.memb_dnmn = Util.checkString(rset0.getString("memb_dnmn"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.corp_card_clsf = Util.checkString(rset0.getString("corp_card_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_7001_LDataSet ds = (FC_ACCT_7001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_7001_LCURLISTRecord curlistRec = (FC_ACCT_7001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.card_mang_no%>
<%= curlistRec.card_no%>
<%= curlistRec.use_pers_emp_no%>
<%= curlistRec.use_pers_emp_nm%>
<%= curlistRec.issu_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.decid_dd%>
<%= curlistRec.wste_dt%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.decid_bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.memb_dnmn%>
<%= curlistRec.use_yn%>
<%= curlistRec.corp_card_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 06 13:21:09 KST 2009 */