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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_7001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_7001_LDataSet(){}
	public PR_PRTEXEC_7001_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PR_PRTEXEC_7001_LCURLISTRecord rec = new PR_PRTEXEC_7001_LCURLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.edt_nm = Util.checkString(rset0.getString("edt_nm"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.advt_clr_pcnt = Util.checkString(rset0.getString("advt_clr_pcnt"));
			rec.prv_side_advt_clr_pcnt = Util.checkString(rset0.getString("prv_side_advt_clr_pcnt"));
			rec.atic_clr_pcnt = Util.checkString(rset0.getString("atic_clr_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.prv_side_advt_bw_pcnt = Util.checkString(rset0.getString("prv_side_advt_bw_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.wht_pj_qty = Util.checkString(rset0.getString("wht_pj_qty"));
			rec.blk_pj_qty = Util.checkString(rset0.getString("blk_pj_qty"));
			rec.sect_cnt = Util.checkString(rset0.getString("sect_cnt"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.sect_pcnt = Util.checkString(rset0.getString("sect_pcnt"));
			rec.sect_clr_pcnt = Util.checkString(rset0.getString("sect_clr_pcnt"));
			rec.sect_bw_pcnt = Util.checkString(rset0.getString("sect_bw_pcnt"));
			rec.advt_bw_pcnt = Util.checkString(rset0.getString("advt_bw_pcnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_7001_LDataSet ds = (PR_PRTEXEC_7001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_7001_LCURLISTRecord curlistRec = (PR_PRTEXEC_7001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.gubun%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.edt_nm%>
<%= curlistRec.ecnt%>
<%= curlistRec.prt_dt%>
<%= curlistRec.advt_clr_pcnt%>
<%= curlistRec.prv_side_advt_clr_pcnt%>
<%= curlistRec.atic_clr_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.prv_side_advt_bw_pcnt%>
<%= curlistRec.bw_pcnt%>
<%= curlistRec.wht_pj_qty%>
<%= curlistRec.blk_pj_qty%>
<%= curlistRec.sect_cnt%>
<%= curlistRec.sect_nm%>
<%= curlistRec.sect_pcnt%>
<%= curlistRec.sect_clr_pcnt%>
<%= curlistRec.sect_bw_pcnt%>
<%= curlistRec.advt_bw_pcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 09 14:57:07 KST 2009 */