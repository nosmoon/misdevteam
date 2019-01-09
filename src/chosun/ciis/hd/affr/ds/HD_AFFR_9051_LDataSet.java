/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9051_LDataSet(){}
	public HD_AFFR_9051_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_9051_LCURLISTRecord rec = new HD_AFFR_9051_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.usag_clsf_cd = Util.checkString(rset0.getString("usag_clsf_cd"));
			rec.usag_clsf_nm = Util.checkString(rset0.getString("usag_clsf_nm"));
			rec.journal_cd = Util.checkString(rset0.getString("journal_cd"));
			rec.journal_nm = Util.checkString(rset0.getString("journal_nm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.subs_pay = Util.checkString(rset0.getString("subs_pay"));
			rec.subs_tot_sum = Util.checkString(rset0.getString("subs_tot_sum"));
			rec.mm_issu_tms = Util.checkString(rset0.getString("mm_issu_tms"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_9051_LDataSet ds = (HD_AFFR_9051_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_9051_LCURLISTRecord curlistRec = (HD_AFFR_9051_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.basi_dt%>
<%= curlistRec.usag_clsf_cd%>
<%= curlistRec.usag_clsf_nm%>
<%= curlistRec.journal_cd%>
<%= curlistRec.journal_nm%>
<%= curlistRec.qty%>
<%= curlistRec.subs_pay%>
<%= curlistRec.subs_tot_sum%>
<%= curlistRec.mm_issu_tms%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 12 10:47:02 KST 2016 */