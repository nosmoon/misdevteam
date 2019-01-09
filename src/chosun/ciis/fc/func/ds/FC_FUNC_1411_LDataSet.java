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


public class FC_FUNC_1411_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1411_LDataSet(){}
	public FC_FUNC_1411_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_1411_LCURLISTRecord rec = new FC_FUNC_1411_LCURLISTRecord();
			rec.note_clsf_cd_nm2 = Util.checkString(rset0.getString("note_clsf_cd_nm2"));
			rec.note_full_no = Util.checkString(rset0.getString("note_full_no"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.bank_cd_nm = Util.checkString(rset0.getString("bank_cd_nm"));
			rec.rcpm_acct_nm2 = Util.checkString(rset0.getString("rcpm_acct_nm2"));
			rec.slipno = Util.checkString(rset0.getString("slipno"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.now_note_stat_cd2 = Util.checkString(rset0.getString("now_note_stat_cd2"));
			rec.sale_aprv_no = Util.checkString(rset0.getString("sale_aprv_no"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.rcpm_acct = Util.checkString(rset0.getString("rcpm_acct"));
			rec.rcpm_acct_nm = Util.checkString(rset0.getString("rcpm_acct_nm"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.now_note_stat_cd_nm = Util.checkString(rset0.getString("now_note_stat_cd_nm"));
			rec.note_clsf_cd_nm = Util.checkString(rset0.getString("note_clsf_cd_nm"));
			rec.rcpay_amt = Util.checkString(rset0.getString("rcpay_amt"));
			rec.corp_tax = Util.checkString(rset0.getString("corp_tax"));
			rec.etc_prft = Util.checkString(rset0.getString("etc_prft"));
			rec.es_dlco_clsf_cd = Util.checkString(rset0.getString("es_dlco_clsf_cd"));
			rec.es_dlco_cd = Util.checkString(rset0.getString("es_dlco_cd"));
			rec.escompnm = Util.checkString(rset0.getString("escompnm"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1411_LDataSet ds = (FC_FUNC_1411_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1411_LCURLISTRecord curlistRec = (FC_FUNC_1411_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cd_nm2%>
<%= curlistRec.note_full_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.rcpm_acct_nm2%>
<%= curlistRec.slipno%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.compnm%>
<%= curlistRec.now_note_stat_cd2%>
<%= curlistRec.sale_aprv_no%>
<%= curlistRec.coms%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.bank_cd%>
<%= curlistRec.rcpm_acct%>
<%= curlistRec.rcpm_acct_nm%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.now_note_stat_cd_nm%>
<%= curlistRec.note_clsf_cd_nm%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.corp_tax%>
<%= curlistRec.etc_prft%>
<%= curlistRec.es_dlco_clsf_cd%>
<%= curlistRec.es_dlco_cd%>
<%= curlistRec.escompnm%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 15:51:43 KST 2009 */