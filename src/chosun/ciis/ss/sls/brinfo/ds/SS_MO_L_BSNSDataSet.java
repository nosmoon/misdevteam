/***************************************************************************************************
* 파일명 : SS_MO_L_BSNSDataSet.java
* 기능 :  판매-발송관리-마감관리-발송노선 조회_모바일용
* 작성일자 : 2016-12-28
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 발송처코드, 발송처코드명 추가
* 수정자 : 장선희
* 수정일자 : 2017-08-24
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 *
 */


public class SS_MO_L_BSNSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bsnslist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_L_BSNSDataSet(){}
	public SS_MO_L_BSNSDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_MO_L_BSNSBSNSLISTRecord rec = new SS_MO_L_BSNSBSNSLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.mcname = Util.checkString(rset0.getString("mcname"));
			rec.jbpansu = Util.checkString(rset0.getString("jbpansu"));
			rec.jpcode = Util.checkString(rset0.getString("jpcode"));
			rec.jpname = Util.checkString(rset0.getString("jpname"));
			rec.send_rank = Util.checkString(rset0.getString("send_rank"));
			rec.inname = Util.checkString(rset0.getString("inname"));
			rec.passage = Util.checkString(rset0.getString("passage"));
			rec.jbjiorder = Util.checkString(rset0.getString("jbjiorder"));
			rec.jiname = Util.checkString(rset0.getString("jiname"));
			rec.jbbusu = Util.checkString(rset0.getString("jbbusu"));
			rec.jbbalcha = Util.checkString(rset0.getString("jbbalcha"));
			rec.jbyetime = Util.checkString(rset0.getString("jbyetime"));
			rec.jbdotime = Util.checkString(rset0.getString("jbdotime"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			this.bsnslist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_MO_L_BSNSDataSet ds = (SS_MO_L_BSNSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bsnslist.size(); i++){
		SS_MO_L_BSNSBSNSLISTRecord bsnslistRec = (SS_MO_L_BSNSBSNSLISTRecord)ds.bsnslist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBsnslist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bsnslistRec.bocd%>
<%= bsnslistRec.medicd%>
<%= bsnslistRec.mcname%>
<%= bsnslistRec.jbpansu%>
<%= bsnslistRec.jpcode%>
<%= bsnslistRec.jpname%>
<%= bsnslistRec.send_rank%>
<%= bsnslistRec.inname%>
<%= bsnslistRec.passage%>
<%= bsnslistRec.jbjiorder%>
<%= bsnslistRec.jiname%>
<%= bsnslistRec.jbbusu%>
<%= bsnslistRec.jbbalcha%>
<%= bsnslistRec.jbyetime%>
<%= bsnslistRec.jbdotime%>
<%= bsnslistRec.send_plac_seq%>
<%= bsnslistRec.send_plac_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 24 16:48:06 KST 2017 */