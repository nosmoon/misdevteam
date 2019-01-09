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


public class TN_RPT_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1100_LDataSet(){}
	public TN_RPT_1100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			TN_RPT_1100_LCURLISTRecord rec = new TN_RPT_1100_LCURLISTRecord();
			rec.partitiontype = Util.checkString(rset0.getString("partitiontype"));
			rec.paymethodname = Util.checkString(rset0.getString("paymethodname"));
			rec.promise_cnt = Util.checkString(rset0.getString("promise_cnt"));
			rec.promise_price = Util.checkString(rset0.getString("promise_price"));
			rec.payment_cnt = Util.checkString(rset0.getString("payment_cnt"));
			rec.payment_cnt = Util.checkString(rset0.getString("payment_cnt"));
			rec.payment_price = Util.checkString(rset0.getString("payment_price"));
			rec.pymt_rate = Util.checkString(rset0.getString("pymt_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_RPT_1100_LDataSet ds = (TN_RPT_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1100_LCURLISTRecord curlistRec = (TN_RPT_1100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.partitiontype%>
<%= curlistRec.paymethodname%>
<%= curlistRec.promise_cnt%>
<%= curlistRec.promise_price%>
<%= curlistRec.payment_cnt%>
<%= curlistRec.payment_cnt%>
<%= curlistRec.payment_price%>
<%= curlistRec.pymt_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 19 14:41:05 KST 2016 */