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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1021_LDataSet(){}
	public PR_PAPMAKE_1021_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_PAPMAKE_1021_LCURLIST1Record rec = new PR_PAPMAKE_1021_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.prt_clsf = Util.checkString(rset0.getString("prt_clsf"));
			rec.mesr_plac_clsf = Util.checkString(rset0.getString("mesr_plac_clsf"));
			rec.tmpt = Util.checkString(rset0.getString("tmpt"));
			rec.hmdt = Util.checkString(rset0.getString("hmdt"));
			rec.cnfm_tm = Util.checkString(rset0.getString("cnfm_tm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PAPMAKE_1021_LCURLIST2Record rec = new PR_PAPMAKE_1021_LCURLIST2Record();
			rec.ecnt = Util.checkString(rset1.getString("ecnt"));
			rec.ecnt_nm = Util.checkString(rset1.getString("ecnt_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_1021_LDataSet ds = (PR_PAPMAKE_1021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_1021_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_1021_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PAPMAKE_1021_LCURLIST2Record curlist2Rec = (PR_PAPMAKE_1021_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.duty_dt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.sub_seq%>
<%= curlist1Rec.prt_clsf%>
<%= curlist1Rec.mesr_plac_clsf%>
<%= curlist1Rec.tmpt%>
<%= curlist1Rec.hmdt%>
<%= curlist1Rec.cnfm_tm%>
<%= curlist2Rec.ecnt%>
<%= curlist2Rec.ecnt_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 13:06:25 KST 2009 */