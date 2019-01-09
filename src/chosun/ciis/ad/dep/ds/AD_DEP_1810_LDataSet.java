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
import chosun.ciis.ad.dep.rec.AD_DEP_1810_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_1810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_1810_LDataSet(){}
	public AD_DEP_1810_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_DEP_1810_LCURLISTRecord rec = new AD_DEP_1810_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.evlu_frdt = Util.checkString(rset0.getString("evlu_frdt"));
			rec.evlu_todt = Util.checkString(rset0.getString("evlu_todt"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.cntr_frdt = Util.checkString(rset0.getString("cntr_frdt"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.sum_kiil = Util.checkString(rset0.getString("sum_kiil"));
			rec.pyong_point = Util.checkString(rset0.getString("pyong_point"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_1810_LDataSet ds = (AD_DEP_1810_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_1810_LCURLISTRecord curlistRec = (AD_DEP_1810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.evlu_frdt%>
<%= curlistRec.evlu_todt%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.cntr_frdt%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.sum_kiil%>
<%= curlistRec.pyong_point%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 25 09:59:07 KST 2009 */