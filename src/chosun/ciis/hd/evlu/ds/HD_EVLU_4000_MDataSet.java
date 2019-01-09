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


public class HD_EVLU_4000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	
	public String errcode;
	public String errmsg;

	public String pers_chk01;
	public String pers_chk02;
	public String pers_chk03; 
	public String pers_chk04; 
	public String pers_chk05; 
	public String pers_chk06; 
	public String pers_chk07; 
	
	public HD_EVLU_4000_MDataSet(){}
	public HD_EVLU_4000_MDataSet(String errcode, String errmsg, String pers_chk01, String pers_chk02, String pers_chk03, String pers_chk04, String pers_chk05, String pers_chk06, String pers_chk07){
		this.errcode = errcode;
		this.errmsg = errmsg;
		
		this.pers_chk01 = pers_chk01;     	                                               
		this.pers_chk02 = pers_chk02;  																																
		this.pers_chk03 = pers_chk03;  																																
		this.pers_chk04 = pers_chk04;  																																
		this.pers_chk05 = pers_chk05;  																																
		this.pers_chk06 = pers_chk06;  																																
		this.pers_chk07 = pers_chk07;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPers_chk01(String pers_chk01){
		this.pers_chk01 = pers_chk01;
	}
	
	public void setPers_chk02(String pers_chk02){
		this.pers_chk02 = pers_chk02;
	}
	
	public void setPers_chk03(String pers_chk03){
		this.pers_chk03 = pers_chk03;
	}
	
	public void setPers_chk04(String pers_chk04){
		this.pers_chk04 = pers_chk04;
	}
	
	public void setPers_chk05(String pers_chk05){
		this.pers_chk05 = pers_chk05;
	}
	
	public void setPers_chk06(String pers_chk06){
		this.pers_chk06 = pers_chk06;
	}
	
	public void setPers_chk07(String pers_chk07){
		this.pers_chk07 = pers_chk07;
	}
	
	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public String getPers_chk01(){
		return this.pers_chk01 ;
	}

	public String getPers_chk02(){
		return this.pers_chk02 ;
	}

	public String getPers_chk03(){
		return this.pers_chk03 ;
	}

	public String getPers_chk04(){
		return this.pers_chk04 ;
	}

	public String getPers_chk05(){
		return this.pers_chk05 ;
	}

	public String getPers_chk06(){
		return this.pers_chk06 ;
	}

	public String getPers_chk07(){
		return this.pers_chk07 ;
	}
	
	
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.pers_chk01  	= Util.checkString(cstmt.getString(5));
		this.pers_chk02  	= Util.checkString(cstmt.getString(6));	
		this.pers_chk03  	= Util.checkString(cstmt.getString(7));	
		this.pers_chk04  	= Util.checkString(cstmt.getString(8));	
		this.pers_chk05  	= Util.checkString(cstmt.getString(9));	
		this.pers_chk06  	= Util.checkString(cstmt.getString(10));	
		this.pers_chk07  	= Util.checkString(cstmt.getString(11));	
		
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_5000_MDataSet ds = (HD_EVLU_5000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EVLU_5000_MCURLIST1Record curlist1Rec = (HD_EVLU_5000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EVLU_5000_MCURLIST2Record curlist2Rec = (HD_EVLU_5000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 16:32:55 KST 2009 */