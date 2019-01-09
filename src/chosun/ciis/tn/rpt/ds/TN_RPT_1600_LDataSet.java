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


public class TN_RPT_1600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1600_LDataSet(){}
	public TN_RPT_1600_LDataSet(String errcode, String errmsg){
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
			TN_RPT_1600_LCURLISTRecord rec = new TN_RPT_1600_LCURLISTRecord();
			rec.membercode = Util.checkString(rset0.getString("membercode"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.promisecode = Util.checkString(rset0.getString("promisecode"));
			rec.promisedate = Util.checkString(rset0.getString("promisedate"));
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
			this.curlist.add(rec);
		}
	}

}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_RPT_1600_LDataSet ds = (TN_RPT_1600_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1600_LCURLISTRecord curlistRec = (TN_RPT_1600_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.promisecode%>
<%= curlistRec.promisedate%>
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
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 24 18:18:48 KST 2016 */