/***************************************************************************************************
* 파일명 : SE_SAL_1710_LDataSet.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-17
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList infolist = new ArrayList();
	public ArrayList clamlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1710_LDataSet(){}
	public SE_SAL_1710_LDataSet(String errcode, String errmsg){
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
		this.errcode 				= Util.checkString(cstmt.getString(1));
		this.errmsg 				= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 			= (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SE_SAL_1710_LCLAMLISTRecord rec = new SE_SAL_1710_LCLAMLISTRecord();
			rec.clam_seq 			= Util.checkString(rset0.getString("clam_seq"			));
			rec.yymm 				= Util.checkString(rset0.getString("yymm"				));
			rec.dept_cd 			= Util.checkString(rset0.getString("dept_cd"			));
			rec.dept_nm 			= Util.checkString(rset0.getString("dept_nm"			));
			rec.sub_dept_cd 		= Util.checkString(rset0.getString("sub_dept_cd"		));
			rec.part_nm 			= Util.checkString(rset0.getString("part_nm"			));
			rec.area_cd 			= Util.checkString(rset0.getString("area_cd"			));
			rec.area_nm 			= Util.checkString(rset0.getString("area_nm"			));
			rec.bo_cd 				= Util.checkString(rset0.getString("bo_cd"				));
			rec.bo_seq 				= Util.checkString(rset0.getString("bo_seq"				));
			rec.bo_nm 				= Util.checkString(rset0.getString("bo_nm"				));
			rec.bo_head_nm 			= Util.checkString(rset0.getString("bo_head_nm"			));
			rec.zip_1 				= Util.checkString(rset0.getString("zip_1"				));
			rec.zip_2 				= Util.checkString(rset0.getString("zip_2"				));
			rec.addr 				= Util.checkString(rset0.getString("addr"				));
			rec.add_snd_clam_seq 	= Util.checkString(rset0.getString("add_snd_clam_seq"	));
			rec.add_snd_bo_cd 		= Util.checkString(rset0.getString("add_snd_bo_cd"		));
			rec.add_snd_bo_seq 		= Util.checkString(rset0.getString("add_snd_bo_seq"		));
			rec.add_snd_area_cd 	= Util.checkString(rset0.getString("add_snd_area_cd"	));
			rec.add_snd_area_nm 	= Util.checkString(rset0.getString("add_snd_area_nm"	));
			rec.add_snd_bo_nm 		= Util.checkString(rset0.getString("add_snd_bo_nm"		));
			rec.download 			= rset0.getString("download") == null ? "" : rset0.getString("download");
			this.clamlist.add(rec);
		}
		ResultSet rset1 			= (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			SE_SAL_1710_LINFOLISTRecord rec = new SE_SAL_1710_LINFOLISTRecord();
			rec.cd 					= Util.checkString(rset1.getString("cd"				));
			rec.cdnm 				= Util.checkString(rset1.getString("cdnm"			));
			rec.min_clam_seq_1 		= Util.checkString(rset1.getString("min_clam_seq_1"	));
			rec.max_clam_seq_1 		= Util.checkString(rset1.getString("max_clam_seq_1"	));
			rec.cnt_1 				= Util.checkString(rset1.getString("cnt_1"			));
			rec.min_clam_seq_2 		= Util.checkString(rset1.getString("min_clam_seq_2"	));
			rec.min_clam_seq_2 		= Util.checkString(rset1.getString("min_clam_seq_2"	));
			rec.cnt_2 				= Util.checkString(rset1.getString("cnt_2"			));
			this.infolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_1710_LDataSet ds = (SE_SAL_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.clamlist.size(); i++){
		SE_SAL_1710_LCLAMLISTRecord clamlistRec = (SE_SAL_1710_LCLAMLISTRecord)ds.clamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.infolist.size(); i++){
		SE_SAL_1710_LINFOLISTRecord infolistRec = (SE_SAL_1710_LINFOLISTRecord)ds.infolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClamlist()%>
<%= ds.getInfolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= clamlistRec.clam_seq%>
<%= clamlistRec.yymm%>
<%= clamlistRec.dept_cd%>
<%= clamlistRec.dept_nm%>
<%= clamlistRec.sub_dept_cd%>
<%= clamlistRec.part_nm%>
<%= clamlistRec.area_cd%>
<%= clamlistRec.area_nm%>
<%= clamlistRec.bo_cd%>
<%= clamlistRec.bo_seq%>
<%= clamlistRec.bo_nm%>
<%= clamlistRec.bo_head_nm%>
<%= clamlistRec.zip_1%>
<%= clamlistRec.zip_2%>
<%= clamlistRec.addr%>
<%= clamlistRec.add_snd_clam_seq%>
<%= clamlistRec.add_snd_bo_cd%>
<%= clamlistRec.add_snd_bo_seq%>
<%= clamlistRec.add_snd_area_cd%>
<%= clamlistRec.add_snd_area_nm%>
<%= clamlistRec.add_snd_bo_nm%>
<%= clamlistRec.download%>
<%= infolistRec.cd%>
<%= infolistRec.cdnm%>
<%= infolistRec.min_clam_seq_1%>
<%= infolistRec.max_clam_seq_1%>
<%= infolistRec.cnt_1%>
<%= infolistRec.min_clam_seq_2%>
<%= infolistRec.min_clam_seq_2%>
<%= infolistRec.cnt_2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 13:29:34 KST 2009 */