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


package chosun.ciis.ad.brn.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.brn.rec.AD_BRN_1030_LCURLISTRecord;

/**
 * 
 */


public class AD_BRN_1030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BRN_1030_LDataSet(){}
	public AD_BRN_1030_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_BRN_1030_LCURLISTRecord rec = new AD_BRN_1030_LCURLISTRecord();
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.bo_chrg_aprv = Util.checkString(rset0.getString("bo_chrg_aprv"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.mchrg_pers_nm = Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BRN_1030_LDataSet ds = (AD_BRN_1030_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BRN_1030_LCURLISTRecord curlistRec = (AD_BRN_1030_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.bo_chrg_aprv%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.mchrg_pers_nm%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.advt_cont%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 20 15:56:36 KST 2009 */