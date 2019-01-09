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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1340_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1340_LDataSet(){}
	public SE_BOI_1340_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			SE_BOI_1340_LCURLISTRecord rec = new SE_BOI_1340_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.cntr_stat_nm = Util.checkString(rset0.getString("cntr_stat_nm"));
			rec.leas_cntr_dt = Util.checkString(rset0.getString("leas_cntr_dt"));
			rec.midw_expy_dt = Util.checkString(rset0.getString("midw_expy_dt"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.cntr_mang_amt = Util.checkString(rset0.getString("cntr_mang_amt"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1340_LDataSet ds = (SE_BOI_1340_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1340_LCURLISTRecord curlistRec = (SE_BOI_1340_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.cntr_stat_nm%>
<%= curlistRec.leas_cntr_dt%>
<%= curlistRec.midw_expy_dt%>
<%= curlistRec.cntr_leas_amt%>
<%= curlistRec.cntr_mang_amt%>
<%= curlistRec.cntr_gurt_amt%>
<%= curlistRec.leas_fr_dt%>
<%= curlistRec.leas_to_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 11:17:55 KST 2009 */