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


public class AD_NMD_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_NMD_1020_LDataSet(){}
	public AD_NMD_1020_LDataSet(String errcode, String errmsg){
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
			AD_NMD_1020_LCURLISTRecord rec = new AD_NMD_1020_LCURLISTRecord();
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.suply_amt_g = Util.checkString(rset0.getString("suply_amt_g"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.p_suply_amt = Util.checkString(rset0.getString("p_suply_amt"));
			rec.p_suply_amt_g = Util.checkString(rset0.getString("p_suply_amt_g"));
			rec.p_vat_amt = Util.checkString(rset0.getString("p_vat_amt"));
			rec.w_suply_amt = Util.checkString(rset0.getString("w_suply_amt"));
			rec.w_suply_amt_g = Util.checkString(rset0.getString("w_suply_amt_g"));
			rec.w_vat_amt = Util.checkString(rset0.getString("w_vat_amt"));
			rec.sum_suply_amt = Util.checkString(rset0.getString("sum_suply_amt"));
			rec.sum_suply_amt_g = Util.checkString(rset0.getString("sum_suply_amt_g"));
			rec.sum_vat_amt = Util.checkString(rset0.getString("sum_vat_amt"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq_l = Util.checkString(rset0.getString("slip_seq_l"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_NMD_1020_LDataSet ds = (AD_NMD_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_NMD_1020_LCURLISTRecord curlistRec = (AD_NMD_1020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cnt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.suply_amt_g%>
<%= curlistRec.vat_amt%>
<%= curlistRec.p_suply_amt%>
<%= curlistRec.p_suply_amt_g%>
<%= curlistRec.p_vat_amt%>
<%= curlistRec.w_suply_amt%>
<%= curlistRec.w_suply_amt_g%>
<%= curlistRec.w_vat_amt%>
<%= curlistRec.sum_suply_amt%>
<%= curlistRec.sum_suply_amt_g%>
<%= curlistRec.sum_vat_amt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq_l%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 26 17:16:36 KST 2012 */