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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1141_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_1141_LDataSet(){}
	public MT_SUBMATRCLA_1141_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			MT_SUBMATRCLA_1141_LCURLISTRecord rec = new MT_SUBMATRCLA_1141_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.clam_qunt = Util.checkString(rset0.getString("clam_qunt"));
			rec.fix_qunt = Util.checkString(rset0.getString("fix_qunt"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.clam_actu_cd = Util.checkString(rset0.getString("clam_actu_cd"));
			rec.res_yn = Util.checkString(rset0.getString("res_yn"));
			rec.acpn_dt = Util.checkString(rset0.getString("acpn_dt"));
			rec.via_dept_cnfm_yn = Util.checkString(rset0.getString("via_dept_cnfm_yn"));
			rec.job_cntc_no = Util.checkString(rset0.getString("job_cntc_no"));
			rec.buy_proc_stat = Util.checkString(rset0.getString("buy_proc_stat"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRCLA_1141_LDataSet ds = (MT_SUBMATRCLA_1141_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_1141_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_1141_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.item_nm%>
<%= curlistRec.std%>
<%= curlistRec.uprc%>
<%= curlistRec.clam_qunt%>
<%= curlistRec.fix_qunt%>
<%= curlistRec.unit%>
<%= curlistRec.amt%>
<%= curlistRec.usag%>
<%= curlistRec.dept_cd%>
<%= curlistRec.clam_actu_cd%>
<%= curlistRec.res_yn%>
<%= curlistRec.acpn_dt%>
<%= curlistRec.via_dept_cnfm_yn%>
<%= curlistRec.job_cntc_no%>
<%= curlistRec.buy_proc_stat%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 15 19:00:21 KST 2009 */