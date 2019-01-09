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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_1610_LDataSet(){}
	public HD_VACA_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_VACA_1610_LCURLISTRecord rec = new HD_VACA_1610_LCURLISTRecord();
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.clndr_wkdy = Util.checkString(rset0.getString("clndr_wkdy"));
			rec.clndr_wkdy_nm = Util.checkString(rset0.getString("clndr_wkdy_nm"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.hody_clsf_nm = Util.checkString(rset0.getString("hody_clsf_nm"));
			rec.alvc_plan_dt = Util.checkString(rset0.getString("alvc_plan_dt"));
			rec.alvc_use_dt = Util.checkString(rset0.getString("alvc_use_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1610_LDataSet ds = (HD_VACA_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1610_LCURLISTRecord curlistRec = (HD_VACA_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.duty_dt%>
<%= curlistRec.clndr_wkdy%>
<%= curlistRec.clndr_wkdy_nm%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.hody_clsf_nm%>
<%= curlistRec.alvc_plan_dt%>
<%= curlistRec.alvc_use_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 29 16:05:57 KST 2009 */