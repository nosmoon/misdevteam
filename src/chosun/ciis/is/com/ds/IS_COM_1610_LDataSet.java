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


package chosun.ciis.is.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.rec.*;

/**
 * 
 */


public class IS_COM_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_COM_1610_LDataSet(){}
	public IS_COM_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			IS_COM_1610_LCURLISTRecord rec = new IS_COM_1610_LCURLISTRecord();
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.note_clsf_nm = Util.checkString(rset0.getString("note_clsf_nm"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset0.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.endorser_nm = Util.checkString(rset0.getString("endorser_nm"));
			rec.rcpm_acct = Util.checkString(rset0.getString("rcpm_acct"));
			rec.rcpm_acct_nm = Util.checkString(rset0.getString("rcpm_acct_nm"));
			rec.sale_aprv_no = Util.checkString(rset0.getString("sale_aprv_no"));
			rec.elec_note_key = Util.checkString(rset0.getString("elec_note_key"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_COM_1610_LDataSet ds = (IS_COM_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_COM_1610_LCURLISTRecord curlistRec = (IS_COM_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_clsf_nm%>
<%= curlistRec.note_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_cmpy_clsf_cd%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.endorser_nm%>
<%= curlistRec.rcpm_acct%>
<%= curlistRec.rcpm_acct_nm%>
<%= curlistRec.sale_aprv_no%>
<%= curlistRec.elec_note_key%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 17 21:26:47 KST 2012 */