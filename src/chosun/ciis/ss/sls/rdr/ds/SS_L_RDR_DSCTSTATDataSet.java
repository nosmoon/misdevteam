/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_RDR_DSCTSTATDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcnfmlist = new ArrayList();
	public ArrayList curbolist = new ArrayList();
	public ArrayList curdtlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_DSCTSTATDataSet(){}
	public SS_L_RDR_DSCTSTATDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SS_L_RDR_DSCTSTATCURBOLISTRecord rec = new SS_L_RDR_DSCTSTATCURBOLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.totdsct = rset0.getInt("totdsct");
			rec.case01 = rset0.getInt("case01");
			rec.case02 = rset0.getInt("case02");
			rec.case03 = rset0.getInt("case03");
			rec.case04 = rset0.getInt("case04");
			rec.case05 = rset0.getInt("case05");
			rec.case06 = rset0.getInt("case06");
			rec.case07 = rset0.getInt("case07");
			rec.case08 = rset0.getInt("case08");
			rec.case09 = rset0.getInt("case09");
			rec.case10 = rset0.getInt("case10");
			rec.case11 = rset0.getInt("case11");
			rec.case12 = rset0.getInt("case12");
			this.curbolist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(19);
		while(rset1.next()){
			SS_L_RDR_DSCTSTATCURDTLISTRecord rec = new SS_L_RDR_DSCTSTATCURDTLISTRecord();
			rec.regdt = Util.checkString(rset1.getString("regdt"));
			rec.totdsct = rset1.getInt("totdsct");
			rec.case01 = rset1.getInt("case01");
			rec.case02 = rset1.getInt("case02");
			rec.case03 = rset1.getInt("case03");
			rec.case04 = rset1.getInt("case04");
			rec.case05 = rset1.getInt("case05");
			rec.case06 = rset1.getInt("case06");
			rec.case07 = rset1.getInt("case07");
			rec.case08 = rset1.getInt("case08");
			rec.case09 = rset1.getInt("case09");
			rec.case10 = rset1.getInt("case10");
			rec.case11 = rset1.getInt("case11");
			rec.case12 = rset1.getInt("case12");
			this.curdtlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(20);
		while(rset2.next()){
			SS_L_RDR_DSCTSTATCURCNFMLISTRecord rec = new SS_L_RDR_DSCTSTATCURCNFMLISTRecord();
			rec.deptnm = Util.checkString(rset2.getString("deptnm"));
			rec.partnm = Util.checkString(rset2.getString("partnm"));
			rec.areanm = Util.checkString(rset2.getString("areanm"));
			rec.bonm = Util.checkString(rset2.getString("bonm"));
			rec.totdscty = rset2.getInt("totdscty");
			rec.totdsctn = rset2.getInt("totdsctn");
			rec.case01y = rset2.getInt("case01y");
			rec.case01n = rset2.getInt("case01n");
			rec.case02y = rset2.getInt("case02y");
			rec.case02n = rset2.getInt("case02n");
			rec.case03y = rset2.getInt("case03y");
			rec.case03n = rset2.getInt("case03n");
			rec.case04y = rset2.getInt("case04y");
			rec.case04n = rset2.getInt("case04n");
			rec.case05y = rset2.getInt("case05y");
			rec.case05n = rset2.getInt("case05n");
			rec.case06y = rset2.getInt("case06y");
			rec.case06n = rset2.getInt("case06n");
			rec.case07y = rset2.getInt("case07y");
			rec.case07n = rset2.getInt("case07n");
			rec.case08y = rset2.getInt("case08y");
			rec.case08n = rset2.getInt("case08n");
			rec.case09y = rset2.getInt("case09y");
			rec.case09n = rset2.getInt("case09n");
			rec.case10y = rset2.getInt("case10y");
			rec.case10n = rset2.getInt("case10n");
			rec.case11y = rset2.getInt("case11y");
			rec.case11n = rset2.getInt("case11n");
			rec.case12y = rset2.getInt("case12y");
			rec.case12n = rset2.getInt("case12n");
			this.curcnfmlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_RDR_DSCTSTATDataSet ds = (SS_L_RDR_DSCTSTATDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curbolist.size(); i++){
		SS_L_RDR_DSCTSTATCURBOLISTRecord curbolistRec = (SS_L_RDR_DSCTSTATCURBOLISTRecord)ds.curbolist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdtlist.size(); i++){
		SS_L_RDR_DSCTSTATCURDTLISTRecord curdtlistRec = (SS_L_RDR_DSCTSTATCURDTLISTRecord)ds.curdtlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcnfmlist.size(); i++){
		SS_L_RDR_DSCTSTATCURCNFMLISTRecord curcnfmlistRec = (SS_L_RDR_DSCTSTATCURCNFMLISTRecord)ds.curcnfmlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurbolist()%>
<%= ds.getCurdtlist()%>
<%= ds.getCurcnfmlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curbolistRec.deptnm%>
<%= curbolistRec.partnm%>
<%= curbolistRec.areanm%>
<%= curbolistRec.bonm%>
<%= curbolistRec.totdsct%>
<%= curbolistRec.case01%>
<%= curbolistRec.case02%>
<%= curbolistRec.case03%>
<%= curbolistRec.case04%>
<%= curbolistRec.case05%>
<%= curbolistRec.case06%>
<%= curbolistRec.case07%>
<%= curbolistRec.case08%>
<%= curbolistRec.case09%>
<%= curbolistRec.case10%>
<%= curbolistRec.case11%>
<%= curbolistRec.case12%>
<%= curdtlistRec.regdt%>
<%= curdtlistRec.totdsct%>
<%= curdtlistRec.case01%>
<%= curdtlistRec.case02%>
<%= curdtlistRec.case03%>
<%= curdtlistRec.case04%>
<%= curdtlistRec.case05%>
<%= curdtlistRec.case06%>
<%= curdtlistRec.case07%>
<%= curdtlistRec.case08%>
<%= curdtlistRec.case09%>
<%= curdtlistRec.case10%>
<%= curdtlistRec.case11%>
<%= curdtlistRec.case12%>
<%= curcnfmlistRec.deptnm%>
<%= curcnfmlistRec.partnm%>
<%= curcnfmlistRec.areanm%>
<%= curcnfmlistRec.bonm%>
<%= curcnfmlistRec.totdscty%>
<%= curcnfmlistRec.totdsctn%>
<%= curcnfmlistRec.case01y%>
<%= curcnfmlistRec.case01n%>
<%= curcnfmlistRec.case02y%>
<%= curcnfmlistRec.case02n%>
<%= curcnfmlistRec.case03y%>
<%= curcnfmlistRec.case03n%>
<%= curcnfmlistRec.case04y%>
<%= curcnfmlistRec.case04n%>
<%= curcnfmlistRec.case05y%>
<%= curcnfmlistRec.case05n%>
<%= curcnfmlistRec.case06y%>
<%= curcnfmlistRec.case06n%>
<%= curcnfmlistRec.case07y%>
<%= curcnfmlistRec.case07n%>
<%= curcnfmlistRec.case08y%>
<%= curcnfmlistRec.case08n%>
<%= curcnfmlistRec.case09y%>
<%= curcnfmlistRec.case09n%>
<%= curcnfmlistRec.case10y%>
<%= curcnfmlistRec.case10n%>
<%= curcnfmlistRec.case11y%>
<%= curcnfmlistRec.case11n%>
<%= curcnfmlistRec.case12y%>
<%= curcnfmlistRec.case12n%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 13 11:21:51 KST 2015 */