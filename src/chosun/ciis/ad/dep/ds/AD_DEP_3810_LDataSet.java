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
import chosun.ciis.ad.dep.rec.AD_DEP_3810_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_3810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_3810_LDataSet(){}
	public AD_DEP_3810_LDataSet(String errcode, String errmsg){
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
			AD_DEP_3810_LCURLISTRecord rec = new AD_DEP_3810_LCURLISTRecord();
			rec.bddb_proc_clsf = Util.checkString(rset0.getString("bddb_proc_clsf"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.hndl_plac_cd = Util.checkString(rset0.getString("hndl_plac_cd"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.unrcp_vat = Util.checkString(rset0.getString("unrcp_vat"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_3810_LDataSet ds = (AD_DEP_3810_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3810_LCURLISTRecord curlistRec = (AD_DEP_3810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bddb_proc_clsf%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.agn_nm%>
<%= curlistRec.hndl_plac_cd%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.unrcp_vat%>
<%= curlistRec.pubc_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 10 10:53:50 KST 2009 */