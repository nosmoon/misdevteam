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


public class HD_INFO_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1110_LDataSet(){}
	public HD_INFO_1110_LDataSet(String errcode, String errmsg){
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
			HD_INFO_1110_LCURLIST1Record rec = new HD_INFO_1110_LCURLIST1Record();
			rec.main_insp_ocom = Util.checkString(rset0.getString("main_insp_ocom"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.main_insp_dt = Util.checkString(rset0.getString("main_insp_dt"));
			rec.prz_pnsh_nm = Util.checkString(rset0.getString("prz_pnsh_nm"));
			rec.prz_grad = Util.checkString(rset0.getString("prz_grad"));
			rec.prz_resn_nm = Util.checkString(rset0.getString("prz_resn_nm"));
			rec.case_nm = Util.checkString(rset0.getString("case_nm"));
			rec.atic_pubc_dt = Util.checkString(rset0.getString("atic_pubc_dt"));
			rec.atic_pubc_side = Util.checkString(rset0.getString("atic_pubc_side"));
			rec.prz_amt = Util.checkString(rset0.getString("prz_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_INFO_1110_LCURLIST2Record rec = new HD_INFO_1110_LCURLIST2Record();
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset1.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset1.getString("posi_nm"));
			rec.prz_dt = Util.checkString(rset1.getString("prz_dt"));
			rec.prz_nm = Util.checkString(rset1.getString("prz_nm"));
			rec.prz_resn = Util.checkString(rset1.getString("prz_resn"));
			rec.prz_amt = Util.checkString(rset1.getString("prz_amt"));
			rec.prz_ptcr = Util.checkString(rset1.getString("prz_ptcr"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1110_LDataSet ds = (HD_INFO_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_1110_LCURLIST1Record curlist1Rec = (HD_INFO_1110_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INFO_1110_LCURLIST2Record curlist2Rec = (HD_INFO_1110_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.main_insp_ocom%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.dty_nm%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.main_insp_dt%>
<%= curlist1Rec.prz_pnsh_nm%>
<%= curlist1Rec.prz_grad%>
<%= curlist1Rec.prz_resn_nm%>
<%= curlist1Rec.case_nm%>
<%= curlist1Rec.atic_pubc_dt%>
<%= curlist1Rec.atic_pubc_side%>
<%= curlist1Rec.prz_amt%>
<%= curlist2Rec.dept_nm%>
<%= curlist2Rec.dty_nm%>
<%= curlist2Rec.posi_nm%>
<%= curlist2Rec.prz_dt%>
<%= curlist2Rec.prz_nm%>
<%= curlist2Rec.prz_resn%>
<%= curlist2Rec.prz_amt%>
<%= curlist2Rec.prz_ptcr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 10:37:22 KST 2009 */