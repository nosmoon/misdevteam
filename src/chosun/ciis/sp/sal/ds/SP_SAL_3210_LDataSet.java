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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_3210_LDataSet(){}
	public SP_SAL_3210_LDataSet(String errcode, String errmsg){
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
			SP_SAL_3210_LCURLISTRecord rec = new SP_SAL_3210_LCURLISTRecord();
			rec.suply_pers_nm = Util.checkString(rset0.getString("suply_pers_nm"));
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.doco_no = Util.checkString(rset0.getString("doco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.bo_addr = Util.checkString(rset0.getString("bo_addr"));
			rec.gds_nm = Util.checkString(rset0.getString("gds_nm"));
			rec.stot_amt = Util.checkString(rset0.getString("stot_amt"));
			rec.sale_cost = Util.checkString(rset0.getString("sale_cost"));
			rec.profit_rate = Util.checkString(rset0.getString("profit_rate"));
			rec.profit_amt = Util.checkString(rset0.getString("profit_amt"));
			rec.clamt_mthd = Util.checkString(rset0.getString("clamt_mthd"));
			rec.div_cnt = Util.checkString(rset0.getString("div_cnt"));
			rec.sale_yymm = Util.checkString(rset0.getString("sale_yymm"));
			rec.div_01 = Util.checkString(rset0.getString("div_01"));
			rec.div_02 = Util.checkString(rset0.getString("div_02"));
			rec.div_03 = Util.checkString(rset0.getString("div_03"));
			rec.div_04 = Util.checkString(rset0.getString("div_04"));
			rec.div_05 = Util.checkString(rset0.getString("div_05"));
			rec.div_06 = Util.checkString(rset0.getString("div_06"));
			rec.div_07 = Util.checkString(rset0.getString("div_07"));
			rec.div_08 = Util.checkString(rset0.getString("div_08"));
			rec.div_09 = Util.checkString(rset0.getString("div_09"));
			rec.div_10 = Util.checkString(rset0.getString("div_10"));
			rec.div_11 = Util.checkString(rset0.getString("div_11"));
			rec.div_12 = Util.checkString(rset0.getString("div_12"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_3210_LDataSet ds = (SP_SAL_3210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_3210_LCURLISTRecord curlistRec = (SP_SAL_3210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.suply_pers_nm%>
<%= curlistRec.ordr_dt%>
<%= curlistRec.doco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.bo_addr%>
<%= curlistRec.gds_nm%>
<%= curlistRec.stot_amt%>
<%= curlistRec.sale_cost%>
<%= curlistRec.profit_rate%>
<%= curlistRec.profit_amt%>
<%= curlistRec.clamt_mthd%>
<%= curlistRec.div_cnt%>
<%= curlistRec.sale_yymm%>
<%= curlistRec.div_01%>
<%= curlistRec.div_02%>
<%= curlistRec.div_03%>
<%= curlistRec.div_04%>
<%= curlistRec.div_05%>
<%= curlistRec.div_06%>
<%= curlistRec.div_07%>
<%= curlistRec.div_08%>
<%= curlistRec.div_09%>
<%= curlistRec.div_10%>
<%= curlistRec.div_11%>
<%= curlistRec.div_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 22 15:23:55 KST 2012 */