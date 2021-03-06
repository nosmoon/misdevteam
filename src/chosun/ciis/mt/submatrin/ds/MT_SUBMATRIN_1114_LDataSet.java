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


public class MT_SUBMATRIN_1114_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRIN_1114_LDataSet(){}
	public MT_SUBMATRIN_1114_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_SUBMATRIN_1114_LCURLISTRecord rec = new MT_SUBMATRIN_1114_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.ewh_no = Util.checkString(rset0.getString("ewh_no"));
			rec.purc_clsf = Util.checkString(rset0.getString("purc_clsf"));
			rec.ewh_title = Util.checkString(rset0.getString("ewh_title"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.clos_proc_dt = Util.checkString(rset0.getString("clos_proc_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRIN_1102_LDataSet ds = (MT_SUBMATRIN_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1102_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.ewh_dt%>
<%= curlistRec.purc_clsf%>
<%= curlistRec.ewh_title%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.amt%>
<%= curlistRec.make_dt%>
<%= curlistRec.clos_proc_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 21:58:32 KST 2009 */