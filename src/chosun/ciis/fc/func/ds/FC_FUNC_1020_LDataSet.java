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


public class FC_FUNC_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1020_LDataSet(){}
	public FC_FUNC_1020_LDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_FUNC_1020_LCURLISTRecord rec = new FC_FUNC_1020_LCURLISTRecord();
			rec.note_clsf_cd = Util.checkString(rset1.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.note_seq = Util.checkString(rset1.getString("note_seq"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.pay_plac_cd = Util.checkString(rset1.getString("pay_plac_cd"));
			rec.now_note_stat_cd = Util.checkString(rset1.getString("now_note_stat_cd"));
			rec.compnm = Util.checkString(rset1.getString("compnm"));
			rec.jgjnm = Util.checkString(rset1.getString("jgjnm"));
			rec.eestnm = Util.checkString(rset1.getString("eestnm"));
			rec.eegbnm = Util.checkString(rset1.getString("eegbnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1020_LDataSet ds = (FC_FUNC_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1020_LCURLISTRecord curlistRec = (FC_FUNC_1020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cd%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.pay_plac_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.compnm%>
<%= curlistRec.jgjnm%>
<%= curlistRec.eestnm%>
<%= curlistRec.eegbnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 09 14:59:52 KST 2009 */