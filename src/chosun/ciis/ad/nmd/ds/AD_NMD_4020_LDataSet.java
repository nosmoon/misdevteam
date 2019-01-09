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


public class AD_NMD_4020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_NMD_4020_LDataSet(){}
	public AD_NMD_4020_LDataSet(String errcode, String errmsg){
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
			AD_NMD_4020_LCURLISTRecord rec = new AD_NMD_4020_LCURLISTRecord();
			rec.chpn_occr_dt = Util.checkString(rset0.getString("chpn_occr_dt"));
			rec.chpn_occr_seq = Util.checkString(rset0.getString("chpn_occr_seq"));
			rec.readr_nm = Util.checkString(rset0.getString("readr_nm"));
			rec.read_stat = Util.checkString(rset0.getString("read_stat"));
			rec.canc_yn = Util.checkString(rset0.getString("canc_yn"));
			rec.tax_clsf = Util.checkString(rset0.getString("tax_clsf"));
			rec.advt_yn = Util.checkString(rset0.getString("advt_yn"));
			rec.read_fr_dt = Util.checkString(rset0.getString("read_fr_dt"));
			rec.stplt_time = Util.checkString(rset0.getString("stplt_time"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.suspns_dt = Util.checkString(rset0.getString("suspns_dt"));
			rec.refn_time = Util.checkString(rset0.getString("refn_time"));
			rec.refn_amt = Util.checkString(rset0.getString("refn_amt"));
			rec.hndl_clsf = Util.checkString(rset0.getString("hndl_clsf"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			rec.unclct_amt = Util.checkString(rset0.getString("unclct_amt"));
			rec.clos_stat = Util.checkString(rset0.getString("clos_stat"));
			rec.extn_no = Util.checkString(rset0.getString("extn_no"));
			rec.grp_id = Util.checkString(rset0.getString("grp_id"));
			rec.id = Util.checkString(rset0.getString("id"));
			rec.re_reciv_dt = Util.checkString(rset0.getString("re_reciv_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_NMD_4020_LDataSet ds = (AD_NMD_4020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_NMD_4020_LCURLISTRecord curlistRec = (AD_NMD_4020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chpn_occr_dt%>
<%= curlistRec.chpn_occr_seq%>
<%= curlistRec.readr_nm%>
<%= curlistRec.read_stat%>
<%= curlistRec.canc_yn%>
<%= curlistRec.tax_clsf%>
<%= curlistRec.advt_yn%>
<%= curlistRec.read_fr_dt%>
<%= curlistRec.stplt_time%>
<%= curlistRec.sale_amt%>
<%= curlistRec.suspns_dt%>
<%= curlistRec.refn_time%>
<%= curlistRec.refn_amt%>
<%= curlistRec.hndl_clsf%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.agn%>
<%= curlistRec.fee%>
<%= curlistRec.rcpm_clsf%>
<%= curlistRec.unclct_amt%>
<%= curlistRec.clos_stat%>
<%= curlistRec.extn_no%>
<%= curlistRec.grp_id%>
<%= curlistRec.id%>
<%= curlistRec.re_reciv_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 14:51:15 KST 2015 */