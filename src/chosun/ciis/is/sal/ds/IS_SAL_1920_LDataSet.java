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


package chosun.ciis.is.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1920_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SAL_1920_LDataSet(){}
	public IS_SAL_1920_LDataSet(String errcode, String errmsg){
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
			IS_SAL_1920_LCURLISTRecord rec = new IS_SAL_1920_LCURLISTRecord();
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.purc_clsf_nm = Util.checkString(rset0.getString("purc_clsf_nm"));
			rec.acwr_reg_dt_seq = Util.checkString(rset0.getString("acwr_reg_dt_seq"));
			rec.purc_dt = Util.checkString(rset0.getString("purc_dt"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.indt_cd_nm = Util.checkString(rset0.getString("indt_cd_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SAL_1920_LDataSet ds = (IS_SAL_1920_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SAL_1920_LCURLISTRecord curlistRec = (IS_SAL_1920_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.purc_amt%>
<%= curlistRec.purc_clsf_nm%>
<%= curlistRec.acwr_reg_dt_seq%>
<%= curlistRec.purc_dt%>
<%= curlistRec.advt_nm%>
<%= curlistRec.indt_cd_nm%>
<%= curlistRec.std_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 16 10:40:42 KST 2012 */