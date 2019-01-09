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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String evlu_excl_dd;
	public String evlu_excl_daycnt;
	public String membcnt_rate;

	public HD_EVLU_2301_LDataSet(){}
	public HD_EVLU_2301_LDataSet(String errcode, String errmsg, String evlu_excl_dd, String evlu_excl_daycnt, String membcnt_rate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.evlu_excl_dd = evlu_excl_dd;
		this.evlu_excl_daycnt = evlu_excl_daycnt;
		this.membcnt_rate = membcnt_rate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setEvlu_excl_dd(String evlu_excl_dd){
		this.evlu_excl_dd = evlu_excl_dd;
	}

	public void setEvlu_excl_daycnt(String evlu_excl_daycnt){
		this.evlu_excl_daycnt = evlu_excl_daycnt;
	}

	public void setMembcnt_rate(String membcnt_rate){
		this.membcnt_rate = membcnt_rate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getEvlu_excl_dd(){
		return this.evlu_excl_dd;
	}

	public String getEvlu_excl_daycnt(){
		return this.evlu_excl_daycnt;
	}

	public String getMembcnt_rate(){
		return this.membcnt_rate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.evlu_excl_dd = Util.checkString(cstmt.getString(6));
		this.evlu_excl_daycnt = Util.checkString(cstmt.getString(7));
		this.membcnt_rate = Util.checkString(cstmt.getString(8));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_EVLU_2301_LCURLISTRecord rec = new HD_EVLU_2301_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.fee_duty_dd = Util.checkString(rset0.getString("fee_duty_dd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			rec.ictry_dspch = Util.checkString(rset0.getString("ictry_dspch"));
			rec.forn_dspch = Util.checkString(rset0.getString("forn_dspch"));
			rec.ictry_stdy = Util.checkString(rset0.getString("ictry_stdy"));
			rec.forn_stdy = Util.checkString(rset0.getString("forn_stdy"));
			rec.temp_duty = Util.checkString(rset0.getString("temp_duty"));
			rec.susp_duty = Util.checkString(rset0.getString("susp_duty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2301_LDataSet ds = (HD_EVLU_2301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2301_LCURLISTRecord curlistRec = (HD_EVLU_2301_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEvlu_excl_dd()%>
<%= ds.getEvlu_excl_daycnt()%>
<%= ds.getMembcnt_rate()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.fee_duty_dd%>
<%= curlistRec.remk%>
<%= curlistRec.dept_cd%>
<%= curlistRec.db_status%>
<%= curlistRec.ictry_dspch%>
<%= curlistRec.forn_dspch%>
<%= curlistRec.ictry_stdy%>
<%= curlistRec.forn_stdy%>
<%= curlistRec.temp_duty%>
<%= curlistRec.susp_duty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 18 10:47:33 KST 2014 */