/***************************************************************************************************
* 파일명 : SE_BAS_1200_MDataSet.java
* 기능 : 기준정보관리 - 매체단가관리
* 작성일자 : 2009-03-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList matrlist = new ArrayList();
	public ArrayList uprcclsflist = new ArrayList();
	public ArrayList factlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_1100_MDataSet(){}
	public MT_PAPINOUT_1100_MDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			MT_PAPINOUT_1100_MFACTLISTRecord rec = new MT_PAPINOUT_1100_MFACTLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.factlist.add(rec);
		}
		
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			MT_PAPINOUT_1100_MMATRLISTRecord rec = new MT_PAPINOUT_1100_MMATRLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.matrlist.add(rec);
		}
		/*
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			SE_BAS_1200_MUPRCCLSFLISTRecord rec = new SE_BAS_1200_MUPRCCLSFLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.uprcclsflist.add(rec);
		}*/
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1200_MDataSet ds = (SE_BAS_1200_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_BAS_1200_MMEDILISTRecord medilistRec = (SE_BAS_1200_MMEDILISTRecord)ds.medilist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sellclsflist.size(); i++){
		SE_BAS_1200_MSELLCLSFLISTRecord sellclsflistRec = (SE_BAS_1200_MSELLCLSFLISTRecord)ds.sellclsflist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.uprcclsflist.size(); i++){
		SE_BAS_1200_MUPRCCLSFLISTRecord uprcclsflistRec = (SE_BAS_1200_MUPRCCLSFLISTRecord)ds.uprcclsflist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedilist()%>
<%= ds.getSellclsflist()%>
<%= ds.getUprcclsflist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= medilistRec.cdnm_cd%>
<%= medilistRec.cdabrvnm_cd%>
<%= sellclsflistRec.cd%>
<%= sellclsflistRec.cdnm%>
<%= sellclsflistRec.cd_abrv_nm%>
<%= sellclsflistRec.cdnm_cd%>
<%= sellclsflistRec.cdabrvnm_cd%>
<%= uprcclsflistRec.cd%>
<%= uprcclsflistRec.cdnm%>
<%= uprcclsflistRec.cd_abrv_nm%>
<%= uprcclsflistRec.cdnm_cd%>
<%= uprcclsflistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 15:29:10 KST 2009 */