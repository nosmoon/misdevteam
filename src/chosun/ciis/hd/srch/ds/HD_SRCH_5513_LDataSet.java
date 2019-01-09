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


public class HD_SRCH_5513_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tag1;

	public HD_SRCH_5513_LDataSet(){}
	public HD_SRCH_5513_LDataSet(String errcode, String errmsg, String tag1){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5513_LCURLIST1Record rec = new HD_SRCH_5513_LCURLIST1Record();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.human_resour_1 = Util.checkString(rset0.getString("human_resour_1"));
			rec.human_resour_2 = Util.checkString(rset0.getString("human_resour_2"));
			rec.tot_nops_cnt = Util.checkString(rset0.getString("tot_nops_cnt"));
			rec.emp_clsf_30_cnt = Util.checkString(rset0.getString("emp_clsf_30_cnt"));
			rec.emp_ratio = Util.checkString(rset0.getString("emp_ratio"));
			rec.emp_fml_cnt = Util.checkString(rset0.getString("emp_fml_cnt"));
			this.curlist1.add(rec);
		}
		this.tag1 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5513_LDataSet ds = (HD_SRCH_5513_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5513_LCURLIST1Record curlist1Rec = (HD_SRCH_5513_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.yymm%>
<%= curlist1Rec.human_resour_1%>
<%= curlist1Rec.human_resour_2%>
<%= curlist1Rec.tot_nops_cnt%>
<%= curlist1Rec.emp_clsf_30_cnt%>
<%= curlist1Rec.emp_ratio%>
<%= curlist1Rec.emp_fml_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 26 16:12:37 KST 2018 */