/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2700_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2700_LDataSet(){}
	public HD_LVCMPY_2700_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_2700_LCURLISTRecord rec = new HD_LVCMPY_2700_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.real_pay_saly = Util.checkString(rset0.getString("real_pay_saly"));
			rec.no01 = Util.checkString(rset0.getString("no01"));
			rec.no02 = Util.checkString(rset0.getString("no02"));
			rec.no03 = Util.checkString(rset0.getString("no03"));
			rec.no04 = Util.checkString(rset0.getString("no04"));
			rec.no05 = Util.checkString(rset0.getString("no05"));
			rec.no06 = Util.checkString(rset0.getString("no06"));
			rec.no1 = Util.checkString(rset0.getString("no1"));
			rec.no2 = Util.checkString(rset0.getString("no2"));
			rec.no3 = Util.checkString(rset0.getString("no3"));
			rec.no5 = Util.checkString(rset0.getString("no5"));
			rec.no7 = Util.checkString(rset0.getString("no7"));
			rec.no8 = Util.checkString(rset0.getString("no8"));
			rec.no9 = Util.checkString(rset0.getString("no9"));
			rec.no10 = Util.checkString(rset0.getString("no10"));
			rec.no11 = Util.checkString(rset0.getString("no11"));
			rec.real_pay_lvcmpy_saly = Util.checkString(rset0.getString("real_pay_lvcmpy_saly"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_LVCMPY_2700_LCURLIST1Record rec = new HD_LVCMPY_2700_LCURLIST1Record();
			rec.in_slip_occr_dt = Util.checkString(rset1.getString("in_slip_occr_dt"));
			rec.in_slip_seq = Util.checkString(rset1.getString("in_slip_seq"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_2700_LDataSet ds = (HD_LVCMPY_2700_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_2700_LCURLISTRecord curlistRec = (HD_LVCMPY_2700_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_LVCMPY_2700_LCURLIST1Record curlist1Rec = (HD_LVCMPY_2700_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.dept_nm%>
<%= curlistRec.real_pay_saly%>
<%= curlistRec.no01%>
<%= curlistRec.no02%>
<%= curlistRec.no03%>
<%= curlistRec.no04%>
<%= curlistRec.no05%>
<%= curlistRec.no06%>
<%= curlistRec.no1%>
<%= curlistRec.no2%>
<%= curlistRec.no3%>
<%= curlistRec.no5%>
<%= curlistRec.no7%>
<%= curlistRec.no8%>
<%= curlistRec.no9%>
<%= curlistRec.no10%>
<%= curlistRec.no11%>
<%= curlistRec.real_pay_lvcmpy_saly%>
<%= curlist1Rec.in_slip_occr_dt%>
<%= curlist1Rec.in_slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 08 14:21:57 KST 2011 */