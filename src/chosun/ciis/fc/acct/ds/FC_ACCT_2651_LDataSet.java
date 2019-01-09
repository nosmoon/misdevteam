/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-연결합계잔액시산표  (연결합계잔액시산표 조회)
* 작성일자 : 2015.01.19
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2651_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2651_LDataSet(){}
	public FC_ACCT_2651_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2651_LCURLISTRecord rec = new FC_ACCT_2651_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cmpy_cd_nm = Util.checkString(rset0.getString("cmpy_cd_nm"));
			rec.sum_cbamt = Util.checkString(rset0.getString("sum_cbamt"));
			rec.jan_cbamt = Util.checkString(rset0.getString("jan_cbamt"));
			rec.insd_acct_cd = Util.checkString(rset0.getString("insd_acct_cd"));
			rec.acct_subj_nm = Util.checkString(rset0.getString("acct_subj_nm"));
			rec.slip_incmg_exne = Util.checkString(rset0.getString("slip_incmg_exne"));
			rec.acct_levl = Util.checkString(rset0.getString("acct_levl"));
			rec.jan_dbamt = Util.checkString(rset0.getString("jan_dbamt"));
			rec.sum_dbamt = Util.checkString(rset0.getString("sum_dbamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2651_LDataSet ds = (FC_ACCT_2651_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2651_LCURLISTRecord curlistRec = (FC_ACCT_2651_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.cmpy_cd_nm%>
<%= curlistRec.sum_cbamt%>
<%= curlistRec.jan_cbamt%>
<%= curlistRec.insd_acct_cd%>
<%= curlistRec.acct_subj_nm%>
<%= curlistRec.slip_incmg_exne%>
<%= curlistRec.acct_levl%>
<%= curlistRec.jan_dbamt%>
<%= curlistRec.sum_dbamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 19 14:46:52 KST 2015 */