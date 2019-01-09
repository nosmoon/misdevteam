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


public class TN_LNK_5030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totcount;
	public long totprice;

	public TN_LNK_5030_LDataSet(){}
	public TN_LNK_5030_LDataSet(String errcode, String errmsg, long totcount, long totprice){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totcount = totcount;
		this.totprice = totprice;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotcount(long totcount){
		this.totcount = totcount;
	}

	public void setTotprice(long totprice){
		this.totprice = totprice;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotcount(){
		return this.totcount;
	}

	public long getTotprice(){
		return this.totprice;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totcount = cstmt.getLong(10);
		this.totprice = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			TN_LNK_5030_LCURLISTRecord rec = new TN_LNK_5030_LCURLISTRecord();
			rec.pymtmm = Util.checkString(rset0.getString("pymtmm"));
			rec.pymtdd = Util.checkString(rset0.getString("pymtdd"));
			rec.support = Util.checkString(rset0.getString("support"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.memb_nm = Util.checkString(rset0.getString("memb_nm"));
			rec.memb_tel = Util.checkString(rset0.getString("memb_tel"));
			rec.memb_email = Util.checkString(rset0.getString("memb_email"));
			rec.pymt_cd = Util.checkString(rset0.getString("pymt_cd"));
			rec.cardowner = Util.checkString(rset0.getString("cardowner"));
			rec.cardcmpy = Util.checkString(rset0.getString("cardcmpy"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.result_stat = Util.checkString(rset0.getString("result_stat"));
			rec.paymentidx = Util.checkString(rset0.getString("paymentidx"));
			rec.isdelete = Util.checkString(rset0.getString("isdelete"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			rec.sdsipaymentidx = Util.checkString(rset0.getString("sdsipaymentidx"));
			rec.sdsiidx = Util.checkString(rset0.getString("sdsiidx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_5030_LDataSet ds = (TN_LNK_5030_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_5030_LCURLISTRecord curlistRec = (TN_LNK_5030_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotcount()%>
<%= ds.getTotprice()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.pymtmm%>
<%= curlistRec.pymtdd%>
<%= curlistRec.support%>
<%= curlistRec.memb_cd%>
<%= curlistRec.memb_nm%>
<%= curlistRec.memb_tel%>
<%= curlistRec.memb_email%>
<%= curlistRec.pymt_cd%>
<%= curlistRec.cardowner%>
<%= curlistRec.cardcmpy%>
<%= curlistRec.cardno%>
<%= curlistRec.payprice%>
<%= curlistRec.result_stat%>
<%= curlistRec.paymentidx%>
<%= curlistRec.isdelete%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
<%= curlistRec.sdsipaymentidx%>
<%= curlistRec.sdsiidx%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 28 13:57:12 KST 2017 */