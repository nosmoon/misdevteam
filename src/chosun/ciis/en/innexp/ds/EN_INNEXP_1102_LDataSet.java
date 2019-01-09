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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1102_LDataSet(){}
	public EN_INNEXP_1102_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			EN_INNEXP_1102_LCURLISTRecord rec = new EN_INNEXP_1102_LCURLISTRecord();
			rec.proc_yn = Util.checkString(rset0.getString("proc_yn"));
			rec.occr_no = Util.checkString(rset0.getString("occr_no"));
			rec.reven_dt = Util.checkString(rset0.getString("reven_dt"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.reven_amt = Util.checkString(rset0.getString("reven_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.chrg_pers_emp_no = Util.checkString(rset0.getString("chrg_pers_emp_no"));
			rec.chrg_pers_emp_nm = Util.checkString(rset0.getString("chrg_pers_emp_nm"));
			rec.stmt_occr_dt = Util.checkString(rset0.getString("stmt_occr_dt"));
			rec.stmt_occr_seq = Util.checkString(rset0.getString("stmt_occr_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_1102_LDataSet ds = (EN_INNEXP_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1102_LCURLISTRecord curlistRec = (EN_INNEXP_1102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.proc_yn%>
<%= curlistRec.occr_no%>
<%= curlistRec.reven_dt%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.reven_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
<%= curlistRec.titl%>
<%= curlistRec.ern%>
<%= curlistRec.addr%>
<%= curlistRec.presi_nm%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.chrg_pers_emp_no%>
<%= curlistRec.chrg_pers_emp_nm%>
<%= curlistRec.stmt_occr_dt%>
<%= curlistRec.stmt_occr_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 13:38:17 KST 2009 */