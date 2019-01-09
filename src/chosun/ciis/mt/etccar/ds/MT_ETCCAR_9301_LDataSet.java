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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_9301_LDataSet(){}
	public MT_ETCCAR_9301_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_ETCCAR_9301_LCURLISTRecord rec = new MT_ETCCAR_9301_LCURLISTRecord();
			rec.drvr_nm = Util.checkString(rset0.getString("drvr_nm"));
			rec.tm07000730 = Util.checkString(rset0.getString("tm07000730"));
			rec.tm07300800 = Util.checkString(rset0.getString("tm07300800"));
			rec.tm08000830 = Util.checkString(rset0.getString("tm08000830"));
			rec.tm08300900 = Util.checkString(rset0.getString("tm08300900"));
			rec.tm09000930 = Util.checkString(rset0.getString("tm09000930"));
			rec.tm09301000 = Util.checkString(rset0.getString("tm09301000"));
			rec.tm10001030 = Util.checkString(rset0.getString("tm10001030"));
			rec.tm10301100 = Util.checkString(rset0.getString("tm10301100"));
			rec.tm11001130 = Util.checkString(rset0.getString("tm11001130"));
			rec.tm11301200 = Util.checkString(rset0.getString("tm11301200"));
			rec.tm12001230 = Util.checkString(rset0.getString("tm12001230"));
			rec.tm12301300 = Util.checkString(rset0.getString("tm12301300"));
			rec.tm13001330 = Util.checkString(rset0.getString("tm13001330"));
			rec.tm13301400 = Util.checkString(rset0.getString("tm13301400"));
			rec.tm14001430 = Util.checkString(rset0.getString("tm14001430"));
			rec.tm14301500 = Util.checkString(rset0.getString("tm14301500"));
			rec.tm15001530 = Util.checkString(rset0.getString("tm15001530"));
			rec.tm15301600 = Util.checkString(rset0.getString("tm15301600"));
			rec.tm16001630 = Util.checkString(rset0.getString("tm16001630"));
			rec.tm16301700 = Util.checkString(rset0.getString("tm16301700"));
			rec.tm17001730 = Util.checkString(rset0.getString("tm17001730"));
			rec.tm17301800 = Util.checkString(rset0.getString("tm17301800"));
			rec.tm18001830 = Util.checkString(rset0.getString("tm18001830"));
			rec.tm18301900 = Util.checkString(rset0.getString("tm18301900"));
			rec.tm19001930 = Util.checkString(rset0.getString("tm19001930"));
			rec.tm19302000 = Util.checkString(rset0.getString("tm19302000"));
			rec.tm20002030 = Util.checkString(rset0.getString("tm20002030"));
			rec.tm20302100 = Util.checkString(rset0.getString("tm20302100"));
			rec.tm21002130 = Util.checkString(rset0.getString("tm21002130"));
			rec.tm21302200 = Util.checkString(rset0.getString("tm21302200"));
			rec.tm22002230 = Util.checkString(rset0.getString("tm22002230"));
			rec.tm22302300 = Util.checkString(rset0.getString("tm22302300"));
			rec.tm23002330 = Util.checkString(rset0.getString("tm23002330"));
			rec.tm23302400 = Util.checkString(rset0.getString("tm23302400"));
			rec.tm00000030 = Util.checkString(rset0.getString("tm00000030"));
			rec.tm00300100 = Util.checkString(rset0.getString("tm00300100"));
			rec.tm01000130 = Util.checkString(rset0.getString("tm01000130"));
			rec.tm01300200 = Util.checkString(rset0.getString("tm01300200"));
			rec.tm02000230 = Util.checkString(rset0.getString("tm02000230"));
			rec.tm02300300 = Util.checkString(rset0.getString("tm02300300"));
			rec.tm03000330 = Util.checkString(rset0.getString("tm03000330"));
			rec.tm03300400 = Util.checkString(rset0.getString("tm03300400"));
			rec.tm04000430 = Util.checkString(rset0.getString("tm04000430"));
			rec.tm04300500 = Util.checkString(rset0.getString("tm04300500"));
			rec.tm05000530 = Util.checkString(rset0.getString("tm05000530"));
			rec.tm05300600 = Util.checkString(rset0.getString("tm05300600"));
			rec.tm06000630 = Util.checkString(rset0.getString("tm06000630"));
			rec.tm06300700 = Util.checkString(rset0.getString("tm06300700"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_9301_LDataSet ds = (MT_ETCCAR_9301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_9301_LCURLISTRecord curlistRec = (MT_ETCCAR_9301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.drvr_nm%>
<%= curlistRec.tm07000730%>
<%= curlistRec.tm07300800%>
<%= curlistRec.tm08000830%>
<%= curlistRec.tm08300900%>
<%= curlistRec.tm09000930%>
<%= curlistRec.tm09301000%>
<%= curlistRec.tm10001030%>
<%= curlistRec.tm10301100%>
<%= curlistRec.tm11001130%>
<%= curlistRec.tm11301200%>
<%= curlistRec.tm12001230%>
<%= curlistRec.tm12301300%>
<%= curlistRec.tm13001330%>
<%= curlistRec.tm13301400%>
<%= curlistRec.tm14001430%>
<%= curlistRec.tm14301500%>
<%= curlistRec.tm15001530%>
<%= curlistRec.tm15301600%>
<%= curlistRec.tm16001630%>
<%= curlistRec.tm16301700%>
<%= curlistRec.tm17001730%>
<%= curlistRec.tm17301800%>
<%= curlistRec.tm18001830%>
<%= curlistRec.tm18301900%>
<%= curlistRec.tm19001930%>
<%= curlistRec.tm19302000%>
<%= curlistRec.tm20002030%>
<%= curlistRec.tm20302100%>
<%= curlistRec.tm21002130%>
<%= curlistRec.tm21302200%>
<%= curlistRec.tm22002230%>
<%= curlistRec.tm22302300%>
<%= curlistRec.tm23002330%>
<%= curlistRec.tm23302400%>
<%= curlistRec.tm00000030%>
<%= curlistRec.tm00300100%>
<%= curlistRec.tm01000130%>
<%= curlistRec.tm01300200%>
<%= curlistRec.tm02000230%>
<%= curlistRec.tm02300300%>
<%= curlistRec.tm03000330%>
<%= curlistRec.tm03300400%>
<%= curlistRec.tm04000430%>
<%= curlistRec.tm04300500%>
<%= curlistRec.tm05000530%>
<%= curlistRec.tm05300600%>
<%= curlistRec.tm06000630%>
<%= curlistRec.tm06300700%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 10 18:49:20 KST 2012 */