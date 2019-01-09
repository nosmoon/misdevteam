/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class AD_NMD_4070_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_NMD_4070_LDataSet(){}
	public AD_NMD_4070_LDataSet(String errcode, String errmsg){
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
			AD_NMD_4070_LCURLISTRecord rec = new AD_NMD_4070_LCURLISTRecord();
			rec.sale_stmt_issu_yn = Util.checkString(rset0.getString("sale_stmt_issu_yn"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.chpn_slip_no = Util.checkString(rset0.getString("chpn_slip_no"));
			rec.readr_nm = Util.checkString(rset0.getString("readr_nm"));
			rec.read_stat = Util.checkString(rset0.getString("read_stat"));
			rec.tax_clsf = Util.checkString(rset0.getString("tax_clsf"));
			rec.advt_yn = Util.checkString(rset0.getString("advt_yn"));
			rec.read_fr_dt = Util.checkString(rset0.getString("read_fr_dt"));
			rec.stplt_time = Util.checkString(rset0.getString("stplt_time"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.lftvr_amt = Util.checkString(rset0.getString("lftvr_amt"));
			rec.suspns_dt = Util.checkString(rset0.getString("suspns_dt"));
			rec.refn_time = Util.checkString(rset0.getString("refn_time"));
			rec.refn_amt = Util.checkString(rset0.getString("refn_amt"));
			rec.hndl_clsf = Util.checkString(rset0.getString("hndl_clsf"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.fee_rate = Util.checkString(rset0.getString("fee_rate"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			rec.tot_rcpm_amt = Util.checkString(rset0.getString("tot_rcpm_amt"));
			rec.unclct_amt = Util.checkString(rset0.getString("unclct_amt"));
			rec.clos_stat = Util.checkString(rset0.getString("clos_stat"));
			rec.extn_no = Util.checkString(rset0.getString("extn_no"));
			rec.grp_id = Util.checkString(rset0.getString("grp_id"));
			rec.id = Util.checkString(rset0.getString("id"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_NMD_4070_LDataSet ds = (AD_NMD_4070_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_NMD_4070_LCURLISTRecord curlistRec = (AD_NMD_4070_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sale_stmt_issu_yn%>
<%= curlistRec.occr_dt%>
<%= curlistRec.chpn_slip_no%>
<%= curlistRec.readr_nm%>
<%= curlistRec.read_stat%>
<%= curlistRec.tax_clsf%>
<%= curlistRec.advt_yn%>
<%= curlistRec.read_fr_dt%>
<%= curlistRec.stplt_time%>
<%= curlistRec.sale_amt%>
<%= curlistRec.lftvr_amt%>
<%= curlistRec.suspns_dt%>
<%= curlistRec.refn_time%>
<%= curlistRec.refn_amt%>
<%= curlistRec.hndl_clsf%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.agn%>
<%= curlistRec.fee_rate%>
<%= curlistRec.fee%>
<%= curlistRec.rcpm_clsf%>
<%= curlistRec.tot_rcpm_amt%>
<%= curlistRec.unclct_amt%>
<%= curlistRec.clos_stat%>
<%= curlistRec.extn_no%>
<%= curlistRec.grp_id%>
<%= curlistRec.id%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 08 14:58:31 KST 2014 */