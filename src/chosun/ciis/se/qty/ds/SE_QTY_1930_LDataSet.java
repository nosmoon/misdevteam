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


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1930_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String closyn_cap;
	public String colcnt;
	public String title;
	public String medi_cd;
	public String editable_yn;
	public String regchk_yn;

	public SE_QTY_1930_LDataSet(){}
	public SE_QTY_1930_LDataSet(String errcode, String errmsg, String closyn_cap, String colcnt, String title, String medi_cd, String editable_yn, String regchk_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.closyn_cap = closyn_cap;
		this.colcnt = colcnt;
		this.title = title;
		this.medi_cd = medi_cd;
		this.editable_yn = editable_yn;
		this.regchk_yn = regchk_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClosyn_cap(String closyn_cap){
		this.closyn_cap = closyn_cap;
	}

	public void setColcnt(String colcnt){
		this.colcnt = colcnt;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setEditable_yn(String editable_yn){
		this.editable_yn = editable_yn;
	}

	public void setRegchk_yn(String regchk_yn){
		this.regchk_yn = regchk_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClosyn_cap(){
		return this.closyn_cap;
	}

	public String getColcnt(){
		return this.colcnt;
	}

	public String getTitle(){
		return this.title;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getEditable_yn(){
		return this.editable_yn;
	}

	public String getRegchk_yn(){
		return this.regchk_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.closyn_cap = Util.checkString(cstmt.getString(11));
		this.colcnt = Util.checkString(cstmt.getString(12));
		this.title = Util.checkString(cstmt.getString(13));
		this.medi_cd = Util.checkString(cstmt.getString(14));
		this.editable_yn = Util.checkString(cstmt.getString(15));
		this.regchk_yn = Util.checkString(cstmt.getString(16));
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			SE_QTY_1930_LCURLISTRecord rec = new SE_QTY_1930_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.same_yn = Util.checkString(rset0.getString("same_yn"));
			rec.icdc_qty = Util.checkString(rset0.getString("icdc_qty"));
			rec.calc_qty = Util.checkString(rset0.getString("calc_qty"));
			rec.issu_qty = Util.checkString(rset0.getString("issu_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_1930_LDataSet ds = (SE_QTY_1930_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_1930_LCURLISTRecord curlistRec = (SE_QTY_1930_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClosyn_cap()%>
<%= ds.getColcnt()%>
<%= ds.getTitle()%>
<%= ds.getMedi_cd()%>
<%= ds.getEditable_yn()%>
<%= ds.getRegchk_yn()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.send_plac_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.send_plac_seq%>
<%= curlistRec.same_yn%>
<%= curlistRec.icdc_qty%>
<%= curlistRec.calc_qty%>
<%= curlistRec.issu_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 11:27:52 KST 2012 */