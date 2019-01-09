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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2420_LDataSet(){}
	public IS_AGR_2420_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			IS_AGR_2420_LCURLISTRecord rec = new IS_AGR_2420_LCURLISTRecord();
			rec.t_no = Util.checkString(rset0.getString("t_no"));
			rec.indt_cd_nm = Util.checkString(rset0.getString("indt_cd_nm"));
			rec.scat_dt_yy = Util.checkString(rset0.getString("scat_dt_yy"));
			rec.cnt_01 = Util.checkString(rset0.getString("cnt_01"));
			rec.cnt_02 = Util.checkString(rset0.getString("cnt_02"));
			rec.cnt_03 = Util.checkString(rset0.getString("cnt_03"));
			rec.cnt_04 = Util.checkString(rset0.getString("cnt_04"));
			rec.cnt_05 = Util.checkString(rset0.getString("cnt_05"));
			rec.cnt_06 = Util.checkString(rset0.getString("cnt_06"));
			rec.cnt_07 = Util.checkString(rset0.getString("cnt_07"));
			rec.cnt_08 = Util.checkString(rset0.getString("cnt_08"));
			rec.cnt_09 = Util.checkString(rset0.getString("cnt_09"));
			rec.cnt_10 = Util.checkString(rset0.getString("cnt_10"));
			rec.cnt_11 = Util.checkString(rset0.getString("cnt_11"));
			rec.cnt_12 = Util.checkString(rset0.getString("cnt_12"));
			rec.qunt_01 = Util.checkString(rset0.getString("qunt_01"));
			rec.qunt_02 = Util.checkString(rset0.getString("qunt_02"));
			rec.qunt_03 = Util.checkString(rset0.getString("qunt_03"));
			rec.qunt_04 = Util.checkString(rset0.getString("qunt_04"));
			rec.qunt_05 = Util.checkString(rset0.getString("qunt_05"));
			rec.qunt_06 = Util.checkString(rset0.getString("qunt_06"));
			rec.qunt_07 = Util.checkString(rset0.getString("qunt_07"));
			rec.qunt_08 = Util.checkString(rset0.getString("qunt_08"));
			rec.qunt_09 = Util.checkString(rset0.getString("qunt_09"));
			rec.qunt_10 = Util.checkString(rset0.getString("qunt_10"));
			rec.qunt_11 = Util.checkString(rset0.getString("qunt_11"));
			rec.qunt_12 = Util.checkString(rset0.getString("qunt_12"));
			rec.suply_amt_01 = Util.checkString(rset0.getString("suply_amt_01"));
			rec.suply_amt_02 = Util.checkString(rset0.getString("suply_amt_02"));
			rec.suply_amt_03 = Util.checkString(rset0.getString("suply_amt_03"));
			rec.suply_amt_04 = Util.checkString(rset0.getString("suply_amt_04"));
			rec.suply_amt_05 = Util.checkString(rset0.getString("suply_amt_05"));
			rec.suply_amt_06 = Util.checkString(rset0.getString("suply_amt_06"));
			rec.suply_amt_07 = Util.checkString(rset0.getString("suply_amt_07"));
			rec.suply_amt_08 = Util.checkString(rset0.getString("suply_amt_08"));
			rec.suply_amt_09 = Util.checkString(rset0.getString("suply_amt_09"));
			rec.suply_amt_10 = Util.checkString(rset0.getString("suply_amt_10"));
			rec.suply_amt_11 = Util.checkString(rset0.getString("suply_amt_11"));
			rec.suply_amt_12 = Util.checkString(rset0.getString("suply_amt_12"));
			rec.cnt_tot = Util.checkString(rset0.getString("cnt_tot"));
			rec.qunt_tot = Util.checkString(rset0.getString("qunt_tot"));
			rec.suply_amt_tot = Util.checkString(rset0.getString("suply_amt_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2420_LDataSet ds = (IS_AGR_2420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2420_LCURLISTRecord curlistRec = (IS_AGR_2420_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.t_no%>
<%= curlistRec.indt_cd_nm%>
<%= curlistRec.scat_dt_yy%>
<%= curlistRec.cnt_01%>
<%= curlistRec.cnt_02%>
<%= curlistRec.cnt_03%>
<%= curlistRec.cnt_04%>
<%= curlistRec.cnt_05%>
<%= curlistRec.cnt_06%>
<%= curlistRec.cnt_07%>
<%= curlistRec.cnt_08%>
<%= curlistRec.cnt_09%>
<%= curlistRec.cnt_10%>
<%= curlistRec.cnt_11%>
<%= curlistRec.cnt_12%>
<%= curlistRec.qunt_01%>
<%= curlistRec.qunt_02%>
<%= curlistRec.qunt_03%>
<%= curlistRec.qunt_04%>
<%= curlistRec.qunt_05%>
<%= curlistRec.qunt_06%>
<%= curlistRec.qunt_07%>
<%= curlistRec.qunt_08%>
<%= curlistRec.qunt_09%>
<%= curlistRec.qunt_10%>
<%= curlistRec.qunt_11%>
<%= curlistRec.qunt_12%>
<%= curlistRec.suply_amt_01%>
<%= curlistRec.suply_amt_02%>
<%= curlistRec.suply_amt_03%>
<%= curlistRec.suply_amt_04%>
<%= curlistRec.suply_amt_05%>
<%= curlistRec.suply_amt_06%>
<%= curlistRec.suply_amt_07%>
<%= curlistRec.suply_amt_08%>
<%= curlistRec.suply_amt_09%>
<%= curlistRec.suply_amt_10%>
<%= curlistRec.suply_amt_11%>
<%= curlistRec.suply_amt_12%>
<%= curlistRec.cnt_tot%>
<%= curlistRec.qunt_tot%>
<%= curlistRec.suply_amt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 11:07:33 KST 2012 */