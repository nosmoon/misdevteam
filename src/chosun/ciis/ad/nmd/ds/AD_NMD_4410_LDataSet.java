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


public class AD_NMD_4410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_NMD_4410_LDataSet(){}
	public AD_NMD_4410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			AD_NMD_4410_LCURLISTRecord rec = new AD_NMD_4410_LCURLISTRecord();
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.setoff_advt_fee = Util.checkString(rset0.getString("setoff_advt_fee"));
			rec.setoff_vat = Util.checkString(rset0.getString("setoff_vat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_NMD_4410_LDataSet ds = (AD_NMD_4410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_NMD_4410_LCURLISTRecord curlistRec = (AD_NMD_4410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.proc_stat%>
<%= curlistRec.medi_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.setoff_advt_fee%>
<%= curlistRec.setoff_vat%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 05 10:51:56 KST 2014 */