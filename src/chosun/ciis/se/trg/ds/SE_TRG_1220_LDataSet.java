/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_TRG_1220_LDataSet(){}
	public SE_TRG_1220_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_TRG_1220_LCURLISTRecord rec = new SE_TRG_1220_LCURLISTRecord();
			rec.trgt_clsf = Util.checkString(rset0.getString("trgt_clsf"));
			rec.trgt_clsf_nm = Util.checkString(rset0.getString("trgt_clsf_nm"));
			rec.trgt_01 = Util.checkString(rset0.getString("trgt_01"));
			rec.rslt_01 = Util.checkString(rset0.getString("rslt_01"));
			rec.trgt_02 = Util.checkString(rset0.getString("trgt_02"));
			rec.rslt_02 = Util.checkString(rset0.getString("rslt_02"));
			rec.trgt_03 = Util.checkString(rset0.getString("trgt_03"));
			rec.rslt_03 = Util.checkString(rset0.getString("rslt_03"));
			rec.trgt_04 = Util.checkString(rset0.getString("trgt_04"));
			rec.rslt_04 = Util.checkString(rset0.getString("rslt_04"));
			rec.trgt_05 = Util.checkString(rset0.getString("trgt_05"));
			rec.rslt_05 = Util.checkString(rset0.getString("rslt_05"));
			rec.trgt_06 = Util.checkString(rset0.getString("trgt_06"));
			rec.rslt_06 = Util.checkString(rset0.getString("rslt_06"));
			rec.trgt_07 = Util.checkString(rset0.getString("trgt_07"));
			rec.rslt_07 = Util.checkString(rset0.getString("rslt_07"));
			rec.trgt_08 = Util.checkString(rset0.getString("trgt_08"));
			rec.rslt_08 = Util.checkString(rset0.getString("rslt_08"));
			rec.trgt_09 = Util.checkString(rset0.getString("trgt_09"));
			rec.rslt_09 = Util.checkString(rset0.getString("rslt_09"));
			rec.trgt_10 = Util.checkString(rset0.getString("trgt_10"));
			rec.rslt_10 = Util.checkString(rset0.getString("rslt_10"));
			rec.trgt_11 = Util.checkString(rset0.getString("trgt_11"));
			rec.rslt_11 = Util.checkString(rset0.getString("rslt_11"));
			rec.trgt_12 = Util.checkString(rset0.getString("trgt_12"));
			rec.rslt_12 = Util.checkString(rset0.getString("rslt_12"));
			rec.trgt_sum = Util.checkString(rset0.getString("trgt_sum"));
			rec.rslt_sum = Util.checkString(rset0.getString("rslt_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_1220_LDataSet ds = (SE_TRG_1220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1220_LCURLISTRecord curlistRec = (SE_TRG_1220_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.trgt_clsf%>
<%= curlistRec.trgt_clsf_nm%>
<%= curlistRec.trgt_01%>
<%= curlistRec.rslt_01%>
<%= curlistRec.trgt_02%>
<%= curlistRec.rslt_02%>
<%= curlistRec.trgt_03%>
<%= curlistRec.rslt_03%>
<%= curlistRec.trgt_04%>
<%= curlistRec.rslt_04%>
<%= curlistRec.trgt_05%>
<%= curlistRec.rslt_05%>
<%= curlistRec.trgt_06%>
<%= curlistRec.rslt_06%>
<%= curlistRec.trgt_07%>
<%= curlistRec.rslt_07%>
<%= curlistRec.trgt_08%>
<%= curlistRec.rslt_08%>
<%= curlistRec.trgt_09%>
<%= curlistRec.rslt_09%>
<%= curlistRec.trgt_10%>
<%= curlistRec.rslt_10%>
<%= curlistRec.trgt_11%>
<%= curlistRec.rslt_11%>
<%= curlistRec.trgt_12%>
<%= curlistRec.rslt_12%>
<%= curlistRec.trgt_sum%>
<%= curlistRec.rslt_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 09 19:53:24 KST 2009 */