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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_4200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_4200_LDataSet(){}
	public MT_PAPINOUT_4200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			MT_PAPINOUT_4200_LCURLISTRecord rec = new MT_PAPINOUT_4200_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.make_un_norm_occr_dt = Util.checkString(rset0.getString("make_un_norm_occr_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_nm = Util.checkString(rset0.getString("fac_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.now_trad_cd = Util.checkString(rset0.getString("now_trad_cd"));
			rec.now_trad_nm = Util.checkString(rset0.getString("now_trad_nm"));
			rec.pj_rate = Util.checkString(rset0.getString("pj_rate"));
			rec.rela_dept = Util.checkString(rset0.getString("rela_dept"));
			rec.rela_dept_nm = Util.checkString(rset0.getString("rela_dept_nm"));
			rec.caus_prd = Util.checkString(rset0.getString("caus_prd"));
			rec.caus_prd_nm = Util.checkString(rset0.getString("caus_prd_nm"));
			rec.caus_midl = Util.checkString(rset0.getString("caus_midl"));
			rec.caus_midl_nm = Util.checkString(rset0.getString("caus_midl_nm"));
			rec.caus_dtls = Util.checkString(rset0.getString("caus_dtls"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_4200_LDataSet ds = (MT_PAPINOUT_4200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_4200_LCURLISTRecord curlistRec = (MT_PAPINOUT_4200_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.make_un_norm_occr_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.now_trad_cd%>
<%= curlistRec.now_trad_nm%>
<%= curlistRec.pj_rate%>
<%= curlistRec.rela_dept%>
<%= curlistRec.rela_dept_nm%>
<%= curlistRec.caus_prd%>
<%= curlistRec.caus_prd_nm%>
<%= curlistRec.caus_midl%>
<%= curlistRec.caus_midl_nm%>
<%= curlistRec.caus_dtls%>
<%= curlistRec.clos_clsf%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 11:26:34 KST 2009 */