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
import chosun.ciis.ad.dep.rec.AD_DEP_2810_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String cnt;

	public AD_DEP_2810_LDataSet(){}
	public AD_DEP_2810_LDataSet(String errcode, String errmsg, String cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cnt = cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCnt(){
		return this.cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.cnt = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_DEP_2810_LCURLISTRecord rec = new AD_DEP_2810_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.hosu = Util.checkString(rset0.getString("hosu"));
			rec.mpubc_side = Util.checkString(rset0.getString("mpubc_side"));
			rec.spubc_side = Util.checkString(rset0.getString("spubc_side"));
			rec.epubc_side = Util.checkString(rset0.getString("epubc_side"));
			rec.madvt_fee = Util.checkString(rset0.getString("madvt_fee"));
			rec.sadvt_fee = Util.checkString(rset0.getString("sadvt_fee"));
			rec.eadvt_fee = Util.checkString(rset0.getString("eadvt_fee"));
			rec.setoff_advt_fee = Util.checkString(rset0.getString("setoff_advt_fee"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_2810_LDataSet ds = (AD_DEP_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2810_LCURLISTRecord curlistRec = (AD_DEP_2810_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.pubc_dt%>
<%= curlistRec.hosu%>
<%= curlistRec.mpubc_side%>
<%= curlistRec.spubc_side%>
<%= curlistRec.epubc_side%>
<%= curlistRec.madvt_fee%>
<%= curlistRec.sadvt_fee%>
<%= curlistRec.eadvt_fee%>
<%= curlistRec.setoff_advt_fee%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 09 09:58:02 KST 2009 */