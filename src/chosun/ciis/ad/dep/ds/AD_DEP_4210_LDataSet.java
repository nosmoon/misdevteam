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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_4210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_4210_LDataSet(){}
	public AD_DEP_4210_LDataSet(String errcode, String errmsg){
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
			AD_DEP_4210_LCURLISTRecord rec = new AD_DEP_4210_LCURLISTRecord();
			rec.pk 			= Util.checkString(rset0.getString("pk"));
			rec.prt_seq 	= Util.checkString(rset0.getString("prt_seq"));
			rec.input_clsf 	= Util.checkString(rset0.getString("input_clsf"));
			rec.basi_dt 	= Util.checkString(rset0.getString("basi_dt"));
			rec.dlco_nm 	= Util.checkString(rset0.getString("dlco_nm"));
			rec.unrcp_amt 	= Util.checkString(rset0.getString("unrcp_amt"));
			rec.rcvnote_amt = Util.checkString(rset0.getString("rcvnote_amt"));
			rec.precpt_amt 	= Util.checkString(rset0.getString("precpt_amt"));
			rec.unrcp_fee 	= Util.checkString(rset0.getString("unrcp_fee"));
			rec.impt_gurt_amt = Util.checkString(rset0.getString("impt_gurt_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_3510_LDataSet ds = (AD_DEP_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3510_LCURLISTRecord curlistRec = (AD_DEP_3510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_dt%>
<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.pubc_tot_amt%>
<%= curlistRec.advt_size%>
<%= curlistRec.advt_cont%>
<%= curlistRec.indt_clsf_nm%>
<%= curlistRec.ms_amt%>
<%= curlistRec.setoff_tot_pubc_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 26 11:47:51 KST 2009 */