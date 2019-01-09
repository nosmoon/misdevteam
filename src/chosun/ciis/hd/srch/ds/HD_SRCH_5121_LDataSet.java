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


public class HD_SRCH_5121_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_title;
	public String xx_cnt;

	public HD_SRCH_5121_LDataSet(){}
	public HD_SRCH_5121_LDataSet(String errcode, String errmsg, String xx_title, String xx_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_title = xx_title;
		this.xx_cnt = xx_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_title(String xx_title){
		this.xx_title = xx_title;
	}

	public void setXx_cnt(String xx_cnt){
		this.xx_cnt = xx_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_title(){
		return this.xx_title;
	}

	public String getXx_cnt(){
		return this.xx_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5121_LCURLISTRecord rec = new HD_SRCH_5121_LCURLISTRecord();
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
			this.curlist.add(rec);
		}
		this.xx_title = Util.checkString(cstmt.getString(6));
		this.xx_cnt = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5121_LDataSet ds = (HD_SRCH_5121_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_5121_LCURLISTRecord curlistRec = (HD_SRCH_5121_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_title()%>
<%= ds.getXx_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.emp_clsf%>
<%= curlistRec.dept_nops1%>
<%= curlistRec.dept_nops2%>
<%= curlistRec.dept_nops3%>
<%= curlistRec.dept_nops4%>
<%= curlistRec.dept_nops5%>
<%= curlistRec.dept_nops6%>
<%= curlistRec.dept_nops7%>
<%= curlistRec.dept_nops8%>
<%= curlistRec.dept_nops9%>
<%= curlistRec.dept_nops10%>
<%= curlistRec.sum_nops%>
<%= curlistRec.ratio_nops%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 29 18:19:39 KST 2018 */