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


public class PR_PAPMAKE_1051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1051_LDataSet(){}
	public PR_PAPMAKE_1051_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_1051_LCURLIST1Record rec = new PR_PAPMAKE_1051_LCURLIST1Record();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.use_qunt_1 = Util.checkString(rset0.getString("use_qunt_1"));
			rec.use_qunt_2 = Util.checkString(rset0.getString("use_qunt_2"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PAPMAKE_1051_LCURLIST2Record rec = new PR_PAPMAKE_1051_LCURLIST2Record();
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.use_qunt_1 = Util.checkString(rset1.getString("use_qunt_1"));
			rec.use_qunt_2 = Util.checkString(rset1.getString("use_qunt_2"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_PAPMAKE_1051_LCURLIST3Record rec = new PR_PAPMAKE_1051_LCURLIST3Record();
			rec.matr_cd = Util.checkString(rset2.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset2.getString("matr_nm"));
			rec.use_qunt_1 = Util.checkString(rset2.getString("use_qunt_1"));
			rec.use_qunt_2 = Util.checkString(rset2.getString("use_qunt_2"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset2.getString("dlco_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			PR_PAPMAKE_1051_LCURLIST4Record rec = new PR_PAPMAKE_1051_LCURLIST4Record();
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset3.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset3.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset3.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset3.getString("sect_nm"));
			rec.use_qunt_1 = Util.checkString(rset3.getString("use_qunt_1"));
			rec.use_qunt_2 = Util.checkString(rset3.getString("use_qunt_2"));
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.matr_clsf = Util.checkString(rset3.getString("matr_clsf"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_1051_LDataSet ds = (PR_PAPMAKE_1051_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_1051_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_1051_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PAPMAKE_1051_LCURLIST2Record curlist2Rec = (PR_PAPMAKE_1051_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_PAPMAKE_1051_LCURLIST3Record curlist3Rec = (PR_PAPMAKE_1051_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		PR_PAPMAKE_1051_LCURLIST4Record curlist4Rec = (PR_PAPMAKE_1051_LCURLIST4Record)ds.curlist4.get(i);%>
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
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist1Rec.use_qunt_1%>
<%= curlist1Rec.use_qunt_2%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist2Rec.use_qunt_1%>
<%= curlist2Rec.use_qunt_2%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.dlco_nm%>
<%= curlist3Rec.matr_cd%>
<%= curlist3Rec.matr_nm%>
<%= curlist3Rec.use_qunt_1%>
<%= curlist3Rec.use_qunt_2%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.dlco_cd%>
<%= curlist3Rec.dlco_nm%>
<%= curlist4Rec.matr_cd%>
<%= curlist4Rec.matr_nm%>
<%= curlist4Rec.medi_cd%>
<%= curlist4Rec.medi_nm%>
<%= curlist4Rec.sect_cd%>
<%= curlist4Rec.sect_nm%>
<%= curlist4Rec.use_qunt_1%>
<%= curlist4Rec.use_qunt_2%>
<%= curlist4Rec.seq%>
<%= curlist4Rec.matr_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 00:40:44 KST 2009 */