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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_3010_LDataSet(){}
	public TN_LNK_3010_LDataSet(String errcode, String errmsg){
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
			TN_LNK_3010_LCURLISTRecord rec = new TN_LNK_3010_LCURLISTRecord();
			rec.pymtmm = Util.checkString(rset0.getString("pymtmm"));
			rec.pymtdd = Util.checkString(rset0.getString("pymtdd"));
			rec.requestdate = Util.checkString(rset0.getString("requestdate"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.filename = Util.checkString(rset0.getString("filename"));
			rec.resultfilename = Util.checkString(rset0.getString("resultfilename"));
			rec.okcount = rset0.getInt("okcount");
			rec.okprice = rset0.getInt("okprice");
			rec.errorcount = rset0.getInt("errorcount");
			rec.errorprice = rset0.getInt("errorprice");
			rec.fee = rset0.getInt("fee");
			rec.stat1 = Util.checkString(rset0.getString("stat1"));
			rec.stat2 = Util.checkString(rset0.getString("stat2"));
			rec.stat3 = Util.checkString(rset0.getString("stat3"));
			rec.stat4 = Util.checkString(rset0.getString("stat4"));
			rec.cmsidx = Util.checkString(rset0.getString("cmsidx"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.status = Util.checkString(rset0.getString("status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_3010_LDataSet ds = (TN_LNK_3010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_3010_LCURLISTRecord curlistRec = (TN_LNK_3010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pymtmm%>
<%= curlistRec.pymtdd%>
<%= curlistRec.requestdate%>
<%= curlistRec.paydate%>
<%= curlistRec.filename%>
<%= curlistRec.resultfilename%>
<%= curlistRec.okcount%>
<%= curlistRec.okprice%>
<%= curlistRec.errorcount%>
<%= curlistRec.errorprice%>
<%= curlistRec.fee%>
<%= curlistRec.stat1%>
<%= curlistRec.stat2%>
<%= curlistRec.stat3%>
<%= curlistRec.stat4%>
<%= curlistRec.cmsidx%>
<%= curlistRec.deptidx%>
<%= curlistRec.status%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 22 17:58:09 KST 2016 */