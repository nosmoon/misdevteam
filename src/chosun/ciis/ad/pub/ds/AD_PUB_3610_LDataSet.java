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


public class AD_PUB_3610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3610_LDataSet(){}
	public AD_PUB_3610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_PUB_3610_LCURLISTRecord rec = new AD_PUB_3610_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.mchrg_nm = Util.checkString(rset0.getString("mchrg_nm"));
			rec.cslcrg_nm = Util.checkString(rset0.getString("cslcrg_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.tot_rcpm_amt = Util.checkString(rset0.getString("tot_rcpm_amt"));
			rec.misu_tot_amt = Util.checkString(rset0.getString("misu_tot_amt"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_3610_LDataSet ds = (AD_PUB_3610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3610_LCURLISTRecord curlistRec = (AD_PUB_3610_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.pubc_side%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.mchrg_nm%>
<%= curlistRec.cslcrg_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.tot_rcpm_amt%>
<%= curlistRec.misu_tot_amt%>
<%= curlistRec.fee%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.uprc%>
<%= curlistRec.coms%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 02 14:07:44 KST 2015 */