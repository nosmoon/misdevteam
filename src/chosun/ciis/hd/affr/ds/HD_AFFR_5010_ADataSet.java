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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_5010_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_5010_ADataSet(){}
	public HD_AFFR_5010_ADataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_AFFR_5010_ACURLISTRecord rec = new HD_AFFR_5010_ACURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.certi_clsf = Util.checkString(rset0.getString("certi_clsf"));
			rec.certi_clsf_name = Util.checkString(rset0.getString("certi_clsf_name"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.aplc_seq = Util.checkString(rset0.getString("aplc_seq"));
			rec.issu_num_shet = Util.checkString(rset0.getString("issu_num_shet"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.cntc_plac = Util.checkString(rset0.getString("cntc_plac"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.engl_flnm = Util.checkString(rset0.getString("engl_flnm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_AFFR_5010_ACURLIST2Record rec = new HD_AFFR_5010_ACURLIST2Record();
			rec.cd_type = Util.checkString(rset1.getString("cd_type"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_5010_ADataSet ds = (HD_AFFR_5010_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_5010_ACURLISTRecord curlistRec = (HD_AFFR_5010_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_AFFR_5010_ACURLIST2Record curlist2Rec = (HD_AFFR_5010_ACURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.certi_clsf%>
<%= curlistRec.certi_clsf_name%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.aplc_seq%>
<%= curlistRec.issu_num_shet%>
<%= curlistRec.usag%>
<%= curlistRec.remk%>
<%= curlistRec.cntc_plac%>
<%= curlistRec.email%>
<%= curlistRec.engl_flnm%>
<%= curlist2Rec.cd_type%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 21:37:02 KST 2009 */