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


package chosun.ciis.ad.tax.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.rec.*;

/**
 * 
 */


public class AD_TAX_1060_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_TAX_1060_LDataSet(){}
	public AD_TAX_1060_LDataSet(String errcode, String errmsg){
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
			AD_TAX_1060_LCURLISTRecord rec = new AD_TAX_1060_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.sale_stmt_issu_yn = Util.checkString(rset0.getString("sale_stmt_issu_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_TAX_1060_LDataSet ds = (AD_TAX_1060_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_1060_LCURLISTRecord curlistRec = (AD_TAX_1060_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.agn%>
<%= curlistRec.agn_nm%>
<%= curlistRec.sale_stmt_issu_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Sep 14 23:59:48 KST 2009 */