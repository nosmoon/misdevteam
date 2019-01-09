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


package chosun.ciis.as.redm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.rec.*;

/**
 * 
 */


public class AS_REDM_1502_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_REDM_1502_LDataSet(){}
	public AS_REDM_1502_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_REDM_1502_LCURLISTRecord rec = new AS_REDM_1502_LCURLISTRecord();
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.aset_stat = Util.checkString(rset0.getString("aset_stat"));
			rec.aset_stat_nm = Util.checkString(rset0.getString("aset_stat_nm"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.sale_dt = Util.checkString(rset0.getString("sale_dt"));
			rec.redm_mthd_cd = Util.checkString(rset0.getString("redm_mthd_cd"));
			rec.redm_mthd_nm = Util.checkString(rset0.getString("redm_mthd_nm"));
			rec.svc_yys_cnt = Util.checkString(rset0.getString("svc_yys_cnt"));
			rec.redm_rate = Util.checkString(rset0.getString("redm_rate"));
			rec.cur_acqr_amt = Util.checkString(rset0.getString("cur_acqr_amt"));
			rec.pre_redm_agg_amt = Util.checkString(rset0.getString("pre_redm_agg_amt"));
			rec.tot_redm_amt = Util.checkString(rset0.getString("tot_redm_amt"));
			rec.um_redm_amt = Util.checkString(rset0.getString("um_redm_amt"));
			rec.cur_redm_agg_amt = Util.checkString(rset0.getString("cur_redm_agg_amt"));
			rec.thmm_redm_amt = Util.checkString(rset0.getString("thmm_redm_amt"));
			rec.redm_stat_cd = Util.checkString(rset0.getString("redm_stat_cd"));
			rec.redm_stat_nm = Util.checkString(rset0.getString("redm_stat_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.redm_dt = Util.checkString(rset0.getString("redm_dt"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.redm_yymm = Util.checkString(rset0.getString("redm_yymm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_REDM_1000_LDataSet ds = (AS_REDM_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_REDM_1000_LCURLISTRecord curlistRec = (AS_REDM_1000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.aset_stat%>
<%= curlistRec.aset_stat_nm%>
<%= curlistRec.acqr_dt%>
<%= curlistRec.sale_dt%>
<%= curlistRec.redm_mthd_cd%>
<%= curlistRec.redm_mthd_nm%>
<%= curlistRec.svc_yys_cnt%>
<%= curlistRec.redm_rate%>
<%= curlistRec.cur_acqr_amt%>
<%= curlistRec.pre_redm_agg_amt%>
<%= curlistRec.tot_redm_amt%>
<%= curlistRec.um_redm_amt%>
<%= curlistRec.cur_redm_agg_amt%>
<%= curlistRec.thmm_redm_amt%>
<%= curlistRec.redm_stat_cd%>
<%= curlistRec.redm_stat_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.redm_dt%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.redm_yymm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 16:32:49 KST 2009 */