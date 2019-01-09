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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5242_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_5242_LDataSet(){}
	public HD_INFO_5242_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_INFO_5242_LCURLISTRecord rec = new HD_INFO_5242_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.schir_seq = Util.checkString(rset0.getString("schir_seq"));
			rec.scl_clsf = Util.checkString(rset0.getString("scl_clsf"));
			rec.scl_cd = Util.checkString(rset0.getString("scl_cd"));
			rec.scl_nm = Util.checkString(rset0.getString("scl_nm"));
			rec.plcw_cd = Util.checkString(rset0.getString("plcw_cd"));
			rec.natn_cd = Util.checkString(rset0.getString("natn_cd"));
			rec.enty_dt = Util.checkString(rset0.getString("enty_dt"));
			rec.grdu_dt = Util.checkString(rset0.getString("grdu_dt"));
			rec.grdu_clsf = Util.checkString(rset0.getString("grdu_clsf"));
			rec.majr_clsf_1 = Util.checkString(rset0.getString("majr_clsf_1"));
			rec.majr_cd_1 = Util.checkString(rset0.getString("majr_cd_1"));
			rec.majr_nm_1 = Util.checkString(rset0.getString("majr_nm_1"));
			rec.majr_clsf_2 = Util.checkString(rset0.getString("majr_clsf_2"));
			rec.majr_cd_2 = Util.checkString(rset0.getString("majr_cd_2"));
			rec.majr_nm_2 = Util.checkString(rset0.getString("majr_nm_2"));
			rec.majr_clsf_3 = Util.checkString(rset0.getString("majr_clsf_3"));
			rec.majr_cd_3 = Util.checkString(rset0.getString("majr_cd_3"));
			rec.majr_nm_3 = Util.checkString(rset0.getString("majr_nm_3"));
			rec.sclgg_kind_cd = Util.checkString(rset0.getString("sclgg_kind_cd"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.scl_clsf_nm = Util.checkString(rset0.getString("scl_clsf_nm"));
			rec.plcw_nm = Util.checkString(rset0.getString("plcw_nm"));
			rec.natn_nm = Util.checkString(rset0.getString("natn_nm"));
			rec.grdu_clsf_nm = Util.checkString(rset0.getString("grdu_clsf_nm"));
			rec.majr_clsf_nm_1 = Util.checkString(rset0.getString("majr_clsf_nm_1"));
			rec.majr_clsf_nm_2 = Util.checkString(rset0.getString("majr_clsf_nm_2"));
			rec.majr_clsf_nm_3 = Util.checkString(rset0.getString("majr_clsf_nm_3"));
			rec.sclgg_kind_nm = Util.checkString(rset0.getString("sclgg_kind_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_5242_LDataSet ds = (HD_INFO_5242_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_5242_LCURLISTRecord curlistRec = (HD_INFO_5242_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.schir_seq%>
<%= curlistRec.scl_clsf%>
<%= curlistRec.scl_cd%>
<%= curlistRec.scl_nm%>
<%= curlistRec.plcw_cd%>
<%= curlistRec.natn_cd%>
<%= curlistRec.enty_dt%>
<%= curlistRec.grdu_dt%>
<%= curlistRec.grdu_clsf%>
<%= curlistRec.majr_clsf_1%>
<%= curlistRec.majr_cd_1%>
<%= curlistRec.majr_nm_1%>
<%= curlistRec.majr_clsf_2%>
<%= curlistRec.majr_cd_2%>
<%= curlistRec.majr_nm_2%>
<%= curlistRec.majr_clsf_3%>
<%= curlistRec.majr_cd_3%>
<%= curlistRec.majr_nm_3%>
<%= curlistRec.sclgg_kind_cd%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.scl_clsf_nm%>
<%= curlistRec.plcw_nm%>
<%= curlistRec.natn_nm%>
<%= curlistRec.grdu_clsf_nm%>
<%= curlistRec.majr_clsf_nm_1%>
<%= curlistRec.majr_clsf_nm_2%>
<%= curlistRec.majr_clsf_nm_3%>
<%= curlistRec.sclgg_kind_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 14:11:14 KST 2009 */