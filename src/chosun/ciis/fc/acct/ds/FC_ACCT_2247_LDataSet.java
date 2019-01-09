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


public class FC_ACCT_2247_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2247_LDataSet(){}
	public FC_ACCT_2247_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_ACCT_2247_LCURLISTRecord rec = new FC_ACCT_2247_LCURLISTRecord();
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.bank_name = Util.checkString(rset0.getString("bank_name"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.cms_code = Util.checkString(rset0.getString("cms_code"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			rec.remark = Util.checkString(rset0.getString("remark"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.extnc_amt = Util.checkString(rset0.getString("extnc_amt"));
			rec.remain_amt = Util.checkString(rset0.getString("remain_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2247_LDataSet ds = (FC_ACCT_2247_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2247_LCURLISTRecord curlistRec = (FC_ACCT_2247_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.bank_name%>
<%= curlistRec.acct_num%>
<%= curlistRec.cms_code%>
<%= curlistRec.tran_date%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.remark%>
<%= curlistRec.tran_amt%>
<%= curlistRec.extnc_amt%>
<%= curlistRec.remain_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 09 16:30:19 KST 2016 */