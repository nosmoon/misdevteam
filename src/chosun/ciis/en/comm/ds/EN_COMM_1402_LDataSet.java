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


package chosun.ciis.en.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1402_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_COMM_1402_LDataSet(){}
	public EN_COMM_1402_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			EN_COMM_1402_LCURLISTRecord rec = new EN_COMM_1402_LCURLISTRecord();
			rec.rcpm_shet_kind = Util.checkString(rset0.getString("rcpm_shet_kind"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			rec.widr_resn = Util.checkString(rset0.getString("widr_resn"));
			rec.rcpm_shet_stat = Util.checkString(rset0.getString("rcpm_shet_stat"));
			rec.rcpm_shet_dlv_dt = Util.checkString(rset0.getString("rcpm_shet_dlv_dt"));
			rec.widr_dt = Util.checkString(rset0.getString("widr_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_COMM_1402_LDataSet ds = (EN_COMM_1402_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_COMM_1402_LCURLISTRecord curlistRec = (EN_COMM_1402_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_shet_kind%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.rcpm_clsf%>
<%= curlistRec.widr_resn%>
<%= curlistRec.rcpm_shet_stat%>
<%= curlistRec.rcpm_shet_dlv_dt%>
<%= curlistRec.widr_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 13:58:54 KST 2009 */