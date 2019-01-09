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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_3510_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_3510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3510_LDataSet(){}
	public AD_BAS_3510_LDataSet(String errcode, String errmsg){
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
			AD_BAS_3510_LCURLISTRecord rec = new AD_BAS_3510_LCURLISTRecord();
			rec.oth_clsf = Util.checkString(rset0.getString("oth_clsf"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.issu_ser_no = Util.checkString(rset0.getString("issu_ser_no"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.advcs = Util.checkString(rset0.getString("advcs"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.indt_clsf = Util.checkString(rset0.getString("indt_clsf"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.pubc_seq = Util.checkString(rset0.getString("pubc_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_3510_LDataSet ds = (AD_BAS_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3510_LCURLISTRecord curlistRec = (AD_BAS_3510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.oth_clsf%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_side%>
<%= curlistRec.issu_ser_no%>
<%= curlistRec.std%>
<%= curlistRec.advcs%>
<%= curlistRec.advt_cont%>
<%= curlistRec.indt_clsf%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.pubc_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 15 18:21:44 KST 2009 */