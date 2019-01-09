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


public class FC_FUNC_1121_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1121_LDataSet(){}
	public FC_FUNC_1121_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			FC_FUNC_1121_LCURLISTRecord rec = new FC_FUNC_1121_LCURLISTRecord();
			rec.note_clsf_nm = Util.checkString(rset1.getString("note_clsf_nm"));
			rec.note_clsf_cd = Util.checkString(rset1.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.note_seq = Util.checkString(rset1.getString("note_seq"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset1.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.pay_plac_cd = Util.checkString(rset1.getString("pay_plac_cd"));
			rec.now_note_stat_cd = Util.checkString(rset1.getString("now_note_stat_cd"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			rec.eegbnm = Util.checkString(rset1.getString("eegbnm"));
			rec.bhsgbnm = Util.checkString(rset1.getString("bhsgbnm"));
			rec.jgjnm = Util.checkString(rset1.getString("jgjnm"));
			rec.eestnm = Util.checkString(rset1.getString("eestnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1121_LDataSet ds = (FC_FUNC_1121_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1121_LCURLISTRecord curlistRec = (FC_FUNC_1121_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_nm%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.issu_cmpy_clsf_cd%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.pay_plac_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_no%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.eegbnm%>
<%= curlistRec.bhsgbnm%>
<%= curlistRec.jgjnm%>
<%= curlistRec.eestnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 21 14:19:11 KST 2009 */