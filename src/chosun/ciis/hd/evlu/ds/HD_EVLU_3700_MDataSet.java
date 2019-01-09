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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3700_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String valid_evlu_cd;
	public String xx_evlu_step_clsf_010;

	public HD_EVLU_3700_MDataSet(){}
	public HD_EVLU_3700_MDataSet(String errcode, String errmsg, String valid_evlu_cd, String xx_evlu_step_clsf_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.valid_evlu_cd = valid_evlu_cd;
		this.xx_evlu_step_clsf_010 = xx_evlu_step_clsf_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setValid_evlu_cd(String valid_evlu_cd){
		this.valid_evlu_cd = valid_evlu_cd;
	}

	public void setXx_evlu_step_clsf_010(String xx_evlu_step_clsf_010){
		this.xx_evlu_step_clsf_010 = xx_evlu_step_clsf_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getValid_evlu_cd(){
		return this.valid_evlu_cd;
	}

	public String getXx_evlu_step_clsf_010(){
		return this.xx_evlu_step_clsf_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.valid_evlu_cd = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_EVLU_3700_MCURLIST1Record rec = new HD_EVLU_3700_MCURLIST1Record();
			rec.evlu_cd = Util.checkString(rset0.getString("evlu_cd"));
			rec.evlu_cdnm = Util.checkString(rset0.getString("evlu_cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_EVLU_3700_MCURLIST2Record rec = new HD_EVLU_3700_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_EVLU_3700_MCURLIST3Record rec = new HD_EVLU_3700_MCURLIST3Record();
			rec.evlu_grad_cd = Util.checkString(rset2.getString("evlu_grad_cd"));
			rec.evlu_grad_nm = Util.checkString(rset2.getString("evlu_grad_nm"));
			this.curlist3.add(rec);
		}
		this.xx_evlu_step_clsf_010 = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3700_MDataSet ds = (HD_EVLU_3700_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EVLU_3700_MCURLIST1Record curlist1Rec = (HD_EVLU_3700_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EVLU_3700_MCURLIST2Record curlist2Rec = (HD_EVLU_3700_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_EVLU_3700_MCURLIST3Record curlist3Rec = (HD_EVLU_3700_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getValid_evlu_cd()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getXx_evlu_step_clsf_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.evlu_cd%>
<%= curlist1Rec.evlu_cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.evlu_grad_cd%>
<%= curlist3Rec.evlu_grad_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 21 18:52:32 KST 2012 */