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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5323_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tag1;

	public HD_SRCH_5323_LDataSet(){}
	public HD_SRCH_5323_LDataSet(String errcode, String errmsg, String tag1){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tag1 = tag1;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTag1(String tag1){
		this.tag1 = tag1;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTag1(){
		return this.tag1;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			HD_SRCH_5323_LCURLIST1Record rec = new HD_SRCH_5323_LCURLIST1Record();
			rec.clsf1 = Util.checkString(rset1.getString("clsf1"));
			rec.clsf2 = Util.checkString(rset1.getString("clsf2"));
			rec.emp_clsf1 = Util.checkString(rset1.getString("emp_clsf1"));
			rec.emp_clsf2 = Util.checkString(rset1.getString("emp_clsf2"));
			rec.emp_clsf3 = Util.checkString(rset1.getString("emp_clsf3"));
			rec.emp_clsf4 = Util.checkString(rset1.getString("emp_clsf4"));
			rec.tot_stot = Util.checkString(rset1.getString("tot_stot"));
			this.curlist1.add(rec);
		}
		this.tag1 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5323_LDataSet ds = (HD_SRCH_5323_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5323_LCURLIST1Record curlist1Rec = (HD_SRCH_5323_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getTag1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.clsf1%>
<%= curlist1Rec.clsf2%>
<%= curlist1Rec.emp_clsf1%>
<%= curlist1Rec.emp_clsf2%>
<%= curlist1Rec.emp_clsf3%>
<%= curlist1Rec.emp_clsf4%>
<%= curlist1Rec.tot_stot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 26 10:52:53 KST 2018 */