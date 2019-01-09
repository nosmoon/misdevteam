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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_5021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_5021_LDataSet(){}
	public FC_FUNC_5021_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_FUNC_5021_LCURLISTRecord rec = new FC_FUNC_5021_LCURLISTRecord();
			rec.bhgbcdnm = Util.checkString(rset0.getString("bhgbcdnm"));
			rec.bhnonm = Util.checkString(rset0.getString("bhnonm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.bhcompcdnm = Util.checkString(rset0.getString("bhcompcdnm"));
			rec.bhusebuseocdnm = Util.checkString(rset0.getString("bhusebuseocdnm"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.bhbijanamt = Util.checkString(rset0.getString("bhbijanamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_5021_LDataSet ds = (FC_FUNC_5021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_5021_LCURLISTRecord curlistRec = (FC_FUNC_5021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bhgbcdnm%>
<%= curlistRec.bhnonm%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.bhcompcdnm%>
<%= curlistRec.bhusebuseocdnm%>
<%= curlistRec.won_amt%>
<%= curlistRec.cost_gain_stot%>
<%= curlistRec.bhbijanamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 11:18:53 KST 2009 */