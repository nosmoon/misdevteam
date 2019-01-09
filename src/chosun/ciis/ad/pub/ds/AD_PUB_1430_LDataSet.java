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


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_1430_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_1430_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1430_LDataSet(){}
	public AD_PUB_1430_LDataSet(String errcode, String errmsg){
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
			AD_PUB_1430_LCURLISTRecord rec = new AD_PUB_1430_LCURLISTRecord();
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.pubc_tot_amt = Util.checkString(rset0.getString("pubc_tot_amt"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.pubc_area = Util.checkString(rset0.getString("pubc_area"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_1430_LDataSet ds = (AD_PUB_1430_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1430_LCURLISTRecord curlistRec = (AD_PUB_1430_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_side%>
<%= curlistRec.sect_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.pubc_tot_amt%>
<%= curlistRec.dn%>
<%= curlistRec.cm%>
<%= curlistRec.arow%>
<%= curlistRec.pubc_area%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 28 13:08:53 KST 2009 */