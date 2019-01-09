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


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_3610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_3610_LDataSet(){}
	public SE_SND_3610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_SND_3610_LCURLISTRecord rec = new SE_SND_3610_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.rptv_route_clsf = Util.checkString(rset0.getString("rptv_route_clsf"));
			rec.rptv_route_cd = Util.checkString(rset0.getString("rptv_route_cd"));
			rec.rptv_route_nm = Util.checkString(rset0.getString("rptv_route_nm"));
			rec.route_rank = Util.checkString(rset0.getString("route_rank"));
			rec.prt_plac_cd = Util.checkString(rset0.getString("prt_plac_cd"));
			rec.ecnt_cd = Util.checkString(rset0.getString("ecnt_cd"));
			rec.ledt_cd = Util.checkString(rset0.getString("ledt_cd"));
			rec.route_cd = Util.checkString(rset0.getString("route_cd"));
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_3610_LDataSet ds = (SE_SND_3610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_3610_LCURLISTRecord curlistRec = (SE_SND_3610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.rptv_route_clsf%>
<%= curlistRec.rptv_route_cd%>
<%= curlistRec.rptv_route_nm%>
<%= curlistRec.route_rank%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.ecnt_cd%>
<%= curlistRec.ledt_cd%>
<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 17:28:07 KST 2009 */