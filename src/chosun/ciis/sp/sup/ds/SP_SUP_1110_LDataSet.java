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


package chosun.ciis.sp.sup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SUP_1110_LDataSet(){}
	public SP_SUP_1110_LDataSet(String errcode, String errmsg){
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
			SP_SUP_1110_LCURLISTRecord rec = new SP_SUP_1110_LCURLISTRecord();
			rec.sort = Util.checkString(rset0.getString("sort"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.rslt_110 = Util.checkString(rset0.getString("rslt_110"));
			rec.rslt_111 = Util.checkString(rset0.getString("rslt_111"));
			rec.rslt_120 = Util.checkString(rset0.getString("rslt_120"));
			rec.rslt_121 = Util.checkString(rset0.getString("rslt_121"));
			rec.rslt_122 = Util.checkString(rset0.getString("rslt_122"));
			rec.rslt_130 = Util.checkString(rset0.getString("rslt_130"));
			rec.rslt_131 = Util.checkString(rset0.getString("rslt_131"));
			rec.rslt_132 = Util.checkString(rset0.getString("rslt_132"));
			rec.rslt_133 = Util.checkString(rset0.getString("rslt_133"));
			rec.rslt_134 = Util.checkString(rset0.getString("rslt_134"));
			rec.rslt_140 = Util.checkString(rset0.getString("rslt_140"));
			rec.rslt_141 = Util.checkString(rset0.getString("rslt_141"));
			rec.rslt_142 = Util.checkString(rset0.getString("rslt_142"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SUP_1110_LDataSet ds = (SP_SUP_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SUP_1110_LCURLISTRecord curlistRec = (SP_SUP_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sort%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.rslt_110%>
<%= curlistRec.rslt_111%>
<%= curlistRec.rslt_120%>
<%= curlistRec.rslt_121%>
<%= curlistRec.rslt_122%>
<%= curlistRec.rslt_130%>
<%= curlistRec.rslt_131%>
<%= curlistRec.rslt_132%>
<%= curlistRec.rslt_133%>
<%= curlistRec.rslt_134%>
<%= curlistRec.rslt_140%>
<%= curlistRec.rslt_141%>
<%= curlistRec.rslt_142%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 05 13:11:19 KST 2012 */