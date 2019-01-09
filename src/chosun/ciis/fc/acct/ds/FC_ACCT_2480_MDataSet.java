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


public class FC_ACCT_2480_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList slipclsfcdlist = new ArrayList();
	public ArrayList chnl_clsf_cd_curlist = new ArrayList();
	public ArrayList medicdlist = new ArrayList();
	public ArrayList incmclsfcdlist = new ArrayList();
	public ArrayList mangclsfcdlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_dlco_clsf_cd;
	public String xx_g_tag;
	public String xx_g_tag2;

	public FC_ACCT_2480_MDataSet(){}
	public FC_ACCT_2480_MDataSet(String errcode, String errmsg, String xx_dlco_clsf_cd, String xx_g_tag, String xx_g_tag2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
		this.xx_g_tag = xx_g_tag;
		this.xx_g_tag2 = xx_g_tag2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_dlco_clsf_cd(String xx_dlco_clsf_cd){
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public void setXx_g_tag(String xx_g_tag){
		this.xx_g_tag = xx_g_tag;
	}

	public void setXx_g_tag2(String xx_g_tag2){
		this.xx_g_tag2 = xx_g_tag2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_dlco_clsf_cd(){
		return this.xx_dlco_clsf_cd;
	}

	public String getXx_g_tag(){
		return this.xx_g_tag;
	}

	public String getXx_g_tag2(){
		return this.xx_g_tag2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2480_MMEDICDLISTRecord rec = new FC_ACCT_2480_MMEDICDLISTRecord();
			rec.cccodeval = Util.checkString(rset0.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset0.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset0.getString("cccdynm"));
			this.medicdlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2480_MMANGCLSFCDLISTRecord rec = new FC_ACCT_2480_MMANGCLSFCDLISTRecord();
			rec.cccodeval = Util.checkString(rset1.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset1.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset1.getString("cccdynm"));
			this.mangclsfcdlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2480_MSLIPCLSFCDLISTRecord rec = new FC_ACCT_2480_MSLIPCLSFCDLISTRecord();
			rec.cccodeval = Util.checkString(rset2.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset2.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset2.getString("cccdynm"));
			this.slipclsfcdlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2480_MINCMCLSFCDLISTRecord rec = new FC_ACCT_2480_MINCMCLSFCDLISTRecord();
			rec.cccodeval = Util.checkString(rset3.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset3.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset3.getString("cccdynm"));
			this.incmclsfcdlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_2480_MCHNL_CLSF_CD_CURLISTRecord rec = new FC_ACCT_2480_MCHNL_CLSF_CD_CURLISTRecord();
			rec.cccodeval = Util.checkString(rset4.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset4.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset4.getString("cccdynm"));
			this.chnl_clsf_cd_curlist.add(rec);
		}
		this.xx_dlco_clsf_cd = Util.checkString(cstmt.getString(10));
		this.xx_g_tag = Util.checkString(cstmt.getString(11));
		this.xx_g_tag2 = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2480_MDataSet ds = (FC_ACCT_2480_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdlist.size(); i++){
		FC_ACCT_2480_MMEDICDLISTRecord medicdlistRec = (FC_ACCT_2480_MMEDICDLISTRecord)ds.medicdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mangclsfcdlist.size(); i++){
		FC_ACCT_2480_MMANGCLSFCDLISTRecord mangclsfcdlistRec = (FC_ACCT_2480_MMANGCLSFCDLISTRecord)ds.mangclsfcdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.slipclsfcdlist.size(); i++){
		FC_ACCT_2480_MSLIPCLSFCDLISTRecord slipclsfcdlistRec = (FC_ACCT_2480_MSLIPCLSFCDLISTRecord)ds.slipclsfcdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.incmclsfcdlist.size(); i++){
		FC_ACCT_2480_MINCMCLSFCDLISTRecord incmclsfcdlistRec = (FC_ACCT_2480_MINCMCLSFCDLISTRecord)ds.incmclsfcdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.chnl_clsf_cd_curlist.size(); i++){
		FC_ACCT_2480_MCHNL_CLSF_CD_CURLISTRecord chnl_clsf_cd_curlistRec = (FC_ACCT_2480_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicdlist()%>
<%= ds.getMangclsfcdlist()%>
<%= ds.getSlipclsfcdlist()%>
<%= ds.getIncmclsfcdlist()%>
<%= ds.getChnl_clsf_cd_curlist()%>
<%= ds.getXx_dlco_clsf_cd()%>
<%= ds.getXx_g_tag()%>
<%= ds.getXx_g_tag2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdlistRec.cccodeval%>
<%= medicdlistRec.cccdnm%>
<%= medicdlistRec.cccdynm%>
<%= mangclsfcdlistRec.cccodeval%>
<%= mangclsfcdlistRec.cccdnm%>
<%= mangclsfcdlistRec.cccdynm%>
<%= slipclsfcdlistRec.cccodeval%>
<%= slipclsfcdlistRec.cccdnm%>
<%= slipclsfcdlistRec.cccdynm%>
<%= incmclsfcdlistRec.cccodeval%>
<%= incmclsfcdlistRec.cccdnm%>
<%= incmclsfcdlistRec.cccdynm%>
<%= chnl_clsf_cd_curlistRec.cccodeval%>
<%= chnl_clsf_cd_curlistRec.cccdnm%>
<%= chnl_clsf_cd_curlistRec.cccdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 23 17:11:02 KST 2014 */