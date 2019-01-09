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


package chosun.ciis.fc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1061_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_CO_1061_LDataSet(){}
	public FC_CO_1061_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_CO_1061_LCURLISTRecord rec = new FC_CO_1061_LCURLISTRecord();
			rec.cntr_clsf_cd = Util.checkString(rset0.getString("cntr_clsf_cd"));
			rec.leas_clsf_cd = Util.checkString(rset0.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset0.getString("leas_no"));
			rec.leas_sub_seq = Util.checkString(rset0.getString("leas_sub_seq"));
			rec.leas_nm = Util.checkString(rset0.getString("leas_nm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.re_leas_yn = Util.checkString(rset0.getString("re_leas_yn"));
			rec.cntr_clsf_cd1 = Util.checkString(rset0.getString("cntr_clsf_cd1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_CO_1061_LDataSet ds = (FC_CO_1061_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_CO_1061_LCURLISTRecord curlistRec = (FC_CO_1061_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cntr_clsf_cd%>
<%= curlistRec.leas_clsf_cd%>
<%= curlistRec.leas_no%>
<%= curlistRec.leas_sub_seq%>
<%= curlistRec.leas_nm%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.re_leas_yn%>
<%= curlistRec.cntr_clsf_cd1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 10:40:31 KST 2009 */