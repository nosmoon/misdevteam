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


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1510_LCURLISTRecord;

/**
 * 
 */


public class AD_RES_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String advqut;

	public AD_RES_1510_LDataSet(){}
	public AD_RES_1510_LDataSet(String errcode, String errmsg, String advqut){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.advqut = advqut;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAdvqut(String advqut){
		this.advqut = advqut;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAdvqut(){
		return this.advqut;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.advqut = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_RES_1510_LCURLISTRecord rec = new AD_RES_1510_LCURLISTRecord();
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_RES_1510_LDataSet ds = (AD_RES_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1510_LCURLISTRecord curlistRec = (AD_RES_1510_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAdvqut()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.preng_occr_dt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 19:02:13 KST 2009 */