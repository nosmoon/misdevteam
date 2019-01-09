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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2220_LDataSet(){}
	public HD_AFFR_2220_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_2220_LCURLISTRecord rec = new HD_AFFR_2220_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.congr_condl_dt = Util.checkString(rset0.getString("congr_condl_dt"));
			rec.congr_condl_cd = Util.checkString(rset0.getString("congr_condl_cd"));
			rec.congr_condl_nm = Util.checkString(rset0.getString("congr_condl_nm"));
			rec.congr_condl_fee = Util.checkString(rset0.getString("congr_condl_fee"));
			rec.art_flower = Util.checkString(rset0.getString("art_flower"));
			rec.ofcr_congr_condl_fee = Util.checkString(rset0.getString("ofcr_congr_condl_fee"));
			rec.ofcr_art_flower = Util.checkString(rset0.getString("ofcr_art_flower"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2220_LDataSet ds = (HD_AFFR_2220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2220_LCURLISTRecord curlistRec = (HD_AFFR_2220_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.congr_condl_dt%>
<%= curlistRec.congr_condl_cd%>
<%= curlistRec.congr_condl_nm%>
<%= curlistRec.congr_condl_fee%>
<%= curlistRec.art_flower%>
<%= curlistRec.ofcr_congr_condl_fee%>
<%= curlistRec.ofcr_art_flower%>
<%= curlistRec.remk%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.proc_clsf%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 23 09:58:25 KST 2015 */