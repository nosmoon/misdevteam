/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_LVCMPY_1004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_1004_LDataSet(){}
	public HD_LVCMPY_1004_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_LVCMPY_1004_LCURLISTRecord rec = new HD_LVCMPY_1004_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.saly_pay_mm = Util.checkString(rset0.getString("saly_pay_mm"));
			rec.sum_saly1 = Util.checkString(rset0.getString("sum_saly1"));
			rec.sum_alon1 = Util.checkString(rset0.getString("sum_alon1"));
			rec.dty_acty_fee1 = Util.checkString(rset0.getString("dty_acty_fee1"));
			rec.sum_saly2 = Util.checkString(rset0.getString("sum_saly2"));
			rec.sum_alon2 = Util.checkString(rset0.getString("sum_alon2"));
			rec.dty_acty_fee2 = Util.checkString(rset0.getString("dty_acty_fee2"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_LVCMPY_1004_LCURLIST2Record rec = new HD_LVCMPY_1004_LCURLIST2Record();
			rec.cnt = Util.checkString(rset1.getString("cnt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			HD_LVCMPY_1004_LCURLIST3Record rec = new HD_LVCMPY_1004_LCURLIST3Record();
			rec.cnt = Util.checkString(rset2.getString("cnt"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_1004_LDataSet ds = (HD_LVCMPY_1004_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_1004_LCURLISTRecord curlistRec = (HD_LVCMPY_1004_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_LVCMPY_1004_LCURLIST2Record curlist2Rec = (HD_LVCMPY_1004_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_LVCMPY_1004_LCURLIST3Record curlist3Rec = (HD_LVCMPY_1004_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.saly_pay_mm%>
<%= curlistRec.sum_saly1%>
<%= curlistRec.sum_alon1%>
<%= curlistRec.dty_acty_fee1%>
<%= curlistRec.sum_saly2%>
<%= curlistRec.sum_alon2%>
<%= curlistRec.dty_acty_fee2%>
<%= curlist2Rec.cnt%>
<%= curlist3Rec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 30 17:18:23 KST 2017 */