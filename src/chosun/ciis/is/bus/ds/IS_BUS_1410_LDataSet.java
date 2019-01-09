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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_b = new ArrayList();
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_1410_LDataSet(){}
	public IS_BUS_1410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			IS_BUS_1410_LCURLIST_ARecord rec = new IS_BUS_1410_LCURLIST_ARecord();
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.dw_tgt_amt = Util.checkString(rset0.getString("dw_tgt_amt"));
			rec.dw_rst_amt = Util.checkString(rset0.getString("dw_rst_amt"));
			rec.dw_rate = Util.checkString(rset0.getString("dw_rate"));
			rec.jw_rst_amt = Util.checkString(rset0.getString("jw_rst_amt"));
			rec.dw_j_rate = Util.checkString(rset0.getString("dw_j_rate"));
			rec.dm_tgt_amt = Util.checkString(rset0.getString("dm_tgt_amt"));
			rec.dm_rst_amt = Util.checkString(rset0.getString("dm_rst_amt"));
			rec.dm_rate = Util.checkString(rset0.getString("dm_rate"));
			rec.jm_rst_amt = Util.checkString(rset0.getString("jm_rst_amt"));
			rec.dm_j_rate = Util.checkString(rset0.getString("dm_j_rate"));
			rec.dy_tgt_amt = Util.checkString(rset0.getString("dy_tgt_amt"));
			rec.dy_rst_amt = Util.checkString(rset0.getString("dy_rst_amt"));
			rec.dy_rate = Util.checkString(rset0.getString("dy_rate"));
			rec.jy_rst_amt = Util.checkString(rset0.getString("jy_rst_amt"));
			rec.dy_j_rate = Util.checkString(rset0.getString("dy_j_rate"));
			this.curlist_a.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			IS_BUS_1410_LCURLIST_BRecord rec = new IS_BUS_1410_LCURLIST_BRecord();
			rec.mi_amt_1 = Util.checkString(rset1.getString("mi_amt_1"));
			rec.mi_amt_2 = Util.checkString(rset1.getString("mi_amt_2"));
			rec.mi_amt_3 = Util.checkString(rset1.getString("mi_amt_3"));
			rec.mi_amt_4 = Util.checkString(rset1.getString("mi_amt_4"));
			rec.np_amt = Util.checkString(rset1.getString("np_amt"));
			rec.t_amt = Util.checkString(rset1.getString("t_amt"));
			this.curlist_b.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_1410_LDataSet ds = (IS_BUS_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_BUS_1410_LCURLIST_ARecord curlist_aRec = (IS_BUS_1410_LCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_b.size(); i++){
		IS_BUS_1410_LCURLIST_BRecord curlist_bRec = (IS_BUS_1410_LCURLIST_BRecord)ds.curlist_b.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_a()%>
<%= ds.getCurlist_b()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.dept_cd_nm%>
<%= curlist_aRec.dw_tgt_amt%>
<%= curlist_aRec.dw_rst_amt%>
<%= curlist_aRec.dw_rate%>
<%= curlist_aRec.jw_rst_amt%>
<%= curlist_aRec.dw_j_rate%>
<%= curlist_aRec.dm_tgt_amt%>
<%= curlist_aRec.dm_rst_amt%>
<%= curlist_aRec.dm_rate%>
<%= curlist_aRec.jm_rst_amt%>
<%= curlist_aRec.dm_j_rate%>
<%= curlist_aRec.dy_tgt_amt%>
<%= curlist_aRec.dy_rst_amt%>
<%= curlist_aRec.dy_rate%>
<%= curlist_aRec.jy_rst_amt%>
<%= curlist_aRec.dy_j_rate%>
<%= curlist_bRec.mi_amt_1%>
<%= curlist_bRec.mi_amt_2%>
<%= curlist_bRec.mi_amt_3%>
<%= curlist_bRec.mi_amt_4%>
<%= curlist_bRec.np_amt%>
<%= curlist_bRec.t_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 18 10:01:57 KST 2012 */