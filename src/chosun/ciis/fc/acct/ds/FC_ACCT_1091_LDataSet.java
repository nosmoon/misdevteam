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


public class FC_ACCT_1091_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_1091_LDataSet(){}
	public FC_ACCT_1091_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_ACCT_1091_LCURLISTRecord rec = new FC_ACCT_1091_LCURLISTRecord();
			rec.note_amt_llmt = Util.checkString(rset0.getString("note_amt_llmt"));
			rec.note_amt_hlmt = Util.checkString(rset0.getString("note_amt_hlmt"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.rem_cash_hlmt = Util.checkString(rset0.getString("rem_cash_hlmt"));
			rec.pay_amt_llmt = Util.checkString(rset0.getString("pay_amt_llmt"));
			rec.pay_amt_hlmt = Util.checkString(rset0.getString("pay_amt_hlmt"));
			rec.mtrydd_llmt = Util.checkString(rset0.getString("mtrydd_llmt"));
			rec.mtrydd_hlmt = Util.checkString(rset0.getString("mtrydd_hlmt"));
			rec.mtrymm_llmt = Util.checkString(rset0.getString("mtrymm_llmt"));
			rec.mtrymm_hlmt = Util.checkString(rset0.getString("mtrymm_hlmt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.lump_setoff_excl_yn = Util.checkString(rset0.getString("lump_setoff_excl_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_1091_LDataSet ds = (FC_ACCT_1091_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1091_LCURLISTRecord curlistRec = (FC_ACCT_1091_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_amt_llmt%>
<%= curlistRec.note_amt_hlmt%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.rem_cash_hlmt%>
<%= curlistRec.pay_amt_llmt%>
<%= curlistRec.pay_amt_hlmt%>
<%= curlistRec.mtrydd_llmt%>
<%= curlistRec.mtrydd_hlmt%>
<%= curlistRec.mtrymm_llmt%>
<%= curlistRec.mtrymm_hlmt%>
<%= curlistRec.seq%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.lump_setoff_excl_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 05 09:58:14 KST 2009 */