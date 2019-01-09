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


public class FC_FUNC_2021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_2021_LDataSet(){}
	public FC_FUNC_2021_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_2021_LCURLISTRecord rec = new FC_FUNC_2021_LCURLISTRecord();
			rec.pay_bank_cdnm = Util.checkString(rset1.getString("pay_bank_cdnm"));
			rec.seci_no = Util.checkString(rset1.getString("seci_no"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.jbgamt = Util.checkString(rset1.getString("jbgamt"));
			rec.rcpay_amt = Util.checkString(rset1.getString("rcpay_amt"));
			rec.corp_tax_amt = Util.checkString(rset1.getString("corp_tax_amt"));
			rec.jpno = Util.checkString(rset1.getString("jpno"));
			rec.intamt = Util.checkString(rset1.getString("intamt"));
			rec.misusuic = Util.checkString(rset1.getString("misusuic"));
			rec.rmks = Util.checkString(rset1.getString("rmks"));
			rec.cost_gain_stot = Util.checkString(rset1.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset1.getString("rcpay_amt_stot"));
			rec.yugaint = Util.checkString(rset1.getString("yugaint"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_2021_LDataSet ds = (FC_FUNC_2021_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_2021_LCURLISTRecord curlistRec = (FC_FUNC_2021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pay_bank_cdnm%>
<%= curlistRec.seci_no%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.jbgamt%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.corp_tax_amt%>
<%= curlistRec.jpno%>
<%= curlistRec.intamt%>
<%= curlistRec.misusuic%>
<%= curlistRec.rmks%>
<%= curlistRec.cost_gain_stot%>
<%= curlistRec.rcpay_amt_stot%>
<%= curlistRec.yugaint%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 12 14:03:13 KST 2009 */