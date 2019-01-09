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


public class FC_FUNC_1063_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1063_LDataSet(){}
	public FC_FUNC_1063_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_1063_LCURLISTRecord rec = new FC_FUNC_1063_LCURLISTRecord();
			rec.note_clsf_cd_nm = Util.checkString(rset0.getString("note_clsf_cd_nm"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.rcpay_amt = Util.checkString(rset0.getString("rcpay_amt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.slipno = Util.checkString(rset0.getString("slipno"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.pch_compnm = Util.checkString(rset0.getString("pch_compnm"));
			rec.pay_plac_cd_nm = Util.checkString(rset0.getString("pay_plac_cd_nm"));
			rec.now_note_stat_cd_nm = Util.checkString(rset0.getString("now_note_stat_cd_nm"));
			rec.dlco_cd2 = Util.checkString(rset0.getString("dlco_cd2"));
			rec.pch_smcompnm = Util.checkString(rset0.getString("pch_smcompnm"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.dlco_clsf_cd2 = Util.checkString(rset0.getString("dlco_clsf_cd2"));
			rec.pay_plac_cd = Util.checkString(rset0.getString("pay_plac_cd"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1063_LDataSet ds = (FC_FUNC_1063_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1063_LCURLISTRecord curlistRec = (FC_FUNC_1063_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cd_nm%>
<%= curlistRec.note_no%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.slipno%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.pay_plac_cd_nm%>
<%= curlistRec.now_note_stat_cd_nm%>
<%= curlistRec.dlco_cd2%>
<%= curlistRec.pch_smcompnm%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_seq%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.dlco_clsf_cd2%>
<%= curlistRec.pay_plac_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.dlco_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 16 13:52:21 KST 2009 */