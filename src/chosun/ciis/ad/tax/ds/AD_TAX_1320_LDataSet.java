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

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.tax.rec.AD_TAX_1320_LCURLISTRecord;

/**
 * 
 */


public class AD_TAX_1320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_TAX_1320_LDataSet(){}
	public AD_TAX_1320_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			AD_TAX_1320_LCURLISTRecord rec = new AD_TAX_1320_LCURLISTRecord();
			rec.prof_type_nm = Util.checkString(rset2.getString("prof_type_nm"));
			rec.cnt = Util.checkString(rset2.getString("cnt"));
			rec.suply_amt = Util.checkString(rset2.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset2.getString("vat_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_TAX_1320_LDataSet ds = (AD_TAX_1320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_1320_LCURLISTRecord curlistRec = (AD_TAX_1320_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.prof_type_nm%>
<%= curlistRec.cnt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 01 13:30:32 KST 2009 */