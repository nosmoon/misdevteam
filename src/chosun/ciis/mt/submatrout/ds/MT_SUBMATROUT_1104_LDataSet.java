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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1104_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String worktype;
	public String remk;

	public MT_SUBMATROUT_1104_LDataSet(){}
	public MT_SUBMATROUT_1104_LDataSet(String errcode, String errmsg, String worktype, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.worktype = worktype;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setWorktype(String worktype){
		this.worktype = worktype;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getWorktype(){
		return this.worktype;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATROUT_1104_LCURLISTRecord rec = new MT_SUBMATROUT_1104_LCURLISTRecord();
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.hjg_cnt = Util.checkString(rset0.getString("hjg_cnt"));
			rec.hjg_amt = Util.checkString(rset0.getString("hjg_amt"));
			rec.owh_dt = Util.checkString(rset0.getString("owh_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.owh_dept = Util.checkString(rset0.getString("owh_dept"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.bccgacctcd = Util.checkString(rset0.getString("bccgacctcd"));
			rec.igacctcdnm = Util.checkString(rset0.getString("igacctcdnm"));
			rec.owh_qunt = Util.checkString(rset0.getString("owh_qunt"));
			rec.owh_unit = Util.checkString(rset0.getString("owh_unit"));
			rec.owh_uprc = Util.checkString(rset0.getString("owh_uprc"));
			rec.owh_amt = Util.checkString(rset0.getString("owh_amt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.bcigaccntcd = Util.checkString(rset0.getString("bcigaccntcd"));
			rec.bcigaccntcdnm = Util.checkString(rset0.getString("bcigaccntcdnm"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.ewh_seq = Util.checkString(rset0.getString("ewh_seq"));
			rec.ewh_sub_seq = Util.checkString(rset0.getString("ewh_sub_seq"));
			rec.owh_budg_cd_nm = Util.checkString(rset0.getString("owh_budg_cd_nm"));
			rec.curdd_ewh_qunt = Util.checkString(rset0.getString("curdd_ewh_qunt"));
			rec.plan_dt = Util.checkString(rset0.getString("plan_dt"));
			rec.prv_cnt = Util.checkString(rset0.getString("prv_cnt"));
			rec.owh_type = Util.checkString(rset0.getString("owh_type"));
			rec.mm_qunt = Util.checkString(rset0.getString("mm_qunt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_SUBMATROUT_1104_LCURLIST1Record rec = new MT_SUBMATROUT_1104_LCURLIST1Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_SUBMATROUT_1104_LCURLIST2Record rec = new MT_SUBMATROUT_1104_LCURLIST2Record();
			rec.sub_seq = Util.checkString(rset2.getString("sub_seq"));
			rec.matr_cd = Util.checkString(rset2.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset2.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset2.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset2.getString("sect_nm"));
			rec.qunt = Util.checkString(rset2.getString("qunt"));
			rec.col = Util.checkString(rset2.getString("col"));
			rec.roww = Util.checkString(rset2.getString("roww"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			MT_SUBMATROUT_1104_LCURLIST3Record rec = new MT_SUBMATROUT_1104_LCURLIST3Record();
			rec.sub_seq = Util.checkString(rset3.getString("sub_seq"));
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset3.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset3.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset3.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset3.getString("sect_nm"));
			rec.owh_num_shet = Util.checkString(rset3.getString("owh_num_shet"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			MT_SUBMATROUT_1104_LCURLIST4Record rec = new MT_SUBMATROUT_1104_LCURLIST4Record();
			rec.matr_cd = Util.checkString(rset4.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset4.getString("matr_nm"));
			this.curlist4.add(rec);
		}
		this.worktype = Util.checkString(cstmt.getString(11));
		this.remk = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_1104_LDataSet ds = (MT_SUBMATROUT_1104_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_1104_LCURLISTRecord curlistRec = (MT_SUBMATROUT_1104_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_SUBMATROUT_1104_LCURLIST1Record curlist1Rec = (MT_SUBMATROUT_1104_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_SUBMATROUT_1104_LCURLIST2Record curlist2Rec = (MT_SUBMATROUT_1104_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_SUBMATROUT_1104_LCURLIST3Record curlist3Rec = (MT_SUBMATROUT_1104_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_SUBMATROUT_1104_LCURLIST4Record curlist4Rec = (MT_SUBMATROUT_1104_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getWorktype()%>
<%= ds.getRemk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sub_seq%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.unit%>
<%= curlistRec.hjg_cnt%>
<%= curlistRec.hjg_amt%>
<%= curlistRec.owh_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.owh_dept%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.bccgacctcd%>
<%= curlistRec.igacctcdnm%>
<%= curlistRec.owh_qunt%>
<%= curlistRec.owh_unit%>
<%= curlistRec.owh_uprc%>
<%= curlistRec.owh_amt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_ser_no%>
<%= curlistRec.remk%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.bcigaccntcd%>
<%= curlistRec.bcigaccntcdnm%>
<%= curlistRec.ewh_dt%>
<%= curlistRec.ewh_seq%>
<%= curlistRec.ewh_sub_seq%>
<%= curlistRec.owh_budg_cd_nm%>
<%= curlistRec.curdd_ewh_qunt%>
<%= curlistRec.plan_dt%>
<%= curlistRec.prv_cnt%>
<%= curlistRec.owh_type%>
<%= curlistRec.mm_qunt%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.sect_nm%>
<%= curlist2Rec.sub_seq%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.sect_nm%>
<%= curlist2Rec.qunt%>
<%= curlist2Rec.col%>
<%= curlist2Rec.roww%>
<%= curlist3Rec.sub_seq%>
<%= curlist3Rec.matr_cd%>
<%= curlist3Rec.matr_nm%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.sect_cd%>
<%= curlist3Rec.medi_nm%>
<%= curlist3Rec.sect_nm%>
<%= curlist3Rec.owh_num_shet%>
<%= curlist4Rec.matr_cd%>
<%= curlist4Rec.matr_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 06 15:55:37 KST 2009 */