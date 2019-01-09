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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1620_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_1620_LDataSet(){}
	public IS_AGR_1620_LDataSet(String errcode, String errmsg){
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
			IS_AGR_1620_LCURLISTRecord rec = new IS_AGR_1620_LCURLISTRecord();
			rec.scat_mm = Util.checkString(rset0.getString("scat_mm"));
			rec.indt_nm = Util.checkString(rset0.getString("indt_nm"));
			rec.ord_amt_01 = Util.checkString(rset0.getString("ord_amt_01"));
			rec.purc_amt_01 = Util.checkString(rset0.getString("purc_amt_01"));
			rec.prft_amt_01 = Util.checkString(rset0.getString("prft_amt_01"));
			rec.prft_rate_01 = Util.checkString(rset0.getString("prft_rate_01"));
			rec.ord_amt_02 = Util.checkString(rset0.getString("ord_amt_02"));
			rec.purc_amt_02 = Util.checkString(rset0.getString("purc_amt_02"));
			rec.prft_amt_02 = Util.checkString(rset0.getString("prft_amt_02"));
			rec.prft_rate_02 = Util.checkString(rset0.getString("prft_rate_02"));
			rec.t_no = Util.checkString(rset0.getString("t_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_AGR_1620_LDataSet ds = (IS_AGR_1620_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_1620_LCURLISTRecord curlistRec = (IS_AGR_1620_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.scat_mm%>
<%= curlistRec.indt_nm%>
<%= curlistRec.ord_amt_01%>
<%= curlistRec.purc_amt_01%>
<%= curlistRec.prft_amt_01%>
<%= curlistRec.prft_rate_01%>
<%= curlistRec.ord_amt_02%>
<%= curlistRec.purc_amt_02%>
<%= curlistRec.prft_amt_02%>
<%= curlistRec.prft_rate_02%>
<%= curlistRec.t_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 04 18:45:59 KST 2012 */