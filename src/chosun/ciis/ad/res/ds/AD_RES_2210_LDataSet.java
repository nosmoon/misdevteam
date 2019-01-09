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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_2210_LDataSet(){}
	public AD_RES_2210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_RES_2210_LCURLISTRecord rec = new AD_RES_2210_LCURLISTRecord();
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.chrg_aprv = Util.checkString(rset0.getString("chrg_aprv"));
			rec.team_chf_aprv = Util.checkString(rset0.getString("team_chf_aprv"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.issu_ser_no = Util.checkString(rset0.getString("issu_ser_no"));
			rec.publ_std = Util.checkString(rset0.getString("publ_std"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_RES_2210_LDataSet ds = (AD_RES_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_2210_LCURLISTRecord curlistRec = (AD_RES_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.chrg_aprv%>
<%= curlistRec.team_chf_aprv%>
<%= curlistRec.pubc_side%>
<%= curlistRec.issu_ser_no%>
<%= curlistRec.publ_std%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 20 16:31:19 KST 2014 */