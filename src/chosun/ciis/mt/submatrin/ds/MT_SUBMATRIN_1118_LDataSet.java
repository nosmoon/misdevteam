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


package chosun.ciis.mt.submatrin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1118_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRIN_1118_LDataSet(){}
	public MT_SUBMATRIN_1118_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_SUBMATRIN_1118_LCURLISTRecord rec = new MT_SUBMATRIN_1118_LCURLISTRecord();
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.smleasegb = Util.checkString(rset0.getString("smleasegb"));
			rec.case_nm = Util.checkString(rset0.getString("case_nm"));
			rec.impt_resn = Util.checkString(rset0.getString("impt_resn"));
			rec.offer_pric = Util.checkString(rset0.getString("offer_pric"));
			rec.offer_pric_curc_clsf = Util.checkString(rset0.getString("offer_pric_curc_clsf"));
			rec.ship_pers = Util.checkString(rset0.getString("ship_pers"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.ship_widr = Util.checkString(rset0.getString("ship_widr"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRIN_1118_LDataSet ds = (MT_SUBMATRIN_1118_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1118_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1118_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yy%>
<%= curlistRec.seq%>
<%= curlistRec.smleasegb%>
<%= curlistRec.case_nm%>
<%= curlistRec.impt_resn%>
<%= curlistRec.offer_pric%>
<%= curlistRec.offer_pric_curc_clsf%>
<%= curlistRec.ship_pers%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.ship_widr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 01 13:51:15 KST 2009 */