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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_2000_LDataSet(){}
	public PR_PAPMAKE_2000_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_2000_LCURLISTRecord rec = new PR_PAPMAKE_2000_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.dept_clsf = Util.checkString(rset0.getString("dept_clsf"));
			rec.mang_nops = Util.checkString(rset0.getString("mang_nops"));
			rec.prt_nops = Util.checkString(rset0.getString("prt_nops"));
			rec.prt_board_nops = Util.checkString(rset0.getString("prt_board_nops"));
			rec.repa_nops = Util.checkString(rset0.getString("repa_nops"));
			rec.nwsp_high_nops = Util.checkString(rset0.getString("nwsp_high_nops"));
			rec.send_nops = Util.checkString(rset0.getString("send_nops"));
			rec.cmpos_nops = Util.checkString(rset0.getString("cmpos_nops"));
			rec.mony_trad_nops = Util.checkString(rset0.getString("mony_trad_nops"));
			rec.edt_side_nops = Util.checkString(rset0.getString("edt_side_nops"));
			rec.advt_incmg_nops = Util.checkString(rset0.getString("advt_incmg_nops"));
			rec.ofcr_nops = Util.checkString(rset0.getString("ofcr_nops"));
			rec.gen_affr_nops = Util.checkString(rset0.getString("gen_affr_nops"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.ref_matt = Util.checkString(rset0.getString("ref_matt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_2000_LDataSet ds = (PR_PAPMAKE_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_2000_LCURLISTRecord curlistRec = (PR_PAPMAKE_2000_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.yymm%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.dept_clsf%>
<%= curlistRec.mang_nops%>
<%= curlistRec.prt_nops%>
<%= curlistRec.prt_board_nops%>
<%= curlistRec.repa_nops%>
<%= curlistRec.nwsp_high_nops%>
<%= curlistRec.send_nops%>
<%= curlistRec.cmpos_nops%>
<%= curlistRec.mony_trad_nops%>
<%= curlistRec.edt_side_nops%>
<%= curlistRec.advt_incmg_nops%>
<%= curlistRec.ofcr_nops%>
<%= curlistRec.gen_affr_nops%>
<%= curlistRec.remk%>
<%= curlistRec.seq%>
<%= curlistRec.ref_matt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 15:20:05 KST 2009 */