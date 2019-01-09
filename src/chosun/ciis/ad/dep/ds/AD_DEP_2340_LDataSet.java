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
import chosun.ciis.ad.dep.rec.AD_DEP_2340_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2340_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2340_LDataSet(){}
	public AD_DEP_2340_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AD_DEP_2340_LCURLISTRecord rec = new AD_DEP_2340_LCURLISTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.advt_fee_01 = Util.checkString(rset0.getString("advt_fee_01"));
			rec.advt_fee_02 = Util.checkString(rset0.getString("advt_fee_02"));
			rec.advt_fee_03 = Util.checkString(rset0.getString("advt_fee_03"));
			rec.advt_fee_04 = Util.checkString(rset0.getString("advt_fee_04"));
			rec.advt_fee_05 = Util.checkString(rset0.getString("advt_fee_05"));
			rec.advt_fee_06 = Util.checkString(rset0.getString("advt_fee_06"));
			rec.advt_fee_07 = Util.checkString(rset0.getString("advt_fee_07"));
			rec.advt_fee_08 = Util.checkString(rset0.getString("advt_fee_08"));
			rec.advt_fee_09 = Util.checkString(rset0.getString("advt_fee_09"));
			rec.advt_fee_10 = Util.checkString(rset0.getString("advt_fee_10"));
			rec.advt_fee_11 = Util.checkString(rset0.getString("advt_fee_11"));
			rec.advt_fee_12 = Util.checkString(rset0.getString("advt_fee_12"));
			rec.advt_fee_tot = Util.checkString(rset0.getString("advt_fee_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_2340_LDataSet ds = (AD_DEP_2340_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2340_LCURLISTRecord curlistRec = (AD_DEP_2340_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_nm%>
<%= curlistRec.gubun%>
<%= curlistRec.advt_fee_01%>
<%= curlistRec.advt_fee_02%>
<%= curlistRec.advt_fee_03%>
<%= curlistRec.advt_fee_04%>
<%= curlistRec.advt_fee_05%>
<%= curlistRec.advt_fee_06%>
<%= curlistRec.advt_fee_07%>
<%= curlistRec.advt_fee_08%>
<%= curlistRec.advt_fee_09%>
<%= curlistRec.advt_fee_10%>
<%= curlistRec.advt_fee_11%>
<%= curlistRec.advt_fee_12%>
<%= curlistRec.advt_fee_tot%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 23 10:36:57 KST 2009 */