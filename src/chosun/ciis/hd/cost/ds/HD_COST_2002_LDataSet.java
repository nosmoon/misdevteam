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


package chosun.ciis.hd.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_2002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_COST_2002_LDataSet(){}
	public HD_COST_2002_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_COST_2002_LCURLISTRecord rec = new HD_COST_2002_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.subj_sel_dt = Util.checkString(rset0.getString("subj_sel_dt"));
			rec.subj_sel_nm = Util.checkString(rset0.getString("subj_sel_nm"));
			rec.item_seq = Util.checkString(rset0.getString("item_seq"));
			rec.cmr_man_nm = Util.checkString(rset0.getString("cmr_man_nm"));
			rec.cmr_asst_man_nm = Util.checkString(rset0.getString("cmr_asst_man_nm"));
			rec.drvr_nm = Util.checkString(rset0.getString("drvr_nm"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			rec.tot_nops = Util.checkString(rset0.getString("tot_nops"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.proc_amt = Util.checkString(rset0.getString("proc_amt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COST_2002_LDataSet ds = (HD_COST_2002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_COST_2002_LCURLISTRecord curlistRec = (HD_COST_2002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.subj_sel_dt%>
<%= curlistRec.subj_sel_nm%>
<%= curlistRec.item_seq%>
<%= curlistRec.cmr_man_nm%>
<%= curlistRec.cmr_asst_man_nm%>
<%= curlistRec.drvr_nm%>
<%= curlistRec.etc%>
<%= curlistRec.tot_nops%>
<%= curlistRec.tot_amt%>
<%= curlistRec.proc_amt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 23 16:04:53 KST 2012 */