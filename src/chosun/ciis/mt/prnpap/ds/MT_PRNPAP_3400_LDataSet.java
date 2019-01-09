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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PRNPAP_3400_LDataSet(){}
	public MT_PRNPAP_3400_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MT_PRNPAP_3400_LCURLISTRecord rec = new MT_PRNPAP_3400_LCURLISTRecord();
			rec.prt_dt = Util.checkString(rset1.getString("prt_dt"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.issu_pcnt = Util.checkString(rset1.getString("issu_pcnt"));
			rec.issu_qty = Util.checkString(rset1.getString("issu_qty"));
			rec.pj_qunt = Util.checkString(rset1.getString("pj_qunt"));
			rec.pap_cmpy = Util.checkString(rset1.getString("pap_cmpy"));
			rec.paper_clsf_cd = Util.checkString(rset1.getString("paper_clsf_cd"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.cnsm_qunt = Util.checkString(rset1.getString("cnsm_qunt"));
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			MT_PRNPAP_3400_LCURLIST2Record rec = new MT_PRNPAP_3400_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset2.getString("occr_dt"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.sub_seq = Util.checkString(rset2.getString("sub_seq"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset2.getString("prt_dt"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cnt = Util.checkString(rset2.getString("cnt"));
			rec.wgt = Util.checkString(rset2.getString("wgt"));
			rec.rem_qunt = Util.checkString(rset2.getString("rem_qunt"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			rec.mang_cd_2 = Util.checkString(rset2.getString("mang_cd_2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3400_LDataSet ds = (MT_PRNPAP_3400_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3400_LCURLISTRecord curlistRec = (MT_PRNPAP_3400_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PRNPAP_3400_LCURLIST2Record curlist2Rec = (MT_PRNPAP_3400_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.prt_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.issu_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.issu_qty%>
<%= curlistRec.pj_qunt%>
<%= curlistRec.pap_cmpy%>
<%= curlistRec.paper_clsf_cd%>
<%= curlistRec.matr_cd%>
<%= curlistRec.cnsm_qunt%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.sub_seq%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.prt_dt%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cnt%>
<%= curlist2Rec.wgt%>
<%= curlist2Rec.rem_qunt%>
<%= curlist2Rec.mang_cd_1%>
<%= curlist2Rec.mang_cd_2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 24 15:39:17 KST 2009 */