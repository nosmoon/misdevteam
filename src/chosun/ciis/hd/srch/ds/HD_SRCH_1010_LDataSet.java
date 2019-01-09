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


public class HD_SRCH_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1010_LDataSet(){}
	public HD_SRCH_1010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			HD_SRCH_1010_LCURLISTRecord rec = new HD_SRCH_1010_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.gender = Util.checkString(rset0.getString("gender"));
			rec.cur_job = Util.checkString(rset0.getString("cur_job"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset0.getString("emp_dtls_clsf_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.nm_engl = Util.checkString(rset0.getString("nm_engl"));
			rec.nm_chin = Util.checkString(rset0.getString("nm_chin"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.evngt_saly = Util.checkString(rset0.getString("evngt_saly"));
			rec.supl_saly = Util.checkString(rset0.getString("supl_saly"));
			rec.trff_alon = Util.checkString(rset0.getString("trff_alon"));
			rec.treat_add_amt = Util.checkString(rset0.getString("treat_add_amt"));
			rec.tot_saly = Util.checkString(rset0.getString("tot_saly"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.appmt_nm = Util.checkString(rset0.getString("appmt_nm"));
			rec.appmt_dt = Util.checkString(rset0.getString("appmt_dt"));
			rec.appmt_cont = Util.checkString(rset0.getString("appmt_cont"));
			rec.insd_dept_cd = Util.checkString(rset0.getString("insd_dept_cd"));
			rec.dty_order = Util.checkString(rset0.getString("dty_order"));
			rec.posi_order = Util.checkString(rset0.getString("posi_order"));
			rec.aprv_in_cmpy = Util.checkString(rset0.getString("aprv_in_cmpy"));
			rec.age = Util.checkString(rset0.getString("age"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1010_LDataSet ds = (HD_SRCH_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_1010_LCURLISTRecord curlistRec = (HD_SRCH_1010_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.cd_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.gender%>
<%= curlistRec.cur_job%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.emp_dtls_clsf_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.nm_engl%>
<%= curlistRec.nm_chin%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.evngt_saly%>
<%= curlistRec.supl_saly%>
<%= curlistRec.trff_alon%>
<%= curlistRec.treat_add_amt%>
<%= curlistRec.tot_saly%>
<%= curlistRec.prn%>
<%= curlistRec.appmt_nm%>
<%= curlistRec.appmt_dt%>
<%= curlistRec.appmt_cont%>
<%= curlistRec.insd_dept_cd%>
<%= curlistRec.dty_order%>
<%= curlistRec.posi_order%>
<%= curlistRec.aprv_in_cmpy%>
<%= curlistRec.age%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 06 18:02:51 KST 2013 */