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


public class PR_PAPMAKE_1007_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1007_LDataSet(){}
	public PR_PAPMAKE_1007_LDataSet(String errcode, String errmsg){
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
		ResultSet rset7 = (ResultSet) cstmt.getObject(6);
		while(rset7.next()){
			PR_PAPMAKE_1007_LCURLIST1Record rec = new PR_PAPMAKE_1007_LCURLIST1Record();
			rec.issu_dt = Util.checkString(rset7.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset7.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset7.getString("medi_nm"));
			rec.ecnt = Util.checkString(rset7.getString("ecnt"));
			rec.ledt_cd = Util.checkString(rset7.getString("ledt_cd"));
			rec.prt_seq = Util.checkString(rset7.getString("prt_seq"));
			rec.fld_no = Util.checkString(rset7.getString("fld_no"));
			rec.sect = Util.checkString(rset7.getString("sect"));
			rec.last_edt_page = Util.checkString(rset7.getString("last_edt_page"));
			rec.off_plat_tm = Util.checkString(rset7.getString("off_plat_tm"));
			rec.off_plat_end_tm = Util.checkString(rset7.getString("off_plat_end_tm"));
			rec.prt_ex_tm = Util.checkString(rset7.getString("prt_ex_tm"));
			rec.prt_end_tm = Util.checkString(rset7.getString("prt_end_tm"));
			rec.prt_qty = Util.checkString(rset7.getString("prt_qty"));
			rec.out_gate = Util.checkString(rset7.getString("out_gate"));
			rec.apcut_err = Util.checkString(rset7.getString("apcut_err"));
			rec.runcut_err = Util.checkString(rset7.getString("runcut_err"));
			this.curlist1.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(7);
		while(rset8.next()){
			PR_PAPMAKE_1007_LCURLIST2Record rec = new PR_PAPMAKE_1007_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset8.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset8.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset8.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset8.getString("sect_nm"));
			rec.pcnt = Util.checkString(rset8.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset8.getString("clr_pcnt"));
			rec.pj_qty = Util.checkString(rset8.getString("pj_qty"));
			rec.remk = Util.checkString(rset8.getString("remk"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_1007_LDataSet ds = (PR_PAPMAKE_1007_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_1007_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_1007_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PAPMAKE_1007_LCURLIST2Record curlist2Rec = (PR_PAPMAKE_1007_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.ecnt%>
<%= curlist1Rec.ledt_cd%>
<%= curlist1Rec.prt_seq%>
<%= curlist1Rec.fld_no%>
<%= curlist1Rec.sect%>
<%= curlist1Rec.last_edt_page%>
<%= curlist1Rec.off_plat_tm%>
<%= curlist1Rec.off_plat_end_tm%>
<%= curlist1Rec.prt_ex_tm%>
<%= curlist1Rec.prt_end_tm%>
<%= curlist1Rec.prt_qty%>
<%= curlist1Rec.out_gate%>
<%= curlist1Rec.apcut_err%>
<%= curlist1Rec.runcut_err%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.sect_nm%>
<%= curlist2Rec.pcnt%>
<%= curlist2Rec.clr_pcnt%>
<%= curlist2Rec.pj_qty%>
<%= curlist2Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 22:33:46 KST 2009 */