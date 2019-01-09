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


public class NM_SALE_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public NM_SALE_1001_LDataSet(){}
	public NM_SALE_1001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			NM_SALE_1001_LCURLISTRecord rec = new NM_SALE_1001_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			NM_SALE_1001_LCURLIST2Record rec = new NM_SALE_1001_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset1.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset1.getString("dtls_medi_nm"));
			rec.orgn_dtls_medi_nm = Util.checkString(rset1.getString("orgn_dtls_medi_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	NM_SALE_1001_LDataSet ds = (NM_SALE_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		NM_SALE_1001_LCURLISTRecord curlistRec = (NM_SALE_1001_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		NM_SALE_1001_LCURLIST2Record curlist2Rec = (NM_SALE_1001_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.yymm%>
<%= curlistRec.seq%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.actu_slip_no%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.dtls_medi_cd%>
<%= curlist2Rec.dtls_medi_nm%>
<%= curlist2Rec.orgn_dtls_medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 21 11:31:13 KST 2013 */