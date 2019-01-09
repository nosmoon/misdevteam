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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_2003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_2003_LDataSet(){}
	public MT_SUBMATROUT_2003_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATROUT_2003_LCURLISTRecord rec = new MT_SUBMATROUT_2003_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.mov_out_uprc = Util.checkString(rset0.getString("mov_out_uprc"));
			rec.mov_in_budg_cd = Util.checkString(rset0.getString("mov_in_budg_cd"));
			rec.mov_out_budg_cd = Util.checkString(rset0.getString("mov_out_budg_cd"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.safe_stok = Util.checkString(rset0.getString("safe_stok"));
			rec.hjg_cnt = Util.checkString(rset0.getString("hjg_cnt"));
			rec.cur_hjg_amt = Util.checkString(rset0.getString("cur_hjg_amt"));
			rec.mov_in_budg_acctcdnm = Util.checkString(rset0.getString("mov_in_budg_acctcdnm"));
			rec.mov_out_budg_acctcdnm = Util.checkString(rset0.getString("mov_out_budg_acctcdnm"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_2003_LDataSet ds = (MT_SUBMATROUT_2003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_2003_LCURLISTRecord curlistRec = (MT_SUBMATROUT_2003_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.unit%>
<%= curlistRec.mov_out_uprc%>
<%= curlistRec.mov_in_budg_cd%>
<%= curlistRec.mov_out_budg_cd%>
<%= curlistRec.std_modl%>
<%= curlistRec.safe_stok%>
<%= curlistRec.hjg_cnt%>
<%= curlistRec.cur_hjg_amt%>
<%= curlistRec.mov_in_budg_acctcdnm%>
<%= curlistRec.mov_out_budg_acctcdnm%>
<%= curlistRec.dstb_rat_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 14:27:15 KST 2009 */