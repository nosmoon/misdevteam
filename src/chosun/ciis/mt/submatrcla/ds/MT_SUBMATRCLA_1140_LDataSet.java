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


public class MT_SUBMATRCLA_1140_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_1140_LDataSet(){}
	public MT_SUBMATRCLA_1140_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(17);
		while(rset1.next()){
			MT_SUBMATRCLA_1140_LCURLISTRecord rec = new MT_SUBMATRCLA_1140_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.item_nm = Util.checkString(rset1.getString("item_nm"));
			rec.std = Util.checkString(rset1.getString("std"));
			rec.uprc = Util.checkString(rset1.getString("uprc"));
			rec.clam_qunt = Util.checkString(rset1.getString("clam_qunt"));
			rec.fix_qunt = Util.checkString(rset1.getString("fix_qunt"));
			rec.unit = Util.checkString(rset1.getString("unit"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.usag = Util.checkString(rset1.getString("usag"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.clam_actu_cd = Util.checkString(rset1.getString("clam_actu_cd"));
			rec.res_yn = Util.checkString(rset1.getString("res_yn"));
			rec.acpn_dt = Util.checkString(rset1.getString("acpn_dt"));
			rec.via_dept_cnfm_yn = Util.checkString(rset1.getString("via_dept_cnfm_yn"));
			rec.job_cntc_no = Util.checkString(rset1.getString("job_cntc_no"));
			rec.buy_proc_stat = Util.checkString(rset1.getString("buy_proc_stat"));
			rec.ern = Util.checkString(rset1.getString("ern"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.up_dept_cd = Util.checkString(rset1.getString("up_dept_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRCLA_1140_LDataSet ds = (MT_SUBMATRCLA_1140_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_1140_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_1140_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 15 19:00:21 KST 2009 */