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


package chosun.ciis.ad.nmd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4081_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_NMD_4081_LDataSet(){}
	public AD_NMD_4081_LDataSet(String errcode, String errmsg){
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
			AD_NMD_4081_LCURLISTRecord rec = new AD_NMD_4081_LCURLISTRecord();
			rec.clos_stat = Util.checkString(rset0.getString("clos_stat"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.semuro_no = Util.checkString(rset0.getString("semuro_no"));
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.fee_vat = Util.checkString(rset0.getString("fee_vat"));
			rec.tot_fee = Util.checkString(rset0.getString("tot_fee"));
			rec.tax_item = Util.checkString(rset0.getString("tax_item"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_NMD_4081_LDataSet ds = (AD_NMD_4081_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_NMD_4081_LCURLISTRecord curlistRec = (AD_NMD_4081_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.clos_stat%>
<%= curlistRec.make_dt%>
<%= curlistRec.semuro_no%>
<%= curlistRec.tax_stmt_no%>
<%= curlistRec.agn%>
<%= curlistRec.agn_nm%>
<%= curlistRec.fee%>
<%= curlistRec.fee_vat%>
<%= curlistRec.tot_fee%>
<%= curlistRec.tax_item%>
<%= curlistRec.medi_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 20 20:22:31 KST 2015 */