/***************************************************************************************************
* ���ϸ� : .java
* ��� :  �繫ȸ�� - ��ǥ����  - ���԰��ǰ���  - �����Ա�Ȯ��
* �ۼ����� : 2010-08-13
* �ۼ��� : �����
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
 * �繫ȸ�� - ��ǥ����  - ���԰��ǰ���  - �����Ա�Ȯ��
 */


public class FC_ACCT_2241_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2241_LDataSet(){}
	public FC_ACCT_2241_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_2241_LCURLISTRecord rec = new FC_ACCT_2241_LCURLISTRecord();
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.bank_name = Util.checkString(rset0.getString("bank_name"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.remark = Util.checkString(rset0.getString("remark"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.extnc_amt = Util.checkString(rset0.getString("extnc_amt"));
			rec.remain_amt = Util.checkString(rset0.getString("remain_amt"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2241_LDataSet ds = (FC_ACCT_2241_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2241_LCURLISTRecord curlistRec = (FC_ACCT_2241_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_num%>
<%= curlistRec.bank_name%>
<%= curlistRec.tran_date%>
<%= curlistRec.remark%>
<%= curlistRec.tran_amt%>
<%= curlistRec.extnc_amt%>
<%= curlistRec.remain_amt%>
<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.mchrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Oct 25 17:38:30 KST 2010 */