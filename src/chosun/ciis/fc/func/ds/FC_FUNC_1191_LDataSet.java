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


public class FC_FUNC_1191_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1191_LDataSet(){}
	public FC_FUNC_1191_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_FUNC_1191_LCURLISTRecord rec = new FC_FUNC_1191_LCURLISTRecord();
			rec.pcheegbnm = Util.checkString(rset1.getString("pcheegbnm"));
			rec.nbn_no = Util.checkString(rset1.getString("nbn_no"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.rcpay_amt = Util.checkString(rset1.getString("rcpay_amt"));
			rec.dhon_occr_dt = Util.checkString(rset1.getString("dhon_occr_dt"));
			rec.pchbudosayunm = Util.checkString(rset1.getString("pchbudosayunm"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.pchjpgbnm = Util.checkString(rset1.getString("pchjpgbnm"));
			rec.dlco = Util.checkString(rset1.getString("dlco"));
			rec.pch_compnm = Util.checkString(rset1.getString("pch_compnm"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.pcheestnm = Util.checkString(rset1.getString("pcheestnm"));
			rec.note_clsf_cd = Util.checkString(rset1.getString("note_clsf_cd"));
			rec.pch_eegbnm = Util.checkString(rset1.getString("pch_eegbnm"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset1.getString("note_seq"));
			rec.dhon_resn_cd = Util.checkString(rset1.getString("dhon_resn_cd"));
			rec.pch_budosayunm = Util.checkString(rset1.getString("pch_budosayunm"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.pch_jpgbnm = Util.checkString(rset1.getString("pch_jpgbnm"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.now_note_stat_cd = Util.checkString(rset1.getString("now_note_stat_cd"));
			rec.pch_eestnm = Util.checkString(rset1.getString("pch_eestnm"));
			rec.daesonamt = Util.checkString(rset1.getString("daesonamt"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1191_LDataSet ds = (FC_FUNC_1191_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1191_LCURLISTRecord curlistRec = (FC_FUNC_1191_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pcheegbnm%>
<%= curlistRec.nbn_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.dhon_occr_dt%>
<%= curlistRec.pchbudosayunm%>
<%= curlistRec.slip_no%>
<%= curlistRec.pchjpgbnm%>
<%= curlistRec.dlco%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.pcheestnm%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.pch_eegbnm%>
<%= curlistRec.note_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_seq%>
<%= curlistRec.dhon_resn_cd%>
<%= curlistRec.pch_budosayunm%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.pch_jpgbnm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.pch_eestnm%>
<%= curlistRec.daesonamt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 27 20:05:29 KST 2009 */