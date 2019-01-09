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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_2210_LDataSet(){}
	public HD_VACA_2210_LDataSet(String errcode, String errmsg){
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
			HD_VACA_2210_LCURLISTRecord rec = new HD_VACA_2210_LCURLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.year_vaca_dds_sum = Util.checkString(rset0.getString("year_vaca_dds_sum"));
			rec.add_vaca_dds_sum = Util.checkString(rset0.getString("add_vaca_dds_sum"));
			rec.occr_vaca_dds_sum = Util.checkString(rset0.getString("occr_vaca_dds_sum"));
			rec.use_vaca_dds_sum = Util.checkString(rset0.getString("use_vaca_dds_sum"));
			rec.vaca_rmn_dds_sum = Util.checkString(rset0.getString("vaca_rmn_dds_sum"));
			rec.yymm_alon_sum = Util.checkString(rset0.getString("yymm_alon_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_2210_LDataSet ds = (HD_VACA_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_2210_LCURLISTRecord curlistRec = (HD_VACA_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cd_nm%>
<%= curlistRec.year_vaca_dds_sum%>
<%= curlistRec.add_vaca_dds_sum%>
<%= curlistRec.occr_vaca_dds_sum%>
<%= curlistRec.use_vaca_dds_sum%>
<%= curlistRec.vaca_rmn_dds_sum%>
<%= curlistRec.yymm_alon_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 04 15:46:20 KST 2009 */