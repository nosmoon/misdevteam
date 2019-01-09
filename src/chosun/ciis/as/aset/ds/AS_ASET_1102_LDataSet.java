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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1102_LDataSet(){}
	public AS_ASET_1102_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AS_ASET_1102_LCURLISTRecord rec = new AS_ASET_1102_LCURLISTRecord();
			rec.selected = Util.checkString(rset0.getString("selected"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.chg_clsf_nm = Util.checkString(rset0.getString("chg_clsf_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.chg_tot_amt = Util.checkString(rset0.getString("chg_tot_amt"));
			rec.vat_tot_amt = Util.checkString(rset0.getString("vat_tot_amt"));
			rec.rcpm_tot_amt = Util.checkString(rset0.getString("rcpm_tot_amt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_clsf = Util.checkString(rset0.getString("chg_clsf"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.ndduc_year = Util.checkString(rset0.getString("ndduc_year"));
			rec.ndduc_prd_clsf = Util.checkString(rset0.getString("ndduc_prd_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1102_LDataSet ds = (AS_ASET_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1102_LCURLISTRecord curlistRec = (AS_ASET_1102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.selected%>
<%= curlistRec.chg_dt%>
<%= curlistRec.chg_clsf_nm%>
<%= curlistRec.remk%>
<%= curlistRec.chg_tot_amt%>
<%= curlistRec.vat_tot_amt%>
<%= curlistRec.rcpm_tot_amt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.tax_stmt_no%>
<%= curlistRec.slip_no%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_clsf%>
<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
<%= curlistRec.ndduc_year%>
<%= curlistRec.ndduc_prd_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 17:52:31 KST 2009 */