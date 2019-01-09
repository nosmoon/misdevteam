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
import chosun.ciis.ad.bas.rec.AD_BAS_3213_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_3213_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3213_LDataSet(){}
	public AD_BAS_3213_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_BAS_3213_LCURLISTRecord rec = new AD_BAS_3213_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.tot_pcnt = Util.checkString(rset0.getString("tot_pcnt"));
			rec.tot_cell = Util.checkString(rset0.getString("tot_cell"));
			rec.clr_cell = Util.checkString(rset0.getString("clr_cell"));
			rec.asum_pubc_amt = Util.checkString(rset0.getString("asum_pubc_amt"));
			rec.advt_ocpy_rate = Util.checkString(rset0.getString("advt_ocpy_rate"));
			rec.c0301_pcnt = Util.checkString(rset0.getString("c0301_pcnt"));
			rec.c0302_pcnt = Util.checkString(rset0.getString("c0302_pcnt"));
			rec.c0303_sect_nm = Util.checkString(rset0.getString("c0303_sect_nm"));
			rec.c0303_pcnt = Util.checkString(rset0.getString("c0303_pcnt"));
			rec.c0304_sect_nm = Util.checkString(rset0.getString("c0304_sect_nm"));
			rec.c0304_pcnt = Util.checkString(rset0.getString("c0304_pcnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_3213_LDataSet ds = (AD_BAS_3213_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3213_LCURLISTRecord curlistRec = (AD_BAS_3213_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.tot_pcnt%>
<%= curlistRec.tot_cell%>
<%= curlistRec.clr_cell%>
<%= curlistRec.asum_pubc_amt%>
<%= curlistRec.advt_ocpy_rate%>
<%= curlistRec.c0301_pcnt%>
<%= curlistRec.c0302_pcnt%>
<%= curlistRec.c0303_sect_nm%>
<%= curlistRec.c0303_pcnt%>
<%= curlistRec.c0304_sect_nm%>
<%= curlistRec.c0304_pcnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 17 17:14:39 KST 2009 */