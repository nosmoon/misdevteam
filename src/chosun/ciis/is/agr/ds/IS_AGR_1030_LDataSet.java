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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_1030_LDataSet(){}
	public IS_AGR_1030_LDataSet(String errcode, String errmsg){
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
			IS_AGR_1030_LCURLISTRecord rec = new IS_AGR_1030_LCURLISTRecord();
			rec.a_dlco_clsf_cd_seq = Util.checkString(rset0.getString("a_dlco_clsf_cd_seq"));
			rec.a_dlco_abrv_nm = Util.checkString(rset0.getString("a_dlco_abrv_nm"));
			rec.a_dlco_nm = Util.checkString(rset0.getString("a_dlco_nm"));
			rec.a_asnt_dstc_cd = Util.checkString(rset0.getString("a_asnt_dstc_cd"));
			rec.a_asnt_dstc_cd_nm = Util.checkString(rset0.getString("a_asnt_dstc_cd_nm"));
			rec.send_qty = Util.checkString(rset0.getString("send_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_1030_LDataSet ds = (IS_AGR_1030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_1030_LCURLISTRecord curlistRec = (IS_AGR_1030_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.a_dlco_clsf_cd_seq%>
<%= curlistRec.a_dlco_abrv_nm%>
<%= curlistRec.a_dlco_nm%>
<%= curlistRec.a_asnt_dstc_cd%>
<%= curlistRec.a_asnt_dstc_cd_nm%>
<%= curlistRec.send_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 11 21:44:53 KST 2012 */