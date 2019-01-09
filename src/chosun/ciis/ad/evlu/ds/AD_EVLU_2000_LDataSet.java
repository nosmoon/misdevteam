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


package chosun.ciis.ad.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EVLU_2000_LDataSet(){}
	public AD_EVLU_2000_LDataSet(String errcode, String errmsg){
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
			AD_EVLU_2000_LCURLISTRecord rec = new AD_EVLU_2000_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_nm = Util.checkString(rset0.getString("emp_nm"));
			rec.rank_1 = Util.checkString(rset0.getString("rank_1"));
			rec.scor_1 = Util.checkString(rset0.getString("scor_1"));
			rec.rank_2 = Util.checkString(rset0.getString("rank_2"));
			rec.scor_2 = Util.checkString(rset0.getString("scor_2"));
			rec.rank_3 = Util.checkString(rset0.getString("rank_3"));
			rec.scor_3 = Util.checkString(rset0.getString("scor_3"));
			rec.rank_4 = Util.checkString(rset0.getString("rank_4"));
			rec.scor_4 = Util.checkString(rset0.getString("scor_4"));
			rec.rank_5 = Util.checkString(rset0.getString("rank_5"));
			rec.scor_5 = Util.checkString(rset0.getString("scor_5"));
			rec.rank_6 = Util.checkString(rset0.getString("rank_6"));
			rec.scor_6 = Util.checkString(rset0.getString("scor_6"));
			rec.rank_7 = Util.checkString(rset0.getString("rank_7"));
			rec.scor_7 = Util.checkString(rset0.getString("scor_7"));
			rec.rank_8 = Util.checkString(rset0.getString("rank_8"));
			rec.scor_8 = Util.checkString(rset0.getString("scor_8"));
			rec.rank_9 = Util.checkString(rset0.getString("rank_9"));
			rec.scor_9 = Util.checkString(rset0.getString("scor_9"));
			rec.rank_10 = Util.checkString(rset0.getString("rank_10"));
			rec.scor_10 = Util.checkString(rset0.getString("scor_10"));
			rec.rank_11 = Util.checkString(rset0.getString("rank_11"));
			rec.scor_11 = Util.checkString(rset0.getString("scor_11"));
			rec.rank_12 = Util.checkString(rset0.getString("rank_12"));
			rec.scor_12 = Util.checkString(rset0.getString("scor_12"));
			rec.tot_rank = Util.checkString(rset0.getString("tot_rank"));
			rec.tot_sum = Util.checkString(rset0.getString("tot_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_EVLU_2000_LDataSet ds = (AD_EVLU_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EVLU_2000_LCURLISTRecord curlistRec = (AD_EVLU_2000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_nm%>
<%= curlistRec.rank_1%>
<%= curlistRec.scor_1%>
<%= curlistRec.rank_2%>
<%= curlistRec.scor_2%>
<%= curlistRec.rank_3%>
<%= curlistRec.scor_3%>
<%= curlistRec.rank_4%>
<%= curlistRec.scor_4%>
<%= curlistRec.rank_5%>
<%= curlistRec.scor_5%>
<%= curlistRec.rank_6%>
<%= curlistRec.scor_6%>
<%= curlistRec.rank_7%>
<%= curlistRec.scor_7%>
<%= curlistRec.rank_8%>
<%= curlistRec.scor_8%>
<%= curlistRec.rank_9%>
<%= curlistRec.scor_9%>
<%= curlistRec.rank_10%>
<%= curlistRec.scor_10%>
<%= curlistRec.rank_11%>
<%= curlistRec.scor_11%>
<%= curlistRec.rank_12%>
<%= curlistRec.scor_12%>
<%= curlistRec.tot_rank%>
<%= curlistRec.tot_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 18:22:02 KST 2010 */