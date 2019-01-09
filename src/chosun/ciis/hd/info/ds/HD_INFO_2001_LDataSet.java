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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_2001_LDataSet(){}
	public HD_INFO_2001_LDataSet(String errcode, String errmsg){
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
			HD_INFO_2001_LCURLISTRecord rec = new HD_INFO_2001_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.psgp_cd = Util.checkString(rset0.getString("psgp_cd"));
			rec.psgp_nm = Util.checkString(rset0.getString("psgp_nm"));
			rec.intern_desty = Util.checkString(rset0.getString("intern_desty"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.univ_nm = Util.checkString(rset0.getString("univ_nm"));
			rec.majr_nm = Util.checkString(rset0.getString("majr_nm"));
			rec.univ_enty_yy = Util.checkString(rset0.getString("univ_enty_yy"));
			rec.engl_test_nm = Util.checkString(rset0.getString("engl_test_nm"));
			rec.engl_test_scor = Util.checkString(rset0.getString("engl_test_scor"));
			rec.hby = Util.checkString(rset0.getString("hby"));
			rec.spc = Util.checkString(rset0.getString("spc"));
			rec.acty_dept = Util.checkString(rset0.getString("acty_dept"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.acty_frdt = Util.checkString(rset0.getString("acty_frdt"));
			rec.acty_todt = Util.checkString(rset0.getString("acty_todt"));
			rec.acty_complt_yn = Util.checkString(rset0.getString("acty_complt_yn"));
			rec.carr_matt_1 = Util.checkString(rset0.getString("carr_matt_1"));
			rec.carr_matt_1_frdt = Util.checkString(rset0.getString("carr_matt_1_frdt"));
			rec.carr_matt_1_todt = Util.checkString(rset0.getString("carr_matt_1_todt"));
			rec.carr_matt_1_instt = Util.checkString(rset0.getString("carr_matt_1_instt"));
			rec.carr_matt_2 = Util.checkString(rset0.getString("carr_matt_2"));
			rec.carr_matt_2_frdt = Util.checkString(rset0.getString("carr_matt_2_frdt"));
			rec.carr_matt_2_todt = Util.checkString(rset0.getString("carr_matt_2_todt"));
			rec.carr_matt_2_instt = Util.checkString(rset0.getString("carr_matt_2_instt"));
			rec.carr_matt_3 = Util.checkString(rset0.getString("carr_matt_3"));
			rec.carr_matt_3_frdt = Util.checkString(rset0.getString("carr_matt_3_frdt"));
			rec.carr_matt_3_todt = Util.checkString(rset0.getString("carr_matt_3_todt"));
			rec.carr_matt_3_instt = Util.checkString(rset0.getString("carr_matt_3_instt"));
			rec.blng_dpthd_emp_no = Util.checkString(rset0.getString("blng_dpthd_emp_no"));
			rec.blng_dpthd_evlu_idea = Util.checkString(rset0.getString("blng_dpthd_evlu_idea"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			rec.birth = Util.checkString(rset0.getString("birth"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_2001_LDataSet ds = (HD_INFO_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_2001_LCURLISTRecord curlistRec = (HD_INFO_2001_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.psgp_cd%>
<%= curlistRec.psgp_nm%>
<%= curlistRec.intern_desty%>
<%= curlistRec.flnm%>
<%= curlistRec.prn%>
<%= curlistRec.tel_no%>
<%= curlistRec.univ_nm%>
<%= curlistRec.majr_nm%>
<%= curlistRec.univ_enty_yy%>
<%= curlistRec.engl_test_nm%>
<%= curlistRec.engl_test_scor%>
<%= curlistRec.hby%>
<%= curlistRec.spc%>
<%= curlistRec.acty_dept%>
<%= curlistRec.dept_nm%>
<%= curlistRec.acty_frdt%>
<%= curlistRec.acty_todt%>
<%= curlistRec.acty_complt_yn%>
<%= curlistRec.carr_matt_1%>
<%= curlistRec.carr_matt_1_frdt%>
<%= curlistRec.carr_matt_1_todt%>
<%= curlistRec.carr_matt_1_instt%>
<%= curlistRec.carr_matt_2%>
<%= curlistRec.carr_matt_2_frdt%>
<%= curlistRec.carr_matt_2_todt%>
<%= curlistRec.carr_matt_2_instt%>
<%= curlistRec.carr_matt_3%>
<%= curlistRec.carr_matt_3_frdt%>
<%= curlistRec.carr_matt_3_todt%>
<%= curlistRec.carr_matt_3_instt%>
<%= curlistRec.blng_dpthd_emp_no%>
<%= curlistRec.blng_dpthd_evlu_idea%>
<%= curlistRec.etc%>
<%= curlistRec.birth%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 18:34:47 KST 2009 */