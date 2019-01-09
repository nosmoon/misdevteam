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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_8201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_SALY_8201_LDataSet(){}
	public HD_SALY_8201_LDataSet(String errcode, String errmsg, String msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.msg = msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMsg(){
		return this.msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.msg = Util.checkString(cstmt.getString(3));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_SALY_8201_LCURLISTRecord rec = new HD_SALY_8201_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.pymt_yy = Util.checkString(rset0.getString("pymt_yy"));
			rec.pymt_no = Util.checkString(rset0.getString("pymt_no"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.welf_pens_amt = Util.checkString(rset0.getString("welf_pens_amt"));
			rec.prsn_pens_amt = Util.checkString(rset0.getString("prsn_pens_amt"));
			rec.prsn_sppt_amt = Util.checkString(rset0.getString("prsn_sppt_amt"));
			rec.sepr_pens_amt = Util.checkString(rset0.getString("sepr_pens_amt"));
			rec.pymt_gubun = Util.checkString(rset0.getString("pymt_gubun"));
			rec.pymt_gubun_nm = Util.checkString(rset0.getString("pymt_gubun_nm"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_SALY_8201_LCURLIST2Record rec = new HD_SALY_8201_LCURLIST2Record();
			rec.sum_welf_pens_amt = Util.checkString(rset1.getString("sum_welf_pens_amt"));
			rec.sum_prsn_pens_amt = Util.checkString(rset1.getString("sum_prsn_pens_amt"));
			rec.subtotal_amt = Util.checkString(rset1.getString("subtotal_amt"));
			rec.sum_prsn_sppt_amt = Util.checkString(rset1.getString("sum_prsn_sppt_amt"));
			rec.sum_sepr_pens_amt = Util.checkString(rset1.getString("sum_sepr_pens_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_8201_LDataSet ds = (HD_SALY_8201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_8201_LCURLISTRecord curlistRec = (HD_SALY_8201_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_SALY_8201_LCURLIST2Record curlist2Rec = (HD_SALY_8201_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.pymt_yy%>
<%= curlistRec.pymt_no%>
<%= curlistRec.cd_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.flnm%>
<%= curlistRec.welf_pens_amt%>
<%= curlistRec.prsn_pens_amt%>
<%= curlistRec.prsn_sppt_amt%>
<%= curlistRec.sepr_pens_amt%>
<%= curlistRec.pymt_gubun%>
<%= curlistRec.pymt_gubun_nm%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.prn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlist2Rec.sum_welf_pens_amt%>
<%= curlist2Rec.sum_prsn_pens_amt%>
<%= curlist2Rec.subtotal_amt%>
<%= curlist2Rec.sum_prsn_sppt_amt%>
<%= curlist2Rec.sum_sepr_pens_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 07 11:32:29 KST 2017 */