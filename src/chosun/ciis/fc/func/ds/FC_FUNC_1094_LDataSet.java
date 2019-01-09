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


public class FC_FUNC_1094_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1094_LDataSet(){}
	public FC_FUNC_1094_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1094_LCURLISTRecord rec = new FC_FUNC_1094_LCURLISTRecord();
			rec.p_repl_amt = Util.checkString(rset0.getString("p_repl_amt"));
			rec.p_budg_cd = Util.checkString(rset0.getString("p_budg_cd"));
			rec.p_deps_clsf_cd = Util.checkString(rset0.getString("p_deps_clsf_cd"));
			rec.p_deps_dt = Util.checkString(rset0.getString("p_deps_dt"));
			rec.p_frex_cd = Util.checkString(rset0.getString("p_frex_cd"));
			rec.p_exrate = Util.checkString(rset0.getString("p_exrate"));
			rec.p_frex_amt = Util.checkString(rset0.getString("p_frex_amt"));
			rec.p_trufnd_slip_clsf = Util.checkString(rset0.getString("p_trufnd_slip_clsf"));
			rec.p_trufnd_slip_no = Util.checkString(rset0.getString("p_trufnd_slip_no"));
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			rec.current_clsf = Util.checkString(rset0.getString("current_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1094_LDataSet ds = (FC_FUNC_1094_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1094_LCURLISTRecord curlistRec = (FC_FUNC_1094_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.p_repl_amt%>
<%= curlistRec.p_budg_cd%>
<%= curlistRec.p_deps_clsf_cd%>
<%= curlistRec.p_deps_dt%>
<%= curlistRec.p_frex_cd%>
<%= curlistRec.p_exrate%>
<%= curlistRec.p_frex_amt%>
<%= curlistRec.p_trufnd_slip_clsf%>
<%= curlistRec.p_trufnd_slip_no%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.current_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 20 17:19:51 KST 2009 */