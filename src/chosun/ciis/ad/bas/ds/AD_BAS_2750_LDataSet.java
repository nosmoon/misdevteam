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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2750_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_2750_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2750_LDataSet(){}
	public AD_BAS_2750_LDataSet(String errcode, String errmsg){
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
			AD_BAS_2750_LCURLISTRecord rec = new AD_BAS_2750_LCURLISTRecord();
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.acct_id = Util.checkString(rset0.getString("acct_id"));
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.part_posi = Util.checkString(rset0.getString("part_posi"));
			rec.chrg_clsf = Util.checkString(rset0.getString("chrg_clsf"));
			rec.chrg_medi_nm = Util.checkString(rset0.getString("chrg_medi_nm"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2750_LDataSet ds = (AD_BAS_2750_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2750_LCURLISTRecord curlistRec = (AD_BAS_2750_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.team_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.acct_id%>
<%= curlistRec.acct_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.part_posi%>
<%= curlistRec.chrg_clsf%>
<%= curlistRec.chrg_medi_nm%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 15:41:10 KST 2009 */