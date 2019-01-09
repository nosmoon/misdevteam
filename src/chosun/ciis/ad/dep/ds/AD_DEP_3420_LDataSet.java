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
import chosun.ciis.ad.dep.rec.AD_DEP_3420_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_3420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_3420_LDataSet(){}
	public AD_DEP_3420_LDataSet(String errcode, String errmsg){
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
			AD_DEP_3420_LCURLISTRecord rec = new AD_DEP_3420_LCURLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.misu_amt1 = Util.checkString(rset0.getString("misu_amt1"));
			rec.misu_amt2 = Util.checkString(rset0.getString("misu_amt2"));
			rec.misu_amt3 = Util.checkString(rset0.getString("misu_amt3"));
			rec.misu_amt4 = Util.checkString(rset0.getString("misu_amt4"));
			rec.misu_amt5 = Util.checkString(rset0.getString("misu_amt5"));
			rec.misu_amt6 = Util.checkString(rset0.getString("misu_amt6"));
			rec.misu_amt7 = Util.checkString(rset0.getString("misu_amt7"));
			rec.misu_amt8 = Util.checkString(rset0.getString("misu_amt8"));
			rec.misu_amt9 = Util.checkString(rset0.getString("misu_amt9"));
			rec.misu_amt10 = Util.checkString(rset0.getString("misu_amt10"));
			rec.misu_amt11 = Util.checkString(rset0.getString("misu_amt11"));
			rec.misu_amt12 = Util.checkString(rset0.getString("misu_amt12"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_3420_LDataSet ds = (AD_DEP_3420_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3420_LCURLISTRecord curlistRec = (AD_DEP_3420_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cd_nm%>
<%= curlistRec.misu_amt1%>
<%= curlistRec.misu_amt2%>
<%= curlistRec.misu_amt3%>
<%= curlistRec.misu_amt4%>
<%= curlistRec.misu_amt5%>
<%= curlistRec.misu_amt6%>
<%= curlistRec.misu_amt7%>
<%= curlistRec.misu_amt8%>
<%= curlistRec.misu_amt9%>
<%= curlistRec.misu_amt10%>
<%= curlistRec.misu_amt11%>
<%= curlistRec.misu_amt12%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 17 18:12:32 KST 2009 */