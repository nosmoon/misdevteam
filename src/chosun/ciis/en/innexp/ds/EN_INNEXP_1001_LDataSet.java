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


public class EN_INNEXP_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1001_LDataSet(){}
	public EN_INNEXP_1001_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			EN_INNEXP_1001_LCURLISTRecord rec = new EN_INNEXP_1001_LCURLISTRecord();
			rec.reven_no = Util.checkString(rset0.getString("reven_no"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.reven_dt = Util.checkString(rset0.getString("reven_dt"));
			rec.reven_amt = Util.checkString(rset0.getString("reven_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.stmt_no = Util.checkString(rset0.getString("stmt_no"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.chrg_dept_nm = Util.checkString(rset0.getString("chrg_dept_nm"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.evnt_yy = Util.checkString(rset0.getString("evnt_yy"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_seq = Util.checkString(rset0.getString("evnt_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_1001_LDataSet ds = (EN_INNEXP_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1001_LCURLISTRecord curlistRec = (EN_INNEXP_1001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.reven_no%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.titl%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.reven_dt%>
<%= curlistRec.reven_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.stmt_no%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.chrg_dept_nm%>
<%= curlistRec.incmg_pers_nm%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.occr_seq%>
<%= curlistRec.evnt_yy%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 21:31:31 KST 2009 */