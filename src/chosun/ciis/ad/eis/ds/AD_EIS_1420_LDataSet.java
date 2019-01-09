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


package chosun.ciis.ad.eis.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.eis.rec.AD_EIS_1420_LCURLISTRecord;

/**
 * 
 */


public class AD_EIS_1420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EIS_1420_LDataSet(){}
	public AD_EIS_1420_LDataSet(String errcode, String errmsg){
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
			AD_EIS_1420_LCURLISTRecord rec = new AD_EIS_1420_LCURLISTRecord();
			rec.indt_lcls = Util.checkString(rset0.getString("indt_lcls"));
			rec.indt_lcls_nm = Util.checkString(rset0.getString("indt_lcls_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.pre_advt_fee = Util.checkString(rset0.getString("pre_advt_fee"));
			rec.icdc_amt = Util.checkString(rset0.getString("icdc_amt"));
			rec.icdc_rate = Util.checkString(rset0.getString("icdc_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_EIS_1420_LDataSet ds = (AD_EIS_1420_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EIS_1420_LCURLISTRecord curlistRec = (AD_EIS_1420_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.indt_lcls%>
<%= curlistRec.indt_lcls_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.pre_advt_fee%>
<%= curlistRec.icdc_amt%>
<%= curlistRec.icdc_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 23 17:40:07 KST 2009 */