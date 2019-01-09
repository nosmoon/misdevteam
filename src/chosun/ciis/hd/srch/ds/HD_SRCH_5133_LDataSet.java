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


public class HD_SRCH_5133_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String text_tag;
	public String head_clsf_01_02;

	public HD_SRCH_5133_LDataSet(){}
	public HD_SRCH_5133_LDataSet(String errcode, String errmsg, String text_tag, String head_clsf_01_02){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.text_tag = text_tag;
		this.head_clsf_01_02 = head_clsf_01_02;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setText_tag(String text_tag){
		this.text_tag = text_tag;
	}

	public void setHead_clsf_01_02(String head_clsf_01_02){
		this.head_clsf_01_02 = head_clsf_01_02;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getText_tag(){
		return this.text_tag;
	}

	public String getHead_clsf_01_02(){
		return this.head_clsf_01_02;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5133_LCURLIST1Record rec = new HD_SRCH_5133_LCURLIST1Record();
			rec.guk_nm = Util.checkString(rset0.getString("guk_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_clsf1 = Util.checkString(rset0.getString("emp_clsf1"));
			rec.emp_clsf2 = Util.checkString(rset0.getString("emp_clsf2"));
			rec.emp_clsf3 = Util.checkString(rset0.getString("emp_clsf3"));
			rec.emp_clsf4 = Util.checkString(rset0.getString("emp_clsf4"));
			rec.emp_cnt = Util.checkString(rset0.getString("emp_cnt"));
			rec.in_cmpy = Util.checkString(rset0.getString("in_cmpy"));
			rec.lvcmpy = Util.checkString(rset0.getString("lvcmpy"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		this.text_tag = Util.checkString(cstmt.getString(6));
		this.head_clsf_01_02 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5133_LDataSet ds = (HD_SRCH_5133_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5133_LCURLIST1Record curlist1Rec = (HD_SRCH_5133_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getText_tag()%>
<%= ds.getHead_clsf_01_02()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.guk_nm%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.emp_clsf1%>
<%= curlist1Rec.emp_clsf2%>
<%= curlist1Rec.emp_clsf3%>
<%= curlist1Rec.emp_clsf4%>
<%= curlist1Rec.emp_cnt%>
<%= curlist1Rec.in_cmpy%>
<%= curlist1Rec.lvcmpy%>
<%= curlist1Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 27 17:56:52 KST 2018 */