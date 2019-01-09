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


public class FC_ACCT_2441_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2441_LDataSet(){}
	public FC_ACCT_2441_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2441_LCURLISTRecord rec = new FC_ACCT_2441_LCURLISTRecord();
			rec.rmks1a = Util.checkString(rset0.getString("rmks1a"));
			rec.fisc_dta = Util.checkString(rset0.getString("fisc_dta"));
			rec.occr_amt = Util.checkString(rset0.getString("occr_amt"));
			rec.actu_adpay_bal = Util.checkString(rset0.getString("actu_adpay_bal"));
			rec.fisc_dtb = Util.checkString(rset0.getString("fisc_dtb"));
			rec.rmks1b = Util.checkString(rset0.getString("rmks1b"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.arow_no = Util.checkString(rset0.getString("arow_no"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2441_LDataSet ds = (FC_ACCT_2441_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2441_LCURLISTRecord curlistRec = (FC_ACCT_2441_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rmks1a%>
<%= curlistRec.fisc_dta%>
<%= curlistRec.occr_amt%>
<%= curlistRec.actu_adpay_bal%>
<%= curlistRec.fisc_dtb%>
<%= curlistRec.rmks1b%>
<%= curlistRec.amt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.sub_seq%>
<%= curlistRec.arow_no%>
<%= curlistRec.slip_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 15 14:58:26 KST 2009 */