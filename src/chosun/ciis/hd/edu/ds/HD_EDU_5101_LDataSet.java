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


package chosun.ciis.hd.edu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_5101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EDU_5101_LDataSet(){}
	public HD_EDU_5101_LDataSet(String errcode, String errmsg){
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
			HD_EDU_5101_LCURLISTRecord rec = new HD_EDU_5101_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.acpn_no = Util.checkString(rset0.getString("acpn_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.phon_num = Util.checkString(rset0.getString("phon_num"));
			rec.out_class_type = Util.checkString(rset0.getString("out_class_type"));
			rec.out_class_type_nm = Util.checkString(rset0.getString("out_class_type_nm"));
			rec.acty_type = Util.checkString(rset0.getString("acty_type"));
			rec.acty_type_nm = Util.checkString(rset0.getString("acty_type_nm"));
			rec.acty_etc = Util.checkString(rset0.getString("acty_etc"));
			rec.req_instt_nm = Util.checkString(rset0.getString("req_instt_nm"));
			rec.req_presi_nm = Util.checkString(rset0.getString("req_presi_nm"));
			rec.req_chrg_dept_nm = Util.checkString(rset0.getString("req_chrg_dept_nm"));
			rec.req_chrg_nm = Util.checkString(rset0.getString("req_chrg_nm"));
			rec.req_phon_nm = Util.checkString(rset0.getString("req_phon_nm"));
			rec.req_resn = Util.checkString(rset0.getString("req_resn"));
			rec.out_class_subj_nm = Util.checkString(rset0.getString("out_class_subj_nm"));
			rec.out_class_plac = Util.checkString(rset0.getString("out_class_plac"));
			rec.out_class_fr_dt = Util.checkString(rset0.getString("out_class_fr_dt"));
			rec.out_class_to_dt = Util.checkString(rset0.getString("out_class_to_dt"));
			rec.out_class_fr_tm = Util.checkString(rset0.getString("out_class_fr_tm"));
			rec.out_class_to_tm = Util.checkString(rset0.getString("out_class_to_tm"));
			rec.yy_avg_tms = Util.checkString(rset0.getString("yy_avg_tms"));
			rec.mm_avg_tms = Util.checkString(rset0.getString("mm_avg_tms"));
			rec.tms_avg_tm = Util.checkString(rset0.getString("tms_avg_tm"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.tms_avg_amt = Util.checkString(rset0.getString("tms_avg_amt"));
			rec.trff_stay_amt = Util.checkString(rset0.getString("trff_stay_amt"));
			rec.tms_avg_trff_stay_amt = Util.checkString(rset0.getString("tms_avg_trff_stay_amt"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EDU_5101_LDataSet ds = (HD_EDU_5101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EDU_5101_LCURLISTRecord curlistRec = (HD_EDU_5101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.acpn_no%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.phon_num%>
<%= curlistRec.out_class_type%>
<%= curlistRec.out_class_type_nm%>
<%= curlistRec.acty_type%>
<%= curlistRec.acty_type_nm%>
<%= curlistRec.acty_etc%>
<%= curlistRec.req_instt_nm%>
<%= curlistRec.req_presi_nm%>
<%= curlistRec.req_chrg_dept_nm%>
<%= curlistRec.req_chrg_nm%>
<%= curlistRec.req_phon_nm%>
<%= curlistRec.req_resn%>
<%= curlistRec.out_class_subj_nm%>
<%= curlistRec.out_class_plac%>
<%= curlistRec.out_class_fr_dt%>
<%= curlistRec.out_class_to_dt%>
<%= curlistRec.out_class_fr_tm%>
<%= curlistRec.out_class_to_tm%>
<%= curlistRec.yy_avg_tms%>
<%= curlistRec.mm_avg_tms%>
<%= curlistRec.tms_avg_tm%>
<%= curlistRec.tot_amt%>
<%= curlistRec.tms_avg_amt%>
<%= curlistRec.trff_stay_amt%>
<%= curlistRec.tms_avg_trff_stay_amt%>
<%= curlistRec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 29 17:04:20 KST 2016 */