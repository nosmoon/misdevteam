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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6022_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6022_LDataSet(){}
	public FC_ACCT_6022_LDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			FC_ACCT_6022_LCURLISTRecord rec = new FC_ACCT_6022_LCURLISTRecord();
			rec.acct_cd = Util.checkString(rset2.getString("acct_cd"));
			rec.acct_nm = Util.checkString(rset2.getString("acct_nm"));
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			rec.clam_dept_cd = Util.checkString(rset2.getString("clam_dept_cd"));
			rec.use_dept_cd = Util.checkString(rset2.getString("use_dept_cd"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.obj_amt = Util.checkString(rset2.getString("obj_amt"));
			rec.vat_amt = Util.checkString(rset2.getString("vat_amt"));
			rec.ndduc_rate = Util.checkString(rset2.getString("ndduc_rate"));
			rec.ndduc_amt = Util.checkString(rset2.getString("ndduc_amt"));
			rec.orgy_ndduc_amt = Util.checkString(rset2.getString("orgy_ndduc_amt"));
			rec.comn_ndduc_amt = Util.checkString(rset2.getString("comn_ndduc_amt"));
			rec.non_dduc_stot = Util.checkString(rset2.getString("non_dduc_stot"));
			rec.orgy_dduc_amt = Util.checkString(rset2.getString("orgy_dduc_amt"));
			rec.comn_dduc_amt = Util.checkString(rset2.getString("comn_dduc_amt"));
			rec.dduc_stot = Util.checkString(rset2.getString("dduc_stot"));
			rec.acml_amt1 = Util.checkString(rset2.getString("acml_amt1"));
			rec.acml_amt2 = Util.checkString(rset2.getString("acml_amt2"));
			rec.slip_mang_clsf = Util.checkString(rset2.getString("slip_mang_clsf"));
			rec.slip_mang_clsf_nm = Util.checkString(rset2.getString("slip_mang_clsf_nm"));
			rec.slip_occr_dt = Util.checkString(rset2.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset2.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset2.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset2.getString("slip_arow_no"));
			rec.slip_occr_dt1 = Util.checkString(rset2.getString("slip_occr_dt1"));
			rec.slip_clsf_cd1 = Util.checkString(rset2.getString("slip_clsf_cd1"));
			rec.slip_seq1 = Util.checkString(rset2.getString("slip_seq1"));
			rec.slip_sub_seq1 = Util.checkString(rset2.getString("slip_sub_seq1"));
			rec.slip_arow_no1 = Util.checkString(rset2.getString("slip_arow_no1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6022_LDataSet ds = (FC_ACCT_6022_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_6022_LCURLISTRecord curlistRec = (FC_ACCT_6022_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_cd%>
<%= curlistRec.acct_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.obj_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.ndduc_rate%>
<%= curlistRec.ndduc_amt%>
<%= curlistRec.orgy_ndduc_amt%>
<%= curlistRec.comn_ndduc_amt%>
<%= curlistRec.non_dduc_stot%>
<%= curlistRec.orgy_dduc_amt%>
<%= curlistRec.comn_dduc_amt%>
<%= curlistRec.dduc_stot%>
<%= curlistRec.acml_amt1%>
<%= curlistRec.acml_amt2%>
<%= curlistRec.slip_mang_clsf%>
<%= curlistRec.slip_mang_clsf_nm%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.slip_occr_dt1%>
<%= curlistRec.slip_clsf_cd1%>
<%= curlistRec.slip_seq1%>
<%= curlistRec.slip_sub_seq1%>
<%= curlistRec.slip_arow_no1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 09:44:30 KST 2009 */