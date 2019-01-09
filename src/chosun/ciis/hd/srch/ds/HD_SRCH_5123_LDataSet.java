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


public class HD_SRCH_5123_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String text_tag;
	public String head_clsf_01_02;
	public String grid_title;

	public HD_SRCH_5123_LDataSet(){}
	public HD_SRCH_5123_LDataSet(String errcode, String errmsg, String text_tag, String head_clsf_01_02, String grid_title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.text_tag = text_tag;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.grid_title = grid_title;
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

	public void setGrid_title(String grid_title){
		this.grid_title = grid_title;
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

	public String getGrid_title(){
		return this.grid_title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5123_LCURLIST1Record rec = new HD_SRCH_5123_LCURLIST1Record();
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.dept_nops1 = Util.checkString(rset0.getString("dept_nops1"));
			rec.dept_nops2 = Util.checkString(rset0.getString("dept_nops2"));
			rec.dept_nops3 = Util.checkString(rset0.getString("dept_nops3"));
			rec.dept_nops4 = Util.checkString(rset0.getString("dept_nops4"));
			rec.dept_nops5 = Util.checkString(rset0.getString("dept_nops5"));
			rec.dept_nops6 = Util.checkString(rset0.getString("dept_nops6"));
			rec.dept_nops7 = Util.checkString(rset0.getString("dept_nops7"));
			rec.dept_nops8 = Util.checkString(rset0.getString("dept_nops8"));
			rec.dept_nops9 = Util.checkString(rset0.getString("dept_nops9"));
			rec.dept_nops10 = Util.checkString(rset0.getString("dept_nops10"));
			rec.sum_nops = Util.checkString(rset0.getString("sum_nops"));
			rec.ratio_nops = Util.checkString(rset0.getString("ratio_nops"));
			this.curlist1.add(rec);
		}
		this.text_tag = Util.checkString(cstmt.getString(6));
		this.head_clsf_01_02 = Util.checkString(cstmt.getString(7));
		this.grid_title = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5123_LDataSet ds = (HD_SRCH_5123_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5123_LCURLIST1Record curlist1Rec = (HD_SRCH_5123_LCURLIST1Record)ds.curlist1.get(i);%>
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
<%= ds.getGrid_title()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.emp_clsf%>
<%= curlist1Rec.dept_nops1%>
<%= curlist1Rec.dept_nops2%>
<%= curlist1Rec.dept_nops3%>
<%= curlist1Rec.dept_nops4%>
<%= curlist1Rec.dept_nops5%>
<%= curlist1Rec.dept_nops6%>
<%= curlist1Rec.dept_nops7%>
<%= curlist1Rec.dept_nops8%>
<%= curlist1Rec.dept_nops9%>
<%= curlist1Rec.dept_nops10%>
<%= curlist1Rec.sum_nops%>
<%= curlist1Rec.ratio_nops%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 27 18:32:48 KST 2018 */