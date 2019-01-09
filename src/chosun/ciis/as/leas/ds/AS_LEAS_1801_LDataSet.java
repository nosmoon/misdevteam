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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1801_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1801_LDataSet(){}
	public AS_LEAS_1801_LDataSet(String errcode, String errmsg){
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
			AS_LEAS_1801_LCURLISTRecord rec = new AS_LEAS_1801_LCURLISTRecord();
			rec.flag = Util.checkString(rset0.getString("flag"));
			rec.occr_no = Util.checkString(rset0.getString("occr_no"));
			rec.inout_clsf_nm = Util.checkString(rset0.getString("inout_clsf_nm"));
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.rcpm_tot_amt = Util.checkString(rset0.getString("rcpm_tot_amt"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.inout_clsf = Util.checkString(rset0.getString("inout_clsf"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1801_LDataSet ds = (AS_LEAS_1801_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAS_1801_LCURLISTRecord curlistRec = (AS_LEAS_1801_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.flag%>
<%= curlistRec.occr_no%>
<%= curlistRec.inout_clsf_nm%>
<%= curlistRec.bldg_nm%>
<%= curlistRec.cntr_no%>
<%= curlistRec.hire_dlco_nm%>
<%= curlistRec.remk%>
<%= curlistRec.rcpm_tot_amt%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.hire_dlco_ern%>
<%= curlistRec.bldg_cd%>
<%= curlistRec.inout_clsf%>
<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 09:53:59 KST 2009 */