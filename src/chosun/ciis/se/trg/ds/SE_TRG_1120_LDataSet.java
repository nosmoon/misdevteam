/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_TRG_1120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_TRG_1120_LDataSet(){}
	public SE_TRG_1120_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_TRG_1120_LCURLISTRecord rec = new SE_TRG_1120_LCURLISTRecord();
			rec.trgt_clsf = Util.checkString(rset0.getString("trgt_clsf"));
			rec.trgt_clsf_nm = Util.checkString(rset0.getString("trgt_clsf_nm"));
			rec.pr_trgt = Util.checkString(rset0.getString("pr_trgt"));
			rec.pr_rslt = Util.checkString(rset0.getString("pr_rslt"));
			rec.trgt_tot = Util.checkString(rset0.getString("trgt_tot"));
			rec.pr12_rslt = Util.checkString(rset0.getString("pr12_rslt"));
			rec.trgt_01 = Util.checkString(rset0.getString("trgt_01"));
			rec.trgt_02 = Util.checkString(rset0.getString("trgt_02"));
			rec.trgt_03 = Util.checkString(rset0.getString("trgt_03"));
			rec.trgt_04 = Util.checkString(rset0.getString("trgt_04"));
			rec.trgt_05 = Util.checkString(rset0.getString("trgt_05"));
			rec.trgt_06 = Util.checkString(rset0.getString("trgt_06"));
			rec.trgt_07 = Util.checkString(rset0.getString("trgt_07"));
			rec.trgt_08 = Util.checkString(rset0.getString("trgt_08"));
			rec.trgt_09 = Util.checkString(rset0.getString("trgt_09"));
			rec.trgt_10 = Util.checkString(rset0.getString("trgt_10"));
			rec.trgt_11 = Util.checkString(rset0.getString("trgt_11"));
			rec.trgt_12 = Util.checkString(rset0.getString("trgt_12"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_1120_LDataSet ds = (SE_TRG_1120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1120_LCURLISTRecord curlistRec = (SE_TRG_1120_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.pr_trgt%>
<%= curlistRec.pr_rslt%>
<%= curlistRec.trgt_tot%>
<%= curlistRec.pr12_rslt%>
<%= curlistRec.trgt_01%>
<%= curlistRec.trgt_02%>
<%= curlistRec.trgt_03%>
<%= curlistRec.trgt_04%>
<%= curlistRec.trgt_05%>
<%= curlistRec.trgt_06%>
<%= curlistRec.trgt_07%>
<%= curlistRec.trgt_08%>
<%= curlistRec.trgt_09%>
<%= curlistRec.trgt_10%>
<%= curlistRec.trgt_11%>
<%= curlistRec.trgt_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 19:41:04 KST 2009 */