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


public class SE_BOI_2410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2410_LDataSet(){}
	public SE_BOI_2410_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_BOI_2410_LCURLISTRecord rec = new SE_BOI_2410_LCURLISTRecord();
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cdseq = Util.checkString(rset0.getString("bo_cdseq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.amt3 = Util.checkString(rset0.getString("amt3"));
			rec.amt4 = Util.checkString(rset0.getString("amt4"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2410_LDataSet ds = (SE_BOI_2410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2410_LCURLISTRecord curlistRec = (SE_BOI_2410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cdseq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.occr_dt%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.amt1%>
<%= curlistRec.amt2%>
<%= curlistRec.amt3%>
<%= curlistRec.amt4%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 24 17:49:29 KST 2009 */