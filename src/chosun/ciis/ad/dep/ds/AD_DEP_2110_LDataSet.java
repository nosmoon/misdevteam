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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_2110_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2110_LDataSet(){}
	public AD_DEP_2110_LDataSet(String errcode, String errmsg){
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
			AD_DEP_2110_LCURLISTRecord rec = new AD_DEP_2110_LCURLISTRecord();
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.pubc_yymm = Util.checkString(rset0.getString("pubc_yymm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.rcpm_yymm = Util.checkString(rset0.getString("rcpm_yymm"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.altn_amt = Util.checkString(rset0.getString("altn_amt"));
			rec.rate = Util.checkString(rset0.getString("rate"));
			rec.bal = Util.checkString(rset0.getString("bal"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_2110_LDataSet ds = (AD_DEP_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2110_LCURLISTRecord curlistRec = (AD_DEP_2110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_nm%>
<%= curlistRec.pubc_yymm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.rcpm_yymm%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.altn_amt%>
<%= curlistRec.rate%>
<%= curlistRec.bal%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 14:55:07 KST 2009 */