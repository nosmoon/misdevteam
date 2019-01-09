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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6132_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6132_LDataSet(){}
	public MC_BUDG_6132_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MC_BUDG_6132_LCURLISTRecord rec = new MC_BUDG_6132_LCURLISTRecord();
			rec.budg_clas_cd = Util.checkString(rset1.getString("budg_clas_cd"));
			rec.budg_clas_cdnm = Util.checkString(rset1.getString("budg_clas_cdnm"));
			rec.bf_sumamt = Util.checkString(rset1.getString("bf_sumamt"));
			rec.af_sumamt = Util.checkString(rset1.getString("af_sumamt"));
			rec.diff_amt = Util.checkString(rset1.getString("diff_amt"));
			rec.bf_amt1 = Util.checkString(rset1.getString("bf_amt1"));
			rec.af_amt1 = Util.checkString(rset1.getString("af_amt1"));
			rec.bf_amt2 = Util.checkString(rset1.getString("bf_amt2"));
			rec.af_amt2 = Util.checkString(rset1.getString("af_amt2"));
			rec.bf_amt3 = Util.checkString(rset1.getString("bf_amt3"));
			rec.af_amt3 = Util.checkString(rset1.getString("af_amt3"));
			rec.bf_amt4 = Util.checkString(rset1.getString("bf_amt4"));
			rec.af_amt4 = Util.checkString(rset1.getString("af_amt4"));
			rec.bf_amt5 = Util.checkString(rset1.getString("bf_amt5"));
			rec.af_amt5 = Util.checkString(rset1.getString("af_amt5"));
			rec.bf_amt6 = Util.checkString(rset1.getString("bf_amt6"));
			rec.af_amt6 = Util.checkString(rset1.getString("af_amt6"));
			rec.bf_amt7 = Util.checkString(rset1.getString("bf_amt7"));
			rec.af_amt7 = Util.checkString(rset1.getString("af_amt7"));
			rec.bf_amt8 = Util.checkString(rset1.getString("bf_amt8"));
			rec.af_amt8 = Util.checkString(rset1.getString("af_amt8"));
			rec.bf_amt9 = Util.checkString(rset1.getString("bf_amt9"));
			rec.af_amt9 = Util.checkString(rset1.getString("af_amt9"));
			rec.bf_amt10 = Util.checkString(rset1.getString("bf_amt10"));
			rec.af_amt10 = Util.checkString(rset1.getString("af_amt10"));
			rec.bf_amt11 = Util.checkString(rset1.getString("bf_amt11"));
			rec.af_amt11 = Util.checkString(rset1.getString("af_amt11"));
			rec.bf_amt12 = Util.checkString(rset1.getString("bf_amt12"));
			rec.af_amt12 = Util.checkString(rset1.getString("af_amt12"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6132_LDataSet ds = (MC_BUDG_6132_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6132_LCURLISTRecord curlistRec = (MC_BUDG_6132_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_clas_cd%>
<%= curlistRec.budg_clas_cdnm%>
<%= curlistRec.bf_sumamt%>
<%= curlistRec.af_sumamt%>
<%= curlistRec.diff_amt%>
<%= curlistRec.bf_amt1%>
<%= curlistRec.af_amt1%>
<%= curlistRec.bf_amt2%>
<%= curlistRec.af_amt2%>
<%= curlistRec.bf_amt3%>
<%= curlistRec.af_amt3%>
<%= curlistRec.bf_amt4%>
<%= curlistRec.af_amt4%>
<%= curlistRec.bf_amt5%>
<%= curlistRec.af_amt5%>
<%= curlistRec.bf_amt6%>
<%= curlistRec.af_amt6%>
<%= curlistRec.bf_amt7%>
<%= curlistRec.af_amt7%>
<%= curlistRec.bf_amt8%>
<%= curlistRec.af_amt8%>
<%= curlistRec.bf_amt9%>
<%= curlistRec.af_amt9%>
<%= curlistRec.bf_amt10%>
<%= curlistRec.af_amt10%>
<%= curlistRec.bf_amt11%>
<%= curlistRec.af_amt11%>
<%= curlistRec.bf_amt12%>
<%= curlistRec.af_amt12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 11:45:32 KST 2009 */