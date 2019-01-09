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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1091_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1091_LDataSet(){}
	public FC_FUNC_1091_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_1091_LCURLISTRecord rec = new FC_FUNC_1091_LCURLISTRecord();
			rec.b_note_clsf_cd_nm = Util.checkString(rset0.getString("b_note_clsf_cd_nm"));
			rec.b_nbn_no = Util.checkString(rset0.getString("b_nbn_no"));
			rec.b_pch_cymd1to = Util.checkString(rset0.getString("b_pch_cymd1to"));
			rec.b_rcpay_amt = Util.checkString(rset0.getString("b_rcpay_amt"));
			rec.b_issu_pers_nm = Util.checkString(rset0.getString("b_issu_pers_nm"));
			rec.b_dlco_clsf_cd_nm = Util.checkString(rset0.getString("b_dlco_clsf_cd_nm"));
			rec.b_pay_plac_cd_nm = Util.checkString(rset0.getString("b_pay_plac_cd_nm"));
			rec.b_now_note_stat_cd_nm = Util.checkString(rset0.getString("b_now_note_stat_cd_nm"));
			rec.b_dlco_clsf_cd = Util.checkString(rset0.getString("b_dlco_clsf_cd"));
			rec.b_dlco_cd = Util.checkString(rset0.getString("b_dlco_cd"));
			rec.b_pay_plac_cd = Util.checkString(rset0.getString("b_pay_plac_cd"));
			rec.b_now_note_stat_cd = Util.checkString(rset0.getString("b_now_note_stat_cd"));
			rec.b_note_clsf_cd = Util.checkString(rset0.getString("b_note_clsf_cd"));
			rec.b_bank_cd = Util.checkString(rset0.getString("b_bank_cd"));
			rec.b_note_no = Util.checkString(rset0.getString("b_note_no"));
			rec.b_note_seq = Util.checkString(rset0.getString("b_note_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1091_LDataSet ds = (FC_FUNC_1091_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1091_LCURLISTRecord curlistRec = (FC_FUNC_1091_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.b_note_clsf_cd_nm%>
<%= curlistRec.b_nbn_no%>
<%= curlistRec.b_pch_cymd1to%>
<%= curlistRec.b_rcpay_amt%>
<%= curlistRec.b_issu_pers_nm%>
<%= curlistRec.b_dlco_clsf_cd_nm%>
<%= curlistRec.b_pay_plac_cd_nm%>
<%= curlistRec.b_now_note_stat_cd_nm%>
<%= curlistRec.b_dlco_clsf_cd%>
<%= curlistRec.b_dlco_cd%>
<%= curlistRec.b_pay_plac_cd%>
<%= curlistRec.b_now_note_stat_cd%>
<%= curlistRec.b_note_clsf_cd%>
<%= curlistRec.b_bank_cd%>
<%= curlistRec.b_note_no%>
<%= curlistRec.b_note_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 22 10:32:05 KST 2009 */