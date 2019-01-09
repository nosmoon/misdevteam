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


package chosun.ciis.hd.dtbas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dtbas.dm.*;
import chosun.ciis.hd.dtbas.rec.*;

/**
 * 
 */


public class HD_DTBAS_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DTBAS_1102_LDataSet(){}
	public HD_DTBAS_1102_LDataSet(String errcode, String errmsg){
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
			HD_DTBAS_1102_LCURLISTRecord rec = new HD_DTBAS_1102_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.duty_alon_cd = Util.checkString(rset0.getString("duty_alon_cd"));
			rec.duty_alon_nm = Util.checkString(rset0.getString("duty_alon_nm"));
			rec.duty_alon_grad = Util.checkString(rset0.getString("duty_alon_grad"));
			rec.aply_bgn_prd = Util.checkString(rset0.getString("aply_bgn_prd"));
			rec.aply_end_prd = Util.checkString(rset0.getString("aply_end_prd"));
			rec.base_alon = Util.checkString(rset0.getString("base_alon"));
			rec.cmpn_alon = Util.checkString(rset0.getString("cmpn_alon"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DTBAS_1102_LDataSet ds = (HD_DTBAS_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DTBAS_1102_LCURLISTRecord curlistRec = (HD_DTBAS_1102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.duty_alon_cd%>
<%= curlistRec.duty_alon_nm%>
<%= curlistRec.duty_alon_grad%>
<%= curlistRec.aply_bgn_prd%>
<%= curlistRec.aply_end_prd%>
<%= curlistRec.base_alon%>
<%= curlistRec.cmpn_alon%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 14 18:03:27 KST 2009 */