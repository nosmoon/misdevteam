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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1530_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1530_LDataSet(){}
	public AD_PUB_1530_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			AD_PUB_1530_LCURLISTRecord rec = new AD_PUB_1530_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.icdcpubc_yn = Util.checkString(rset0.getString("icdcpubc_yn"));
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.pubc_occr_seq = Util.checkString(rset0.getString("pubc_occr_seq"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.hndl_plac_cd = Util.checkString(rset0.getString("hndl_plac_cd"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.pubc_tot_amt = Util.checkString(rset0.getString("pubc_tot_amt"));
			rec.pers = Util.checkString(rset0.getString("pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_1530_LDataSet ds = (AD_PUB_1530_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1530_LCURLISTRecord curlistRec = (AD_PUB_1530_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.icdcpubc_yn%>
<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.pubc_occr_seq%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dlco_no%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.hndl_plac_cd%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.pubc_tot_amt%>
<%= curlistRec.pers%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 11 15:41:02 KST 2013 */