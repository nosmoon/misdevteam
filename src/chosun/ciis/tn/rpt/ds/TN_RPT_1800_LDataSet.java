/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1800_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1800_LDataSet(){}
	public TN_RPT_1800_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			TN_RPT_1800_LCURLISTRecord rec = new TN_RPT_1800_LCURLISTRecord();
			rec.membercode = Util.checkString(rset0.getString("membercode"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.cellphone = Util.checkString(rset0.getString("cellphone"));
			rec.address1 = Util.checkString(rset0.getString("address1"));
			rec.promisecode = Util.checkString(rset0.getString("promisecode"));
			rec.promisedate = Util.checkString(rset0.getString("promisedate"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.bankaccount = Util.checkString(rset0.getString("bankaccount"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.totalpayprice = Util.checkString(rset0.getString("totalpayprice"));
			rec.paymemo = Util.checkString(rset0.getString("paymemo"));
			rec.promiseprice = Util.checkString(rset0.getString("promiseprice"));
			rec.paymethodnm = Util.checkString(rset0.getString("paymethodnm"));
			rec.partitiontype = Util.checkString(rset0.getString("partitiontype"));
			rec.paystartdate = Util.checkString(rset0.getString("paystartdate"));
			rec.payenddate = Util.checkString(rset0.getString("payenddate"));
			rec.monthlypayday = Util.checkString(rset0.getString("monthlypayday"));
			rec.monthlypayprice = Util.checkString(rset0.getString("monthlypayprice"));
			rec.partitioncount = Util.checkString(rset0.getString("partitioncount"));
			rec.onlineproyn = Util.checkString(rset0.getString("onlineproyn"));
			rec.writedate = Util.checkString(rset0.getString("writedate"));
			rec.fund2 = Util.checkString(rset0.getString("fund2"));
			rec.member_regno = Util.checkString(rset0.getString("member_regno"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_RPT_1800_LDataSet ds = (TN_RPT_1800_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1800_LCURLISTRecord curlistRec = (TN_RPT_1800_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.membercode%>
<%= curlistRec.name%>
<%= curlistRec.memo%>
<%= curlistRec.cellphone%>
<%= curlistRec.address1%>
<%= curlistRec.promisecode%>
<%= curlistRec.promisedate%>
<%= curlistRec.paydate%>
<%= curlistRec.bankaccount%>
<%= curlistRec.payprice%>
<%= curlistRec.totalpayprice%>
<%= curlistRec.paymemo%>
<%= curlistRec.promiseprice%>
<%= curlistRec.paymethodnm%>
<%= curlistRec.partitiontype%>
<%= curlistRec.paystartdate%>
<%= curlistRec.payenddate%>
<%= curlistRec.monthlypayday%>
<%= curlistRec.monthlypayprice%>
<%= curlistRec.partitioncount%>
<%= curlistRec.onlineproyn%>
<%= curlistRec.writedate%>
<%= curlistRec.fund2%>
<%= curlistRec.member_regno%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 30 16:22:43 KST 2018 */