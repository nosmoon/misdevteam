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


public class FC_ACCT_2582_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2582_SDataSet(){}
	public FC_ACCT_2582_SDataSet(String errcode, String errmsg){
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
			FC_ACCT_2582_SCURLIST1Record rec = new FC_ACCT_2582_SCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.vipasetdebt_incmg_dt1 = Util.checkString(rset0.getString("vipasetdebt_incmg_dt1"));
			rec.vipasetdebt_incmg_dt2 = Util.checkString(rset0.getString("vipasetdebt_incmg_dt2"));
			rec.ddbal_incmg_dt1 = Util.checkString(rset0.getString("ddbal_incmg_dt1"));
			rec.ddbal_incmg_dt2 = Util.checkString(rset0.getString("ddbal_incmg_dt2"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2582_SDataSet ds = (FC_ACCT_2582_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2582_SCURLIST1Record curlist1Rec = (FC_ACCT_2582_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.incmg_dt%>
<%= curlist1Rec.vipasetdebt_incmg_dt1%>
<%= curlist1Rec.vipasetdebt_incmg_dt2%>
<%= curlist1Rec.ddbal_incmg_dt1%>
<%= curlist1Rec.ddbal_incmg_dt2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 16:06:45 KST 2009 */