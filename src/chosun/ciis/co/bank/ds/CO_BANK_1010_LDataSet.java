/***************************************************************************************************
* ���ϸ� : .java
* ��� :  ���� - ���� ����� ������ȸ
* �ۼ����� : 2011-04-27
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.bank.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.bank.dm.*;
import chosun.ciis.co.bank.rec.*;

/**
 * ���� - ���� ����� ������ȸ
 */

public class CO_BANK_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_BANK_1010_LDataSet(){}
	public CO_BANK_1010_LDataSet(String errcode, String errmsg){
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
			CO_BANK_1010_LCURLISTRecord rec = new CO_BANK_1010_LCURLISTRecord();
			rec.bank_name = Util.checkString(rset0.getString("bank_name"));
			rec.tran_content = Util.checkString(rset0.getString("tran_content"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.cms_code = Util.checkString(rset0.getString("cms_code"));
			rec.tran_remain = Util.checkString(rset0.getString("tran_remain"));
			rec.tran_branch = Util.checkString(rset0.getString("tran_branch"));
			rec.acct_tonghwa = Util.checkString(rset0.getString("acct_tonghwa"));
			rec.hwanyul = Util.checkString(rset0.getString("hwanyul"));
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			rec.current_clsf = Util.checkString(rset0.getString("current_clsf"));
			rec.remark = Util.checkString(rset0.getString("remark"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_BANK_1010_LDataSet ds = (CO_BANK_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_BANK_1010_LCURLISTRecord curlistRec = (CO_BANK_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bank_name%>
<%= curlistRec.tran_content%>
<%= curlistRec.tran_amt%>
<%= curlistRec.cms_code%>
<%= curlistRec.tran_remain%>
<%= curlistRec.tran_branch%>
<%= curlistRec.acct_tonghwa%>
<%= curlistRec.hwanyul%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.current_clsf%>
<%= curlistRec.remark%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 22 16:40:56 KST 2011 */