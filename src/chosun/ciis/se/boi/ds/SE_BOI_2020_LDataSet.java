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


public class SE_BOI_2020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2020_LDataSet(){}
	public SE_BOI_2020_LDataSet(String errcode, String errmsg){
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
			SE_BOI_2020_LCURLISTRecord rec = new SE_BOI_2020_LCURLISTRecord();
			rec.bo_cd1 = Util.checkString(rset0.getString("bo_cd1"));
			rec.bo_seq1 = Util.checkString(rset0.getString("bo_seq1"));
			rec.bo_nm1 = Util.checkString(rset0.getString("bo_nm1"));
			rec.bo_head_nm1 = Util.checkString(rset0.getString("bo_head_nm1"));
			rec.area_cd1 = Util.checkString(rset0.getString("area_cd1"));
			rec.area_nm1 = Util.checkString(rset0.getString("area_nm1"));
			rec.chrg_pers1 = Util.checkString(rset0.getString("chrg_pers1"));
			rec.amt1_1 = Util.checkString(rset0.getString("amt1_1"));
			rec.amt2_1 = Util.checkString(rset0.getString("amt2_1"));
			rec.bo_cd2 = Util.checkString(rset0.getString("bo_cd2"));
			rec.bo_seq2 = Util.checkString(rset0.getString("bo_seq2"));
			rec.bo_nm2 = Util.checkString(rset0.getString("bo_nm2"));
			rec.bo_head_nm2 = Util.checkString(rset0.getString("bo_head_nm2"));
			rec.area_cd2 = Util.checkString(rset0.getString("area_cd2"));
			rec.area_nm2 = Util.checkString(rset0.getString("area_nm2"));
			rec.chrg_pers2 = Util.checkString(rset0.getString("chrg_pers2"));
			rec.amt1_2 = Util.checkString(rset0.getString("amt1_2"));
			rec.amt2_2 = Util.checkString(rset0.getString("amt2_2"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2020_LDataSet ds = (SE_BOI_2020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2020_LCURLISTRecord curlistRec = (SE_BOI_2020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_cd1%>
<%= curlistRec.bo_seq1%>
<%= curlistRec.bo_nm1%>
<%= curlistRec.bo_head_nm1%>
<%= curlistRec.area_cd1%>
<%= curlistRec.area_nm1%>
<%= curlistRec.chrg_pers1%>
<%= curlistRec.amt1_1%>
<%= curlistRec.amt2_1%>
<%= curlistRec.bo_cd2%>
<%= curlistRec.bo_seq2%>
<%= curlistRec.bo_nm2%>
<%= curlistRec.bo_head_nm2%>
<%= curlistRec.area_cd2%>
<%= curlistRec.area_nm2%>
<%= curlistRec.chrg_pers2%>
<%= curlistRec.amt1_2%>
<%= curlistRec.amt2_2%>
<%= curlistRec.amt1%>
<%= curlistRec.amt2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 19:44:00 KST 2009 */