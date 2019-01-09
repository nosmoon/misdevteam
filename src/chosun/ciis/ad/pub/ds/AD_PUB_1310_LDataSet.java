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
import chosun.ciis.ad.pub.rec.AD_PUB_1310_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1310_LDataSet(){}
	public AD_PUB_1310_LDataSet(String errcode, String errmsg){
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
			AD_PUB_1310_LCURLISTRecord rec = new AD_PUB_1310_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.guid_aprv_yn = Util.checkString(rset0.getString("guid_aprv_yn"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.advcs_cd = Util.checkString(rset0.getString("advcs_cd"));
			rec.advcs_nm = Util.checkString(rset0.getString("advcs_nm"));
			rec.eps_clsf_cd = Util.checkString(rset0.getString("eps_clsf_cd"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.guid_sec_kind_cd = Util.checkString(rset0.getString("guid_sec_kind_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_1310_LDataSet ds = (AD_PUB_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1310_LCURLISTRecord curlistRec = (AD_PUB_1310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_dt%>
<%= curlistRec.guid_aprv_yn%>
<%= curlistRec.seq%>
<%= curlistRec.advt_cont%>
<%= curlistRec.advcs_cd%>
<%= curlistRec.advcs_nm%>
<%= curlistRec.eps_clsf_cd%>
<%= curlistRec.pubc_side%>
<%= curlistRec.arow%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.guid_sec_kind_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 09 10:16:00 KST 2009 */