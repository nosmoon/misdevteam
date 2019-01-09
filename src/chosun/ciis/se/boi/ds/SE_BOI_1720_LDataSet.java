/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1720_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String jd_yymm;
	public String rcpm_yymm;

	public SE_BOI_1720_LDataSet(){}
	public SE_BOI_1720_LDataSet(String errcode, String errmsg, String jd_yymm, String rcpm_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.jd_yymm = jd_yymm;
		this.rcpm_yymm = rcpm_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setJd_yymm(String jd_yymm){
		this.jd_yymm = jd_yymm;
	}

	public void setRcpm_yymm(String rcpm_yymm){
		this.rcpm_yymm = rcpm_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getJd_yymm(){
		return this.jd_yymm;
	}

	public String getRcpm_yymm(){
		return this.rcpm_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.jd_yymm = Util.checkString(cstmt.getString(10));
		this.rcpm_yymm = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_BOI_1720_LCURLISTRecord rec = new SE_BOI_1720_LCURLISTRecord();
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.gbbcd = Util.checkString(rset0.getString("gbbcd"));
			rec.gseq = Util.checkString(rset0.getString("gseq"));
			rec.gjjnm = Util.checkString(rset0.getString("gjjnm"));
			rec.gmisuymd = Util.checkString(rset0.getString("gmisuymd"));
			rec.gjida = Util.checkString(rset0.getString("gjida"));
			rec.giwja = Util.checkString(rset0.getString("giwja"));
			rec.ggybj = Util.checkString(rset0.getString("ggybj"));
			rec.gjnbj = Util.checkString(rset0.getString("gjnbj"));
			rec.sbbcd = Util.checkString(rset0.getString("sbbcd"));
			rec.sseq = Util.checkString(rset0.getString("sseq"));
			rec.sjjnm = Util.checkString(rset0.getString("sjjnm"));
			rec.smisuymd = Util.checkString(rset0.getString("smisuymd"));
			rec.sjida = Util.checkString(rset0.getString("sjida"));
			rec.siwja = Util.checkString(rset0.getString("siwja"));
			rec.sgybj = Util.checkString(rset0.getString("sgybj"));
			rec.sjnbj = Util.checkString(rset0.getString("sjnbj"));
			rec.hbbcd = Util.checkString(rset0.getString("hbbcd"));
			rec.hseq = Util.checkString(rset0.getString("hseq"));
			rec.hjjnm = Util.checkString(rset0.getString("hjjnm"));
			rec.hmisuymd = Util.checkString(rset0.getString("hmisuymd"));
			rec.hjida = Util.checkString(rset0.getString("hjida"));
			rec.hiwja = Util.checkString(rset0.getString("hiwja"));
			rec.hgybj = Util.checkString(rset0.getString("hgybj"));
			rec.hjnbj = Util.checkString(rset0.getString("hjnbj"));
			rec.jdjp = Util.checkString(rset0.getString("jdjp"));
			rec.jjida = Util.checkString(rset0.getString("jjida"));
			rec.jgybj = Util.checkString(rset0.getString("jgybj"));
			rec.jjnbj = Util.checkString(rset0.getString("jjnbj"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1720_LDataSet ds = (SE_BOI_1720_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1720_LCURLISTRecord curlistRec = (SE_BOI_1720_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJd_yymm()%>
<%= ds.getRcpm_yymm()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.chrg_pers%>
<%= curlistRec.area_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.gbbcd%>
<%= curlistRec.gseq%>
<%= curlistRec.gjjnm%>
<%= curlistRec.gmisuymd%>
<%= curlistRec.gjida%>
<%= curlistRec.giwja%>
<%= curlistRec.ggybj%>
<%= curlistRec.gjnbj%>
<%= curlistRec.sbbcd%>
<%= curlistRec.sseq%>
<%= curlistRec.sjjnm%>
<%= curlistRec.smisuymd%>
<%= curlistRec.sjida%>
<%= curlistRec.siwja%>
<%= curlistRec.sgybj%>
<%= curlistRec.sjnbj%>
<%= curlistRec.hbbcd%>
<%= curlistRec.hseq%>
<%= curlistRec.hjjnm%>
<%= curlistRec.hmisuymd%>
<%= curlistRec.hjida%>
<%= curlistRec.hiwja%>
<%= curlistRec.hgybj%>
<%= curlistRec.hjnbj%>
<%= curlistRec.jdjp%>
<%= curlistRec.jjida%>
<%= curlistRec.jgybj%>
<%= curlistRec.jjnbj%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 17:18:34 KST 2009 */