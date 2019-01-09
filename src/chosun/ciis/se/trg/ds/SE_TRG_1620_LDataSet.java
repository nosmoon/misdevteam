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


public class SE_TRG_1620_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_TRG_1620_LDataSet(){}
	public SE_TRG_1620_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_TRG_1620_LCURLISTRecord rec = new SE_TRG_1620_LCURLISTRecord();
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.hwak_p = Util.checkString(rset0.getString("hwak_p"));
			rec.hwak = Util.checkString(rset0.getString("hwak"));
			rec.sil_p = Util.checkString(rset0.getString("sil_p"));
			rec.sil = Util.checkString(rset0.getString("sil"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			SE_TRG_1620_LCURLIST2Record rec = new SE_TRG_1620_LCURLIST2Record();
			rec.area_nm = Util.checkString(rset1.getString("area_nm"));
			rec.chrg_flnm = Util.checkString(rset1.getString("chrg_flnm"));
			rec.bo_nm = Util.checkString(rset1.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset1.getString("bo_head_nm"));
			rec.evlu_grp_nm = Util.checkString(rset1.getString("evlu_grp_nm"));
			rec.cmpt_acpn = Util.checkString(rset1.getString("cmpt_acpn"));
			rec.borank = Util.checkString(rset1.getString("borank"));
			rec.prz_amt = Util.checkString(rset1.getString("prz_amt"));
			rec.scor1 = Util.checkString(rset1.getString("scor1"));
			rec.std_scor1 = Util.checkString(rset1.getString("std_scor1"));
			rec.scor2 = Util.checkString(rset1.getString("scor2"));
			rec.std_scor2 = Util.checkString(rset1.getString("std_scor2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_1620_LDataSet ds = (SE_TRG_1620_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1620_LCURLISTRecord curlistRec = (SE_TRG_1620_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		SE_TRG_1620_LCURLIST2Record curlist2Rec = (SE_TRG_1620_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.hwak_p%>
<%= curlistRec.hwak%>
<%= curlistRec.sil_p%>
<%= curlistRec.sil%>
<%= curlist2Rec.area_nm%>
<%= curlist2Rec.chrg_flnm%>
<%= curlist2Rec.bo_nm%>
<%= curlist2Rec.bo_head_nm%>
<%= curlist2Rec.evlu_grp_nm%>
<%= curlist2Rec.cmpt_acpn%>
<%= curlist2Rec.borank%>
<%= curlist2Rec.prz_amt%>
<%= curlist2Rec.scor1%>
<%= curlist2Rec.std_scor1%>
<%= curlist2Rec.scor2%>
<%= curlist2Rec.std_scor2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 15:30:33 KST 2009 */