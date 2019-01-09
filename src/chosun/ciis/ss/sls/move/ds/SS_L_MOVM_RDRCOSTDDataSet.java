/***************************************************************************************************
* 파일명 : SS_L_MOVM_RDRCOSTDDataSet.java
* 기능 : 이사독자-비용-상세목록을 위한 DataSet
* 작성일자 : 2004-01-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 이사독자-비용-상세목록을 위한 DataSet
 */

public class SS_L_MOVM_RDRCOSTDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MOVM_RDRCOSTDDataSet(){}
	public SS_L_MOVM_RDRCOSTDDataSet(String errcode, String errmsg){
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
			SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord rec = new SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord();
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.trsfqty = rset0.getInt("trsfqty");
			rec.acptqty = rset0.getInt("acptqty");
			rec.uncalctrsfqty = rset0.getInt("uncalctrsfqty");
			rec.uncalcacptqty = rset0.getInt("uncalcacptqty");
			rec.calctrsfqty = rset0.getInt("calctrsfqty");
			rec.calcacptqty = rset0.getInt("calcacptqty");
			rec.basiamt = rset0.getInt("basiamt");
			rec.trsfalonamt = rset0.getInt("trsfalonamt");
			rec.acptalonamt = rset0.getInt("acptalonamt");
			rec.trsfppymtamt = rset0.getInt("trsfppymtamt");
			rec.acptppymtamt = rset0.getInt("acptppymtamt");
			rec.trsfppymtcoms = rset0.getInt("trsfppymtcoms");
			rec.acptppymtcoms = rset0.getInt("acptppymtcoms");
			rec.trsfmilgallmamt = rset0.getInt("trsfmilgallmamt");
			rec.acptmilgallmamt = rset0.getInt("acptmilgallmamt");
			rec.trsfcalcamt = rset0.getInt("trsfcalcamt");
			rec.acptcalcamt = rset0.getInt("acptcalcamt");
			this.curcommlist.add(rec);
		}
	}

}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_MOVM_RDRCOSTDDataSet ds = (SS_L_MOVM_RDRCOSTDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.trsfqty%>
<%= curcommlistRec.acptqty%>
<%= curcommlistRec.uncalctrsfqty%>
<%= curcommlistRec.uncalcacptqty%>
<%= curcommlistRec.calctrsfqty%>
<%= curcommlistRec.calcacptqty%>
<%= curcommlistRec.basiamt%>
<%= curcommlistRec.trsfalonamt%>
<%= curcommlistRec.acptalonamt%>
<%= curcommlistRec.trsfppymtamt%>
<%= curcommlistRec.acptppymtamt%>
<%= curcommlistRec.trsfppymtcoms%>
<%= curcommlistRec.acptppymtcoms%>
<%= curcommlistRec.trsfmilgallmamt%>
<%= curcommlistRec.acptmilgallmamt%>
<%= curcommlistRec.trsfcalcamt%>
<%= curcommlistRec.acptcalcamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 09 21:23:42 KST 2004 */