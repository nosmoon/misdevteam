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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_3520_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_3520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_3520_LDataSet(){}
	public AD_DEP_3520_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			AD_DEP_3520_LCURLISTRecord rec = new AD_DEP_3520_LCURLISTRecord();
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.dhon_occr_dt = Util.checkString(rset0.getString("dhon_occr_dt"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dhon_amt = Util.checkString(rset0.getString("dhon_amt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dhon_bal = Util.checkString(rset0.getString("dhon_bal"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_3520_LDataSet ds = (AD_DEP_3520_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3520_LCURLISTRecord curlistRec = (AD_DEP_3520_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.dhon_occr_dt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dhon_amt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dhon_bal%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 09 17:16:54 KST 2009 */