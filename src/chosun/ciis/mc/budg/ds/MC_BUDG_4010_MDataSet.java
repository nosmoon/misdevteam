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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4010_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_clsf_cd;
	public String xx_crte_clsf_cd;

	public MC_BUDG_4010_MDataSet(){}
	public MC_BUDG_4010_MDataSet(String errcode, String errmsg, String xx_clsf_cd, String xx_crte_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_clsf_cd = xx_clsf_cd;
		this.xx_crte_clsf_cd = xx_crte_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_clsf_cd(String xx_clsf_cd){
		this.xx_clsf_cd = xx_clsf_cd;
	}

	public void setXx_crte_clsf_cd(String xx_crte_clsf_cd){
		this.xx_crte_clsf_cd = xx_crte_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_clsf_cd(){
		return this.xx_clsf_cd;
	}

	public String getXx_crte_clsf_cd(){
		return this.xx_crte_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MC_BUDG_4010_MCURLIST1Record rec = new MC_BUDG_4010_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			MC_BUDG_4010_MCURLIST2Record rec = new MC_BUDG_4010_MCURLIST2Record();
			rec.max_yymm = Util.checkString(rset1.getString("max_yymm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			MC_BUDG_4010_MCURLIST3Record rec = new MC_BUDG_4010_MCURLIST3Record();
			rec.dd = Util.checkString(rset2.getString("dd"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(12);
		while(rset3.next()){
			MC_BUDG_4010_MCURLIST4Record rec = new MC_BUDG_4010_MCURLIST4Record();
			rec.max_sub_cd = Util.checkString(rset3.getString("max_sub_cd"));
			this.curlist4.add(rec);
		}
		this.xx_clsf_cd = Util.checkString(cstmt.getString(13));
		this.xx_crte_clsf_cd = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4010_MDataSet ds = (MC_BUDG_4010_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_4010_MCURLIST1Record curlist1Rec = (MC_BUDG_4010_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_4010_MCURLIST2Record curlist2Rec = (MC_BUDG_4010_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MC_BUDG_4010_MCURLIST3Record curlist3Rec = (MC_BUDG_4010_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MC_BUDG_4010_MCURLIST4Record curlist4Rec = (MC_BUDG_4010_MCURLIST4Record)ds.curlist4.get(i);%>
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
<%= ds.getXx_clsf_cd()%>
<%= ds.getXx_crte_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.max_yymm%>
<%= curlist3Rec.dd%>
<%= curlist4Rec.max_sub_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 13 19:35:12 KST 2012 */