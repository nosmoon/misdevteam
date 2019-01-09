/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 *
 */

public class HD_VACA_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_1201_LDataSet(){}
	public HD_VACA_1201_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_VACA_1201_LCURLISTRecord rec = new HD_VACA_1201_LCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_VACA_1201_LCURLIST1Record rec = new HD_VACA_1201_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.dty_cd = Util.checkString(rset1.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset1.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset1.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset1.getString("posi_nm"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.emp_clsf_cd = Util.checkString(rset1.getString("emp_clsf_cd"));
			rec.emp_clsf_nm = Util.checkString(rset1.getString("emp_clsf_nm"));
			rec.emp_dtls_clsf = Util.checkString(rset1.getString("emp_dtls_clsf"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset1.getString("emp_dtls_clsf_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			HD_VACA_1201_LCURLIST2Record rec = new HD_VACA_1201_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.clndr_dt = Util.checkString(rset2.getString("clndr_dt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1201_LDataSet ds = (HD_VACA_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1201_LCURLISTRecord curlistRec = (HD_VACA_1201_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_VACA_1201_LCURLIST1Record curlist1Rec = (HD_VACA_1201_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_VACA_1201_LCURLIST2Record curlist2Rec = (HD_VACA_1201_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.dty_cd%>
<%= curlist1Rec.dty_nm%>
<%= curlist1Rec.posi_cd%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.emp_clsf_cd%>
<%= curlist1Rec.emp_clsf_nm%>
<%= curlist1Rec.emp_dtls_clsf%>
<%= curlist1Rec.emp_dtls_clsf_nm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.clndr_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 16 21:05:18 KST 2009 */