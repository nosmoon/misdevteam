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


package chosun.ciis.pr.sendmg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_SENDMG_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_SENDMG_1020_LDataSet(){}
	public PR_SENDMG_1020_LDataSet(String errcode, String errmsg){
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
			PR_SENDMG_1020_LCURLIST1Record rec = new PR_SENDMG_1020_LCURLIST1Record();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.prt_plac_clsf = Util.checkString(rset0.getString("prt_plac_clsf"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.prt_bgn_tm = Util.checkString(rset0.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_SENDMG_1020_LCURLIST2Record rec = new PR_SENDMG_1020_LCURLIST2Record();
			rec.ecnt = Util.checkString(rset1.getString("ecnt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_SENDMG_1020_LCURLIST3Record rec = new PR_SENDMG_1020_LCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cd_abrv_cdnm = Util.checkString(rset2.getString("cd_abrv_cdnm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_SENDMG_1020_LDataSet ds = (PR_SENDMG_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_SENDMG_1020_LCURLIST1Record curlist1Rec = (PR_SENDMG_1020_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_SENDMG_1020_LCURLIST2Record curlist2Rec = (PR_SENDMG_1020_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_SENDMG_1020_LCURLIST3Record curlist3Rec = (PR_SENDMG_1020_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.prt_plac_clsf%>
<%= curlist1Rec.ecnt%>
<%= curlist1Rec.prt_bgn_tm%>
<%= curlist1Rec.prt_end_tm%>
<%= curlist1Rec.clos_clsf%>
<%= curlist2Rec.ecnt%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist3Rec.cd_abrv_cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 17:41:50 KST 2009 */