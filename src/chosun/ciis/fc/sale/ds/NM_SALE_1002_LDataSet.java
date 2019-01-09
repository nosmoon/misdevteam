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


package chosun.ciis.fc.sale.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.sale.dm.*;
import chosun.ciis.fc.sale.rec.*;

/**
 * 
 */


public class NM_SALE_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public NM_SALE_1002_LDataSet(){}
	public NM_SALE_1002_LDataSet(String errcode, String errmsg){
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
			NM_SALE_1002_LCURLISTRecord rec = new NM_SALE_1002_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.orgn_dtls_medi_nm = Util.checkString(rset0.getString("orgn_dtls_medi_nm"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.divn_per = Util.checkString(rset0.getString("divn_per"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.tax_amt = Util.checkString(rset0.getString("tax_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	NM_SALE_1002_LDataSet ds = (NM_SALE_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		NM_SALE_1002_LCURLISTRecord curlistRec = (NM_SALE_1002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.seq%>
<%= curlistRec.sub_seq%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_clsf%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.orgn_dtls_medi_nm%>
<%= curlistRec.tms%>
<%= curlistRec.uprc%>
<%= curlistRec.sale_amt%>
<%= curlistRec.divn_per%>
<%= curlistRec.suply_amt%>
<%= curlistRec.tax_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.rmks%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 20 14:24:33 KST 2013 */